//
// Created by trhiana on 07/09/22.
//

# include "stdio.h"
# include "stdlib.h"

# define bufferSize 1024

int main (int argc, char *argv[]) {
    FILE *file;
    char buffer[bufferSize];

    for (size_t i = 0; i < argc; ++i) {
        if ((file = fopen(argv[i], "r")) == NULL) {
            printf("wcat can't open file\n");
            exit(1);
        }
        while (fgets(buffer, bufferSize, file)){
            printf("%s", buffer);
        }
        
        if (fclose(file) != 0) {
            printf("Error!");
            exit(1);
        }
    }
    fclose(file);
    return 0;
}