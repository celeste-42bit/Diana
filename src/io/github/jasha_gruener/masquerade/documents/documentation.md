# Project Diana V.: 0.4.0 - Documentation

## Version history and change log

---

### Version 0.4.0

- Removed Punkbuster and Watchdog, as they are not needed any more
- Added the Dice roller


### Version 0.3.7

- Removed OALI_Service
- Added Entity_Identifier_Service which will be used to pull all info from a message sent in the guild (indev)
- Grayed Entity_Identifier_Service because it throws a soft IllegalArgumentException
- Disabled Listener(EntityIdentifierService) in Listener Service
- Corrected spelling mistake in "Settings.presence_service" in class "Listener_Service"
- Added the code_snips.md document, containing useful pieces of code.
- Created the Dice_Service.java class and Cmd_Dice.java class for later implementation of the dice roller

### Version 0.3.6

- Changed command prefix to "$" (by Jessi)
- Changed the "issues"-link in class Cmd_Bug because it changed on Github
- Shortened console title, so it fits into common console windows
- Added "Banhammer3000" class for later implementation of ban
- Added settings for ban-rules (indev)
- Added "final" keyword to all "Main.Settings" classes variables
- Added "$exit" and "$stop" command option (indev)
- Added creator notice to login console output
- Added license notice to login console output
- Added a "command not found"-option to the help page (class Cmd_Help)
- Program can now be exited by command (Added System.exit(0))
- Prepared implementation of settings.yml file to replace Settings.java
- Moved class "Settings.java" into package "main"


### Version 0.3.5

- "Cmd_Help" class and help options are available now and help texts will be added in a future update
- Fixed "No reaction on event-call with any command"
- Changed title output by the console from "Masquerade Bot" to "Diana V.: <Settings.version>"
- Changed incorrect build number


### Version 0.3.4

- Began command argument parsing experiment in the "Cmd_Help"-Class
- Planning implementation of a music streaming service which should replace "Cydra-Service"
- Changed OAuth 2 key


### Version 0.3.3

- Added conversation style command response
- Added "#help [args]" command
- Added option for implementing "Cydra_Service"
- Changed OAuth 2 key


### Version 0.3.2

- Separated command chains into multiple command classes
- Proceeded with first optimisation of the command classes
- Fixed "help-menu appearing twice after command #help." bug
- Fixed "#test makes Diana not respond anymore." bug


### Version 0.3.1

- Added command "#help" (which shows a help-topic list) by implementing class "Cmd_Help"
- Added command "#support" (for mobile, email, chat support) by implementing class "Cmd_Support"
- Added command "#bug" (for bug reporting) by implementing class "Cmd_Bug"


### Version 0.3.0 and pre-0.3

- Indev versions, not mentioned in this history




## Classes and project structure

---

project structure PLACEHOLDER




## Important methods

---

Important methods PLACEHOLDER