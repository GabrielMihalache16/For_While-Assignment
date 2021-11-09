public class LogicalOperation {
    //Cerinta 3
    public int checkBiggerNumber(int first, int second) {
        if (first < second) {
            return second;
        } else {
            return first;
        }
    }

    //Cerinta 4
    public String verifyProvidedText(String text) {
        if (text.equals("FastTrackIT")) {
            return "Learning text comparison";
        } else return "Got to try some more";
    }

    //Cerinta 5
    public String cerinta5(String text, int number) {
        if (text.equals("FastTrackIT") && number <= 3)
            return text + number;
        else if (!text.equals("FastTrackIT") && number >= 4)
            return text + number;
        else return "???";
    }

    //Cerinta 6
    public String cerinta6(int b) {
        if (b > 8 || b == 6) {
            return "The amount of snow this winter was(cm): " + b;
        } else {
            return "The forecast snow is(cm): " + b;
        }
    }

//    public void cerinta6altfel(int b) {
//        if (b > 8 || b == 6) {
//            System.out.println("The amount of snow this winter was(cm): " + b);
//        } else {
//            System.out.println("The forecast snow is(cm): " + b);
//        }
//    }

    //Cerinta 7
    public String cerinta7(int a) {
        if (a > 3 && a != 4) {
            return "The number is greater than 3 and not equal to 4";
        } else if (a == 4) {
            return "The number is equal to 4";
        } else if (a < 3) {
            return "The number is lower than 3";
        } else return "Your number is 3";
    }

    //Cerinta 8
    public void cerinta8(int a) {
        System.out.println(a);
        switch (a) {
            case 5:
                System.out.println("The number is: 5!");
                break;
            case 15:
                System.out.println("The number is: 15!");
                break;
            case 300:
                System.out.println("The number is: 300!");
                break;
            default:
                System.out.println("The number is not 5, 15 or 300.");
        }

    }

    //Cerinta 9
    public boolean isNumberEven(int a) {
        if (a % 2 == 0) {
            return true;
        } else {
            return false;
        }
//        sau return (a % 2 == 0)?true:false;
    }

    //Cerinta 10
    public boolean isEligibleToVote(int a) {
        if (a > 18) {
            return true;
        } else return false;
    }

    //Cerinta 11
    public int cerinta11(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else return c;
    }

    //TEMA FOR
    //Cerinta 1
    public void numberCount(int x) {
        for (int i = x; i <= 100; i++) {
            System.out.println(i);
        }
    }

    //Cerinta 2
    public void numberDecend(int x) {
        for (int i = x; i >= -100; i--) {
            System.out.println(i);
        }
    }

    //Cerinta 3
    public void cerintaFor3(int x, int y) {
        for (int i = x; i <= y; i++) {
            System.out.println(i);
        }
    }

    //Cerinta 4
    public void cerintaFor4(int x, int y) {
        if (x > y) {
            for (int i = y; i <= x; i++)
                System.out.println(i);
        } else {
            for (int i = x; i <= y; i++) {
                System.out.println(i);
            }
        }
    }

    //Cerinta 5
    public void cerintaFor5() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    //Cerinta 6
    public void cerintaFor6() {
        for (int i = 1; i <= 100; i = i + 2) {
            System.out.println(i);
        }
    }

    //Cerinta 7
    public int cerintaFor7(int x) {
        for (int i = x; i <= 100; i++) {
            x = i + x;
        }
        return x;
    }

    //Cerinta 8
    public float cerintaFor8(int x) {
        float sum = 0;
        for (int i = x; i <= 100; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
        return sum / (100 - x + 1);
    }

    //Cerinta 9
    public void cerintaFor9() {
        for (int i = 0; i < 7; i++) {
            System.out.println();
            for (int j = i; j < 7; j++) {
                System.out.print(" * ");
            }
        }
    }

    //TEMA WHILE
    //Cerinta 1
    public void cerintaWhile1(int x) {
        while (x <= 100) {
            System.out.println(x);
            x++;
        }
    }

    //Cerinta 2
    public void cerintaWhile2(int x) {
        while (x >= -100) {
            System.out.println(x);
            x--;
        }
    }

    //Cerinta 3
    public void cerintaWhile3(int x, int y) {
        while (x <= y) {
            System.out.println(x);
            x++;
        }
    }

    //Cerinta 4
    public void cerintaWhile4(int x, int y){
        if (x <= y){
            while (x <= y){
                System.out.println(x);
                x++;
            }
        } else {
            while (x >= y){
                System.out.println(y);
                y++;
            }
        }
    }

    //Cerinta 5
    public void cerintaWhile5(){
        int i = 1;
        while (i <= 100){
            if (i % 2 == 0){
                System.out.println(i);
            }
            i++;
        }
    }

    //Cerinta 6
    public void cerintaWhile6(){
        int i = 1;
        while (i <= 100){
            if (i % 2 != 0){
                System.out.println(i);
            }
            i++;
        }
    }

    //Cerinta 7
//    Creati o metoda care sa adune toate numerele din intervalul 111 si 8899. Sa se afiseze suma totala,
//    iar dupa aceea sa se calculeze si afiseze media numerelor din acel interval.
//    Introduceti o variabila int count in metoda, pentru a numara toate numerele din interval.
//    Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.
    public void cerintaWhile7(){
        int i = 111;
        int count = 0;
        float sum = 0;
        while(i <= 8899){
            sum+=i; // sum = sum + i
            i++;
            count++;
        }
        System.out.println(sum);
        System.out.println(sum/count);
    }

    //Cerinta 8
    public float cerintaWhile8(int a, int b){
        int x = a;
        float sum = 0;
        int count = 0;
        while (x <= b){
            if (x % 7 == 0){
                sum = sum + x;
                count++;
            }
            x++;
        }
        return sum / count;
    }

    //Cerinta 9
    public void cerintaWhile9(){
        int i = 3;
        int a = 0;
        int b = 1;
        int urm;
        System.out.println(a);
        System.out.println(b);
        while (i <= 20){
                urm = a + b;
                a = b;
                b = urm;
                System.out.println(urm);
            i++;
        }
    }

    //Cerinta 10
    public void cerintaWhile10(){
        int i = 1;
        while (i <= 110){
            if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0){
                System.out.print("CozaLozaWoza ");
            }
            else if (i % 5 == 0 && i % 7 == 0){
                System.out.print("WozaLoza ");
            }
            else if (i % 3 == 0 && i % 7 == 0){
                System.out.print("CozaWoza ");
            }
            else if (i % 3 == 0 && i % 5 == 0){
                System.out.print("CozaLoza ");
            }
            else if (i % 7 == 0){
                System.out.print("Woza ");
            }
            else if (i % 5 == 0){
                System.out.print("Loza ");
            }
            else if (i % 3 == 0){
                System.out.print("Coza ");
            }
            else {
                System.out.print(i + " ");
            }
            if (i % 11 == 0){
                System.out.println();
            }
            i++;
        }
    }




}

