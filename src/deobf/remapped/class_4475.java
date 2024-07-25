package remapped;

import net.minecraft.util.text.Style;

public class class_4475 {
   private static final class_4475 field_21812 = new class_4475(
      "", new class_511(0, 0), true, new int[]{0}, new class_3520[]{new class_3520(Style.EMPTY, "", 0, 0)}, new class_8697[0]
   );
   private final String field_21808;
   private final class_511 field_21811;
   private final boolean field_21810;
   private final int[] field_21806;
   private final class_3520[] field_21807;
   private final class_8697[] field_21813;

   public class_4475(String var1, class_511 var2, boolean var3, int[] var4, class_3520[] var5, class_8697[] var6) {
      this.field_21808 = var1;
      this.field_21811 = var2;
      this.field_21810 = var3;
      this.field_21806 = var4;
      this.field_21807 = var5;
      this.field_21813 = var6;
   }

   public int method_20761(TextRenderer var1, class_511 var2) {
      int var5 = var2.field_3150 / 9;
      if (var5 >= 0) {
         if (var5 < this.field_21807.length) {
            class_3520 var6 = this.field_21807[var5];
            return this.field_21806[var5] + var1.method_45381().func_238352_a_(class_3520.method_16247(var6), var2.field_3149, class_3520.method_16246(var6));
         } else {
            return this.field_21808.length();
         }
      } else {
         return 0;
      }
   }

   public int method_20763(int var1, int var2) {
      int var5 = class_4047.method_18664(this.field_21806, var1);
      int var6 = var5 + var2;
      int var7;
      if (0 <= var6 && var6 < this.field_21806.length) {
         int var8 = var1 - this.field_21806[var5];
         int var9 = class_3520.method_16247(this.field_21807[var6]).length();
         var7 = this.field_21806[var6] + Math.min(var8, var9);
      } else {
         var7 = var1;
      }

      return var7;
   }

   public int method_20768(int var1) {
      int var4 = class_4047.method_18664(this.field_21806, var1);
      return this.field_21806[var4];
   }

   public int method_20760(int var1) {
      int var4 = class_4047.method_18664(this.field_21806, var1);
      return this.field_21806[var4] + class_3520.method_16247(this.field_21807[var4]).length();
   }
}
