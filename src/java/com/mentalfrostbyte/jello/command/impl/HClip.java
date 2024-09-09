package com.mentalfrostbyte.jello.command.impl;

import com.mentalfrostbyte.jello.command.Command;
import com.mentalfrostbyte.jello.command.CommandException;
import mapped.*;
import net.minecraft.network.play.server.SPlayerPositionLookPacket;

import java.util.Collections;

public class HClip extends Command {
   public HClip() {
      super("hclip", "Horizontal clip", "hc");
      this.registerSubCommands(new String[]{"offset"});
   }

   @Override
   public void run(String var1, Class8623[] var2, Class6669 var3) throws CommandException {
      if (var2.length != 0) {
         if (var2.length <= 1) {
            if (var2[0].method30895() != Class2193.field14336) {
               throw new CommandException("Invalid distance \"" + var2[0].method30899() + "\"");
            } else {
               float var6 = (float)Math.toRadians((double)(mc.player.rotationYaw + 90.0F));
               double var7 = (double) MathHelper.cos(var6) * var2[0].method30896();
               double var9 = (double) MathHelper.sin(var6) * var2[0].method30896();
               mc.getConnection()
                  .handlePlayerPosLook(
                     new SPlayerPositionLookPacket(
                        mc.player.getPosX() + var7,
                        mc.player.getPosY(),
                        mc.player.getPosZ() + var9,
                        mc.player.rotationYaw,
                        mc.player.rotationPitch,
                        Collections.<Flags>emptySet(),
                        0
                     )
                  );
               var3.method20327("Successfully HClip'd");
            }
         } else {
            throw new CommandException("Too many arguments");
         }
      } else {
         throw new CommandException();
      }
   }
}
