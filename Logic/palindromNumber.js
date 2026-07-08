function PalinDrome() {

    let num = 131;

    let rev = 0;

    let lastDigit = 0;

    let check = num;

    if ( num == 0) {
        console.log("numebr not a palindrome");
    }

    while (num>0) {
        lastDigit = num % 10;
        rev = lastDigit + rev*10;
        num = num/10;

    }



    if (rev == check ) {
        console.log("Number is plaindrome");
    }
    else {
        console.log("not");
    }


}

PalinDrome()
