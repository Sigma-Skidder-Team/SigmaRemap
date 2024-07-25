package remapped;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

public class class_2524 {
   public String field_12510 = null;
   private int field_12517 = -1;
   private int field_12514 = -1;
   private int field_12511 = -1;
   private int field_12504 = -1;
   private int field_12502 = 1;
   private boolean field_12513 = false;
   private float field_12519 = 1.0F;
   private float[] field_12505;
   private class_8750 field_12498;
   private int field_12520;
   private boolean field_12518;
   private boolean field_12515;
   private boolean field_12509;
   public class_4859[] field_12521;
   public class_8750 field_12503;
   private float field_12507;
   private class_6117 field_12497;
   public int field_12508;
   private World field_12500;
   public static final float[] field_12512 = new float[]{1.0F, 0.0F, 0.0F};
   private static final String field_12499 = "clear";
   private static final String field_12501 = "rain";
   private static final String field_12516 = "thunder";

   public class_2524(Properties var1, String var2) {
      this.field_12505 = field_12512;
      this.field_12498 = null;
      this.field_12520 = 8;
      this.field_12518 = true;
      this.field_12515 = false;
      this.field_12509 = false;
      this.field_12521 = null;
      this.field_12503 = null;
      this.field_12507 = 1.0F;
      this.field_12497 = null;
      this.field_12508 = -1;
      this.field_12500 = null;
      class_6284 var5 = new class_6284("CustomSky");
      this.field_12510 = var1.getProperty("source", var2);
      this.field_12517 = this.method_11492(var1.getProperty("startFadeIn"));
      this.field_12514 = this.method_11492(var1.getProperty("endFadeIn"));
      this.field_12511 = this.method_11492(var1.getProperty("startFadeOut"));
      this.field_12504 = this.method_11492(var1.getProperty("endFadeOut"));
      this.field_12502 = class_1240.method_5532(var1.getProperty("blend"));
      this.field_12513 = this.method_11487(var1.getProperty("rotate"), true);
      this.field_12519 = this.method_11486(var1.getProperty("speed"), 1.0F);
      this.field_12505 = this.method_11488(var1.getProperty("axis"), field_12512);
      this.field_12498 = var5.method_28653(var1.getProperty("days"));
      this.field_12520 = var5.method_28676(var1.getProperty("daysLoop"), 8);
      List var6 = this.method_11482(var1.getProperty("weather", "clear"));
      this.field_12518 = var6.contains("clear");
      this.field_12515 = var6.contains("rain");
      this.field_12509 = var6.contains("thunder");
      this.field_12521 = var5.method_28644(var1.getProperty("biomes"));
      this.field_12503 = var5.method_28653(var1.getProperty("heights"));
      this.field_12507 = this.method_11486(var1.getProperty("transition"), 1.0F);
   }

   private List<String> method_11482(String var1) {
      List var4 = Arrays.<String>asList("clear", "rain", "thunder");
      ArrayList var5 = new ArrayList();
      String[] var6 = Config.method_14302(var1, " ");

      for (int var7 = 0; var7 < var6.length; var7++) {
         String var8 = var6[var7];
         if (var4.contains(var8)) {
            var5.add(var8);
         } else {
            Config.method_14317("Unknown weather: " + var8);
         }
      }

      return var5;
   }

   private int method_11492(String var1) {
      if (var1 != null) {
         String[] var4 = Config.method_14302(var1, ":");
         if (var4.length == 2) {
            String var5 = var4[0];
            String var6 = var4[1];
            int var7 = Config.method_14361(var5, -1);
            int var8 = Config.method_14361(var6, -1);
            if (var7 >= 0 && var7 <= 23 && var8 >= 0 && var8 <= 59) {
               var7 -= 6;
               if (var7 < 0) {
                  var7 += 24;
               }

               return var7 * 1000 + (int)((double)var8 / 60.0 * 1000.0);
            } else {
               Config.method_14317("Invalid time: " + var1);
               return -1;
            }
         } else {
            Config.method_14317("Invalid time: " + var1);
            return -1;
         }
      } else {
         return -1;
      }
   }

