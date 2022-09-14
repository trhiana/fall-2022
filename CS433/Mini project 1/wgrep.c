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
    char *line;
    size_t lineCap = 0;
    file = fopen(argv[2], "r");

    if (argc <= 1) {
        printf("wgrep: searchterm [file ...]\n");
        exit(1);
    }
    if (argc >= 3 && file == NULL) {
        printf("wgrep: cannot open file\n");
        exit(1);
    }
    if (argc == 2) {
        file = stdin;
    }
    while (getline(&line, &lineCap, file) > 0) {
        if(strstr(line, argv[1])) {
            printf("%s", line);
        }
    }

    free(line);
    fclose(file);

    return 0;
}
