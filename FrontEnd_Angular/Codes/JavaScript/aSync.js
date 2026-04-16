// #####################################################################################
                    //    setInterval AND clearInterval
// #####################################################################################
// let count = 1;
// let val = setInterval(()=>{ // even if async is set to 0 the sync runs first.
//     console.log("hello");
//     console.log(count);
//     if(count>=10){
//         clearInterval(val); // clear the infite loop or the interval of that perticular function.
//     }
//     count++;
// },0);

// const { dir } = require("async");

// const { compose } = require("async");

// const { compose } = require("async");

//All this are happening of event loop.

// let promiseData = new Promise((res,rej)=>{// two parameter resolvedd and rejected.
//     const success = true;
    
//     setTimeout(()=>{
//         if(success){
//             res("Sucess in fetching data");
//         }else{
//             rej("Error");
//         }
//     },2000);
// });

// promiseData.then((a)=>{
//     console.log(a);
//     console
// });
// promiseData.catch((b)=>{
//     console.log(b);
// });
// promiseData.finally(()=>{
//     console.log("Sucess");
// });


// let data = fetch("https://dummyjson.com/products");
// data.then((a)=>{
//     return a.json();
// })
// .then((b)=>{
//     let val = b.products;
//     val.forEach((a)=> {
//         console.log(a.thumbnail);
//         console.log(a);
//         console.log(a.descrption);
//     });
// });

// data.then((a)=>{
//     let val = a.json().products;
//     // let val = b.products;
//     val.forEach((a)=> {
//         console.log(a.thumbnail);
//         console.log(a);
//         console.log(a.descrption);
//     });
// });

//  ##########  ASYNC FUNCTION   ##################

// async function demo(){
//     try{
//         let val = await fetch("https://dummyjson.com/products");
//         let data = await val.json();
//         console.log(data.title);
//     }catch(error){
//         console.log(error);
//     }
// }

// demo();

//################################################################3
// // user input and respondse
// let b = confirm("Do you want to pay???");
// if(b){
//     let a = prompt("Please Enter the password!");
//     let c = SubmitEvent("Your order has been submitted.");
//     console.log("thankyou foor the purchase!");
// }else{
//     console.log("Your order has been cancelled!!!");
// }


// ###################################################################################################

// console.log(window.document.body);
// console.log(document.location)
// console.log(document.getElementById("link"))


// #################################################################################################

// let tag = document.getElementById("h1");
// tag["0"].style.background = "red";
// console.log(tag);

// #########################################################################################################
// query selector
// let query = document.querySelector(".box1");
// console.log(query); 
// query.style.background = "red";

// let tag = document.getElementsByClassName("box1");
// tag[0].style.background = "green";


// 3
// let head = document.getElementById("p1");
// head.textContent = "<mark>hello</mark>";
// head.innerHTML = "<mark>HELLO</mark>";
// head.style.fontSize = "60px";

//4
// let head = document.getElementById("p1");
// let cre = document.createElement("mark");
// cre.textContent = "Welcome";
// head.append(cre);
// console.log(cre);
// console.dir(head);


// how to take the text input given by the user
// attribute event and add on event . - .


// let inp = document.getElementById("inp");
// let head = document.getElementById("head");
// console.dir(inp.value);
// inp.addEventListener("input",()=>{
//     head.textContent = inp.value;
//     console.dir(inp.value);
// });

let inp = document.getElementById(box);
let 