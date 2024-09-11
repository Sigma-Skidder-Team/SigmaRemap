package mapped;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;

import java.util.Map;
import java.util.Set;

public class BlockColors {
   private static String[] field36031;
   private final Class2352<Class8040> field36032 = new Class2352<Class8040>(32);
   private final Map<Block, Set<Class8550<?>>> field36033 = Maps.newHashMap();

   public static BlockColors init() {
      BlockColors var2 = new BlockColors();
      var2.method29466(
         (var0, var1, var2x, var3) -> var1 != null && var2x != null
               ? Class8527.method30242(var1, var0.method23463(Class3456.field19276) != Class84.field209 ? var2x : var2x.down())
               : -1,
         Blocks.field36802,
         Blocks.TALL_GRASS
      );
      var2.method29468(Class3456.field19276, Blocks.field36802, Blocks.TALL_GRASS);
      var2.method29466(
         (var0, var1, var2x, var3) -> var1 != null && var2x != null ? Class8527.method30242(var1, var2x) : Class6406.method19509(0.5, 1.0),
         Blocks.field36395,
         Blocks.FERN,
         Blocks.GRASS,
         Blocks.field36675
      );
      var2.method29466((var0, var1, var2x, var3) -> Class9441.method36293(), Blocks.field36447);
      var2.method29466((var0, var1, var2x, var3) -> Class9441.method36294(), Blocks.field36448);
      var2.method29466(
         (var0, var1, var2x, var3) -> var1 != null && var2x != null ? Class8527.method30243(var1, var2x) : Class9441.method36295(),
         Blocks.field36446,
         Blocks.field36449,
         Blocks.field36450,
         Blocks.field36451,
         Blocks.VINE
      );
      var2.method29466(
         (var0, var1, var2x, var3) -> var1 != null && var2x != null ? Class8527.method30244(var1, var2x) : -1,
         Blocks.WATER,
         Blocks.field37013,
         Blocks.field36648
      );
      var2.method29466((var0, var1, var2x, var3) -> Class3222.method11629(var0.<Integer>method23463(Class3222.field18651)), Blocks.REDSTONE_WIRE);
      var2.method29468(Class3222.field18651, Blocks.REDSTONE_WIRE);
      var2.method29466((var0, var1, var2x, var3) -> var1 != null && var2x != null ? Class8527.method30242(var1, var2x) : -1, Blocks.SUGAR_CANE);
      var2.method29466((var0, var1, var2x, var3) -> 14731036, Blocks.ATTACHED_MELON_STEM, Blocks.ATTACHED_PUMPKIN_STEM);
      var2.method29466((var0, var1, var2x, var3) -> {
         int var6 = var0.<Integer>method23463(Class3486.field19347);
         int var7 = var6 * 32;
         int var8 = 255 - var6 * 8;
         int var9 = var6 * 4;
         return var7 << 16 | var8 << 8 | var9;
      }, Blocks.MELON_STEM, Blocks.PUMPKIN_STEM);
      var2.method29468(Class3486.field19347, Blocks.MELON_STEM, Blocks.PUMPKIN_STEM);
      var2.method29466((var0, var1, var2x, var3) -> var1 != null && var2x != null ? 2129968 : 7455580, Blocks.LILY_PAD);
      return var2;
   }

   public int method29464(BlockState var1, World var2, BlockPos var3) {
      Class8040 var6 = this.field36032.method9172(Registry.BLOCK.getId(var1.getBlock()));
      if (var6 == null) {
         Class7210 var7 = var1.method23394(var2, var3);
         return var7 == null ? -1 : var7.field31006;
      } else {
         return var6.method27608(var1, (Class1663)null, (BlockPos)null, 0);
      }
   }

   public int method29465(BlockState var1, Class1663 var2, BlockPos var3, int var4) {
      Class8040 var7 = this.field36032.method9172(Registry.BLOCK.getId(var1.getBlock()));
      return var7 != null ? var7.method27608(var1, var2, var3, var4) : -1;
   }

   public void method29466(Class8040 var1, Block... var2) {
      for (Block var8 : var2) {
         this.field36032.method9268(var1, Registry.BLOCK.getId(var8));
      }
   }

   private void method29467(Set<Class8550<?>> var1, Block... var2) {
      for (Block var8 : var2) {
         this.field36033.put(var8, var1);
      }
   }

   private void method29468(Class8550<?> var1, Block... var2) {
      this.method29467(ImmutableSet.of(var1), var2);
   }

   public Set<Class8550<?>> method29469(Block var1) {
      return this.field36033.getOrDefault(var1, ImmutableSet.of());
   }
}
