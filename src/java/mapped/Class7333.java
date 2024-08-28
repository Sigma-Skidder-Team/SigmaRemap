package mapped;

public class Class7333 implements LineStripRenderer {
   private static String[] field31419;
   private SGL field31420 = Renderer.get();
   public static int field31421 = 10000;
   private boolean field31422;
   private float field31423 = 1.0F;
   private float[] field31424;
   private float[] field31425;
   private int field31426;
   private int field31427;
   private DefaultLineStripRenderer field31428 = new DefaultLineStripRenderer();
   private boolean field31429;
   private boolean field31430 = false;

   public Class7333() {
      this.field31424 = new float[field31421 * 2];
      this.field31425 = new float[field31421 * 4];
   }

   @Override
   public void method23246(boolean var1) {
      this.field31430 = var1;
   }

   @Override
   public void method23240() {
      if (this.field31423 != 1.0F) {
         this.field31426 = 0;
         this.field31427 = 0;
         this.field31420.method18403();
         float[] var3 = this.field31420.method18405();
         this.method23243(var3[0], var3[1], var3[2], var3[3]);
      } else {
         this.field31428.method23240();
      }
   }

   @Override
   public void method23241() {
      if (this.field31423 != 1.0F) {
         this.method23247(this.field31424, this.field31426);
      } else {
         this.field31428.method23241();
      }
   }

   @Override
   public void method23242(float var1, float var2) {
      if (this.field31423 != 1.0F) {
         this.field31424[this.field31426 * 2] = var1;
         this.field31424[this.field31426 * 2 + 1] = var2;
         this.field31426++;
         int var5 = this.field31426 - 1;
         this.method23243(this.field31425[var5 * 4], this.field31425[var5 * 4 + 1], this.field31425[var5 * 4 + 2], this.field31425[var5 * 4 + 3]);
      } else {
         this.field31428.method23242(var1, var2);
      }
   }

   @Override
   public void method23244(float var1) {
      this.field31423 = var1;
   }

   @Override
   public void method23245(boolean var1) {
      this.field31428.method23245(var1);
      this.field31422 = var1;
   }

   public void method23247(float[] var1, int var2) {
      if (this.field31422) {
         this.field31420.method18381(2881);
         this.method23248(var1, var2, this.field31423 + 1.0F);
      }

      this.field31420.method18380(2881);
      this.method23248(var1, var2, this.field31423);
      if (this.field31422) {
         this.field31420.method18381(2881);
      }
   }

