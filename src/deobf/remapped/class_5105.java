package remapped;

import java.util.Random;

public abstract class class_5105<T extends LivingEntity, M extends class_3169<T>> extends class_4171<T, M> {
   public class_5105(class_6353<T, M> var1) {
      super(var1);
   }

   public abstract int method_23423(T var1);

   public abstract void method_23424(class_7966 var1, class_2565 var2, int var3, Entity var4, float var5, float var6, float var7, float var8);

   public void method_23422(class_7966 var1, class_2565 var2, int var3, T var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      int var13 = this.method_23423((T)var4);
      Random var14 = new Random((long)var4.method_37145());
      if (var13 > 0) {
         for (int var15 = 0; var15 < var13; var15++) {
            var1.method_36063();
            class_1549 var16 = this.method_19347().method_14620(var14);
            class_9230 var17 = var16.method_7047(var14);
            var16.method_7057(var1);
            float var18 = var14.nextFloat();
            float var19 = var14.nextFloat();
            float var20 = var14.nextFloat();
            float var21 = class_9299.method_42795(var18, var17.field_47182, var17.field_47181) / 16.0F;
            float var22 = class_9299.method_42795(var19, var17.field_47180, var17.field_47184) / 16.0F;
            float var23 = class_9299.method_42795(var20, var17.field_47183, var17.field_47179) / 16.0F;
            var1.method_36065((double)var21, (double)var22, (double)var23);
            var18 = -1.0F * (var18 * 2.0F - 1.0F);
            var19 = -1.0F * (var19 * 2.0F - 1.0F);
            var20 = -1.0F * (var20 * 2.0F - 1.0F);
            this.method_23424(var1, var2, var3, var4, var18, var19, var20, var7);
            var1.method_36064();
         }
      }
   }
}
