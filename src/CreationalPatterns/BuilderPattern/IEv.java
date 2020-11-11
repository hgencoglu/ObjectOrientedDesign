package CreationalPatterns.BuilderPattern;

public class IEv implements IEvPlani
{
    private String zeminKat;
    private String iskelet;
    private String cati;
    private String icAlan;
    public void setZeminKat(String zeminKat)
    {  this.zeminKat = zeminKat;  }
    public void setIskelet(String iskelet)
    {  this.iskelet = iskelet;  }
    public void setCati(String cati)
    {   this.cati = cati;  }
    public void setIcAlan(String icAlan)
    {  this.icAlan = icAlan;   }
}