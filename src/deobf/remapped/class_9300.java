package remapped;

import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import java.util.Set;
import javax.imageio.ImageIO;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;

public class class_9300 {
   private static String field_47473 = field_47459[0];
   private static class_9561 field_47495 = null;
   private static class_9561 field_47478 = null;
   private static class_9561 field_47484 = null;
   private static class_9561 field_47465 = null;
   private static class_9561 field_47497 = null;
   private static class_9561[] field_47470 = null;
   private static class_9561[][] field_47482 = (class_9561[][])null;
   private static class_9561 field_47488 = null;
   private static class_6008 field_47486 = new class_6008();
   private static class_9561 field_47499 = null;
   private static class_6008 field_47494 = new class_6008();
   private static class_9561 field_47503 = null;
   private static class_6008 field_47458 = new class_6008();
   private static class_9561 field_47493 = null;
   private static class_6008 field_47454 = new class_6008();
   private static class_8775[] field_47463 = null;
   private static int field_47487 = 0;
   private static class_9561 field_47469 = null;
   private static class_9561 field_47477 = null;
   private static int field_47456 = -1;
   private static class_9561 field_47480 = null;
   private static class_9561 field_47505 = null;
   private static class_9561 field_47491 = null;
   private static class_9561 field_47475 = null;
   private static class_9561 field_47457 = null;
   private static boolean field_47489 = true;
   private static int field_47501 = -1;
   private static int field_47479 = -1;
   private static int field_47466 = -1;
   private static int field_47502 = -1;
   private static int field_47472 = -1;
   private static int field_47485 = -1;
   private static class_1343 field_47471 = null;
   private static class_1343 field_47496 = null;
   private static class_1343 field_47455 = null;
   private static int[] field_47467 = null;
   private static int[] field_47460 = null;
   private static float[][] field_47500 = (float[][])null;
   private static float[][] field_47468 = (float[][])null;
   private static int[] field_47476 = null;
   private static int[] field_47492 = null;
   private static int[] field_47483 = null;
   private static final class_2522 field_47498 = class_4783.field_23592.method_29260();
   private static final class_2522 field_47474 = class_4783.field_23900.method_29260();
   public static Random field_47461 = new Random();
   private static final class_9538 field_47462 = new class_7535();
   private static final class_9538 field_47481 = new class_5074();
   private static final class_9538 field_47504 = new class_3221();
   private static final class_9538 field_47464 = new class_8847();
   private static final class_9538 field_47490 = new class_1965();

   public static void method_42905() {
      field_47473 = "vanilla";
      field_47495 = null;
      field_47484 = null;
      field_47478 = null;
      field_47497 = null;
      field_47465 = null;
      field_47488 = null;
      field_47499 = null;
      field_47503 = null;
      field_47493 = null;
      field_47469 = null;
      field_47477 = null;
      field_47456 = -1;
      field_47480 = null;
      field_47505 = null;
      field_47457 = null;
      field_47463 = null;
      field_47501 = -1;
      field_47479 = -1;
      field_47466 = -1;
      field_47502 = -1;
      field_47472 = -1;
      field_47485 = -1;
      field_47471 = null;
      field_47496 = null;
      field_47455 = null;
      field_47470 = null;
      field_47482 = (class_9561[][])null;
      field_47489 = true;
      field_47467 = null;
      field_47460 = null;
      field_47500 = (float[][])null;
      field_47468 = (float[][])null;
      field_47476 = null;
      method_42865(field_47492);
      field_47483 = null;
      field_47473 = method_42878("optifine/color.properties", "palette.format", class_9561.field_48658, "vanilla");
      String var2 = "optifine/colormap/";
      String[] var3 = new String[]{"water.png", "watercolorx.png"};
      field_47495 = method_42894(var2, var3, 256, 256);
      method_42896();
      if (Config.method_14438()) {
         String[] var4 = new String[]{"pine.png", "pinecolor.png"};
         field_47478 = method_42894(var2, var4, 256, 256);
         String[] var5 = new String[]{"birch.png", "birchcolor.png"};
         field_47484 = method_42894(var2, var5, 256, 256);
         String[] var6 = new String[]{"swampgrass.png", "swampgrasscolor.png"};
         field_47497 = method_42894(var2, var6, 256, 256);
         String[] var7 = new String[]{"swampfoliage.png", "swampfoliagecolor.png"};
         field_47465 = method_42894(var2, var7, 256, 256);
         String[] var8 = new String[]{"sky0.png", "skycolor0.png"};
         field_47488 = method_42894(var2, var8, 256, 256);
         String[] var9 = new String[]{"fog0.png", "fogcolor0.png"};
         field_47499 = method_42894(var2, var9, 256, 256);
         String[] var10 = new String[]{"underwater.png", "underwatercolor.png"};
         field_47503 = method_42894(var2, var10, 256, 256);
         String[] var11 = new String[]{"underlava.png", "underlavacolor.png"};
         field_47493 = method_42894(var2, var11, 256, 256);
         String[] var12 = new String[]{"redstone.png", "redstonecolor.png"};
         field_47469 = method_42894(var2, var12, 16, 1);
         field_47477 = method_42893(var2 + "xporb.png", -1, -1);
         field_47480 = method_42893(var2 + "durability.png", -1, -1);
         String[] var13 = new String[]{"stem.png", "stemcolor.png"};
         field_47505 = method_42894(var2, var13, 8, 1);
         field_47475 = method_42893(var2 + "pumpkinstem.png", 8, 1);
         field_47491 = method_42893(var2 + "melonstem.png", 8, 1);
         String[] var14 = new String[]{"myceliumparticle.png", "myceliumparticlecolor.png"};
         field_47457 = method_42894(var2, var14, -1, -1);
         Pair var15 = method_42929();
         field_47463 = (class_8775[])var15.getLeft();
         field_47487 = (Integer)var15.getRight();
         method_42864("optifine/color.properties");
         field_47482 = method_42911(new String[]{var2 + "custom/", var2 + "blocks/"}, field_47470, 256, 256);
         method_42896();
      }
   }

