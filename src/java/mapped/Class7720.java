package mapped;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

public class Class7720 {
   public String field33129 = null;
   private int field33130 = -1;
   private int field33131 = -1;
   private int field33132 = -1;
   private int field33133 = -1;
   private int field33134 = 1;
   private boolean field33135 = false;
   private float field33136 = 1.0F;
   private float[] field33137;
   private Class9532 field33138;
   private int field33139;
   private boolean field33140;
   private boolean field33141;
   private boolean field33142;
   public Class8507[] field33143;
   public Class9532 field33144;
   private float field33145;
   private Class8851 field33146;
   public int field33147;
   private World field33148;
   public static final float[] field33149 = new float[]{1.0F, 0.0F, 0.0F};
   private static final String field33150 = "clear";
   private static final String field33151 = "rain";
   private static final String field33152 = "thunder";

   public Class7720(Properties var1, String var2) {
      this.field33137 = field33149;
      this.field33138 = null;
      this.field33139 = 8;
      this.field33140 = true;
      this.field33141 = false;
      this.field33142 = false;
      this.field33143 = null;
      this.field33144 = null;
      this.field33145 = 1.0F;
      this.field33146 = null;
      this.field33147 = -1;
      this.field33148 = null;
      Class8896 var5 = new Class8896("CustomSky");
      this.field33129 = var1.getProperty("source", var2);
      this.field33130 = this.method25507(var1.getProperty("startFadeIn"));
      this.field33131 = this.method25507(var1.getProperty("endFadeIn"));
      this.field33132 = this.method25507(var1.getProperty("startFadeOut"));
      this.field33133 = this.method25507(var1.getProperty("endFadeOut"));
      this.field33134 = Class6988.method21637(var1.getProperty("blend"));
      this.field33135 = this.method25508(var1.getProperty("rotate"), true);
      this.field33136 = this.method25509(var1.getProperty("speed"), 1.0F);
      this.field33137 = this.method25510(var1.getProperty("axis"), field33149);
      this.field33138 = var5.method32404(var1.getProperty("days"));
      this.field33139 = var5.method32398(var1.getProperty("daysLoop"), 8);
      List var6 = this.method25506(var1.getProperty("weather", "clear"));
      this.field33140 = var6.contains("clear");
      this.field33141 = var6.contains("rain");
      this.field33142 = var6.contains("thunder");
      this.field33143 = var5.method32396(var1.getProperty("biomes"));
      this.field33144 = var5.method32404(var1.getProperty("heights"));
      this.field33145 = this.method25509(var1.getProperty("transition"), 1.0F);
   }

   private List<String> method25506(String var1) {
      List var4 = Arrays.<String>asList("clear", "rain", "thunder");
      ArrayList var5 = new ArrayList();
      String[] var6 = Class7944.method26903(var1, " ");

      for (int var7 = 0; var7 < var6.length; var7++) {
         String var8 = var6[var7];
         if (var4.contains(var8)) {
            var5.add(var8);
         } else {
            Class7944.method26811("Unknown weather: " + var8);
         }
      }

      return var5;
   }

   private int method25507(String var1) {
      if (var1 != null) {
         String[] var4 = Class7944.method26903(var1, ":");
         if (var4.length == 2) {
            String var5 = var4[0];
            String var6 = var4[1];
            int var7 = Class7944.method26899(var5, -1);
            int var8 = Class7944.method26899(var6, -1);
            if (var7 >= 0 && var7 <= 23 && var8 >= 0 && var8 <= 59) {
               var7 -= 6;
               if (var7 < 0) {
                  var7 += 24;
               }

               return var7 * 1000 + (int)((double)var8 / 60.0 * 1000.0);
            } else {
               Class7944.method26811("Invalid time: " + var1);
               return -1;
            }
         } else {
            Class7944.method26811("Invalid time: " + var1);
            return -1;
         }
      } else {
         return -1;
      }
   }

   private boolean method25508(String var1, boolean var2) {
      if (var1 != null) {
         if (!var1.toLowerCase().equals("true")) {
            if (!var1.toLowerCase().equals("false")) {
               Class7944.method26811("Unknown boolean: " + var1);
               return var2;
            } else {
               return false;
            }
         } else {
            return true;
         }
      } else {
         return var2;
      }
   }

