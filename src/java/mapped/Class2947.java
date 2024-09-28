package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.util.Mirror;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.gen.feature.template.TemplateManager;

import java.util.Random;

public class Class2947 extends Class2898<Class4712> {
   private static final ResourceLocation field18008 = new ResourceLocation("fossil/spine_1");
   private static final ResourceLocation field18009 = new ResourceLocation("fossil/spine_2");
   private static final ResourceLocation field18010 = new ResourceLocation("fossil/spine_3");
   private static final ResourceLocation field18011 = new ResourceLocation("fossil/spine_4");
   private static final ResourceLocation field18012 = new ResourceLocation("fossil/spine_1_coal");
   private static final ResourceLocation field18013 = new ResourceLocation("fossil/spine_2_coal");
   private static final ResourceLocation field18014 = new ResourceLocation("fossil/spine_3_coal");
   private static final ResourceLocation field18015 = new ResourceLocation("fossil/spine_4_coal");
   private static final ResourceLocation field18016 = new ResourceLocation("fossil/skull_1");
   private static final ResourceLocation field18017 = new ResourceLocation("fossil/skull_2");
   private static final ResourceLocation field18018 = new ResourceLocation("fossil/skull_3");
   private static final ResourceLocation field18019 = new ResourceLocation("fossil/skull_4");
   private static final ResourceLocation field18020 = new ResourceLocation("fossil/skull_1_coal");
   private static final ResourceLocation field18021 = new ResourceLocation("fossil/skull_2_coal");
   private static final ResourceLocation field18022 = new ResourceLocation("fossil/skull_3_coal");
   private static final ResourceLocation field18023 = new ResourceLocation("fossil/skull_4_coal");
   private static final ResourceLocation[] field18024 = new ResourceLocation[]{
      field18008, field18009, field18010, field18011, field18016, field18017, field18018, field18019
   };
   private static final ResourceLocation[] field18025 = new ResourceLocation[]{
      field18012, field18013, field18014, field18015, field18020, field18021, field18022, field18023
   };

   public Class2947(Codec<Class4712> var1) {
      super(var1);
   }

   public boolean method11213(ISeedReader var1, ChunkGenerator var2, Random var3, BlockPos var4, Class4712 var5) {
      Rotation var8 = Rotation.method254(var3);
      int var9 = var3.nextInt(field18024.length);
      TemplateManager var10 = var1.method6970().getServer().method1435();
      Class8969 var11 = var10.method31603(field18024[var9]);
      Class8969 var12 = var10.method31603(field18025[var9]);
      ChunkPos var13 = new ChunkPos(var4);
      Class9764 var14 = new Class9764(var13.getX(), 0, var13.getZ(), var13.method24358(), 256, var13.method24359());
      Class9463 var15 = new Class9463().method36426(var8).method36430(var14).method36431(var3).method36434(Class7095.field30528);
      BlockPos var16 = var11.method32904(var8);
      int var17 = var3.nextInt(16 - var16.getX());
      int var18 = var3.nextInt(16 - var16.getZ());
      int var19 = 256;

      for (int var20 = 0; var20 < var16.getX(); var20++) {
         for (int var21 = 0; var21 < var16.getZ(); var21++) {
            var19 = Math.min(var19, var1.method6736(Heightmap.Type.OCEAN_FLOOR_WG, var4.getX() + var20 + var17, var4.getZ() + var21 + var18));
         }
      }

      int var24 = Math.max(var19 - 15 - var3.nextInt(10), 10);
      BlockPos var25 = var11.method32907(var4.method8336(var17, var24, var18), Mirror.field13614, var8);
      Class7094 var22 = new Class7094(0.9F);
      var15.method36433().method36434(var22);
      var11.method32899(var1, var25, var25, var15, var3, 4);
      var15.method36435(var22);
      Class7094 var23 = new Class7094(0.1F);
      var15.method36433().method36434(var23);
      var12.method32899(var1, var25, var25, var15, var3, 4);
      return true;
   }
}
