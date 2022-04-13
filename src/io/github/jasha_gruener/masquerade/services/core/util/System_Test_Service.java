package io.github.jasha_gruener.masquerade.services.core.util;

import io.github.jasha_gruener.masquerade.bot.commands.Cmd_Test;

public class System_Test_Service extends Cmd_Test {
    public void test_variable_init() {
        boolean tv_cmd_bug;
        boolean tv_cmd_help;
        boolean tv_cmd_info;
        boolean tv_cmd_music;
        boolean tv_cmd_support;
        //boolean tv_cmd_test is missing, because it's the command that calls this service itself

        /*
        this services should check the presence of all packages. Therefore it checks if a test variable (tv) is set to true.
        Whenever a service runs for the first time (usually during startup), this variable is set to true, to confirm, that the
        class linked to it works fine.

        When the system is shut down, all vars will be set to false again.

        Only if all vars are true, this service will return 0. Else, it will return -1 and which service isn't up.
        The test command can then message it into chat as an error message.
         */

    }
}
