package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.Direction;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.optifine.Config;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;
import java.util.Random;

public class Class9422 {
   private static boolean field43685 = true;
   private static boolean field43686 = true;
   private static boolean field43687 = true;
   private static boolean field43688 = true;
   private static boolean field43689 = true;
   private static boolean field43690 = true;
   private static boolean field43691 = true;
   private static boolean field43692 = false;
   private static TextureAtlasSprite field43693 = null;
   private static TextureAtlasSprite field43694 = null;
   private static TextureAtlasSprite field43695 = null;
   private static TextureAtlasSprite field43696 = null;
   private static TextureAtlasSprite field43697 = null;
   private static TextureAtlasSprite field43698 = null;
   private static TextureAtlasSprite field43699 = null;
   private static boolean field43700 = false;
   private static IBakedModel field43701 = null;
   private static IBakedModel field43702 = null;
   private static IBakedModel field43703 = null;
   private static IBakedModel field43704 = null;
   private static IBakedModel field43705 = null;
   private static IBakedModel field43706 = null;
   private static boolean field43707 = false;
   private static final String field43708 = "block/grass_block_top";
   private static final String field43709 = "block/grass_block_side";
   private static final String field43710 = "block/grass_path_top";
   private static final String field43711 = "block/grass_path_side";
   private static final String field43712 = "block/mycelium_top";
   private static final String field43713 = "block/podzol_top";
   private static final String field43714 = "block/snow";
   private static final Random field43715 = new Random(0L);

   public static void method36142(AtlasTexture var0) {
      field43700 = false;
      field43707 = false;
      method36144(var0);
   }

   public static void method36143() {
      if (field43700) {
         field43701 = Class7832.method26231(field43693, 0);
         if (field43692) {
            IBakedModel var2 = Class7832.method26231(field43694, -1);
            field43701 = Class7832.method26232(var2, field43701);
         }

         field43702 = Class7832.method26235("grass_path", field43696, field43695);
         field43703 = Class7832.method26231(field43695, -1);
         field43704 = Class7832.method26231(field43697, -1);
         field43705 = Class7832.method26231(field43698, 0);
         field43706 = Class7832.method26231(field43699, -1);
         field43707 = true;
      }
   }

   private static void method36144(AtlasTexture var0) {
      field43685 = true;
      field43686 = true;
      field43687 = true;
      field43688 = true;
      field43689 = true;
      field43690 = true;
      field43691 = true;
      field43693 = var0.method1119(new ResourceLocation("block/grass_block_top"));
      field43694 = var0.method1119(new ResourceLocation("block/grass_block_side"));
      field43695 = var0.method1119(new ResourceLocation("block/grass_path_top"));
      field43696 = var0.method1119(new ResourceLocation("block/grass_path_side"));
      field43697 = var0.method1119(new ResourceLocation("block/mycelium_top"));
      field43698 = var0.method1119(new ResourceLocation("block/podzol_top"));
      field43699 = var0.method1119(new ResourceLocation("block/snow"));
      field43700 = true;
      String var3 = "optifine/bettergrass.properties";

      try {
         ResourceLocation var4 = new ResourceLocation(var3);
         if (!Config.method26866(var4)) {
            return;
         }

         InputStream var5 = Config.method26863(var4);
         if (var5 == null) {
            return;
         }

         boolean var6 = Config.method26872(var4);
         if (var6) {
            Config.method26810("BetterGrass: Parsing default configuration " + var3);
         } else {
            Config.method26810("BetterGrass: Parsing configuration " + var3);
         }

         Class20 var7 = new Class20();
         var7.load(var5);
         var5.close();
         field43685 = method36155(var7, "grass", true);
         field43686 = method36155(var7, "grass_path", true);
         field43687 = method36155(var7, "mycelium", true);
         field43688 = method36155(var7, "podzol", true);
         field43689 = method36155(var7, "grass.snow", true);
         field43690 = method36155(var7, "mycelium.snow", true);
         field43691 = method36155(var7, "podzol.snow", true);
         field43692 = method36155(var7, "grass.multilayer", false);
         field43693 = method36147(var7, "texture.grass", "block/grass_block_top", var0);
         field43694 = method36147(var7, "texture.grass_side", "block/grass_block_side", var0);
         field43695 = method36147(var7, "texture.grass_path", "block/grass_path_top", var0);
         field43696 = method36147(var7, "texture.grass_path_side", "block/grass_path_side", var0);
         field43697 = method36147(var7, "texture.mycelium", "block/mycelium_top", var0);
         field43698 = method36147(var7, "texture.podzol", "block/podzol_top", var0);
         field43699 = method36147(var7, "texture.snow", "block/snow", var0);
      } catch (IOException var8) {
         Config.method26811("Error reading: " + var3 + ", " + var8.getClass().getName() + ": " + var8.getMessage());
      }
   }

   public static void method36145(AtlasTexture var0) {
      field43693 = method36146(var0, field43693.method7465());
      field43694 = method36146(var0, field43694.method7465());
      field43695 = method36146(var0, field43695.method7465());
      field43696 = method36146(var0, field43696.method7465());
      field43697 = method36146(var0, field43697.method7465());
      field43698 = method36146(var0, field43698.method7465());
      field43699 = method36146(var0, field43699.method7465());
   }

   private static TextureAtlasSprite method36146(AtlasTexture var0, ResourceLocation var1) {
      TextureAtlasSprite var4 = var0.getSprite(var1);
      if (var4 == null || var4 instanceof Class1714) {
         Config.method26811("Missing BetterGrass sprite: " + var1);
      }

      return var4;
   }

