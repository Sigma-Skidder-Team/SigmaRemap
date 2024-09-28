package mapped;

import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import javax.imageio.ImageIO;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.item.ItemStack;
import net.minecraft.state.properties.DoubleBlockHalf;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.IBlockDisplayReader;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.optifine.Config;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;

public class Class9680 {
   private static String field45223 = "vanilla";
   private static Class7448 field45224 = null;
   private static Class7448 field45225 = null;
   private static Class7448 field45226 = null;
   private static Class7448 field45227 = null;
   private static Class7448 field45228 = null;
   private static Class7448[] field45229 = null;
   private static Class7448[][] field45230 = (Class7448[][])null;
   private static Class7448 field45231 = null;
   private static Class8816 field45232 = new Class8816();
   private static Class7448 field45233 = null;
   private static Class8816 field45234 = new Class8816();
   private static Class7448 field45235 = null;
   private static Class8816 field45236 = new Class8816();
   private static Class7448 field45237 = null;
   private static Class8816 field45238 = new Class8816();
   private static Class9540[] field45239 = null;
   private static int field45240 = 0;
   private static Class7448 field45241 = null;
   private static Class7448 field45242 = null;
   private static int field45243 = -1;
   private static Class7448 field45244 = null;
   private static Class7448 field45245 = null;
   private static Class7448 field45246 = null;
   private static Class7448 field45247 = null;
   private static Class7448 field45248 = null;
   private static boolean field45249 = true;
   private static int field45250 = -1;
   private static int field45251 = -1;
   private static int field45252 = -1;
   private static int field45253 = -1;
   private static int field45254 = -1;
   private static int field45255 = -1;
   private static Vector3d field45256 = null;
   private static Vector3d field45257 = null;
   private static Vector3d field45258 = null;
   private static int[] field45259 = null;
   private static int[] field45260 = null;
   private static float[][] field45261 = (float[][])null;
   private static float[][] field45262 = (float[][])null;
   private static int[] field45263 = null;
   private static int[] field45264 = null;
   private static int[] field45265 = null;
   private static final BlockState field45266 = Blocks.field36396.getDefaultState();
   private static final BlockState field45267 = Blocks.WATER.getDefaultState();
   public static Random field45268 = new Random();
   private static final Class7443 field45269 = new Class7447();
   private static final Class7443 field45270 = new Class7445();
   private static final Class7443 field45271 = new Class7444();
   private static final Class7443 field45272 = new Class7446();
   private static final Class7443 field45273 = new Class7442();

   public static void method37833() {
      field45223 = "vanilla";
      field45224 = null;
      field45226 = null;
      field45225 = null;
      field45228 = null;
      field45227 = null;
      field45231 = null;
      field45233 = null;
      field45235 = null;
      field45237 = null;
      field45241 = null;
      field45242 = null;
      field45243 = -1;
      field45244 = null;
      field45245 = null;
      field45248 = null;
      field45239 = null;
      field45250 = -1;
      field45251 = -1;
      field45252 = -1;
      field45253 = -1;
      field45254 = -1;
      field45255 = -1;
      field45256 = null;
      field45257 = null;
      field45258 = null;
      field45229 = null;
      field45230 = (Class7448[][])null;
      field45249 = true;
      field45259 = null;
      field45260 = null;
      field45261 = (float[][])null;
      field45262 = (float[][])null;
      field45263 = null;
      method37895(field45264);
      field45265 = null;
      field45223 = method37834("optifine/color.properties", "palette.format", Class7448.field32041, "vanilla");
      String var2 = "optifine/colormap/";
      String[] var3 = new String[]{"water.png", "watercolorx.png"};
      field45224 = method37847(var2, var3, 256, 256);
      method37849();
      if (Config.method26911()) {
         String[] var4 = new String[]{"pine.png", "pinecolor.png"};
         field45225 = method37847(var2, var4, 256, 256);
         String[] var5 = new String[]{"birch.png", "birchcolor.png"};
         field45226 = method37847(var2, var5, 256, 256);
         String[] var6 = new String[]{"swampgrass.png", "swampgrasscolor.png"};
         field45228 = method37847(var2, var6, 256, 256);
         String[] var7 = new String[]{"swampfoliage.png", "swampfoliagecolor.png"};
         field45227 = method37847(var2, var7, 256, 256);
         String[] var8 = new String[]{"sky0.png", "skycolor0.png"};
         field45231 = method37847(var2, var8, 256, 256);
         String[] var9 = new String[]{"fog0.png", "fogcolor0.png"};
         field45233 = method37847(var2, var9, 256, 256);
         String[] var10 = new String[]{"underwater.png", "underwatercolor.png"};
         field45235 = method37847(var2, var10, 256, 256);
         String[] var11 = new String[]{"underlava.png", "underlavacolor.png"};
         field45237 = method37847(var2, var11, 256, 256);
         String[] var12 = new String[]{"redstone.png", "redstonecolor.png"};
         field45241 = method37847(var2, var12, 16, 1);
         field45242 = method37848(var2 + "xporb.png", -1, -1);
         field45244 = method37848(var2 + "durability.png", -1, -1);
         String[] var13 = new String[]{"stem.png", "stemcolor.png"};
         field45245 = method37847(var2, var13, 8, 1);
         field45247 = method37848(var2 + "pumpkinstem.png", 8, 1);
         field45246 = method37848(var2 + "melonstem.png", 8, 1);
         String[] var14 = new String[]{"myceliumparticle.png", "myceliumparticlecolor.png"};
         field45248 = method37847(var2, var14, -1, -1);
         Pair var15 = method37835();
         field45239 = (Class9540[])var15.getLeft();
         field45240 = (Integer)var15.getRight();
         method37837("optifine/color.properties");
         field45230 = method37839(new String[]{var2 + "custom/", var2 + "blocks/"}, field45229, 256, 256);
         method37849();
      }
   }

