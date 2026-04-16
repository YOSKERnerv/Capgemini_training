// let a = 100;
// console.log(a);
// let a; // by default it is assigning any datatype.
// a="hello";
// a = 10;
// a = false;// ******** all this wont give any error as the main datatype has the type any.
// let b:string;
// b = "myStringData";
// console.log(b);
// let c :boolean;
// c = true;
// console.log(c);
// let d : bigint;
// d = 1324n;
// console.log(d);
// // let e : symbol;
// // console.log(e);
// // let f: undefined;
// f = undefined;
// console.log(f);
// let data:any = 10;
// data = "welcome";
// console.log(data);
// var a: unknown = 10n;
// a="yosker";
// console.log("Performing the narrowing");
// if(typeof a=="string"){
//     console.log(a.toUpperCase());
// }else if(typeof a=="bigint"){
//     console.log(a+10n);
// }else{
//     console.log("give the correct data");
// }
// if(typeof a == "string"){
//     var b = "yosker";
//     console.log(b===a);
//     // a = a.toUpperCase();
// }
// console.log(a);
// function demo(a:any){
//     console.log(a);
// }
// demo("Yosker"); // in implicit any it is  giving error as it is strictly giving checking the type. we can change that explict any or some other method that we would learn later.
// function demo1(a:number,b?:any, c?: boolean):bigint{
//     console.log(a);
//     console.log(b);
//     console.log(c);
//     return 20n;
// }
// demo1(100,true);
//################################################################################################
// homogenious and hetrogenious 
// let a:string[] = ["yosker","sagar","nervoid"]; // it is a homogenious array. we can make strict homo only in typescript and not in javascript
// console.log(a);
// let b:number[]=[];
// b.push(23);
// console.log(b);
// let c:boolean[] = [true,false];
// console.log(c);
// let d:undefined[] = [undefined,undefined];
// console.log(d);
// let e: symbol[] = [Symbol("yosker"), Symbol("sagar")];
// console.log(e);
//############# hetrogenious array ##########
// here we use union symbol( | ) to make option to accept multiple data in our code
// let a: number|string|boolean = "hello"; /// used union to create options
// a = true;
// a = 34;
// console.log(a);
// in function
// function demo3(user:string|number,data:boolean|string):boolean|string{
//     return true;
// }
// demo3(20,false);
// in array
// let arr: (string|number)[] = ["yosker",45,23,"sagar"];
// console.log(arr);
// let arr: (never)[] = [ ];
// console.log(arr);// it it never stores anything and also never pushed or cannot perform any operation
//###################       TUPLE        ########################
// to restict the length we use tuple
// let arr:[number,string,string] = [20,"yosker","sagar"];
// console.log(arr);
// if we perform any opration in this it will work. like if you push it will work and all.
//it is a bug but they didnt remove it...uffffffff
//
// var user={
//     firstName:"ABC",
//     age:30
// }
// user.age = 10;
// console.log(user);
// user.age = 30n;
// console.log(user);
//******** */
// creating objects using annotations
//*******/
// let obj:{
//     name:string,
//     age:number|bigint|undefined,
//     alive:boolean|string
// }={
//     name:"yosker",
//     age:22,
//     alive:true //we have to provide the same number of elements here or else it will give error.
// }
// console.log(obj.age);
// obj.age = 35;
// obj.alive = "yes";
// console.log(obj);
// const obj:{ // we can only modify it now and cant reassign
//     name:any, 
//     readonly age:number|bigint|undefined, // readonly prevents modification
//     readonly alive:boolean|string,
//     email? : string              // now this element/key is optional and doesn't need to be have a value.
// }={
//     age:30,
//     name:"yosker",
//     alive:true //we have to provide the same number of elements here or else it will give error.
// }
// obj.name = "sagar";
// // obj.age = 35; // we used noEmitOnError in config file at last so that javascript wont allow the error changes in this.
// console.log(obj);
//##########################################################################################
//############  TYPE ALIAS  #############################
// give the alternative name  to the datatype. it helps in changing the name of the data in all the files containing it.
// type val = number|string; // now the type makes the val a datatype that contains 
// //many datatypes. this will help in using this val in different feild so that we dont have to 
// //specify it again and again and even if we change the data type in one feild it wont effect 
// //any other data type in different files.
// type data = boolean;
// let obj:{
//     isAlive : data
// }={
//     isAlive :true
// }
// console.log(obj);
// let product : val = 30;
// console.log(product);
// in arrays
// type tp =  readonly[string,number,boolean,string]
// let arr:tp =["hii",34,true,'yosker'];
// // arr.push(40); // it will give the error  as it is only read only
// console.log(arr);
/// create a array uisng type alias only and a tuple
// type val  = readonly [string, number,number,boolean];
// type val2 = val;
// let arr1:val=["yosker",22,10,false];
// // arr1.push(true);
// // let a = arr1.indexOf(10);
// // console.log(a);
// console.log(arr1);
// // let arr2 :val2=arr1;
// let arr2 =arr1;
// arr2.push(20); // it still gives error. aar1 inherit readonly properties
// console.log(arr2);
//
//////////////////    in function      /////////////////
//
// type addition = (a:number,b:string|number,c:number)=>number;
// let add : addition = (x:number,y:string|number,z:number):number=>{
//     return x+z;
// }
// console.log(add(20,"add",30));
// type fun = (x:boolean)=>boolean;
// let demo:fun=()=>{ // we can have fewer parameters than what was actually specified
//     console.log("this is demo function.");
//     // return true;
//     throw new Error("taadda"); // this is nerver and it is working in this . 
// }
// console.log(true);
//
/////////////////////  using alias in objects
//
// type Address  = {
//     state : string;
//     city? : string,
//     readonly pinCode : number;
// };
// type user = {
//     firstName :string,
//     LastName : string,
//     age : number|bigint,
//     isActive : boolean,
//     email? : string
//     address  : Address
// }
// let User: user={
//     firstName : "Yosker",
//     LastName : "Nervo",
//     age: 22,
//     isActive: true,
//     address : {
//         state : 'Pubjab',
//         pinCode : 144411,
//     }
// }
// console.log(User);
// console.log(user) // we cant print it 
// User.firstName
//
//// when we make a object we cant put new elements so how to do that now?
// let obj:{
//     name : string,
//     age:number,
//     [key:string|number]:number|string|bigint, // through this we can now add multiple keys and all
// }={
//     name : "yosker",
//     age : 22,
// }
// obj.userSalary = 56452235n;
// console.log(obj);
//
//////// how type alias is behaving and intersection
//
// type user={
//     name : string
// }
// type details={
//     age : number
// }
// let data: user & details={
//     name : "Yosker",
//     age : 22
// }
// console.log(data);
//////////////////////////////////////////////////////////////////////////////////////////////
//////////////////         INTERFACE           ////////////////////////////////////////////
////////////////////////////////////////////////////////////////
// interface user{
//     name : string
// }
// interface user{
//     age : number
// }
// interface details{
//     email:string
// }
// type Address = {
//     state : string,
//     pincode : number | bigint
// }
// interface demo{
//     userData: user,
//     age:number,
//     salary:bigint,
//     address?: Address
// }
// let obj:demo={
//     userData : {
//         name : "Yosker",
//         age : 22
//     },
//     age : 60,
//     salary : 34645654n,
//     address : {
//         state : "Punjab",
//         pincode : 3465465
//     }
// }
// console.log(obj);
// function inside the interface...and array inside interface
// interface funwarr{
//     x:number,
//     y:number,
//     operation:string,
//     fun:(x:number,y:number)=>number;
// }
// let obj2:funwarr={
//     x : 34,
//     y : 43,
//     operation : "addition",
//     // fun(a:number, b:number):number => {
//     //     return a+b;
//     // }
//     fun(a, b){
//         return a+b;
//     }
// };
// console.log(obj2.fun(obj2.x,obj2.y));
// inhertitance
// interface Parent{
//     name:string,
//     parent:(a:number,b:string)=>boolean
// }
// interface Child extends Parent{
//     readonly age:number,
//     salary: number,
//     child:(a:any,b:any,c:any)=>string;
//     prac:()=>string;
// }
// interface smallChild extends Child{
//     DOB : number
// }
// let obj:smallChild={
//     name:"yosker",
//     age :22,
//     salary : 3463567,
//     DOB : 2004,
//     parent:(a,b)=>{
//         return true;
//     },
//     child:(x,y,z)=>{
//         return `this is the salary : ${x} and age : ${y}. of ${z}`
//     },
//     // prac:()=>{
//     // return  `${this.name} has the salary of ${this.salary}` ;
//     // },// this wont work has arrow function doesnot have their own this and hence this points to window
//     prac:()=>{
//         return ``;
//     }
// }
// console.log(obj.child(obj.salary,obj.age,obj.name));
/////////////////////////////////////////////////////////////////
/////////////////    CLASSES         ////////////////////////
//////////////////////////////////////////////////////////////
// class Parent{
//     name: string ="Yosker"; //when we dont make constructor then this values are static values
//     constructor(a:string){
//         this.name=a; // this is targeting the window where the document is and all other function
//     }// constructor makes values dynamic and
//     // constructor overloading is not there. but function overloading and overriding is there.
//     handle():void{
//         console.log('Hello');
//         let a = 22;
//         console.log(a);
//         console.log(this.name);
//     }
// }
// let obj  =new Parent("Sagar");
// obj.handle();
// console.log(obj);
/////////////////////////////////////////////////////
//////////////// accesss modifier    ////////////////
/////////////////////////////////////////////
// Public, Private, Protected, readonly
// public : inside its own class, its derived class, as well as in outside of class
// private : Inside its own class
// protectred : Inside its own class, derived class.
// readonly : It is readonly, no modification
class Parent {
    name;
    constructor(a) {
        this.name = a;
    }
    handle() {
        console.log(this.name);
    }
}
class Child extends Parent {
    age = 22;
    constructor(a, b) {
        super(a);
        this.age = b;
    }
    handle() {
        console.log(this.name);
        console.log(this.age);
        return `this is my name : ${this.name} and this is my  age: ${this.age} . Thankyou`;
    }
}
class smallChild extends Child {
    lastName;
    constructor(a, b, c) {
        super(a, b);
        this.lastName = c;
    }
}
let obj2 = new smallChild("Sagar", 22, "Meena");
let child = new Child("Yosker", 23);
// console.log(child.age);
console.log(child.handle());
export {};
