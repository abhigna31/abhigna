"use strict";
exports.__esModule = true;
var Employee = /** @class */ (function () {
    //constructor 
    function Employee(name, id, sal, doj) {
        this.name = name;
        this.id = id;
        this.sal = sal;
        this.doj = doj;
    }
    return Employee;
}());
exports.Employee = Employee;
var employee = new Employee("abhi", 103, 500000, new Date());
console.log("name  :   " + employee.name, "id  :   " + employee.id, "sal  :   " + employee.sal, "doj  :   " + employee.doj);
