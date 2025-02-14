package mapped;

import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.util.registry.Registry;

import java.util.List;
import java.util.Random;
import java.util.Set;

public abstract class Class6896 {
   public static final Codec<Class6896> field29884 = Registry.field16132.dispatch(Class6896::method21064, Class9107::method33960);
   public final int field29885;
   public final int field29886;
   public final int field29887;

   public static <P extends Class6896> P3<Mu<P>, Integer, Integer, Integer> method21063(Instance<P> var0) {
      return var0.group(
         Codec.intRange(0, 32).fieldOf("base_height").forGetter(var0x -> var0x.field29885),
         Codec.intRange(0, 24).fieldOf("height_rand_a").forGetter(var0x -> var0x.field29886),
         Codec.intRange(0, 24).fieldOf("height_rand_b").forGetter(var0x -> var0x.field29887)
      );
   }

   public Class6896(int var1, int var2, int var3) {
      this.field29885 = var1;
      this.field29886 = var2;
      this.field29887 = var3;
   }

   public abstract Class9107<?> method21064();

   public abstract List<Class9359> method21065(IWorldGenerationReader var1, Random var2, int var3, BlockPos var4, Set<BlockPos> var5, MutableBoundingBox var6, Class4733 var7);

   public int method21066(Random var1) {
      return this.field29885 + var1.nextInt(this.field29886 + 1) + var1.nextInt(this.field29887 + 1);
   }

   public static void method21067(Class1681 var0, BlockPos var1, BlockState var2, MutableBoundingBox var3) {
      Class2903.method11232(var0, var1, var2);
      var3.method38392(new MutableBoundingBox(var1, var1));
   }

   private static boolean method21068(Class1680 var0, BlockPos var1) {
      return var0.method6815(var1, var0x -> {
         Block var3 = var0x.getBlock();
         return Class2898.method11219(var3) && !var0x.isIn(Blocks.GRASS_BLOCK) && !var0x.isIn(Blocks.MYCELIUM);
      });
   }

   public static void method21069(IWorldGenerationReader var0, BlockPos var1) {
      if (!method21068(var0, var1)) {
         Class2903.method11232(var0, var1, Blocks.DIRT.getDefaultState());
      }
   }

   public static boolean method21070(IWorldGenerationReader var0, Random var1, BlockPos var2, Set<BlockPos> var3, MutableBoundingBox var4, Class4733 var5) {
      if (!Class2903.method11233(var0, var2)) {
         return false;
      } else {
         method21067(var0, var2, var5.field22411.method20424(var1, var2), var4);
         var3.add(var2.toImmutable());
         return true;
      }
   }

   public static void method21071(IWorldGenerationReader var0, Random var1, BlockPos.Mutable var2, Set<BlockPos> var3, MutableBoundingBox var4, Class4733 var5) {
      if (Class2903.method11226(var0, var2)) {
         method21070(var0, var1, var2, var3, var4, var5);
      }
   }
}
