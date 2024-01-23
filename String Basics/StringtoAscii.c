/*
String to ascii values
*/
#include <stdio.h>
#include <string.h>

int main()
{
    char str[100];
    printf("Enter a string:\n");
    scanf("%[^\n]s",str);
    for(int i=0;i<strlen(str);i++)
        printf("%d ",str[i]);
}
