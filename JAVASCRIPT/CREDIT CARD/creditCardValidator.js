function getDigitLength(cardNumber) {
    return cardNumber.length;
}

function getCardType(cardNumber) {
    if (cardNumber.startsWith("4")) {
        return "Visa";
    } else if (cardNumber.startsWith("5")) {
        return "MasterCard";
    } else if (cardNumber.startsWith("37")) {
        return "American Express";
    } else if (cardNumber.startsWith("6")) {
        return "Discover cards";
    } else {
        return "Invalid Card";
    }
}

function isValid(cardNumber) {
    let length = cardNumber.length;
    
    if (length < 13 || length > 16) {
        return false;
    }
    
    let sumOfEvens = sumOfDoubleEvenPlace(cardNumber);
    let sumOfOdds = sumOfOddPlace(cardNumber);
    
    return (sumOfEvens + sumOfOdds) % 10 == 0;
}

function sumOfDoubleEvenPlace(cardNumber) {
    let sum = 0;
  
    for (let index = cardNumber.length - 2; index >= 0; index -= 2) {
     
        sum += getDigit(digit * 2);
    }
    return sum;
}

function getDigit(number) {
    if (number < 10) {
        return number;
    }

    return (number % 10) + (number / 10);
}

function sumOfOddPlace(cardNumber) {
    let sum = 0;
     
    for (let index = cardNumber.length - 1; index >= 0; index -= 2) {
        
        sum += digit;
    }
    return sum;
}

const cardNumber = prompt("Hello, Kindly Enter Card Details:");

if (cardNumber) {
    let cardType = getCardType(cardNumber);
    let length = getDigitLength(cardNumber);
    let validStatus = isValid(cardNumber);
    let validity = validStatus ? "Valid" : "Invalid";
    
    console.log("========== Below Is Your Card Details ==========");
    console.log("Credit Card Type: " + cardType);
    console.log("Credit Card Number: " + cardNumber);
    console.log("Credit Card Digit Length: " + length);
    console.log("Credit Card Validity Status: " + validity);
    console.log("=================================================");
}

