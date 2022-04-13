package io.github.jasha_gruener.masquerade.bot.commands;

import com.mgnt.utils.TimeUtils;
import io.github.jasha_gruener.masquerade.main.Settings;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.concurrent.TimeUnit;

public class Cmd_Test extends ListenerAdapter {
    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String[] args = event.getMessage().getContentRaw().split("\\s+");
        if (args[0].equalsIgnoreCase(Settings.prefix + "test")) {
            event.getChannel().sendTyping().queue();
            event.getChannel().sendMessage("Running test routine, please wait...").queue();
            TimeUtils.sleepFor(1500, TimeUnit.MILLISECONDS);
            event.getChannel().sendMessage("Done! All systems are functional and running.").queue();
        }
    }
}
