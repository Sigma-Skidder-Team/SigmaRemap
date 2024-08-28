package mapped;

import net.minecraft.util.text.Style;

public class Class8398 {
   private static final Class8398 field36036 = new Class8398(
      "", new Class6178(0, 0), true, new int[]{0}, new Class8067[]{new Class8067(Style.EMPTY, "", 0, 0)}, new Class9518[0]
   );
   private final String field36037;
   private final Class6178 field36038;
   private final boolean field36039;
   private final int[] field36040;
   private final Class8067[] field36041;
   private final Class9518[] field36042;

   public Class8398(String var1, Class6178 var2, boolean var3, int[] var4, Class8067[] var5, Class9518[] var6) {
      this.field36037 = var1;
      this.field36038 = var2;
      this.field36039 = var3;
      this.field36040 = var4;
      this.field36041 = var5;
      this.field36042 = var6;
   }

   public int method29481(Class9834 var1, Class6178 var2) {
      int var5 = var2.field27615 / 9;
      if (var5 >= 0) {
         if (var5 < this.field36041.length) {
            Class8067 var6 = this.field36041[var5];
            return this.field36040[var5] + var1.method38830().func_238352_a_(Class8067.method27768(var6), var2.field27614, Class8067.method27769(var6));
         } else {
            return this.field36037.length();
         }
      } else {
         return 0;
      }
   }

   public int method29482(int var1, int var2) {
      int var5 = Class828.method2535(this.field36040, var1);
      int var6 = var5 + var2;
      int var7;
      if (0 <= var6 && var6 < this.field36040.length) {
         int var8 = var1 - this.field36040[var5];
         int var9 = Class8067.method27768(this.field36041[var6]).length();
         var7 = this.field36040[var6] + Math.min(var8, var9);
      } else {
         var7 = var1;
      }

      return var7;
   }

   public int method29483(int var1) {
      int var4 = Class828.method2535(this.field36040, var1);
      return this.field36040[var4];
   }

   public int method29484(int var1) {
      int var4 = Class828.method2535(this.field36040, var1);
      return this.field36040[var4] + Class8067.method27768(this.field36041[var4]).length();
   }

   // $VF: synthetic method
   public static Class8398 method29485() {
      return field36036;
   }

   // $VF: synthetic method
   public static Class8067[] method29486(Class8398 var0) {
      return var0.field36041;
   }

   // $VF: synthetic method
   public static Class9518[] method29487(Class8398 var0) {
      return var0.field36042;
   }

   // $VF: synthetic method
   public static Class6178 method29488(Class8398 var0) {
      return var0.field36038;
   }

   // $VF: synthetic method
   public static boolean method29489(Class8398 var0) {
      return var0.field36039;
   }
}
