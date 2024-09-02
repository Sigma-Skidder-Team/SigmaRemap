package com.mentalfrostbyte.jello.command.impl;

import com.mentalfrostbyte.jello.command.Command;
import com.mentalfrostbyte.jello.command.CommandException;
import mapped.*;
import net.minecraft.item.ItemStack;
import net.minecraft.network.play.client.CCreativeInventoryActionPacket;
import net.minecraft.util.ResourceLocation;


public class Enchant extends Command {
   public Enchant() {
      super("enchant", "Enchants items in creative mode");
   }

   @Override
   public void run(String var1, Class8623[] var2, Class6669 var3) throws CommandException {
      if (var2.length == 2) {
         if (var2[1].method30895() == Class2193.field14336) {
            if (!mc.playerController.isNotCreative()) {
               Class6069 var6 = null;
               ItemStack var7 = mc.player.method3090().copy();

               for (ResourceLocation var9 : Registry.field16073.method9190()) {
                  if (var2[0].method30899().equals(var9.getPath())) {
                     var6 = Registry.field16073.method9184(var9);
                  }
               }

               if (var6 != null) {
                  var7.method32162(var6, var2[1].method30898());
                  mc.getConnection().sendPacket(new CCreativeInventoryActionPacket(36 + mc.player.inventory.currentItem, var7));
                  var3.method20327("Requested server to apply " + var2[0].method30899() + " " + var2[1].method30898());
               } else {
                  throw new CommandException("Unknown enchant '" + var2[0].method30899() + "");
               }
            } else {
               throw new CommandException("Creative mode only!");
            }
         } else {
            throw new CommandException("Enter a valid enchant value");
         }
      } else {
         throw new CommandException("Too many arguments");
      }
   }
}
