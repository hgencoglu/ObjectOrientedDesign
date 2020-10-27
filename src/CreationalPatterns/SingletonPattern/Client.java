package CreationalPatterns.SingletonPattern;

//Singleton Tasarım Deseninin kullanım amacı, singleton nesnesinin
// sistem içerisinde yalnızca bir kez oluşturulma gereksinimidir.
// Örnek olarak bir web sayfasının ilk kez yüklenirken yapması
// gereken veritabanı işlemleri verilebilir.
public class Client {

    public static void main(String[] args) {

        try {
            SingletonClass s1 = SingletonClass.getInstance();
            //System.out.println(s1);
            s1.method("s1"+s1);
            SingletonClass s2=SingletonClass.getInstance();
            //System.out.println(s2);
            s1.method("s2"+s2);
            //SingletonEager se = SingletonEager.getInstance();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
