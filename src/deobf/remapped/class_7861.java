package remapped;

import java.nio.Buffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.EXTFramebufferObject;
import org.lwjgl.opengl.GL11;
import org.newdawn.slick.SlickException;

public class class_7861 extends class_7501 {
   private class_8112 field_40253;
   private int field_40252;
   private boolean field_40250 = true;

   public class_7861(class_8112 var1) throws SlickException {
      super(var1.method_36897().method_38420(), var1.method_36897().method_38422());
      this.field_40253 = var1;
      class_2598.method_11781("Creating FBO " + var1.method_36877() + "x" + var1.method_36856());
      boolean var4 = true;
      if (var4) {
         this.method_35592();
      } else {
         throw new class_1162("Your OpenGL card does not support FBO and hence can't handle the dynamic images required for this application.");
      }
   }

   private void method_35590() throws SlickException {
      int var3 = EXTFramebufferObject.glCheckFramebufferStatusEXT(36160);
      switch (var3) {
         case 36053:
            return;
         case 36054:
            throw new class_1162("FrameBuffer: " + this.field_40252 + ", has caused a GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT_EXT exception");
         case 36055:
            throw new class_1162("FrameBuffer: " + this.field_40252 + ", has caused a GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT_EXT exception");
         case 36056:
         default:
            throw new class_1162("Unexpected reply from glCheckFramebufferStatusEXT: " + var3);
         case 36057:
            throw new class_1162("FrameBuffer: " + this.field_40252 + ", has caused a GL_FRAMEBUFFER_INCOMPLETE_DIMENSIONS_EXT exception");
         case 36058:
            throw new class_1162("FrameBuffer: " + this.field_40252 + ", has caused a GL_FRAMEBUFFER_INCOMPLETE_FORMATS_EXT exception");
         case 36059:
            throw new class_1162("FrameBuffer: " + this.field_40252 + ", has caused a GL_FRAMEBUFFER_INCOMPLETE_DRAW_BUFFER_EXT exception");
         case 36060:
            throw new class_1162("FrameBuffer: " + this.field_40252 + ", has caused a GL_FRAMEBUFFER_INCOMPLETE_READ_BUFFER_EXT exception");
      }
   }

   private void method_35592() throws SlickException {
      IntBuffer var3 = BufferUtils.createIntBuffer(1);
      EXTFramebufferObject.glGenFramebuffersEXT(var3);
      this.field_40252 = var3.get();

      try {
         class_8343 var4 = class_8256.method_37848()
            .method_37866(this.field_40253.method_36877(), this.field_40253.method_36856(), this.field_40253.method_36900());
         EXTFramebufferObject.glBindFramebufferEXT(36160, this.field_40252);
         EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36064, 3553, var4.method_38411(), 0);
         this.method_35590();
         this.method_35591();
         this.method_34162();
         this.method_34137();
         this.method_34150(this.field_40253, 0.0F, 0.0F);
         this.field_40253.method_36845(var4);
      } catch (Exception var5) {
         throw new class_1162("Failed to create new texture for FBO");
      }
   }

   private void method_35593() {
      EXTFramebufferObject.glBindFramebufferEXT(36160, this.field_40252);
      GL11.glReadBuffer(36064);
   }

   private void method_35591() {
      EXTFramebufferObject.glBindFramebufferEXT(36160, 0);
      GL11.glReadBuffer(1029);
   }

   @Override
   public void method_34146() {
      field_38269.method_5898();
      this.method_35591();
      GL11.glPopClientAttrib();
      GL11.glPopAttrib();
      GL11.glMatrixMode(5888);
      GL11.glPopMatrix();
      GL11.glMatrixMode(5889);
      GL11.glPopMatrix();
      GL11.glMatrixMode(5888);
      class_3390.method_15663();
   }

   @Override
   public void method_34185() {
      if (this.field_40250) {
         class_3390.method_15660();
         GL11.glPushAttrib(1048575);
         GL11.glPushClientAttrib(1048575);
         GL11.glMatrixMode(5889);
         GL11.glPushMatrix();
         GL11.glMatrixMode(5888);
         GL11.glPushMatrix();
         this.method_35593();
         this.method_35594();
      } else {
         throw new RuntimeException("Attempt to use a destroy()ed offscreen graphics context.");
      }
   }

   public void method_35594() {
      GL11.glEnable(3553);
      GL11.glShadeModel(7425);
      GL11.glDisable(2929);
      GL11.glDisable(2896);
      GL11.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
      GL11.glClearDepth(1.0);
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      GL11.glViewport(0, 0, this.field_38278, this.field_38267);
      GL11.glMatrixMode(5888);
      GL11.glLoadIdentity();
      this.method_35595();
   }

   public void method_35595() {
      GL11.glMatrixMode(5889);
      GL11.glLoadIdentity();
      GL11.glOrtho(0.0, (double)this.field_38278, 0.0, (double)this.field_38267, 1.0, -1.0);
      GL11.glMatrixMode(5888);
   }

   @Override
   public void method_34173() {
      super.method_34173();
      IntBuffer var3 = BufferUtils.createIntBuffer(1);
      var3.put(this.field_40252);
      ((Buffer)var3).flip();
      EXTFramebufferObject.glDeleteFramebuffersEXT(var3);
      this.field_40250 = false;
   }

   @Override
   public void method_34137() {
      super.method_34137();
      this.field_40253.method_36842();
   }
}
