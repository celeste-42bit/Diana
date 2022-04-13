package io.github.jasha_gruener.masquerade.main;

//TODO: Write a settings file to replace the compiled code down here! (Makes everything faster)

public class Settings {

    //First some definitions. Disregard these please.

    private static final boolean TRUE = true;
    private static final boolean VERY_EXTREMELY_MUCH_TRUE = true;
    private static final boolean NOW = true;
    private static final boolean FALSE = false;

    public static final String wombat = "I am a wombat";
    public static boolean safety = true;

    /** LINK
     * This is the invite link to the discord server
     */

    public final static String inviteLink = "Link";

    /** SETTINGS
     * This is the complete subset of system settings. ///NOT IMPLEMENTED YET/// TODO Implement following functions
     */

    //those are just for the system test. You can change them... Maybe something happens? ;)
    public final boolean i_am_a_boolean       = TRUE;
    public final boolean i_am_not_a_boolean   = FALSE;

    //serious settings
    public final boolean command_to_console   = TRUE; //output issued commands into console (and write log, if enabled)
    public final boolean chat_to_console      = TRUE; //output normal chat into console (and write log, if enabled)
    public final boolean detailed_user_info   = TRUE; //show detailed info about the user, when outputting into console (and log, if enabled)
    public final boolean write_log            = TRUE; //write things outputted into console into a log file
    public final boolean allow_self_test      = TRUE; //allow the self-test when command "test" is issued
    public final boolean banhammer3000        = TRUE; //determines whether Punkbuster is allowed to ban people automatically

    //FACTS, DO NOT CHANGE!
    public final boolean spread_the_love      = VERY_EXTREMELY_MUCH_TRUE; //love is love! 🌈
    public final boolean climate_justice      = NOW;                      //fight for 1.5!


//----------------------------------------------------------------------------------------------------------------------

    /**NETKEY / TOKEN
     * This OAuth 2 token has to be provided to the API in order to authenticate the bot.
     * NEVER share this token! It's secret. Very. Secret.
     * Just don't.
     * Bad things would happen.
     * Bad.
     * Very bad.
     */

    public static final String secretToken = "ODEwNTkwNTY5OTQ0MTg2ODkw.YCl3Sw._jxO7it9cQJVnt9VZs48CgjLorE";

//----------------------------------------------------------------------------------------------------------------------

    /** PREFIX
     * This is the prefix, which has to be typed first, to issue a command (f.ex. /command , ~command , >command)
     */

    public static final String prefix = "$";


//----------------------------------------------------------------------------------------------------------------------

    /** INFORMATION
     * This contains general information about the bot.
     */

    public static final String version = "0.4.1";
    public static final String build = "305";
    public static final String creator = "Caeleste aka. 73chn0";
    public static final String license = "MIT : Copyright © 2021-2022 celeste-42bit";

//----------------------------------------------------------------------------------------------------------------------

    /** CORE SERVICES
     * Those are the core services of this software. These service tags are shown, when the service performs an action.
     */

    //Main class
    public static final String tag_main = "[Main] ";
    //LogOn Service: This service provides the OAuth-Key of the bot to the Discord-API
    public static final String tag_logon_service = "[LogOn Service] ";
    //Listener Service: The listener service listens to commands typed in chat and returns them to the console
    public static final String tag_listener_service = "[Listener Service] ";
    //Presence Service: This service checks and sets the bots presence (status)
    public static final String tag_presence_service = "[Presence Service] ";
    //OALI-Service: Outputs everything the listeners have heard into the console (configurable)
    public static final String tag_dice_service = "[Dice Service] ";
    //Punkbuster: This service classifies misbehavior and punishes the users accordingly

    /** EXTENDED SERVICES
     * These are the extended services of this software. These service tags are shown, when the service performs an action.
     */

    public static final String tag_cydra_service = "[Cydra Service] ";


}
