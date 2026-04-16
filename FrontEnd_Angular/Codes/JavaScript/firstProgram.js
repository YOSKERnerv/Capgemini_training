// console.log("Hello World");
// console.log(global);
// console.log(window);

// const a = 10+30;
// console.log(a);

// let b  = "Yosker ";
// b += "Nervo";
// console.log(b);

// var c = 100;
// var c  =500+" Hello";
// console.log(c);
// console.log(typeof a);
// console.log(typeof b);
// var d1 = 'value';
// var $d  = 'c';
// console.log(d1);
// console.log($d);
// console.log(typeof d1);
// var d = 3.23;
// console.log(d);
// console.log(typeof d);
// d = 100;
// console.log(d);
// console.log(typeof d);

// const e = 100+"heg";
// console.log(typeof e);
// console.log(e);


// checking the data type of a variable
// let a = Symbol(10);
// console.log(a);
// console.log(typeof a);
// console.log(a.toString());
// console.log(typeof a.toString());

// let b = true;
// console.log(b);
// console.log(typeof b);

// let c = null;
// console.log(c);
// console.log(typeof c);
// console.log(c === null);

// let d = undefined;
// console.log(d);
// console.log(typeof d);
// console.log(d === undefined);

// var e = 10n;
// e += 100n;
// e += "yosker";
// console.log(e);
// console.log(typeof e);

// console.log(a);
// let a = 100;
// console.log(a); // this will give an error because of the temporal dead zone

// truthy and Thruthy values in JavaScript

// let val = Boolean(" ");
// console.log(val); // the out put will be true because the string is not empty
// console.log(typeof val);

// === and == operator in JavaScript
// let a = 10;
// let b = "10";
// let c = 10;
// console.log(a == b); // this will return true because the == operator does type coercion
// console.log(a === b); // this will return false because the === operator does not do type coercion
// console.log(a === c);// this will return true because both a and c are of the same type and have the same value

// console.log(a != b); // this will return false because the != operator does type coercion
// console.log(a !== b); // this will return true because the !== operator does not do type coercion
// console.log(a !== c); // this will return false because both a and c are of the same type and have the same value   
// console.log(a-"hii"); // this will return NaN because the string "hii" cannot be converted to a number
// console.log(typeof NaN); // this will return number because NaN is a special value that represents Not-a-Number and it is of type number
// console.log(NaN === NaN); // this will return false because NaN is not equal to anything, including itself
// console.log(NaN == NaN); // this will also return false because NaN is not equal to anything, including itself
// console.log(10-"20"); // this will return -10 because the string "20" can be converted to the number 20 and then the subtraction is performed
// console.log(typeof String(10-"20")); 
// console.log(10n+"10n")
// console.log(String(10n));
// console.log(BigInt("10")); // this will return 10n because the string "10" can be converted to the BigInt 10n
// console.log(10<20 && "hello"); // this will return "hello" because the first condition is true and the second condition is a non-empty string which is also truthy
// console.log(10>20 && "hello"); // this will return false because the first condition is false and the second condition is not evaluated
// console.log(10>20 || "hello"); // this will return "hello" because the first condition is false and the second condition is a non-empty string which is also truthy
// console.log(10<20 || "hello"); // this will return true because the first condition is true and the second condition is not evaluated
// console.log("hii" && "hello"); // this will return "hello" because both conditions are non-empty strings which are truthy and the && operator returns the last truthy value
  

// function demo(){
//     console.log("This is a demo function");
// }

// console.log(demo); // this will return the function definition because we are not calling the function
// demo(); // this will call the function and execute the code inside the function
// console.log(add(10,4));
// function add(a,b){
    // console.log("The sum of a and b is: "+(a+b));
    // return a+b;
// }
// console.log(add(10,4));
// add(10,4);
// let val = add(10,4);
// console.log(val);
// arguments object if we want to access 3rd value to if we pass it in a function


// ##########################################################################################

// Named Function
// anonymous function :  function without a name
// let val  =function (){
//     console.log("Anonymous function");
//     return NaN;
// }
// console.log(val); // this will return the function definition because we are not calling the function
// console.log(val()); // this will call the function and execute the code inside the function and return undefined because there is no return statement in the function
// val();
// console.log(NaN===undefined);

// console.log(val());
// if(console.log(val())===undefined){
//     console.log("The function does not return anything");
// } // this will return true because the function does not return anything and the default return value of a function is undefined

// if(console.log(val())===NaN){
//     console.log("The function returns NaN");
// }
// let res = 30;
// res = val();
// console.log(res);

// ##########################################################################################
// Arrow Function
// console.log(a(10,"yosker")); // this will give an error because the function a is not defined yet and it will be in the temporal dead zone until it is defined
// let a = (c,d) => c+d;
// console.log(a(10,"yosker"));

// console.log(a(10,"yosker")); // now it is variable
// var a = (c,d) => c+d;
// console.log(a(10,"yosker"));


// # ##########################################################################################
//Higher order function : a function that takes another function as an argument or returns a function as a result
//Callback function : a function that is passed as an argument to another function and is executed after some operation is completed

// function demo(a,b,c){
//     console.log(c(a,b));
// }
// var add = (x,y) => x+y;

// demo(10,20,add);
// function sub(x,y){
//     console.log("This is a subtraction function");
//     return x-y;
// }
// demo(10,20,sub);
// demo(10,20,function(x,y){
//     console.log("This is an anonymous function for multiplication");
//     return x*y;
// });

