package Chikens01.java;

public class Day {

    int day1,day2,day3;

    int telur;

    public int monday(int eggsPerChiken, int chikenCount){

        System.out.println("Monday : Jumlah Ayam Yang Anda Punya " + chikenCount);
        telur = eggsPerChiken*chikenCount;
        System.out.println("Jumlah Telur Monday: "+ telur);

        return this.telur;
    }

    public int Tuesday (int eggsPerChiken, int chikenCount){

        System.out.println("Tuesday : Ayam +1");
        chikenCount++;
        telur = eggsPerChiken*chikenCount;
        System.out.println("Jumlah Telur Tuesday: "+telur);
        return this.telur;
    }

    public int Wednesday(int eggsPerChiken, int chikenCount){
        System.out.println("Wednesday : Binatang Buas Memakan Setengah Ayam");
        chikenCount++;
        System.out.println("Sisa Ayam : "+ chikenCount/2);
        telur = eggsPerChiken* chikenCount/2;
        System.out.println("Jumlah Telur Wednesday: "+telur);
        return this.telur;
    }

    public int jumlahtelur(int eggsPerChiken, int chikenCount){
        day1 = eggsPerChiken*chikenCount;
        chikenCount++;
        day2 = eggsPerChiken*chikenCount;
        day3 = eggsPerChiken* chikenCount/2;
        System.out.println("Jumlah Total Telur : "+(day1+day2+day3));
        return day1+day2+day3;
    }

}
