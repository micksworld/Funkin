package world.micks;

import javax.security.auth.login.LoginException;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import world.micks.command.FNFCommand;

public class Funkin {

	private static JDA api;
	public static JDA getApi() { return api; }
	
	public static void main(String[] args) throws LoginException, InterruptedException {
		
		api = JDABuilder.createDefault(Key.get())
				
				.setActivity(Activity.playing("Friday Night Funkin'"))
				
				.addEventListeners(new FNFCommand())
				
				.build();
		
		api.awaitReady();
		
	}
	
}
