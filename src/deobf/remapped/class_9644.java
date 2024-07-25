package remapped;

import java.nio.Buffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;

public class class_9644 extends class_360 {
   private static String[] field_49137;
   private static final int field_49123 = 20;
   public static final int field_49124 = -1;
   public static final int field_49130 = 5000;
   private int field_49132 = -1;
   private float[] field_49133 = new float[]{1.0F, 1.0F, 1.0F, 1.0F};
   private float[] field_49125 = new float[]{0.0F, 0.0F};
   private int field_49126;
   private float[] field_49135 = new float[15000];
   private float[] field_49131 = new float[20000];
   private float[] field_49134 = new float[15000];
   private FloatBuffer field_49129 = BufferUtils.createFloatBuffer(15000);
   private FloatBuffer field_49136 = BufferUtils.createFloatBuffer(20000);
   private FloatBuffer field_49127 = BufferUtils.createFloatBuffer(10000);
   private int field_49128 = 0;

   @Override
   public void method_5897(int var1, int var2) {
      super.method_5897(var1, var2);
      this.method_44517();
      GL11.glEnableClientState(32884);
      GL11.glEnableClientState(32888);
      GL11.glEnableClientState(32886);
   }

   private void method_44517() {
      this.field_49126 = 0;
   }

   private void method_44515() {
      if (this.field_49126 != 0) {
         if (this.field_49132 != -1) {
            if (this.field_49126 >= 20) {
               ((Buffer)this.field_49129).clear();
               ((Buffer)this.field_49136).clear();
               ((Buffer)this.field_49127).clear();
               this.field_49129.put(this.field_49135, 0, this.field_49126 * 3);
               this.field_49136.put(this.field_49131, 0, this.field_49126 * 4);
               this.field_49127.put(this.field_49134, 0, this.field_49126 * 2);
               ((Buffer)this.field_49129).flip();
               ((Buffer)this.field_49136).flip();
               ((Buffer)this.field_49127).flip();
               GL11.glVertexPointer(3, 0, 0, this.field_49129);
               GL11.glColorPointer(4, 0, 0, this.field_49136);
               GL11.glTexCoordPointer(2, 0, 0, this.field_49127);
               GL11.glDrawArrays(this.field_49132, 0, this.field_49126);
               this.field_49132 = -1;
            } else {
               GL11.glBegin(this.field_49132);

               for (int var3 = 0; var3 < this.field_49126; var3++) {
                  GL11.glColor4f(this.field_49131[var3 * 4 + 0], this.field_49131[var3 * 4 + 1], this.field_49131[var3 * 4 + 2], this.field_49131[var3 * 4 + 3]);
                  GL11.glTexCoord2f(this.field_49134[var3 * 2 + 0], this.field_49134[var3 * 2 + 1]);
                  GL11.glVertex3f(this.field_49135[var3 * 3 + 0], this.field_49135[var3 * 3 + 1], this.field_49135[var3 * 3 + 2]);
               }

               GL11.glEnd();
               this.field_49132 = -1;
            }
         }
      }
   }

   private void method_44518() {
      if (this.field_49128 <= 0) {
         if (this.field_49126 != 0) {
            this.method_44515();
            this.method_44517();
         }

         super.method_5906(this.field_49133[0], this.field_49133[1], this.field_49133[2], this.field_49133[3]);
      }
   }

   @Override
   public void method_5898() {
      super.method_5898();
      this.method_44518();
   }

   @Override
   public void method_5934(int var1) {
      if (this.field_49128 <= 0) {
         if (this.field_49132 != var1) {
            this.method_44518();
            this.field_49132 = var1;
         }
      } else {
         super.method_5934(var1);
      }
   }

   @Override
   public void method_5906(float var1, float var2, float var3, float var4) {
      var4 *= this.field_1392;
      this.field_49133[0] = var1;
      this.field_49133[1] = var2;
      this.field_49133[2] = var3;
      this.field_49133[3] = var4;
      if (this.field_49128 > 0) {
         super.method_5906(var1, var2, var3, var4);
      }
   }

   @Override
   public void method_5940() {
      if (this.field_49128 > 0) {
         super.method_5940();
      }
   }

