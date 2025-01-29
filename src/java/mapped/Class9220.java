package mapped;

import java.nio.Buffer;
import java.nio.IntBuffer;

import lol.InternalTextureLoader;
import org.newdawn.slick.util.Log;
import lol.Texture;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.EXTFramebufferObject;
import org.lwjgl.opengl.GL11;


public class Class9220 extends Class9219 {
   private Image field42446;
   private int field42447;
   private boolean field42448 = true;

   public Class9220(Image var1) throws Class2451 {
      super(var1.method23565().getTextureWidth(), var1.method23565().getTextureHeight());
      this.field42446 = var1;
      Log.debug("Creating FBO " + var1.method23558() + "x" + var1.method23559());
      boolean var4 = true;
      if (var4) {
         this.method34667();
      } else {
         throw new Class2451("Your OpenGL card does not support FBO and hence can't handle the dynamic images required for this application.");
      }
   }

   private void method34666() throws Class2451 {
      int var3 = EXTFramebufferObject.glCheckFramebufferStatusEXT(36160);
      switch (var3) {
         case 36053:
            return;
         case 36054:
            throw new Class2451("FrameBuffer: " + this.field42447 + ", has caused a GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT_EXT exception");
         case 36055:
            throw new Class2451("FrameBuffer: " + this.field42447 + ", has caused a GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT_EXT exception");
         case 36056:
         default:
            throw new Class2451("Unexpected reply from glCheckFramebufferStatusEXT: " + var3);
         case 36057:
            throw new Class2451("FrameBuffer: " + this.field42447 + ", has caused a GL_FRAMEBUFFER_INCOMPLETE_DIMENSIONS_EXT exception");
         case 36058:
            throw new Class2451("FrameBuffer: " + this.field42447 + ", has caused a GL_FRAMEBUFFER_INCOMPLETE_FORMATS_EXT exception");
         case 36059:
            throw new Class2451("FrameBuffer: " + this.field42447 + ", has caused a GL_FRAMEBUFFER_INCOMPLETE_DRAW_BUFFER_EXT exception");
         case 36060:
            throw new Class2451("FrameBuffer: " + this.field42447 + ", has caused a GL_FRAMEBUFFER_INCOMPLETE_READ_BUFFER_EXT exception");
      }
   }

   private void method34667() throws Class2451 {
      IntBuffer var3 = BufferUtils.createIntBuffer(1);
      EXTFramebufferObject.glGenFramebuffersEXT(var3);
      this.field42447 = var3.get();

      try {
         Texture var4 = InternalTextureLoader.get().method35798(this.field42446.method23558(), this.field42446.method23559(), this.field42446.method23512());
         EXTFramebufferObject.glBindFramebufferEXT(36160, this.field42447);
         EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36064, 3553, var4.getTextureID(), 0);
         this.method34666();
         this.method34669();
         this.method34599();
         this.method34594();
         this.method34652(this.field42446, 0.0F, 0.0F);
         this.field42446.method23510(var4);
      } catch (Exception var5) {
         throw new Class2451("Failed to create new texture for FBO");
      }
   }

   private void method34668() {
      EXTFramebufferObject.glBindFramebufferEXT(36160, this.field42447);
      GL11.glReadBuffer(36064);
   }

   private void method34669() {
      EXTFramebufferObject.glBindFramebufferEXT(36160, 0);
      GL11.glReadBuffer(1029);
   }

   @Override
   public void method34595() {
      field42419.flush();
      this.method34669();
      GL11.glPopClientAttrib();
      GL11.glPopAttrib();
      GL11.glMatrixMode(5888);
      GL11.glPopMatrix();
      GL11.glMatrixMode(5889);
      GL11.glPopMatrix();
      GL11.glMatrixMode(5888);
      Class8028.method27526();
   }

   @Override
   public void method34593() {
      if (this.field42448) {
         Class8028.method27525();
         GL11.glPushAttrib(1048575);
         GL11.glPushClientAttrib(1048575);
         GL11.glMatrixMode(5889);
         GL11.glPushMatrix();
         GL11.glMatrixMode(5888);
         GL11.glPushMatrix();
         this.method34668();
         this.method34670();
      } else {
         throw new RuntimeException("Attempt to use a destroy()ed offscreen graphics context.");
      }
   }

   public void method34670() {
      GL11.glEnable(3553);
      GL11.glShadeModel(7425);
      GL11.glDisable(2929);
      GL11.glDisable(2896);
      GL11.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
      GL11.glClearDepth(1.0);
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      GL11.glViewport(0, 0, this.field42434, this.field42435);
      GL11.glMatrixMode(5888);
      GL11.glLoadIdentity();
      this.method34671();
   }

   public void method34671() {
      GL11.glMatrixMode(5889);
      GL11.glLoadIdentity();
      GL11.glOrtho(0.0, (double)this.field42434, 0.0, (double)this.field42435, 1.0, -1.0);
      GL11.glMatrixMode(5888);
   }

   @Override
   public void method34665() {
      super.method34665();
      IntBuffer var3 = BufferUtils.createIntBuffer(1);
      var3.put(this.field42447);
      ((Buffer)var3).flip();
      EXTFramebufferObject.glDeleteFramebuffersEXT(var3);
      this.field42448 = false;
   }

   @Override
   public void method34594() {
      super.method34594();
      this.field42446.method23570();
   }
}
