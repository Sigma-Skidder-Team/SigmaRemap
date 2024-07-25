package remapped;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class class_9561 implements class_9538 {
   public String field_48662 = null;
   public String field_48647 = null;
   private int field_48669 = -1;
   private class_9491[] field_48646 = null;
   private String field_48668 = null;
   private int field_48653 = -1;
   private int field_48665 = 0;
   private int field_48651 = 0;
   private int field_48664 = 0;
   private int field_48661 = 0;
   private int[] field_48667 = null;
   private float[][] field_48643 = (float[][])null;
   private static final int field_48654 = -1;
   private static final int field_48666 = 0;
   private static final int field_48663 = 1;
   private static final int field_48655 = 2;
   public static final String field_48648 = "vanilla";
   public static final String field_48656 = "grid";
   public static final String field_48645 = "fixed";
   public static final String[] field_48658 = new String[]{field_48652[7], field_48652[8], field_48652[9]};
   public static final String field_48649 = "format";
   public static final String field_48650 = "blocks";
   public static final String field_48660 = "source";
   public static final String field_48657 = "color";
   public static final String field_48659 = "yVariance";
   public static final String field_48644 = "yOffset";

   public class_9561(Properties var1, String var2, int var3, int var4, String var5) {
      class_6284 var8 = new class_6284("Colormap");
      this.field_48662 = var8.method_28678(var2);
      this.field_48647 = var8.method_28649(var2);
      this.field_48669 = this.method_44186(var1.getProperty("format", var5));
      this.field_48646 = var8.method_28680(var1.getProperty("blocks"));
      this.field_48668 = method_44188(var1.getProperty("source"), var2, this.field_48647);
      this.field_48653 = class_6284.method_28648(var1.getProperty("color"), -1);
      this.field_48665 = var8.method_28676(var1.getProperty("yVariance"), 0);
      this.field_48651 = var8.method_28676(var1.getProperty("yOffset"), 0);
      this.field_48664 = var3;
      this.field_48661 = var4;
   }

   private int method_44186(String var1) {
      if (var1 != null) {
         var1 = var1.trim();
         if (!var1.equals("vanilla")) {
            if (!var1.equals("grid")) {
               if (!var1.equals("fixed")) {
                  method_44172("Unknown format: " + var1);
                  return -1;
               } else {
                  return 2;
               }
            } else {
               return 1;
            }
         } else {
            return 0;
         }
      } else {
         return 0;
      }
   }

   public boolean method_44164(String var1) {
      if (this.field_48669 != 0 && this.field_48669 != 1) {
         if (this.field_48669 != 2) {
            return false;
         }

         if (this.field_48653 < 0) {
            this.field_48653 = 16777215;
         }
      } else {
         if (this.field_48668 == null) {
            method_44172("Source not defined: " + var1);
            return false;
         }

         this.method_44187();
         if (this.field_48667 == null) {
            return false;
         }

         if (this.field_48653 < 0) {
            if (this.field_48669 == 0) {
               this.field_48653 = this.method_44169(127, 127);
            }

            if (this.field_48669 == 1) {
               this.field_48653 = this.method_44190(class_5630.field_28568, new BlockPos(0, 64, 0));
            }
         }
      }

      return true;
   }

   public boolean method_44179(String var1) {
      if (this.field_48646 == null) {
         this.field_48646 = this.method_44175();
         if (this.field_48646 == null) {
            method_44172("Match blocks not defined: " + var1);
            return false;
         }
      }

      return true;
   }

   private class_9491[] method_44175() {
      Identifier var3 = new Identifier(this.field_48662);
      if (!class_8669.field_44462.method_39814(var3)) {
         Pattern var8 = Pattern.compile("^block([0-9]+).*$");
         Matcher var5 = var8.matcher(this.field_48662);
         if (var5.matches()) {
            String var6 = var5.group(1);
            int var7 = Config.method_14361(var6, -1);
            if (var7 >= 0) {
               return new class_9491[]{new class_9491(var7)};
            }
         }

         class_6284 var9 = new class_6284("Colormap");
         class_9491[] var10 = var9.method_28671(this.field_48662);
         return var10 == null ? null : var10;
      } else {
         class_6414 var4 = class_8669.field_44462.method_39806(var3);
         return new class_9491[]{new class_9491(class_9451.method_43710(var4))};
      }
   }

   private void method_44187() {
      try {
         this.field_48667 = null;
         if (this.field_48668 == null) {
            return;
         }

         String var3 = this.field_48668 + ".png";
         Identifier var4 = new Identifier(var3);
         InputStream var5 = Config.method_14374(var4);
         if (var5 == null) {
            return;
         }

         BufferedImage var6 = class_5525.method_25085(var5);
         if (var6 == null) {
            return;
         }

         int var7 = var6.getWidth();
         int var8 = var6.getHeight();
         boolean var9 = this.field_48664 < 0 || this.field_48664 == var7;
         boolean var10 = this.field_48661 < 0 || this.field_48661 == var8;
         if (!var9 || !var10) {
            method_44181("Non-standard palette size: " + var7 + "x" + var8 + ", should be: " + this.field_48664 + "x" + this.field_48661 + ", path: " + var3);
         }

         this.field_48664 = var7;
         this.field_48661 = var8;
         if (this.field_48664 <= 0 || this.field_48661 <= 0) {
            method_44172("Invalid palette size: " + var7 + "x" + var8 + ", path: " + var3);
            return;
         }

         this.field_48667 = new int[var7 * var8];
         var6.getRGB(0, 0, var7, var8, this.field_48667, 0, var7);
      } catch (IOException var11) {
         var11.printStackTrace();
      }
   }

   private static void method_44181(String var0) {
      Config.method_14277("CustomColors: " + var0);
   }

   private static void method_44172(String var0) {
      Config.method_14317("CustomColors: " + var0);
   }

   private static String method_44188(String var0, String var1, String var2) {
      if (var0 == null) {
         String var9 = var1;
         int var6 = var1.lastIndexOf(47);
         if (var6 >= 0) {
            var9 = var1.substring(var6 + 1);
         }

         int var7 = var9.lastIndexOf(46);
         if (var7 >= 0) {
            var9 = var9.substring(0, var7);
         }

         return method_44178(var9, var2);
      } else {
         var0 = var0.trim();
         String var5 = ".png";
         if (var0.endsWith(var5)) {
            var0 = var0.substring(0, var0.length() - var5.length());
         }

         return method_44178(var0, var2);
      }
   }

   private static String method_44178(String var0, String var1) {
      var0 = class_5525.method_25096(var0, var1);
      if (!var0.startsWith(var1) && !var0.startsWith("textures/") && !var0.startsWith("optifine/")) {
         var0 = var1 + "/" + var0;
      }

      if (var0.endsWith(".png")) {
         var0 = var0.substring(0, var0.length() - 4);
      }

      String var4 = "textures/block/";
      if (var0.startsWith(var4)) {
         var0 = var0.substring(var4.length());
      }

      if (var0.startsWith("/")) {
         var0 = var0.substring(1);
      }

      return var0;
   }

   public boolean method_44173(class_2522 var1) {
      return class_2164.method_10066(var1, this.field_48646);
   }

   public int method_44191() {
      if (this.field_48669 != 2) {
         int var3 = class_9300.field_47461.nextInt(this.field_48667.length);
         return this.field_48667[var3];
      } else {
         return this.field_48653;
      }
   }

   public int method_44168(int var1) {
      var1 = Config.method_14263(var1, 0, this.field_48667.length - 1);
      return this.field_48667[var1] & 16777215;
   }

   public int method_44169(int var1, int var2) {
      var1 = Config.method_14263(var1, 0, this.field_48664 - 1);
      var2 = Config.method_14263(var2, 0, this.field_48661 - 1);
      return this.field_48667[var2 * this.field_48664 + var1] & 16777215;
   }

   public float[][] method_44165() {
      if (this.field_48643 == null) {
         this.field_48643 = method_44177(this.field_48667);
      }

      return this.field_48643;
   }

   @Override
   public int method_43977(class_2522 var1, class_5561 var2, BlockPos var3) {
      return this.method_44170(var2, var3);
   }

   public int method_44170(class_5561 var1, BlockPos var2) {
      class_6325 var5 = class_9300.method_42872(var1, var2);
      return this.method_44171(var5, var2);
   }

   @Override
   public boolean method_43978() {
      return this.field_48669 == 2;
   }

   public int method_44171(class_6325 var1, BlockPos var2) {
      if (this.field_48669 != 0) {
         return this.field_48669 != 1 ? this.field_48653 : this.method_44190(var1, var2);
      } else {
         return this.method_44176(var1, var2);
      }
   }

   public int method_44174(class_5561 var1, double var2, double var4, double var6, int var8) {
      if (this.field_48669 == 2) {
         return this.field_48653;
      } else {
         int var11 = class_9299.method_42847(var2);
         int var12 = class_9299.method_42847(var4);
         int var13 = class_9299.method_42847(var6);
         int var14 = 0;
         int var15 = 0;
         int var16 = 0;
         int var17 = 0;
         class_523 var18 = new class_523(0, 0, 0);

         for (int var19 = var11 - var8; var19 <= var11 + var8; var19++) {
            for (int var20 = var13 - var8; var20 <= var13 + var8; var20++) {
               var18.method_2548(var19, var12, var20);
               int var21 = this.method_44170(var1, var18);
               var14 += var21 >> 16 & 0xFF;
               var15 += var21 >> 8 & 0xFF;
               var16 += var21 & 0xFF;
               var17++;
            }
         }

         int var22 = var14 / var17;
         int var23 = var15 / var17;
         int var24 = var16 / var17;
         return var22 << 16 | var23 << 8 | var24;
      }
   }

   private int method_44176(class_6325 var1, BlockPos var2) {
      double var5 = (double)class_9299.method_42828(var1.method_28865(var2), 0.0F, 1.0F);
      double var7 = (double)class_9299.method_42828(var1.method_28870(), 0.0F, 1.0F);
      var7 *= var5;
      int var9 = (int)((1.0 - var5) * (double)(this.field_48664 - 1));
      int var10 = (int)((1.0 - var7) * (double)(this.field_48661 - 1));
      return this.method_44169(var9, var10);
   }

   private int method_44190(class_6325 var1, BlockPos var2) {
      int var5 = class_5630.method_25522(var1);
      int var6 = var2.method_12165() - this.field_48651;
      if (this.field_48665 > 0) {
         int var7 = var2.method_12173() << 16 + var2.method_12185();
         int var8 = Config.method_14419(var7);
         int var9 = this.field_48665 * 2 + 1;
         int var10 = (var8 & 0xFF) % var9 - this.field_48665;
         var6 += var10;
      }

      return this.method_44169(var5, var6);
   }

   public int method_44167() {
      return this.field_48669 != 2 ? this.field_48667.length : 1;
   }

   public int method_44182() {
      return this.field_48664;
   }

   public int method_44166() {
      return this.field_48661;
   }

   private static float[][] method_44177(int[] var0) {
      float[][] var3 = new float[var0.length][3];

      for (int var4 = 0; var4 < var0.length; var4++) {
         int var5 = var0[var4];
         float var6 = (float)(var5 >> 16 & 0xFF) / 255.0F;
         float var7 = (float)(var5 >> 8 & 0xFF) / 255.0F;
         float var8 = (float)(var5 & 0xFF) / 255.0F;
         float[] var9 = var3[var4];
         var9[0] = var6;
         var9[1] = var7;
         var9[2] = var8;
      }

      return var3;
   }

   public void method_44184(class_9491 var1) {
      if (this.field_48646 == null) {
         this.field_48646 = new class_9491[0];
      }

      this.field_48646 = (class_9491[]) Config.method_14441(this.field_48646, var1);
   }

   public void method_44183(int var1, int var2) {
      class_9491 var5 = this.method_44189(var1);
      if (var5 == null) {
         this.method_44184(new class_9491(var1, var2));
      } else if (var2 >= 0) {
         var5.method_43843(var2);
      }
   }

   private class_9491 method_44189(int var1) {
      if (this.field_48646 == null) {
         return null;
      } else {
         for (int var4 = 0; var4 < this.field_48646.length; var4++) {
            class_9491 var5 = this.field_48646[var4];
            if (var5.method_43838() == var1) {
               return var5;
            }
         }

         return null;
      }
   }

   public int[] method_44180() {
      if (this.field_48646 == null) {
         return null;
      } else {
         HashSet var3 = new HashSet();

         for (int var4 = 0; var4 < this.field_48646.length; var4++) {
            class_9491 var5 = this.field_48646[var4];
            if (var5.method_43838() >= 0) {
               var3.add(var5.method_43838());
            }
         }

         Integer[] var7 = var3.<Integer>toArray(new Integer[var3.size()]);
         int[] var8 = new int[var7.length];

         for (int var6 = 0; var6 < var7.length; var6++) {
            var8[var6] = var7[var6];
         }

         return var8;
      }
   }

   @Override
   public String toString() {
      return "" + this.field_48647 + "/" + this.field_48662 + ", blocks: " + Config.method_14289(this.field_48646) + ", source: " + this.field_48668;
   }
}
