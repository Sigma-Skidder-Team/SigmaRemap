package mapped;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Properties;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Class7448 implements Class7443 {
   public String field32022 = null;
   public String field32023 = null;
   private int field32024 = -1;
   private Class9727[] field32025 = null;
   private String field32026 = null;
   private int field32027 = -1;
   private int field32028 = 0;
   private int field32029 = 0;
   private int field32030 = 0;
   private int field32031 = 0;
   private int[] field32032 = null;
   private float[][] field32033 = (float[][])null;
   private static final int field32034 = -1;
   private static final int field32035 = 0;
   private static final int field32036 = 1;
   private static final int field32037 = 2;
   public static final String field32038 = "vanilla";
   public static final String field32039 = "grid";
   public static final String field32040 = "fixed";
   public static final String[] field32041 = new String[] {"vanilla", "grid", "fixed"};
   public static final String field32042 = "format";
   public static final String field32043 = "blocks";
   public static final String field32044 = "source";
   public static final String field32045 = "color";
   public static final String field32046 = "yVariance";
   public static final String field32047 = "yOffset";

   public Class7448(Properties var1, String var2, int var3, int var4, String var5) {
      Class8896 var8 = new Class8896("Colormap");
      this.field32022 = var8.method32382(var2);
      this.field32023 = var8.method32383(var2);
      this.field32024 = this.method24055(var1.getProperty("format", var5));
      this.field32025 = var8.method32384(var1.getProperty("blocks"));
      this.field32026 = method24062(var1.getProperty("source"), var2, this.field32023);
      this.field32027 = Class8896.method32408(var1.getProperty("color"), -1);
      this.field32028 = var8.method32398(var1.getProperty("yVariance"), 0);
      this.field32029 = var8.method32398(var1.getProperty("yOffset"), 0);
      this.field32030 = var3;
      this.field32031 = var4;
   }

   private int method24055(String var1) {
      if (var1 != null) {
         var1 = var1.trim();
         if (!var1.equals("vanilla")) {
            if (!var1.equals("grid")) {
               if (!var1.equals("fixed")) {
                  method24061("Unknown format: " + var1);
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

   public boolean method24056(String var1) {
      if (this.field32024 != 0 && this.field32024 != 1) {
         if (this.field32024 != 2) {
            return false;
         }

         if (this.field32027 < 0) {
            this.field32027 = 16777215;
         }
      } else {
         if (this.field32026 == null) {
            method24061("Source not defined: " + var1);
            return false;
         }

         this.method24059();
         if (this.field32032 == null) {
            return false;
         }

         if (this.field32027 < 0) {
            if (this.field32024 == 0) {
               this.field32027 = this.method24067(127, 127);
            }

            if (this.field32024 == 1) {
               this.field32027 = this.method24073(Class8708.field39311, new BlockPos(0, 64, 0));
            }
         }
      }

      return true;
   }

   public boolean method24057(String var1) {
      if (this.field32025 == null) {
         this.field32025 = this.method24058();
         if (this.field32025 == null) {
            method24061("Match blocks not defined: " + var1);
            return false;
         }
      }

      return true;
   }

   private Class9727[] method24058() {
      ResourceLocation var3 = new ResourceLocation(this.field32022);
      if (!Registry.field16072.method9193(var3)) {
         Pattern var8 = Pattern.compile("^block([0-9]+).*$");
         Matcher var5 = var8.matcher(this.field32022);
         if (var5.matches()) {
            String var6 = var5.group(1);
            int var7 = Class7944.method26899(var6, -1);
            if (var7 >= 0) {
               return new Class9727[]{new Class9727(var7)};
            }
         }

         Class8896 var9 = new Class8896("Colormap");
         Class9727[] var10 = var9.method32386(this.field32022);
         return var10 == null ? null : var10;
      } else {
         Block var4 = Registry.field16072.method9184(var3);
         return new Class9727[]{new Class9727(Class9716.method38065(var4))};
      }
   }

   private void method24059() {
      try {
         this.field32032 = null;
         if (this.field32026 == null) {
            return;
         }

         String var3 = this.field32026 + ".png";
         ResourceLocation var4 = new ResourceLocation(var3);
         InputStream var5 = Class7944.method26863(var4);
         if (var5 == null) {
            return;
         }

         BufferedImage var6 = Class8684.method31290(var5);
         if (var6 == null) {
            return;
         }

         int var7 = var6.getWidth();
         int var8 = var6.getHeight();
         boolean var9 = this.field32030 < 0 || this.field32030 == var7;
         boolean var10 = this.field32031 < 0 || this.field32031 == var8;
         if (!var9 || !var10) {
            method24060("Non-standard palette size: " + var7 + "x" + var8 + ", should be: " + this.field32030 + "x" + this.field32031 + ", path: " + var3);
         }

         this.field32030 = var7;
         this.field32031 = var8;
         if (this.field32030 <= 0 || this.field32031 <= 0) {
            method24061("Invalid palette size: " + var7 + "x" + var8 + ", path: " + var3);
            return;
         }

         this.field32032 = new int[var7 * var8];
         var6.getRGB(0, 0, var7, var8, this.field32032, 0, var7);
      } catch (IOException var11) {
         var11.printStackTrace();
      }
   }

   private static void method24060(String var0) {
      Class7944.method26810("CustomColors: " + var0);
   }

   private static void method24061(String var0) {
      Class7944.method26811("CustomColors: " + var0);
   }

   private static String method24062(String var0, String var1, String var2) {
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

         return method24063(var9, var2);
      } else {
         var0 = var0.trim();
         String var5 = ".png";
         if (var0.endsWith(var5)) {
            var0 = var0.substring(0, var0.length() - var5.length());
         }

         return method24063(var0, var2);
      }
   }

   private static String method24063(String var0, String var1) {
      var0 = Class8684.method31274(var0, var1);
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

   public boolean method24064(Class7380 var1) {
      return Class7542.method24657(var1, this.field32025);
   }

   public int method24065() {
      if (this.field32024 != 2) {
         int var3 = Class9680.field45268.nextInt(this.field32032.length);
         return this.field32032[var3];
      } else {
         return this.field32027;
      }
   }

   public int method24066(int var1) {
      var1 = Class7944.method26830(var1, 0, this.field32032.length - 1);
      return this.field32032[var1] & 16777215;
   }

   public int method24067(int var1, int var2) {
      var1 = Class7944.method26830(var1, 0, this.field32030 - 1);
      var2 = Class7944.method26830(var2, 0, this.field32031 - 1);
      return this.field32032[var2 * this.field32030 + var1] & 16777215;
   }

   public float[][] method24068() {
      if (this.field32033 == null) {
         this.field32033 = method24077(this.field32032);
      }

      return this.field32033;
   }

   @Override
   public int method24053(Class7380 var1, Class1663 var2, BlockPos var3) {
      return this.method24069(var2, var3);
   }

   public int method24069(Class1663 var1, BlockPos var2) {
      Biome var5 = Class9680.method37851(var1, var2);
      return this.method24070(var5, var2);
   }

   @Override
   public boolean method24054() {
      return this.field32024 == 2;
   }

   public int method24070(Biome var1, BlockPos var2) {
      if (this.field32024 != 0) {
         return this.field32024 != 1 ? this.field32027 : this.method24073(var1, var2);
      } else {
         return this.method24072(var1, var2);
      }
   }

   public int method24071(Class1663 var1, double var2, double var4, double var6, int var8) {
      if (this.field32024 == 2) {
         return this.field32027;
      } else {
         int var11 = MathHelper.method37769(var2);
         int var12 = MathHelper.method37769(var4);
         int var13 = MathHelper.method37769(var6);
         int var14 = 0;
         int var15 = 0;
         int var16 = 0;
         int var17 = 0;
         Class2001 var18 = new Class2001(0, 0, 0);

         for (int var19 = var11 - var8; var19 <= var11 + var8; var19++) {
            for (int var20 = var13 - var8; var20 <= var13 + var8; var20++) {
               var18.method8384(var19, var12, var20);
               int var21 = this.method24069(var1, var18);
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

   private int method24072(Biome var1, BlockPos var2) {
      double var5 = (double) MathHelper.method37777(var1.method32503(var2), 0.0F, 1.0F);
      double var7 = (double) MathHelper.method37777(var1.method32516(), 0.0F, 1.0F);
      var7 *= var5;
      int var9 = (int)((1.0 - var5) * (double)(this.field32030 - 1));
      int var10 = (int)((1.0 - var7) * (double)(this.field32031 - 1));
      return this.method24067(var9, var10);
   }

   private int method24073(Biome var1, BlockPos var2) {
      int var5 = Class8708.method31407(var1);
      int var6 = var2.getY() - this.field32029;
      if (this.field32028 > 0) {
         int var7 = var2.method8304() << 16 + var2.method8306();
         int var8 = Class7944.method26933(var7);
         int var9 = this.field32028 * 2 + 1;
         int var10 = (var8 & 0xFF) % var9 - this.field32028;
         var6 += var10;
      }

      return this.method24067(var5, var6);
   }

   public int method24074() {
      return this.field32024 != 2 ? this.field32032.length : 1;
   }

   public int method24075() {
      return this.field32030;
   }

   public int method24076() {
      return this.field32031;
   }

   private static float[][] method24077(int[] var0) {
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

   public void method24078(Class9727 var1) {
      if (this.field32025 == null) {
         this.field32025 = new Class9727[0];
      }

      this.field32025 = (Class9727[])Class7944.method26948(this.field32025, var1);
   }

   public void method24079(int var1, int var2) {
      Class9727 var5 = this.method24080(var1);
      if (var5 == null) {
         this.method24078(new Class9727(var1, var2));
      } else if (var2 >= 0) {
         var5.method38107(var2);
      }
   }

   private Class9727 method24080(int var1) {
      if (this.field32025 == null) {
         return null;
      } else {
         for (int var4 = 0; var4 < this.field32025.length; var4++) {
            Class9727 var5 = this.field32025[var4];
            if (var5.method38103() == var1) {
               return var5;
            }
         }

         return null;
      }
   }

   public int[] method24081() {
      if (this.field32025 == null) {
         return null;
      } else {
         Set<Integer> var3 = new HashSet();

         for (int var4 = 0; var4 < this.field32025.length; var4++) {
            Class9727 var5 = this.field32025[var4];
            if (var5.method38103() >= 0) {
               var3.add(var5.method38103());
            }
         }

         Integer[] var7 = var3.toArray(new Integer[var3.size()]);
         int[] var8 = new int[var7.length];

         for (int var6 = 0; var6 < var7.length; var6++) {
            var8[var6] = var7[var6];
         }

         return var8;
      }
   }

   @Override
   public String toString() {
      return "" + this.field32023 + "/" + this.field32022 + ", blocks: " + Class7944.method26854(this.field32025) + ", source: " + this.field32026;
   }
}
