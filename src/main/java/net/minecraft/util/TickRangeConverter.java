package net.minecraft.util;

public class TickRangeConverter {
   private static String[] field39451;

   public static RangedInteger convertRange(int var0, int var1) {
      return new RangedInteger(var0 * 20, var1 * 20);
   }
}
