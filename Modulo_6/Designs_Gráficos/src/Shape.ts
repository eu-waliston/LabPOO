abstract class Shape implements Prototype {
    protected id: string;
    protected type: string;

    constructor(type: string, id: string) {
        this.type = type;
        this.id = id;
    }

    abstract draw(): void;

    public getId(): string {
        return this.id;
    }

    public setId(id: string): void {
        this.id = id;
    }

    public getType(): string {
        return this.type;
    }

    public setType(type: string): void {
        this.type = type;
    }

    public abstract clone(): Prototype;
}
