package remapped;

import org.lwjgl.opengl.GL11;

public class class_8111 {
   private static String[] field_41544;
   private final int field_41545;
   private boolean field_41543;

   public class_8111(int var1) {
      this.field_41545 = var1;
   }

   public void method_36839() {
      this.method_36838(false);
   }

   public void method_36841() {
      this.method_36838(true);
   }

   public void method_36838(boolean var1) {
      class_3542.method_16431(class_3542::method_16440);
      if (var1 != this.field_41543) {
         this.field_41543 = var1;
         if (!var1) {
            GL11.glDisable(this.field_41545);
         } else {
            GL11.glEnable(this.field_41545);
         }
      }
   }
}
