package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

public class Class7236 {
   private static String[] field31088;
   private static final Random field31089 = new Random();

   public static void method22721(World var0, BlockPos var1, IInventory var2) {
      method22723(var0, (double)var1.getX(), (double)var1.getY(), (double)var1.getZ(), var2);
   }

   public static void method22722(World var0, Entity var1, IInventory var2) {
      method22723(var0, var1.getPosX(), var1.getPosY(), var1.getPosZ(), var2);
   }

   private static void method22723(World var0, double var1, double var3, double var5, IInventory var7) {
      for (int var10 = 0; var10 < var7.getSizeInventory(); var10++) {
         method22725(var0, var1, var3, var5, var7.getStackInSlot(var10));
      }
   }

   public static void method22724(World var0, BlockPos var1, NonNullList<ItemStack> var2) {
      var2.forEach(var2x -> method22725(var0, (double)var1.getX(), (double)var1.getY(), (double)var1.getZ(), var2x));
   }

   public static void method22725(World var0, double var1, double var3, double var5, ItemStack var7) {
      double var10 = (double) EntityType.ITEM.method33213();
      double var12 = 1.0 - var10;
      double var14 = var10 / 2.0;
      double var16 = Math.floor(var1) + field31089.nextDouble() * var12 + var14;
      double var18 = Math.floor(var3) + field31089.nextDouble() * var12;
      double var20 = Math.floor(var5) + field31089.nextDouble() * var12 + var14;

      while (!var7.isEmpty()) {
         ItemEntity var22 = new ItemEntity(var0, var16, var18, var20, var7.split(field31089.nextInt(21) + 10));
         float var23 = 0.05F;
         var22.setMotion(field31089.nextGaussian() * 0.05F, field31089.nextGaussian() * 0.05F + 0.2F, field31089.nextGaussian() * 0.05F);
         var0.addEntity(var22);
      }
   }
}
