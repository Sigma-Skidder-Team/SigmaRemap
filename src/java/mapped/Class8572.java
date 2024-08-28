package mapped;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Either;
import it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class Class8572<T> {
   public static final int field38532 = Class1649.field8951 + 2 + 32;
   private final List<Long2ObjectLinkedOpenHashMap<List<Optional<T>>>> field38533 = IntStream.range(0, field38532)
      .mapToObj(var0 -> new Long2ObjectLinkedOpenHashMap<List<Optional<T>>>())
      .collect(Collectors.toList());
   private volatile int field38534 = field38532;
   private final String field38535;
   private final LongSet field38536 = new LongOpenHashSet();
   private final int field38537;

   public Class8572(String var1, int var2) {
      this.field38535 = var1;
      this.field38537 = var2;
   }

   public void method30625(int var1, Class7481 var2, int var3) {
      if (var1 < field38532) {
         Long2ObjectLinkedOpenHashMap<List<Optional<T>>> var6 = this.field38533.get(var1);
         List<Optional<T>> var7 = var6.remove(var2.method24352());
         if (var1 == this.field38534) {
            while (this.field38534 < field38532 && this.field38533.get(this.field38534).isEmpty()) {
               this.field38534++;
            }
         }

         if (var7 != null && !var7.isEmpty()) {
            this.field38533.get(var3).computeIfAbsent(var2.method24352(), var0 -> Lists.newArrayList()).addAll(var7);
            this.field38534 = Math.min(this.field38534, var3);
         }
      }
   }

   public void method30626(Optional<T> var1, long var2, int var4) {
      this.field38533.get(var4).computeIfAbsent(var2, var0 -> Lists.newArrayList())
              .add(var1);
      this.field38534 = Math.min(this.field38534, var4);
   }

   public void method30627(long var1, boolean var3) {
      for (Long2ObjectLinkedOpenHashMap<List<Optional<T>>> var7 : this.field38533) {
         List<Optional<T>> var8 = var7.get(var1);
         if (var8 != null) {
            if (!var3) {
               var8.removeIf(var0 -> !var0.isPresent());
            } else {
               var8.clear();
            }

            if (var8.isEmpty()) {
               var7.remove(var1);
            }
         }
      }

      while (this.field38534 < field38532 && this.field38533.get(this.field38534).isEmpty()) {
         this.field38534++;
      }

      this.field38536.remove(var1);
   }

   private Runnable method30628(long var1) {
      return () -> this.field38536.add(var1);
   }

   @Nullable
   public Stream<Either<T, Runnable>> method30629() {
      if (this.field38536.size() >= this.field38537) {
         return null;
      } else if (this.field38534 >= field38532) {
         return null;
      } else {
         int var3 = this.field38534;
         Long2ObjectLinkedOpenHashMap<List<Optional<T>>> var4 = this.field38533.get(var3);
         if (var4.isEmpty()) return null;
         long var5 = var4.firstLongKey();
         List<Optional<T>> var7 = var4.removeFirst();

        /* while (this.field38534 < field38532 && this.field38533.get(this.field38534).isEmpty()) {
            this.field38534++;
         }*/

         return var7.stream().map(var3x -> var3x.<Either<T, Runnable>>map(Either::left).orElseGet(() -> Either.right(this.method30628(var5))));
      }
   }

   @Override
   public String toString() {
      return this.field38535 + " " + this.field38534 + "...";
   }

   @VisibleForTesting
   public LongSet method30630() {
      return new LongOpenHashSet(this.field38536);
   }
}
