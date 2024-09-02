package com.mentalfrostbyte.jello.command.impl;

import com.mentalfrostbyte.jello.command.Command;
import com.mentalfrostbyte.jello.command.CommandException;
import mapped.*;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.play.client.CCreativeInventoryActionPacket;


public class KillPotion extends Command {
   public KillPotion() {
      super("killpotion", "Gives you a potion to kill creative players!");
   }

   @Override
   public void run(String var1, Class8623[] var2, Class6669 var3) throws CommandException {
      if (var2.length <= 0) {
         if (!mc.playerController.isNotCreative()) {
            ItemStack var6 = new ItemStack(Items.field38115);
            CompoundNBT var7 = new CompoundNBT();
            var7.method102("Amplifier", 125);
            var7.method102("Duration", 2000);
            var7.method102("Id", 6);
            ListNBT var8 = new ListNBT();
            var8.add(var7);
            var6.setTagInfo("CustomPotionEffects", var8);
            mc.getConnection().sendPacket(new CCreativeInventoryActionPacket(36 + Class7789.method25846(), var6));
            var3.method20327("Requested server a killpotion!");
         } else {
            throw new CommandException("Creative mode only!");
         }
      } else {
         throw new CommandException("Too many arguments");
      }
   }
}
