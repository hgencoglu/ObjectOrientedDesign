package CreationalPatterns.BuilderPattern;

public class IgloTipiEv implements IMuteahhit
{
    private IEv ev;
    public IgloTipiEv()
    {  this.ev = new IEv();  }
    public void zeminKatiInsaEt()
    {  ev.setZeminKat("Ice Bars");  }
    public void iskeletiInsaEt()
    {   ev.setIskelet("Ice Blocks");  }
        public void icAlaniInsaEt()
    {   ev.setIcAlan("Ice Carvings");  }
    public void catiyiInsaEt()
    {  ev.setCati("Ice Dome");  }
    public IEv getEv()
    {  return this.ev; }
}