   private static String method_42878(String var0, String var1, String[] var2, String var3) {
      try {
         Identifier var6 = new Identifier(var0);
         InputStream var7 = Config.method_14374(var6);
         if (var7 == null) {
            return var3;
         } else {
            class_8407 var8 = new class_8407();
            var8.load(var7);
            var7.close();
            String var9 = var8.getProperty(var1);
            if (var9 == null) {
               return var3;
            } else {
               List var10 = Arrays.<String>asList(var2);
               if (!var10.contains(var9)) {
                  method_42898("Invalid value: " + var1 + "=" + var9);
                  method_42898("Expected values: " + Config.method_14289(var2));
                  return var3;
               } else {
                  method_42869("" + var1 + "=" + var9);
                  return var9;
               }
            }
         }
      } catch (FileNotFoundException var11) {
         return var3;
      } catch (IOException var12) {
         var12.printStackTrace();
         return var3;
      }
   }

   private static Pair<class_8775[], Integer> method_42929() {
      String var2 = "optifine/lightmap/world";
      String var3 = ".png";
      String[] var4 = class_9654.method_44542(var2, var3);
      HashMap var5 = new HashMap();

      for (int var6 = 0; var6 < var4.length; var6++) {
         String var7 = var4[var6];
         String var8 = class_8251.method_37819(var7, var2, var3);
         int var9 = Config.method_14361(var8, Integer.MIN_VALUE);
         if (var9 != Integer.MIN_VALUE) {
            var5.put(var9, var7);
         } else {
            method_42898("Invalid dimension ID: " + var8 + ", path: " + var7);
         }
      }

      Set var23 = var5.keySet();
      Integer[] var24 = var23.<Integer>toArray(new Integer[var23.size()]);
      Arrays.sort(var24);
      if (var24.length > 0) {
         int var25 = var24[0];
         int var26 = var24[var24.length - 1];
         int var10 = var26 - var25 + 1;
         class_9561[] var11 = new class_9561[var10];

         for (int var12 = 0; var12 < var24.length; var12++) {
            Integer var13 = var24[var12];
            String var14 = (String)var5.get(var13);
            class_9561 var15 = method_42893(var14, -1, -1);
            if (var15 != null) {
               if (var15.method_44182() >= 16) {
                  int var16 = var13 - var25;
                  var11[var16] = var15;
               } else {
                  method_42898("Invalid lightmap width: " + var15.method_44182() + ", path: " + var14);
               }
            }
         }

         class_8775[] var27 = new class_8775[var11.length];

         for (int var28 = 0; var28 < var11.length; var28++) {
            class_9561 var29 = var11[var28];
            if (var29 != null) {
               String var30 = var29.field_48662;
               String var31 = var29.field_48647;
               class_9561 var17 = method_42893(var31 + "/" + var30 + "_rain.png", -1, -1);
               class_9561 var18 = method_42893(var31 + "/" + var30 + "_thunder.png", -1, -1);
               class_5170 var19 = new class_5170(var29);
               class_5170 var20 = var17 == null ? null : new class_5170(var17);
               class_5170 var21 = var18 == null ? null : new class_5170(var18);
               class_8775 var22 = new class_8775(var19, var20, var21);
               var27[var28] = var22;
            }
         }

         return new ImmutablePair(var27, var25);
      } else {
         return new ImmutablePair((class_8775[])null, 0);
      }
   }

   private static int method_42916(String var0, int var1) {
      try {
         InputStream var4 = Config.method_14374(new Identifier(var0));
         if (var4 == null) {
            return var1;
         } else {
            BufferedImage var5 = ImageIO.read(var4);
            var4.close();
            return var5 == null ? var1 : var5.getHeight();
         }
      } catch (IOException var6) {
         return var1;
      }
   }

   private static void method_42864(String var0) {
      try {
         Identifier var3 = new Identifier(var0);
         InputStream var4 = Config.method_14374(var3);
         if (var4 == null) {
            return;
         }

         method_42869("Loading " + var0);
         class_8407 var5 = new class_8407();
         var5.load(var4);
         var4.close();
         field_47501 = method_42867(var5, new String[]{"particle.water", "drop.water"});
         field_47479 = method_42866(var5, "particle.portal");
         field_47466 = method_42866(var5, "lilypad");
         field_47502 = method_42866(var5, "text.xpbar");
         field_47472 = method_42866(var5, "text.boss");
         field_47485 = method_42866(var5, "text.sign");
         field_47471 = method_42901(var5, "fog.nether");
         field_47496 = method_42901(var5, "fog.end");
         field_47455 = method_42901(var5, "sky.end");
         field_47470 = method_42913(var5, var0);
         field_47467 = method_42906(var5, var0, "egg.shell.", "Spawn egg shell");
         field_47460 = method_42906(var5, var0, "egg.spots.", "Spawn egg spot");
         field_47500 = method_42915(var5, var0, "collar.", "Wolf collar");
         field_47468 = method_42915(var5, var0, "sheep.", "Sheep");
         field_47476 = method_42859(var5, var0, "text.code.", "Text");
         int[] var6 = method_42883(var5, var0, "map.", "Map");
         if (var6 != null) {
            if (field_47492 == null) {
               field_47492 = method_42891();
            }

            method_42865(var6);
         }

         field_47483 = method_42902(var5, var0, "potion.", "Potion");
         field_47456 = Config.method_14361(var5.getProperty("xporb.time"), -1);
      } catch (FileNotFoundException var7) {
         return;
      } catch (IOException var8) {
         Config.method_14317("Error parsing: " + var0);
         Config.method_14317(var8.getClass().getName() + ": " + var8.getMessage());
      }
   }

