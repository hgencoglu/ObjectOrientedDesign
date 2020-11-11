package CreationalPatterns.BuilderPattern;

public class TipiIMuteahhit implements IMuteahhit
{
    private IEv ev;
    public TipiIMuteahhit()
    {
        this.ev = new IEv();
    }
    public void zeminKatiInsaEt()
    {
        ev.setZeminKat("Wooden Poles");
    }
    public void iskeletiInsaEt ()
    {
        ev.setIskelet("Wood and Ice");
    }

    public void icAlaniInsaEt()
    {
        ev.setIcAlan("Fire Wood");
    }
    public void catiyiInsaEt()
    {
        ev.setCati("Wood, caribou and seal skins");
    }
    public IEv getEv()
    {
        return this.ev;
    }
}