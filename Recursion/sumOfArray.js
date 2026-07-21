let arr = [1,2,3,4,5];

let n = arr.length;

// odd array
function sumAll(n) {
    if (n == 0) {
        if (arr[n] % 2 != 0) {
            return arr[n];
        }
        else {
            return 0;
        }
    } 

    if (arr[n] % 2 == 0) {
        return 0 + sumAll(n-1);
    }
    else {
        return arr[n] + sumAll(n-1);
    }

}

console.log(sumAll(n-1));