   private float method25509(String var1, float var2) {
      if (var1 != null) {
         float var5 = Class7944.method26900(var1, Float.MIN_VALUE);
         if (var5 != Float.MIN_VALUE) {
            return var5;
         } else {
            Class7944.method26811("Invalid value: " + var1);
            return var2;
         }
      } else {
         return var2;
      }
   }

   private float[] method25510(String var1, float[] var2) {
      if (var1 == null) {
         return var2;
      } else {
         String[] var5 = Class7944.method26903(var1, " ");
         if (var5.length != 3) {
            Class7944.method26811("Invalid axis: " + var1);
            return var2;
         } else {
            float[] var6 = new float[3];

            for (int var7 = 0; var7 < var5.length; var7++) {
               var6[var7] = Class7944.method26900(var5[var7], Float.MIN_VALUE);
               if (var6[var7] == Float.MIN_VALUE) {
                  Class7944.method26811("Invalid axis: " + var1);
                  return var2;
               }
            }

            float var10 = var6[0];
            float var8 = var6[1];
            float var9 = var6[2];
            if (!(var10 * var10 + var8 * var8 + var9 * var9 < 1.0E-5F)) {
               return new float[]{var9, var8, -var10};
            } else {
               Class7944.method26811("Invalid axis values: " + var1);
               return var2;
            }
         }
      }
   }

   public boolean method25511(String var1) {
      if (this.field33129 != null) {
         this.field33129 = Class8684.method31274(this.field33129, Class8684.method31275(var1));
         if (this.field33130 >= 0 && this.field33131 >= 0 && this.field33133 >= 0) {
            int var4 = this.method25512(this.field33131 - this.field33130);
            if (this.field33132 < 0) {
               this.field33132 = this.method25512(this.field33133 - var4);
               if (this.method25520(this.field33132, this.field33130, this.field33131)) {
                  this.field33132 = this.field33131;
               }
            }

            int var5 = this.method25512(this.field33132 - this.field33131);
            int var6 = this.method25512(this.field33133 - this.field33132);
            int var7 = this.method25512(this.field33130 - this.field33133);
            int var8 = var4 + var5 + var6 + var7;
            if (var8 != 24000) {
               Class7944.method26811("Invalid fadeIn/fadeOut times, sum is not 24h: " + var8);
               return false;
            } else if (this.field33136 < 0.0F) {
               Class7944.method26811("Invalid speed: " + this.field33136);
               return false;
            } else if (this.field33139 > 0) {
               return true;
            } else {
               Class7944.method26811("Invalid daysLoop: " + this.field33139);
               return false;
            }
         } else {
            Class7944.method26811("Invalid times, required are: startFadeIn, endFadeIn and endFadeOut.");
            return false;
         }
      } else {
         Class7944.method26811("No source texture: " + var1);
         return false;
      }
   }

   private int method25512(int var1) {
      while (var1 >= 24000) {
         var1 -= 24000;
      }

      while (var1 < 0) {
         var1 += 24000;
      }

      return var1;
   }

   public void method25513(World var1, MatrixStack var2, int var3, float var4, float var5, float var6) {
      float var9 = this.method25514(var1);
      float var10 = this.method25516(var5, var6);
      float var11 = this.method25517(var3);
      float var12 = var9 * var10 * var11;
      var12 = Class7944.method26832(var12, 0.0F, 1.0F);
      if (!(var12 < 1.0E-4F)) {
         Class7414.method23814(this.field33147);
         Class6988.method21638(this.field33134, var12);
         Class7414.method23832();
         Class7414.method23842(var2.getLast().getMatrix());
         if (this.field33135) {
            float var13 = 0.0F;
            if (this.field33136 != (float)Math.round(this.field33136)) {
               long var14 = (var1.method6784() + 18000L) / 24000L;
               double var16 = (double)(this.field33136 % 1.0F);
               double var18 = (double)var14 * var16;
               var13 = (float)(var18 % 1.0);
            }

            Class7414.method23836(360.0F * (var13 + var4 * this.field33136), this.field33137[0], this.field33137[1], this.field33137[2]);
         }

         Tessellator var21 = Tessellator.getInstance();
         Class7414.method23836(90.0F, 1.0F, 0.0F, 0.0F);
         Class7414.method23836(-90.0F, 0.0F, 0.0F, 1.0F);
         this.method25518(var21, 4);
         Class7414.method23832();
         Class7414.method23836(90.0F, 1.0F, 0.0F, 0.0F);
         this.method25518(var21, 1);
         Class7414.method23833();
         Class7414.method23832();
         Class7414.method23836(-90.0F, 1.0F, 0.0F, 0.0F);
         this.method25518(var21, 0);
         Class7414.method23833();
         Class7414.method23836(90.0F, 0.0F, 0.0F, 1.0F);
         this.method25518(var21, 5);
         Class7414.method23836(90.0F, 0.0F, 0.0F, 1.0F);
         this.method25518(var21, 2);
         Class7414.method23836(90.0F, 0.0F, 0.0F, 1.0F);
         this.method25518(var21, 3);
         Class7414.method23833();
      }
   }