   private boolean method_11487(String var1, boolean var2) {
      if (var1 != null) {
         if (!var1.toLowerCase().equals("true")) {
            if (!var1.toLowerCase().equals("false")) {
               Config.method_14317("Unknown boolean: " + var1);
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

   private float method_11486(String var1, float var2) {
      if (var1 != null) {
         float var5 = Config.method_14445(var1, Float.MIN_VALUE);
         if (var5 != Float.MIN_VALUE) {
            return var5;
         } else {
            Config.method_14317("Invalid value: " + var1);
            return var2;
         }
      } else {
         return var2;
      }
   }

   private float[] method_11488(String var1, float[] var2) {
      if (var1 == null) {
         return var2;
      } else {
         String[] var5 = Config.method_14302(var1, " ");
         if (var5.length != 3) {
            Config.method_14317("Invalid axis: " + var1);
            return var2;
         } else {
            float[] var6 = new float[3];

            for (int var7 = 0; var7 < var5.length; var7++) {
               var6[var7] = Config.method_14445(var5[var7], Float.MIN_VALUE);
               if (var6[var7] == Float.MIN_VALUE) {
                  Config.method_14317("Invalid axis: " + var1);
                  return var2;
               }
            }

            float var10 = var6[0];
            float var8 = var6[1];
            float var9 = var6[2];
            if (!(var10 * var10 + var8 * var8 + var9 * var9 < 1.0E-5F)) {
               return new float[]{var9, var8, -var10};
            } else {
               Config.method_14317("Invalid axis values: " + var1);
               return var2;
            }
         }
      }
   }

   public boolean method_11493(String var1) {
      if (this.field_12510 != null) {
         this.field_12510 = class_5525.method_25096(this.field_12510, class_5525.method_25091(var1));
         if (this.field_12517 >= 0 && this.field_12514 >= 0 && this.field_12504 >= 0) {
            int var4 = this.method_11494(this.field_12514 - this.field_12517);
            if (this.field_12511 < 0) {
               this.field_12511 = this.method_11494(this.field_12504 - var4);
               if (this.method_11489(this.field_12511, this.field_12517, this.field_12514)) {
                  this.field_12511 = this.field_12514;
               }
            }

            int var5 = this.method_11494(this.field_12511 - this.field_12514);
            int var6 = this.method_11494(this.field_12504 - this.field_12511);
            int var7 = this.method_11494(this.field_12517 - this.field_12504);
            int var8 = var4 + var5 + var6 + var7;
            if (var8 != 24000) {
               Config.method_14317("Invalid fadeIn/fadeOut times, sum is not 24h: " + var8);
               return false;
            } else if (this.field_12519 < 0.0F) {
               Config.method_14317("Invalid speed: " + this.field_12519);
               return false;
            } else if (this.field_12520 > 0) {
               return true;
            } else {
               Config.method_14317("Invalid daysLoop: " + this.field_12520);
               return false;
            }
         } else {
            Config.method_14317("Invalid times, required are: startFadeIn, endFadeIn and endFadeOut.");
            return false;
         }
      } else {
         Config.method_14317("No source texture: " + var1);
         return false;
      }
   }

   private int method_11494(int var1) {
      while (var1 >= 24000) {
         var1 -= 24000;
      }

      while (var1 < 0) {
         var1 += 24000;
      }

      return var1;
   }

   public void method_11484(World var1, class_7966 var2, int var3, float var4, float var5, float var6) {
      float var9 = this.method_11495(var1);
      float var10 = this.method_11481(var5, var6);
      float var11 = this.method_11491(var3);
      float var12 = var9 * var10 * var11;
      var12 = Config.method_14262(var12, 0.0F, 1.0F);
      if (!(var12 < 1.0E-4F)) {
         GlStateManager.method_8791(this.field_12508);
         class_1240.method_5531(this.field_12502, var12);
         GlStateManager.method_8757();
         GlStateManager.method_8838(var2.method_36058().method_28620());
         if (this.field_12513) {
            float var13 = 0.0F;
            if (this.field_12519 != (float)Math.round(this.field_12519)) {
               long var14 = (var1.method_29584() + 18000L) / 24000L;
               double var16 = (double)(this.field_12519 % 1.0F);
               double var18 = (double)var14 * var16;
               var13 = (float)(var18 % 1.0);
            }

            GlStateManager.method_8824(360.0F * (var13 + var4 * this.field_12519), this.field_12505[0], this.field_12505[1], this.field_12505[2]);
         }

         class_8042 var21 = class_8042.method_36499();
         GlStateManager.method_8824(90.0F, 1.0F, 0.0F, 0.0F);
         GlStateManager.method_8824(-90.0F, 0.0F, 0.0F, 1.0F);
         this.method_11483(var21, 4);
         GlStateManager.method_8757();
         GlStateManager.method_8824(90.0F, 1.0F, 0.0F, 0.0F);
         this.method_11483(var21, 1);
         GlStateManager.method_8761();
         GlStateManager.method_8757();
         GlStateManager.method_8824(-90.0F, 1.0F, 0.0F, 0.0F);
         this.method_11483(var21, 0);
         GlStateManager.method_8761();
         GlStateManager.method_8824(90.0F, 0.0F, 0.0F, 1.0F);
         this.method_11483(var21, 5);
         GlStateManager.method_8824(90.0F, 0.0F, 0.0F, 1.0F);
         this.method_11483(var21, 2);
         GlStateManager.method_8824(90.0F, 0.0F, 0.0F, 1.0F);
         this.method_11483(var21, 3);
         GlStateManager.method_8761();
      }
   }

   private float method_11495(World var1) {
      if (this.field_12521 == null && this.field_12503 == null) {
         return 1.0F;
      } else {
         float var4 = this.method_11485(var1);
         if (this.field_12497 == null) {
            this.field_12497 = new class_6117(var4, this.field_12507);
         }

         return this.field_12497.method_28096(var4);
      }
   }

   private float method_11485(World var1) {
      Entity var4 = MinecraftClient.getInstance().getRenderViewEntity();
      if (var4 != null) {
         BlockPos var5 = var4.method_37075();
         if (this.field_12521 != null) {
            class_6325 var6 = var1.method_22561(var5);
            if (var6 == null) {
               return 0.0F;
            }

            if (!class_2164.method_10062(var6, this.field_12521)) {
               return 0.0F;
            }
         }

         return this.field_12503 != null && !this.field_12503.method_40164(var5.method_12165()) ? 0.0F : 1.0F;
      } else {
         return 0.0F;
      }
   }

   private float method_11481(float var1, float var2) {
      float var5 = 1.0F - var1;
      float var6 = var1 - var2;
      float var7 = 0.0F;
      if (this.field_12518) {
         var7 += var5;
      }

      if (this.field_12515) {
         var7 += var6;
      }

      if (this.field_12509) {
         var7 += var2;
      }

      return class_8231.method_37704(var7, 0.0F, 1.0F);
   }

   private float method_11491(int var1) {
      if (!this.method_11489(var1, this.field_12517, this.field_12514)) {
         if (!this.method_11489(var1, this.field_12514, this.field_12511)) {
            if (!this.method_11489(var1, this.field_12511, this.field_12504)) {
               return 0.0F;
            } else {
               int var6 = this.method_11494(this.field_12504 - this.field_12511);
               int var7 = this.method_11494(var1 - this.field_12511);
               return 1.0F - (float)var7 / (float)var6;
            }
         } else {
            return 1.0F;
         }
      } else {
         int var4 = this.method_11494(this.field_12514 - this.field_12517);
         int var5 = this.method_11494(var1 - this.field_12517);
         return (float)var5 / (float)var4;
      }
   }

   private void method_11483(class_8042 var1, int var2) {
      class_9633 var5 = var1.method_36501();
      float var6 = (float)(var2 % 3) / 3.0F;
      float var7 = (float)(var2 / 3) / 2.0F;
      var5.method_44471(7, class_7985.field_40912);
      var5.method_35761(-100.0, -100.0, -100.0).method_35745(var6, var7).method_35735();
      var5.method_35761(-100.0, -100.0, 100.0).method_35745(var6, var7 + 0.5F).method_35735();
      var5.method_35761(100.0, -100.0, 100.0).method_35745(var6 + 0.33333334F, var7 + 0.5F).method_35735();
      var5.method_35761(100.0, -100.0, -100.0).method_35745(var6 + 0.33333334F, var7).method_35735();
      var1.method_36500();
   }

   public boolean method_11490(World var1, int var2) {
      if (var1 != this.field_12500) {
         this.field_12500 = var1;
         this.field_12497 = null;
      }

      if (this.method_11489(var2, this.field_12504, this.field_12517)) {
         return false;
      } else {
         if (this.field_12498 != null) {
            long var5 = var1.method_29584();
            long var7 = var5 - (long)this.field_12517;

            while (var7 < 0L) {
               var7 += (long)(24000 * this.field_12520);
            }

            int var9 = (int)(var7 / 24000L);
            int var10 = var9 % this.field_12520;
            if (!this.field_12498.method_40164(var10)) {
               return false;
            }
         }

         return true;
      }
   }

   private boolean method_11489(int var1, int var2, int var3) {
      return var2 > var3 ? var1 >= var2 || var1 <= var3 : var1 >= var2 && var1 <= var3;
   }

   @Override
   public String toString() {
      return "" + this.field_12510 + ", " + this.field_12517 + "-" + this.field_12514 + " " + this.field_12511 + "-" + this.field_12504;
   }
}
