package mapped;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.Properties;

import net.minecraft.client.renderer.GLAllocation;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class Class9200 {
   private String field42247 = null;
   private String field42248 = null;
   public ResourceLocation field42249 = null;
   private int field42250 = -1;
   private int field42251 = 0;
   private int field42252 = 0;
   private int field42253 = 0;
   private int field42254 = 0;
   private Class9642[] field42255 = null;
   private int field42256 = 0;
   private boolean field42257 = false;
   private int field42258 = 0;
   private ByteBuffer field42259 = null;
   public byte[] field42260 = null;
   private ByteBuffer field42261 = null;
   private boolean field42262 = true;
   private boolean field42263 = true;

   public Class9200(String var1, byte[] var2, String var3, ResourceLocation var4, int var5, int var6, int var7, int var8, Properties var9) {
      this.field42247 = var1;
      this.field42248 = var3;
      this.field42249 = var4;
      this.field42251 = var5;
      this.field42252 = var6;
      this.field42253 = var7;
      this.field42254 = var8;
      int var12 = var7 * var8 * 4;
      if (var2.length % var12 != 0) {
         Class7944.method26811("Invalid animated texture length: " + var2.length + ", frameWidth: " + var7 + ", frameHeight: " + var8);
      }

      this.field42260 = var2;
      int var13 = var2.length / var12;
      if (var9.get("tile.0") != null) {
         for (int var14 = 0; var9.get("tile." + var14) != null; var14++) {
            var13 = var14 + 1;
         }
      }

      String var22 = (String)var9.get("duration");
      int var15 = Math.max(Class7944.method26899(var22, 1), 1);
      this.field42255 = new Class9642[var13];

      for (int var16 = 0; var16 < this.field42255.length; var16++) {
         String var17 = (String)var9.get("tile." + var16);
         int var18 = Class7944.method26899(var17, var16);
         String var19 = (String)var9.get("duration." + var16);
         int var20 = Math.max(Class7944.method26899(var19, var15), 1);
         Class9642 var21 = new Class9642(var18, var20);
         this.field42255[var16] = var21;
      }

      this.field42257 = Class7944.method26901(var9.getProperty("interpolate"), false);
      this.field42258 = Class7944.method26899(var9.getProperty("skip"), 0);
      if (this.field42257) {
         this.field42259 = GLAllocation.method22266(var12);
      }
   }

   public boolean method34478() {
      Class9642 var3 = this.method34479();
      if (var3 != null) {
         var3.field45090++;
         if (var3.field45090 >= var3.field45089) {
            var3.field45090 = 0;
            this.field42256++;
            if (this.field42256 >= this.field42255.length) {
               this.field42256 = 0;
            }

            return true;
         } else {
            return this.field42257;
         }
      } else {
         return false;
      }
   }

   public Class9642 method34479() {
      return this.method34480(this.field42256);
   }

   public Class9642 method34480(int var1) {
      if (this.field42255.length <= 0) {
         return null;
      } else {
         if (var1 < 0 || var1 >= this.field42255.length) {
            var1 = 0;
         }

         return this.field42255[var1];
      }
   }

   public int method34481() {
      return this.field42255.length;
   }

   public void method34482() {
      if (this.field42263) {
         if (this.field42250 < 0) {
            Class290 var3 = Class8684.method31265(this.field42249);
            if (var3 == null) {
               this.field42263 = false;
               return;
            }

            this.field42250 = var3.getGlTextureId();
         }

         if (this.field42261 == null) {
            this.field42261 = GLAllocation.method22266(this.field42260.length);
            this.field42261.put(this.field42260);
            ((Buffer)this.field42261).flip();
            this.field42260 = null;
         }

         this.field42262 = !SmartAnimations.isActive() ? true : SmartAnimations.method14220(this.field42250);
         if (this.method34478() && this.field42262) {
            int var9 = this.field42253 * this.field42254 * 4;
            Class9642 var4 = this.method34479();
            if (var4 != null) {
               int var5 = var9 * var4.field45088;
               if (var5 + var9 <= this.field42261.limit()) {
                  if (!this.field42257 || var4.field45090 <= 0) {
                     ((Buffer)this.field42261).position(var5);
                     GlStateManager.method23814(this.field42250);
                     Class8684.method31292();
                     GL11.glTexSubImage2D(3553, 0, this.field42251, this.field42252, this.field42253, this.field42254, 6408, 5121, this.field42261);
                  } else if (this.field42258 <= 1 || var4.field45090 % this.field42258 == 0) {
                     Class9642 var6 = this.method34480(this.field42256 + 1);
                     double var7 = 1.0 * (double)var4.field45090 / (double)var4.field45089;
                     this.method34483(var4, var6, var7);
                  }
               }
            }
         }
      }
   }

   private void method34483(Class9642 var1, Class9642 var2, double var3) {
      int var7 = this.field42253 * this.field42254 * 4;
      int var8 = var7 * var1.field45088;
      if (var8 + var7 <= this.field42261.limit()) {
         int var9 = var7 * var2.field45088;
         if (var9 + var7 <= this.field42261.limit()) {
            ((Buffer)this.field42259).clear();

            for (int var10 = 0; var10 < var7; var10++) {
               int var11 = this.field42261.get(var8 + var10) & 255;
               int var12 = this.field42261.get(var9 + var10) & 255;
               int var13 = this.method34484(var11, var12, var3);
               byte var14 = (byte)var13;
               this.field42259.put(var14);
            }

            ((Buffer)this.field42259).flip();
            GlStateManager.method23814(this.field42250);
            Class8684.method31292();
            GL11.glTexSubImage2D(3553, 0, this.field42251, this.field42252, this.field42253, this.field42254, 6408, 5121, this.field42259);
         }
      }
   }

   private int method34484(int var1, int var2, double var3) {
      return (int)((double)var1 * (1.0 - var3) + (double)var2 * var3);
   }

   public String method34485() {
      return this.field42247;
   }

   public String method34486() {
      return this.field42248;
   }

   public ResourceLocation method34487() {
      return this.field42249;
   }

   public boolean method34488() {
      return this.field42262;
   }
}
