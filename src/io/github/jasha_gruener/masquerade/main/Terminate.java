package io.github.jasha_gruener.masquerade.main;

import com.mgnt.utils.TimeUtils;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.concurrent.TimeUnit;

import static io.github.jasha_gruener.masquerade.main.Settings.wombat;

public class Terminate extends ListenerAdapter {
    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String[] args = event.getMessage().getContentRaw().split("\\s+");
        if (args[0].equalsIgnoreCase(Settings.prefix + "term_exec")) {
            if (!Settings.safety) {
                event.getChannel().sendTyping().queue();
                event.getChannel().sendMessage("Preparing termination of system...").queue();
                event.getChannel().sendMessage("Please wait...").queue();
                //TODO : Correct shutdown procedure
                //TODO : Save current settings in the Settings.yaml file
                //Sleep just for simulation of time delay
                TimeUtils.sleepFor(2000, TimeUnit.MILLISECONDS);
                event.getChannel().sendMessage(wombat).queue();
                event.getChannel().sendMessage("Process exited with exit code 0").queue();
                System.exit(0);

            } else {
                event.getChannel().sendMessage("The safety is still on! To terminate the bot, please type " + Settings.prefix + "terminate").queue();
            }
        }
    }
}
