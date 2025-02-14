package org.newdawn.slick.opengl.renderer;

public class QuadBasedLineStripRenderer implements LineStripRenderer {
   private final SGL GL = Renderer.get();
   public static int MAX_POINTS = 10000;
   private boolean antialias;
   private float width = 1.0F;
   private float[] points;
   private float[] colours;
   private int pts;
   private int cpt;
   private DefaultLineStripRenderer def = new DefaultLineStripRenderer();
   private boolean renderHalf;
   private boolean lineCaps = false;

   public QuadBasedLineStripRenderer() {
      this.points = new float[MAX_POINTS * 2];
      this.colours = new float[MAX_POINTS * 4];
   }

   @Override
   public void setLineCaps(boolean caps) {
      this.lineCaps = caps;
   }

   @Override
   public void start() {
      if (this.width != 1.0F) {
         this.pts = 0;
         this.cpt = 0;
         this.GL.flush();
         float[] col = this.GL.getCurrentColor();
         this.color(col[0], col[1], col[2], col[3]);
      } else {
         this.def.start();
      }
   }

   @Override
   public void method23241() {
      if (this.width != 1.0F) {
         this.method23247(this.points, this.pts);
      } else {
         this.def.method23241();
      }
   }

   @Override
   public void method23242(float var1, float var2) {
      if (this.width != 1.0F) {
         this.points[this.pts * 2] = var1;
         this.points[this.pts * 2 + 1] = var2;
         this.pts++;
         int var5 = this.pts - 1;
         this.color(this.colours[var5 * 4], this.colours[var5 * 4 + 1], this.colours[var5 * 4 + 2], this.colours[var5 * 4 + 3]);
      } else {
         this.def.method23242(var1, var2);
      }
   }

   @Override
   public void method23244(float var1) {
      this.width = var1;
   }

   @Override
   public void method23245(boolean var1) {
      this.def.method23245(var1);
      this.antialias = var1;
   }

   public void method23247(float[] var1, int var2) {
      if (this.antialias) {
         this.GL.glEnable(2881);
         this.method23248(var1, var2, this.width + 1.0F);
      }

      this.GL.glDisable(2881);
      this.method23248(var1, var2, this.width);
      if (this.antialias) {
         this.GL.glEnable(2881);
      }
   }

   public void method23248(float[] var1, int var2, float var3) {
      float var6 = var3 / 2.0F;
      float var7 = 0.0F;
      float var8 = 0.0F;
      float var9 = 0.0F;
      float var10 = 0.0F;
      this.GL.glBegin(7);

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
               this.GL.glVertex3f(var7, var8, 0.0F);
               this.GL.glVertex3f(var9, var10, 0.0F);
               this.method23249(var12);
               this.GL.glVertex3f(var15 + var20, var16 + var24, 0.0F);
               this.GL.glVertex3f(var15 - var20, var16 - var24, 0.0F);
            }

            var7 = var17 - var20;
            var8 = var18 - var24;
            var9 = var17 + var20;
            var10 = var18 + var24;
            if (var11 < var2 - 1) {
               this.method23249(var12);
               this.GL.glVertex3f(var15 + var20, var16 + var24, 0.0F);
               this.GL.glVertex3f(var15 - var20, var16 - var24, 0.0F);
               this.method23249(var13);
               this.GL.glVertex3f(var17 - var20, var18 - var24, 0.0F);
               this.GL.glVertex3f(var17 + var20, var18 + var24, 0.0F);
            }
         }
      }

      this.GL.glEnd();
      float var25 = !(var6 <= 12.5F) ? 180.0F / (float)Math.ceil((double)var6 / 2.5) : 5.0F;
      if (this.lineCaps) {
         float var26 = var1[2] - var1[0];
         float var28 = var1[3] - var1[1];
         float var30 = (float)Math.toDegrees(Math.atan2((double)var28, (double)var26)) + 90.0F;
         if (var26 != 0.0F || var28 != 0.0F) {
            this.GL.glBegin(6);
            this.method23249(0);
            this.GL.glVertex2f(var1[0], var1[1]);

            for (int var32 = 0; (float)var32 < 180.0F + var25; var32 = (int)((float)var32 + var25)) {
               float var34 = (float)Math.toRadians((double)(var30 + (float)var32));
               this.GL
                  .glVertex2f(var1[0] + (float)(Math.cos((double)var34) * (double)var6), var1[1] + (float)(Math.sin((double)var34) * (double)var6));
            }

            this.GL.glEnd();
         }
      }

      if (this.lineCaps) {
         float var27 = var1[var2 * 2 - 2] - var1[var2 * 2 - 4];
         float var29 = var1[var2 * 2 - 1] - var1[var2 * 2 - 3];
         float var31 = (float)Math.toDegrees(Math.atan2((double)var29, (double)var27)) - 90.0F;
         if (var27 != 0.0F || var29 != 0.0F) {
            this.GL.glBegin(6);
            this.method23249(var2 - 1);
            this.GL.glVertex2f(var1[var2 * 2 - 2], var1[var2 * 2 - 1]);

            for (int var33 = 0; (float)var33 < 180.0F + var25; var33 = (int)((float)var33 + var25)) {
               float var35 = (float)Math.toRadians((double)(var31 + (float)var33));
               this.GL
                  .glVertex2f(
                     var1[var2 * 2 - 2] + (float)(Math.cos((double)var35) * (double)var6), var1[var2 * 2 - 1] + (float)(Math.sin((double)var35) * (double)var6)
                  );
            }

            this.GL.glEnd();
         }
      }
   }

   private void method23249(int var1) {
      if (var1 < this.cpt) {
         if (!this.renderHalf) {
            this.GL.glColor4f(this.colours[var1 * 4], this.colours[var1 * 4 + 1], this.colours[var1 * 4 + 2], this.colours[var1 * 4 + 3]);
         } else {
            this.GL
               .glColor4f(
                  this.colours[var1 * 4] * 0.5F,
                  this.colours[var1 * 4 + 1] * 0.5F,
                  this.colours[var1 * 4 + 2] * 0.5F,
                  this.colours[var1 * 4 + 3] * 0.5F
               );
         }
      }
   }

   @Override
   public void color(float r, float g, float b, float a) {
      if (this.width != 1.0F) {
         this.colours[this.pts * 4] = r;
         this.colours[this.pts * 4 + 1] = g;
         this.colours[this.pts * 4 + 2] = b;
         this.colours[this.pts * 4 + 3] = a;
         this.cpt++;
      } else {
         this.def.color(r, g, b, a);
      }
   }

   @Override
   public boolean applyGLLineFixes() {
      return this.def.applyGLLineFixes();
   }
}
