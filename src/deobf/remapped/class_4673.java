package remapped;

import javax.annotation.Nullable;

public class class_4673 {
   private static String[] field_22783;
   private final int field_22788;
   private final int field_22787;
   private final int field_22786;
   private final int field_22781;
   private class_4673 field_22784;
   private class_4673 field_22782;
   private boolean field_22785;

   private class_4673(int var1, int var2, int var3, int var4) {
      this.field_22788 = var1;
      this.field_22787 = var2;
      this.field_22786 = var3;
      this.field_22781 = var4;
   }

   @Nullable
   public class_4673 method_21618(class_3354 var1) {
      if (this.field_22784 != null && this.field_22782 != null) {
         class_4673 var8 = this.field_22784.method_21618(var1);
         if (var8 == null) {
            var8 = this.field_22782.method_21618(var1);
         }

         return var8;
      } else if (!this.field_22785) {
         int var4 = var1.method_15371();
         int var5 = var1.method_15366();
         if (var4 > this.field_22786 || var5 > this.field_22781) {
            return null;
         } else if (var4 == this.field_22786 && var5 == this.field_22781) {
            this.field_22785 = true;
            return this;
         } else {
            int var6 = this.field_22786 - var4;
            int var7 = this.field_22781 - var5;
            if (var6 <= var7) {
               this.field_22784 = new class_4673(this.field_22788, this.field_22787, this.field_22786, var5);
               this.field_22782 = new class_4673(this.field_22788, this.field_22787 + var5 + 1, this.field_22786, this.field_22781 - var5 - 1);
            } else {
               this.field_22784 = new class_4673(this.field_22788, this.field_22787, var4, this.field_22781);
               this.field_22782 = new class_4673(this.field_22788 + var4 + 1, this.field_22787, this.field_22786 - var4 - 1, this.field_22781);
            }

            return this.field_22784.method_21618(var1);
         }
      } else {
         return null;
      }
   }
}
