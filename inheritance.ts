class Car{
    Color:String
    constructor(color:string)
    {
        this.Color=color
    }
}
class Audi extends Car{
    price:number
    constructor(color:string,price:number){
        super(color)
        this.price=price

    }
display(){
console.log('color of audi:'+this.Color);
console.log('price of audi:'+this.price);
}
}

let obj=new Audi("black",1000000)
obj.display();
