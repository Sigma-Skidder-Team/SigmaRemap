package com.mentalfrostbyte.jello.command.impl;

import com.mentalfrostbyte.jello.command.Command;
import com.mentalfrostbyte.jello.command.CommandException;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.command.ChatCommandExecutor;
import mapped.ChatCommandArguments;
import net.minecraft.client.Minecraft;

public class HighDPI extends Command {
   public HighDPI() {
      super("highdpi", "Toggles macOS HiDPI, Needs mc restart.", "hidpi");
   }

   @Override
   public void run(String var1, ChatCommandArguments[] var2, ChatCommandExecutor var3) throws CommandException {
      if (var2.length <= 0) {
         if (Minecraft.IS_RUNNING_ON_MAC) {
            if (!Client.getInstance().guiManager.getHidpiCocoa()) {
               var3.send("HighDPI was enabled!");
            } else {
               var3.send("HighDPI was disabled!");
            }

            Client.getInstance().guiManager.setHidpiCocoa(!Client.getInstance().guiManager.getHidpiCocoa());
         } else {
            throw new CommandException("This feature is only available on macOS!");
         }
      } else {
         throw new CommandException("Too many arguments");
      }
   }
}
