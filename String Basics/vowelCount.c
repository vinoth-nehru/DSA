/*
Vowels count
*/
#include <stdio.h>
#include <string.h>
int main()
{
    char str1[100]="Hello";
    int c=0;
    for(int i=0;i<strlen(str1);i++){
        if(str1[i]=='a' || str1[i]=='e' || str1[i]=='i' || str1[i]=='o' || str1[i]=='u'){
            c++;
        }
    }
    printf("%d",c);
}

