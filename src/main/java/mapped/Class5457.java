package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.feature.template.TemplateManager;

public class Class5457 extends Class5455<Class4712> {
   private static String[] field24216;

   public Class5457(Structure<Class4712> var1, int var2, int var3, MutableBoundingBox var4, int var5, long var6) {
      super(var1, var2, var3, var4, var5, var6);
   }

   public void method17109(DynamicRegistries var1, ChunkGenerator var2, TemplateManager var3, int var4, int var5, Biome var6, Class4712 var7) {
      ChunkPos var10 = new ChunkPos(var4, var5);
      int var11 = var10.getX() + this.field24201.nextInt(16);
      int var12 = var10.getZ() + this.field24201.nextInt(16);
      int var13 = var2.func_230356_f_();
      int var14 = var13 + this.field24201.nextInt(var2.func_230355_e_() - 2 - var13);
      IBlockReader var15 = var2.func_230348_a_(var11, var12);

      for (BlockPos.Mutable var16 = new BlockPos.Mutable(var11, var14, var12); var14 > var13; var14--) {
         BlockState var17 = var15.getBlockState(var16);
         var16.method8379(Direction.DOWN);
         BlockState var18 = var15.getBlockState(var16);
         if (var17.isAir() && (var18.isIn(Blocks.SOUL_SAND) || var18.method23454(var15, var16, Direction.UP))) {
            break;
         }
      }

      if (var14 > var13) {
         Class8983.method33186(var3, this.field24196, this.field24201, new BlockPos(var11, var14, var12));
         this.method17113();
      }
   }
}
