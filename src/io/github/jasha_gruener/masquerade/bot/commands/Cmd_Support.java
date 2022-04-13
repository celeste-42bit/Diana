package io.github.jasha_gruener.masquerade.bot.commands;

import com.mgnt.utils.TimeUtils;
import io.github.jasha_gruener.masquerade.main.Settings;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.concurrent.TimeUnit;

public class Cmd_Support extends ListenerAdapter {
    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String[] args = event.getMessage().getContentRaw().split("\\s+");
        if (args[0].equalsIgnoreCase(Settings.prefix + "support")) {
            event.getChannel().sendTyping().queue();
            EmbedBuilder contact = new EmbedBuilder();
            EmbedBuilder discord = new EmbedBuilder();
            event.getChannel().sendMessage("Calling +1 422 1322573...").queue();
            TimeUtils.sleepFor(2000, TimeUnit.MILLISECONDS);
            contact.setTitle("Diana");
            contact.setDescription("Diana here! I heard you need some assistance? Here is my official contact for you.");
            contact.addField("Telephone", "07452 885767", false);
            contact.addField("Mobile", "+49 179 4495104", false);
            contact.addField("E-Mail", "harpy.diana@gmail.com", false);
            contact.setColor(0x781000);
            event.getChannel().sendMessage(contact.build()).queue();

            TimeUtils.sleepFor(3500, TimeUnit.MILLISECONDS);

            event.getChannel().sendMessage("[ShrekNet System] java.lang.illegalAccessException").queue();
            TimeUtils.sleepFor(800, TimeUnit.MILLISECONDS);
            event.getChannel().sendMessage("[ShrekNet System] Be advised, security has been breached!").queue();
            TimeUtils.sleepFor(800, TimeUnit.MILLISECONDS);
            event.getChannel().sendMessage("[ShrekNet System] Anonymous member login...").queue();
            event.getChannel().sendMessage("[ShrekNet System] Login successful!").queue();
            TimeUtils.sleepFor(800, TimeUnit.MILLISECONDS);
            event.getChannel().sendMessage("[ShrekNet System] Member is sending a message...").queue();
            TimeUtils.sleepFor(1500, TimeUnit.MILLISECONDS);

            discord.setTitle("Callihan - Your Noz right around the corner");
            discord.setDescription("Well, sorry for hacking into your conversation...");
            discord.addField("Callihan:", "I just wanted to advertise my... Establishment. You have a question about the ShreckNet? Join me in my room, i'll tell you what you need to know.", false);
            discord.addField("Link", "https://discord.gg/73CHN0M4NC3R/callihan", false);
            discord.setColor(0x000000);
            event.getChannel().sendMessage(discord.build()).queue();

            TimeUtils.sleepFor(2500, TimeUnit.MILLISECONDS);

            event.getChannel().sendMessage("Diana: Ok... That was weird.").queue();
            event.getChannel().sendMessage("Diana: Callihan is a good guy. He's weird sometimes.").queue();
            TimeUtils.sleepFor(2500, TimeUnit.MILLISECONDS);
            event.getChannel().sendMessage("Diana: And creepy.").queue();
            TimeUtils.sleepFor(2500, TimeUnit.MILLISECONDS);
            event.getChannel().sendMessage("Diana: But he can make a good friend :)").queue();
            TimeUtils.sleepFor(3000, TimeUnit.MILLISECONDS);
            event.getChannel().sendMessage("Diana: See ya later. Bye!").queue();


            contact.clear();
            discord.clear();
        }
    }
}
