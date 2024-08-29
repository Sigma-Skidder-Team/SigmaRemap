package mapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import net.minecraft.util.math.BlockPos;

import java.util.Random;
import java.util.Set;
import java.util.function.Predicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class Class1688 extends Class1685 {
   public static final Codec<Class1688> field9182 = Biome.field40309.fieldOf("biome").xmap(Class1688::new, var0 -> var0.field9183).stable().codec();
   private final Supplier<Biome> field9183;

   public Class1688(Biome var1) {
      this(() -> var1);
   }

   public Class1688(Supplier<Biome> var1) {
      super(ImmutableList.of(var1.get()));
      this.field9183 = var1;
   }

   @Override
   public Codec<? extends Class1685> method7199() {
      return field9182;
   }

   @Override
   public Class1685 method7200(long var1) {
      return this;
   }

   @Override
   public Biome method7005(int var1, int var2, int var3) {
      return this.field9183.get();
   }

   @Nullable
   @Override
   public BlockPos method7204(int var1, int var2, int var3, int var4, int var5, Predicate<Biome> var6, Random var7, boolean var8) {
      if (!var6.test(this.field9183.get())) {
         return null;
      } else {
         return !var8
            ? new BlockPos(var1 - var4 + var7.nextInt(var4 * 2 + 1), var2, var3 - var4 + var7.nextInt(var4 * 2 + 1))
            : new BlockPos(var1, var2, var3);
      }
   }

   @Override
   public Set<Biome> method7202(int var1, int var2, int var3, int var4) {
      return Sets.newHashSet(new Biome[]{this.field9183.get()});
   }
}
