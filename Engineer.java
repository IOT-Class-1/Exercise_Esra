package mervegündoğmuş.Day2;

public class Engineer extends Employee { // Engineer miras alıyor Employee sınıfından.
    public Engineer(String name, double salary, int age){ // isim maaş ve yaş bilgilerini Employee sınıfından miras aldığı için "super" ile çağırıyoruz.
        super(name, salary, age);
    }
    public double getAnnualBonus(){
        return super.salary* .05;
    }
}
