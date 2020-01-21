// var asyncronous= function(){
//     return new Promise(function(resolve,reject){
//         console.log('keep every promise u make');
//         setTimeout(resolve,5000);
//     })
// }
// asyncronous()
//   .then(asyncronousFunction)
//   .then(asyncronousFunction)
// const myPromise=new Promise((resolve,reject)=>
// {
//     if(Math.random()*100<=90)
//     {
//         resolve("hello,promise");
//     }
//     reject(new Error("i fail"))
// });
// const onResolved=(resolvedValue)=>console.log(resolvedValue)
// const onRejected=(error)=>console.log(error)

// myPromise.then(onResolved,onRejected);
var fs = require('fs');
let sampletext = "This is the sample text that will go in the file.";
new Promise((resolve, reject) => {
    fs.mkdir('hello', function (err) {
        if (err) {
            console.error("Error in creating directory!");
        } else {
            console.log('The Directory Hello is created!!');
        }
    })
 resolve();
})
    .then(() => {
        fs.writeFile('.//hello//write.txt', sampletext, function (err) {
            if (err) {
                console.error("Error in writing the file!");
            } else {
                console.log('The data is written in the file!');
            }
        })
    })
    .catch(() => {
        console.log('The Data is Not Written');
    })
    .then(() => {
        fs.readFile('.//hello//write.txt', 'utf8', function (err, data) {
            if (err) {
                console.log("Error in reading file!");
            } else {
                console.log(data);
                fs.unlink('.//hello//write.txt', function (err) {
                    if (err) {
                        console.error("Error deleting file!");
                    }
                    else {
                        fs.rmdir('hello', function () { });
                        console.log('The Directory is deleted Successfully');
                    }
                });
            }
        })
    })