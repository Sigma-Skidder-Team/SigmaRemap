package mapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Queues;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class Class6805<T> implements Class6802<T> {
   public final Predicate<T> field29619;
   private final Function<T, ResourceLocation> field29620;
   private final Set<Class8269<T>> field29621 = Sets.newHashSet();
   private final TreeSet<Class8269<T>> field29622 = Sets.newTreeSet(Class8269.method28873());
   private final ServerWorld field29623;
   private final Queue<Class8269<T>> field29624 = Queues.newArrayDeque();
   private final List<Class8269<T>> field29625 = Lists.newArrayList();
   private final Consumer<Class8269<T>> field29626;

   public Class6805(ServerWorld var1, Predicate<T> var2, Function<T, ResourceLocation> var3, Consumer<Class8269<T>> var4) {
      this.field29619 = var2;
      this.field29620 = var3;
      this.field29623 = var1;
      this.field29626 = var4;
   }

   public void method20728() {
      int var3 = this.field29622.size();
      if (var3 != this.field29621.size()) {
         throw new IllegalStateException("TickNextTick list out of synch");
      } else {
         if (var3 > 65536) {
            var3 = 65536;
         }

         Class1703 var4 = this.field29623.getChunkProvider();
         Iterator var5 = this.field29622.iterator();
         this.field29623.getProfiler().startSection("cleaning");

         while (var3 > 0 && var5.hasNext()) {
            Class8269 var6 = (Class8269)var5.next();
            if (var6.field35557 > this.field29623.method6783()) {
               break;
            }

            if (var4.method7353(var6.field35556)) {
               var5.remove();
               this.field29621.remove(var6);
               this.field29624.add(var6);
               var3--;
            }
         }

         this.field29623.getProfiler().endStartSection("ticking");

         Class8269 var11;
         while ((var11 = this.field29624.poll()) != null) {
            if (var4.method7353(var11.field35556)) {
               try {
                  this.field29625.add(var11);
                  this.field29626.accept(var11);
               } catch (Throwable var10) {
                  CrashReport var8 = CrashReport.makeCrashReport(var10, "Exception while ticking");
                  CrashReportCategory var9 = var8.makeCategory("Block being ticked");
                  CrashReportCategory.addBlockInfo(var9, var11.field35556, (BlockState)null);
                  throw new ReportedException(var8);
               }
            } else {
               this.method20726(var11.field35556, (T)var11.method28874(), 0);
            }
         }

         this.field29623.getProfiler().endSection();
         this.field29625.clear();
         this.field29624.clear();
      }
   }

   @Override
   public boolean method20720(BlockPos var1, T var2) {
      return this.field29624.contains(new Class8269<Object>(var1, var2));
   }

   public List<Class8269<T>> method20729(Class7481 var1, boolean var2, boolean var3) {
      int var6 = (var1.field32174 << 4) - 2;
      int var7 = var6 + 16 + 2;
      int var8 = (var1.field32175 << 4) - 2;
      int var9 = var8 + 16 + 2;
      return this.method20730(new Class9764(var6, 0, var8, var7, 256, var9), var2, var3);
   }

   public List<Class8269<T>> method20730(Class9764 var1, boolean var2, boolean var3) {
      List var6 = this.method20731((List<Class8269<T>>)null, this.field29622, var1, var2);
      if (var2 && var6 != null) {
         this.field29621.removeAll(var6);
      }

      var6 = this.method20731(var6, this.field29624, var1, var2);
      if (!var3) {
         var6 = this.method20731(var6, this.field29625, var1, var2);
      }

      return var6 != null ? var6 : Collections.<Class8269<T>>emptyList();
   }

   @Nullable
   private List<Class8269<T>> method20731(List<Class8269<T>> var1, Collection<Class8269<T>> var2, Class9764 var3, boolean var4) {
      Iterator var7 = var2.iterator();

      while (var7.hasNext()) {
         Class8269 var8 = (Class8269)var7.next();
         BlockPos var9 = var8.field35556;
         if (var9.getX() >= var3.field45678
            && var9.getX() < var3.field45681
            && var9.getZ() >= var3.field45680
            && var9.getZ() < var3.field45683) {
            if (var4) {
               var7.remove();
            }

            if (var1 == null) {
               var1 = Lists.newArrayList();
            }

            var1.add(var8);
         }
      }

      return (List<Class8269<T>>)var1;
   }

   public void method20732(Class9764 var1, BlockPos var2) {
      for (Class8269 var6 : this.method20730(var1, false, false)) {
         if (var1.method38396(var6.field35556)) {
            BlockPos var7 = var6.field35556.method8337(var2);
            Object var8 = var6.method28874();
            this.method20735(new Class8269<T>(var7, (T)var8, var6.field35557, var6.field35558));
         }
      }
   }

   public ListNBT method20733(Class7481 var1) {
      List var4 = this.method20729(var1, false, true);
      return method20734(this.field29620, var4, this.field29623.method6783());
   }

   private static <T> ListNBT method20734(Function<T, ResourceLocation> var0, Iterable<Class8269<T>> var1, long var2) {
      ListNBT var6 = new ListNBT();

      for (Class8269<T> var8 : var1) {
         CompoundNBT var9 = new CompoundNBT();
         var9.method109("i", var0.apply(var8.method28874()).toString());
         var9.method102("x", var8.field35556.getX());
         var9.method102("y", var8.field35556.getY());
         var9.method102("z", var8.field35556.getZ());
         var9.method102("t", (int)(var8.field35557 - var2));
         var9.method102("p", var8.field35558.method8914());
         var6.add(var9);
      }

      return var6;
   }

   @Override
   public boolean method20718(BlockPos var1, T var2) {
      return this.field29621.contains(new Class8269<Object>(var1, var2));
   }

   @Override
   public void method20719(BlockPos var1, T var2, int var3, Class2199 var4) {
      if (!this.field29619.test((T)var2)) {
         this.method20735(new Class8269<T>(var1, (T)var2, (long)var3 + this.field29623.method6783(), var4));
      }
   }

   private void method20735(Class8269<T> var1) {
      if (!this.field29621.contains(var1)) {
         this.field29621.add(var1);
         this.field29622.add(var1);
      }
   }

   public int method20736() {
      return this.field29621.size();
   }
}