   public void method23248(float[] var1, int var2, float var3) {
      float var6 = var3 / 2.0F;
      float var7 = 0.0F;
      float var8 = 0.0F;
      float var9 = 0.0F;
      float var10 = 0.0F;
      this.field31420.method18369(7);

      for (int var11 = 0; var11 < var2 + 1; var11++) {
         int var12 = var11;
         int var13 = var11 + 1;
         int var14 = var11 - 1;
         if (var14 < 0) {
            var14 += var2;
         }

         if (var13 >= var2) {
            var13 -= var2;
         }

         if (var11 >= var2) {
            var12 = var11 - var2;
         }

         float var15 = var1[var12 * 2];
         float var16 = var1[var12 * 2 + 1];
         float var17 = var1[var13 * 2];
         float var18 = var1[var13 * 2 + 1];
         float var19 = var17 - var15;
         float var20 = var18 - var16;
         if (var19 != 0.0F || var20 != 0.0F) {
            float var21 = var19 * var19 + var20 * var20;
            float var22 = (float)Math.sqrt((double)var21);
            var19 *= var6;
            var20 *= var6;
            var19 /= var22;
            var20 /= var22;
            float var24 = -var19;
            if (var11 != 0) {
               this.method23249(var14);
               this.field31420.method18402(var7, var8, 0.0F);
               this.field31420.method18402(var9, var10, 0.0F);
               this.method23249(var12);
               this.field31420.method18402(var15 + var20, var16 + var24, 0.0F);
               this.field31420.method18402(var15 - var20, var16 - var24, 0.0F);
            }

            var7 = var17 - var20;
            var8 = var18 - var24;
            var9 = var17 + var20;
            var10 = var18 + var24;
            if (var11 < var2 - 1) {
               this.method23249(var12);
               this.field31420.method18402(var15 + var20, var16 + var24, 0.0F);
               this.field31420.method18402(var15 - var20, var16 - var24, 0.0F);
               this.method23249(var13);
               this.field31420.method18402(var17 - var20, var18 - var24, 0.0F);
               this.field31420.method18402(var17 + var20, var18 + var24, 0.0F);
            }
         }
      }

      this.field31420.method18382();
      float var25 = !(var6 <= 12.5F) ? 180.0F / (float)Math.ceil((double)var6 / 2.5) : 5.0F;
      if (this.field31430) {
         float var26 = var1[2] - var1[0];
         float var28 = var1[3] - var1[1];
         float var30 = (float)Math.toDegrees(Math.atan2((double)var28, (double)var26)) + 90.0F;
         if (var26 != 0.0F || var28 != 0.0F) {
            this.field31420.method18369(6);
            this.method23249(0);
            this.field31420.method18401(var1[0], var1[1]);

            for (int var32 = 0; (float)var32 < 180.0F + var25; var32 = (int)((float)var32 + var25)) {
               float var34 = (float)Math.toRadians((double)(var30 + (float)var32));
               this.field31420
                  .method18401(var1[0] + (float)(Math.cos((double)var34) * (double)var6), var1[1] + (float)(Math.sin((double)var34) * (double)var6));
            }

            this.field31420.method18382();
         }
      }

      if (this.field31430) {
         float var27 = var1[var2 * 2 - 2] - var1[var2 * 2 - 4];
         float var29 = var1[var2 * 2 - 1] - var1[var2 * 2 - 3];
         float var31 = (float)Math.toDegrees(Math.atan2((double)var29, (double)var27)) - 90.0F;
         if (var27 != 0.0F || var29 != 0.0F) {
            this.field31420.method18369(6);
            this.method23249(var2 - 1);
            this.field31420.method18401(var1[var2 * 2 - 2], var1[var2 * 2 - 1]);

            for (int var33 = 0; (float)var33 < 180.0F + var25; var33 = (int)((float)var33 + var25)) {
               float var35 = (float)Math.toRadians((double)(var31 + (float)var33));
               this.field31420
                  .method18401(
                     var1[var2 * 2 - 2] + (float)(Math.cos((double)var35) * (double)var6), var1[var2 * 2 - 1] + (float)(Math.sin((double)var35) * (double)var6)
                  );
            }

            this.field31420.method18382();
         }
      }
   }

   private void method23249(int var1) {
      if (var1 < this.field31427) {
         if (!this.field31429) {
            this.field31420.method18376(this.field31425[var1 * 4], this.field31425[var1 * 4 + 1], this.field31425[var1 * 4 + 2], this.field31425[var1 * 4 + 3]);
         } else {
            this.field31420
               .method18376(
                  this.field31425[var1 * 4] * 0.5F,
                  this.field31425[var1 * 4 + 1] * 0.5F,
                  this.field31425[var1 * 4 + 2] * 0.5F,
                  this.field31425[var1 * 4 + 3] * 0.5F
               );
         }
      }
   }

   @Override
   public void method23243(float var1, float var2, float var3, float var4) {
      if (this.field31423 != 1.0F) {
         this.field31425[this.field31426 * 4] = var1;
         this.field31425[this.field31426 * 4 + 1] = var2;
         this.field31425[this.field31426 * 4 + 2] = var3;
         this.field31425[this.field31426 * 4 + 3] = var4;
         this.field31427++;
      } else {
         this.field31428.method23243(var1, var2, var3, var4);
      }
   }

   @Override
   public boolean method23239() {
      return this.field31423 != 1.0F ? this.field31428.method23239() : this.field31428.method23239();
   }
}
