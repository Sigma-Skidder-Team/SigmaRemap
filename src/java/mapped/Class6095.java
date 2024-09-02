package mapped;

import net.minecraft.item.ItemStack;

import java.util.Random;

public class Class6095 extends Class6069 {
   private static String[] field27339;

   public Class6095(Class1937 var1, Class2106... var2) {
      super(var1, Class2242.field14679, var2);
   }

   @Override
   public int method18807(int var1) {
      return 5 + (var1 - 1) * 8;
   }

   @Override
   public int method18808(int var1) {
      return super.method18807(var1) + 50;
   }

   @Override
   public int method18809() {
      return 3;
   }

   @Override
   public boolean method18821(ItemStack var1) {
      return !var1.method32115() ? super.method18821(var1) : true;
   }

   public static boolean method18833(ItemStack var0, int var1, Random var2) {
      return var0.getItem() instanceof Class3279 && var2.nextFloat() < 0.6F ? false : var2.nextInt(var1 + 1) > 0;
   }
}
