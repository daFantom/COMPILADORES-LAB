char charNum(int n){
    char c;

    if(n < 1) c = 'A';

    if(n < 3) c = 'B';

    if(n < 5) c = 'C';

    if(n < 7) c = 'D';

    if(n <= 10) c = 'E';

    if(n > 10) c = 'Z';

    return c;
}

void main(void)
{
    int x;

    x = 5;

    output( charNum(x) );

}