   private static class_9561[] method_42913(Properties var0, String var1) {
      ArrayList var4 = new ArrayList();
      String var5 = "palette.block.";
      HashMap var6 = new HashMap();

      for (String var8 : var0.keySet()) {
         String var9 = var0.getProperty(var8);
         if (var8.startsWith(var5)) {
            var6.put(var8, var9);
         }
      }

      String[] var18 = var6.keySet().<String>toArray(new String[var6.size()]);

      for (int var19 = 0; var19 < var18.length; var19++) {
         String var20 = var18[var19];
         String var10 = var0.getProperty(var20);
         method_42869("Block palette: " + var20 + " = " + var10);
         String var11 = var20.substring(var5.length());
         String var12 = class_5525.method_25091(var1);
         var11 = class_5525.method_25096(var11, var12);
         class_9561 var13 = method_42893(var11, 256, 256);
         if (var13 == null) {
            method_42898("Colormap not found: " + var11);
         } else {
            class_6284 var14 = new class_6284("CustomColors");
            class_9491[] var15 = var14.method_28680(var10);
            if (var15 != null && var15.length > 0) {
               for (int var16 = 0; var16 < var15.length; var16++) {
                  class_9491 var17 = var15[var16];
                  var13.method_44184(var17);
               }

               var4.add(var13);
            } else {
               method_42898("Invalid match blocks: " + var10);
            }
         }
      }

      return var4.size() > 0 ? var4.<class_9561>toArray(new class_9561[var4.size()]) : null;
   }

   private static class_9561[][] method_42911(String[] var0, class_9561[] var1, int var2, int var3) {
      String[] var6 = class_9654.method_44546(var0, new String[]{".properties"});
      Arrays.sort(var6);
      ArrayList var7 = new ArrayList();

      for (int var8 = 0; var8 < var6.length; var8++) {
         String var9 = var6[var8];
         method_42869("Block colormap: " + var9);

         try {
            Identifier var10 = new Identifier("minecraft", var9);
            InputStream var11 = Config.method_14374(var10);
            if (var11 == null) {
               method_42898("File not found: " + var9);
            } else {
               class_8407 var12 = new class_8407();
               var12.load(var11);
               var11.close();
               class_9561 var13 = new class_9561(var12, var9, var2, var3, field_47473);
               if (var13.method_44164(var9) && var13.method_44179(var9)) {
                  method_42868(var13, var7);
               }
            }
         } catch (FileNotFoundException var14) {
            method_42898("File not found: " + var9);
         } catch (Exception var15) {
            var15.printStackTrace();
         }
      }

      if (var1 != null) {
         for (int var16 = 0; var16 < var1.length; var16++) {
            class_9561 var17 = var1[var16];
            method_42868(var17, var7);
         }
      }

      return var7.size() <= 0 ? (class_9561[][])null : method_42892(var7);
   }

   private static void method_42868(class_9561 var0, List var1) {
      int[] var4 = var0.method_44180();
      if (var4 != null && var4.length > 0) {
         for (int var5 = 0; var5 < var4.length; var5++) {
            int var6 = var4[var5];
            if (var6 >= 0) {
               method_42922(var0, var1, var6);
            } else {
               method_42898("Invalid block ID: " + var6);
            }
         }
      } else {
         method_42898("No match blocks: " + Config.method_14287(var4));
      }
   }

   private static void method_42922(class_9561 var0, List var1, int var2) {
      while (var2 >= var1.size()) {
         var1.add(null);
      }

      Object var5 = (List)var1.get(var2);
      if (var5 == null) {
         var5 = new ArrayList();
         var1.set(var2, var5);
      }

      var5.add(var0);
   }

   private static class_9561[][] method_42892(List var0) {
      class_9561[][] var3 = new class_9561[var0.size()][];

      for (int var4 = 0; var4 < var0.size(); var4++) {
         List var5 = (List)var0.get(var4);
         if (var5 != null) {
            class_9561[] var6 = var5.<class_9561>toArray(new class_9561[var5.size()]);
            var3[var4] = var6;
         }
      }

      return var3;
   }

   private static int method_42867(Properties var0, String[] var1) {
      for (int var4 = 0; var4 < var1.length; var4++) {
         String var5 = var1[var4];
         int var6 = method_42866(var0, var5);
         if (var6 >= 0) {
            return var6;
         }
      }

      return -1;
   }

   private static int method_42866(Properties var0, String var1) {
      String var4 = var0.getProperty(var1);
      if (var4 != null) {
         var4 = var4.trim();
         int var5 = method_42871(var4);
         if (var5 >= 0) {
            method_42869(var1 + " = " + var4);
            return var5;
         } else {
            method_42898("Invalid color: " + var1 + " = " + var4);
            return var5;
         }
      } else {
         return -1;
      }
   }

   private static int method_42871(String var0) {
      if (var0 == null) {
         return -1;
      } else {
         var0 = var0.trim();

         try {
            return Integer.parseInt(var0, 16) & 16777215;
         } catch (NumberFormatException var4) {
            return -1;
         }
      }
   }

   private static class_1343 method_42901(Properties var0, String var1) {
      int var4 = method_42866(var0, var1);
      if (var4 >= 0) {
         int var5 = var4 >> 16 & 0xFF;
         int var6 = var4 >> 8 & 0xFF;
         int var7 = var4 & 0xFF;
         float var8 = (float)var5 / 255.0F;
         float var9 = (float)var6 / 255.0F;
         float var10 = (float)var7 / 255.0F;
         return new class_1343((double)var8, (double)var9, (double)var10);
      } else {
         return null;
      }
   }

   private static class_9561 method_42894(String var0, String[] var1, int var2, int var3) {
      for (int var6 = 0; var6 < var1.length; var6++) {
         String var7 = var1[var6];
         var7 = var0 + var7;
         class_9561 var8 = method_42893(var7, var2, var3);
         if (var8 != null) {
            return var8;
         }
      }

      return null;
   }

