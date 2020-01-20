// var main=function(){
//     var loop=function(){
//         for(x=0;x<5;x++){
//             console.log(x);
//         }
//     }();
// }
// main();
var main = function() { 
    (function() { 
       for(var x = 0;x<5;x++) { 
          console.log(x); 
       } 
    })(); 
 } 
 main();