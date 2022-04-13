package io.github.jasha_gruener.masquerade.services.core.logon;

import com.mgnt.utils.TimeUtils;
import io.github.jasha_gruener.masquerade.main.Settings;
import io.github.jasha_gruener.masquerade.main.Main;
import net.dv8tion.jda.api.JDABuilder;

import javax.security.auth.login.LoginException;
import java.util.concurrent.TimeUnit;

public class LogOn_Service extends Main {
    public static void logon() throws LoginException {
        System.out.println(Settings.tag_logon_service + "Starting LogOn Service...");
        jda = JDABuilder.createDefault(Settings.secretToken).build();
        System.out.println(Settings.tag_logon_service + "Bot is logged in!");
        TimeUtils.sleepFor(100, TimeUnit.MILLISECONDS);
        Presence_Service.presence();
    }
}
