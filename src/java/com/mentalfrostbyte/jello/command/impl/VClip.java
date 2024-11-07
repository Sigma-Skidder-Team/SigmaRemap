package com.mentalfrostbyte.jello.command.impl;

import com.mentalfrostbyte.jello.command.Command;
import com.mentalfrostbyte.jello.command.CommandException;
import mapped.Flags;
import com.mentalfrostbyte.jello.command.CommandType;
import com.mentalfrostbyte.jello.command.ChatCommandExecutor;
import mapped.ChatCommandArguments;
import net.minecraft.network.play.server.SPlayerPositionLookPacket;

import java.util.Collections;

public class VClip extends Command {
   public VClip() {
      super("vclip", "Vertical clip through blocks", "vc");
      this.registerSubCommands(new String[]{"offset"});
   }

   @Override
   public void run(String var1, ChatCommandArguments[] var2, ChatCommandExecutor var3) throws CommandException {
      if (var2.length != 0) {
         if (var2.length <= 1) {
            if (var2[0].getCommandType() != CommandType.field14336) {
               throw new CommandException("Invalid vertical distance \"" + var2[0].getArguments() + "\"");
            } else {
               mc.getConnection()
                  .handlePlayerPosLook(
                     new SPlayerPositionLookPacket(
                        mc.player.getPosX(),
                        mc.player.getPosY() + var2[0].method30896(),
                        mc.player.getPosZ(),
                        mc.player.rotationYaw,
                        mc.player.rotationPitch,
                        Collections.emptySet(),
                        (int)(2.147483647E9 * Math.random())
                     )
                  );
               var3.send("VClip'd to position " + (mc.player.getPosY() + var2[0].method30896()));
            }
         } else {
            throw new CommandException("Too many arguments");
         }
      } else {
         throw new CommandException();
      }
   }
}
