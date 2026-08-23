
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

function calculatediscount(price,discount=10) {
    let discountamout=(price*discount)/100;
    let finalprice=price-discountamout;

    return finalprice;
    
}

console.log(calculatediscount(1000));
console.log(calculatediscount(1000,20));


function sumall(...numbers) {
    return numbers.reduce((a,b)=> a+b,0);
    
}
console.log(sumall(1,2,3,4));


// function greet9(name="Pravesh"){
//     return "Hello"+this.name;
// }
// console.log(greet9());

// function  object of method

const Person={
    name: "Pravesh",
    greet9: function(){
        return "Hello ",this.name;
    },

    errow: ()=>{
        return "Hello",this.name;
    }

    
};

console.log(Person.greet9());
console.log(Person.errow());







