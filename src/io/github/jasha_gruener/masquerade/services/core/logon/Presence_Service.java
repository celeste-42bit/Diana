package io.github.jasha_gruener.masquerade.services.core.logon;

import com.mgnt.utils.TimeUtils;

import io.github.jasha_gruener.masquerade.main.Settings;
import io.github.jasha_gruener.masquerade.main.Main;

import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;

import java.util.concurrent.TimeUnit;

public class Presence_Service extends Main {

    public static void presence() {
        TimeUtils.sleepFor(200, TimeUnit.MILLISECONDS);
        System.out.println(Settings.tag_presence_service + "Starting presence service...");
        jda.getPresence().setStatus(OnlineStatus.ONLINE);
        jda.getPresence().setActivity(Activity.watching("ants and feeling like a lion..."));
        TimeUtils.sleepFor(200, TimeUnit.MILLISECONDS);
        System.out.println(Settings.tag_presence_service + "Presence set!");
        TimeUtils.sleepFor(100, TimeUnit.MILLISECONDS);
    }
}

//TODO Presence_Service written wrong!!!


