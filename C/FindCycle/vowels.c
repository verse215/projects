#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>

int countVowels(char* line);

int main(void) {

   char* line;
   size_t bufSize = 2048;
   line = (char *) malloc(bufSize + 1);

   printf("Type something!!!\n");
   getline(&line, &bufSize, stdin);
   printf("Number of vowels is: %d\n", countVowels(line));
}

int countVowels(char* line) {
   int vowels = 0;
   char tmp;
    
   while(*line != '\0') {
      tmp = tolower(*line);
      if(tmp == 'a' || tmp == 'e' || tmp == 'i' || tmp == 'o' || tmp == 'u')
         vowels++;
      line++;
   }
 
   return vowels; 
}
