package net.minecraft.dispenser;

import mapped.*;
import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Direction;

public interface IDispenseItemBehavior {
   IDispenseItemBehavior field27722 = (var0, var1) -> var1;

   ItemStack method19196(IBlockSource var1, ItemStack var2);

   static void method19200() {
      DispenserBlock.method11931(Items.field37797, new Class6246());
      DispenserBlock.method11931(Items.field38117, new Class6248());
      DispenserBlock.method11931(Items.field38116, new Class6216());
      DispenserBlock.method11931(Items.EGG, new Class6250());
      DispenserBlock.method11931(Items.SNOWBALL, new Class6249());
      DispenserBlock.method11931(Items.EXPERIENCE_BOTTLE, new Class6247());
      DispenserBlock.method11931(Items.SPLASH_POTION, new Class6227());
      DispenserBlock.method11931(Items.field38118, new Class6228());
      Class6220 var2 = new Class6220();

      for (SpawnEggItem var4 : SpawnEggItem.method11854()) {
         DispenserBlock.method11931(var4, var2);
      }

      DispenserBlock.method11931(Items.ARMOR_STAND, new Class6221());
      DispenserBlock.method11931(Items.field37886, new Class6237());
      Class6242 var10 = new Class6242();
      DispenserBlock.method11931(Items.field38086, var10);
      DispenserBlock.method11931(Items.field38083, var10);
      DispenserBlock.method11931(Items.field38084, var10);
      DispenserBlock.method11931(Items.field38085, var10);
      DispenserBlock.method11931(Items.field37572, var10);
      DispenserBlock.method11931(Items.field37573, var10);
      DispenserBlock.method11931(Items.field37581, var10);
      DispenserBlock.method11931(Items.field37583, var10);
      DispenserBlock.method11931(Items.field37584, var10);
      DispenserBlock.method11931(Items.field37587, var10);
      DispenserBlock.method11931(Items.field37579, var10);
      DispenserBlock.method11931(Items.field37585, var10);
      DispenserBlock.method11931(Items.field37575, var10);
      DispenserBlock.method11931(Items.field37580, var10);
      DispenserBlock.method11931(Items.field37577, var10);
      DispenserBlock.method11931(Items.field37574, var10);
      DispenserBlock.method11931(Items.field37578, var10);
      DispenserBlock.method11931(Items.field37582, var10);
      DispenserBlock.method11931(Items.field37586, var10);
      DispenserBlock.method11931(Items.field37576, var10);
      DispenserBlock.method11931(Items.field37402, new Class6231());
      DispenserBlock.method11931(Items.field38068, new Class6223());
      DispenserBlock.method11931(Items.field38046, new Class6222());
      DispenserBlock.method11931(Items.OAK_BOAT, new Class6225(Class2099.field13680));
      DispenserBlock.method11931(Items.field38121, new Class6225(Class2099.field13681));
      DispenserBlock.method11931(Items.field38122, new Class6225(Class2099.field13682));
      DispenserBlock.method11931(Items.field38123, new Class6225(Class2099.field13683));
      DispenserBlock.method11931(Items.field38125, new Class6225(Class2099.field13685));
      DispenserBlock.method11931(Items.field38124, new Class6225(Class2099.field13684));
      Class6229 var11 = new Class6229();
      DispenserBlock.method11931(Items.LAVA_BUCKET, var11);
      DispenserBlock.method11931(Items.WATER_BUCKET, var11);
      DispenserBlock.method11931(Items.SALMON_BUCKET, var11);
      DispenserBlock.method11931(Items.field37894, var11);
      DispenserBlock.method11931(Items.field37892, var11);
      DispenserBlock.method11931(Items.field37895, var11);
      DispenserBlock.method11931(Items.BUCKET, new Class6243());
      DispenserBlock.method11931(Items.field37794, new Class6234());
      DispenserBlock.method11931(Items.field37934, new Class6241());
      DispenserBlock.method11931(Blocks.TNT, new Class6219());
      Class6239 var5 = new Class6239();
      DispenserBlock.method11931(Items.field38062, var5);
      DispenserBlock.method11931(Items.field38061, var5);
      DispenserBlock.method11931(Items.field38063, var5);
      DispenserBlock.method11931(Items.field38058, var5);
      DispenserBlock.method11931(Items.field38060, var5);
      DispenserBlock.method11931(Items.field38059, new Class6238());
      DispenserBlock.method11931(Blocks.CARVED_PUMPKIN, new Class6235());
      DispenserBlock.method11931(Blocks.field36896.asItem(), new Class6240());

      for (Class112 var9 : Class112.values()) {
         DispenserBlock.method11931(Class3368.method11956(var9).asItem(), new Class6240());
      }

      DispenserBlock.method11931(Items.field37972.asItem(), new Class6236());
      DispenserBlock.method11931(Items.field37446, new Class6232());
      DispenserBlock.method11931(Items.field37956.asItem(), new Class6233());
   }

   static void method19201(IBlockSource var0, Entity var1, Direction var2) {
      var1.setPosition(
         var0.getX() + (double)var2.getXOffset() * (0.5000099999997474 - (double)var1.getWidth() / 2.0),
         var0.getY() + (double)var2.getYOffset() * (0.5000099999997474 - (double)var1.getHeight() / 2.0) - (double)var1.getHeight() / 2.0,
         var0.getZ() + (double)var2.getZOffset() * (0.5000099999997474 - (double)var1.getWidth() / 2.0)
      );
   }
}
