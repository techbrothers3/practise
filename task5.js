//   var evenSum = 0;
//   for (var i = 0; i < arr.length; i+=2) {
//     evenSum += arr[i];
//   }
//
//   var oddSum = 0;
//   for (var i = 1; i < arr.length; i+=2) {
//     oddSum += arr[i];
//   }
//
//   return oddSum - evenSum;
// }
//
function anyFunction(arr) {
//   var i = 0;
//   var total = 0;
//   while(i < arr.length){
//   total += arr[i];
//   i++;
// }
// return total;

var i = 0;
var totalEven = 0;
while(i < arr.length) {
  totalEven += arr[i];
  i += 2
}
// return total;

var i = 1;
var totalOdd = 0;
while(i < arr.length) {
  totalOdd += arr[i];
  i += 2;
}
// return total;
return totalOdd - totalEven;
}


console.log(anyFunction([1,5,9,2,7,11,15,20]));
// console.log(anyFunction(sum));
function reverseFunction(arr) {
  var myArray = [];
  for (var i = arr.length-1; i >= 0; i--){
    myArray.push(arr[i]);
  }
  return myArray;
}
console.log(reverseFunction([1,5,9,2,7,11,15,20]));

  function count(arr) {
    // var myArray = [];
    var num = 0;
    for(var i = 0; i < arr.length; i++) {
      if (arr[i] <=5) {
        // num.unshift(arr[i]);
        num++;
      }

    }
    return num;

  }
  console.log(count([1,5,9,2,7,11,15,20]));
