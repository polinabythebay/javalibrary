import org.apache.commons.cli.BasicParser;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionBuilder;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

/*
 * @author: psoshnin
 * @date created: August 1, 2013
 * @date modified: August 1, 2013
 * @purpose: Utilize Apache Common Options for the command line 
 * This Class methodically lays out an example of using Options from Apache Commons, 
 * including how to create options with multiple arguments 
 */
public class Options {
  
	private static Options createOptions() {

        Options options = new Options();

        //Create an Option with no Arguments
		Option help = new Option("h", "help", false, "access help options");
	    options.addOption(help);

	    //Create an Option with Arguments
	    @SuppressWarnings("static-access")
		Option generate  = OptionBuilder.withArgName("Arg1=thisisArg1 "
				+ "\nArg2=thisisArg2 "
				+ "\nArg3=thisisArg3 "
				+ "\nArg4=thisisArg4"
				+ "\nArg5=thisisArg5"
				+ "\nArg6=thisisArg6") 
				.hasArgs(4)
                .withValueSeparator()
                .withDescription("this is the description of your option")
                .create("g");
	    
	    options.addOption(generate);
	    
	

        return options;
    }

private static void showHelp(Options options) {
        HelpFormatter h = new HelpFormatter();
        h.printHelp("help", options);
        System.exit(-1);
    }
	
public static void main(String args[]){

	 
	Options options = createOptions();

	CommandLineParser parser = new BasicParser();
	CommandLine cmd;
	try{
		cmd = parser.parse(options, args);

		if(cmd.hasOption("g")){
			
			String[] searchArgs = cmd.getOptionValues("g");
			//Execute Option G
		}

	 else if(cmd.hasOption("h")){
		//Execute Option H
		showHelp(options);
		} else {
			System.out.println("Reached else");
			//	showHelp(options);
		}

	}
	catch (ParseException pe){ 	
	//showHelp(options); 
	System.err.println("Parse Exception");
	return; 
	}
}

}
