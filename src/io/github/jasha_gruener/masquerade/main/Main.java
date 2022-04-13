package io.github.jasha_gruener.masquerade.main;

import com.mgnt.utils.TimeUtils;
import io.github.jasha_gruener.masquerade.services.core.listeners.Listener_Service;
import io.github.jasha_gruener.masquerade.services.core.logon.LogOn_Service;
import net.dv8tion.jda.api.JDA;
import javax.security.auth.login.LoginException;
import java.util.concurrent.TimeUnit;

public class Main {
    public static JDA jda;
    public static void main(String[] args) throws LoginException {
        Settings.safety = true;
        System.out.println(" ");
        System.out.println("- - - - - - - - - - - - - - - - - - Diana V.: " + Settings.version + " - - - - - - - - - - - - - - - - - -");
        System.out.println(" ");
        System.out.println("Created by " + Settings.creator + " at the 13th of November 2020 during the COVID-19 pandemic lockdown");
        System.out.println(" ");
        System.out.println("License: " + Settings.license);
        System.out.println("Copyright infringements will be punished! Make sure the original creator is mentioned in every copy and/or fork of this software.");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        TimeUtils.sleepFor(6000, TimeUnit.MILLISECONDS);
        LogOn_Service.logon();
        TimeUtils.sleepFor(1000, TimeUnit.MILLISECONDS);
        Listener_Service.register();

    }
}


