import command.AddCommand;
import command.Command;
import command.CommandManager;
import command.RemoveCommand;
import iterator.BreadthFirstIterator;
import iterator.DepthFirstIterator;
import iterator.LightNodeIterator;
import lightHTML.LightElementNode;
import lightHTML.LightNode;
import lightHTML.LightTextNode;
import state.HiddenState;
import state.LightElementNodeWithState;
import state.VisibleState;
import visitor.RenderVisitor;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {


        //template method
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


        //iterator
        LightElementNode div2 = new LightElementNode("div", "open", Arrays.asList("container"));

        LightElementNode p = new LightElementNode("p", "open", Collections.emptyList());
        LightTextNode text2 = new LightTextNode("Hello, World!");
        p.add(text);

        LightElementNode span2 = new LightElementNode("span", "open", Collections.emptyList());
        LightTextNode spanText2 = new LightTextNode("This is a span");
        span.add(spanText);

        div.add(p);
        div.add(span2);

        System.out.println("Depth-First Traversal:");
        LightNodeIterator dfsIterator = new DepthFirstIterator(div);
        while (dfsIterator.hasNext()) {
            LightNode node = dfsIterator.next();
            System.out.println(node.outerHtml());
        }
        
        System.out.println("Breadth-First Traversal:");
        LightNodeIterator bfsIterator = new BreadthFirstIterator(div);
        while (bfsIterator.hasNext()) {
            LightNode node = bfsIterator.next();
            System.out.println(node.outerHtml());
        }

        //command
        LightElementNode div3 = new LightElementNode("div", "open", Arrays.asList("container"));
        LightElementNode p3 = new LightElementNode("p", "open", Collections.emptyList());
        LightTextNode text3 = new LightTextNode("Hello, World!");
        p3.add(text3);

        CommandManager commandManager = new CommandManager();


        Command addCommand = new AddCommand(div3, p3);
        commandManager.executeCommand(addCommand);

        System.out.println("HTML після додавання:");
        System.out.println(div3.outerHtml());

        commandManager.cancel();

        System.out.println("HTML після скасування додавання:");
        System.out.println(div3.outerHtml());

        Command removeCommand = new RemoveCommand(div3, p3);
        commandManager.executeCommand(removeCommand);

        System.out.println("HTML після видалення:");
        System.out.println(div3.outerHtml());

        commandManager.cancel();

        System.out.println("HTML після скасування видалення:");
        System.out.println(div3.outerHtml());



        //state
        LightElementNodeWithState div4 = new LightElementNodeWithState("div", "open", Arrays.asList("container"));
        LightElementNodeWithState span4 = new LightElementNodeWithState("span", "open", Collections.emptyList());

        div4.add(span4);

        div4.render();

        div4.setState(new HiddenState());

        div4.render();

        div4.setState(new VisibleState());

        div4.render();

        //visitor
        LightElementNode div5 = new LightElementNode("div", "open", Arrays.asList("container"));
        LightTextNode text5 = new LightTextNode("Hello, World!");
        div.add(text5);
        
        RenderVisitor renderVisitor = new RenderVisitor();

        div5.accept(renderVisitor);

    }
}