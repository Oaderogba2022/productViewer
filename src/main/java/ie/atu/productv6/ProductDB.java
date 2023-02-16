package ie.atu.productv6;

import ie.atu.productv6.*;

public class ProductDB {

    public static Productable getProduct(String productCode) {
        // In a more realistic application, this code would
        // get the data for the product from a file or database
        // For now, this code just uses if/else statements
        // to return the correct product data

        Productable p = null;

        if (productCode.equalsIgnoreCase("java")) {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("ATU Java Programming");
            myBook.setPrice(57.50);
            myBook.setAuthor("Joe Brown");
            p = myBook;
        } else if (productCode.equalsIgnoreCase("jsp")) {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Java Servlets and JSP");
            myBook.setPrice(57.50);
            myBook.setAuthor("Mike White");
            p = myBook;
        } else if (productCode.equalsIgnoreCase("mysql")) {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Lennon's MySQL");
            myBook.setPrice(54.50);
            myBook.setAuthor("Jim Lennon");
            p = myBook;
        }


        if (productCode.equalsIgnoreCase("studios")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Visual Studios");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Microsoft 1.1");
            p = mySoftware;
        } else if (productCode.equalsIgnoreCase("eclipse")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Build Java apps");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Eclipse Neon");
            p = mySoftware;
        } else if (productCode.equalsIgnoreCase("oracle")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Latest MySQL");
            mySoftware.setPrice(54.50);
            mySoftware.setVersion("Oracle 3.0");
            p = mySoftware;
        }
        if(productCode.equalsIgnoreCase("JHUS"));
        {
            Music myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("DID YOU SEE by JHUS");
            myMusic.setLabel("Universal music group");
            myMusic.setPrice(86.50);
            p =  myMusic;
        }
        if(productCode.equalsIgnoreCase("kdl43"));
        {
            TV tvSize = new TV();
            tvSize.setCode(productCode);
            tvSize.setDescription("SONY BRAVIA SMART TV KDL43F663 by Sony");
            tvSize.setScreenSize(" 55");
            tvSize.setPrice(819.00);
            p =  tvSize;
        }
        if (productCode.equalsIgnoreCase("Horse"))
        {
            Horse myHorse = new Horse();
            myHorse.setType(productCode);
            myHorse.setDam("Is an");
            myHorse.setSire("Arabian");
            myHorse.setHeight(156);
            myHorse.setAge(9);
            myHorse.setPrice(700);
            p = myHorse;

        }
        if (productCode.equalsIgnoreCase("Dog")) {
            Dog myDog = new Dog();
            myDog.setType(productCode);
            myDog.setAge(5);
            myDog.setBreed("GreyHound");
            myDog.setPrice(800);
            myDog.setVaccination("No");
            myDog.setShedding("Yes");
            myDog.setNeutered("No");
            p = myDog;


        }

        return p;
    }
}

