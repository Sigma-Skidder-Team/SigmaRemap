package remapped;

import java.util.Arrays;

public final class class_5605 {
   private static String[] field_28441;
   public static final int field_28449 = 65535;
   public static final int field_28446 = 1;
   public static final int field_28447 = 2;
   public static final int field_28448 = 4;
   public static final int field_28450 = 5;
   public static final int field_28445 = 6;
   public static final int field_28443 = 7;
   public static final int field_28442 = 10;
   private int field_28444;
   private final int[] field_28440 = new int[10];

   public void method_25445() {
      this.field_28444 = 0;
      Arrays.fill(this.field_28440, 0);
   }

   public class_5605 method_25455(int var1, int var2) {
      if (var1 < this.field_28440.length) {
         int var5 = 1 << var1;
         this.field_28444 |= var5;
         this.field_28440[var1] = var2;
         return this;
      } else {
         return this;
      }
   }

   public boolean method_25450(int var1) {
      int var4 = 1 << var1;
      return (this.field_28444 & var4) != 0;
   }

   public int method_25453(int var1) {
      return this.field_28440[var1];
   }

   public int method_25448() {
      return Integer.bitCount(this.field_28444);
   }

   public int method_25451() {
      byte var3 = 2;
      return (var3 & this.field_28444) == 0 ? -1 : this.field_28440[1];
   }

   public boolean method_25454(boolean var1) {
      byte var4 = 4;
      return ((var4 & this.field_28444) == 0 ? (!var1 ? 0 : 1) : this.field_28440[2]) == 1;
   }

   public int method_25447(int var1) {
      byte var4 = 16;
      return (var4 & this.field_28444) == 0 ? var1 : this.field_28440[4];
   }

   public int method_25446(int var1) {
      byte var4 = 32;
      return (var4 & this.field_28444) == 0 ? var1 : this.field_28440[5];
   }

   public int method_25449(int var1) {
      byte var4 = 64;
      return (var4 & this.field_28444) == 0 ? var1 : this.field_28440[6];
   }

   public int method_25452() {
      short var3 = 128;
      return (var3 & this.field_28444) == 0 ? 65535 : this.field_28440[7];
   }

   public void method_25456(class_5605 var1) {
      for (int var4 = 0; var4 < 10; var4++) {
         if (var1.method_25450(var4)) {
            this.method_25455(var4, var1.method_25453(var4));
         }
      }
   }
}
