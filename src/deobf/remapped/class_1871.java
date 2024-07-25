package remapped;

import javax.annotation.Nullable;

public abstract class class_1871 implements class_5120 {
   public final class_2770 field_9479;

   public class_1871(class_2770 var1) {
      this.field_9479 = var1;
   }

   @Override
   public boolean method_23472() {
      return false;
   }

   @Override
   public void method_23466() {
   }

   @Override
   public void method_23473() {
   }

   @Override
   public void method_23468(class_3577 var1, class_1331 var2, class_6199 var3, class_704 var4) {
   }

   @Override
   public void method_23469() {
   }

   @Override
   public void method_23471() {
   }

   @Override
   public float method_23470() {
      return 0.6F;
   }

   @Nullable
   @Override
   public class_1343 method_23463() {
      return null;
   }

   @Override
   public float method_23467(class_6199 var1, float var2) {
      return var2;
   }

   @Override
   public float method_23465() {
      float var3 = class_9299.method_42842(class_8145.method_37266(this.field_9479.method_37098())) + 1.0F;
      float var4 = Math.min(var3, 40.0F);
      return 0.7F / var4 / var3;
   }
}
