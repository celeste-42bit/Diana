package io.github.jasha_gruener.masquerade.bot.commands;

import io.github.jasha_gruener.masquerade.main.Settings;
import io.github.jasha_gruener.masquerade.services.extended.Cydra_Service;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Cmd_Music extends ListenerAdapter {
    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String[] args = event.getMessage().getContentRaw().split("\\s+");
        if (args[0].equalsIgnoreCase(Settings.prefix + "music")) {
            Cydra_Service.cydra_manual();
        }
    }
}
