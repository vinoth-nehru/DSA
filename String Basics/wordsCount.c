/*
No of words of the string
*/
#include <stdio.h>
#include <string.h>
int main()
{
    char str[200];
    printf("Enter the string:\n");
    scanf("%[^\n]s", str);
    int words=0;
    for(int i=0;i<strlen(str);i++){
        if(str[i]==' ' && str[i+1]!=' '){
            words++;
        }
    }
    printf("%d ",words+1);
    return 0;
}
