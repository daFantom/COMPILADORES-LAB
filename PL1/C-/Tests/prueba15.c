bool isItTrue(bool b){
    return !!!b;
}

void main(void) {
    bool isLoggedIn;
    bool isAdmin;

    isLoggedIn = true;
    isAdmin = false;

    output(isLoggedIn && !isAdmin);
    output(isLoggedIn || isAdmin);
    output(!isLoggedIn);
    output(isItTrue(false));
}