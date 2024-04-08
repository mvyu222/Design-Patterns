import adapter.FileLoggerAdapter;
import adapter.FileWriter;
import adapter.SimpleFileWriter;
import adapter.Logger;
import bridge.*;
import composite.LightElementNode;
import composite.LightNode;
import composite.LightTextNode;
import decorator.*;
import flyweight.LightHtmlElement;
import flyweight.TextHelper;
import proxy.SmartTextChecker;
import proxy.SmartTextReader;
import proxy.SmartTextReaderLocker;
import proxy.TextReader;

import java.net.URL;
import java.util.Arrays;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //adapter
        FileWriter fileWriter = new SimpleFileWriter();

        Logger fileLogger = new FileLoggerAdapter(fileWriter);

        fileLogger.log("This is a log message");
        fileLogger.error("This is an error message");
        fileLogger.warn("This is a warning message");


        //decoration
        Hero warrior = new Warrior();
        Inventory decoratedWarrior = new Artifacts(new Weapon(new Clothes(warrior)));
        decoratedWarrior.attack();
        decoratedWarrior.equip();

        System.out.println("--------------------------");

        Hero mage = new Mage();
        Inventory decoratedMage = new Clothes(new Artifacts(new Weapon(mage)));
        decoratedMage.attack();
        decoratedMage.equip();

        System.out.println("--------------------------");

        Hero paladin = new Paladin();
        Inventory decoratedPaladin = new Weapon(new Clothes(new Artifacts(paladin)));
        decoratedPaladin.attack();
        decoratedPaladin.equip();

        //bridge
        Renderer vectorRenderer = new VectorRenderer();
        Renderer rasterRenderer = new RasterRenderer();

        Shape circle = new Circle(vectorRenderer);
        circle.draw();

        Shape square = new Square(rasterRenderer);
        square.draw();

        Shape triangle = new Triangle(vectorRenderer);
        triangle.draw();

        // Запуск SmartTextChecker
        TextReader checker = new SmartTextChecker();
        try {
            String[][] text = checker.readText("example.txt");
            for (String[] line : text) {
                for (String ch : line) {
                    System.out.print(ch);
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Запуск SmartTextReaderLocker
        TextReader locker = new SmartTextReaderLocker(new SmartTextReader(), ".+\\.txt"); // Обмеження доступу до всіх .txt файлів
        try {
            String[][] text = locker.readText("example.txt");
            for (String[] line : text) {
                for (String ch : line) {
                    System.out.print(ch);
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        //composition
        LightElementNode root = new LightElementNode("div", "block", "open", new ArrayList<>());
        root.add(new LightTextNode("Hello "));

        List<String> spanCssClasses = Arrays.asList("highlight");
        ArrayList<String> spanCssClassesArrayList = new ArrayList<>(spanCssClasses);
        LightElementNode span = new LightElementNode("span", "inline", "close", spanCssClassesArrayList);
        span.add(new LightTextNode("world"));

        root.add(span);

        root.add(new LightTextNode("!"));

        System.out.println(root.outerHtml());

        //flyweight
        String bookText;
        try {
            bookText = new Scanner(new URL("https://www.gutenberg.org/cache/epub/1513/pg1513.txt").openStream(), "UTF-8").useDelimiter("\\A").next();
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        List<String> lines = TextHelper.splitTextIntoLines(bookText);
        List<LightHtmlElement> htmlElements = new ArrayList<>();

        for (String line : lines) {
            String elementType = TextHelper.determineElementType(line);
            LightHtmlElement element = new LightHtmlElement(elementType, line.trim());
            htmlElements.add(element);
        }

        StringBuilder htmlMarkupBuilder = new StringBuilder();
        for (LightHtmlElement element : htmlElements) {
            htmlMarkupBuilder.append(element.toString()).append("\n");
        }
        String htmlMarkup = htmlMarkupBuilder.toString();

        int totalSizeInMemory = 0;
        for (LightHtmlElement element : htmlElements) {
            totalSizeInMemory += element.calculateSizeInMemory();
        }

        System.out.println(htmlMarkup);
        System.out.println("Size in process memory for the entire layout tree: " + totalSizeInMemory + " bytes");

    }


}