   public static class_9561 method_42893(String var0, int var1, int var2) {
      try {
         Identifier var5 = new Identifier(var0);
         if (!Config.method_14362(var5)) {
            return null;
         } else {
            method_42869("Colormap " + var0);
            class_8407 var6 = new class_8407();
            String var7 = class_8251.method_37836(var0, ".png", ".properties");
            Identifier var8 = new Identifier(var7);
            if (Config.method_14362(var8)) {
               InputStream var9 = Config.method_14374(var8);
               var6.load(var9);
               var9.close();
               method_42869("Colormap properties: " + var7);
            } else {
               var6.put("format", field_47473);
               var6.put("source", var0);
               var7 = var0;
            }

            class_9561 var11 = new class_9561(var6, var7, var1, var2, field_47473);
            return !var11.method_44164(var7) ? null : var11;
         }
      } catch (Exception var10) {
         var10.printStackTrace();
         return null;
      }
   }

   public static void method_42896() {
      field_47489 = field_47484 == null && field_47478 == null && field_47497 == null && field_47465 == null && Config.method_14293();
   }

   public static int method_42879(class_5024 var0, class_2522 var1, class_5561 var2, BlockPos var3, class_4460 var4) {
      class_6414 var7 = var1.method_8360();
      class_2522 var8 = var1;
      if (field_47482 != null) {
         if (!var0.method_23149()) {
            if (var7 == class_4783.field_23259) {
               var8 = field_47498;
            }

            if (var7 == class_4783.field_23349) {
               return -1;
            }
         }

         if (var7 instanceof class_3064 && var1.<class_7422>method_10313(class_3064.field_15063) == class_7422.field_37874) {
            var3 = var3.method_6100();
            var8 = var2.method_28262(var3);
         }

         class_9561 var9 = method_42904(var8);
         if (var9 != null) {
            if (Config.method_14265() && !var9.method_43978()) {
               return method_42857(var1, var2, var3, var9, var4.method_20673());
            }

            return var9.method_44170(var2, var3);
         }
      }

      if (!var0.method_23149()) {
         return -1;
      } else if (var7 != class_4783.field_23860) {
         if (var7 == class_4783.field_23349) {
            return method_42881(var4.method_20687());
         } else if (!(var7 instanceof class_8138)) {
            if (field_47489) {
               return -1;
            } else {
               class_9538 var10;
               if (var7 == class_4783.field_23259 || var7 == class_4783.field_23247 || var7 instanceof class_3064) {
                  var10 = field_47462;
               } else if (!(var7 instanceof class_3064)) {
                  if (!(var7 instanceof class_4423)) {
                     if (var7 != class_4783.field_23323) {
                        return -1;
                     }

                     var10 = field_47481;
                  } else if (var7 != class_4783.field_23539) {
                     if (var7 != class_4783.field_23493) {
                        if (var7 != class_4783.field_23467) {
                           var10 = field_47481;
                        } else {
                           var10 = field_47464;
                        }
                     } else {
                        var10 = field_47504;
                     }
                  } else {
                     var10 = field_47481;
                  }
               } else {
                  var10 = field_47462;
                  if (var1.<class_7422>method_10313(class_3064.field_15063) == class_7422.field_37874) {
                     var3 = var3.method_6100();
                  }
               }

               return Config.method_14265() && !var10.method_43978()
                  ? method_42857(var1, var2, var3, var10, var4.method_20673())
                  : var10.method_43977(var8, var2, var3);
            }
         } else {
            return method_42870(var1, var2, var3, var4);
         }
      } else {
         return method_42926(var2, var3);
      }
   }

   public static class_6325 method_42872(class_5561 var0, BlockPos var1) {
      class_6325 var4 = class_5630.method_25519(var0, var1);
      if ((var4 == class_5630.field_28566 || var4 == class_5630.field_28569) && !Config.method_14293()) {
         var4 = class_5630.field_28568;
      }

      return var4;
   }

   private static class_9561 method_42904(class_2522 var0) {
      if (field_47482 != null) {
         if (!(var0 instanceof class_2522)) {
            return null;
         } else {
            class_2522 var3 = var0;
            int var4 = var0.method_11477();
            if (var4 >= 0 && var4 < field_47482.length) {
               class_9561[] var5 = field_47482[var4];
               if (var5 == null) {
                  return null;
               } else {
                  for (int var6 = 0; var6 < var5.length; var6++) {
                     class_9561 var7 = var5[var6];
                     if (var7.method_44173(var3)) {
                        return var7;
                     }
                  }

                  return null;
               }
            } else {
               return null;
            }
         }
      } else {
         return null;
      }
   }

   private static int method_42857(class_2522 var0, class_5561 var1, BlockPos var2, class_9538 var3, class_523 var4) {
      int var7 = 0;
      int var8 = 0;
      int var9 = 0;
      int var10 = var2.getX();
      int var11 = var2.method_12165();
      int var12 = var2.method_12185();
      class_523 var13 = var4;
      int var14 = Config.method_14235();
      int var15 = var14 * 2 + 1;
      int var16 = var15 * var15;

      for (int var17 = var10 - var14; var17 <= var10 + var14; var17++) {
         for (int var18 = var12 - var14; var18 <= var12 + var14; var18++) {
            var13.method_2548(var17, var11, var18);
            int var19 = var3.method_43977(var0, var1, var13);
            var7 += var19 >> 16 & 0xFF;
            var8 += var19 >> 8 & 0xFF;
            var9 += var19 & 0xFF;
         }
      }

      int var20 = var7 / var16;
      int var21 = var8 / var16;
      int var22 = var9 / var16;
      return var20 << 16 | var21 << 8 | var22;
   }

   public static int method_42889(class_5561 var0, class_2522 var1, BlockPos var2, class_4460 var3) {
      class_6414 var6 = var1.method_8360();
      Object var7 = method_42904(var1);
      if (var7 == null && var1.method_8362() == class_5371.field_27439) {
         var7 = field_47490;
      }

      if (var7 == null) {
         return method_42886().method_20749(var1, var0, var2, 0);
      } else {
         return Config.method_14265() && !((class_9538)var7).method_43978()
            ? method_42857(var1, var0, var2, (class_9538)var7, var3.method_20673())
            : ((class_9538)var7).method_43977(var1, var0, var2);
      }
   }

