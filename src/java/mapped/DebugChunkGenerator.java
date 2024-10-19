package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeManager;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.biome.provider.SingleBiomeProvider;
import net.minecraft.world.chunk.IChunk;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.WorldGenRegion;
import net.minecraft.world.gen.feature.structure.StructureManager;
import net.minecraft.world.gen.settings.DimensionStructuresSettings;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class DebugChunkGenerator extends ChunkGenerator {
   private static String[] field24990;
   public static final Codec<DebugChunkGenerator> field_236066_e_ = Class8611.<Biome>method30859(Registry.BIOME_KEY)
      .xmap(DebugChunkGenerator::new, DebugChunkGenerator::method17834)
      .stable()
      .codec();
   private static final List<BlockState> ALL_VALID_STATES = StreamSupport.<Block>stream(Registry.BLOCK.spliterator(), false)
      .<BlockState>flatMap(var0 -> var0.getStateContainer().getValidStates().stream())
      .collect(Collectors.<BlockState>toList());
   private static final int GRID_WIDTH = MathHelper.ceil(MathHelper.sqrt((float) ALL_VALID_STATES.size()));
   private static final int GRID_HEIGHT = MathHelper.ceil((float) ALL_VALID_STATES.size() / (float) GRID_WIDTH);
   public static final BlockState AIR = Blocks.AIR.getDefaultState();
   public static final BlockState field24996 = Blocks.BARRIER.getDefaultState();
   private final Registry<Biome> field24997;

   public DebugChunkGenerator(Registry<Biome> var1) {
      super(new SingleBiomeProvider(var1.getOrThrow(Biomes.PLAINS)), new DimensionStructuresSettings(false));
      this.field24997 = var1;
   }

   public Registry<Biome> method17834() {
      return this.field24997;
   }

   @Override
   public Codec<? extends ChunkGenerator> func_230347_a_() {
      return field_236066_e_;
   }

   @Override
   public ChunkGenerator func_230349_a_(long var1) {
      return this;
   }

   @Override
   public void generateSurface(WorldGenRegion var1, IChunk var2) {
   }

   @Override
   public void func_230350_a_(long var1, BiomeManager var3, IChunk var4, GenerationStageCarving var5) {
   }

   @Override
   public void func_230351_a_(WorldGenRegion worldRegion, StructureManager strucMang) {
      BlockPos.Mutable var5 = new BlockPos.Mutable();
      int var6 = worldRegion.getMainChunkX();
      int var7 = worldRegion.getMainChunkZ();

      for (int var8 = 0; var8 < 16; var8++) {
         for (int var9 = 0; var9 < 16; var9++) {
            int var10 = (var6 << 4) + var8;
            int var11 = (var7 << 4) + var9;
            worldRegion.setBlockState(var5.setPos(var10, 60, var11), field24996, 2);
            BlockState var12 = method17835(var10, var11);
            if (var12 != null) {
               worldRegion.setBlockState(var5.setPos(var10, 70, var11), var12, 2);
            }
         }
      }
   }

   @Override
   public void func_230352_b_(IWorld var1, StructureManager var2, IChunk var3) {
   }

   @Override
   public int getHeight(int var1, int var2, Heightmap.Type var3) {
      return 0;
   }

   @Override
   public IBlockReader func_230348_a_(int var1, int var2) {
      return new Class1669(new BlockState[0]);
   }

   public static BlockState method17835(int p_177461_0_, int p_177461_1_) {
      BlockState blockstate = AIR;
      if (p_177461_0_ > 0 && p_177461_1_ > 0 && p_177461_0_ % 2 != 0 && p_177461_1_ % 2 != 0) {
         p_177461_0_ /= 2;
         p_177461_1_ /= 2;
         if (p_177461_0_ <= GRID_WIDTH && p_177461_1_ <= GRID_HEIGHT) {
            int var5 = MathHelper.abs(p_177461_0_ * GRID_WIDTH + p_177461_1_);
            if (var5 < ALL_VALID_STATES.size()) {
               blockstate = ALL_VALID_STATES.get(var5);
            }
         }
      }

      return blockstate;
   }
}