   @Override
   public void method_5924(float var1, float var2) {
      if (this.field_49128 <= 0) {
         this.field_49125[0] = var1;
         this.field_49125[1] = var2;
      } else {
         super.method_5924(var1, var2);
      }
   }

   @Override
   public void method_5919(float var1, float var2) {
      if (this.field_49128 <= 0) {
         this.method_5913(var1, var2, 0.0F);
      } else {
         super.method_5919(var1, var2);
      }
   }

   @Override
   public void method_5913(float var1, float var2, float var3) {
      if (this.field_49128 <= 0) {
         this.field_49135[this.field_49126 * 3 + 0] = var1;
         this.field_49135[this.field_49126 * 3 + 1] = var2;
         this.field_49135[this.field_49126 * 3 + 2] = var3;
         this.field_49131[this.field_49126 * 4 + 0] = this.field_49133[0];
         this.field_49131[this.field_49126 * 4 + 1] = this.field_49133[1];
         this.field_49131[this.field_49126 * 4 + 2] = this.field_49133[2];
         this.field_49131[this.field_49126 * 4 + 3] = this.field_49133[3];
         this.field_49134[this.field_49126 * 2 + 0] = this.field_49125[0];
         this.field_49134[this.field_49126 * 2 + 1] = this.field_49125[1];
         this.field_49126++;
         if (this.field_49126 > 4950 && this.method_44516(this.field_49126, this.field_49132)) {
            int var6 = this.field_49132;
            this.method_44518();
            this.field_49132 = var6;
         }
      } else {
         super.method_5913(var1, var2, var3);
      }
   }

   private boolean method_44516(int var1, int var2) {
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
   public void method_5904(int var1, int var2) {
      this.method_44518();
      super.method_5904(var1, var2);
   }

   @Override
   public void method_5927(int var1, int var2) {
      this.method_44518();
      super.method_5927(var1, var2);
   }

   @Override
   public void method_5936(int var1) {
      this.method_44518();
      super.method_5936(var1);
   }

   @Override
   public void method_5925(int var1) {
      this.method_44518();
      super.method_5925(var1);
   }

   @Override
   public void method_5896(int var1, DoubleBuffer var2) {
      this.method_44518();
      super.method_5896(var1, var2);
   }

   @Override
   public void method_5921(boolean var1, boolean var2, boolean var3, boolean var4) {
      this.method_44518();
      super.method_5921(var1, var2, var3, var4);
   }

   @Override
   public void method_5938(int var1) {
      this.method_44518();
      super.method_5938(var1);
   }

   @Override
   public void method_5911(int var1) {
      this.method_44518();
      super.method_5911(var1);
   }

   @Override
   public void method_5905(float var1) {
      this.method_44518();
      super.method_5905(var1);
   }

   @Override
   public void method_5910(float var1) {
      this.method_44518();
      super.method_5910(var1);
   }

   @Override
   public void method_5900() {
      this.method_44518();
      super.method_5900();
   }

   @Override
   public void method_5899() {
      this.method_44518();
      super.method_5899();
   }

   @Override
   public void method_5937(float var1, float var2, float var3, float var4) {
      this.method_44518();
      super.method_5937(var1, var2, var3, var4);
   }

   @Override
   public void method_5895(float var1, float var2, float var3) {
      this.method_44518();
      super.method_5895(var1, var2, var3);
   }

   @Override
   public void method_5891(int var1, int var2, int var3, int var4) {
      this.method_44518();
      super.method_5891(var1, var2, var3, var4);
   }

   @Override
   public void method_5893(int var1, int var2, int var3) {
      this.method_44518();
      super.method_5893(var1, var2, var3);
   }

   @Override
   public void method_5902(float var1, float var2, float var3) {
      this.method_44518();
      super.method_5902(var1, var2, var3);
   }

   @Override
   public void method_5930() {
      this.field_49128--;
      super.method_5930();
   }

   @Override
   public void method_5928(int var1, int var2) {
      this.field_49128++;
      super.method_5928(var1, var2);
   }

   @Override
   public float[] method_5903() {
      return this.field_49133;
   }

   @Override
   public void method_5917(FloatBuffer var1) {
      this.method_44515();
      super.method_5917(var1);
   }
}