   public static class_4468 method_42886() {
      return MinecraftClient.getInstance().method_8569();
   }

   public static void method_42877(class_9733 var0) {
      if (field_47479 >= 0) {
         int var3 = field_47479;
         int var4 = var3 >> 16 & 0xFF;
         int var5 = var3 >> 8 & 0xFF;
         int var6 = var3 & 0xFF;
         float var7 = (float)var4 / 255.0F;
         float var8 = (float)var5 / 255.0F;
         float var9 = (float)var6 / 255.0F;
         var0.method_44953(var7, var8, var9);
      }
   }

   public static void method_42900(class_9733 var0) {
      if (field_47457 != null) {
         int var3 = field_47457.method_44191();
         int var4 = var3 >> 16 & 0xFF;
         int var5 = var3 >> 8 & 0xFF;
         int var6 = var3 & 0xFF;
         float var7 = (float)var4 / 255.0F;
         float var8 = (float)var5 / 255.0F;
         float var9 = (float)var6 / 255.0F;
         var0.method_44953(var7, var8, var9);
      }
   }

   private static int method_42881(class_2522 var0) {
      if (field_47469 != null) {
         int var3 = method_42912(var0, 15);
         return field_47469.method_44168(var3);
      } else {
         return -1;
      }
   }

   public static void method_42862(class_9733 var0, class_5561 var1, double var2, double var4, double var6) {
      if (field_47469 != null) {
         class_2522 var10 = var1.method_28262(new BlockPos(var2, var4, var6));
         int var11 = method_42912(var10, 15);
         int var12 = field_47469.method_44168(var11);
         int var13 = var12 >> 16 & 0xFF;
         int var14 = var12 >> 8 & 0xFF;
         int var15 = var12 & 0xFF;
         float var16 = (float)var13 / 255.0F;
         float var17 = (float)var14 / 255.0F;
         float var18 = (float)var15 / 255.0F;
         var0.method_44953(var16, var17, var18);
      }
   }

   private static int method_42912(class_2522 var0, int var1) {
      class_6414 var4 = var0.method_8360();
      if (var4 instanceof class_9301) {
         Comparable var5 = var0.<Integer>method_10313(class_9301.field_47514);
         if (var5 instanceof Integer) {
            Integer var6 = (Integer)var5;
            return var6;
         } else {
            return var1;
         }
      } else {
         return var1;
      }
   }

   public static float method_42880(float var0) {
      if (field_47456 > 0) {
         float var3 = 628.0F / (float)field_47456;
         return var0 * var3;
      } else {
         return var0;
      }
   }

   public static int method_42918(float var0) {
      if (field_47477 != null) {
         int var3 = (int)Math.round((double)((MathHelper.sin(var0) + 1.0F) * (float)(field_47477.method_44167() - 1)) / 2.0);
         return field_47477.method_44168(var3);
      } else {
         return -1;
      }
   }

   public static int method_42861(float var0, int var1) {
      if (field_47480 != null) {
         int var4 = (int)(var0 * (float)field_47480.method_44167());
         return field_47480.method_44168(var4);
      } else {
         return var1;
      }
   }

   public static void method_42921(class_9733 var0, class_5561 var1, double var2, double var4, double var6, class_4460 var8) {
      if (field_47495 != null || field_47482 != null || field_47501 >= 0) {
         BlockPos var11 = new BlockPos(var2, var4, var6);
         var8.method_20678(field_47474, var11);
         int var12 = method_42889(var1, field_47474, var11, var8);
         int var13 = var12 >> 16 & 0xFF;
         int var14 = var12 >> 8 & 0xFF;
         int var15 = var12 & 0xFF;
         float var16 = (float)var13 / 255.0F;
         float var17 = (float)var14 / 255.0F;
         float var18 = (float)var15 / 255.0F;
         if (field_47501 >= 0) {
            int var19 = field_47501 >> 16 & 0xFF;
            int var20 = field_47501 >> 8 & 0xFF;
            int var21 = field_47501 & 0xFF;
            var16 *= (float)var19 / 255.0F;
            var17 *= (float)var20 / 255.0F;
            var18 *= (float)var21 / 255.0F;
         }

         var0.method_44953(var16, var17, var18);
      }
   }

   private static int method_42926(class_5561 var0, BlockPos var1) {
      return field_47466 >= 0 ? field_47466 : method_42886().method_20749(class_4783.field_23860.method_29260(), var0, var1, 0);
   }

   private static class_1343 method_42924(class_1343 var0) {
      return field_47471 != null ? field_47471 : var0;
   }

   private static class_1343 method_42899(class_1343 var0) {
      return field_47496 != null ? field_47496 : var0;
   }

   private static class_1343 method_42884(class_1343 var0) {
      return field_47455 != null ? field_47455 : var0;
   }

   public static class_1343 method_42885(class_1343 var0, class_5561 var1, double var2, double var4, double var6) {
      if (field_47488 != null) {
         int var10 = field_47488.method_44174(var1, var2, var4, var6, 3);
         int var11 = var10 >> 16 & 0xFF;
         int var12 = var10 >> 8 & 0xFF;
         int var13 = var10 & 0xFF;
         float var14 = (float)var11 / 255.0F;
         float var15 = (float)var12 / 255.0F;
         float var16 = (float)var13 / 255.0F;
         float var17 = (float)var0.field_7336 / 0.5F;
         float var18 = (float)var0.field_7333 / 0.66275F;
         float var19 = (float)var0.field_7334;
         var14 *= var17;
         var15 *= var18;
         var16 *= var19;
         return field_47486.method_27427((double)var14, (double)var15, (double)var16);
      } else {
         return var0;
      }
   }

