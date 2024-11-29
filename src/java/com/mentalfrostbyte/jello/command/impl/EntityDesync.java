package com.mentalfrostbyte.jello.command.impl;

import com.mentalfrostbyte.jello.command.ChatCommandExecutor;
import com.mentalfrostbyte.jello.command.Command;
import com.mentalfrostbyte.jello.command.CommandException;
import com.mentalfrostbyte.jello.command.CommandType;
import mapped.ChatCommandArguments;
import net.minecraft.entity.Entity;


public class EntityDesync extends Command {
   private Entity field25711 = null;

   public EntityDesync() {
      super("entitydesync", "Forces a client side entity dismount", "vanish", "riderdesync");
      this.registerSubCommands(new String[]{"remount/dismount"});
   }

   @Override
   public void run(String var1, ChatCommandArguments[] var2, ChatCommandExecutor var3) throws CommandException {
      if (var2.length != 0) {
         if (var2.length <= 1) {
            if (var2[0].getCommandType() != CommandType.TEXT) {
               throw new CommandException();
            } else {
               if (!var2[0].getArguments().startsWith("d")) {
                  if (!var2[0].getArguments().startsWith("m") && !var2[0].getArguments().startsWith("r")) {
                     throw new CommandException();
                  }

                  if (this.field25711 == null) {
                     throw new CommandException("No entity to remount");
                  }

                  mc.player.method3311(this.field25711);
                  this.field25711.addedToChunk = true;
                  var3.send("Remounted entity " + this.field25711.getType().getName().getUnformattedComponentText());
                  this.field25711 = null;
               } else {
                  Entity var6 = mc.player.getRidingEntity();
                  if (var6 == null) {
                     throw new CommandException("You must be riding an entity to use this command");
                  }

                  this.field25711 = mc.player.getRidingEntity();
                  this.field25711.addedToChunk = true;
                  mc.player.stopRiding();
                  var3.send("Dismounted entity " + this.field25711.getType().getName().getUnformattedComponentText());
               }
            }
         } else {
            throw new CommandException("Too many arguments");
         }
      } else {
         throw new CommandException();
      }
   }
}