   private float method25514(World var1) {
      if (this.field33143 == null && this.field33144 == null) {
         return 1.0F;
      } else {
         float var4 = this.method25515(var1);
         if (this.field33146 == null) {
            this.field33146 = new Class8851(var4, this.field33145);
         }

         return this.field33146.method32202(var4);
      }
   }

   private float method25515(World var1) {
      Entity var4 = Minecraft.getInstance().getRenderViewEntity();
      if (var4 != null) {
         BlockPos var5 = var4.getPosition();
         if (this.field33143 != null) {
            Biome var6 = var1.getBiome(var5);
            if (var6 == null) {
               return 0.0F;
            }

            if (!Class7542.method24662(var6, this.field33143)) {
               return 0.0F;
            }
         }

         return this.field33144 != null && !this.field33144.method36838(var5.getY()) ? 0.0F : 1.0F;
      } else {
         return 0.0F;
      }
   }

   private float method25516(float var1, float var2) {
      float var5 = 1.0F - var1;
      float var6 = var1 - var2;
      float var7 = 0.0F;
      if (this.field33140) {
         var7 += var5;
      }

      if (this.field33141) {
         var7 += var6;
      }

      if (this.field33142) {
         var7 += var2;
      }

      return Class9395.method35675(var7, 0.0F, 1.0F);
   }

   private float method25517(int var1) {
      if (!this.method25520(var1, this.field33130, this.field33131)) {
         if (!this.method25520(var1, this.field33131, this.field33132)) {
            if (!this.method25520(var1, this.field33132, this.field33133)) {
               return 0.0F;
            } else {
               int var6 = this.method25512(this.field33133 - this.field33132);
               int var7 = this.method25512(var1 - this.field33132);
               return 1.0F - (float)var7 / (float)var6;
            }
         } else {
            return 1.0F;
         }
      } else {
         int var4 = this.method25512(this.field33131 - this.field33130);
         int var5 = this.method25512(var1 - this.field33130);
         return (float)var5 / (float)var4;
      }
   }

   private void method25518(Tessellator var1, int var2) {
      BufferBuilder var5 = var1.getBuffer();
      float var6 = (float)(var2 % 3) / 3.0F;
      float var7 = (float)(var2 / 3) / 2.0F;
      var5.begin(7, DefaultVertexFormats.field43344);
      var5.pos(-100.0, -100.0, -100.0).tex(var6, var7).endVertex();
      var5.pos(-100.0, -100.0, 100.0).tex(var6, var7 + 0.5F).endVertex();
      var5.pos(100.0, -100.0, 100.0).tex(var6 + 0.33333334F, var7 + 0.5F).endVertex();
      var5.pos(100.0, -100.0, -100.0).tex(var6 + 0.33333334F, var7).endVertex();
      var1.draw();
   }

   public boolean method25519(World var1, int var2) {
      if (var1 != this.field33148) {
         this.field33148 = var1;
         this.field33146 = null;
      }

      if (this.method25520(var2, this.field33133, this.field33130)) {
         return false;
      } else {
         if (this.field33138 != null) {
            long var5 = var1.method6784();
            long var7 = var5 - (long)this.field33130;

            while (var7 < 0L) {
               var7 += (long)(24000 * this.field33139);
            }

            int var9 = (int)(var7 / 24000L);
            int var10 = var9 % this.field33139;
            if (!this.field33138.method36838(var10)) {
               return false;
            }
         }

         return true;
      }
   }

   private boolean method25520(int var1, int var2, int var3) {
      return var2 > var3 ? var1 >= var2 || var1 <= var3 : var1 >= var2 && var1 <= var3;
   }

   @Override
   public String toString() {
      return "" + this.field33129 + ", " + this.field33130 + "-" + this.field33131 + " " + this.field33132 + "-" + this.field33133;
   }
}
