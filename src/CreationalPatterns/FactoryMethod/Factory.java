package CreationalPatterns.FactoryMethod;

public abstract class Factory {
    public void anOperation()  { IProduct IProduct = factoryMethod(); }

    protected abstract IProduct factoryMethod();

}
