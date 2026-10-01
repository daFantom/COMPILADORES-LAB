void main(void) {
    char x;
    char n;

    x = 'a';
    n = '\n';

    int i;

    i = 0;
    for (i = 0; i < 27; i = i+1) {
        output(x);
        x = 'b';
    }
}