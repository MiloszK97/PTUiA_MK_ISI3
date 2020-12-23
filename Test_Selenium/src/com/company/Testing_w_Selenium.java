package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testing_w_Selenium {


    public static void testCase01(){
        WebDriver webDrv = new FirefoxDriver();
        //uruchamia przeglądarkę, przechodzi wskazany adres
        webDrv.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");

        //przeszukuje strukturę strony w celu znalezienia elementu z id=email i wpisuje do niego tekst
        webDrv.findElement(By.id("inputEmail3")).sendKeys("Jan");

        //przeszukuje strukturę strony w celu znalezienia elementu z id=inputPassword3 i wpisuje do niego tekst
        webDrv.findElement(By.id("inputPassword3")).sendKeys("Kowalski");

        //przeszukuje strukturę strony w celu znalezienia elementu z id=dataU i wpisuje do niego tekst
        webDrv.findElement(By.id("dataU")).sendKeys("10.01.2006");

        //przeszukuje strukturę strony w celu znalezienia elementu checkbox z podanym id i zaznacza go
        webDrv.findElement(By.id("rodzice")).click();
        webDrv.findElement(By.id("lekarz")).click();

        //przeszukuje strukturę strony w celu znalezienia elementu button w pliku css i klika w niego
        webDrv.findElement(By.cssSelector("button")).click();

        //fragment kodu obsłsługujący alerty, dwa razy, ponieważ czasem pojawia się dziwny alert
        webDrv.switchTo().alert().accept();
        webDrv.switchTo().alert().accept();

        //zamyka przeglądarkę, musiałem użyć tego, ponieważ w innym przypadku otwiera się cały czas nowe okno przeglądarki
        webDrv.quit();
    }

    public static void testCase02(){
        WebDriver webDrv = new FirefoxDriver();
        //poniższy kod jest mniej lub bardziej opisany w metodzie testCase01 i już tak będzie do samego końca
        webDrv.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");
        webDrv.findElement(By.id("inputEmail3")).sendKeys("Jan");
        webDrv.findElement(By.id("inputPassword3")).sendKeys("Kowalski");
        webDrv.findElement(By.id("dataU")).sendKeys("10.01.2006");
        webDrv.findElement(By.id("rodzice")).click();
        //brak zaświadczenia lekarskiego
        webDrv.findElement(By.cssSelector("button")).click();
        webDrv.switchTo().alert().accept();
        webDrv.switchTo().alert().accept();
        webDrv.quit();
    }

    public static void testCase03(){
        WebDriver webDrv = new FirefoxDriver();
        //poniższy kod jest mniej lub bardziej opisany w metodzie testCase01 i już tak będzie do samego końca
        webDrv.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");
        webDrv.findElement(By.id("inputEmail3")).sendKeys("Jan");
        webDrv.findElement(By.id("inputPassword3")).sendKeys("Kowalski");
        webDrv.findElement(By.id("dataU")).sendKeys("10.01.2006");
        //brak zgody rodziców
        webDrv.findElement(By.id("lekarz")).click();
        webDrv.findElement(By.cssSelector("button")).click();
        webDrv.switchTo().alert().accept();
        webDrv.switchTo().alert().accept();
        webDrv.quit();
    }

    public static void testCase04(){
        WebDriver webDrv = new FirefoxDriver();
        //poniższy kod jest mniej lub bardziej opisany w metodzie testCase01 i już tak będzie do samego końca
        webDrv.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");
        webDrv.findElement(By.id("inputEmail3")).sendKeys("Jan");
        webDrv.findElement(By.id("inputPassword3")).sendKeys("Kowalski");
        webDrv.findElement(By.id("dataU")).sendKeys("10.01.2006");
        //brak zaświadczenia lekarskiego oraz zgody rodziców
        webDrv.findElement(By.cssSelector("button")).click();
        webDrv.switchTo().alert().accept();
        webDrv.switchTo().alert().accept();
        webDrv.quit();
    }

    public static void testCase05(){
        WebDriver webDrv = new FirefoxDriver();
        //poniższy kod jest mniej lub bardziej opisany w metodzie testCase01 i już tak będzie do samego końca
        webDrv.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");
        webDrv.findElement(By.id("inputEmail3")).sendKeys("Jan");
        webDrv.findElement(By.id("inputPassword3")).sendKeys("Kowalski");
        webDrv.findElement(By.id("dataU")).sendKeys("10.01.2010");
        webDrv.findElement(By.id("rodzice")).click();
        webDrv.findElement(By.id("lekarz")).click();
        webDrv.findElement(By.cssSelector("button")).click();
        webDrv.switchTo().alert().accept();
        webDrv.switchTo().alert().accept();
        webDrv.quit();
    }

    public static void testCase06(){
        WebDriver webDrv = new FirefoxDriver();
        //poniższy kod jest mniej lub bardziej opisany w metodzie testCase01 i już tak będzie do samego końca
        webDrv.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");
        webDrv.findElement(By.id("inputEmail3")).sendKeys("Jan");
        webDrv.findElement(By.id("inputPassword3")).sendKeys("Kowalski");
        webDrv.findElement(By.id("dataU")).sendKeys("10.01.2010");
        webDrv.findElement(By.id("rodzice")).click();
        //brak zaświadczenia lekarskiego
        webDrv.findElement(By.cssSelector("button")).click();
        webDrv.switchTo().alert().accept();
        webDrv.switchTo().alert().accept();
        webDrv.quit();
    }

    public static void testCase07(){
        WebDriver webDrv = new FirefoxDriver();
        //poniższy kod jest mniej lub bardziej opisany w metodzie testCase01 i już tak będzie do samego końca
        webDrv.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");
        webDrv.findElement(By.id("inputEmail3")).sendKeys("Jan");
        webDrv.findElement(By.id("inputPassword3")).sendKeys("Kowalski");
        webDrv.findElement(By.id("dataU")).sendKeys("10.01.2010");
        //brak zgody rodziców
        webDrv.findElement(By.id("lekarz")).click();
        webDrv.findElement(By.cssSelector("button")).click();
        webDrv.switchTo().alert().accept();
        webDrv.switchTo().alert().accept();
        webDrv.quit();
    }

    public static void testCase08(){
        WebDriver webDrv = new FirefoxDriver();
        //poniższy kod jest mniej lub bardziej opisany w metodzie testCase01 i już tak będzie do samego końca
        webDrv.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");
        webDrv.findElement(By.id("inputEmail3")).sendKeys("Jan");
        webDrv.findElement(By.id("inputPassword3")).sendKeys("Kowalski");
        webDrv.findElement(By.id("dataU")).sendKeys("10.01.2010");
        //brak zaświadczenia lekarskiego oraz zgody rodziców
        webDrv.findElement(By.cssSelector("button")).click();
        webDrv.switchTo().alert().accept();
        webDrv.switchTo().alert().accept();
        webDrv.quit();
    }

    public static void testCase09(){
        WebDriver webDrv = new FirefoxDriver();
        //poniższy kod jest mniej lub bardziej opisany w metodzie testCase01 i już tak będzie do samego końca
        webDrv.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");
        webDrv.findElement(By.id("inputEmail3")).sendKeys("Jan");
        webDrv.findElement(By.id("inputPassword3")).sendKeys("Kowalski");
        webDrv.findElement(By.id("dataU")).sendKeys("10.01.2002");
        webDrv.findElement(By.id("rodzice")).click();
        webDrv.findElement(By.id("lekarz")).click();
        webDrv.findElement(By.cssSelector("button")).click();
        webDrv.switchTo().alert().accept();
        webDrv.switchTo().alert().accept();
        webDrv.quit();
    }

    public static void testCase10(){
        WebDriver webDrv = new FirefoxDriver();
        //poniższy kod jest mniej lub bardziej opisany w metodzie testCase01 i już tak będzie do samego końca
        webDrv.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");
        webDrv.findElement(By.id("inputEmail3")).sendKeys("Jan");
        webDrv.findElement(By.id("inputPassword3")).sendKeys("Kowalski");
        webDrv.findElement(By.id("dataU")).sendKeys("10.01.2002");
        webDrv.findElement(By.id("rodzice")).click();
        //brak zaświadczenia lekarskiego
        webDrv.findElement(By.cssSelector("button")).click();
        webDrv.switchTo().alert().accept();
        webDrv.switchTo().alert().accept();
        webDrv.quit();
    }

    public static void testCase11(){
        WebDriver webDrv = new FirefoxDriver();
        //poniższy kod jest mniej lub bardziej opisany w metodzie testCase01 i już tak będzie do samego końca
        webDrv.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");
        webDrv.findElement(By.id("inputEmail3")).sendKeys("Jan");
        webDrv.findElement(By.id("inputPassword3")).sendKeys("Kowalski");
        webDrv.findElement(By.id("dataU")).sendKeys("10.01.2002");
        //brak zgody rodziców
        webDrv.findElement(By.id("lekarz")).click();
        webDrv.findElement(By.cssSelector("button")).click();
        webDrv.switchTo().alert().accept();
        webDrv.switchTo().alert().accept();
        webDrv.quit();
    }

    public static void testCase12(){
        WebDriver webDrv = new FirefoxDriver();
        //poniższy kod jest mniej lub bardziej opisany w metodzie testCase01 i już tak będzie do samego końca
        webDrv.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");
        webDrv.findElement(By.id("inputEmail3")).sendKeys("Jan");
        webDrv.findElement(By.id("inputPassword3")).sendKeys("Kowalski");
        webDrv.findElement(By.id("dataU")).sendKeys("10.01.2002");
        //brak zaświadczenia lekarskiego oraz zgody rodziców
        webDrv.findElement(By.cssSelector("button")).click();
        webDrv.switchTo().alert().accept();
        webDrv.switchTo().alert().accept();
        webDrv.quit();
    }

    public static void testCase13(){
        WebDriver webDrv = new FirefoxDriver();
        webDrv.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");
        webDrv.findElement(By.id("inputEmail3")).sendKeys("Jan");
        webDrv.findElement(By.id("inputPassword3")).sendKeys("Kowalski");
        webDrv.findElement(By.id("dataU")).sendKeys("10.01.2006");
        webDrv.findElement(By.id("rodzice")).click();
        webDrv.findElement(By.id("lekarz")).click();
        webDrv.findElement(By.cssSelector("button")).click();
        webDrv.switchTo().alert().accept();
        webDrv.switchTo().alert().accept();
        webDrv.quit();
    }

    public static void testCase14(){
        WebDriver webDrv = new FirefoxDriver();
        //poniższy kod jest mniej lub bardziej opisany w metodzie testCase01 i już tak będzie do samego końca
        webDrv.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");
        webDrv.findElement(By.id("inputEmail3")).sendKeys("Jan");
        webDrv.findElement(By.id("inputPassword3")).sendKeys("Kowalski");
        webDrv.findElement(By.id("dataU")).sendKeys("10.01.2006");
        webDrv.findElement(By.id("rodzice")).click();
        //brak zaświadczenia lekarskiego
        webDrv.findElement(By.cssSelector("button")).click();
        webDrv.switchTo().alert().accept();
        webDrv.switchTo().alert().accept();
        webDrv.quit();
    }

    public static void testCase15(){
        WebDriver webDrv = new FirefoxDriver();
        //poniższy kod jest mniej lub bardziej opisany w metodzie testCase01 i już tak będzie do samego końca
        webDrv.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");
        webDrv.findElement(By.id("inputEmail3")).sendKeys("Jan");
        webDrv.findElement(By.id("inputPassword3")).sendKeys("Kowalski");
        webDrv.findElement(By.id("dataU")).sendKeys("10.01.2006");
        //brak zgody rodziców
        webDrv.findElement(By.id("lekarz")).click();
        webDrv.findElement(By.cssSelector("button")).click();
        webDrv.switchTo().alert().accept();
        webDrv.switchTo().alert().accept();
        webDrv.quit();
    }

    public static void testCase16(){
        WebDriver webDrv = new FirefoxDriver();
        //poniższy kod jest mniej lub bardziej opisany w metodzie testCase01 i już tak będzie do samego końca
        webDrv.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");
        webDrv.findElement(By.id("inputEmail3")).sendKeys("Jan");
        webDrv.findElement(By.id("inputPassword3")).sendKeys("Kowalski");
        webDrv.findElement(By.id("dataU")).sendKeys("10.01.2006");
        //brak zaświadczenia lekarskiego oraz zgody rodziców
        webDrv.findElement(By.cssSelector("button")).click();
        webDrv.switchTo().alert().accept();
        webDrv.switchTo().alert().accept();
        webDrv.quit();
    }

    public static void testCase17(){
        WebDriver webDrv = new FirefoxDriver();
        //poniższy kod jest mniej lub bardziej opisany w metodzie testCase01 i już tak będzie do samego końca
        webDrv.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");
        webDrv.findElement(By.id("inputEmail3")).sendKeys("Jan");
        webDrv.findElement(By.id("inputPassword3")).sendKeys("Kowalski");
        webDrv.findElement(By.id("dataU")).sendKeys("10.01.1955");
        //brak zaświadczenia lekarsiego
        webDrv.findElement(By.cssSelector("button")).click();
        webDrv.switchTo().alert().accept();
        webDrv.switchTo().alert().accept();
        webDrv.quit();
    }

    public static void testCase18(){
        WebDriver webDrv = new FirefoxDriver();
        //poniższy kod jest mniej lub bardziej opisany w metodzie testCase01 i już tak będzie do samego końca
        webDrv.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");
        webDrv.findElement(By.id("inputEmail3")).sendKeys("Jan");
        webDrv.findElement(By.id("inputPassword3")).sendKeys("Kowalski");
        webDrv.findElement(By.id("dataU")).sendKeys("10.01.2006");
        webDrv.findElement(By.id("lekarz")).click();
        webDrv.findElement(By.cssSelector("button")).click();
        webDrv.switchTo().alert().accept();
        webDrv.switchTo().alert().accept();
        webDrv.quit();
    }

    public static void testCase19(){
        WebDriver webDrv = new FirefoxDriver();
        //poniższy kod jest mniej lub bardziej opisany w metodzie testCase01 i już tak będzie do samego końca
        webDrv.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");
        webDrv.findElement(By.id("inputEmail3")).sendKeys("Jan");
        webDrv.findElement(By.id("inputPassword3")).sendKeys("Kowalski");
        webDrv.findElement(By.id("dataU")).sendKeys("10.01.2002");
        //brak zaświadczenia lekarsiego
        webDrv.findElement(By.cssSelector("button")).click();
        webDrv.switchTo().alert().accept();
        webDrv.switchTo().alert().accept();
        webDrv.quit();
    }

    public static void testCase20(){
        WebDriver webDrv = new FirefoxDriver();
        //poniższy kod jest mniej lub bardziej opisany w metodzie testCase01 i już tak będzie do samego końca
        webDrv.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");
        webDrv.findElement(By.id("inputEmail3")).sendKeys("Jan");
        webDrv.findElement(By.id("inputPassword3")).sendKeys("Kowalski");
        webDrv.findElement(By.id("dataU")).sendKeys("10.01.2002");
        webDrv.findElement(By.id("lekarz")).click();
        webDrv.findElement(By.cssSelector("button")).click();
        webDrv.switchTo().alert().accept();
        webDrv.switchTo().alert().accept();
        webDrv.quit();
    }

    public static void testCase21(){
        WebDriver webDrv = new FirefoxDriver();
        //poniższy kod jest mniej lub bardziej opisany w metodzie testCase01 i już tak będzie do samego końca
        webDrv.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");
        webDrv.findElement(By.id("inputEmail3")).sendKeys("Jan");
        webDrv.findElement(By.id("inputPassword3")).sendKeys("Kowalski");
        webDrv.findElement(By.id("dataU")).sendKeys("10.01.1955");
        //brak zaświadczenia lekarsiego
        webDrv.findElement(By.cssSelector("button")).click();
        webDrv.switchTo().alert().accept();
        webDrv.switchTo().alert().accept();
        webDrv.quit();
    }

    public static void testCase22(){
        WebDriver webDrv = new FirefoxDriver();
        //poniższy kod jest mniej lub bardziej opisany w metodzie testCase01 i już tak będzie do samego końca
        webDrv.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");
        webDrv.findElement(By.id("inputEmail3")).sendKeys("Jan");
        webDrv.findElement(By.id("inputPassword3")).sendKeys("Kowalski");
        webDrv.findElement(By.id("dataU")).sendKeys("10.01.1955");
        webDrv.findElement(By.id("lekarz")).click();
        webDrv.findElement(By.cssSelector("button")).click();
        webDrv.switchTo().alert().accept();
        webDrv.switchTo().alert().accept();
        webDrv.quit();
    }

    public static void testCase23(){
        WebDriver webDrv = new FirefoxDriver();
        //poniższy kod jest mniej lub bardziej opisany w metodzie testCase01 i już tak będzie do samego końca
        webDrv.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");
        webDrv.findElement(By.id("inputEmail3")).sendKeys("Jan");
        webDrv.findElement(By.id("inputPassword3")).sendKeys("Kowalski");
        webDrv.findElement(By.id("dataU")).sendKeys("10.01.1954");
        //brak zaświadczenia lekarsiego
        webDrv.findElement(By.cssSelector("button")).click();
        webDrv.switchTo().alert().accept();
        webDrv.switchTo().alert().accept();
        webDrv.quit();
    }

    public static void testCase24(){
        WebDriver webDrv = new FirefoxDriver();
        //poniższy kod jest mniej lub bardziej opisany w metodzie testCase01 i już tak będzie do samego końca
        webDrv.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");
        webDrv.findElement(By.id("inputEmail3")).sendKeys("Jan");
        webDrv.findElement(By.id("inputPassword3")).sendKeys("Kowalski");
        webDrv.findElement(By.id("dataU")).sendKeys("10.01.1954");
        webDrv.findElement(By.id("lekarz")).click();
        webDrv.findElement(By.cssSelector("button")).click();
        webDrv.switchTo().alert().accept();
        webDrv.switchTo().alert().accept();
        webDrv.quit();
    }

    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\milos\\Downloads\\geckodriver\\geckodriver.exe");
        testCase01();
        testCase02();
        testCase03();
        testCase04();
        testCase05();
        testCase06();
        testCase07();
        testCase08();
        testCase09();
        testCase10();
        testCase11();
        testCase12();
        testCase13();
        testCase14();
        testCase15();
        testCase16();
        testCase17();
        testCase18();
        testCase19();
        testCase20();
        testCase21();
        testCase22();
        testCase23();
        testCase24();
    }
}
