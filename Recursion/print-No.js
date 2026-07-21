
function printNTOONe(n) {
    if ( n == 0) return;
    console.log(n);
    printNTOONe(--n);
}

let a = 10;
printNTOONe(a);
