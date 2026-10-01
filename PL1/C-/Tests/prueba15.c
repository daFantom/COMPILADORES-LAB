void main(void) {
    int isLoggedIn = 1;
    int isAdmin = 0;

    output(isLoggedIn && !isAdmin);
    output(isLoggedIn || isAdmin);
    output(!isLoggedIn);
}