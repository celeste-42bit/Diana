package io.github.jasha_gruener.masquerade.services.core.listeners;

import com.mgnt.utils.TimeUtils;
import io.github.jasha_gruener.masquerade.main.Settings;
import io.github.jasha_gruener.masquerade.bot.commands.*;
import io.github.jasha_gruener.masquerade.main.Main;
import io.github.jasha_gruener.masquerade.main.Terminate;
import io.github.jasha_gruener.masquerade.services.core.security.GuildMemberJoin;
import io.github.jasha_gruener.masquerade.services.extended.Welcome_Service;

import java.util.concurrent.TimeUnit;

public class Listener_Service extends Main {
    public static void register() {
        System.out.println(Settings.tag_listener_service + "Starting listener service...");
        TimeUtils.sleepFor(100, TimeUnit.MILLISECONDS);
        System.out.println(Settings.tag_listener_service + "Setting up listeners...");

        /** COMMANDS
         * Those listeners are for every single command available for this bot!
         */

        jda.addEventListener(new Cmd_Help());
        jda.addEventListener(new Cmd_Info());
        jda.addEventListener(new Cmd_Support());
        jda.addEventListener(new Cmd_Bug());
        jda.addEventListener(new Cmd_Test());
        jda.addEventListener(new Cmd_Music());
        jda.addEventListener(new Terminate());
    //    jda.addEventListener(new Entity_Identifier_Service());
    //    jda.addEventListener(new OALI_Service());

        /** GUILD MEMBER JOIN/LEAVE
         * These listeners check for guild joins & leaves
         */

        jda.addEventListener(new Welcome_Service());
        jda.addEventListener(new GuildMemberJoin());

        TimeUtils.sleepFor(200, TimeUnit.MILLISECONDS);
        System.out.println(Settings.tag_listener_service + "Configuring net.dv8tion.jda.api.hooks.ListenerAdapter...");
        TimeUtils.sleepFor(100, TimeUnit.MILLISECONDS);
        System.out.println(Settings.tag_listener_service + "Done!");
        TimeUtils.sleepFor(100, TimeUnit.MILLISECONDS);
    }
}
