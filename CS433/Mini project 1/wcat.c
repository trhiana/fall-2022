/*
 * trhiana
 * CS433
 * Mini project 1
 * */

#include "stdio.h"
#include "stdlib.h"

#define bufferSize 1024

int main (int argc, char const *argv[]) {
    FILE *file;
    char buffer[bufferSize];

    for (size_t i = 0; i < argc; ++i) {
        if ((file = fopen(argv[i], "r")) == NULL) {
            printf("wcat: cannot open file\n");
            exit(1);
        }
        while (fgets(buffer, bufferSize, file)){
            printf("%s", buffer);
        }
        
        if (fclose(file) != 0) {
            printf(0);
            exit(1);
        }
    }
    fclose(file);
    return 0;
}