   private static class_1343 method_42920(class_1343 var0, class_5561 var1, double var2, double var4, double var6) {
      if (field_47499 != null) {
         int var10 = field_47499.method_44174(var1, var2, var4, var6, 3);
         int var11 = var10 >> 16 & 0xFF;
         int var12 = var10 >> 8 & 0xFF;
         int var13 = var10 & 0xFF;
         float var14 = (float)var11 / 255.0F;
         float var15 = (float)var12 / 255.0F;
         float var16 = (float)var13 / 255.0F;
         float var17 = (float)var0.field_7336 / 0.753F;
         float var18 = (float)var0.field_7333 / 0.8471F;
         float var19 = (float)var0.field_7334;
         var14 *= var17;
         var15 *= var18;
         var16 *= var19;
         return field_47494.method_27427((double)var14, (double)var15, (double)var16);
      } else {
         return var0;
      }
   }

   public static class_1343 method_42917(class_5561 var0, double var1, double var3, double var5) {
      return method_42908(var0, var1, var3, var5, field_47503, field_47458);
   }

   public static class_1343 method_42928(class_5561 var0, double var1, double var3, double var5) {
      return method_42908(var0, var1, var3, var5, field_47493, field_47454);
   }

   public static class_1343 method_42908(class_5561 var0, double var1, double var3, double var5, class_9561 var7, class_6008 var8) {
      if (var7 != null) {
         int var11 = var7.method_44174(var0, var1, var3, var5, 3);
         int var12 = var11 >> 16 & 0xFF;
         int var13 = var11 >> 8 & 0xFF;
         int var14 = var11 & 0xFF;
         float var15 = (float)var12 / 255.0F;
         float var16 = (float)var13 / 255.0F;
         float var17 = (float)var14 / 255.0F;
         return var8.method_27427((double)var15, (double)var16, (double)var17);
      } else {
         return null;
      }
   }

   private static int method_42870(class_2522 var0, class_6163 var1, BlockPos var2, class_4460 var3) {
      class_9561 var6 = field_47505;
      class_6414 var7 = var0.method_8360();
      if (var7 == class_4783.field_23301 && field_47475 != null) {
         var6 = field_47475;
      }

      if (var7 == class_4783.field_23212 && field_47491 != null) {
         var6 = field_47491;
      }

      if (var6 != null) {
         if (var7 instanceof class_8138) {
            int var8 = var0.<Integer>method_10313(class_8138.field_41679);
            return var6.method_44168(var8);
         } else {
            return -1;
         }
      } else {
         return -1;
      }
   }

