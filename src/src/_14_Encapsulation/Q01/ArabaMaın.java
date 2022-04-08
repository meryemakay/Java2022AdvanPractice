package src._14_Encapsulation.Q01;

public class ArabaMaın {
    public static void main(String[] args) {
        Araba honda = new Araba(); //prmtresı obj /

        honda.setModel("accord");
        honda.setYıl(2018);
        honda.setMotor(1600);
        honda.setRenk("kırmızı");


        Araba toyota = new Araba("avensız", "beyaz", 300, -2020); //paramtrelı
        Araba volvo = new Araba("s80", "fume", 2400, 2010); //parmtrelı
        Araba hacuımurat = new Araba(400, 1974);


        System.out.println("honda" + honda);//tostrıng methodu olmazsa bu obje ref degerı prınt eder
        // Araba{model='accord', renk='kırmızı', motor=1600, yıl=2018}

        System.out.println("volvo aracı : " + volvo);//volvo aracı : Araba{model='s80', renk='fume', motor=2400, yıl=2010}

        System.out.println("sectıgınız arac toyota->" + "modelı :" + toyota.getModel() + "renk: " + toyota.getRenk() +
                "motor gucu :" + toyota.getMotor() + " yılı:" + toyota.getYıl());
        //sectıgınız arac toyota->modelı :avensızrenk: beyazmotor gucu :200 yılı:2020

        System.out.println("hacımurat"+ hacuımurat); //tostrınge gore yazdırılıuyor . model renk motor ve yıl yazdıracak 2 paramtrelı const olmasına ragmen..
    }


}
