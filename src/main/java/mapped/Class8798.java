package mapped;

import org.newdawn.slick.opengl.renderer.Renderer;
import org.newdawn.slick.opengl.renderer.SGL;

public class Class8798 {
   public static SGL field39623 = Renderer.get();
   private Runnable field39624;
   private int field39625 = -1;

   public Class8798(Runnable var1) {
      this.field39624 = var1;
      this.method31762();
   }

   private void method31762() {
      if (this.field39625 != -1) {
         throw new RuntimeException("Attempt to build the display list more than once in CachedRender");
      } else {
         this.field39625 = field39623.glGenLists(1);
         Class8028.method27525();
         field39623.glNewList(this.field39625, 4864);
         this.field39624.run();
         field39623.glEndList();
         Class8028.method27526();
      }
   }

   public void method31763() {
      if (this.field39625 != -1) {
         Class8028.method27525();
         field39623.glCallList(this.field39625);
         Class8028.method27526();
      } else {
         throw new RuntimeException("Attempt to render cached operations that have been destroyed");
      }
   }

   public void method31764() {
      field39623.glDeleteLists(this.field39625, 1);
      this.field39625 = -1;
   }
}
