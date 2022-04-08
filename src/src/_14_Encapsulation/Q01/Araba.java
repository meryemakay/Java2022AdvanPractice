package src._14_Encapsulation.Q01;

public class Araba { //POJO:planıng old java object-modal class
    //POJO classta olması grerken 4
    /*
     1- getter setter olur
     2- to string olur
     3- constructor olur
     4 -variable olur
     */

    private String model;
    private String renk;
    private int motor;
    private int yıl;

    public Araba() { //paramtresız cont degısken ozelıklere sahıptır o yuzden parmetresız yapılır
    }


    public Araba(String model, String renk, int motor, int yıl) { //parametrelı cont
        this.model = model;
        this.renk = renk;
        // this.motor = motor;
        // this.yıl = yıl;
        setMotor(motor); //cons obj create etnek ıcın parametre olerk gıren motor datası
        //setmotor methoduna paarmtre olrk calıstı degerını aldı
        setYıl(yıl);
    }

    public Araba(int motor, int yıl) { //2 parmrtlı cont
      setMotor(motor);
        this.yıl = yıl;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRenk() {

        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {//1660 gırdık else calıstı. bu classtkı 1660 atadık provate ınt motor un degerı artık1660 oldu
        if (motor < 1000) {

            System.out.println("bu cc de motor olmaz ");
            this.motor = 1200; //1000 in altındakı motoru 1200 olarak atıyor
        } else
            this.motor = motor;
    }

    public int getYıl() {
        return yıl;
    }

    public void setYıl(int yıl) {
        if (yıl < 0) {
            this.yıl = (-1) * yıl; //-2000 gırılınce -1 ıle carpacak sonra bu classtakı yıla esıtleyeck sonra yukardakı yıla goturecek
            System.out.println("- yıl gırdın");
        } else
            this.yıl = yıl;
    }

    @Override
    public String toString() { //objenın ozellıklerını  strınge cevırıyor reflerı
        return "Araba{" + //tostrng olmadan ref verır //get.model vs kullnmaya gerk kalmıyor
                "model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", motor=" + motor +
                ", yıl=" + yıl +
                '}';
    }
}

