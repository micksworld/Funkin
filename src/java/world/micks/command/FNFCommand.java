package world.micks.command;

import java.time.Instant;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.entities.MessageEmbed;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class FNFCommand extends ListenerAdapter {

	@Override public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
		
		Message message = event.getMessage();
		MessageChannel channel = event.getChannel();
		String content = message.getContentRaw();
		String[] args = content.split(" ");
		
		if(content.startsWith("/fnf")) {
			
			if(args.length == 1) {
				
				MessageEmbed embed = new EmbedBuilder()
						
						.setTitle("Friday Night Funkin'", "https://fridaynightfunkin.fandom.com/wiki/Friday_Night_Funkin%27_Wiki")
						.setThumbnail("https://micks.world/cdn/fnf/logo.gif")
						.setColor(event.getGuild().getSelfMember().getColorRaw())
						.setDescription("<a:crown:807836415782027313> **Friday Night Funkin'**\nFriday Night Funkin' (typically stylized in all caps) is a rhythm game programmed by Ninjamuffin99 with a soundtrack by Kawai Sprite and artwork by PhantomArcade and evilsk8r. It can be downloaded on Itch.io for Windows, MacOS and Linux devices or played on Newgrounds for free.\n\nFriday Night Funkin' is drawn and animated in a chibi-like manner with an art style inspired by graffiti street art. The game features multiple weeks where the player is confronted with different opponents with multiple songs. ")
						.setFooter("Requested by " + event.getAuthor().getAsTag())
						.setTimestamp(Instant.ofEpochMilli(System.currentTimeMillis()))
						
						.build();
				
				channel.sendMessage(embed).queue();
				
			} else if(args.length == 2) {
				
				String argument = args[1];
				
				switch(argument) {
				
					case "help": {
					
						MessageEmbed embed = new EmbedBuilder()
								
								.setTitle("Friday Night Funkin'", "https://fridaynightfunkin.fandom.com/wiki/Friday_Night_Funkin%27_Wiki")
								.setThumbnail("https://micks.world/cdn/fnf/logo.gif")
								.setFooter("Requested by " + event.getAuthor().getAsTag())
								.setColor(event.getGuild().getSelfMember().getColorRaw())
								.setTimestamp(Instant.ofEpochMilli(System.currentTimeMillis()))
								.setDescription("<a:crown:807836415782027313> **Help**\n ``/fnf c:<character>`` - Search about a specific character\n``/fnf s:<song>`` - Search about a specific level\n``/fnf w:<week>`` - Search about a specific week")
								
								.build();
						
						channel.sendMessage(embed).queue();
						
						return;
					}
					
					case "c:" : {
						
						MessageEmbed embed = new EmbedBuilder()
								
								.setTitle("Friday Night Funkin'", "https://fridaynightfunkin.fandom.com/wiki/Friday_Night_Funkin%27_Wiki")
								.setThumbnail("https://micks.world/cdn/fnf/logo.gif")
								.setDescription("<a:crown:807836415782027313> **Character Search**\nPlease input a character, e.g: ``c:boyfriend``")
								.setColor(event.getGuild().getSelfMember().getColorRaw())
								.setTimestamp(Instant.ofEpochMilli(System.currentTimeMillis()))
								.setFooter("Requested by " + event.getAuthor().getAsTag())
								
								.build();
						
						channel.sendMessage(embed).queue();
						return;
					}
					
					case "s:" : {
						
						MessageEmbed embed = new EmbedBuilder()
								
								.setTitle("Friday Night Funkin'", "https://fridaynightfunkin.fandom.com/wiki/Friday_Night_Funkin%27_Wiki")
								.setThumbnail("https://micks.world/cdn/fnf/logo.gif")
								.setDescription("<a:crown:807836415782027313> **Song Search**\nPlease input a song, e.g: ``s:tutorial``")
								.setColor(event.getGuild().getSelfMember().getColorRaw())
								.setTimestamp(Instant.ofEpochMilli(System.currentTimeMillis()))
								.setFooter("Requested by " + event.getAuthor().getAsTag())
								
								.build();
						
						channel.sendMessage(embed).queue();
						return;
					}
					
					case "w:" : {
						
						MessageEmbed embed = new EmbedBuilder()
								
								.setTitle("Friday Night Funkin'", "https://fridaynightfunkin.fandom.com/wiki/Friday_Night_Funkin%27_Wiki")
								.setThumbnail("https://micks.world/cdn/fnf/logo.gif")
								.setDescription("<a:crown:807836415782027313> **Week Search**\nPlease input a week, e.g: ``w:1`` or even ``w:daddy_dearest``")
								.setColor(event.getGuild().getSelfMember().getColorRaw())
								.setTimestamp(Instant.ofEpochMilli(System.currentTimeMillis()))
								.setFooter("Requested by " + event.getAuthor().getAsTag())
								
								.build();
						
						channel.sendMessage(embed).queue();
						
						return;
					}
					
					case "c:boyfriend" : {
						
						MessageEmbed embed = new EmbedBuilder()
								
								.setTitle("Friday Night Funkin'", "https://fridaynightfunkin.fandom.com/wiki/Friday_Night_Funkin%27_Wiki")
								.setThumbnail("https://micks.world/cdn/fnf/boyfriend/boyfriend.gif")
								.setDescription("<a:crown:807836415782027313> **Boyfriend**\nBoyfriend is the protagonist of Friday Night Funkin'. He is on a mission to gain approval to date his Girlfriend, but must sing-off against her Father and many other characters that stand in his way. \n\n **Other textures**")
								.setColor(event.getGuild().getSelfMember().getColorRaw())
								.setTimestamp(Instant.ofEpochMilli(System.currentTimeMillis()))
								.setFooter("Requested by " + event.getAuthor().getAsTag())
								
								.addField("Xmas", "[Click](https://micks.world/cdn/fnf/boyfriend/xmasboyfriend.gif)", true)
								.addField("Pixel", "[Click](https://micks.world/cdn/fnf/boyfriend/pixelboyfriend.gif)", true)
								.addField("Do Better", "[Click](https://micks.world/cdn/fnf/boyfriend/dobetterboyfriend.gif)", true)
								.addField("Rapping", "[Click](https://micks.world/cdn/fnf/boyfriend/rappingboyfriend.gif)", true)
								.addField("Windy", "[Click](https://micks.world/cdn/fnf/boyfriend/windyboyfriend.gif)", true)
								.addField("Icon", "[Click](https://micks.world/cdn/fnf/boyfriend/iconboyfriend.png)", true)
								
								.build();
						
						channel.sendMessage(embed).queue();
						return;
					}
					
					case "c:girlfriend" : {
						
						MessageEmbed embed = new EmbedBuilder()
								
								.setTitle("Friday Night Funkin'", "https://fridaynightfunkin.fandom.com/wiki/Friday_Night_Funkin%27_Wiki")
								.setDescription("Girlfriend is the Boyfriend's love interest and the daughter of Daddy Dearest and The Mom. She is usually seen sitting on top of the speakers, bopping her head to the tempo of the music and cheering you on. During the Tutorial, she teaches you how to play and keeps track of your combos throughout the game.\n\n **Other textures**")
								.setThumbnail("https://micks.world/cdn/fnf/girlfriend/girlfriend.gif")
								.setColor(event.getGuild().getSelfMember().getColorRaw())
								.setTimestamp(Instant.ofEpochMilli(System.currentTimeMillis()))
								.setFooter("Requested by " + event.getAuthor().getAsTag())
								
								.addField("Cheer", "[Click](https://micks.world/cdn/fnf/girlfriend/cheergirlfriend.gif)", true)
								.addField("Icon", "[Click](https://micks.world/cdn/fnf/girlfriend/icongirlfriend.gif)", true)
								.addField("Pixel", "[Click](https://micks.world/cdn/fnf/girlfriend/pixelgirlfriend.png)", true)
								.addField("XMAS", "[Click](https://micks.world/cdn/fnf/girlfriend/xmasgirlfriend.png)", true)
								.addBlankField(true)
								.addBlankField(true)
								
								.build();
						
						channel.sendMessage(embed).queue();
						return;
					}
					
					/**
					 * WEEK 0
					 */
					
					case "s:tutorial" : {
						
						MessageEmbed embed = new EmbedBuilder()
								
								.setTitle("Friday Night Funkin'", "https://fridaynightfunkin.fandom.com/wiki/Friday_Night_Funkin%27_Wiki")
								.setDescription("<a:crown:807836415782027313> **Tutorial**\nTutorial is the first track of the game. As the name implies, the track helps you learn the basics on how to play. It was composed by Kawai Sprite and released on the 1st of November, 2020. Girlfriend takes the role of the antagonist for this level to guide the player.")
								.setThumbnail("https://micks.world/cdn/fnf/girlfriend/girlfriend.gif")
								.setColor(event.getGuild().getSelfMember().getColorRaw())
								.setTimestamp(Instant.ofEpochMilli(System.currentTimeMillis()))
								.setFooter("Requested by " + event.getAuthor().getAsTag())
								
								.addField("Location", "The Stage", true)
								.addField("Performers", "Girldfriend", true)
								.addField("Song length", "[1:08](https://www.youtube.com/watch?v=V-7nSV5M3Bk)", true)
								
								.build();
						
						channel.sendMessage(embed).queue();
						return;
						
					}
					
					/**
					 * WEEK 1
					 */
					
					case "w:daddydearest" : {
						
					}
					
					case "w:daddy_dearest" : {
						
					}
					
					case "w:1" : {
						
						MessageEmbed embed = new EmbedBuilder()
								
								.setTitle("Friday Night Funkin'", "https://fridaynightfunkin.fandom.com/wiki/Friday_Night_Funkin%27_Wiki")
								.setDescription("<a:crown:807836415782027313> **Daddy Dearest**\nWeek 1, titled Daddy Dearest, is the first set of levels in Friday Night Funkin'. ")
								.setThumbnail("https://micks.world/cdn/fnf/daddydearest/daddydearest.png")
								.setColor(event.getGuild().getSelfMember().getColorRaw())
								.setTimestamp(Instant.ofEpochMilli(System.currentTimeMillis()))
								.setFooter("Requested by " + event.getAuthor().getAsTag())
								
								.addField("Bopeebo", "[1:22](https://www.youtube.com/watch?v=V60N12UFNN4)", true)
								.addField("Fresh", "[1:23](https://www.youtube.com/watch?v=mx82b-3A--Q)", true)
								.addField("Dadbattle", "[1:27](https://www.youtube.com/watch?v=w0WyKTSuX4U)", true)
								
								.build();
						
						channel.sendMessage(embed).queue();
						return;
						
					}
					
					case "s:bopeebo" : {
						
						MessageEmbed embed = new EmbedBuilder()
								
								.setTitle("Friday Night Funkin'", "https://fridaynightfunkin.fandom.com/wiki/Friday_Night_Funkin%27_Wiki")
								.setDescription("<a:crown:807836415782027313> **Bopeebo**\nBopeebo is the first track of Week 1. It was composed by Kawai Sprite and released on the 6th of October, 2020. The antagonist for this level is Daddy Dearest. ")
								.setThumbnail("https://micks.world/cdn/fnf/daddydearest/daddydearest.gif")
								.setColor(event.getGuild().getSelfMember().getColorRaw())
								.setTimestamp(Instant.ofEpochMilli(System.currentTimeMillis()))
								.setFooter("Requested by " + event.getAuthor().getAsTag())
								
								.addField("Location", "The Stage", true)
								.addField("Performers", "Pico", true)
								.addField("Song length", "[1:22](https://www.youtube.com/watch?v=V60N12UFNN4)", true)
								
								.build();
						
						channel.sendMessage(embed).queue();
						return;
					}
					
					case "s:fresh" : {
						MessageEmbed embed = new EmbedBuilder()
								
								.setTitle("Friday Night Funkin'", "https://fridaynightfunkin.fandom.com/wiki/Friday_Night_Funkin%27_Wiki")
								.setDescription("<a:crown:807836415782027313> **Fresh**\nFresh is the second track of Week 1. It was composed by Kawai Sprite and released on the 6th of October, 2020. The antagonist for this level is Daddy Dearest. ")
								.setThumbnail("https://micks.world/cdn/fnf/daddydearest/daddydearest.gif")
								.setColor(event.getGuild().getSelfMember().getColorRaw())
								.setTimestamp(Instant.ofEpochMilli(System.currentTimeMillis()))
								.setFooter("Requested by " + event.getAuthor().getAsTag())
								
								.addField("Location", "The Stage", true)
								.addField("Performers", "Pico", true)
								.addField("Song length", "[1:27](https://www.youtube.com/watch?v=w0WyKTSuX4U)", true)
								
								.build();
						
						channel.sendMessage(embed).queue();
						return;
					}
					
					case "s:dadbattle" : {
						
						MessageEmbed embed = new EmbedBuilder()
								
								.setTitle("Friday Night Funkin'", "https://fridaynightfunkin.fandom.com/wiki/Friday_Night_Funkin%27_Wiki")
								.setDescription("<a:crown:807836415782027313> **Dadbattle**\nDadbattle is the third and final track of Week 1. It was composed by Kawai Sprite and released on the 1st of November, 2020. ")
								.setThumbnail("https://micks.world/cdn/fnf/daddydearest/daddydearest.gif")
								.setColor(event.getGuild().getSelfMember().getColorRaw())
								.setTimestamp(Instant.ofEpochMilli(System.currentTimeMillis()))
								.setFooter("Requested by " + event.getAuthor().getAsTag())
								
								.addField("Location", "The Stage", true)
								.addField("Performers", "Pico", true)
								.addField("Song length", "[1:23](https://www.youtube.com/watch?v=mx82b-3A--Q)", true)
								
								.build();
						
						channel.sendMessage(embed).queue();
						return;
					}
					
					/**
					 * WEEK 2
					 */
					
					case "c:skid" : {
						
					}
					
					case "c:pump" : {
						
					}
					
					case "c:skidpump" : {
						
					}
					
					case "c:skid_and_pump" : {
						
					}
					
					case "c:skidandpump" : {
						
						MessageEmbed embed = new EmbedBuilder()
								
								.setTitle("Friday Night Funkin'", "https://fridaynightfunkin.fandom.com/wiki/Friday_Night_Funkin%27_Wiki")
								.setDescription("<a:crown:807836415782027313> **Skid And Pump**\nSkid and Pump are the antagonists of Week 2. Their songs are Spookeez and South. They are the 1st guest characters for Friday Night Funkin’.")
								.setThumbnail("https://micks.world/cdn/fnf/skidpump/skidpump.gif")
								.setColor(event.getGuild().getSelfMember().getColorRaw())
								.setTimestamp(Instant.ofEpochMilli(System.currentTimeMillis()))
								.setFooter("Requested by " + event.getAuthor().getAsTag())
								
								
								.build();
						
						channel.sendMessage(embed).queue();
						return;
					}
					
					case "s:spookeez" : {
						
						MessageEmbed embed = new EmbedBuilder()
								
								.setTitle("Friday Night Funkin'", "https://fridaynightfunkin.fandom.com/wiki/Friday_Night_Funkin%27_Wiki")
								.setDescription("<a:crown:807836415782027313> **Spookez**\nSpookeez is the first track of Week 2. It was composed by Kawai Sprite and released on the 1st of November, 2020. The antagonists for this level are Skid and Pump. ")
								.setThumbnail("https://micks.world/cdn/fnf/skidpump/skidpump.gif")
								.setColor(event.getGuild().getSelfMember().getColorRaw())
								.setTimestamp(Instant.ofEpochMilli(System.currentTimeMillis()))
								.setFooter("Requested by " + event.getAuthor().getAsTag())
								
								.addField("Location", "The Spooky House", true)
								.addField("Performers", "Pico", true)
								.addField("Song length", "[1:41](https://www.youtube.com/watch?v=EiNwUpco4OI)", true)
								
								.build();
						
						channel.sendMessage(embed).queue();
						return;
					}
					
					case "s:south" : {
						
						MessageEmbed embed = new EmbedBuilder()
								
								.setTitle("Friday Night Funkin'", "https://fridaynightfunkin.fandom.com/wiki/Friday_Night_Funkin%27_Wiki")
								.setDescription("<a:crown:807836415782027313> **South**\nSouth is the second and final track of Week 2. It was composed by Kawai Sprite and released on the 1st of November, 2020. The antagonists for this level are Skid and Pump. ")
								.setThumbnail("https://micks.world/cdn/fnf/skidpump/skidpump.gif")
								.setColor(event.getGuild().getSelfMember().getColorRaw())
								.setTimestamp(Instant.ofEpochMilli(System.currentTimeMillis()))
								.setFooter("Requested by " + event.getAuthor().getAsTag())
								
								.addField("Location", "The Spooky House", true)
								.addField("Performers", "Pico", true)
								.addField("Song length", "[1:29](https://www.youtube.com/watch?v=_Q7J97WD3Gg)", true)
								
								.build();
						
						channel.sendMessage(embed).queue();
						return;
					}
					
					case "w:2" : {
						
					}
					
					case "w:spooky" : {
						
					}
					
					/**
					 * WEEK 3
					 */
					
					case "c:pico" : {
						
						MessageEmbed embed = new EmbedBuilder()
								
								.setTitle("Friday Night Funkin'", "https://fridaynightfunkin.fandom.com/wiki/Friday_Night_Funkin%27_Wiki")
								.setDescription("<a:crown:807836415782027313> **Pico**\nPico is the antagonist of Week 3. His tracks include Pico, Philly and Blammed. He was teased alongside Tankman, Cassette Girl and Hank J. Wimbleton on the 15th of November 2020 and was added to the game with the release of Week 3 on the 11th of December, 2020. \n\n**Other textures**")
								.setThumbnail("https://micks.world/cdn/fnf/pico/pico.gif")
								.setColor(event.getGuild().getSelfMember().getColorRaw())
								.setTimestamp(Instant.ofEpochMilli(System.currentTimeMillis()))
								.setFooter("Requested by " + event.getAuthor().getAsTag())
								
								.addField("Do Better Pico", "[Click](https://micks.world/cdn/fnf/pico/dobetterpico.gif)", true)
								.addBlankField(true)
								.addBlankField(true)
								
								.build();
						
						channel.sendMessage(embed).queue();
						return;
					}
					
					case "s:pico" : {
						
						MessageEmbed embed = new EmbedBuilder()
								
								.setTitle("Friday Night Funkin'", "https://fridaynightfunkin.fandom.com/wiki/Friday_Night_Funkin%27_Wiki")
								.setDescription("<a:crown:807836415782027313> **Pico (Song)**\nPico is the first track of Week 3. It was composed by Kawai Sprite and released on the 11th of December, 2020. The antagonist for this level is Pico. ")
								.setColor(event.getGuild().getSelfMember().getColorRaw())
								.setThumbnail("https://micks.world/cdn/fnf/pico/pico.gif")
								.setTimestamp(Instant.ofEpochMilli(System.currentTimeMillis()))
								.setFooter("Requested by " + event.getAuthor().getAsTag())
								
								.addField("Location", "Philadelphia", true)
								.addField("Performers", "Pico", true)
								.addField("Song length", "[1:25](https://www.youtube.com/watch?v=kaNuYpHWcac)", true)
								
								.build();
						
						channel.sendMessage(embed).queue();
						return;
					}
					
					case "s:philly" : {
						
					}
					
					case "s:philly_nice" : {
						
					}
					
					case "s:phillynice" : {
						
						MessageEmbed embed = new EmbedBuilder()
								
								.setTitle("Friday Night Funkin'", "https://fridaynightfunkin.fandom.com/wiki/Friday_Night_Funkin%27_Wiki")
								.setDescription("<a:crown:807836415782027313> **Philly Nice**\nPhilly Nice or Philly is the second track of Week 3. It was composed by Kawai Sprite and released on the 11th of December, 2020. ")
								.setColor(event.getGuild().getSelfMember().getColorRaw())
								.setThumbnail("https://micks.world/cdn/fnf/pico/pico.gif")
								.setTimestamp(Instant.ofEpochMilli(System.currentTimeMillis()))
								.setFooter("Requested by " + event.getAuthor().getAsTag())
								
								.addField("Location", "Philadelphia", true)
								.addField("Performers", "Pico", true)
								.addField("Song length", "[1:42](https://www.youtube.com/watch?v=fwZ8jLFFL1Y)", true)
								
								.build();
						
						channel.sendMessage(embed).queue();
						return;
					}
					
					case "s:blammed" : {
						
						MessageEmbed embed = new EmbedBuilder()
								
								.setTitle("Friday Night Funkin'", "https://fridaynightfunkin.fandom.com/wiki/Friday_Night_Funkin%27_Wiki")
								.setDescription("<a:crown:807836415782027313> **Blammed**\nBlammed is the third and final track of Week 3. It was composed by Kawai Sprite and released on the 11th of December, 2020. ")
								.setColor(event.getGuild().getSelfMember().getColorRaw())
								.setThumbnail("https://micks.world/cdn/pico/pico.gif")
								.setTimestamp(Instant.ofEpochMilli(System.currentTimeMillis()))
								.setFooter("Requested by " + event.getAuthor().getAsTag())
								
								.addField("Location", "Philadelphia", true)
								.addField("Performers", "Pico", true)
								.addField("Song length", "[1:47](https://www.youtube.com/watch?v=aQ2tXk-2UEg)", true)
								
								.build();
						
						channel.sendMessage(embed).queue();
						return;
					}
					
					case "w:3" : {
						
					}
					
					case "w:pico" : {
						
						MessageEmbed embed = new EmbedBuilder()
								
								.setTitle("Friday Night Funkin'", "https://fridaynightfunkin.fandom.com/wiki/Friday_Night_Funkin%27_Wiki")
								.setDescription("<a:crown:807836415782027313> **Pico (Week)**\nWeek 3, titled Pico, is the third set of levels in Friday Night Funkin'. It was released on the 11th of December, 2020. ")
								.setThumbnail("https://micks.world/cdn/fnf/pico/stage.png")
								.setColor(event.getGuild().getSelfMember().getColorRaw())
								.setTimestamp(Instant.ofEpochMilli(System.currentTimeMillis()))
								.setFooter("Requested by " + event.getAuthor().getAsTag())
								
								.addField("Pico", "[1:25](https://www.youtube.com/watch?v=kaNuYpHWcac)", true)
								.addField("Philly Nice", "[1:42](https://www.youtube.com/watch?v=fwZ8jLFFL1Y)", true)
								.addField("Blammed", "[1:47](https://www.youtube.com/watch?v=aQ2tXk-2UEg)", true)
								
								.build();
						
						channel.sendMessage(embed).queue();
						return;
					}
					
					/**
					 * WEEK 4
					 */
					
					case "c:mom" : {
						/** leave empty */
					}
					
					case "c:themom" : {
						/** leave empty */
					}
					
					case "c:mommydearest" : {
						
						MessageEmbed embed = new EmbedBuilder()
								
								.setTitle("Friday Night Funkin'", "https://fridaynightfunkin.fandom.com/wiki/Friday_Night_Funkin%27_Wiki")
								.setDescription("<a:crown:807836415782027313> **The Mom**\nThe Mom is the mother of Girlfriend and the wife of Daddy Dearest. She is the main antagonist of Week 4 and Week 5 along with Daddy Dearest. Her tracks during Week 4 include Satin Panties, High and M.I.L.F and her tracks for Week 5 are Cocoa and Eggnog. ")
								.setThumbnail("https://micks.world/cdn/fnf/themom/themom.gif")
								.setColor(event.getGuild().getSelfMember().getColorRaw())
								.setTimestamp(Instant.ofEpochMilli(System.currentTimeMillis()))
								.setFooter("Requested by " + event.getAuthor().getAsTag())
								
								.build();
						
						channel.sendMessage(embed).queue();
						return;
					}
					
					case "s:satin_panties" : {
						
						MessageEmbed embed = new EmbedBuilder()
								
								.setTitle("Friday Night Funkin'", "https://fridaynightfunkin.fandom.com/wiki/Friday_Night_Funkin%27_Wiki")
								.setDescription("<a:crown:807836415782027313> **Satin Panties**\nSatin Panties is the first track of Week 4. It was composed by Kawai Sprite and released on the 27th of December, 2020. The antagonist for this level is The Mom.")
								.setColor(event.getGuild().getSelfMember().getColorRaw())
								.setTimestamp(Instant.ofEpochMilli(System.currentTimeMillis()))
								.setFooter("Requested by " + event.getAuthor().getAsTag())
								
								.addField("Location", "Limousine", true)
								.addField("Performers", "The Mom", true)
								.addField("Song length", "[1:37](https://www.youtube.com/watch?v=YzJKStx9IyU)", true)
								
								.build();
						
						channel.sendMessage(embed).queue();
						return;
					}
					
					case "s:high" : {
						
						MessageEmbed embed = new EmbedBuilder()
								
								.setTitle("Friday Night Funkin'", "https://fridaynightfunkin.fandom.com/wiki/Friday_Night_Funkin%27_Wiki")
								.setDescription("<a:crown:807836415782027313> **High**\nHigh is the second track of Week 4. It was composed by Kawai Sprite and released on the 27th of December, 2020. The antagonist for this level is The Mom. ")
								.setColor(event.getGuild().getSelfMember().getColorRaw())
								.setTimestamp(Instant.ofEpochMilli(System.currentTimeMillis()))
								.setFooter("Requested by " + event.getAuthor().getAsTag())
								
								.addField("Location", "Limousine", true)
								.addField("Performers", "The Mom", true)
								.addField("Song length", "[1:46](https://www.youtube.com/watch?v=OIsp8KrwSVY)", true)
								
								.build();
						
						channel.sendMessage(embed).queue();
						return;
					}
					
					case "s:milf" : {
						
					}
					
					case "s:m.i.l.f" : {
						
						MessageEmbed embed = new EmbedBuilder()
								
								.setTitle("Friday Night Funkin'", "https://fridaynightfunkin.fandom.com/wiki/Friday_Night_Funkin%27_Wiki")
								.setDescription("<a:crown:807836415782027313> **M.I.L.F**\nM.I.L.F is the third and last track of Week 4. It was composed by Kawai Sprite and released on the 27th of December, 2020. The antagonist for this level is The Mom. ")
								.setColor(event.getGuild().getSelfMember().getColorRaw())
								.setThumbnail("https://micks.world/cdn/fnf/themom/themom.gif")
								.setTimestamp(Instant.ofEpochMilli(System.currentTimeMillis()))
								.setFooter("Requested by " + event.getAuthor().getAsTag())
								
								.addField("Location", "Limousine", true)
								.addField("Performers", "The Mom", true)
								.addField("Song length", "[2:05](https://www.youtube.com/watch?v=dOPrN6aJ7TI)", true)
								
								.build();
						
						channel.sendMessage(embed).queue();
						return;
					}
					
					case "w:mommymustmurder" : {
						
					}
					
					case "w:4" : {
						
					}
					
					case "w:mommy_must_murder" : {
						
						MessageEmbed embed = new EmbedBuilder()
								
								.setTitle("Friday Night Funkin'", "https://fridaynightfunkin.fandom.com/wiki/Friday_Night_Funkin%27_Wiki")
								.setDescription("<a:crown:807836415782027313> **Mommy Must Murder**\nWeek 4, titled Mommy Must Murder, is the fourth set of levels in Friday Night Funkin'. It was released on the 27th of December, 2020. ")
								.setColor(event.getGuild().getSelfMember().getColorRaw())
								.setThumbnail("https://micks.world/cdn/fnf/mommymustmurder/mommymustmurder.png")
								.setTimestamp(Instant.ofEpochMilli(System.currentTimeMillis()))
								.setFooter("Requested by " + event.getAuthor().getAsTag())
								
								.addField("Satin Panties", "[1:37](https://www.youtube.com/watch?v=YzJKStx9IyU)", true)
								.addField("High", "[1:46](https://www.youtube.com/watch?v=OIsp8KrwSVY)", true)
								.addField("M.I.L.F", "[2:05](https://www.youtube.com/watch?v=dOPrN6aJ7TI)", true)
								
								.build();
						
						channel.sendMessage(embed).queue();
						return;
					}
					
					/**
					 * WEEK 5
					 */
					
					case "s:cocoa" : {
						
						MessageEmbed embed = new EmbedBuilder()
								
								.setTitle("Friday Night Funkin'", "https://fridaynightfunkin.fandom.com/wiki/Friday_Night_Funkin%27_Wiki")
								.setDescription("<a:crown:807836415782027313> **Cocoa**\nCocoa is the first track of Week 5. It was composed by Kawai Sprite, which was originally released on December 27th, 2020 as a normal song. However, it was eventually playable in Week 5 on January 20th, 2021.")
								.setThumbnail("https://micks.world/cdn/fnf/dearest/dearest.gif")
								.setTimestamp(Instant.ofEpochMilli(System.currentTimeMillis()))
								.setFooter("Requested by " + event.getAuthor().getAsTag())
								
								.addField("Location", "The Mall", true)
								.addField("Performers", "Daddy Dearest & The Mom", true)
								.addField("Song length", "[1:56](https://www.youtube.com/watch?v=DWdMu4X4jQ0)", true)
								
								.build();
						
						channel.sendMessage(embed).queue();
						return;
					}
					
					case "s:eggnog" : {
						
						MessageEmbed embed = new EmbedBuilder()
								
								.setTitle("Friday Night Funkin'", "https://fridaynightfunkin.fandom.com/wiki/Friday_Night_Funkin%27_Wiki")
								.setDescription("<a:crown:807836415782027313> **Eggnog**\nEggnog is the second track of Week 5. It was composed by Kawai Sprite and released on January 20th, 2021.")
								.setThumbnail("https://micks.world/cdn/fnf/dearest/dearest.gif")
								.setTimestamp(Instant.ofEpochMilli(System.currentTimeMillis()))
								.setFooter("Requested by " + event.getAuthor().getAsTag())
								
								.addField("Location", "The Mall", true)
								.addField("Performers", "Daddy Dearest & The Mom", true)
								.addField("Song length", "[1:35](https://www.youtube.com/watch?v=jQ4QBD-Cu5I)", true)
								
								.build();
						
						channel.sendMessage(embed).queue();
						return;
					}
					
					case "s:winter_horrorland" : {
						
						MessageEmbed embed = new EmbedBuilder()
								
								.setTitle("Friday Night Funkin'", "https://fridaynightfunkin.fandom.com/wiki/Friday_Night_Funkin%27_Wiki")
								.setDescription("<a:crown:807836415782027313> **Winter Horrorland**\n**Winter Horrorland** is the third and final track of Week 5. It was composed by Bassetfilms and released on the 20th of January, 2021. The antagonist for this level is Monster.")
								.setThumbnail("https://micks.world/cdn/fnf/monster/xmasmonster.gif")
								.setTimestamp(Instant.ofEpochMilli(System.currentTimeMillis()))
								.setFooter("Requested by " + event.getAuthor().getAsTag())
								
								.addField("Location", "The Mall", true)
								.addField("Performers", "Monster", true)
								.addField("Song length", "[2:13](https://www.youtube.com/watch?v=7XplMpcWVgo)", true)
								
								.build();
						
						channel.sendMessage(embed).queue();
						return;
					}
					
					case "w:red_snow" : {
						
						MessageEmbed embed = new EmbedBuilder()
								
								.setTitle("Friday Night Funkin'", "https://fridaynightfunkin.fandom.com/wiki/Friday_Night_Funkin%27_Wiki")
								.setDescription("<a:crown:807836415782027313> **Red Snow**\nWeek 5, titled Red Snow, is the fifth set of levels in Friday Night Funkin'. It was released on the 20th of January, 2021\n\n**Songs**")
								.setThumbnail("https://micks.world/cdn/fnf/redsnow/redsnow.png")
								.setTimestamp(Instant.ofEpochMilli(System.currentTimeMillis()))
								.setFooter("Requested by " + event.getAuthor().getAsTag())
								
								.addField("Cacao", "[1:56](https://www.youtube.com/watch?v=DWdMu4X4jQ0)", true)
								.addField("Eggnog", "[1:35](https://www.youtube.com/watch?v=jQ4QBD-Cu5I)", true)
								.addField("Winter Horrorland", "[2:13](https://www.youtube.com/watch?v=7XplMpcWVgo)", true)
								
								.build();
						
						channel.sendMessage(embed).queue();
						return;
					}
					
					case "w:5" : {
						
						MessageEmbed embed = new EmbedBuilder()
								
								.setTitle("Friday Night Funkin'", "https://fridaynightfunkin.fandom.com/wiki/Friday_Night_Funkin%27_Wiki")
								.setDescription("<a:crown:807836415782027313> **Red Snow**\nWeek 5, titled Red Snow, is the fifth set of levels in Friday Night Funkin'. It was released on the 20th of January, 2021\n\n**Songs**")
								.setThumbnail("https://micks.world/cdn/fnf/redsnow/redsnow.png")
								.setTimestamp(Instant.ofEpochMilli(System.currentTimeMillis()))
								.setFooter("Requested by " + event.getAuthor().getAsTag())
								
								.addField("Cacao", "[1:56](https://www.youtube.com/watch?v=DWdMu4X4jQ0)", true)
								.addField("Eggnog", "[1:35](https://www.youtube.com/watch?v=jQ4QBD-Cu5I)", true)
								.addField("Winter Horrorland", "[2:13](https://www.youtube.com/watch?v=7XplMpcWVgo)", true)
								
								.build();
						
						channel.sendMessage(embed).queue();
						return;
					}
					
					case "c:monster" : {
						
						MessageEmbed embed = new EmbedBuilder()
								
								.setTitle("Friday Night Funkin'", "https://fridaynightfunkin.fandom.com/wiki/Friday_Night_Funkin%27_Wiki")
								.setDescription("<a:crown:807836415782027313> **Monster**\nMonster is the final antagonist of Week 5, his only song being Winter Horrorland. He was set to appear as the titular antagonist in the currently unused track Monster for Week 2, but was ultimately scrapped last minute.")
								.setThumbnail("https://micks.world/cdn/fnf/monster/xmasmonster.gif")
								.setTimestamp(Instant.ofEpochMilli(System.currentTimeMillis()))
								.setFooter("Requested by " + event.getAuthor().getAsTag())
								
								.build();
						
						channel.sendMessage(embed).queue();
						return;
					}
					
					/**
					 * WEEK 6
					 */
					case "c:senpai" : {
						
						MessageEmbed embed = new EmbedBuilder()
								
								.setTitle("Friday Night Funkin'", "https://fridaynightfunkin.fandom.com/wiki/Friday_Night_Funkin%27_Wiki")
								.setDescription("<a:crown:807836415782027313> **Senpai**\nSenpai is the primary antagonist of Week 6. His tracks include *Senpai* and *Roses*. He is forcefully overtaken by Spirit later on.\n\n**Other textures**")
								.setColor(event.getGuild().getSelfMember().getColorRaw())
								.setThumbnail("https://micks.world/cdn/fnf/senpai/senpai.gif")
								.setTimestamp(Instant.ofEpochMilli(System.currentTimeMillis()))
								.setFooter("Requested by " + event.getAuthor().getAsTag())
								
								.addField("Mad", "[Click](https://micks.world/cdn/fnf/senpai/madsenpai.gif)", true)
								.addField("Mad Rapping", "[Click](https://micks.world/cdn/fnf/senpai/madrappingsenpai.gif)", true)
								.addField("Rapping", "[Click](https://micks.world/cdn/fnf/senpai/rappingsenpai.gif)", true)
								.addField("Icon", "[Click](https://micks.world/cdn/fnf/senpai/iconsenpai.gif)", true)
								.addBlankField(true)
								.addBlankField(true)
								
								.build();
						
						channel.sendMessage(embed).queue();
						return;
					}
					
					case "s:senpai" : {

						MessageEmbed embed = new EmbedBuilder()
								
								.setTitle("Friday Night Funkin'", "https://fridaynightfunkin.fandom.com/wiki/Friday_Night_Funkin%27_Wiki")
								.setDescription("<a:crown:807836415782027313> **Senpai (Song)**\n**Senpai** is the first track of Week 6. It was released on February 2nd, 2021 and composed by Kawai Sprite. The antagonist for this level is Senpai. ")
								.setThumbnail("https://micks.world/cdn/fnf/senpai/senpai.gif")
								.setTimestamp(Instant.ofEpochMilli(System.currentTimeMillis()))
								.setFooter("Requested by " + event.getAuthor().getAsTag())
								
								.addField("Location", "The School", true)
								.addField("Performers", "Senpai", true)
								.addField("Song length", "[1:40](https://www.youtube.com/watch?v=EJiXO3vwNFo)", true)
								
								.build();
						
						channel.sendMessage(embed).queue();
						return;
					}
					
					case "s:roses" : {
						
						MessageEmbed embed = new EmbedBuilder()
								
								.setTitle("Friday Night Funkin'", "https://fridaynightfunkin.fandom.com/wiki/Friday_Night_Funkin%27_Wiki")
								.setDescription("<a:crown:807836415782027313> **Roses**\n**Roses** is the second track of Week 6, it was composed by Kawai Sprite and released on February 2nd, 2021. The antagonist for this level is Senpai.")
								.setThumbnail("https://micks.world/cdn/fnf/senpai/senpai.gif")
								.setTimestamp(Instant.ofEpochMilli(System.currentTimeMillis()))
								.setFooter("Requested by " + event.getAuthor().getAsTag())
								
								.addField("Location", "The School", true)
								.addField("Performers", "Senpai", true)
								.addField("Song length", "[1:38](https://www.youtube.com/watch?v=DKs-Tkw4X3I)", true)
								
								.build();
						
						channel.sendMessage(embed).queue();
						return;
					}
					
					case "s:thorns" : {
						
						MessageEmbed embed = new EmbedBuilder()
								
								.setTitle("Friday Night Funkin'", "https://fridaynightfunkin.fandom.com/wiki/Friday_Night_Funkin%27_Wiki")
								.setDescription("<a:crown:807836415782027313> **Thorns**\nThorns is the third and final track of Week 6. It was composed by Kawai Sprite and released on February 2nd, 2021. The antagonist for this level is Spirit.")
								.setThumbnail("https://micks.world/cdn/fnf/spirit/spirit.gif")
								.setTimestamp(Instant.ofEpochMilli(System.currentTimeMillis()))
								.setFooter("Requested by " + event.getAuthor().getAsTag())
								
								.addField("Location", "The School", true)
								.addField("Performers", "Spirit", true)
								.addField("Song length", "[1:45](https://www.youtube.com/watch?v=lWja270s6qA)", true)
								
								.build();
						
						channel.sendMessage(embed).queue();
						return;
					}
					
					case "w:6" : {
						
					}
					
					case "w:hating_simulator" : {
						
					}
					
					case "w:hatingsimulator" : {
						
					}
					
					case "w:hating_Simulator_ft._moawling" : {
						
					}
					
					case "w:hatingsimulatorftmoawling" : {
						
					}
					
					case "w:hating_simulator_feat_moawling" : {
						
					}
					
					case "w:hatingsimulatorfeatmoawling" : {
						
						MessageEmbed embed = new EmbedBuilder()
								
								.setTitle("Friday Night Funkin'", "https://fridaynightfunkin.fandom.com/wiki/Friday_Night_Funkin%27_Wiki")
								.setDescription("<a:crown:807836415782027313> **Hating Simulator**\nWeek 6, titled Hating Simulator ft. Moawling, is the sixth set of levels in Friday Night Funkin'. It was released on the 2nd of February, 2021. ")
								.setThumbnail("https://micks.world/cdn/fnf/hatingsimulator/hatingsimulator.png")
								.setColor(event.getGuild().getSelfMember().getColorRaw())
								.setTimestamp(Instant.ofEpochMilli(System.currentTimeMillis()))
								.setFooter("Requested by " + event.getAuthor().getAsTag())
								
								.build();
						
						channel.sendMessage(embed).queue();
						return;
					}

					default: {
						
						MessageEmbed embed = new EmbedBuilder()
								
								.setTitle("Friday Night Funkin'", "https://fridaynightfunkin.fandom.com/wiki/Friday_Night_Funkin%27_Wiki")
								.setThumbnail("https://micks.world/cdn/fnf/logo.gif")
								.setFooter("Requested by " + event.getAuthor().getAsTag())
								.setColor(event.getGuild().getSelfMember().getColorRaw())
								.setTimestamp(Instant.ofEpochMilli(System.currentTimeMillis()))
								.setDescription("<a:crown:807836415782027313> **Unknown SubCommand**\nThe subcommand ``" + argument + "`` doesn't exist! If you need help with the bot's syntax, please type ``/fnf help``")
								
								.build();
						
						channel.sendMessage(embed).queue();
						return;
						
					}
				}
				
			}
			
		}
		
	}
	
}
