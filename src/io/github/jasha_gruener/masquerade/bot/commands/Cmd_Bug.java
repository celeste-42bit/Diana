package io.github.jasha_gruener.masquerade.bot.commands;

import com.mgnt.utils.TimeUtils;
import io.github.jasha_gruener.masquerade.main.Settings;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.concurrent.TimeUnit;

public class Cmd_Bug extends ListenerAdapter {
    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String[] args = event.getMessage().getContentRaw().split("\\s+");

        if (args[0].equalsIgnoreCase(Settings.prefix + "bug")) {
            event.getChannel().sendTyping().queue();
            event.getChannel().sendMessage("Calling +1 422 1322573...").queue();
            TimeUtils.sleepFor(2000, TimeUnit.MILLISECONDS);
            EmbedBuilder github = new EmbedBuilder();

            github.setTitle("Diana");
            github.setDescription("My behavior isn't appropriate? Tell me how to behave better.");
            github.addField("Link", "https://github.com/jasha-gruener/Diana/issues", false);
            github.setFooter("Thank you master!", event.getMember().getUser().getAvatarUrl());
            github.setColor(0x781000);
            event.getChannel().sendMessage(github.build()).queue();
            github.clear();
        }
    }
}
