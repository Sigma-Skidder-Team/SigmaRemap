package remapped;

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

public class class_2858<T> implements class_3065<T> {
   public final Predicate<T> field_14002;
   private final Function<T, Identifier> field_13998;
   private final Set<class_4110<T>> field_14001 = Sets.newHashSet();
   private final TreeSet<class_4110<T>> field_14000 = Sets.newTreeSet(class_4110.method_19094());
   private final class_6331 field_13997;
   private final Queue<class_4110<T>> field_13999 = Queues.newArrayDeque();
   private final List<class_4110<T>> field_14003 = Lists.newArrayList();
   private final Consumer<class_4110<T>> field_13995;

   public class_2858(class_6331 var1, Predicate<T> var2, Function<T, Identifier> var3, Consumer<class_4110<T>> var4) {
      this.field_14002 = var2;
      this.field_13998 = var3;
      this.field_13997 = var1;
      this.field_13995 = var4;
   }

   public void method_13089() {
      int var3 = this.field_14000.size();
      if (var3 != this.field_14001.size()) {
         throw new IllegalStateException("TickNextTick list out of synch");
      } else {
         if (var3 > 65536) {
            var3 = 65536;
         }

         class_2206 var4 = this.field_13997.method_28945();
         Iterator var5 = this.field_14000.iterator();
         this.field_13997.method_29599().startSection("cleaning");

         while (var3 > 0 && var5.hasNext()) {
            class_4110 var6 = (class_4110)var5.next();
            if (var6.field_20036 > this.field_13997.method_29546()) {
               break;
            }

            if (var4.method_14815(var6.field_20034)) {
               var5.remove();
               this.field_14001.remove(var6);
               this.field_13999.add(var6);
               var3--;
            }
         }

         this.field_13997.method_29599().method_16050("ticking");

         class_4110 var11;
         while ((var11 = this.field_13999.poll()) != null) {
            if (var4.method_14815(var11.field_20034)) {
               try {
                  this.field_14003.add(var11);
                  this.field_13995.accept(var11);
               } catch (Throwable var10) {
                  class_159 var8 = class_159.method_643(var10, "Exception while ticking");
                  class_6544 var9 = var8.method_639("Block being ticked");
                  class_6544.method_29843(var9, var11.field_20034, (class_2522)null);
                  throw new class_3297(var8);
               }
            } else {
               this.method_14011(var11.field_20034, (T)var11.method_19096(), 0);
            }
         }

         this.field_13997.method_29599().endSection();
         this.field_14003.clear();
         this.field_13999.clear();
      }
   }

   @Override
   public boolean method_14010(BlockPos var1, T var2) {
      return this.field_13999.contains(new class_4110<Object>(var1, var2));
   }

   public List<class_4110<T>> method_13095(class_2034 var1, boolean var2, boolean var3) {
      int var6 = (var1.field_10328 << 4) - 2;
      int var7 = var6 + 16 + 2;
      int var8 = (var1.field_10327 << 4) - 2;
      int var9 = var8 + 16 + 2;
      return this.method_13096(new class_9616(var6, 0, var8, var7, 256, var9), var2, var3);
   }

   public List<class_4110<T>> method_13096(class_9616 var1, boolean var2, boolean var3) {
      List var6 = this.method_13094((List<class_4110<T>>)null, this.field_14000, var1, var2);
      if (var2 && var6 != null) {
         this.field_14001.removeAll(var6);
      }

      var6 = this.method_13094(var6, this.field_13999, var1, var2);
      if (!var3) {
         var6 = this.method_13094(var6, this.field_14003, var1, var2);
      }

      return var6 != null ? var6 : Collections.<class_4110<T>>emptyList();
   }

   @Nullable
   private List<class_4110<T>> method_13094(List<class_4110<T>> var1, Collection<class_4110<T>> var2, class_9616 var3, boolean var4) {
      Iterator var7 = var2.iterator();

      while (var7.hasNext()) {
         class_4110 var8 = (class_4110)var7.next();
         BlockPos var9 = var8.field_20034;
         if (var9.getX() >= var3.field_48996
            && var9.getX() < var3.field_48991
            && var9.method_12185() >= var3.field_48992
            && var9.method_12185() < var3.field_48994) {
            if (var4) {
               var7.remove();
            }

            if (var1 == null) {
               var1 = Lists.newArrayList();
            }

            var1.add(var8);
         }
      }

      return (List<class_4110<T>>)var1;
   }

   public void method_13091(class_9616 var1, BlockPos var2) {
      for (class_4110 var6 : this.method_13096(var1, false, false)) {
         if (var1.method_44395(var6.field_20034)) {
            BlockPos var7 = var6.field_20034.method_6105(var2);
            Object var8 = var6.method_19096();
            this.method_13092(new class_4110<T>(var7, (T)var8, var6.field_20036, var6.field_20035));
         }
      }
   }

   public class_3416 method_13098(class_2034 var1) {
      List var4 = this.method_13095(var1, false, true);
      return method_13090(this.field_13998, var4, this.field_13997.method_29546());
   }

   private static <T> class_3416 method_13090(Function<T, Identifier> var0, Iterable<class_4110<T>> var1, long var2) {
      class_3416 var6 = new class_3416();

      for (class_4110 var8 : var1) {
         CompoundNBT var9 = new CompoundNBT();
         var9.method_25941("i", ((Identifier)var0.apply(var8.method_19096())).toString());
         var9.putInt("x", var8.field_20034.getX());
         var9.putInt("y", var8.field_20034.method_12165());
         var9.putInt("z", var8.field_20034.method_12185());
         var9.putInt("t", (int)(var8.field_20036 - var2));
         var9.putInt("p", var8.field_20035.method_7693());
         var6.add(var9);
      }

      return var6;
   }

   @Override
   public boolean method_14013(BlockPos var1, T var2) {
      return this.field_14001.contains(new class_4110<Object>(var1, var2));
   }

   @Override
   public void method_14012(BlockPos var1, T var2, int var3, class_1716 var4) {
      if (!this.field_14002.test((T)var2)) {
         this.method_13092(new class_4110<T>(var1, (T)var2, (long)var3 + this.field_13997.method_29546(), var4));
      }
   }

   private void method_13092(class_4110<T> var1) {
      if (!this.field_14001.contains(var1)) {
         this.field_14001.add(var1);
         this.field_14000.add(var1);
      }
   }

   public int method_13097() {
      return this.field_14001.size();
   }
}