   private static TextureAtlasSprite method36147(Properties var0, String var1, String var2, AtlasTexture var3) {
      String var6 = var0.getProperty(var1);
      if (var6 == null) {
         var6 = var2;
      }

      ResourceLocation var7 = new ResourceLocation("textures/" + var6 + ".png");
      if (!Config.method26866(var7)) {
         Config.method26811("BetterGrass texture not found: " + var7);
         var6 = var2;
      }

      ResourceLocation var8 = new ResourceLocation(var6);
      return var3.method1119(var8);
   }

   public static List method36148(IBlockReader var0, BlockState var1, BlockPos var2, Direction var3, List var4) {
      if (var3 == Direction.UP || var3 == Direction.DOWN) {
         return var4;
      } else if (field43707) {
         Block var7 = var1.getBlock();
         if (var7 instanceof Class3474) {
            return method36149(var0, var1, var2, var3, var4);
         } else if (var7 instanceof Class3411) {
            return method36150(var0, var1, var2, var3, var4);
         } else if (var7 == Blocks.field36398) {
            return method36151(var0, var1, var2, var3, var4);
         } else if (var7 != Blocks.field36396) {
            return !(var7 instanceof Class3473) ? var4 : method36153(var0, var1, var2, var3, var4);
         } else {
            return method36152(var0, var1, var2, var3, var4);
         }
      } else {
         return var4;
      }
   }

   private static List method36149(IBlockReader var0, BlockState var1, BlockPos var2, Direction var3, List var4) {
      Block var7 = var0.getBlockState(var2.up()).getBlock();
      boolean var8 = var7 == Blocks.SNOW_BLOCK || var7 == Blocks.SNOW;
      if (!Config.method26877()) {
         if (!var8) {
            if (field43687) {
               return field43704.method22619(var1, var3, field43715);
            }
         } else if (field43690) {
            return field43706.method22619(var1, var3, field43715);
         }
      } else if (!var8) {
         if (field43687 && method36154(var2.down(), var3, var0) == Blocks.MYCELIUM) {
            return field43704.method22619(var1, var3, field43715);
         }
      } else if (field43690 && method36154(var2, var3, var0) == Blocks.SNOW) {
         return field43706.method22619(var1, var3, field43715);
      }

      return var4;
   }

   private static List method36150(IBlockReader var0, BlockState var1, BlockPos var2, Direction var3, List var4) {
      if (field43686) {
         if (!Config.method26877()) {
            return field43702.method22619(var1, var3, field43715);
         } else {
            return method36154(var2.down(), var3, var0) != Blocks.field36885 ? var4 : field43702.method22619(var1, var3, field43715);
         }
      } else {
         return var4;
      }
   }

   private static List method36151(IBlockReader var0, BlockState var1, BlockPos var2, Direction var3, List var4) {
      Block var7 = method36154(var2, Direction.UP, var0);
      boolean var8 = var7 == Blocks.SNOW_BLOCK || var7 == Blocks.SNOW;
      if (!Config.method26877()) {
         if (!var8) {
            if (field43688) {
               return field43705.method22619(var1, var3, field43715);
            }
         } else if (field43691) {
            return field43706.method22619(var1, var3, field43715);
         }
      } else if (!var8) {
         if (field43688) {
            BlockPos var9 = var2.down().method8349(var3);
            BlockState var10 = var0.getBlockState(var9);
            if (var10.getBlock() == Blocks.field36398) {
               return field43705.method22619(var1, var3, field43715);
            }
         }
      } else if (field43691 && method36154(var2, var3, var0) == Blocks.SNOW) {
         return field43706.method22619(var1, var3, field43715);
      }

      return var4;
   }

   private static List method36152(IBlockReader var0, BlockState var1, BlockPos var2, Direction var3, List var4) {
      Block var7 = method36154(var2, Direction.UP, var0);
      return var7 == Blocks.field36885 && field43686 && method36154(var2, var3, var0) == Blocks.field36885
         ? field43703.method22619(var1, var3, field43715)
         : var4;
   }

   private static List method36153(IBlockReader var0, BlockState var1, BlockPos var2, Direction var3, List var4) {
      Block var7 = var0.getBlockState(var2.up()).getBlock();
      boolean var8 = var7 == Blocks.SNOW_BLOCK || var7 == Blocks.SNOW;
      if (!Config.method26877()) {
         if (!var8) {
            if (field43685) {
               return field43701.method22619(var1, var3, field43715);
            }
         } else if (field43689) {
            return field43706.method22619(var1, var3, field43715);
         }
      } else if (!var8) {
         if (field43685 && method36154(var2.down(), var3, var0) == Blocks.field36395) {
            return field43701.method22619(var1, var3, field43715);
         }
      } else if (field43689 && method36154(var2, var3, var0) == Blocks.SNOW) {
         return field43706.method22619(var1, var3, field43715);
      }

      return var4;
   }

   private static Block method36154(BlockPos var0, Direction var1, IBlockReader var2) {
      BlockPos var5 = var0.method8349(var1);
      return var2.getBlockState(var5).getBlock();
   }

   private static boolean method36155(Properties var0, String var1, boolean var2) {
      String var5 = var0.getProperty(var1);
      return var5 != null ? Boolean.parseBoolean(var5) : var2;
   }
}