   public static boolean method_42873(ClientWorld var0, float var1, class_5797 var2, boolean var3, float var4) {
      if (var0 != null) {
         if (field_47463 != null) {
            int var7 = class_4869.method_22375(var0);
            int var8 = var7 - field_47487;
            if (var8 >= 0 && var8 < field_47463.length) {
               class_8775 var9 = field_47463[var8];
               return var9 != null ? var9.method_40335(var0, var1, var2, var3, var4) : false;
            } else {
               return false;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public static class_1343 method_42860(class_1343 var0, World var1, Entity var2, float var3) {
      MinecraftClient var6 = MinecraftClient.getInstance();
      if (!class_4869.method_22377(var1)) {
         if (!class_4869.method_22376(var1)) {
            return !class_4869.method_22378(var1) ? var0 : method_42899(var0);
         } else {
            return method_42920(var0, var6.theWorld, var2.getPosX(), var2.method_37309() + 1.0, var2.getPosZ());
         }
      } else {
         return method_42924(var0);
      }
   }

   public static class_1343 method_42927(class_1343 var0, World var1, Entity var2, float var3) {
      MinecraftClient var6 = MinecraftClient.getInstance();
      if (!class_4869.method_22376(var1)) {
         return !class_4869.method_22378(var1) ? var0 : method_42884(var0);
      } else {
         return method_42885(var0, var6.theWorld, var2.getPosX(), var2.method_37309() + 1.0, var2.getPosZ());
      }
   }

   private static int[] method_42906(Properties var0, String var1, String var2, String var3) {
      ArrayList var6 = new ArrayList();
      Set var7 = var0.keySet();
      int var8 = 0;

      for (String var10 : var7) {
         String var11 = var0.getProperty(var10);
         if (var10.startsWith(var2)) {
            String var12 = class_8251.method_37832(var10, var2);
            int var13 = class_7070.method_32564(var12);

            try {
               if (var13 < 0) {
                  var13 = class_7070.method_32563(new Identifier(var12).toString());
               }
            } catch (class_7485 var15) {
               Config.method_14317("ResourceLocationException: " + var15.getMessage());
            }

            if (var13 < 0) {
               method_42898("Invalid spawn egg name: " + var10);
            } else {
               int var14 = method_42871(var11);
               if (var14 < 0) {
                  method_42898("Invalid spawn egg color: " + var10 + " = " + var11);
               } else {
                  while (var6.size() <= var13) {
                     var6.add(-1);
                  }

                  var6.set(var13, var14);
                  var8++;
               }
            }
         }
      }

      if (var8 <= 0) {
         return null;
      } else {
         method_42869(var3 + " colors: " + var8);
         int[] var16 = new int[var6.size()];

         for (int var17 = 0; var17 < var16.length; var17++) {
            var16[var17] = (Integer)var6.get(var17);
         }

         return var16;
      }
   }

   private static int method_42874(class_3003 var0, ItemStack var1, int var2, int var3) {
      if (field_47467 == null && field_47460 == null) {
         return var3;
      } else {
         EntityType var6 = var0.method_13719(var1.method_27990());
         if (var6 != null) {
            int var7 = class_8669.field_44400.method_14041(var6);
            if (var7 >= 0) {
               int[] var8 = var2 != 0 ? field_47460 : field_47467;
               if (var8 != null) {
                  if (var7 >= 0 && var7 < var8.length) {
                     int var9 = var8[var7];
                     return var9 >= 0 ? var9 : var3;
                  } else {
                     return var3;
                  }
               } else {
                  return var3;
               }
            } else {
               return var3;
            }
         } else {
            return var3;
         }
      }
   }

   public static int method_42897(ItemStack var0, int var1, int var2) {
      if (var0 != null) {
         class_2451 var5 = var0.method_27960();
         if (var5 != null) {
            return !(var5 instanceof class_3003) ? var2 : method_42874((class_3003)var5, var0, var1, var2);
         } else {
            return var2;
         }
      } else {
         return var2;
      }
   }

   private static float[][] method_42915(Properties var0, String var1, String var2, String var3) {
      class_9077[] var6 = class_9077.values();
      HashMap var7 = new HashMap();

      for (int var8 = 0; var8 < var6.length; var8++) {
         class_9077 var9 = var6[var8];
         var7.put(var9.method_21049(), var9);
      }

      var7.put("lightBlue", class_9077.field_46491);
      var7.put("silver", class_9077.field_46503);
      float[][] var17 = new float[var6.length][];
      int var18 = 0;

      for (String var11 : var0.keySet()) {
         String var12 = var0.getProperty(var11);
         if (var11.startsWith(var2)) {
            String var13 = class_8251.method_37832(var11, var2);
            class_9077 var14 = (class_9077)var7.get(var13);
            int var15 = method_42871(var12);
            if (var14 != null && var15 >= 0) {
               float[] var16 = new float[]{(float)(var15 >> 16 & 0xFF) / 255.0F, (float)(var15 >> 8 & 0xFF) / 255.0F, (float)(var15 & 0xFF) / 255.0F};
               var17[var14.ordinal()] = var16;
               var18++;
            } else {
               method_42898("Invalid color: " + var11 + " = " + var12);
            }
         }
      }

      if (var18 > 0) {
         method_42869(var3 + " colors: " + var18);
         return var17;
      } else {
         return (float[][])null;
      }
   }

   private static float[] method_42930(class_9077 var0, float[][] var1, float[] var2) {
      if (var1 != null) {
         if (var0 != null) {
            float[] var5 = var1[var0.ordinal()];
            return var5 != null ? var5 : var2;
         } else {
            return var2;
         }
      } else {
         return var2;
      }
   }

   public static float[] method_42914(class_9077 var0, float[] var1) {
      return method_42930(var0, field_47500, var1);
   }

   public static float[] method_42890(class_9077 var0, float[] var1) {
      return method_42930(var0, field_47468, var1);
   }

   private static int[] method_42859(Properties var0, String var1, String var2, String var3) {
      int[] var6 = new int[32];
      Arrays.fill(var6, -1);
      int var7 = 0;

      for (String var9 : var0.keySet()) {
         String var10 = var0.getProperty(var9);
         if (var9.startsWith(var2)) {
            String var11 = class_8251.method_37832(var9, var2);
            int var12 = Config.method_14361(var11, -1);
            int var13 = method_42871(var10);
            if (var12 >= 0 && var12 < var6.length && var13 >= 0) {
               var6[var12] = var13;
               var7++;
            } else {
               method_42898("Invalid color: " + var9 + " = " + var10);
            }
         }
      }

      if (var7 > 0) {
         method_42869(var3 + " colors: " + var7);
         return var6;
      } else {
         return null;
      }
   }

   public static int method_42863(int var0, int var1) {
      if (field_47476 != null) {
         if (var0 >= 0 && var0 < field_47476.length) {
            int var4 = field_47476[var0];
            return var4 >= 0 ? var4 : var1;
         } else {
            return var1;
         }
      } else {
         return var1;
      }
   }

   private static int[] method_42883(Properties var0, String var1, String var2, String var3) {
      int[] var6 = new int[class_1513.field_8024.length];
      Arrays.fill(var6, -1);
      int var7 = 0;

      for (String var9 : var0.keySet()) {
         String var10 = var0.getProperty(var9);
         if (var9.startsWith(var2)) {
            String var11 = class_8251.method_37832(var9, var2);
            int var12 = method_42875(var11);
            int var13 = method_42871(var10);
            if (var12 >= 0 && var12 < var6.length && var13 >= 0) {
               var6[var12] = var13;
               var7++;
            } else {
               method_42898("Invalid color: " + var9 + " = " + var10);
            }
         }
      }

      if (var7 > 0) {
         method_42869(var3 + " colors: " + var7);
         return var6;
      } else {
         return null;
      }
   }

   private static int[] method_42902(Properties var0, String var1, String var2, String var3) {
      int[] var6 = new int[method_42907()];
      Arrays.fill(var6, -1);
      int var7 = 0;

      for (String var9 : var0.keySet()) {
         String var10 = var0.getProperty(var9);
         if (var9.startsWith(var2)) {
            int var11 = method_42903(var9);
            int var12 = method_42871(var10);
            if (var11 >= 0 && var11 < var6.length && var12 >= 0) {
               var6[var11] = var12;
               var7++;
            } else {
               method_42898("Invalid color: " + var9 + " = " + var10);
            }
         }
      }

      if (var7 > 0) {
         method_42869(var3 + " colors: " + var7);
         return var6;
      } else {
         return null;
      }
   }

   private static int method_42907() {
      int var2 = 0;

      for (Identifier var4 : class_8669.field_44436.method_39805()) {
         class_1425 var5 = class_6845.method_31412(var4);
         int var6 = class_1425.method_6536(var5);
         if (var6 > var2) {
            var2 = var6;
         }
      }

      return var2;
   }

   private static int method_42903(String var0) {
      if (var0.equals("potion.water")) {
         return 0;
      } else {
         var0 = class_8251.method_37807(var0, "potion.", "effect.");

         for (Identifier var4 : class_8669.field_44436.method_39805()) {
            class_1425 var5 = class_6845.method_31412(var4);
            if (var5.method_6540().equals(var0)) {
               return class_1425.method_6536(var5);
            }
         }

         return -1;
      }
   }

   public static int method_42888(class_1425 var0, int var1) {
      int var4 = 0;
      if (var0 != null) {
         var4 = class_1425.method_6536(var0);
      }

      return method_42887(var4, var1);
   }

   public static int method_42887(int var0, int var1) {
      if (field_47483 != null) {
         if (var0 >= 0 && var0 < field_47483.length) {
            int var4 = field_47483[var0];
            return var4 >= 0 ? var4 : var1;
         } else {
            return var1;
         }
      } else {
         return var1;
      }
   }

   private static int method_42875(String var0) {
      if (var0 != null) {
         if (!var0.equals("air")) {
            if (!var0.equals("grass")) {
               if (!var0.equals("sand")) {
                  if (!var0.equals("cloth")) {
                     if (!var0.equals("tnt")) {
                        if (!var0.equals("ice")) {
                           if (!var0.equals("iron")) {
                              if (!var0.equals("foliage")) {
                                 if (!var0.equals("clay")) {
                                    if (!var0.equals("dirt")) {
                                       if (!var0.equals("stone")) {
                                          if (!var0.equals("water")) {
                                             if (!var0.equals("wood")) {
                                                if (!var0.equals("quartz")) {
                                                   if (!var0.equals("gold")) {
                                                      if (!var0.equals("diamond")) {
                                                         if (!var0.equals("lapis")) {
                                                            if (!var0.equals("emerald")) {
                                                               if (!var0.equals("podzol")) {
                                                                  if (!var0.equals("netherrack")) {
                                                                     if (var0.equals("snow") || var0.equals("white")) {
                                                                        return class_1513.field_8012.field_8027;
                                                                     } else if (var0.equals("adobe") || var0.equals("orange")) {
                                                                        return class_1513.field_8051.field_8027;
                                                                     } else if (var0.equals("magenta")) {
                                                                        return class_1513.field_8011.field_8027;
                                                                     } else if (var0.equals("light_blue") || var0.equals("lightBlue")) {
                                                                        return class_1513.field_8071.field_8027;
                                                                     } else if (var0.equals("yellow")) {
                                                                        return class_1513.field_8013.field_8027;
                                                                     } else if (var0.equals("lime")) {
                                                                        return class_1513.field_8025.field_8027;
                                                                     } else if (var0.equals("pink")) {
                                                                        return class_1513.field_8026.field_8027;
                                                                     } else if (var0.equals("gray")) {
                                                                        return class_1513.field_8016.field_8027;
                                                                     } else if (var0.equals("silver")) {
                                                                        return class_1513.field_8058.field_8027;
                                                                     } else if (var0.equals("cyan")) {
                                                                        return class_1513.field_8073.field_8027;
                                                                     } else if (var0.equals("purple")) {
                                                                        return class_1513.field_8020.field_8027;
                                                                     } else if (var0.equals("blue")) {
                                                                        return class_1513.field_8037.field_8027;
                                                                     } else if (var0.equals("brown")) {
                                                                        return class_1513.field_8070.field_8027;
                                                                     } else if (var0.equals("green")) {
                                                                        return class_1513.field_8063.field_8027;
                                                                     } else if (!var0.equals("red")) {
                                                                        return !var0.equals("black") ? -1 : class_1513.field_8059.field_8027;
                                                                     } else {
                                                                        return class_1513.field_8017.field_8027;
                                                                     }
                                                                  } else {
                                                                     return class_1513.field_8040.field_8027;
                                                                  }
                                                               } else {
                                                                  return class_1513.field_8022.field_8027;
                                                               }
                                                            } else {
                                                               return class_1513.field_8019.field_8027;
                                                            }
                                                         } else {
                                                            return class_1513.field_8066.field_8027;
                                                         }
                                                      } else {
                                                         return class_1513.field_8050.field_8027;
                                                      }
                                                   } else {
                                                      return class_1513.field_8064.field_8027;
                                                   }
                                                } else {
                                                   return class_1513.field_8029.field_8027;
                                                }
                                             } else {
                                                return class_1513.field_8061.field_8027;
                                             }
                                          } else {
                                             return class_1513.field_8028.field_8027;
                                          }
                                       } else {
                                          return class_1513.field_8030.field_8027;
                                       }
                                    } else {
                                       return class_1513.field_8032.field_8027;
                                    }
                                 } else {
                                    return class_1513.field_8034.field_8027;
                                 }
                              } else {
                                 return class_1513.field_8033.field_8027;
                              }
                           } else {
                              return class_1513.field_8057.field_8027;
                           }
                        } else {
                           return class_1513.field_8055.field_8027;
                        }
                     } else {
                        return class_1513.field_8042.field_8027;
                     }
                  } else {
                     return class_1513.field_8041.field_8027;
                  }
               } else {
                  return class_1513.field_8048.field_8027;
               }
            } else {
               return class_1513.field_8047.field_8027;
            }
         } else {
            return class_1513.field_8018.field_8027;
         }
      } else {
         return -1;
      }
   }

   private static int[] method_42891() {
      class_1513[] var2 = class_1513.field_8024;
      int[] var3 = new int[var2.length];
      Arrays.fill(var3, -1);

      for (int var4 = 0; var4 < var2.length && var4 < var3.length; var4++) {
         class_1513 var5 = var2[var4];
         if (var5 != null) {
            var3[var4] = var5.field_8060;
         }
      }

      return var3;
   }

   private static void method_42865(int[] var0) {
      if (var0 != null) {
         class_1513[] var3 = class_1513.field_8024;
         boolean var4 = false;

         for (int var5 = 0; var5 < var3.length && var5 < var0.length; var5++) {
            class_1513 var6 = var3[var5];
            if (var6 != null) {
               int var7 = var0[var5];
               if (var7 >= 0 && var6.field_8060 != var7) {
                  var6.field_8060 = var7;
                  var4 = true;
               }
            }
         }
      }
   }

   private static void method_42869(String var0) {
      Config.method_14277("CustomColors: " + var0);
   }

   private static void method_42898(String var0) {
      Config.method_14317("CustomColors: " + var0);
   }

   public static int method_42858(int var0) {
      return field_47502 >= 0 ? field_47502 : var0;
   }

   public static int method_42909(int var0) {
      return field_47472 >= 0 ? field_47472 : var0;
   }

   public static int method_42925(int var0) {
      if (var0 == 0) {
         return field_47485 >= 0 ? field_47485 : var0;
      } else {
         return var0;
      }
   }
}
