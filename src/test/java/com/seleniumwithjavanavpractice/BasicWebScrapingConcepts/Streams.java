package com.seleniumwithjavanavpractice.BasicWebScrapingConcepts;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Streams {
    public static WebDriver driver;
    public static void main(String[] args) {
        driver = new ChromeDriver();

        driver.get("https://www.flipkart.com/");
        List<WebElement> linkList = driver.findElements(By.tagName("a"));

        // stream is to perfome a kind of action in a array list
        // linkList.stream().forEach(e -> System.out.println(e.getText())); //prints all the link





        //here fist filter out those text which is empth
        // then print the data
        // this will be beneficial for small amount of data as it will take time
        // linkList.stream()
        //         .filter(e -> !e.getText().isEmpty())
        //         .forEach(e -> System.out.println(e.getText()));
        
        


        // add data to another list
        // List<String> flipkartList = new ArrayList<String>();
        // linkList.stream()
        //         .filter(e -> !e.getText().isEmpty())
        //         .filter(e -> e.getText().startsWith("Flipkart"))
        //         .forEach(e -> flipkartList.add(e.getText()));
        // System.out.println(flipkartList);




        // using Collectors.toList()
        List<String> flipkartList = new ArrayList<String>();
        List<WebElement> flipkartElementList = 
                            linkList.stream()
                                    .filter(e -> !e.getText().isEmpty())
                                    .filter(e -> e.getText().startsWith("Flipkart"))
                                    .collect(Collectors.toList());

        flipkartElementList.forEach(e ->flipkartList.add(e.getText()));
        System.out.println(flipkartList);

        driver.quit();
    }
}
