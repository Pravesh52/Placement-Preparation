
console.log("Hello World");

{
    var a=10; //function scope, redclare ,reassign
}
console.log(a);

// // {
// //     let b=10;  // block scope, not redeclare but reassign
// // }
// // console.log(b);



// // functions

// // function declaration

// function greet(name){
//     return "Hello"+name;
// }

// // function expression

// const greet2 = function(name){
//     return "Hello"+name
// }

// // Arrow function

// const greet3=(name)=>{
//     return "Hello"+name;
// }

// // Arrow function sort syntax

// const greet4= name => "Hello"+name;

// Default and rest paramerters

function greet5(name="Pravesh"){ //Default Paramerters
    return "Hello "+name;
}

function sum(...numbers){ //rest parameters
    return numbers.reduce((a,b)=> a+b,0);
}
// sum(1,2,3,4,5);

console.log(greet5());
console.log(sum(1,2,3,4,5));


