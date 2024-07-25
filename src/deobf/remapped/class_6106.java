package remapped;

import java.util.List;

public final class class_6106 implements class_416 {
   private static String[] field_31234;

   public class_6106(List var1, class_9854 var2) {
      this.field_31233 = var1;
      this.field_31235 = var2;
   }

   @Override
   public int method_2067(class_7966 var1, int var2, int var3) {
      return this.method_2071(var1, var2, var3, 9, 16777215);
   }

   @Override
   public int method_2071(class_7966 var1, int var2, int var3, int var4, int var5) {
      int var8 = var3;

      for (class_9749 var10 : this.field_31233) {
         this.field_31235.method_45402(var1, class_9749.method_45017(var10), (float)(var2 - class_9749.method_45016(var10) / 2), (float)var8, var5);
         var8 += var4;
      }

      return var8;
   }

   @Override
   public int method_2074(class_7966 var1, int var2, int var3, int var4, int var5) {
      int var8 = var3;

      for (class_9749 var10 : this.field_31233) {
         this.field_31235.method_45402(var1, class_9749.method_45017(var10), (float)var2, (float)var8, var5);
         var8 += var4;
      }

      return var8;
   }

   @Override
   public int method_2068(class_7966 var1, int var2, int var3, int var4, int var5) {
      int var8 = var3;

      for (class_9749 var10 : this.field_31233) {
         this.field_31235.method_45382(var1, class_9749.method_45017(var10), (float)var2, (float)var8, var5);
         var8 += var4;
      }

      return var8;
   }

   @Override
   public int method_2072() {
      return this.field_31233.size();
   }
}
