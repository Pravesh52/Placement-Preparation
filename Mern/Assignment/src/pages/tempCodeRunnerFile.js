const Person={
    name: "Pravesh",
    greet9: function(){
        return "Hello "+this.name;
    },

    errow: ()=>{
        return "Hello"+this.name;
    }

    
};

console.log(Person.greet9())
console.log(Person.errow());