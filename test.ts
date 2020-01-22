// function add(p:string,q:string):string
// {
//     return p+q;
// }

// function add(x:string,y:string):number
// {
//     return x+y;
// }

// function add(num1:any,num2:any):any{
//     return num1+num2;
// }

// var concat=add("hello","world");
// console.log('concat');

// var sum=add(100,150);
// console.log(sum);

function add(a:string, b:string):string;

function add(x:number, y:number): number;

function add(a: any, b:any): any {
    return a + b;
}


  var concat=add("Hello ", "abhi");
 console.log(concat); 
 var sum=add(10, 20);
console.log(sum);