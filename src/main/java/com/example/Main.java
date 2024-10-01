package com.example;

import java.util.Random;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Type Safety, OOP
        // Data types : String, int, double, float, char, byte, short, long
        // Primitive and Reference
        // Variable
        // PascalCaseExample : PhoneNumber, StudentName
        // camelCaseExample : phoneNumber, studentName
        // snake_case_example : phone_number, student_name
        // kebab-case : phone-number, student-name
        // DRY : don't repeat yourself
        // + - / * %


//        String phoneName = "16";
//        int storage = 2147483647;
//        double processor = 12.5;
//        float price = 234234.4F;
//        char model = '2';
//        boolean outlet = true;
//        byte display = 127;
//        short length = 2332;
//        long battery = 2147483647;

//        double number1 = 2;
//        double number2 = 5;
//        double result = number1 / number2;
////        System.out.println(result); // 0.12
//        boolean test = 0.1 + 0.1 + 0.1 == 0.30000000000000004; // 0.30000000000000004
//        String username = "user1";
//        String password = "12345";

//        boolean loginEmail = username == "user1"; // true
//        boolean loginPassword = password == "123454"; // true
//        boolean loginResult = loginEmail == loginPassword;
//        System.out.println(loginResult);

        // %


//        if (username == "user1"){
//            System.out.println("User name is correct");
//        }else{
//            System.out.println("User name is not correct");
//        }
//
//        if (password == "12345"){
//            System.out.println("Password is correct");
//        }

//        int res = 9%2;
//        System.out.println(res);

//        int num = 153;
//        int netice = num % 9;
//        System.out.println(netice);
//        System.out.println(netice == 0);

//        String num1 = "3";
//        String numRes = num1 + 2;

//        char group = 'a';
//        String n = "a";
//        System.out.println(n+group);

//        float res1 = storage + price;
////        System.out.println(res1);
//
//        byte age;
//        age = 23;
//
//       float productPrice = 5000;
//       int percent = 11;
//       float productPercent = (productPrice + productPrice) * percent / 100;
//       System.out.println(productPercent);


// syntax ( condition ){
//
//   codes
//
//    }

//        int a = 3;
//        int b = 4;
//        if (a==b) { // false
//            System.out.println("Beraberdi");
//        }else{
//            System.out.println("Beraber deyil");
//        }

        String username = "sanan";
        String email = "sanan@example.com";
        String password = "12345";
        int age = 27;
        boolean emailConfirmed = true;

        // true  && true  == true
        // true  && false == false
        // false && true  == false
        // false && false == false

//        if (username == "sanan" && password == "12345" && emailConfirmed){
//            System.out.println("Xos geldiniz "+ username);
//        }else{
//            System.out.println("Istifadeci adi ve ya sifre yanlisdir");
//        }



//        if (username == "sanan" && password == "12345" && emailConfirmed && age > 18){
//            System.out.println("Xos geldiniz "+ username);
//        }else {
//            System.out.println("Sisteme daxil ola bilmirsiniz");
//        }


        // true  || false == true
        // true  || true  == true
        // false || true  == true
        // false || false == false


//        if (username == "kamran" &&  email == "sanan@example.com" && password == "123456" || emailConfirmed && age > 18){ // true
//            System.out.println("Xos geldiniz "+ username);
//        }else{
//            System.out.println("Sisteme daxil ola bilmirsiniz");
//        }



//        int point = 109;
//
//        if (point >= 51 && point <= 60){
//            System.out.println("E");
//        }
//        else if(point >= 61 && point <= 70){
//            System.out.println("D");
//        }
//        else if(point >= 71 && point <= 80){
//            System.out.println("C");
//        }
//        else if(point >= 81 && point <= 90){
//            System.out.println("B");
//        }
//        else if(point >= 91 && point <= 100){
//            System.out.println("A");
//        } else if (point > 100) {
//            System.out.println("Qiymetlendirme dogru deyil");
//        } else{
//            System.out.println("F");
//        }
//
//
//        int day = 12;
//
//
//        switch (day){
//            case 1:
//                System.out.println("Bazar ertesi");
//                break;
//            case 2:
//                System.out.println("Cersenbe axsami");
//                break;
//            case 3:
//                System.out.println("Cersenbe");
//                break;
//            case 4:
//                System.out.println("Cume axsami");
//                break;
//            case 5:
//                System.out.println("Cume");
//                break;
//            case 6:
//                System.out.println("Senbe");
//                break;
//            case 7:
//                System.out.println("Bazar");
//                break;
//            default:
//                System.out.println("Bele bir hefte yoxdu");
//        }
//
//
//        String month = "Yanvar";
//
//        switch (month){
//            case "Yanvar":
//                System.out.println("1. ay");
//                break;
//            case "Fevral":
//                System.out.println("2. ay");
//                break;
//            case "Mart":
//                System.out.println("3. ay");
//                break;
//            case "Aprel":
//                System.out.println("4. ay");
//                break;
//            case "May":
//                System.out.println("5. ay");
//                break;
//            case "Iyun":
//                System.out.println("6. ay");
//                break;
//            case "Iyul":
//                System.out.println("7. ay");
//                break;
//            case "Avqust":
//                System.out.println("8. ay");
//                break;
//            case "Sentyabr":
//                System.out.println("9. ay");
//                break;
//            case "Oktyabr":
//                System.out.println("10. ay");
//                break;
//            case "Noyabr":
//                System.out.println("11. ay");
//                break;
//            case "Dekabr":
//                System.out.println("12. ay");
//                break;
//            default:
//                System.out.println("Bele bir ay yoxdu");
//
//        }


//        String stu1 = "Fatime";
//        String stu2 = "Lamiye";
//        String stu3 = "Rena";

        String[] students = {"Fatime","Lamiye H", "Nuray","Peri","Lamiye M","Raye","Ilahe"};


        // Loops : for

//        int a = 6;
//        int b = 1;
//        a = ++b;
//        System.out.println(a);
//        System.out.println(b);

//        for(int i = 6; i < 10; i++){ // 0, 1
//            System.out.println(i); // 0, 1, 2
//        }

//        System.out.println(students[0]);
//        System.out.println(students[1]);
//        System.out.println(students[2]);
//        System.out.println(students[3]);

//        System.out.println(students.length);

//        for (int i = 0; i < students.length; i++) {
//            System.out.println(students[i]);
//        }

        Random random = new Random();

//        int number = 9;
//
//        int rndNumber = random.nextInt(1,11); // 2
//        int count = 1; // 3
//
//
//        while (number != rndNumber){
//            count++;
//            System.out.println(rndNumber);
//            rndNumber = random.nextInt(1,11); // 5 6 9
//        }
//
//        System.out.println(number + " ededini komputer " + count + " defeye tapdi." );
//
//        int rndNumber = random.nextInt(0,students.length); // 3
//
//        System.out.println(students[rndNumber]);

        boolean data = false;
        while (data){
            System.out.println("Hello");
        }

        do {
            System.out.println("Isleyecek");
        }while (false);

    }
}