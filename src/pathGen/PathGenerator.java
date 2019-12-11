package pathGen;
import openjava.ojc.CommandArguments;
import openjava.ojc.CustomCompiler;

public class PathGenerator {
    public void gen(String[]args){
        CommandArguments arguments;
        try{
            arguments = new CommandArguments(args);
        }
        catch(Exception e){
            return;
        }
        new CustomCompiler(arguments).run();
    }
}