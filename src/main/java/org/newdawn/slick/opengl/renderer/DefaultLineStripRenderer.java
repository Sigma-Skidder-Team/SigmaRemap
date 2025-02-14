package org.newdawn.slick.opengl.renderer;

public class DefaultLineStripRenderer implements LineStripRenderer {
   private static String[] field31431;
   private SGL field31432 = Renderer.get();

   @Override
   public void method23241() {
      this.field31432.glEnd();
   }

   @Override
   public void method23245(boolean var1) {
      if (!var1) {
         this.field31432.glDisable(2848);
      } else {
         this.field31432.glEnable(2848);
      }
   }

   @Override
   public void method23244(float var1) {
      this.field31432.glLineWidth(var1);
   }

   @Override
   public void start() {
      this.field31432.glBegin(3);
   }

   @Override
   public void method23242(float var1, float var2) {
      this.field31432.glVertex2f(var1, var2);
   }

   @Override
   public void color(float r, float g, float b, float a) {
      this.field31432.glColor4f(r, g, b, a);
   }

   @Override
   public void setLineCaps(boolean var1) {
   }

   @Override
   public boolean applyGLLineFixes() {
      return true;
   }
}
