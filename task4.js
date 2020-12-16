var myArray = ['a', 'd','f', 't'];
    myArray[3] = 'hahahahhahhahh';
var myArray = ["a"];
myArray[0] = "hhahahha";
myArray.push("hehehe");
myArray.pop();
console.log(myArray);
function spread(arr) {

  arr.unshift("sultan");
  arr.push("junior college");
  return arr;
}
console.log(spread(["ul-uloom"]));


function sprad(str) {
  str =  "sultan" +  str;
  str += " junior college";
  return str;
}
console.log(sprad("  ul-uloom"));
