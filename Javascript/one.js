/*-
function a() {
    var b=10;
    c();
    function c() {
        console.log(b);
        
    }
    
}
a();

// Output: 10
*/
/*
2.WAP In JS to print 1 to 5 with 1 sec interval then 2 then 3 so on using setTimeout  and closure

function x(){
    for(let i=1; i<=5; i++){
        setTimeout(function(){
            console.log(i);
        },i* 1000);
    }
}
x();// Output: 1 2 3 4 5

*/

/*
3
function x(){
    for(var i=1; i<=5; i++){
        function closer(x){
            setTimeout(function(){
                console.log(x);
            },x* 1000);

        }
        closer(i);
       
    }
}
x();
// Output: 1 2 3 4 5


4. wAP to find area of circle using function and array

const radius =[5,6,7,8,9];
const area = function(radius){
    const Output =[];
    for(let i=0; i<radius.length; i++){
        Output.push(Math.PI*radius[i]*radius[i]);
    }
    return Output;
}

console.log(area(radius));

What is Higher order function?
ans: A higher-order function is a function that takes
 one or more functions as arguments, returns a function as its result,
  or both. In other words, it can operate on functions, either by taking them as parameters or by returning them.

5. Higher order function to find area, circumference and diameter of circle using function and array
const radius =[5,6,7,8,9];

const area = function(radius){
    
    return Math.PI*radius*radius;
};

const circumference = function(radius){
        
        return 2*Math.PI*radius;
    };

const diameter = function(radius){
            
            return 2*radius;
 }

const calculate = function(radius, logic){
    const Output =[];
    for(let i=0; i<radius.length; i++){
        Output.push(logic(radius[i]));
    }
    return Output;
}

console.log(calculate(radius, area));
console.log(calculate(radius, circumference));
console.log(calculate(radius, diameter));


6. Map 

const r=[5,6,7,8,9];
const Double = function(x){
    return 2*x;
};

function Square(x){
    return x*x;
}

function Cube(x){
    return x*x*x;
}

function SquareRoot(x){
    return Math.sqrt(x);
}
function Binary(x){
    return x.toString(2);
}

const Output=r.map(Double)
const Output1=r.map(Binary)
console.log(Output1);
console.log(Output);

7. Filter

const r=[5,6,7,8,9];

function isOdd(x){
    return x%2!==0;
}
function isEven(x){
    return x%2===0;
}

function isPrime(x){
    if(x<2) return false;
    for(let i=2; i<=Math.sqrt(x); i++){
        if(x%i===0) return false;
    }
    return true;
}
function isPerfectSquare(x){
    return Number.isInteger(Math.sqrt(x));
}
function isArmstrong(x){
    const str = x.toString();
    const len = str.length;
    let sum = 0;
    for(let i=0; i<len; i++){
        sum += Math.pow(Number(str[i]), len);
    }
    return sum === x;
}

const Output=r.filter(isOdd)
const Output1=r.filter(isEven)
console.log(Output1);
console.log(Output);

8. Reduce

const r=[5,5,5,5,5];

function sumofall(x){
    let sum = 0;
    for(let i=0; i<x.length; i++){
        sum += x[i];
    }
    return sum;
}

const Output=r.reduce((acc, curr) => acc + curr, 0);

console.log(Output);
*/
