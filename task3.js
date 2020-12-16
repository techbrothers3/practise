// comparison with logical order and operator
function elser(val) {
  if (val > 5  && val < 10) {
    return "yes";
  } else {
    return "no";
  }
}
elser(2);
console.log(elser(2));
function elsers(val) {
  if (val > 4 || val < 4) {
    return "no";

  }return "yes";
}
elsers(0);
console.log(elsers(0));





function elsse(val) {
  switch (val) {
    case 1:
    answer = "alpha";
    break
    case 2:
    answer = "beta";
    break
    case 3:
    answer = "gamma";
  }
return answer;

}
// elsse(3);
console.log(elsse(1));

function task(val) {
  switch (val) {
    case 1:
    answer = "alpa";
    case 2:
    answer = "bet";
    default:
    answer = "stuff"
  }

return answer;
}
console.log(task(3));



var x = myFun();

function myFun() {
  console.log("hello");
  return "world";
  console.log("byebye")
  return "bye";
}
console.log(myFun());

var myDog = {
  "name" : "chorus",
  "legs" : 4,
  "tails" : 1,
  "friends": ["bhoot","rala","rana"],
};
var name = myDog["name"];
console.log(name);
var legs = myDog["legs"];
console.log(legs);

var dogs = {
  Household: "Mutt" , Hunter: "Doberman"
};
var myDog = "Household";
var myOwn = dogs[myDog];
console.log(myOwn);

var myDog = {
  "name": "chorus"
};
myDog.bark = "bow-bow";
delete myDog.bark;
myDog.name = "happy chorus";
console.log(myDog);

var myOk = {
  top : "hat",
  bottom : "shoes"
};
console.log(myOk.hasOwnProperty("middle"));

var myMusic = [
  {
    artist : "billy",
    formats : ["cd","8t","lp"],
    releases : ["tt1","pp1","kk1"]
  },
  {
    artist : "billy",
    releases : ["tt","pp","kk"]
  }
];


var music = myMusic[0].formats[1];
console.log(music);
// myMusic[0]{1} =
// var myArray = [];
// var i = 0;
// while(i < myMusic.length) {
  // myArray.push(myMusic[i].releases);
  // i++;
// }
// console.log(myArray);
var myArray = [];
for(i = 0; i < myMusic.length; i++) {
  myArray.push(myMusic[i].releases)
}
console.log(myArray);
myArray = [];
for(var i = 9; i > 1; i-= 2) {
  myArray.push(i);
}
console.log(myArray);
myArray = [4,8,12,16];
var total = 0;
for(var i = 0;i < myArray.length;i++) {
  total += myArray[i];
}
console.log(total);
var myArray = ['a','m','d','g'];
myArray[2] = 'hahaha';
