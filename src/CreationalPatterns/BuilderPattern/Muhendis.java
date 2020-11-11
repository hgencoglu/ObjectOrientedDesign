package CreationalPatterns.BuilderPattern;

public class Muhendis {
    private IMuteahhit IMuteahhit;

    public Muhendis(IMuteahhit IMuteahhit)
    {
        this.IMuteahhit = IMuteahhit;
    }

    public IEv getHouse()
    {
        return this.IMuteahhit.getEv();
    }

    public void InsaataBasla()
    {
        this.IMuteahhit.zeminKatiInsaEt();
        this.IMuteahhit.iskeletiInsaEt();
        this.IMuteahhit.catiyiInsaEt();
        this.IMuteahhit.icAlaniInsaEt();
    }
}
