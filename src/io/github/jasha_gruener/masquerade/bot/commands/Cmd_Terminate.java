package io.github.jasha_gruener.masquerade.bot.commands;

import com.mgnt.utils.TimeUtils;
import io.github.jasha_gruener.masquerade.main.Settings;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.concurrent.TimeUnit;

import static io.github.jasha_gruener.masquerade.main.Settings.wombat;

public class Cmd_Terminate extends ListenerAdapter {
    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String[] args = event.getMessage().getContentRaw().split("\\s+");

        if (args[0].equalsIgnoreCase(Settings.prefix + "terminate")) {
            EmbedBuilder cmd_terminate = new EmbedBuilder();
            cmd_terminate.setTitle("Termination sequence started!");
            cmd_terminate.setDescription("WARNING: Bot will not be reachable after termination! It has to be reset by an admin.");
            cmd_terminate.addField("1.", "Type " + Settings.prefix + "term_exec", false);
            cmd_terminate.addField("2.", "Enter your authorisation code", false);
            cmd_terminate.addField("3.", "Wait for the bot to shut down", false);
            cmd_terminate.addBlankField(false);
            cmd_terminate.addField("REPORT", "Please report the incident to an administrator", false);
            event.getChannel().sendMessage(cmd_terminate.build()).queue();
            Settings.safety = false;
        }
    }
}