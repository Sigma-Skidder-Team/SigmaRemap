package mapped;

import net.minecraft.client.util.Util;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3i;

public class Class5454 extends Class5444<Class4726> {
   private static String[] field24213;

   public Class5454(Structure<Class4726> var1, int var2, int var3, Class9764 var4, int var5, long var6) {
      super(var1, var2, var3, var4, var5, var6);
   }

   public void method17109(DynamicRegistries var1, ChunkGenerator var2, TemplateManager var3, int var4, int var5, Biome var6, Class4726 var7) {
      Class8299 var10 = new Class8299();
      Class2219 var11;
      if (var7.field22393 != Class107.DESERT) {
         if (var7.field22393 != Class107.JUNGLE) {
            if (var7.field22393 != Class107.SWAMP) {
               if (var7.field22393 != Class107.MOUNTAIN) {
                  if (var7.field22393 != Class107.OCEAN) {
                     if (var7.field22393 != Class107.NETHER) {
                        boolean var12 = this.field24201.nextFloat() < 0.5F;
                        var11 = !var12 ? Class2219.field14494 : Class2219.field14498;
                        var10.field35676 = var12 || this.field24201.nextFloat() < 0.5F;
                     } else {
                        var11 = Class2219.field14499;
                        var10.field35676 = this.field24201.nextFloat() < 0.5F;
                        var10.field35675 = 0.0F;
                        var10.field35679 = true;
                     }
                  } else {
                     var11 = Class2219.field14496;
                     var10.field35676 = false;
                     var10.field35675 = 0.8F;
                  }
               } else {
                  boolean var25 = this.field24201.nextFloat() < 0.5F;
                  var11 = !var25 ? Class2219.field14494 : Class2219.field14497;
                  var10.field35676 = var25 || this.field24201.nextFloat() < 0.5F;
               }
            } else {
               var11 = Class2219.field14496;
               var10.field35676 = false;
               var10.field35675 = 0.5F;
               var10.field35678 = true;
            }
         } else {
            var11 = Class2219.field14494;
            var10.field35676 = this.field24201.nextFloat() < 0.5F;
            var10.field35675 = 0.8F;
            var10.field35677 = true;
            var10.field35678 = true;
         }
      } else {
         var11 = Class2219.field14495;
         var10.field35676 = false;
         var10.field35675 = 0.0F;
      }

      ResourceLocation var26;
      if (!(this.field24201.nextFloat() < 0.05F)) {
         var26 = new ResourceLocation(Class2978.method11389()[this.field24201.nextInt(Class2978.method11389().length)]);
      } else {
         var26 = new ResourceLocation(Class2978.method11388()[this.field24201.nextInt(Class2978.method11388().length)]);
      }

      Class8969 var13 = var3.method31603(var26);
      Class80 var14 = Util.<Class80>method38518(Class80.values(), this.field24201);
      Class2089 var15 = !(this.field24201.nextFloat() < 0.5F) ? Class2089.field13616 : Class2089.field13614;
      BlockPos var16 = new BlockPos(var13.method32886().getX() / 2, 0, var13.method32886().getZ() / 2);
      BlockPos var17 = new ChunkPos(var4, var5).method24364();
      Class9764 var18 = var13.method32910(var17, var14, var16, var15);
      Vector3i var19 = var18.method38401();
      int var20 = var19.getX();
      int var21 = var19.getZ();
      int var22 = var2.method17797(var20, var21, Class4184.method12959(var11)) - 1;
      int var23 = Class2978.method11390(this.field24201, var2, var11, var10.field35676, var22, var18.method38399(), var18);
      BlockPos var24 = new BlockPos(var17.getX(), var23, var17.getZ());
      if (var7.field22393 == Class107.MOUNTAIN || var7.field22393 == Class107.OCEAN || var7.field22393 == Class107.STANDARD) {
         var10.field35674 = Class2978.method11391(var24, var6);
      }

      this.field24196.add(new Class4184(var24, var11, var10, var26, var13, var14, var15, var16));
      this.method17113();
   }
}