// demo(10,20,(x,y)=>{
//     console.log("This is an arrow function for division");
//     return x/y;
// });

    // what is closure in JavaScript : a closure is a function that has access to the variables in its outer scope even after the outer function has returned
// debugger;
// function outer(){
// let count = 0;
//     function inner(){
//         count++;
//         console.log(count);
//     }
//     inner();
//     return inner;
// } 
// let counter = outer();
// console.log(counter());


// # ##########################################################################################

//Global Scope and Block Scope in JavaScript
// function demo(){
//     var a = 10;
// }
// console.log(a); // this will give an error because a is not defined in the global scope and it is only accessible inside the function demo

// if(true){
//     let b = 20;
//     console.log(b); // this will print 20 because b is defined in the block scope and it is accessible inside the block
// }
// // console.log(b); // this will give an error because b is not defined in the global scope and it is only accessible inside the block
// if(true){
//     var c = 30;
//     console.log(c); // this will print 30 because c is defined in the block scope and it is accessible inside the block
// }
// console.log(c); // this will print 30 because var is function scoped and it is accessible outside the block as well

// # ##########################################################################################

// String interpolation in JavaScript

// let username  = "Yosker";
// let lastName  = "10";


// console.log(`this is addition of two values ${true ? username : lastName}`);



// Objects in JavaScript
// let obj = {
//     name : "Yosker",
//     age : 30,
//     city : "Delhi",
//     "last name" : "Nervo",
//     10 : "ten"
// }

// console.log(obj.name); // this will print "Yosker" because we are accessing the name property of the object using dot notation
// console.log(obj["age"]); // this will print 30 because we are accessing the age property of the object using bracket notation
// console.log(obj["last name"]); // this will print "Nervo" because we are accessing the last name property of the object using bracket notation and we have to use quotes because there is a space in the property name
// console.log(obj[10]); // this will print "ten" because we are accessing the property with key 10 using bracket notation and we have to use quotes because the key is a number


// console.log(Object.keys(obj)); // this will print an array of all the keys in the object
// console.log(Object.values(obj)); // this will print an array of all the values in the object
// console.log(Object.entries(obj)); // this will print an array of all the key-value pairs in the object as arrays    

// Object.seal(obj) // this will seal the object and prevent any new properties from being added to the object and it will also prevent any existing properties from being deleted from the object but it will allow us to modify the existing properties of the object
// obj.name = "Nervo";
// console.log(obj.name); // this will print "Nervo" because we are allowed to modify the existing properties of the object even after sealing it
// console.log(Object.isSealed(obj)); // this will return true because the object is sealed

// console.log(Object.freeze(obj)); // this will freeze the object and prevent any new properties from being added to the object and it will also prevent any existing properties from being deleted from the object and it will also prevent any existing properties from being modified
// obj.name = "sdgsfg";
// console.log(obj.name); // this will print "Nervo" because we are not allowed to modify the existing properties of the object after freezing it
// console.log(Object.isFrozen(obj)); // this will return true because the object is frozen



// #### ##########################################################################################

// Rest amd Spread operator in JavaScript

// function demo(a,b,...c){
//     console.log(a); // this will print the first argument passed to the function
//     console.log(b); // this will print the second argument passed to the function
//     console.log(c); // this will print an array of all the remaining arguments passed to the function
// }
// demo(10,20,30,40,50);

// what is rest??
// rest is a syntax that allows us to represent an indefinite number of arguments as an array in a function definition. It is denoted by three dots (...) followed by the name of the array that will hold the remaining arguments. It must be the last parameter in the function definition and it can only be used once in a function definition.

// what is spread??
// spread is a syntax that allows us to expand an iterable (like an array or a string) into individual elements in places where zero or more arguments or elements are expected. It is denoted by three dots (...) followed by the name of the iterable that we want to expand. It can be used in function calls, array literals, and object literals.

//example of spread operator in function calls
// function demo(a,b,c){
//     console.log(a); // this will print the first argument passed to the function
//     console.log(b); // this will print the second argument passed to the function    
//     console.log(c); // this will print the third argument passed to the function
// }
// let arr = [10,20,30];
// demo(...arr); // this will expand the array into individual elements and pass them as arguments to the function


// example of spread operator in array literals
// let arr1 = [1,2,3];
// let arr2 = [4,5,6];
// let arr3 = [...arr1,...arr2]; // this will expand both arrays into individual elements and create a new array with all the elements from both arrays
// console.log(arr3); // this will print [1,2,3,4,5,6]


// function demo(a,b,c){
//     console.log(Array.isArray(arguments)); // this will return false because arguments is an not an array

//     let data = Array.from(arguments); // this will create a new array from the arguments object
//     console.log(data);

// }
// let arr1 = [10,20,30];
// let arr2 = [40,50];
// // demo(10,20,20,30,40,50);
// demo(arr1,arr2);
// demo(...arr1,...arr2);

// let [a,b,c] = [10,20,30,40,50];
// console.log(a);

// let [a,b,...c] = [10,20,30,40,50];
// console.log(c);

// let {address,name,age} = {
//     name : "Yosker",
//     age: 30,
//     "last name" : "Nervo",
//     address : {
//         city : "jaipur",
//         state : "RAJASTHAN",
//     },
// };

// let {state} = address;
// console.log(state);




// import myname from "./myScript";
// import {} from "./myScript";
