package com.mentalfrostbyte.jello.command.impl;

import com.mentalfrostbyte.jello.command.Command;
import com.mentalfrostbyte.jello.command.CommandException;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.command.ChatCommandExecutor;
import mapped.Class6814;
import mapped.Configuration;
import mapped.ChatCommandArguments;
import totalcross.json.JSONObject;

public class Panic extends Command {
   public Panic() {
      super("panic", "Disable all modules");
   }

   @Override
   public void run(String var1, ChatCommandArguments[] var2, ChatCommandExecutor var3) throws CommandException {
      if (var2.length > 0) {
         throw new CommandException("Too many arguments");
      } else {
         Class6814 var6 = Client.getInstance().getModuleManager().getConfigurationManager();
         if (var6.method20768("Panic")) {
            int var7 = var6.getAllConfigs().size();

            for (int var8 = 0; var8 < var7; var8++) {
               Configuration var9 = var6.getAllConfigs().get(var8);
               if (var9.getName.equals("Panic")) {
                  var6.checkConfig(var9);
                  var8--;
                  var7--;
               }
            }
         }

         Configuration var10 = new Configuration("Panic", new JSONObject());
         var6.saveConfig(var10);
         var6.loadConfig(var10);
         var3.send("All modules disabled.");
      }
   }
}
