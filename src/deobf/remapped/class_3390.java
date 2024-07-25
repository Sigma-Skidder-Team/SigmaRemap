package remapped;

import org.lwjgl.opengl.GL11;
import org.newdawn.slick.SlickException;

public abstract class class_3390 {
   private static class_8343 field_16698;
   private static boolean field_16699 = false;

   public static void method_15660() {
      if (!field_16699) {
         class_3980.method_18363().method_5898();
         field_16698 = class_9162.method_42220();
         class_9162.method_42217();
         GL11.glPushAttrib(1048575);
         GL11.glPushClientAttrib(1048575);
         GL11.glMatrixMode(5888);
         GL11.glPushMatrix();
         GL11.glMatrixMode(5889);
         GL11.glPushMatrix();
         GL11.glMatrixMode(5888);
         field_16699 = true;
      }
   }

   public static void method_15663() {
      if (field_16699) {
         GL11.glMatrixMode(5889);
         GL11.glPopMatrix();
         GL11.glMatrixMode(5888);
         GL11.glPopMatrix();
         GL11.glPopClientAttrib();
         GL11.glPopAttrib();
         if (field_16698 == null) {
            class_9162.method_42217();
         } else {
            field_16698.method_38419();
         }

         field_16699 = false;
      }
   }

   public final void method_15659() throws SlickException {
      method_15660();
      this.method_15662();
      method_15663();
   }

   public abstract void method_15662() throws SlickException;
}
