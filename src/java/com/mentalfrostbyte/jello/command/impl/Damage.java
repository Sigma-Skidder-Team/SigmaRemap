package com.mentalfrostbyte.jello.command.impl;

import com.mentalfrostbyte.jello.command.Command;
import com.mentalfrostbyte.jello.command.CommandException;
import com.mentalfrostbyte.jello.command.CommandType;
import com.mentalfrostbyte.jello.command.ChatCommandExecutor;
import mapped.ChatCommandArguments;
import net.minecraft.network.play.client.CPlayerPacket;

public class Damage extends Command {
   public Damage() {
      super("damage", "Damages you", "dmg");
      this.registerSubCommands(new String[]{"hearts"});
   }

   @Override
   public void run(String var1, ChatCommandArguments[] var2, ChatCommandExecutor var3) throws CommandException {
      if (var2.length == 0) {
         throw new CommandException();
      } else if (var2.length > 1) {
         throw new CommandException("Too many arguments");
      } else if (var2[0].getCommandType() != CommandType.field14336) {
         throw new CommandException("Invalid heart damage amount \"" + var2[0].getArguments() + "\"");
      } else {
         for (int var6 = 0; (double)var6 < 80.0 + 40.0 * (var2[0].method30896() - 0.5); var6++) {
            mc.getConnection()
               .sendPacket(
                  new CPlayerPacket.PositionPacket(mc.player.getPosX(), mc.player.getPosY() + 0.06, mc.player.getPosZ(), false)
               );
            mc.getConnection()
               .sendPacket(new CPlayerPacket.PositionPacket(mc.player.getPosX(), mc.player.getPosY(), mc.player.getPosZ(), false));
         }

         mc.getConnection()
            .sendPacket(new CPlayerPacket.PositionPacket(mc.player.getPosX(), mc.player.getPosY(), mc.player.getPosZ(), false));
         mc.getConnection()
            .sendPacket(new CPlayerPacket.PositionPacket(mc.player.getPosX(), mc.player.getPosY() + 0.02, mc.player.getPosZ(), false));
         var3.send("Sent damage packets");
      }
   }
}
