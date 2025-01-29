package org.newdawn.slick.opengl.renderer;

import java.nio.Buffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;

import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;

public class VAOGLRenderer extends ImmediateModeOGLRenderer {
   private static final int TOLERANCE = 20;
   public static final int NONE = -1;
   public static final int MAX_VERTS = 5000;
   private int currentType = NONE;
   private float[] color = new float[]{1.0F, 1.0F, 1.0F, 1.0F};
   private float[] tex = new float[]{0.0F, 0.0F};
   private int vertIndex;
   private float[] verts = new float[15000];
   private float[] cols = new float[20000];
   private float[] texs = new float[15000];
   private FloatBuffer verticies = BufferUtils.createFloatBuffer(15000);
   private FloatBuffer colors = BufferUtils.createFloatBuffer(20000);
   private FloatBuffer textures = BufferUtils.createFloatBuffer(10000);
   private int listMode = 0;

   @Override
   public void initDisplay(int width, int height) {
      super.initDisplay(width, height);
      this.method18419();
      GL11.glEnableClientState(32884);
      GL11.glEnableClientState(32888);
      GL11.glEnableClientState(32886);
   }

   private void method18419() {
      this.vertIndex = 0;
   }

   private void method18420() {
      if (this.vertIndex != 0) {
         if (this.currentType != -1) {
            if (this.vertIndex >= 20) {
               ((Buffer)this.verticies).clear();
               ((Buffer)this.colors).clear();
               ((Buffer)this.textures).clear();
               this.verticies.put(this.verts, 0, this.vertIndex * 3);
               this.colors.put(this.cols, 0, this.vertIndex * 4);
               this.textures.put(this.texs, 0, this.vertIndex * 2);
               ((Buffer)this.verticies).flip();
               ((Buffer)this.colors).flip();
               ((Buffer)this.textures).flip();
               GL11.glVertexPointer(3, 0, 0, this.verticies);
               GL11.glColorPointer(4, 0, 0, this.colors);
               GL11.glTexCoordPointer(2, 0, 0, this.textures);
               GL11.glDrawArrays(this.currentType, 0, this.vertIndex);
               this.currentType = -1;
            } else {
               GL11.glBegin(this.currentType);

               for (int var3 = 0; var3 < this.vertIndex; var3++) {
                  GL11.glColor4f(this.cols[var3 * 4 + 0], this.cols[var3 * 4 + 1], this.cols[var3 * 4 + 2], this.cols[var3 * 4 + 3]);
                  GL11.glTexCoord2f(this.texs[var3 * 2 + 0], this.texs[var3 * 2 + 1]);
                  GL11.glVertex3f(this.verts[var3 * 3 + 0], this.verts[var3 * 3 + 1], this.verts[var3 * 3 + 2]);
               }

               GL11.glEnd();
               this.currentType = -1;
            }
         }
      }
   }

   private void method18421() {
      if (this.listMode <= 0) {
         if (this.vertIndex != 0) {
            this.method18420();
            this.method18419();
         }

         super.glColor4f(this.color[0], this.color[1], this.color[2], this.color[3]);
      }
   }

   @Override
   public void flush() {
      super.flush();
      this.method18421();
   }

   @Override
   public void glBegin(int geomType) {
      if (this.listMode <= 0) {
         if (this.currentType != geomType) {
            this.method18421();
            this.currentType = geomType;
         }
      } else {
         super.glBegin(geomType);
      }
   }

   @Override
   public void glColor4f(float var1, float var2, float var3, float var4) {
      var4 *= this.alphaScale;
      this.color[0] = var1;
      this.color[1] = var2;
      this.color[2] = var3;
      this.color[3] = var4;
      if (this.listMode > 0) {
         super.glColor4f(var1, var2, var3, var4);
      }
   }

   @Override
   public void glEnd() {
      if (this.listMode > 0) {
         super.glEnd();
      }
   }

   @Override
   public void glTexCoord2f(float var1, float var2) {
      if (this.listMode <= 0) {
         this.tex[0] = var1;
         this.tex[1] = var2;
      } else {
         super.glTexCoord2f(var1, var2);
      }
   }

