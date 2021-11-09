public class Main {
    public static void main(String[] args) {
        Calculator clc = new Calculator();
        //Cerinta 1
        Random.printMyName();
        int result1 = clc.sum(2,5);
        float result2 = clc.divide (10,3);
        int result3 = clc.calc1 (-5, 8, 6);
        float result4 = clc.calc2(55,9,9);
        float result5 = clc.calc3(20,3,5,8);
        float result6 = clc.calc4(5,15,3,2,8,3);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);

        //Cerinta 2
        int result7 = clc.adunare(10, 5);
        int result8 = clc.scadere(25, 20);
        int result9 = clc.inmultire(2, 4);
        double result10 = clc.impartire(3, 5);
        System.out.println(result7);
        System.out.println(result8);
        System.out.println(result9);
        System.out.println(result10);

        //Cerinta 3
        Random.printJAVA();

        //Cerinta 4
        float result11 = clc.average(10,20,30);
        System.out.println(result11);

        //Cerinta 5
        Random.georgel();

        //Cerinta 6
        int result12 = clc.restul(2, 3);
        System.out.println(result12);

        //Cerinta 7
        double celsius = Converter.temperatura(100);
        System.out.println(celsius);

        //Cerinta 8
        float metri = Converter.distantaMetri(100);
        System.out.println(metri);

        //Cerinta 9
        Converter.Cerinta9(100,5,15,50);

        //Tema if else - Cerinta 3
        int x = 10;
        int y = 13;

        LogicalOperation op = new LogicalOperation();
        int biggest = op.checkBiggerNumber(x, y);
        System.out.println("The bigger number is:" + biggest);

        //Cerinta 4
        String text = "FastTrackIT";
        System.out.println(op.verifyProvidedText(text));

        //Cerinta 5
        System.out.println(op.cerinta5("FastTrackIT", 5));

        //Cerinta 6
        System.out.println(op.cerinta6(9));

//      //cerinta 6 in alt fel
//      op.cerinta6altfel(6);

        //Cerinta 7
        System.out.println(op.cerinta7(3));

        //Cerinta 8
        op.cerinta8(15);

        //Cerinta 9
        System.out.println(op.isNumberEven(10));

        //Cerinta 10
        System.out.println(op.isEligibleToVote(19));

        //Cerinta 11
        System.out.println(op.cerinta11(10,11,12));



        //Tema 4 - FOR
        //Cerinta 1
        op.numberCount(1);
        op.numberDecend(1);
        op.cerintaFor3(1,50);
        op.cerintaFor4(1, 90);
        op.cerintaFor5();
        op.cerintaFor6();
        System.out.println(op.cerintaFor7(50));
        System.out.println(op.cerintaFor8(20));
        op.cerintaFor9();
        op.cerintaWhile1(1);
        op.cerintaWhile2(0);
        op.cerintaWhile3(10,50);
        op.cerintaWhile4(30, 20);
        op.cerintaWhile5();
        op.cerintaWhile6();
        op.cerintaWhile7();
        System.out.println(op.cerintaWhile8(7, 700));
        op.cerintaWhile9();
        op.cerintaWhile10();


    }
}
