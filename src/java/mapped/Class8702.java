package mapped;

import java.util.Arrays;

public final class Class8702 {
   private static String[] field39284;
   public static final int field39285 = 65535;
   public static final int field39286 = 1;
   public static final int field39287 = 2;
   public static final int field39288 = 4;
   public static final int field39289 = 5;
   public static final int field39290 = 6;
   public static final int field39291 = 7;
   public static final int field39292 = 10;
   private int field39293;
   private final int[] field39294 = new int[10];

   public void method31375() {
      this.field39293 = 0;
      Arrays.fill(this.field39294, 0);
   }

   public Class8702 method31376(int var1, int var2) {
      if (var1 < this.field39294.length) {
         int var5 = 1 << var1;
         this.field39293 |= var5;
         this.field39294[var1] = var2;
         return this;
      } else {
         return this;
      }
   }

   public boolean method31377(int var1) {
      int var4 = 1 << var1;
      return (this.field39293 & var4) != 0;
   }

   public int method31378(int var1) {
      return this.field39294[var1];
   }

   public int method31379() {
      return Integer.bitCount(this.field39293);
   }

   public int method31380() {
      byte var3 = 2;
      return (var3 & this.field39293) == 0 ? -1 : this.field39294[1];
   }

   public boolean method31381(boolean var1) {
      byte var4 = 4;
      return ((var4 & this.field39293) == 0 ? (!var1 ? 0 : 1) : this.field39294[2]) == 1;
   }

   public int method31382(int var1) {
      byte var4 = 16;
      return (var4 & this.field39293) == 0 ? var1 : this.field39294[4];
   }

   public int method31383(int var1) {
      byte var4 = 32;
      return (var4 & this.field39293) == 0 ? var1 : this.field39294[5];
   }

   public int method31384(int var1) {
      byte var4 = 64;
      return (var4 & this.field39293) == 0 ? var1 : this.field39294[6];
   }

   public int method31385() {
      short var3 = 128;
      return (var3 & this.field39293) == 0 ? 65535 : this.field39294[7];
   }

   public void method31386(Class8702 var1) {
      for (int var4 = 0; var4 < 10; var4++) {
         if (var1.method31377(var4)) {
            this.method31376(var4, var1.method31378(var4));
         }
      }
   }
}
