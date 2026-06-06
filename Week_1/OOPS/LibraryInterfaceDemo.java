public class LibraryInterfaceDemo {
    public static void main(String[] args) {
        System.out.println("Welcome to Library Management ");

        System.out.println("-------------Kid User----------------");
        KidUser kidUser= new KidUser();
        kidUser.age=10;
        kidUser.registerAccount();
        kidUser.age=18;
        kidUser.registerAccount();
        kidUser.BookType="kids";
        kidUser.requestBook();
        kidUser.BookType="fiction";
        kidUser.requestBook();

        System.out.println("-------------Adult User-------------");
        AdultUser adultUser= new AdultUser();
        adultUser.age=5;
        adultUser.registerAccount();
        adultUser.age=23;
        adultUser.registerAccount();
        adultUser.BookType="fiction";
        adultUser.requestBook();
        adultUser.BookType="kids";
        adultUser.requestBook();

    }
}