   @Override
   public void glVertex2f(float var1, float var2) {
      if (this.listMode <= 0) {
         this.glVertex3f(var1, var2, 0.0F);
      } else {
         super.glVertex2f(var1, var2);
      }
   }

   @Override
   public void glVertex3f(float var1, float var2, float var3) {
      if (this.listMode <= 0) {
         this.verts[this.vertIndex * 3 + 0] = var1;
         this.verts[this.vertIndex * 3 + 1] = var2;
         this.verts[this.vertIndex * 3 + 2] = var3;
         this.cols[this.vertIndex * 4 + 0] = this.color[0];
         this.cols[this.vertIndex * 4 + 1] = this.color[1];
         this.cols[this.vertIndex * 4 + 2] = this.color[2];
         this.cols[this.vertIndex * 4 + 3] = this.color[3];
         this.texs[this.vertIndex * 2 + 0] = this.tex[0];
         this.texs[this.vertIndex * 2 + 1] = this.tex[1];
         this.vertIndex++;
         if (this.vertIndex > 4950 && this.method18422(this.vertIndex, this.currentType)) {
            int var6 = this.currentType;
            this.method18421();
            this.currentType = var6;
         }
      } else {
         super.glVertex3f(var1, var2, var3);
      }
   }

   private boolean method18422(int var1, int var2) {
      switch (var2) {
         case 4:
            return var1 % 3 == 0;
         case 7:
            return var1 % 4 == 0;
         case 6913:
            return var1 % 2 == 0;
         default:
            return false;
      }
   }

   @Override
   public void glBindTexture(int var1, int var2) {
      this.method18421();
      super.glBindTexture(var1, var2);
   }

   @Override
   public void glBlendFunc(int src, int dest) {
      this.method18421();
      super.glBlendFunc(src, dest);
   }

   @Override
   public void glCallList(int var1) {
      this.method18421();
      super.glCallList(var1);
   }

   @Override
   public void glClear(int var1) {
      this.method18421();
      super.glClear(var1);
   }

   @Override
   public void glClipPlane(int var1, DoubleBuffer var2) {
      this.method18421();
      super.glClipPlane(var1, var2);
   }

   @Override
   public void glColorMask(boolean var1, boolean var2, boolean var3, boolean var4) {
      this.method18421();
      super.glColorMask(var1, var2, var3, var4);
   }

   @Override
   public void glDisable(int var1) {
      this.method18421();
      super.glDisable(var1);
   }

   @Override
   public void glEnable(int var1) {
      this.method18421();
      super.glEnable(var1);
   }

   @Override
   public void glLineWidth(float var1) {
      this.method18421();
      super.glLineWidth(var1);
   }

   @Override
   public void glPointSize(float var1) {
      this.method18421();
      super.glPointSize(var1);
   }

   @Override
   public void glPopMatrix() {
      this.method18421();
      super.glPopMatrix();
   }

   @Override
   public void glPushMatrix() {
      this.method18421();
      super.glPushMatrix();
   }

   @Override
   public void glRotatef(float var1, float var2, float var3, float var4) {
      this.method18421();
      super.glRotatef(var1, var2, var3, var4);
   }

   @Override
   public void glScalef(float var1, float var2, float var3) {
      this.method18421();
      super.glScalef(var1, var2, var3);
   }

   @Override
   public void glScissor(int var1, int var2, int var3, int var4) {
      this.method18421();
      super.glScissor(var1, var2, var3, var4);
   }

   @Override
   public void glTexEnvi(int var1, int var2, int var3) {
      this.method18421();
      super.glTexEnvi(var1, var2, var3);
   }

   @Override
   public void glTranslatef(float var1, float var2, float var3) {
      this.method18421();
      super.glTranslatef(var1, var2, var3);
   }

   @Override
   public void glEndList() {
      this.listMode--;
      super.glEndList();
   }

   @Override
   public void glNewList(int id, int option) {
      this.listMode++;
      super.glNewList(id, option);
   }

   @Override
   public float[] getCurrentColor() {
      return this.color;
   }

   @Override
   public void glLoadMatrix(FloatBuffer var1) {
      this.method18420();
      super.glLoadMatrix(var1);
   }
}
