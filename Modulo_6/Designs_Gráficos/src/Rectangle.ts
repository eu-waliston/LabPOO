class Rectangle extends Shape {
    constructor(){
        super("Reactangle", "2")
    }

    draw(): void {
        console.log("Drawing a Rectangle");

    }

    public clone(): Prototype {
        const clone = new Rectangle();
        clone.setId(this.getId());
        return clone;
    }
}