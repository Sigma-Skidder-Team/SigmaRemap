package lol;

import java.nio.Buffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;

import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;

public class Class5922 extends ImmediateModeOGLRenderer {
   private static String[] field25791;
   private static final int field25792 = 20;
   public static final int field25793 = -1;
   public static final int field25794 = 5000;
   private int field25795 = -1;
   private float[] field25796 = new float[]{1.0F, 1.0F, 1.0F, 1.0F};
   private float[] field25797 = new float[]{0.0F, 0.0F};
   private int field25798;
   private float[] field25799 = new float[15000];
   private float[] field25800 = new float[20000];
   private float[] field25801 = new float[15000];
   private FloatBuffer field25802 = BufferUtils.createFloatBuffer(15000);
   private FloatBuffer field25803 = BufferUtils.createFloatBuffer(20000);
   private FloatBuffer field25804 = BufferUtils.createFloatBuffer(10000);
   private int field25805 = 0;

   @Override
   public void initDisplay(int var1, int var2) {
      super.initDisplay(var1, var2);
      this.method18419();
      GL11.glEnableClientState(32884);
      GL11.glEnableClientState(32888);
      GL11.glEnableClientState(32886);
   }

   private void method18419() {
      this.field25798 = 0;
   }

   private void method18420() {
      if (this.field25798 != 0) {
         if (this.field25795 != -1) {
            if (this.field25798 >= 20) {
               ((Buffer)this.field25802).clear();
               ((Buffer)this.field25803).clear();
               ((Buffer)this.field25804).clear();
               this.field25802.put(this.field25799, 0, this.field25798 * 3);
               this.field25803.put(this.field25800, 0, this.field25798 * 4);
               this.field25804.put(this.field25801, 0, this.field25798 * 2);
               ((Buffer)this.field25802).flip();
               ((Buffer)this.field25803).flip();
               ((Buffer)this.field25804).flip();
               GL11.glVertexPointer(3, 0, 0, this.field25802);
               GL11.glColorPointer(4, 0, 0, this.field25803);
               GL11.glTexCoordPointer(2, 0, 0, this.field25804);
               GL11.glDrawArrays(this.field25795, 0, this.field25798);
               this.field25795 = -1;
            } else {
               GL11.glBegin(this.field25795);

               for (int var3 = 0; var3 < this.field25798; var3++) {
                  GL11.glColor4f(this.field25800[var3 * 4 + 0], this.field25800[var3 * 4 + 1], this.field25800[var3 * 4 + 2], this.field25800[var3 * 4 + 3]);
                  GL11.glTexCoord2f(this.field25801[var3 * 2 + 0], this.field25801[var3 * 2 + 1]);
                  GL11.glVertex3f(this.field25799[var3 * 3 + 0], this.field25799[var3 * 3 + 1], this.field25799[var3 * 3 + 2]);
               }

               GL11.glEnd();
               this.field25795 = -1;
            }
         }
      }
   }

   private void method18421() {
      if (this.field25805 <= 0) {
         if (this.field25798 != 0) {
            this.method18420();
            this.method18419();
         }

         super.glColor4f(this.field25796[0], this.field25796[1], this.field25796[2], this.field25796[3]);
      }
   }

   @Override
   public void flush() {
      super.flush();
      this.method18421();
   }

   @Override
   public void glBegin(int geomType) {
      if (this.field25805 <= 0) {
         if (this.field25795 != geomType) {
            this.method18421();
            this.field25795 = geomType;
         }
      } else {
         super.glBegin(geomType);
      }
   }

   @Override
   public void glColor4f(float var1, float var2, float var3, float var4) {
      var4 *= this.field25737;
      this.field25796[0] = var1;
      this.field25796[1] = var2;
      this.field25796[2] = var3;
      this.field25796[3] = var4;
      if (this.field25805 > 0) {
         super.glColor4f(var1, var2, var3, var4);
      }
   }

   @Override
   public void glEnd() {
      if (this.field25805 > 0) {
         super.glEnd();
      }
   }

   @Override
   public void glTexCoord2f(float var1, float var2) {
      if (this.field25805 <= 0) {
         this.field25797[0] = var1;
         this.field25797[1] = var2;
      } else {
         super.glTexCoord2f(var1, var2);
      }
   }

   @Override
   public void glVertex2f(float var1, float var2) {
      if (this.field25805 <= 0) {
         this.glVertex3f(var1, var2, 0.0F);
      } else {
         super.glVertex2f(var1, var2);
      }
   }

   @Override
   public void glVertex3f(float var1, float var2, float var3) {
      if (this.field25805 <= 0) {
         this.field25799[this.field25798 * 3 + 0] = var1;
         this.field25799[this.field25798 * 3 + 1] = var2;
         this.field25799[this.field25798 * 3 + 2] = var3;
         this.field25800[this.field25798 * 4 + 0] = this.field25796[0];
         this.field25800[this.field25798 * 4 + 1] = this.field25796[1];
         this.field25800[this.field25798 * 4 + 2] = this.field25796[2];
         this.field25800[this.field25798 * 4 + 3] = this.field25796[3];
         this.field25801[this.field25798 * 2 + 0] = this.field25797[0];
         this.field25801[this.field25798 * 2 + 1] = this.field25797[1];
         this.field25798++;
         if (this.field25798 > 4950 && this.method18422(this.field25798, this.field25795)) {
            int var6 = this.field25795;
            this.method18421();
            this.field25795 = var6;
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
      this.field25805--;
      super.glEndList();
   }

   @Override
   public void glNewList(int id, int option) {
      this.field25805++;
      super.glNewList(id, option);
   }

   @Override
   public float[] getCurrentColor() {
      return this.field25796;
   }

   @Override
   public void glLoadMatrix(FloatBuffer var1) {
      this.method18420();
      super.glLoadMatrix(var1);
   }
}
