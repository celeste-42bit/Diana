package io.github.jasha_gruener.masquerade.bot.commands;

//TODO Build the help : WORK IN PROGRESS

import com.mgnt.utils.TimeUtils;
import io.github.jasha_gruener.masquerade.main.Settings;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.concurrent.TimeUnit;

public class Cmd_Help extends ListenerAdapter {
    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String[] args = event.getMessage().getContentRaw().split("\\s+");
        if (args[0].equalsIgnoreCase(Settings.prefix + "help")) {
            if (args.length < 2) {
                event.getChannel().sendTyping().queue();
                event.getChannel().sendMessage("Calling +1 422 1322573...").queue();
                TimeUtils.sleepFor(2000, TimeUnit.MILLISECONDS);
                EmbedBuilder help = new EmbedBuilder();
                help.setTitle("Diana");
                help.setDescription("Hello? This is Diana, how can i help you:");
                help.addField("Commands", "Type '" + Settings.prefix + "help commands' and i'll tell you about all commands", false);
                help.addField("Dice Roller", "Type '" + Settings.prefix + "help roll' to find out about the dice roller", false);
                help.addField("Discord", "Type '" + Settings.prefix + "help discord' to see the ShreckNet manual", false);
                help.addField("Login", "Type '" + Settings.prefix + "help login' and i'll show you, how to announce your arrival in a domain", false);
                help.addField("Music", "Type '" + Settings.prefix + "help music' to get a glimpse on the frequencies for our night broadcast", false);
                help.addField("Channels", "Type '" + Settings.prefix + "help channels' to get instructions for haven management", false);
                help.setColor(0x781000);
                event.getChannel().sendMessage(help.build()).queue();
                help.clear();
            } else {
                if (args.length > 2) {
                    event.getChannel().sendTyping().queue();
                    event.getChannel().sendMessage("[ERROR] This commands' syntax is " + Settings.prefix + "help [topic]. There is only one argument allowed. Type '" + Settings.prefix + "help' for more information.").queue();
                } else {
                    if (args[1].equalsIgnoreCase("commands")) {
                        event.getChannel().sendTyping().queue();
                        event.getChannel().sendMessage(" ").queue();
                        EmbedBuilder help_commands = new EmbedBuilder();
                        help_commands.setTitle("Help - Commands");
                        help_commands.setDescription("Here you find all commands available for the bot");
                        help_commands.addField(Settings.prefix + "info", "Display general info about the bot", false );
                        help_commands.addField(Settings.prefix + "help", "Display the 'help' main page", false );
                        help_commands.addField(Settings.prefix + "test", "Run the built-in-test (BIT) to see if the bot works correctly", false );
                        help_commands.addField(Settings.prefix + "support", "Display the support page with links and contact info", false );
                        help_commands.addField(Settings.prefix + "bug", "Report a bug", false );
                        help_commands.addField(Settings.prefix + "music", "Start the music player (NOT IMPLEMENTED YET)", false );
                        help_commands.addField(Settings.prefix + "dice", "Roll some dice         (NOT IMPLEMENTED YET)", false );
                        help_commands.addField(Settings.prefix + "terminate", "Shut down the bot in case of a malfunction", false );
                        help_commands.addField(Settings.prefix + "...", "More commands coming soon!", false );
                    } else {
                        if (args[1].equalsIgnoreCase("roll")) {
                            event.getChannel().sendTyping().queue();
                            event.getChannel().sendMessage("Help Dice Roller PLACEHOLDER. There is nothing here!").queue();
                        } else {
                            if (args[1].equalsIgnoreCase("discord")) {
                                event.getChannel().sendTyping().queue();
                                event.getChannel().sendMessage("Help Discord PLACEHOLDER. There is nothing here!").queue();
                            } else {
                                if (args[1].equalsIgnoreCase("login")) {
                                    event.getChannel().sendTyping().queue();
                                    event.getChannel().sendMessage("help Login PLACEHOLDER. There is nothing here!").queue();
                                } else {
                                    if (args[1].equalsIgnoreCase("music")) {
                                        event.getChannel().sendTyping().queue();
                                        event.getChannel().sendMessage("help Music PLACEHOLDER. There is nothing here!").queue();
                                    } else {
                                        if (args[1].equalsIgnoreCase("channels")) {
                                            event.getChannel().sendTyping().queue();
                                            event.getChannel().sendMessage("help Channels PLACEHOLDER. There is nothing here!").queue();
                                        } else {
                                            event.getChannel().sendTyping().queue();
                                            event.getChannel().sendMessage("[ERROR] This help page does not exist! Try " + Settings.prefix + "help for a list of all the help topics.").queue();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}