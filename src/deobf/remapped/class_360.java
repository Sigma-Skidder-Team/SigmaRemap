package remapped;

import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.opengl.EXTSecondaryColor;
import org.lwjgl.opengl.GL11;

public class class_360 implements class_1299 {
   private static String[] field_1391;
   private int field_1393;
   private int field_1394;
   private float[] field_1395 = new float[]{1.0F, 1.0F, 1.0F, 1.0F};
   public float field_1392 = 1.0F;

   @Override
   public void method_5897(int var1, int var2) {
      this.field_1393 = var1;
      this.field_1394 = var2;
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
   public void method_5922(int var1, int var2) {
      GL11.glMatrixMode(5889);
      GL11.glLoadIdentity();
      GL11.glOrtho(0.0, (double)this.field_1393, (double)this.field_1394, 0.0, 1.0, -1.0);
      GL11.glMatrixMode(5888);
      GL11.glTranslatef((float)((this.field_1393 - var1) / 2), (float)((this.field_1394 - var2) / 2), 0.0F);
   }

   @Override
   public void method_5934(int var1) {
      GL11.glBegin(var1);
   }

   @Override
   public void method_5904(int var1, int var2) {
      GL11.glBindTexture(var1, var2);
   }

   @Override
   public void method_5927(int var1, int var2) {
      GL11.glBlendFunc(var1, var2);
   }

   @Override
   public void method_5936(int var1) {
      GL11.glCallList(var1);
   }

   @Override
   public void method_5925(int var1) {
      GL11.glClear(var1);
   }

   @Override
   public void method_5916(float var1, float var2, float var3, float var4) {
      GL11.glClearColor(var1, var2, var3, var4);
   }

   @Override
   public void method_5896(int var1, DoubleBuffer var2) {
      GL11.glClipPlane(var1, var2);
   }

   @Override
   public void method_5906(float var1, float var2, float var3, float var4) {
      var4 *= this.field_1392;
      this.field_1395[0] = var1;
      this.field_1395[1] = var2;
      this.field_1395[2] = var3;
      this.field_1395[3] = var4;
      GL11.glColor4f(var1, var2, var3, var4);
   }

   @Override
   public void method_5921(boolean var1, boolean var2, boolean var3, boolean var4) {
      GL11.glColorMask(var1, var2, var3, var4);
   }

   @Override
   public void method_5892(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      GL11.glCopyTexImage2D(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   @Override
   public void method_5920(IntBuffer var1) {
      GL11.glDeleteTextures(var1);
   }

   @Override
   public void method_5938(int var1) {
      GL11.glDisable(var1);
   }

   @Override
   public void method_5911(int var1) {
      GL11.glEnable(var1);
   }

   @Override
   public void method_5940() {
      GL11.glEnd();
   }

   @Override
   public void method_5930() {
      GL11.glEndList();
   }

   @Override
   public int method_5915(int var1) {
      return GL11.glGenLists(var1);
   }

   @Override
   public void method_5926(int var1, FloatBuffer var2) {
      GL11.glGetFloat(var1);
   }

   @Override
   public void method_5932(int var1, IntBuffer var2) {
      GL11.glGetInteger(var1);
   }

   @Override
   public void method_5918(int var1, int var2, int var3, int var4, ByteBuffer var5) {
      GL11.glGetTexImage(var1, var2, var3, var4, var5);
   }

   @Override
   public void method_5905(float var1) {
      GL11.glLineWidth(var1);
   }

   @Override
   public void method_5912() {
      GL11.glLoadIdentity();
   }

   @Override
   public void method_5928(int var1, int var2) {
      GL11.glNewList(var1, var2);
   }

   @Override
   public void method_5910(float var1) {
      GL11.glPointSize(var1);
   }

   @Override
   public void method_5900() {
      GL11.glPopMatrix();
   }

   @Override
   public void method_5899() {
      GL11.glPushMatrix();
   }

   @Override
   public void method_5889(int var1, int var2, int var3, int var4, int var5, int var6, ByteBuffer var7) {
      GL11.glReadPixels(var1, var2, var3, var4, var5, var6, var7);
   }

   @Override
   public void method_5937(float var1, float var2, float var3, float var4) {
      GL11.glRotatef(var1, var2, var3, var4);
   }

   @Override
   public void method_5895(float var1, float var2, float var3) {
      GL11.glScalef(var1, var2, var3);
   }

   @Override
   public void method_5891(int var1, int var2, int var3, int var4) {
      GL11.glScissor(var1, var2, var3, var4);
   }

   @Override
   public void method_5924(float var1, float var2) {
      GL11.glTexCoord2f(var1, var2);
   }

   @Override
   public void method_5893(int var1, int var2, int var3) {
      GL11.glTexEnvi(var1, var2, var3);
   }

   @Override
   public void method_5902(float var1, float var2, float var3) {
      GL11.glTranslatef(var1, var2, var3);
   }

   @Override
   public void method_5919(float var1, float var2) {
      GL11.glVertex2f(var1, var2);
   }

   @Override
   public void method_5913(float var1, float var2, float var3) {
      GL11.glVertex3f(var1, var2, var3);
   }

   @Override
   public void method_5898() {
   }

   @Override
   public void method_5908(int var1, int var2, int var3) {
      GL11.glTexParameteri(var1, var2, var3);
   }

   @Override
   public float[] method_5903() {
      return this.field_1395;
   }

   @Override
   public void method_5907(int var1, int var2) {
      GL11.glDeleteLists(var1, var2);
   }

   @Override
   public void method_5931(float var1) {
      GL11.glClearDepth((double)var1);
   }

   @Override
   public void method_5929(int var1) {
      GL11.glDepthFunc(var1);
   }

   @Override
   public void method_5933(boolean var1) {
      GL11.glDepthMask(var1);
   }

   @Override
   public void method_5914(float var1) {
      this.field_1392 = var1;
   }

   @Override
   public void method_5917(FloatBuffer var1) {
      GL11.glLoadMatrixf(var1);
   }

   @Override
   public void method_5901(IntBuffer var1) {
      GL11.glGenTextures(var1);
   }

   @Override
   public void method_5894() {
      GL11.glGetError();
   }

   @Override
   public void method_5939(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, ByteBuffer var9) {
      GL11.glTexImage2D(var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   @Override
   public void method_5909(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, ByteBuffer var9) {
      GL11.glTexSubImage2D(var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   @Override
   public boolean method_5923() {
      return false;
   }

   @Override
   public boolean method_5935() {
      return false;
   }

   @Override
   public void method_5890(byte var1, byte var2, byte var3) {
      EXTSecondaryColor.glSecondaryColor3ubEXT(var1, var2, var3);
   }
}
