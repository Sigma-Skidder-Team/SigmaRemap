package com.mentalfrostbyte.jello.command.impl;

import com.mentalfrostbyte.jello.command.Command;
import com.mentalfrostbyte.jello.command.CommandException;
import com.mentalfrostbyte.jello.command.ChatCommandExecutor;
import mapped.*;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.play.client.CCreativeInventoryActionPacket;


public class KillPotion extends Command {
   public KillPotion() {
      super("killpotion", "Gives you a potion to kill creative players!");
   }

   @Override
   public void run(String var1, ChatCommandArguments[] args, ChatCommandExecutor class6669) throws CommandException {
      if (args.length <= 0) {
         if (!mc.playerController.isNotCreative()) {
            ItemStack itemStack = new ItemStack(Items.field38115);
            CompoundNBT nbt = new CompoundNBT();
            nbt.putInt("Amplifier", 125);
            nbt.putInt("Duration", 2000);
            nbt.putInt("Id", 6);
            ListNBT listNBT = new ListNBT();
            listNBT.add(nbt);
            itemStack.setTagInfo("CustomPotionEffects", listNBT);
            mc.getConnection().sendPacket(new CCreativeInventoryActionPacket(36 + InvManagerUtils.isHotbarEmpty(), itemStack));
            class6669.send("Requested server a killpotion!");
         } else {
            throw new CommandException("Creative mode only!");
         }
      } else {
         throw new CommandException("Too many arguments");
      }
   }
}
