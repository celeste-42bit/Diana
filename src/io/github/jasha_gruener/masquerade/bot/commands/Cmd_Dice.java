package io.github.jasha_gruener.masquerade.bot.commands;

import io.github.jasha_gruener.masquerade.main.Settings;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Cmd_Dice {
    public class Cmd_dice extends ListenerAdapter {
        public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
            String[] args = event.getMessage().getContentRaw().split("\\s+");
            if (args[0].equalsIgnoreCase(Settings.prefix + "roll")) {
                if (args.length == 1) {
                    event.getChannel().sendTyping().queue();
                    EmbedBuilder roll1 = new EmbedBuilder();
                    roll1.setTitle("Dice Roller");
                    roll1.setDescription("This is how you roll!");
                    roll1.addField("Roll", "Type " + Settings.prefix + "roll <dice amount> <hunger level>", false);
                    roll1.addField("Range", "You can roll up to 100 D10's", false);
                    roll1.setColor(0x781000);
                    event.getChannel().sendMessage(roll1.build()).queue();
                    roll1.clear();
                    //TODO Wait for the next message in the channel and test if it's a valid integer
                    //TODO If yes, roll the amount of dice (take the random command posted under here and make a for-loop)
                    /*
                        https://dzone.com/articles/random-number-generation-in-java
                        https://www.educative.io/edpresso/how-to-generate-random-numbers-in-java
                     */

                } else if (args.length > 1) {
                    event.getChannel().sendMessage("[ERROR] This commands' syntax is " + Settings.prefix + "roll. This command accepts no further arguments. Type '" + Settings.prefix + "help' for more information.").queue();
                }
            }
        }
    }
}
