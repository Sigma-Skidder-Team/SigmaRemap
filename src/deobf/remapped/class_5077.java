package remapped;

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

public class class_5077<T> {
   public static final int field_26218 = class_916.field_4710 + 2 + 32;
   private final List<Long2ObjectLinkedOpenHashMap<List<Optional<T>>>> field_26223 = IntStream.range(0, field_26218)
      .<Long2ObjectLinkedOpenHashMap>mapToObj(var0 -> new Long2ObjectLinkedOpenHashMap())
      .collect(Collectors.<Long2ObjectLinkedOpenHashMap<List<Optional<T>>>>toList());
   private volatile int field_26220 = field_26218;
   private final String field_26222;
   private final LongSet field_26217 = new LongOpenHashSet();
   private final int field_26221;

   public class_5077(String var1, int var2) {
      this.field_26222 = var1;
      this.field_26221 = var2;
   }

   public void method_23354(int var1, class_2034 var2, int var3) {
      if (var1 < field_26218) {
         Long2ObjectLinkedOpenHashMap var6 = this.field_26223.get(var1);
         List var7 = (List)var6.remove(var2.method_9539());
         if (var1 == this.field_26220) {
            while (this.field_26220 < field_26218 && this.field_26223.get(this.field_26220).isEmpty()) {
               this.field_26220++;
            }
         }

         if (var7 != null && !var7.isEmpty()) {
            ((List)this.field_26223.get(var3).computeIfAbsent(var2.method_9539(), var0 -> Lists.newArrayList())).addAll(var7);
            this.field_26220 = Math.min(this.field_26220, var3);
         }
      }
   }

   public void method_23353(Optional<T> var1, long var2, int var4) {
      ((List)this.field_26223.get(var4).computeIfAbsent(var2, var0 -> Lists.newArrayList())).add(var1);
      this.field_26220 = Math.min(this.field_26220, var4);
   }

   public void method_23349(long var1, boolean var3) {
      for (Long2ObjectLinkedOpenHashMap var7 : this.field_26223) {
         List var8 = (List)var7.get(var1);
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

      while (this.field_26220 < field_26218 && this.field_26223.get(this.field_26220).isEmpty()) {
         this.field_26220++;
      }

      this.field_26217.remove(var1);
   }

   private Runnable method_23350(long var1) {
      return () -> this.field_26217.add(var1);
   }

   @Nullable
   public Stream<Either<T, Runnable>> method_23351() {
      if (this.field_26217.size() >= this.field_26221) {
         return null;
      } else if (this.field_26220 >= field_26218) {
         return null;
      } else {
         int var3 = this.field_26220;
         Long2ObjectLinkedOpenHashMap var4 = this.field_26223.get(var3);
         long var5 = var4.firstLongKey();
         List var7 = (List)var4.removeFirst();

         while (this.field_26220 < field_26218 && this.field_26223.get(this.field_26220).isEmpty()) {
            this.field_26220++;
         }

         return var7.stream().<Either<T, Runnable>>map(var3x -> var3x.map(Either::left).orElseGet(() -> Either.right(this.method_23350(var5))));
      }
   }

   @Override
   public String toString() {
      return this.field_26222 + " " + this.field_26220 + "...";
   }

   @VisibleForTesting
   public LongSet method_23352() {
      return new LongOpenHashSet(this.field_26217);
   }
}
