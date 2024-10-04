package lol;

import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

import org.lwjgl.opengl.EXTSecondaryColor;
import org.lwjgl.opengl.GL11;

public class ImmediateModeOGLRenderer implements SGL {
   private static String[] field25733;
   private int field25734;
   private int field25735;
   private float[] field25736 = new float[]{1.0F, 1.0F, 1.0F, 1.0F};
   public float field25737 = 1.0F;

   @Override
   public void method18367(int var1, int var2) {
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
   public void method18368(int var1, int var2) {
      GL11.glMatrixMode(5889);
      GL11.glLoadIdentity();
      GL11.glOrtho(0.0, (double)this.field25734, (double)this.field25735, 0.0, 1.0, -1.0);
      GL11.glMatrixMode(5888);
      GL11.glTranslatef((float)((this.field25734 - var1) / 2), (float)((this.field25735 - var2) / 2), 0.0F);
   }

   @Override
   public void method18369(int var1) {
      GL11.glBegin(var1);
   }

   @Override
   public void method18370(int var1, int var2) {
      GL11.glBindTexture(var1, var2);
   }

   @Override
   public void method18371(int var1, int var2) {
      GL11.glBlendFunc(var1, var2);
   }

   @Override
   public void method18372(int var1) {
      GL11.glCallList(var1);
   }

   @Override
   public void method18373(int var1) {
      GL11.glClear(var1);
   }

   @Override
   public void method18374(float var1, float var2, float var3, float var4) {
      GL11.glClearColor(var1, var2, var3, var4);
   }

   @Override
   public void method18375(int var1, DoubleBuffer var2) {
      GL11.glClipPlane(var1, var2);
   }

   @Override
   public void method18376(float var1, float var2, float var3, float var4) {
      var4 *= this.field25737;
      this.field25736[0] = var1;
      this.field25736[1] = var2;
      this.field25736[2] = var3;
      this.field25736[3] = var4;
      GL11.glColor4f(var1, var2, var3, var4);
   }

   @Override
   public void method18377(boolean var1, boolean var2, boolean var3, boolean var4) {
      GL11.glColorMask(var1, var2, var3, var4);
   }

   @Override
   public void method18378(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      GL11.glCopyTexImage2D(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   @Override
   public void method18379(IntBuffer var1) {
      GL11.glDeleteTextures(var1);
   }

   @Override
   public void method18380(int var1) {
      GL11.glDisable(var1);
   }

   @Override
   public void method18381(int var1) {
      GL11.glEnable(var1);
   }

   @Override
   public void method18382() {
      GL11.glEnd();
   }

   @Override
   public void method18383() {
      GL11.glEndList();
   }

   @Override
   public int method18384(int var1) {
      return GL11.glGenLists(var1);
   }

   @Override
   public void method18385(int var1, FloatBuffer var2) {
      GL11.glGetFloat(var1);
   }

   @Override
   public void method18386(int var1, IntBuffer var2) {
      GL11.glGetInteger(var1);
   }

   @Override
   public void method18387(int var1, int var2, int var3, int var4, ByteBuffer var5) {
      GL11.glGetTexImage(var1, var2, var3, var4, var5);
   }

   @Override
   public void method18388(float var1) {
      GL11.glLineWidth(var1);
   }

   @Override
   public void method18389() {
      GL11.glLoadIdentity();
   }

   @Override
   public void method18390(int var1, int var2) {
      GL11.glNewList(var1, var2);
   }

   @Override
   public void method18391(float var1) {
      GL11.glPointSize(var1);
   }

   @Override
   public void method18392() {
      GL11.glPopMatrix();
   }

   @Override
   public void method18393() {
      GL11.glPushMatrix();
   }

   @Override
   public void method18394(int var1, int var2, int var3, int var4, int var5, int var6, ByteBuffer var7) {
      GL11.glReadPixels(var1, var2, var3, var4, var5, var6, var7);
   }

   @Override
   public void method18395(float var1, float var2, float var3, float var4) {
      GL11.glRotatef(var1, var2, var3, var4);
   }

   @Override
   public void method18396(float var1, float var2, float var3) {
      GL11.glScalef(var1, var2, var3);
   }

   @Override
   public void method18397(int var1, int var2, int var3, int var4) {
      GL11.glScissor(var1, var2, var3, var4);
   }

   @Override
   public void method18398(float var1, float var2) {
      GL11.glTexCoord2f(var1, var2);
   }

   @Override
   public void method18399(int var1, int var2, int var3) {
      GL11.glTexEnvi(var1, var2, var3);
   }

   @Override
   public void method18400(float var1, float var2, float var3) {
      GL11.glTranslatef(var1, var2, var3);
   }

   @Override
   public void method18401(float var1, float var2) {
      GL11.glVertex2f(var1, var2);
   }

   @Override
   public void method18402(float var1, float var2, float var3) {
      GL11.glVertex3f(var1, var2, var3);
   }

   @Override
   public void method18403() {
   }

   @Override
   public void method18404(int var1, int var2, int var3) {
      GL11.glTexParameteri(var1, var2, var3);
   }

   @Override
   public float[] method18405() {
      return this.field25736;
   }

   @Override
   public void method18406(int var1, int var2) {
      GL11.glDeleteLists(var1, var2);
   }

   @Override
   public void method18407(float var1) {
      GL11.glClearDepth((double)var1);
   }

   @Override
   public void method18408(int var1) {
      GL11.glDepthFunc(var1);
   }

   @Override
   public void method18409(boolean var1) {
      GL11.glDepthMask(var1);
   }

   @Override
   public void method18410(float var1) {
      this.field25737 = var1;
   }

   @Override
   public void method18411(FloatBuffer var1) {
      GL11.glLoadMatrixf(var1);
   }

   @Override
   public void method18412(IntBuffer var1) {
      GL11.glGenTextures(var1);
   }

   @Override
   public void method18413() {
      GL11.glGetError();
   }

   @Override
   public void method18414(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, ByteBuffer var9) {
      GL11.glTexImage2D(var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   @Override
   public void method18415(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, ByteBuffer var9) {
      GL11.glTexSubImage2D(var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   @Override
   public boolean method18416() {
      return false;
   }

   @Override
   public boolean method18417() {
      return false;
   }

   @Override
   public void method18418(byte var1, byte var2, byte var3) {
      EXTSecondaryColor.glSecondaryColor3ubEXT(var1, var2, var3);
   }
}
