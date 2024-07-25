package remapped;

public class class_9753 extends class_4785<class_9753> {
   private static String[] field_49556;
   private final class_7407 field_49554;

   public class_9753(class_1980 var1, class_7407 var2) {
      this.field_49555 = var1;
      this.field_49554 = var2;
   }

   @Override
   public void method_21644(class_7966 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, float var10) {
      this.method_45027(var1, this.field_49554, var4, var3, var7, var8);
   }

   private void method_45027(class_7966 var1, class_7407 var2, int var3, int var4, int var5, int var6) {
      int var9;
      if (var2.method_33749()) {
         if (!var2.method_33747()) {
            var9 = 16777215;
         } else {
            var9 = 8388479;
         }
      } else {
         var9 = 10526880;
      }

      class_1980.method_9121(this.field_49555)
         .method_45385(var1, var2.method_33746(), (float)(class_1980.method_9109(this.field_49555) + 3 + 12), (float)(var4 + 1), var9);
      if (!var2.method_33753()) {
         class_1980.method_9110(
            this.field_49555, var1, class_1980.method_9109(this.field_49555) + class_1980.method_9111(this.field_49555) - 10, var4 + 1, var5, var6
         );
      } else {
         class_1980.method_9113(
            this.field_49555, var1, class_1980.method_9109(this.field_49555) + class_1980.method_9111(this.field_49555) - 10, var4 + 1, var5, var6
         );
      }

      class_1980.method_9116(
         this.field_49555, var1, class_1980.method_9109(this.field_49555) + class_1980.method_9111(this.field_49555) - 22, var4 + 2, var5, var6
      );
      class_3570.method_16603(var2.method_33748(), () -> {
         class_3542.method_16480(1.0F, 1.0F, 1.0F, 1.0F);
         class_2089.method_9780(var1, class_1980.method_9109(this.field_49555) + 2 + 2, var4 + 1, 8, 8, 8.0F, 8.0F, 8, 8, 64, 64);
         class_2089.method_9780(var1, class_1980.method_9109(this.field_49555) + 2 + 2, var4 + 1, 8, 8, 40.0F, 8.0F, 8, 8, 64, 64);
      });
   }
}
