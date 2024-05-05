import lightHTML.LightElementNode;
import lightHTML.LightTextNode;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        LightElementNode div = new LightElementNode("div", "open", Arrays.asList("container"));

        LightElementNode paragraph = new LightElementNode("p", "open", Collections.emptyList());
        LightTextNode text = new LightTextNode("Hello, World!");
        paragraph.add(text);

        div.add(paragraph);


        LightElementNode span = new LightElementNode("span", "open", Collections.emptyList());
        LightTextNode spanText = new LightTextNode("This is a span");
        span.add(spanText);

        div.add(span);

        System.out.println("Outer HTML of div:");
        System.out.println(div.outerHtml());
        
        div.remove(span);

        System.out.println("Outer HTML of div after removal:");
        System.out.println(div.outerHtml());
    }
}