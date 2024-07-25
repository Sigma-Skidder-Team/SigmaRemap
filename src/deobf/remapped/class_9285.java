package remapped;

import org.lwjgl.openal.AL10;

public class class_9285 {
   private static String[] field_47367;
   private float field_47366 = 1.0F;
   private class_1343 field_47365 = class_1343.field_7335;

   public void method_42756(class_1343 var1) {
      this.field_47365 = var1;
      AL10.alListener3f(4100, (float)var1.field_7336, (float)var1.field_7333, (float)var1.field_7334);
   }

   public class_1343 method_42755() {
      return this.field_47365;
   }

   public void method_42750(class_2426 var1, class_2426 var2) {
      AL10.alListenerfv(
         4111, new float[]{var1.method_11057(), var1.method_11061(), var1.method_11055(), var2.method_11057(), var2.method_11061(), var2.method_11055()}
      );
   }

   public void method_42753(float var1) {
      AL10.alListenerf(4106, var1);
      this.field_47366 = var1;
   }

   public float method_42751() {
      return this.field_47366;
   }

   public void method_42754() {
      this.method_42756(class_1343.field_7335);
      this.method_42750(class_2426.field_12082, class_2426.field_12074);
   }
}
