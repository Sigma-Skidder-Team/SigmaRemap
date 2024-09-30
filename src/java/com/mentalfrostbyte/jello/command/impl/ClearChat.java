package com.mentalfrostbyte.jello.command.impl;

import com.mentalfrostbyte.jello.command.ChatCommandExecutor;
import com.mentalfrostbyte.jello.command.Command;
import com.mentalfrostbyte.jello.command.CommandException;
import mapped.ChatCommandArguments;


public class ClearChat extends Command {
   public ClearChat() {
      super("clearchat", "Clears your chat client side", "cc", "chatclear");
   }

   @Override
   public void run(String var1, ChatCommandArguments[] var2, ChatCommandExecutor var3) throws CommandException {
      if (var2.length <= 0) {
         mc.ingameGUI.getChatGUI().clearChatMessages(true);
      } else {
         throw new CommandException("Too many arguments");
      }
   }
}
