package lol;

import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

import org.lwjgl.opengl.EXTSecondaryColor;
import org.lwjgl.opengl.GL11;
import org.newdawn.slick.opengl.renderer.SGL;

public class ImmediateModeOGLRenderer implements SGL {
   private static String[] field25733;
   private int field25734;
   private int field25735;
   private float[] field25736 = new float[]{1.0F, 1.0F, 1.0F, 1.0F};
   public float field25737 = 1.0F;

   @Override
   public void initDisplay(int var1, int var2) {
      this.field25734 = var1;
      this.field25735 = var2;
      String var5 = GL11.glGetString(7939);
      GL11.glEnable(3553);
      GL11.glShadeModel(7425);
      GL11.glDisable(2929);
      GL11.glDisable(2896);
      GL11.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
      GL11.glClearDepth(1.0);
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      GL11.glViewport(0, 0, var1, var2);
      GL11.glMatrixMode(5888);
   }

   @Override
   public void enterOrtho(int var1, int var2) {
      GL11.glMatrixMode(5889);
      GL11.glLoadIdentity();
      GL11.glOrtho(0.0, (double)this.field25734, (double)this.field25735, 0.0, 1.0, -1.0);
      GL11.glMatrixMode(5888);
      GL11.glTranslatef((float)((this.field25734 - var1) / 2), (float)((this.field25735 - var2) / 2), 0.0F);
   }

   @Override
   public void glBegin(int geomType) {
      GL11.glBegin(geomType);
   }

   @Override
   public void glBindTexture(int var1, int var2) {
      GL11.glBindTexture(var1, var2);
   }

   @Override
   public void glBlendFunc(int src, int dest) {
      GL11.glBlendFunc(src, dest);
   }

   @Override
   public void glCallList(int var1) {
      GL11.glCallList(var1);
   }

   @Override
   public void glClear(int var1) {
      GL11.glClear(var1);
   }

   @Override
   public void glClearColor(float var1, float var2, float var3, float var4) {
      GL11.glClearColor(var1, var2, var3, var4);
   }

   @Override
   public void glClipPlane(int var1, DoubleBuffer var2) {
      GL11.glClipPlane(var1, var2);
   }

   @Override
   public void glColor4f(float var1, float var2, float var3, float var4) {
      var4 *= this.field25737;
      this.field25736[0] = var1;
      this.field25736[1] = var2;
      this.field25736[2] = var3;
      this.field25736[3] = var4;
      GL11.glColor4f(var1, var2, var3, var4);
   }

   @Override
   public void glColorMask(boolean var1, boolean var2, boolean var3, boolean var4) {
      GL11.glColorMask(var1, var2, var3, var4);
   }

   @Override
   public void glCopyTexImage2D(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      GL11.glCopyTexImage2D(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   @Override
   public void glDeleteTextures(IntBuffer var1) {
      GL11.glDeleteTextures(var1);
   }

   @Override
   public void glDisable(int var1) {
      GL11.glDisable(var1);
   }

   @Override
   public void glEnable(int var1) {
      GL11.glEnable(var1);
   }

   @Override
   public void glEnd() {
      GL11.glEnd();
   }

   @Override
   public void glEndList() {
      GL11.glEndList();
   }

   @Override
   public int glGenLists(int count) {
      return GL11.glGenLists(count);
   }

   @Override
   public void glGetFloat(int var1, FloatBuffer var2) {
      GL11.glGetFloat(var1);
   }

   @Override
   public void glGetInteger(int var1, IntBuffer var2) {
      GL11.glGetInteger(var1);
   }

   @Override
   public void glGetTexImage(int var1, int var2, int var3, int var4, ByteBuffer var5) {
      GL11.glGetTexImage(var1, var2, var3, var4, var5);
   }

   @Override
   public void glLineWidth(float var1) {
      GL11.glLineWidth(var1);
   }

   @Override
   public void glLoadIdentity() {
      GL11.glLoadIdentity();
   }

   @Override
   public void glNewList(int id, int option) {
      GL11.glNewList(id, option);
   }

   @Override
   public void glPointSize(float var1) {
      GL11.glPointSize(var1);
   }

   @Override
   public void glPopMatrix() {
      GL11.glPopMatrix();
   }

   @Override
   public void glPushMatrix() {
      GL11.glPushMatrix();
   }

   @Override
   public void glReadPixels(int var1, int var2, int var3, int var4, int var5, int var6, ByteBuffer var7) {
      GL11.glReadPixels(var1, var2, var3, var4, var5, var6, var7);
   }

   @Override
   public void glRotatef(float var1, float var2, float var3, float var4) {
      GL11.glRotatef(var1, var2, var3, var4);
   }

   @Override
   public void glScalef(float var1, float var2, float var3) {
      GL11.glScalef(var1, var2, var3);
   }

   @Override
   public void glScissor(int var1, int var2, int var3, int var4) {
      GL11.glScissor(var1, var2, var3, var4);
   }

   @Override
   public void glTexCoord2f(float var1, float var2) {
      GL11.glTexCoord2f(var1, var2);
   }

   @Override
   public void glTexEnvi(int var1, int var2, int var3) {
      GL11.glTexEnvi(var1, var2, var3);
   }

   @Override
   public void glTranslatef(float var1, float var2, float var3) {
      GL11.glTranslatef(var1, var2, var3);
   }

   @Override
   public void glVertex2f(float var1, float var2) {
      GL11.glVertex2f(var1, var2);
   }

   @Override
   public void glVertex3f(float var1, float var2, float var3) {
      GL11.glVertex3f(var1, var2, var3);
   }

   @Override
   public void flush() {
   }

   @Override
   public void glTexParameteri(int var1, int var2, int var3) {
      GL11.glTexParameteri(var1, var2, var3);
   }

   @Override
   public float[] getCurrentColor() {
      return this.field25736;
   }

   @Override
   public void glDeleteLists(int list, int count) {
      GL11.glDeleteLists(list, count);
   }

   @Override
   public void glClearDepth(float var1) {
      GL11.glClearDepth((double)var1);
   }

   @Override
   public void glDepthFunc(int func) {
      GL11.glDepthFunc(func);
   }

   @Override
   public void glDepthMask(boolean var1) {
      GL11.glDepthMask(var1);
   }

   @Override
   public void setGlobalAlphaScale(float var1) {
      this.field25737 = var1;
   }

   @Override
   public void glLoadMatrix(FloatBuffer var1) {
      GL11.glLoadMatrixf(var1);
   }

   @Override
   public void glGenTextures(IntBuffer var1) {
      GL11.glGenTextures(var1);
   }

   @Override
   public void glGetError() {
      GL11.glGetError();
   }

   @Override
   public void glTexImage2D(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, ByteBuffer var9) {
      GL11.glTexImage2D(var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   @Override
   public void glTexSubImage2D(int glTexture2d, int i, int pageX, int pageY, int width, int height, int glBgra, int glUnsignedByte, ByteBuffer scratchByteBuffer) {
      GL11.glTexSubImage2D(glTexture2d, i, pageX, pageY, width, height, glBgra, glUnsignedByte, scratchByteBuffer);
   }

   @Override
   public boolean canTextureMirrorClamp() {
      return false;
   }

   @Override
   public boolean canSecondaryColor() {
      return false;
   }

   @Override
   public void glSecondaryColor3ubEXT(byte b, byte c, byte d) {
      EXTSecondaryColor.glSecondaryColor3ubEXT(b, c, d);
   }
}
