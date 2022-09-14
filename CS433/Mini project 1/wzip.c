/*
 * trhiana
 * CS433
 * Mini project 1
 * */

#include "stdio.h"
#include "stdlib.h"
#include "string.h"

int main(int argc, char const *argv[]) {
    FILE *file;
    char buffer[2], oldBuffer[2];
    int count;

    if (argc <= 1) {
        printf("wzip: file1 [file2 ...]\n");
        exit(1);
    }

    for (size_t i = 1; i < argc; ++i) {
        if ((file = fopen(argv[i], "r")) == NULL) {
            printf("wzip: cannot open file\n");
            exit(1);
        }

        while (fread(buffer, 1, 1, file)) {
            if (strcmp(buffer, oldBuffer) == 0) {
                count++;
            } else {
                if (oldBuffer[0] != "\0") {
                    count = 1;
                    strcpy(oldBuffer, buffer);
                }
            }
        }

        fclose(file);
    }
    return 0;
}