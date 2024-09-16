package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeManager;
import net.minecraft.world.chunk.IChunk;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class Class5647 extends ChunkGenerator {
   private static String[] field24990;
   public static final Codec<Class5647> field24991 = Class8611.<Biome>method30859(Registry.BIOME_KEY)
      .xmap(Class5647::new, Class5647::method17834)
      .stable()
      .codec();
   private static final List<BlockState> field24992 = StreamSupport.<Block>stream(Registry.BLOCK.spliterator(), false)
      .<BlockState>flatMap(var0 -> var0.getStateContainer().getValidStates().stream())
      .collect(Collectors.<BlockState>toList());
   private static final int field24993 = MathHelper.ceil(MathHelper.method37765((float)field24992.size()));
   private static final int field24994 = MathHelper.ceil((float)field24992.size() / (float)field24993);
   public static final BlockState field24995 = Blocks.AIR.method11579();
   public static final BlockState field24996 = Blocks.field36765.method11579();
   private final Registry<Biome> field24997;

   public Class5647(Registry<Biome> var1) {
      super(new Class1688(var1.getOrThrow(Class9495.field44122)), new Class9763(false));
      this.field24997 = var1;
   }

   public Registry<Biome> method17834() {
      return this.field24997;
   }

   @Override
   public Codec<? extends ChunkGenerator> method17790() {
      return field24991;
   }

   @Override
   public ChunkGenerator method17791(long var1) {
      return this;
   }

   @Override
   public void method17801(Class1691 var1, IChunk var2) {
   }

   @Override
   public void method17819(long var1, BiomeManager var3, IChunk var4, Class97 var5) {
   }

   @Override
   public void method17821(Class1691 var1, Class7480 var2) {
      BlockPos.Mutable var5 = new BlockPos.Mutable();
      int var6 = var1.method7241();
      int var7 = var1.method7242();

      for (int var8 = 0; var8 < 16; var8++) {
         for (int var9 = 0; var9 < 16; var9++) {
            int var10 = (var6 << 4) + var8;
            int var11 = (var7 << 4) + var9;
            var1.setBlockState(var5.method8372(var10, 60, var11), field24996, 2);
            BlockState var12 = method17835(var10, var11);
            if (var12 != null) {
               var1.setBlockState(var5.method8372(var10, 70, var11), var12, 2);
            }
         }
      }
   }

   @Override
   public void method17803(Class1660 var1, Class7480 var2, IChunk var3) {
   }

   @Override
   public int method17797(int var1, int var2, Heightmap.Type var3) {
      return 0;
   }

   @Override
   public IBlockReader method17798(int var1, int var2) {
      return new Class1669(new BlockState[0]);
   }

   public static BlockState method17835(int var0, int var1) {
      BlockState var4 = field24995;
      if (var0 > 0 && var1 > 0 && var0 % 2 != 0 && var1 % 2 != 0) {
         var0 /= 2;
         var1 /= 2;
         if (var0 <= field24993 && var1 <= field24994) {
            int var5 = MathHelper.method37772(var0 * field24993 + var1);
            if (var5 < field24992.size()) {
               var4 = field24992.get(var5);
            }
         }
      }

      return var4;
   }
}
