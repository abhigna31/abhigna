 export class Employee { 
    //field 
    name:string; 
    id:number;
    sal:number;
    doj:Date;

  
    //constructor 
    constructor(name:string,id:number,sal:number,doj:Date) { 
       this.name = name 
       this.id = id
       this.sal = sal
       this.doj = doj

    }  
}


 let employee=new Employee("abhi",103,500000,new Date()); 
 console.log("name  :   "+employee.name,"id  :   "+employee.id,"sal  :   "+employee.sal,"doj  :   "+employee.doj) 
    
