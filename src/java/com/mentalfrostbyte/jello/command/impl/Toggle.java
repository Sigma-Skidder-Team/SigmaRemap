package com.mentalfrostbyte.jello.command.impl;

import com.mentalfrostbyte.jello.command.Command;
import com.mentalfrostbyte.jello.command.CommandException;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.module.Module;
import mapped.Class6669;
import mapped.ChatCommandArguments;

public class Toggle extends Command {
   public Toggle() {
      super("toggle", "Toggle a module", "t");
      this.registerSubCommands(new String[]{"module"});
   }

   @Override
   public void run(String var1, ChatCommandArguments[] var2, Class6669 var3) throws CommandException {
      if (var2.length != 1) {
         throw new CommandException();
      } else {
         Module var6 = this.method18336(var2[0].method30899());
         if (var6 != null) {
            var6.setEnabled(!var6.isEnabled());
            var3.send(var6.getName() + " was " + (!var6.isEnabled() ? "disabled" : "enabled"));
         } else {
            throw new CommandException("Module \"" + var2[0].method30899() + "\" not found");
         }
      }
   }

   public Module method18336(String var1) {
      for (Module var5 : Client.getInstance().getModuleManager().getModuleMap().values()) {
         if (var5.getName().replace(" ", "").equalsIgnoreCase(var1)) {
            return var5;
         }
      }

      return null;
   }
}
