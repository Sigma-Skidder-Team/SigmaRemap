package mapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class Class1685 implements Class1683 {
   public static final Codec<Class1685> field9159 = Registry.field16135.dispatchStable(Class1685::method7199, Function.identity());
   public final Map<Structure<?>, Boolean> field9160 = Maps.newHashMap();
   public final Set<BlockState> field9161 = Sets.newHashSet();
   public final List<Biome> field9162;

   public Class1685(Stream<Supplier<Biome>> var1) {
      this(var1.map(Supplier::get).collect(ImmutableList.toImmutableList()));
   }

   public Class1685(List<Biome> var1) {
      this.field9162 = var1;
   }

   public abstract Codec<? extends Class1685> method7199();

   public abstract Class1685 method7200(long var1);

   public List<Biome> method7201() {
      return this.field9162;
   }

   public Set<Biome> method7202(int var1, int var2, int var3, int var4) {
      int var7 = var1 - var4 >> 2;
      int var8 = var2 - var4 >> 2;
      int var9 = var3 - var4 >> 2;
      int var10 = var1 + var4 >> 2;
      int var11 = var2 + var4 >> 2;
      int var12 = var3 + var4 >> 2;
      int var13 = var10 - var7 + 1;
      int var14 = var11 - var8 + 1;
      int var15 = var12 - var9 + 1;
      HashSet var16 = Sets.newHashSet();

      for (int var17 = 0; var17 < var15; var17++) {
         for (int var18 = 0; var18 < var13; var18++) {
            for (int var19 = 0; var19 < var14; var19++) {
               int var20 = var7 + var18;
               int var21 = var8 + var19;
               int var22 = var9 + var17;
               var16.add(this.method7005(var20, var21, var22));
            }
         }
      }

      return var16;
   }

   @Nullable
   public BlockPos method7203(int var1, int var2, int var3, int var4, Predicate<Biome> var5, Random var6) {
      return this.method7204(var1, var2, var3, var4, 1, var5, var6, false);
   }

   @Nullable
   public BlockPos method7204(int var1, int var2, int var3, int var4, int var5, Predicate<Biome> var6, Random var7, boolean var8) {
      int var11 = var1 >> 2;
      int var12 = var3 >> 2;
      int var13 = var4 >> 2;
      int var14 = var2 >> 2;
      BlockPos var15 = null;
      int var16 = 0;
      int var17 = !var8 ? var13 : 0;
      int var18 = var17;

      while (var18 <= var13) {
         for (int var19 = -var18; var19 <= var18; var19 += var5) {
            boolean var20 = Math.abs(var19) == var18;

            for (int var21 = -var18; var21 <= var18; var21 += var5) {
               if (var8) {
                  boolean var22 = Math.abs(var21) == var18;
                  if (!var22 && !var20) {
                     continue;
                  }
               }

               int var24 = var11 + var21;
               int var23 = var12 + var19;
               if (var6.test(this.method7005(var24, var14, var23))) {
                  if (var15 == null || var7.nextInt(var16 + 1) == 0) {
                     var15 = new BlockPos(var24 << 2, var2, var23 << 2);
                     if (var8) {
                        return var15;
                     }
                  }

                  var16++;
               }
            }
         }

         var18 += var5;
      }

      return var15;
   }

   public boolean method7205(Structure<?> var1) {
      return this.field9160.computeIfAbsent(var1, var1x -> this.field9162.stream().anyMatch(var1xx -> var1xx.method32507().method24277(var1x)));
   }

   public Set<BlockState> method7206() {
      if (this.field9161.isEmpty()) {
         for (Biome var4 : this.field9162) {
            this.field9161.add(var4.method32507().method24283().method28934());
         }
      }

      return this.field9161;
   }

   static {
      Registry.<Codec<? extends Class1685>>method9194(Registry.field16135, "fixed", Class1688.field9182);
      Registry.<Codec<? extends Class1685>>method9194(Registry.field16135, "multi_noise", Class1686.field9165);
      Registry.<Codec<? extends Class1685>>method9194(Registry.field16135, "checkerboard", Class1687.field9178);
      Registry.<Codec<? extends Class1685>>method9194(Registry.field16135, "vanilla_layered", Class1689.field9184);
      Registry.<Codec<? extends Class1685>>method9194(Registry.field16135, "the_end", EndBiomeProvider.field9191);
   }
}
