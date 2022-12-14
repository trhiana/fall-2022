//
// Created by trhiana on 07/09/22.
//

# include "errno.h"
# include "stdio.h"
# include "stdlib.h"
# include "string.h"

# define bufferSize 1024

int main (int argc, char *argv[]) {
    FILE *file;
    char buffer[bufferSize];

    for (size_t i = 0; i < argc; ++i) {
        if ((file = fopen(argv[i], "r")) == NULL) {
            printf("wcat can't open file\n");
            exit(EXIT_FAILURE);
        }
        while (fgets(buffer, bufferSize, file)){
            printf("%s", buffer);
        }
        errno = 0;
        if (fclose(file) != 0) {
            strerror(errno);
            exit(EXIT_FAILURE);
        }
    }
    fclose(file);
    return 0;
}
