package mapped;

import java.nio.FloatBuffer;
import org.lwjgl.opengl.ARBShaderObjects;

public class Class3615 extends Class3614 {
   private static String[] field19603;
   private boolean field19604;
   private FloatBuffer field19605;

   public Class3615(String var1) {
      super(var1);
   }

   public void method12247(boolean var1, FloatBuffer var2) {
      this.field19604 = var1;
      this.field19605 = var2;
      int var5 = this.method12241();
      if (var5 >= 0) {
         method12246();
         ARBShaderObjects.glUniformMatrix4fvARB(var5, var1, var2);
         this.method12245();
      }
   }

   public float method12248(int var1, int var2) {
      if (this.field19605 != null) {
         int var5 = !this.field19604 ? var1 * 4 + var2 : var2 * 4 + var1;
         return this.field19605.get(var5);
      } else {
         return 0.0F;
      }
   }

   @Override
   public void method12235(int var1) {
   }

   @Override
   public void method12236() {
      this.field19605 = null;
   }
}
