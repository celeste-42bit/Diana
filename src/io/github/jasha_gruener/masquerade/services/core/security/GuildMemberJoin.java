package io.github.jasha_gruener.masquerade.services.core.security;

import net.dv8tion.jda.api.events.guild.member.GuildMemberJoinEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class GuildMemberJoin extends ListenerAdapter {
    public void onGuildMemberJoin(GuildMemberJoinEvent event) {
        //TODO Make security.guildmemberjoin working!!! MAIN PRIORITY!
        /*
        Guild guild = event.getGuild();
        Role role = event.getGuild().getRolesByName("NewRole");
        Member member = event.getMember();
        guild.addRoleToMember(member, role).queue();
         */
    }
}
