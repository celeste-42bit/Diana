package io.github.jasha_gruener.masquerade.bot.commands;

import io.github.jasha_gruener.masquerade.main.Settings;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Cmd_Info extends ListenerAdapter {
    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String[] args = event.getMessage().getContentRaw().split("\\s+");
        if (args[0].equalsIgnoreCase(Settings.prefix + "info")) {
            event.getChannel().sendTyping().queue();
            EmbedBuilder info = new EmbedBuilder();
            info.setTitle("Diana");
            info.setDescription("Your loyal servant and night-manager");
            info.addField("Info", "Diana was born on the 4th of Juli 1992. She grew up in a poor family from the outskirts of New York. Going against all expectations, Diana graduated from highschool with top-grades and went to college, which was financed by an anonymous salesman, who gifted 40.000 USD to her family. After finishing college, Diana went to University and started studying parliamentary rhetorics and political sciences.", false);
            info.addField("Version", Settings.version, false);
            info.addField("Build", Settings.build, false);
            info.addField("Creator", Settings.creator, false);
            info.addField("License", Settings.license, false);
            info.setColor(0x781000);
            event.getChannel().sendMessage(info.build()).queue();
            info.clear();
        }
    }
}