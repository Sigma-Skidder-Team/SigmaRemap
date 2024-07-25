package remapped;

import java.nio.FloatBuffer;
import org.lwjgl.opengl.ARBShaderObjects;

public class class_4701 extends class_6045 {
   private static String[] field_22854;
   private boolean field_22852;
   private FloatBuffer field_22853;

   public class_4701(String var1) {
      super(var1);
   }

   public void method_21675(boolean var1, FloatBuffer var2) {
      this.field_22852 = var1;
      this.field_22853 = var2;
      int var5 = this.method_27604();
      if (var5 >= 0) {
         method_27609();
         ARBShaderObjects.glUniformMatrix4fvARB(var5, var1, var2);
         this.method_27599();
      }
   }

   public float method_21674(int var1, int var2) {
      if (this.field_22853 != null) {
         int var5 = !this.field_22852 ? var1 * 4 + var2 : var2 * 4 + var1;
         return this.field_22853.get(var5);
      } else {
         return 0.0F;
      }
   }

   @Override
   public void method_27603(int var1) {
   }

   @Override
   public void method_27606() {
      this.field_22853 = null;
   }
}
