package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.chunk.IChunk;
import net.minecraft.world.gen.WorldGenRegion;
import net.minecraft.world.gen.feature.structure.StructureManager;

import java.util.Arrays;

public class FlatChunkGenerator extends ChunkGenerator {
   public static final Codec<FlatChunkGenerator> field_236069_d_ = Class9733.field45443.fieldOf("settings").xmap(FlatChunkGenerator::new, FlatChunkGenerator::method17837).codec();
   private final Class9733 field24999;

   public FlatChunkGenerator(Class9733 var1) {
      super(new Class1688(var1.method38125()), new Class1688(var1.method38127()), var1.method38126(), 0L);
      this.field24999 = var1;
   }

   @Override
   public Codec<? extends ChunkGenerator> func_230347_a_() {
      return field_236069_d_;
   }

   @Override
   public ChunkGenerator func_230349_a_(long var1) {
      return this;
   }

   public Class9733 method17837() {
      return this.field24999;
   }

   @Override
   public void generateSurface(WorldGenRegion var1, IChunk var2) {
   }

   @Override
   public int getGroundHeight() {
      BlockState[] var3 = this.field24999.method38130();

      for (int var4 = 0; var4 < var3.length; var4++) {
         BlockState var5 = var3[var4] != null ? var3[var4] : Blocks.AIR.getDefaultState();
         if (!Heightmap.Type.MOTION_BLOCKING.method287().test(var5)) {
            return var4 - 1;
         }
      }

      return var3.length;
   }

   @Override
   public void func_230352_b_(IWorld var1, StructureManager var2, IChunk var3) {
      BlockState[] var6 = this.field24999.method38130();
      BlockPos.Mutable var7 = new BlockPos.Mutable();
      Heightmap var8 = var3.getHeightmap(Heightmap.Type.OCEAN_FLOOR_WG);
      Heightmap var9 = var3.getHeightmap(Heightmap.Type.WORLD_SURFACE_WG);

      for (int var10 = 0; var10 < var6.length; var10++) {
         BlockState var11 = var6[var10];
         if (var11 != null) {
            for (int var12 = 0; var12 < 16; var12++) {
               for (int var13 = 0; var13 < 16; var13++) {
                  var3.setBlockState(var7.setPos(var12, var10, var13), var11, false);
                  var8.method24578(var12, var10, var13, var11);
                  var9.method24578(var12, var10, var13, var11);
               }
            }
         }
      }
   }

   @Override
   public int getHeight(int var1, int var2, Heightmap.Type var3) {
      BlockState[] var6 = this.field24999.method38130();

      for (int var7 = var6.length - 1; var7 >= 0; var7--) {
         BlockState var8 = var6[var7];
         if (var8 != null && var3.method287().test(var8)) {
            return var7 + 1;
         }
      }

      return 0;
   }

   @Override
   public IBlockReader func_230348_a_(int var1, int var2) {
      return new Class1669(
         Arrays.<BlockState>stream(this.field24999.method38130())
            .<BlockState>map(var0 -> (BlockState)(var0 != null ? var0 : Blocks.AIR.getDefaultState()))
            .<BlockState>toArray(BlockState[]::new)
      );
   }
}
