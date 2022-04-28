%{
#include<stdio.h>
int count=0;
%}
%%
\n {count++;}
. {;}
%%
int yywrap(void){
	
}
int main(){
	yylex();
	printf("Number of lines : %d\n",count);
	return 0;
}
