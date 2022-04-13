# Code snips


### Sending a message into a specific channel (hardcoded)

    TextChannel textChannel = jda.getTextChannelsByName("CHANNEL_NAME",true).get(0);
    textChannel.sendMessage("MESSAGE").queue();

Not tested. But this should in theory send a text message into the right channel.
#

### Sending a message into a specific channel (on event)

    TextChannel textChannel = event.getGuild().getTextChannelsByName("CHANNEL_NAME",true).get(0);
    textChannel.sendMessage("MESSAGE").queue();

Not tested. Same as above, but it reacts to an event in the Cmd_Classes.
#
