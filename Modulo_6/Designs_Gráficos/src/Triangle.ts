class Triangle extends Shape {
    constructor() {
        super("Triangle", "3")
    }

    draw(): void {
        console.log("Drawing a Triangle");

    }

    public clone(): Prototype {
        const clone = new Triangle();
        clone.setId(this.getType());
        return clone;
    }
}