function main() {
    const shapeManager = new ShapeManager();

    const cloneCircle = shapeManager.getShape("1") as Circle;
    console.log(`Shape: ${cloneCircle.getType()}`);
    cloneCircle.draw();

    const cloneRectangle = shapeManager.getShape("1") as Circle;
    console.log(`Shape: ${cloneRectangle.getType()}`);
    cloneRectangle.draw();

    const clonedTriangle = shapeManager.getShape("1") as Circle;
    console.log(`Shape: ${clonedTriangle.getType()}`);
    clonedTriangle.draw();

}

main();