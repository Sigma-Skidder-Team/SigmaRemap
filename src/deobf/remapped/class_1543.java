package remapped;

import java.util.List;

public abstract class class_1543 {
   public final int field_8156;
   public final int field_8158;
   public final int field_8157;
   public final int field_8159;

   public class_1543(int var1, int var2, int var3, int var4) {
      this.field_8156 = var1;
      this.field_8158 = var2;
      this.field_8157 = var3;
      this.field_8159 = var4;
   }

   public void method_6991(class_7966 var1, int var2, int var3, int var4, int var5) {
      int var8 = var2 + this.field_8157;
      int var9 = var3 + this.field_8159;
      boolean var10 = false;
      if (var4 >= var8 && var4 <= var8 + this.field_8156 && var5 >= var9 && var5 <= var9 + this.field_8158) {
         var10 = true;
      }

      this.method_6993(var1, var8, var9, var10);
   }

   public abstract void method_6993(class_7966 var1, int var2, int var3, boolean var4);

   public int method_6990() {
      return this.field_8157 + this.field_8156;
   }

   public int method_6996() {
      return this.field_8159 + this.field_8158;
   }

   public abstract void method_6992(int var1);

   public static void method_6994(class_7966 var0, List<class_1543> var1, class_7346<?> var2, int var3, int var4, int var5, int var6) {
      for (class_1543 var10 : var1) {
         if (var2.method_36195() > var10.method_6990()) {
            var10.method_6991(var0, var3, var4, var5, var6);
         }
      }
   }

   public static void method_6995(class_7346<?> var0, class_4785<?> var1, List<class_1543> var2, int var3, double var4, double var6) {
      if (var3 == 0) {
         int var10 = var0.method_41183().indexOf(var1);
         if (var10 > -1) {
            var0.method_33482(var10);
            int var11 = var0.method_36229();
            int var12 = var0.method_36224(var10);
            int var13 = (int)(var4 - (double)var11);
            int var14 = (int)(var6 - (double)var12);

            for (class_1543 var16 : var2) {
               if (var13 >= var16.field_8157 && var13 <= var16.method_6990() && var14 >= var16.field_8159 && var14 <= var16.method_6996()) {
                  var16.method_6992(var10);
               }
            }
         }
      }
   }
}
