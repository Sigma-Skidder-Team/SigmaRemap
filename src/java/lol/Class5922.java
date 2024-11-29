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
   public void method18367(int var1, int var2) {
      super.method18367(var1, var2);
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

         super.method18376(this.field25796[0], this.field25796[1], this.field25796[2], this.field25796[3]);
      }
   }

   @Override
   public void method18403() {
      super.method18403();
      this.method18421();
   }

   @Override
   public void method18369(int var1) {
      if (this.field25805 <= 0) {
         if (this.field25795 != var1) {
            this.method18421();
            this.field25795 = var1;
         }
      } else {
         super.method18369(var1);
      }
   }

   @Override
   public void method18376(float var1, float var2, float var3, float var4) {
      var4 *= this.field25737;
      this.field25796[0] = var1;
      this.field25796[1] = var2;
      this.field25796[2] = var3;
      this.field25796[3] = var4;
      if (this.field25805 > 0) {
         super.method18376(var1, var2, var3, var4);
      }
   }

   @Override
   public void method18382() {
      if (this.field25805 > 0) {
         super.method18382();
      }
   }

   @Override
   public void method18398(float var1, float var2) {
      if (this.field25805 <= 0) {
         this.field25797[0] = var1;
         this.field25797[1] = var2;
      } else {
         super.method18398(var1, var2);
      }
   }

   @Override
   public void method18401(float var1, float var2) {
      if (this.field25805 <= 0) {
         this.method18402(var1, var2, 0.0F);
      } else {
         super.method18401(var1, var2);
      }
   }

   @Override
   public void method18402(float var1, float var2, float var3) {
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
         super.method18402(var1, var2, var3);
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
   public void method18370(int var1, int var2) {
      this.method18421();
      super.method18370(var1, var2);
   }

   @Override
   public void method18371(int var1, int var2) {
      this.method18421();
      super.method18371(var1, var2);
   }

   @Override
   public void method18372(int var1) {
      this.method18421();
      super.method18372(var1);
   }

   @Override
   public void method18373(int var1) {
      this.method18421();
      super.method18373(var1);
   }

   @Override
   public void method18375(int var1, DoubleBuffer var2) {
      this.method18421();
      super.method18375(var1, var2);
   }

   @Override
   public void method18377(boolean var1, boolean var2, boolean var3, boolean var4) {
      this.method18421();
      super.method18377(var1, var2, var3, var4);
   }

   @Override
   public void method18380(int var1) {
      this.method18421();
      super.method18380(var1);
   }

   @Override
   public void method18381(int var1) {
      this.method18421();
      super.method18381(var1);
   }

   @Override
   public void method18388(float var1) {
      this.method18421();
      super.method18388(var1);
   }

   @Override
   public void method18391(float var1) {
      this.method18421();
      super.method18391(var1);
   }

   @Override
   public void method18392() {
      this.method18421();
      super.method18392();
   }

   @Override
   public void method18393() {
      this.method18421();
      super.method18393();
   }

   @Override
   public void method18395(float var1, float var2, float var3, float var4) {
      this.method18421();
      super.method18395(var1, var2, var3, var4);
   }

   @Override
   public void method18396(float var1, float var2, float var3) {
      this.method18421();
      super.method18396(var1, var2, var3);
   }

   @Override
   public void method18397(int var1, int var2, int var3, int var4) {
      this.method18421();
      super.method18397(var1, var2, var3, var4);
   }

   @Override
   public void method18399(int var1, int var2, int var3) {
      this.method18421();
      super.method18399(var1, var2, var3);
   }

   @Override
   public void method18400(float var1, float var2, float var3) {
      this.method18421();
      super.method18400(var1, var2, var3);
   }

   @Override
   public void method18383() {
      this.field25805--;
      super.method18383();
   }

   @Override
   public void method18390(int var1, int var2) {
      this.field25805++;
      super.method18390(var1, var2);
   }

   @Override
   public float[] method18405() {
      return this.field25796;
   }

   @Override
   public void method18411(FloatBuffer var1) {
      this.method18420();
      super.method18411(var1);
   }
}
