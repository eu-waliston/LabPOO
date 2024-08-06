class Circle extends Shape {
    constructor(){
        super("circle", "1");
    }

    draw(): void {
        console.log("Drawing a Circle");
    }

    public clone(): Prototype {
        const clone = new Circle();
        clone.setId(this.getId());
        return clone;
    }
}