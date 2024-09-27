package com.mentalfrostbyte.jello.command.impl;

import com.mentalfrostbyte.jello.command.Command;
import com.mentalfrostbyte.jello.command.CommandException;

import com.mentalfrostbyte.jello.Client;
import mapped.Class2193;
import mapped.Class6669;
import mapped.ChatCommandArguments;

import java.util.List;

public class Help extends Command {
   public final int field25703 = 7;

   public Help() {
      super("help", "Show this help dialog", "vc");
      this.registerSubCommands(new String[]{"page/command"});
   }

   @Override
   public void run(String var1, ChatCommandArguments[] var2, Class6669 var3) throws CommandException {
      List var6 = Client.getInstance().getCommandManager().getCommands();
      int var7 = (int)Math.ceil((double)((float)var6.size() / 7.0F));
      int var8 = var2.length == 1 && var2[0].method30895() == Class2193.field14336 ? var2[0].method30898() - 1 : 0;
      if (var2.length == 1 && var2[0].method30895() == Class2193.field14335) {
         Command var12 = Client.getInstance().getCommandManager().method30231(var2[0].method30899());
         if (var12 == null) {
            throw new CommandException();
         } else {
            var3.send("§f" + var12.getName() + "§8" + " > " + "§7" + var12.getDescription());
            if (var12.method18326().length() <= 0) {
               var3.send("   [no options]");
            } else {
               var3.send("   " + var12.method18326());
            }
         }
      } else if (var2.length <= 1) {
         if (var8 + 1 <= var7 && var8 >= 0) {
            var3.send("§fHelp:§7 Page " + (var8 + 1) + "/" + var7);
            var3.send("");

            for (int var9 = 0; var9 < 7; var9++) {
               int var10 = var9 + var8 * 7;
               if (var6.size() > var10) {
                  Command var11 = (Command)var6.get(var10);
                  var3.send("§f" + var11.getName() + "§8" + " > " + "§7" + var11.getDescription());
                  if (var11.method18326().length() <= 0) {
                     var3.send("   [no options]");
                  } else {
                     var3.send("   " + var11.method18326());
                  }
               }
            }
         } else {
            throw new CommandException("Page " + var8 + " does not exist!");
         }
      } else {
         throw new CommandException();
      }
   }
}
