package mapped;

import org.newdawn.slick.opengl.renderer.Renderer;
import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.opengl.TextureImpl;
import org.lwjgl.opengl.GL11;


public abstract class Class8028 {
   private static Texture field34503;
   private static boolean field34504 = false;

   public static void method27525() {
      if (!field34504) {
         Renderer.get().flush();
         field34503 = TextureImpl.method36176();
         TextureImpl.bindNone();
         GL11.glPushAttrib(1048575);
         GL11.glPushClientAttrib(1048575);
         GL11.glMatrixMode(5888);
         GL11.glPushMatrix();
         GL11.glMatrixMode(5889);
         GL11.glPushMatrix();
         GL11.glMatrixMode(5888);
         field34504 = true;
      }
   }

   public static void method27526() {
      if (field34504) {
         GL11.glMatrixMode(5889);
         GL11.glPopMatrix();
         GL11.glMatrixMode(5888);
         GL11.glPopMatrix();
         GL11.glPopClientAttrib();
         GL11.glPopAttrib();
         if (field34503 == null) {
            TextureImpl.bindNone();
         } else {
            field34503.bind();
         }

         field34504 = false;
      }
   }

   public final void method27527() throws Class2451 {
      method27525();
      this.method27528();
      method27526();
   }

   public abstract void method27528() throws Class2451;
}
