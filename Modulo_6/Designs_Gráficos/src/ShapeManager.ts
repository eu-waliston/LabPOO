class ShapeManager {
    private prototype: Map<string, Prototype> = new Map();

    constructor() {
        //inicializando coim alguns prototipos padrão
        const circle = new Circle();
        circle.setId("1");
        this.prototype.set(circle.getId(), circle);

        const rectagle = new Rectangle();
        rectagle.setId("2");
        this.prototype.set(rectagle.getId(), rectagle);

        const triangle = new Triangle();
        triangle.setId("3");
        this.prototype.set(triangle.getId(), triangle);

    }

    public getShape(shapeId: string): Prototype | null {
        const prototype = this.prototype.get(shapeId);
        return prototype ? prototype.clone() : null;
    }
}