// interface Person{
//   name:string
// }
// interface PersonDetails{
//     phonenumber:number
//     gender:string

//     interface Employee extends Person,PersonDetails{
//         empcode:number
//     }

//     let obj=<Employee>{};
//     obj.name="abhi"
//     obj.phonenumber=5687650982
//     obj.gender="female"
//     obj.empcode=743264724
//     console.log('name:'+obj.name);
//     console.log('name:'+obj.phonenumber);
//     console.log('name:'+obj.gender);
//     console.log('name:'+obj.empcode);
interface Person {   
    name:string    
 }  
 interface PersonDetail {   
     age:number  
     gender:string  
 }  
 interface Employee extends Person, PersonDetail {   
     empCode:number  
 }  
 let empObject = <Employee>{};   
 empObject.name = "Abhishek"  
 empObject.age = 25   
 empObject.gender = "Male"  
 empObject.empCode = 43  
 console.log("Name: "+empObject.name);  
 console.log("Employee Code: "+empObject.empCode);  