   private static String method37834(String var0, String var1, String[] var2, String var3) {
      try {
         ResourceLocation var6 = new ResourceLocation(var0);
         InputStream var7 = Config.method26863(var6);
         if (var7 == null) {
            return var3;
         } else {
            Class20 var8 = new Class20();
            var8.load(var7);
            var7.close();
            String var9 = var8.getProperty(var1);
            if (var9 == null) {
               return var3;
            } else {
               List var10 = Arrays.<String>asList(var2);
               if (!var10.contains(var9)) {
                  method37897("Invalid value: " + var1 + "=" + var9);
                  method37897("Expected values: " + Config.method26854(var2));
                  return var3;
               } else {
                  method37896("" + var1 + "=" + var9);
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

   private static Pair<Class9540[], Integer> method37835() {
      String var2 = "optifine/lightmap/world";
      String var3 = ".png";
      String[] var4 = Class9772.method38436(var2, var3);
      Map<Integer, String> var5 = new HashMap();

      for (int var6 = 0; var6 < var4.length; var6++) {
         String var7 = var4[var6];
         String var8 = Class9402.method35772(var7, var2, var3);
         int var9 = Config.method26899(var8, Integer.MIN_VALUE);
         if (var9 != Integer.MIN_VALUE) {
            var5.put(var9, var7);
         } else {
            method37897("Invalid dimension ID: " + var8 + ", path: " + var7);
         }
      }

      Set<Integer> var23 = var5.keySet();
      Integer[] var24 = var23.toArray(new Integer[var23.size()]);
      Arrays.sort(var24);
      if (var24.length > 0) {
         int var25 = var24[0];
         int var26 = var24[var24.length - 1];
         int var10 = var26 - var25 + 1;
         Class7448[] var11 = new Class7448[var10];

         for (int var12 = 0; var12 < var24.length; var12++) {
            Integer var13 = var24[var12];
            String var14 = (String)var5.get(var13);
            Class7448 var15 = method37848(var14, -1, -1);
            if (var15 != null) {
               if (var15.method24075() >= 16) {
                  int var16 = var13 - var25;
                  var11[var16] = var15;
               } else {
                  method37897("Invalid lightmap width: " + var15.method24075() + ", path: " + var14);
               }
            }
         }

         Class9540[] var27 = new Class9540[var11.length];

         for (int var28 = 0; var28 < var11.length; var28++) {
            Class7448 var29 = var11[var28];
            if (var29 != null) {
               String var30 = var29.field32022;
               String var31 = var29.field32023;
               Class7448 var17 = method37848(var31 + "/" + var30 + "_rain.png", -1, -1);
               Class7448 var18 = method37848(var31 + "/" + var30 + "_thunder.png", -1, -1);
               Class8601 var19 = new Class8601(var29);
               Class8601 var20 = var17 == null ? null : new Class8601(var17);
               Class8601 var21 = var18 == null ? null : new Class8601(var18);
               Class9540 var22 = new Class9540(var19, var20, var21);
               var27[var28] = var22;
            }
         }

         return new ImmutablePair(var27, var25);
      } else {
         return new ImmutablePair((Class9540[])null, 0);
      }
   }

   private static int method37836(String var0, int var1) {
      try {
         InputStream var4 = Config.method26863(new ResourceLocation(var0));
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

   private static void method37837(String var0) {
      try {
         ResourceLocation var3 = new ResourceLocation(var0);
         InputStream var4 = Config.method26863(var3);
         if (var4 == null) {
            return;
         }

         method37896("Loading " + var0);
         Class20 var5 = new Class20();
         var5.load(var4);
         var4.close();
         field45250 = method37843(var5, new String[]{"particle.water", "drop.water"});
         field45251 = method37844(var5, "particle.portal");
         field45252 = method37844(var5, "lilypad");
         field45253 = method37844(var5, "text.xpbar");
         field45254 = method37844(var5, "text.boss");
         field45255 = method37844(var5, "text.sign");
         field45256 = method37846(var5, "fog.nether");
         field45257 = method37846(var5, "fog.end");
         field45258 = method37846(var5, "sky.end");
         field45229 = method37838(var5, var0);
         field45259 = method37878(var5, var0, "egg.shell.", "Spawn egg shell");
         field45260 = method37878(var5, var0, "egg.spots.", "Spawn egg spot");
         field45261 = method37881(var5, var0, "collar.", "Wolf collar");
         field45262 = method37881(var5, var0, "sheep.", "Sheep");
         field45263 = method37885(var5, var0, "text.code.", "Text");
         int[] var6 = method37887(var5, var0, "map.", "Map");
         if (var6 != null) {
            if (field45264 == null) {
               field45264 = method37894();
            }

            method37895(var6);
         }

         field45265 = method37888(var5, var0, "potion.", "Potion");
         field45243 = Config.method26899(var5.getProperty("xporb.time"), -1);
      } catch (FileNotFoundException var7) {
         return;
      } catch (IOException var8) {
         Config.method26811("Error parsing: " + var0);
         Config.method26811(var8.getClass().getName() + ": " + var8.getMessage());
      }
   }

   private static Class7448[] method37838(Properties var0, String var1) {
      List<Class7448> var4 = new ArrayList();
      String var5 = "palette.block.";
      Map<String, String> var6 = new HashMap<>();

      for (String var8 : (Set<String>)(Set<?>) var0.keySet()) {
         String var9 = var0.getProperty(var8);
         if (var8.startsWith(var5)) {
            var6.put(var8, var9);
         }
      }

      String[] var18 = var6.keySet().toArray(new String[var6.size()]);

      for (int var19 = 0; var19 < var18.length; var19++) {
         String var20 = var18[var19];
         String var10 = var0.getProperty(var20);
         method37896("Block palette: " + var20 + " = " + var10);
         String var11 = var20.substring(var5.length());
         String var12 = Class8684.method31275(var1);
         var11 = Class8684.method31274(var11, var12);
         Class7448 var13 = method37848(var11, 256, 256);
         if (var13 == null) {
            method37897("Colormap not found: " + var11);
         } else {
            Class8896 var14 = new Class8896("CustomColors");
            Class9727[] var15 = var14.method32384(var10);
            if (var15 != null && var15.length > 0) {
               for (int var16 = 0; var16 < var15.length; var16++) {
                  Class9727 var17 = var15[var16];
                  var13.method24078(var17);
               }

               var4.add(var13);
            } else {
               method37897("Invalid match blocks: " + var10);
            }
         }
      }

      return var4.size() > 0 ? var4.toArray(new Class7448[var4.size()]) : null;
   }

   private static Class7448[][] method37839(String[] var0, Class7448[] var1, int var2, int var3) {
      String[] var6 = Class9772.method38437(var0, new String[]{".properties"});
      Arrays.sort(var6);
      ArrayList var7 = new ArrayList();

      for (int var8 = 0; var8 < var6.length; var8++) {
         String var9 = var6[var8];
         method37896("Block colormap: " + var9);

         try {
            ResourceLocation var10 = new ResourceLocation("minecraft", var9);
            InputStream var11 = Config.method26863(var10);
            if (var11 == null) {
               method37897("File not found: " + var9);
            } else {
               Class20 var12 = new Class20();
               var12.load(var11);
               var11.close();
               Class7448 var13 = new Class7448(var12, var9, var2, var3, field45223);
               if (var13.method24056(var9) && var13.method24057(var9)) {
                  method37840(var13, var7);
               }
            }
         } catch (FileNotFoundException var14) {
            method37897("File not found: " + var9);
         } catch (Exception var15) {
            var15.printStackTrace();
         }
      }

      if (var1 != null) {
         for (int var16 = 0; var16 < var1.length; var16++) {
            Class7448 var17 = var1[var16];
            method37840(var17, var7);
         }
      }

      return var7.size() <= 0 ? (Class7448[][])null : method37842(var7);
   }

   private static void method37840(Class7448 var0, List var1) {
      int[] var4 = var0.method24081();
      if (var4 != null && var4.length > 0) {
         for (int var5 = 0; var5 < var4.length; var5++) {
            int var6 = var4[var5];
            if (var6 >= 0) {
               method37841(var0, var1, var6);
            } else {
               method37897("Invalid block ID: " + var6);
            }
         }
      } else {
         method37897("No match blocks: " + Config.method26856(var4));
      }
   }

   private static void method37841(Class7448 var0, List var1, int var2) {
      while (var2 >= var1.size()) {
         var1.add(null);
      }

      List var5 = (List)var1.get(var2);
      if (var5 == null) {
         var5 = new ArrayList();
         var1.set(var2, var5);
      }

      var5.add(var0);
   }

   private static Class7448[][] method37842(List var0) {
      Class7448[][] var3 = new Class7448[var0.size()][];

      for (int var4 = 0; var4 < var0.size(); var4++) {
         List<Class7448> var5 = (List)var0.get(var4);
         if (var5 != null) {
            Class7448[] var6 = var5.toArray(new Class7448[var5.size()]);
            var3[var4] = var6;
         }
      }

      return var3;
   }

   private static int method37843(Properties var0, String[] var1) {
      for (int var4 = 0; var4 < var1.length; var4++) {
         String var5 = var1[var4];
         int var6 = method37844(var0, var5);
         if (var6 >= 0) {
            return var6;
         }
      }

      return -1;
   }

   private static int method37844(Properties var0, String var1) {
      String var4 = var0.getProperty(var1);
      if (var4 != null) {
         var4 = var4.trim();
         int var5 = method37845(var4);
         if (var5 >= 0) {
            method37896(var1 + " = " + var4);
            return var5;
         } else {
            method37897("Invalid color: " + var1 + " = " + var4);
            return var5;
         }
      } else {
         return -1;
      }
   }

   private static int method37845(String var0) {
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

   private static Vector3d method37846(Properties var0, String var1) {
      int var4 = method37844(var0, var1);
      if (var4 >= 0) {
         int var5 = var4 >> 16 & 0xFF;
         int var6 = var4 >> 8 & 0xFF;
         int var7 = var4 & 0xFF;
         float var8 = (float)var5 / 255.0F;
         float var9 = (float)var6 / 255.0F;
         float var10 = (float)var7 / 255.0F;
         return new Vector3d((double)var8, (double)var9, (double)var10);
      } else {
         return null;
      }
   }

   private static Class7448 method37847(String var0, String[] var1, int var2, int var3) {
      for (int var6 = 0; var6 < var1.length; var6++) {
         String var7 = var1[var6];
         var7 = var0 + var7;
         Class7448 var8 = method37848(var7, var2, var3);
         if (var8 != null) {
            return var8;
         }
      }

      return null;
   }

   public static Class7448 method37848(String var0, int var1, int var2) {
      try {
         ResourceLocation var5 = new ResourceLocation(var0);
         if (!Config.method26866(var5)) {
            return null;
         } else {
            method37896("Colormap " + var0);
            Class20 var6 = new Class20();
            String var7 = Class9402.method35764(var0, ".png", ".properties");
            ResourceLocation var8 = new ResourceLocation(var7);
            if (Config.method26866(var8)) {
               InputStream var9 = Config.method26863(var8);
               var6.load(var9);
               var9.close();
               method37896("Colormap properties: " + var7);
            } else {
               var6.put("format", field45223);
               var6.put("source", var0);
               var7 = var0;
            }

            Class7448 var11 = new Class7448(var6, var7, var1, var2, field45223);
            return !var11.method24056(var7) ? null : var11;
         }
      } catch (Exception var10) {
         var10.printStackTrace();
         return null;
      }
   }

   public static void method37849() {
      field45249 = field45226 == null && field45225 == null && field45228 == null && field45227 == null && Config.method26906();
   }

   public static int method37850(Class8557 var0, BlockState var1, IBlockDisplayReader var2, BlockPos var3, Class8391 var4) {
      Block var7 = var1.getBlock();
      BlockState var8 = var1;
      if (field45230 != null) {
         if (!var0.method30512()) {
            if (var7 == Blocks.field36395) {
               var8 = field45266;
            }

            if (var7 == Blocks.REDSTONE_WIRE) {
               return -1;
            }
         }

         if (var7 instanceof Class3456 && var1.<DoubleBlockHalf>get(Class3456.field19276) == DoubleBlockHalf.field209) {
            var3 = var3.down();
            var8 = var2.getBlockState(var3);
         }

         Class7448 var9 = method37852(var8);
         if (var9 != null) {
            if (Config.method26909() && !var9.method24054()) {
               return method37853(var1, var2, var3, var9, var4.method29421());
            }

            return var9.method24069(var2, var3);
         }
      }

      if (!var0.method30512()) {
         return -1;
      } else if (var7 != Blocks.LILY_PAD) {
         if (var7 == Blocks.REDSTONE_WIRE) {
            return method37858(var4.method29420());
         } else if (!(var7 instanceof Class3486)) {
            if (field45249) {
               return -1;
            } else {
               Class7443 var10;
               if (var7 == Blocks.field36395 || var7 == Blocks.TALL_GRASS || var7 instanceof Class3456) {
                  var10 = field45269;
               } else if (!(var7 instanceof Class3456)) {
                  if (!(var7 instanceof Class3465)) {
                     if (var7 != Blocks.VINE) {
                        return -1;
                     }

                     var10 = field45270;
                  } else if (var7 != Blocks.field36446) {
                     if (var7 != Blocks.field36447) {
                        if (var7 != Blocks.field36448) {
                           var10 = field45270;
                        } else {
                           var10 = field45272;
                        }
                     } else {
                        var10 = field45271;
                     }
                  } else {
                     var10 = field45270;
                  }
               } else {
                  var10 = field45269;
                  if (var1.<DoubleBlockHalf>get(Class3456.field19276) == DoubleBlockHalf.field209) {
                     var3 = var3.down();
                  }
               }

               return Config.method26909() && !var10.method24054()
                  ? method37853(var1, var2, var3, var10, var4.method29421())
                  : var10.method24053(var8, var2, var3);
            }
         } else {
            return method37874(var1, var2, var3, var4);
         }
      } else {
         return method37865(var2, var3);
      }
   }

   public static Biome method37851(IBlockDisplayReader var0, BlockPos var1) {
      Biome var4 = Class8708.method31415(var0, var1);
      if ((var4 == Class8708.field39312 || var4 == Class8708.field39313) && !Config.method26906()) {
         var4 = Class8708.field39311;
      }

      return var4;
   }

   private static Class7448 method37852(BlockState var0) {
      if (field45230 != null) {
         if (!(var0 instanceof BlockState)) {
            return null;
         } else {
            BlockState var3 = var0;
            int var4 = var0.method23490();
            if (var4 >= 0 && var4 < field45230.length) {
               Class7448[] var5 = field45230[var4];
               if (var5 == null) {
                  return null;
               } else {
                  for (int var6 = 0; var6 < var5.length; var6++) {
                     Class7448 var7 = var5[var6];
                     if (var7.method24064(var3)) {
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

   private static int method37853(BlockState var0, IBlockDisplayReader var1, BlockPos var2, Class7443 var3, Class2001 var4) {
      int var7 = 0;
      int var8 = 0;
      int var9 = 0;
      int var10 = var2.getX();
      int var11 = var2.getY();
      int var12 = var2.getZ();
      Class2001 var13 = var4;
      int var14 = Config.method26910();
      int var15 = var14 * 2 + 1;
      int var16 = var15 * var15;

      for (int var17 = var10 - var14; var17 <= var10 + var14; var17++) {
         for (int var18 = var12 - var14; var18 <= var12 + var14; var18++) {
            var13.method8384(var17, var11, var18);
            int var19 = var3.method24053(var0, var1, var13);
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

   public static int method37854(IBlockDisplayReader var0, BlockState var1, BlockPos var2, Class8391 var3) {
      Block var6 = var1.getBlock();
      Object var7 = method37852(var1);
      if (var7 == null && var1.getMaterial() == Material.field38941) {
         var7 = field45273;
      }

      if (var7 == null) {
         return method37855().method29465(var1, var0, var2, 0);
      } else {
         return Config.method26909() && !((Class7443)var7).method24054()
            ? method37853(var1, var0, var2, (Class7443)var7, var3.method29421())
            : ((Class7443)var7).method24053(var1, var0, var2);
      }
   }

   public static BlockColors method37855() {
      return Minecraft.getInstance().getBlockColors();
   }

   public static void method37856(Class4587 var0) {
      if (field45251 >= 0) {
         int var3 = field45251;
         int var4 = var3 >> 16 & 0xFF;
         int var5 = var3 >> 8 & 0xFF;
         int var6 = var3 & 0xFF;
         float var7 = (float)var4 / 255.0F;
         float var8 = (float)var5 / 255.0F;
         float var9 = (float)var6 / 255.0F;
         var0.method14514(var7, var8, var9);
      }
   }

   public static void method37857(Class4587 var0) {
      if (field45248 != null) {
         int var3 = field45248.method24065();
         int var4 = var3 >> 16 & 0xFF;
         int var5 = var3 >> 8 & 0xFF;
         int var6 = var3 & 0xFF;
         float var7 = (float)var4 / 255.0F;
         float var8 = (float)var5 / 255.0F;
         float var9 = (float)var6 / 255.0F;
         var0.method14514(var7, var8, var9);
      }
   }

   private static int method37858(BlockState var0) {
      if (field45241 != null) {
         int var3 = method37860(var0, 15);
         return field45241.method24066(var3);
      } else {
         return -1;
      }
   }

   public static void method37859(Class4587 var0, IBlockDisplayReader var1, double var2, double var4, double var6) {
      if (field45241 != null) {
         BlockState var10 = var1.getBlockState(new BlockPos(var2, var4, var6));
         int var11 = method37860(var10, 15);
         int var12 = field45241.method24066(var11);
         int var13 = var12 >> 16 & 0xFF;
         int var14 = var12 >> 8 & 0xFF;
         int var15 = var12 & 0xFF;
         float var16 = (float)var13 / 255.0F;
         float var17 = (float)var14 / 255.0F;
         float var18 = (float)var15 / 255.0F;
         var0.method14514(var16, var17, var18);
      }
   }

   private static int method37860(BlockState var0, int var1) {
      Block var4 = var0.getBlock();
      if (var4 instanceof Class3222) {
         Comparable var5 = var0.<Integer>get(Class3222.field18651);
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

   public static float method37861(float var0) {
      if (field45243 > 0) {
         float var3 = 628.0F / (float)field45243;
         return var0 * var3;
      } else {
         return var0;
      }
   }

   public static int method37862(float var0) {
      if (field45242 != null) {
         int var3 = (int)Math.round((double)((MathHelper.sin(var0) + 1.0F) * (float)(field45242.method24074() - 1)) / 2.0);
         return field45242.method24066(var3);
      } else {
         return -1;
      }
   }

   public static int method37863(float var0, int var1) {
      if (field45244 != null) {
         int var4 = (int)(var0 * (float)field45244.method24074());
         return field45244.method24066(var4);
      } else {
         return var1;
      }
   }

   public static void method37864(Class4587 var0, IBlockDisplayReader var1, double var2, double var4, double var6, Class8391 var8) {
      if (field45224 != null || field45230 != null || field45250 >= 0) {
         BlockPos var11 = new BlockPos(var2, var4, var6);
         var8.method29411(field45267, var11);
         int var12 = method37854(var1, field45267, var11, var8);
         int var13 = var12 >> 16 & 0xFF;
         int var14 = var12 >> 8 & 0xFF;
         int var15 = var12 & 0xFF;
         float var16 = (float)var13 / 255.0F;
         float var17 = (float)var14 / 255.0F;
         float var18 = (float)var15 / 255.0F;
         if (field45250 >= 0) {
            int var19 = field45250 >> 16 & 0xFF;
            int var20 = field45250 >> 8 & 0xFF;
            int var21 = field45250 & 0xFF;
            var16 *= (float)var19 / 255.0F;
            var17 *= (float)var20 / 255.0F;
            var18 *= (float)var21 / 255.0F;
         }

         var0.method14514(var16, var17, var18);
      }
   }

   private static int method37865(IBlockDisplayReader var0, BlockPos var1) {
      return field45252 >= 0 ? field45252 : method37855().method29465(Blocks.LILY_PAD.getDefaultState(), var0, var1, 0);
   }

   private static Vector3d method37866(Vector3d var0) {
      return field45256 != null ? field45256 : var0;
   }

   private static Vector3d method37867(Vector3d var0) {
      return field45257 != null ? field45257 : var0;
   }

   private static Vector3d method37868(Vector3d var0) {
      return field45258 != null ? field45258 : var0;
   }

   public static Vector3d method37869(Vector3d var0, IBlockDisplayReader var1, double var2, double var4, double var6) {
      if (field45231 != null) {
         int var10 = field45231.method24071(var1, var2, var4, var6, 3);
         int var11 = var10 >> 16 & 0xFF;
         int var12 = var10 >> 8 & 0xFF;
         int var13 = var10 & 0xFF;
         float var14 = (float)var11 / 255.0F;
         float var15 = (float)var12 / 255.0F;
         float var16 = (float)var13 / 255.0F;
         float var17 = (float)var0.x / 0.5F;
         float var18 = (float)var0.y / 0.66275F;
         float var19 = (float)var0.z;
         var14 *= var17;
         var15 *= var18;
         var16 *= var19;
         return field45232.method31835((double)var14, (double)var15, (double)var16);
      } else {
         return var0;
      }
   }

   private static Vector3d method37870(Vector3d var0, IBlockDisplayReader var1, double var2, double var4, double var6) {
      if (field45233 != null) {
         int var10 = field45233.method24071(var1, var2, var4, var6, 3);
         int var11 = var10 >> 16 & 0xFF;
         int var12 = var10 >> 8 & 0xFF;
         int var13 = var10 & 0xFF;
         float var14 = (float)var11 / 255.0F;
         float var15 = (float)var12 / 255.0F;
         float var16 = (float)var13 / 255.0F;
         float var17 = (float)var0.x / 0.753F;
         float var18 = (float)var0.y / 0.8471F;
         float var19 = (float)var0.z;
         var14 *= var17;
         var15 *= var18;
         var16 *= var19;
         return field45234.method31835((double)var14, (double)var15, (double)var16);
      } else {
         return var0;
      }
   }

   public static Vector3d method37871(IBlockDisplayReader var0, double var1, double var3, double var5) {
      return method37873(var0, var1, var3, var5, field45235, field45236);
   }

   public static Vector3d method37872(IBlockDisplayReader var0, double var1, double var3, double var5) {
      return method37873(var0, var1, var3, var5, field45237, field45238);
   }

   public static Vector3d method37873(IBlockDisplayReader var0, double var1, double var3, double var5, Class7448 var7, Class8816 var8) {
      if (var7 != null) {
         int var11 = var7.method24071(var0, var1, var3, var5, 3);
         int var12 = var11 >> 16 & 0xFF;
         int var13 = var11 >> 8 & 0xFF;
         int var14 = var11 & 0xFF;
         float var15 = (float)var12 / 255.0F;
         float var16 = (float)var13 / 255.0F;
         float var17 = (float)var14 / 255.0F;
         return var8.method31835((double)var15, (double)var16, (double)var17);
      } else {
         return null;
      }
   }

   private static int method37874(BlockState var0, IBlockReader var1, BlockPos var2, Class8391 var3) {
      Class7448 var6 = field45245;
      Block var7 = var0.getBlock();
      if (var7 == Blocks.PUMPKIN_STEM && field45247 != null) {
         var6 = field45247;
      }

      if (var7 == Blocks.MELON_STEM && field45246 != null) {
         var6 = field45246;
      }

      if (var6 != null) {
         if (var7 instanceof Class3486) {
            int var8 = var0.<Integer>get(Class3486.field19347);
            return var6.method24066(var8);
         } else {
            return -1;
         }
      } else {
         return -1;
      }
   }

   public static boolean method37875(ClientWorld var0, float var1, Class1806 var2, boolean var3, float var4) {
      if (var0 != null) {
         if (field45239 != null) {
            int var7 = Class8509.method30144(var0);
            int var8 = var7 - field45240;
            if (var8 >= 0 && var8 < field45239.length) {
               Class9540 var9 = field45239[var8];
               return var9 != null ? var9.method36917(var0, var1, var2, var3, var4) : false;
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

   public static Vector3d method37876(Vector3d var0, World var1, Entity var2, float var3) {
      Minecraft var6 = Minecraft.getInstance();
      if (!Class8509.method30146(var1)) {
         if (!Class8509.method30147(var1)) {
            return !Class8509.method30148(var1) ? var0 : method37867(var0);
         } else {
            return method37870(var0, var6.world, var2.getPosX(), var2.getPosY() + 1.0, var2.getPosZ());
         }
      } else {
         return method37866(var0);
      }
   }

   public static Vector3d method37877(Vector3d var0, World var1, Entity var2, float var3) {
      Minecraft var6 = Minecraft.getInstance();
      if (!Class8509.method30147(var1)) {
         return !Class8509.method30148(var1) ? var0 : method37868(var0);
      } else {
         return method37869(var0, var6.world, var2.getPosX(), var2.getPosY() + 1.0, var2.getPosZ());
      }
   }

   private static int[] method37878(Properties var0, String var1, String var2, String var3) {
      ArrayList var6 = new ArrayList();
      Set<String> var7 = (Set<String>)(Set<?>) var0.keySet();
      int var8 = 0;

      for (String var10 : var7) {
         String var11 = var0.getProperty(var10);
         if (var10.startsWith(var2)) {
            String var12 = Class9402.method35762(var10, var2);
            int var13 = Class9115.method34001(var12);

            try {
               if (var13 < 0) {
                  var13 = Class9115.method34000(new ResourceLocation(var12).toString());
               }
            } catch (Class2496 var15) {
               Config.method26811("ResourceLocationException: " + var15.getMessage());
            }

            if (var13 < 0) {
               method37897("Invalid spawn egg name: " + var10);
            } else {
               int var14 = method37845(var11);
               if (var14 < 0) {
                  method37897("Invalid spawn egg color: " + var10 + " = " + var11);
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
         method37896(var3 + " colors: " + var8);
         int[] var16 = new int[var6.size()];

         for (int var17 = 0; var17 < var16.length; var17++) {
            var16[var17] = (Integer)var6.get(var17);
         }

         return var16;
      }
   }

   private static int method37879(SpawnEggItem var0, ItemStack var1, int var2, int var3) {
      if (field45259 == null && field45260 == null) {
         return var3;
      } else {
         EntityType var6 = var0.method11855(var1.method32142());
         if (var6 != null) {
            int var7 = Registry.ENTITY_TYPE.getId(var6);
            if (var7 >= 0) {
               int[] var8 = var2 != 0 ? field45260 : field45259;
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

   public static int method37880(ItemStack var0, int var1, int var2) {
      if (var0 != null) {
         Item var5 = var0.getItem();
         if (var5 != null) {
            return !(var5 instanceof SpawnEggItem) ? var2 : method37879((SpawnEggItem)var5, var0, var1, var2);
         } else {
            return var2;
         }
      } else {
         return var2;
      }
   }

   private static float[][] method37881(Properties var0, String var1, String var2, String var3) {
      Class112[] var6 = Class112.values();
      HashMap var7 = new HashMap();

      for (int var8 = 0; var8 < var6.length; var8++) {
         Class112 var9 = var6[var8];
         var7.put(var9.getString(), var9);
      }

      var7.put("lightBlue", Class112.field389);
      var7.put("silver", Class112.field394);
      float[][] var17 = new float[var6.length][];
      int var18 = 0;

      for (String var11 : (Set<String>)(Set<?>) var0.keySet()) {
         String var12 = var0.getProperty(var11);
         if (var11.startsWith(var2)) {
            String var13 = Class9402.method35762(var11, var2);
            Class112 var14 = (Class112)var7.get(var13);
            int var15 = method37845(var12);
            if (var14 != null && var15 >= 0) {
               float[] var16 = new float[]{(float)(var15 >> 16 & 0xFF) / 255.0F, (float)(var15 >> 8 & 0xFF) / 255.0F, (float)(var15 & 0xFF) / 255.0F};
               var17[var14.ordinal()] = var16;
               var18++;
            } else {
               method37897("Invalid color: " + var11 + " = " + var12);
            }
         }
      }

      if (var18 > 0) {
         method37896(var3 + " colors: " + var18);
         return var17;
      } else {
         return null;
      }
   }

   private static float[] method37882(Class112 var0, float[][] var1, float[] var2) {
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

   public static float[] method37883(Class112 var0, float[] var1) {
      return method37882(var0, field45261, var1);
   }

   public static float[] method37884(Class112 var0, float[] var1) {
      return method37882(var0, field45262, var1);
   }

   private static int[] method37885(Properties var0, String var1, String var2, String var3) {
      int[] var6 = new int[32];
      Arrays.fill(var6, -1);
      int var7 = 0;

      for (String var9 : (Set<String>)(Set<?>) var0.keySet()) {
         String var10 = var0.getProperty(var9);
         if (var9.startsWith(var2)) {
            String var11 = Class9402.method35762(var9, var2);
            int var12 = Config.method26899(var11, -1);
            int var13 = method37845(var10);
            if (var12 >= 0 && var12 < var6.length && var13 >= 0) {
               var6[var12] = var13;
               var7++;
            } else {
               method37897("Invalid color: " + var9 + " = " + var10);
            }
         }
      }

      if (var7 > 0) {
         method37896(var3 + " colors: " + var7);
         return var6;
      } else {
         return null;
      }
   }

   public static int method37886(int var0, int var1) {
      if (field45263 != null) {
         if (var0 >= 0 && var0 < field45263.length) {
            int var4 = field45263[var0];
            return var4 >= 0 ? var4 : var1;
         } else {
            return var1;
         }
      } else {
         return var1;
      }
   }

   private static int[] method37887(Properties var0, String var1, String var2, String var3) {
      int[] var6 = new int[MaterialColor.field30946.length];
      Arrays.fill(var6, -1);
      int var7 = 0;

      for (String var9 : (Set<String>)(Set<?>) var0.keySet()) {
         String var10 = var0.getProperty(var9);
         if (var9.startsWith(var2)) {
            String var11 = Class9402.method35762(var9, var2);
            int var12 = method37893(var11);
            int var13 = method37845(var10);
            if (var12 >= 0 && var12 < var6.length && var13 >= 0) {
               var6[var12] = var13;
               var7++;
            } else {
               method37897("Invalid color: " + var9 + " = " + var10);
            }
         }
      }

      if (var7 > 0) {
         method37896(var3 + " colors: " + var7);
         return var6;
      } else {
         return null;
      }
   }

   private static int[] method37888(Properties var0, String var1, String var2, String var3) {
      int[] var6 = new int[method37889()];
      Arrays.fill(var6, -1);
      int var7 = 0;

      for (String var9 : (Set<String>)(Set<?>) var0.keySet()) {
         String var10 = var0.getProperty(var9);
         if (var9.startsWith(var2)) {
            int var11 = method37890(var9);
            int var12 = method37845(var10);
            if (var11 >= 0 && var11 < var6.length && var12 >= 0) {
               var6[var11] = var12;
               var7++;
            } else {
               method37897("Invalid color: " + var9 + " = " + var10);
            }
         }
      }

      if (var7 > 0) {
         method37896(var3 + " colors: " + var7);
         return var6;
      } else {
         return null;
      }
   }

   private static int method37889() {
      int var2 = 0;

      for (ResourceLocation var4 : Registry.EFFECTS.method9190()) {
         Effect var5 = Class9056.method33703(var4);
         int var6 = Effect.getId(var5);
         if (var6 > var2) {
            var2 = var6;
         }
      }

      return var2;
   }

   private static int method37890(String var0) {
      if (var0.equals("potion.water")) {
         return 0;
      } else {
         var0 = Class9402.method35765(var0, "potion.", "effect.");

         for (ResourceLocation var4 : Registry.EFFECTS.method9190()) {
            Effect var5 = Class9056.method33703(var4);
            if (var5.getName().equals(var0)) {
               return Effect.getId(var5);
            }
         }

         return -1;
      }
   }

   public static int method37891(Effect var0, int var1) {
      int var4 = 0;
      if (var0 != null) {
         var4 = Effect.getId(var0);
      }

      return method37892(var4, var1);
   }

   public static int method37892(int var0, int var1) {
      if (field45265 != null) {
         if (var0 >= 0 && var0 < field45265.length) {
            int var4 = field45265[var0];
            return var4 >= 0 ? var4 : var1;
         } else {
            return var1;
         }
      } else {
         return var1;
      }
   }

   private static int method37893(String var0) {
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
                                                                        return MaterialColor.SNOW.field31007;
                                                                     } else if (var0.equals("adobe") || var0.equals("orange")) {
                                                                        return MaterialColor.field30962.field31007;
                                                                     } else if (var0.equals("magenta")) {
                                                                        return MaterialColor.field30963.field31007;
                                                                     } else if (var0.equals("light_blue") || var0.equals("lightBlue")) {
                                                                        return MaterialColor.field30964.field31007;
                                                                     } else if (var0.equals("yellow")) {
                                                                        return MaterialColor.field30965.field31007;
                                                                     } else if (var0.equals("lime")) {
                                                                        return MaterialColor.field30966.field31007;
                                                                     } else if (var0.equals("pink")) {
                                                                        return MaterialColor.field30967.field31007;
                                                                     } else if (var0.equals("gray")) {
                                                                        return MaterialColor.field30968.field31007;
                                                                     } else if (var0.equals("silver")) {
                                                                        return MaterialColor.field30969.field31007;
                                                                     } else if (var0.equals("cyan")) {
                                                                        return MaterialColor.field30970.field31007;
                                                                     } else if (var0.equals("purple")) {
                                                                        return MaterialColor.field30971.field31007;
                                                                     } else if (var0.equals("blue")) {
                                                                        return MaterialColor.field30972.field31007;
                                                                     } else if (var0.equals("brown")) {
                                                                        return MaterialColor.field30973.field31007;
                                                                     } else if (var0.equals("green")) {
                                                                        return MaterialColor.field30974.field31007;
                                                                     } else if (!var0.equals("red")) {
                                                                        return !var0.equals("black") ? -1 : MaterialColor.field30976.field31007;
                                                                     } else {
                                                                        return MaterialColor.field30975.field31007;
                                                                     }
                                                                  } else {
                                                                     return MaterialColor.field30982.field31007;
                                                                  }
                                                               } else {
                                                                  return MaterialColor.field30981.field31007;
                                                               }
                                                            } else {
                                                               return MaterialColor.field30980.field31007;
                                                            }
                                                         } else {
                                                            return MaterialColor.field30979.field31007;
                                                         }
                                                      } else {
                                                         return MaterialColor.field30978.field31007;
                                                      }
                                                   } else {
                                                      return MaterialColor.field30977.field31007;
                                                   }
                                                } else {
                                                   return MaterialColor.field30961.field31007;
                                                }
                                             } else {
                                                return MaterialColor.field30960.field31007;
                                             }
                                          } else {
                                             return MaterialColor.field30959.field31007;
                                          }
                                       } else {
                                          return MaterialColor.STONE.field31007;
                                       }
                                    } else {
                                       return MaterialColor.field30957.field31007;
                                    }
                                 } else {
                                    return MaterialColor.field30956.field31007;
                                 }
                              } else {
                                 return MaterialColor.FOLIAGE.field31007;
                              }
                           } else {
                              return MaterialColor.IRON.field31007;
                           }
                        } else {
                           return MaterialColor.field30952.field31007;
                        }
                     } else {
                        return MaterialColor.field30951.field31007;
                     }
                  } else {
                     return MaterialColor.field30950.field31007;
                  }
               } else {
                  return MaterialColor.field30949.field31007;
               }
            } else {
               return MaterialColor.field30948.field31007;
            }
         } else {
            return MaterialColor.AIR.field31007;
         }
      } else {
         return -1;
      }
   }

   private static int[] method37894() {
      MaterialColor[] var2 = MaterialColor.field30946;
      int[] var3 = new int[var2.length];
      Arrays.fill(var3, -1);

      for (int var4 = 0; var4 < var2.length && var4 < var3.length; var4++) {
         MaterialColor var5 = var2[var4];
         if (var5 != null) {
            var3[var4] = var5.field31006;
         }
      }

      return var3;
   }

   private static void method37895(int[] var0) {
      if (var0 != null) {
         MaterialColor[] var3 = MaterialColor.field30946;
         boolean var4 = false;

         for (int var5 = 0; var5 < var3.length && var5 < var0.length; var5++) {
            MaterialColor var6 = var3[var5];
            if (var6 != null) {
               int var7 = var0[var5];
               if (var7 >= 0 && var6.field31006 != var7) {
                  var6.field31006 = var7;
                  var4 = true;
               }
            }
         }
      }
   }

   private static void method37896(String var0) {
      Config.method26810("CustomColors: " + var0);
   }

   private static void method37897(String var0) {
      Config.method26811("CustomColors: " + var0);
   }

   public static int method37898(int var0) {
      return field45253 >= 0 ? field45253 : var0;
   }

   public static int method37899(int var0) {
      return field45254 >= 0 ? field45254 : var0;
   }

   public static int method37900(int var0) {
      if (var0 == 0) {
         return field45255 >= 0 ? field45255 : var0;
      } else {
         return var0;
      }
   }

   // $VF: synthetic method
   public static Class7448 method37901() {
      return field45228;
   }

   // $VF: synthetic method
   public static Class7448 method37902() {
      return field45227;
   }

   // $VF: synthetic method
   public static Class7448 method37903() {
      return field45225;
   }

   // $VF: synthetic method
   public static Class7448 method37904() {
      return field45226;
   }

   // $VF: synthetic method
   public static Class7448 method37905() {
      return field45224;
   }
}
