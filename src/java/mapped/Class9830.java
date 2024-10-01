package mapped;

import com.google.common.collect.Lists;
import net.minecraft.client.util.Util;
import net.minecraft.util.Mirror;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.gen.feature.template.TemplateManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Class9830 {
   private static final ResourceLocation[] field45914 = new ResourceLocation[]{
      new ResourceLocation("underwater_ruin/warm_1"),
      new ResourceLocation("underwater_ruin/warm_2"),
      new ResourceLocation("underwater_ruin/warm_3"),
      new ResourceLocation("underwater_ruin/warm_4"),
      new ResourceLocation("underwater_ruin/warm_5"),
      new ResourceLocation("underwater_ruin/warm_6"),
      new ResourceLocation("underwater_ruin/warm_7"),
      new ResourceLocation("underwater_ruin/warm_8")
   };
   private static final ResourceLocation[] field45915 = new ResourceLocation[]{
      new ResourceLocation("underwater_ruin/brick_1"),
      new ResourceLocation("underwater_ruin/brick_2"),
      new ResourceLocation("underwater_ruin/brick_3"),
      new ResourceLocation("underwater_ruin/brick_4"),
      new ResourceLocation("underwater_ruin/brick_5"),
      new ResourceLocation("underwater_ruin/brick_6"),
      new ResourceLocation("underwater_ruin/brick_7"),
      new ResourceLocation("underwater_ruin/brick_8")
   };
   private static final ResourceLocation[] field45916 = new ResourceLocation[]{
      new ResourceLocation("underwater_ruin/cracked_1"),
      new ResourceLocation("underwater_ruin/cracked_2"),
      new ResourceLocation("underwater_ruin/cracked_3"),
      new ResourceLocation("underwater_ruin/cracked_4"),
      new ResourceLocation("underwater_ruin/cracked_5"),
      new ResourceLocation("underwater_ruin/cracked_6"),
      new ResourceLocation("underwater_ruin/cracked_7"),
      new ResourceLocation("underwater_ruin/cracked_8")
   };
   private static final ResourceLocation[] field45917 = new ResourceLocation[]{
      new ResourceLocation("underwater_ruin/mossy_1"),
      new ResourceLocation("underwater_ruin/mossy_2"),
      new ResourceLocation("underwater_ruin/mossy_3"),
      new ResourceLocation("underwater_ruin/mossy_4"),
      new ResourceLocation("underwater_ruin/mossy_5"),
      new ResourceLocation("underwater_ruin/mossy_6"),
      new ResourceLocation("underwater_ruin/mossy_7"),
      new ResourceLocation("underwater_ruin/mossy_8")
   };
   private static final ResourceLocation[] field45918 = new ResourceLocation[]{
      new ResourceLocation("underwater_ruin/big_brick_1"),
      new ResourceLocation("underwater_ruin/big_brick_2"),
      new ResourceLocation("underwater_ruin/big_brick_3"),
      new ResourceLocation("underwater_ruin/big_brick_8")
   };
   private static final ResourceLocation[] field45919 = new ResourceLocation[]{
      new ResourceLocation("underwater_ruin/big_mossy_1"),
      new ResourceLocation("underwater_ruin/big_mossy_2"),
      new ResourceLocation("underwater_ruin/big_mossy_3"),
      new ResourceLocation("underwater_ruin/big_mossy_8")
   };
   private static final ResourceLocation[] field45920 = new ResourceLocation[]{
      new ResourceLocation("underwater_ruin/big_cracked_1"),
      new ResourceLocation("underwater_ruin/big_cracked_2"),
      new ResourceLocation("underwater_ruin/big_cracked_3"),
      new ResourceLocation("underwater_ruin/big_cracked_8")
   };
   private static final ResourceLocation[] field45921 = new ResourceLocation[]{
      new ResourceLocation("underwater_ruin/big_warm_4"),
      new ResourceLocation("underwater_ruin/big_warm_5"),
      new ResourceLocation("underwater_ruin/big_warm_6"),
      new ResourceLocation("underwater_ruin/big_warm_7")
   };

   private static ResourceLocation method38789(Random var0) {
      return Util.<ResourceLocation>getRandomObject(field45914, var0);
   }

   private static ResourceLocation method38790(Random var0) {
      return Util.<ResourceLocation>getRandomObject(field45921, var0);
   }

   public static void method38791(TemplateManager var0, BlockPos var1, Rotation var2, List<Class4178> var3, Random var4, Class4711 var5) {
      boolean var8 = var4.nextFloat() <= var5.field22346;
      float var9 = !var8 ? 0.8F : 0.9F;
      method38794(var0, var1, var2, var3, var4, var5, var8, var9);
      if (var8 && var4.nextFloat() <= var5.field22347) {
         method38792(var0, var4, var2, var1, var5, var3);
      }
   }

   private static void method38792(TemplateManager var0, Random var1, Rotation var2, BlockPos var3, Class4711 var4, List<Class4178> var5) {
      int var8 = var3.getX();
      int var9 = var3.getZ();
      BlockPos var10 = Class8969.method32905(new BlockPos(15, 0, 15), Mirror.field13614, var2, BlockPos.ZERO).add(var8, 0, var9);
      Class9764 var11 = Class9764.method38389(var8, 0, var9, var10.getX(), 0, var10.getZ());
      BlockPos var12 = new BlockPos(Math.min(var8, var10.getX()), 0, Math.min(var9, var10.getZ()));
      List var13 = method38793(var1, var12.getX(), var12.getZ());
      int var14 = MathHelper.method37782(var1, 4, 8);

      for (int var15 = 0; var15 < var14; var15++) {
         if (!var13.isEmpty()) {
            int var16 = var1.nextInt(var13.size());
            BlockPos var17 = (BlockPos)var13.remove(var16);
            int var18 = var17.getX();
            int var19 = var17.getZ();
            Rotation var20 = Rotation.randomRotation(var1);
            BlockPos var21 = Class8969.method32905(new BlockPos(5, 0, 6), Mirror.field13614, var20, BlockPos.ZERO).add(var18, 0, var19);
            Class9764 var22 = Class9764.method38389(var18, 0, var19, var21.getX(), 0, var21.getZ());
            if (!var22.method38390(var11)) {
               method38794(var0, var17, var20, var5, var1, var4, false, 0.8F);
            }
         }
      }
   }

   private static List<BlockPos> method38793(Random var0, int var1, int var2) {
      ArrayList var5 = Lists.newArrayList();
      var5.add(new BlockPos(var1 - 16 + MathHelper.method37782(var0, 1, 8), 90, var2 + 16 + MathHelper.method37782(var0, 1, 7)));
      var5.add(new BlockPos(var1 - 16 + MathHelper.method37782(var0, 1, 8), 90, var2 + MathHelper.method37782(var0, 1, 7)));
      var5.add(new BlockPos(var1 - 16 + MathHelper.method37782(var0, 1, 8), 90, var2 - 16 + MathHelper.method37782(var0, 4, 8)));
      var5.add(new BlockPos(var1 + MathHelper.method37782(var0, 1, 7), 90, var2 + 16 + MathHelper.method37782(var0, 1, 7)));
      var5.add(new BlockPos(var1 + MathHelper.method37782(var0, 1, 7), 90, var2 - 16 + MathHelper.method37782(var0, 4, 6)));
      var5.add(new BlockPos(var1 + 16 + MathHelper.method37782(var0, 1, 7), 90, var2 + 16 + MathHelper.method37782(var0, 3, 8)));
      var5.add(new BlockPos(var1 + 16 + MathHelper.method37782(var0, 1, 7), 90, var2 + MathHelper.method37782(var0, 1, 7)));
      var5.add(new BlockPos(var1 + 16 + MathHelper.method37782(var0, 1, 7), 90, var2 - 16 + MathHelper.method37782(var0, 4, 8)));
      return var5;
   }

   private static void method38794(TemplateManager var0, BlockPos var1, Rotation var2, List<Class4178> var3, Random var4, Class4711 var5, boolean var6, float var7) {
      if (var5.field22345 != Class110.field373) {
         if (var5.field22345 == Class110.field374) {
            ResourceLocation[] var10 = !var6 ? field45915 : field45918;
            ResourceLocation[] var11 = !var6 ? field45916 : field45920;
            ResourceLocation[] var12 = !var6 ? field45917 : field45919;
            int var13 = var4.nextInt(var10.length);
            var3.add(new Class4183(var0, var10[var13], var1, var2, var7, var5.field22345, var6));
            var3.add(new Class4183(var0, var11[var13], var1, var2, 0.7F, var5.field22345, var6));
            var3.add(new Class4183(var0, var12[var13], var1, var2, 0.5F, var5.field22345, var6));
         }
      } else {
         ResourceLocation var14 = !var6 ? method38789(var4) : method38790(var4);
         var3.add(new Class4183(var0, var14, var1, var2, var7, var5.field22345, var6));
      }
   }
}
