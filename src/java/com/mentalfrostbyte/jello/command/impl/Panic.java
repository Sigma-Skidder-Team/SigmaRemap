package com.mentalfrostbyte.jello.command.impl;

import com.mentalfrostbyte.jello.command.Command;
import com.mentalfrostbyte.jello.command.CommandException;

import com.mentalfrostbyte.jello.Client;
import mapped.Class6669;
import mapped.Class6814;
import mapped.Class7286;
import mapped.Class8623;
import totalcross.json.JSONObject;

public class Panic extends Command {
   public Panic() {
      super("panic", "Disable all modules");
   }

   @Override
   public void run(String var1, Class8623[] var2, Class6669 var3) throws CommandException {
      if (var2.length > 0) {
         throw new CommandException("Too many arguments");
      } else {
         Class6814 var6 = Client.getInstance().getModuleManager().method14667();
         if (var6.method20768("Panic")) {
            int var7 = var6.method20772().size();

            for (int var8 = 0; var8 < var7; var8++) {
               Class7286 var9 = var6.method20772().get(var8);
               if (var9.field31263.equals("Panic")) {
                  var6.method20764(var9);
                  var8--;
                  var7--;
               }
            }
         }

         Class7286 var10 = new Class7286("Panic", new JSONObject());
         var6.method20763(var10);
         var6.method20771(var10);
         var3.method20327("All modules disabled.");
      }
   }
}
