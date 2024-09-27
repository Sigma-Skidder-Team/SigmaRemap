package mapped;

import com.google.common.collect.Lists;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.structure.StructureStart;

import java.util.LinkedList;
import java.util.Random;

public class Class5450 extends StructureStart<Class4712> {
   private static String[] field24208;

   public Class5450(Structure<Class4712> var1, int var2, int var3, Class9764 var4, int var5, long var6) {
      super(var1, var2, var3, var4, var5, var6);
   }

   public void method17109(DynamicRegistries var1, ChunkGenerator var2, TemplateManager var3, int var4, int var5, Biome var6, Class4712 var7) {
      Class80 var10 = Class80.method254(this.field24201);
      byte var11 = 5;
      byte var12 = 5;
      if (var10 != Class80.field186) {
         if (var10 != Class80.field187) {
            if (var10 == Class80.field188) {
               var12 = -5;
            }
         } else {
            var11 = -5;
            var12 = -5;
         }
      } else {
         var11 = -5;
      }

      int var13 = (var4 << 4) + 7;
      int var14 = (var5 << 4) + 7;
      int var15 = var2.method17829(var13, var14, Heightmap.Type.field295);
      int var16 = var2.method17829(var13, var14 + var12, Heightmap.Type.field295);
      int var17 = var2.method17829(var13 + var11, var14, Heightmap.Type.field295);
      int var18 = var2.method17829(var13 + var11, var14 + var12, Heightmap.Type.field295);
      int var19 = Math.min(Math.min(var15, var16), Math.min(var17, var18));
      if (var19 >= 60) {
         BlockPos var20 = new BlockPos(var4 * 16 + 8, var19 + 1, var5 * 16 + 8);
         LinkedList var21 = Lists.newLinkedList();
         Class9702.method38018(var3, var20, var10, var21, this.field24201);
         this.field24196.addAll(var21);
         this.method17113();
      }
   }

   @Override
   public void method17112(ISeedReader var1, Class7480 var2, ChunkGenerator var3, Random var4, Class9764 var5, ChunkPos var6) {
      super.method17112(var1, var2, var3, var4, var5, var6);
      int var9 = this.field24197.field45679;

      for (int var10 = var5.field45678; var10 <= var5.field45681; var10++) {
         for (int var11 = var5.field45680; var11 <= var5.field45683; var11++) {
            BlockPos var12 = new BlockPos(var10, var9, var11);
            if (!var1.method7007(var12) && this.field24197.method38396(var12)) {
               boolean var13 = false;

               for (Class4178 var15 : this.field24196) {
                  if (var15.method12915().method38396(var12)) {
                     var13 = true;
                     break;
                  }
               }

               if (var13) {
                  for (int var16 = var9 - 1; var16 > 1; var16--) {
                     BlockPos var17 = new BlockPos(var10, var16, var11);
                     if (!var1.method7007(var17) && !var1.getBlockState(var17).getMaterial().isLiquid()) {
                        break;
                     }

                     var1.setBlockState(var17, Blocks.field36399.method11579(), 2);
                  }
               }
            }
         }
      }
   }
}
