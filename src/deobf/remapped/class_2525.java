package remapped;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class class_2525 {
   private static String[] field_12523;
   private final Map<UUID, class_3619> field_12522 = Maps.newHashMap();

   public void method_11509() {
      Iterator var3 = this.field_12522.values().iterator();

      while (var3.hasNext()) {
         class_3619 var4 = (class_3619)var3.next();
         var4.method_16855();
         if (var4.method_16853()) {
            var3.remove();
         }
      }
   }

   private Stream<class_2147> method_11505() {
      return this.field_12522.entrySet().stream().<class_2147>flatMap(var0 -> var0.getValue().method_16858(var0.getKey()));
   }

   private Collection<class_2147> method_11513(Random var1, int var2) {
      List var5 = this.method_11505().collect(Collectors.toList());
      if (var5.isEmpty()) {
         return Collections.<class_2147>emptyList();
      } else {
         int[] var6 = new int[var5.size()];
         int var7 = 0;

         for (int var8 = 0; var8 < var5.size(); var8++) {
            class_2147 var9 = (class_2147)var5.get(var8);
            var7 += Math.abs(var9.method_10028());
            var6[var8] = var7 - 1;
         }

         Set var12 = Sets.newIdentityHashSet();

         for (int var13 = 0; var13 < var2; var13++) {
            int var10 = var1.nextInt(var7);
            int var11 = Arrays.binarySearch(var6, var10);
            var12.add(var5.get(var11 >= 0 ? var11 : -var11 - 1));
         }

         return var12;
      }
   }

   private class_3619 method_11507(UUID var1) {
      return this.field_12522.computeIfAbsent(var1, var0 -> new class_3619(null));
   }

   public void method_11508(class_2525 var1, Random var2, int var3) {
      Collection var6 = var1.method_11513(var2, var3);
      var6.forEach(var1x -> {
         int var4 = var1x.field_10744 - var1x.field_10746.field_27001;
         if (var4 >= 2) {
            class_3619.method_16857(this.method_11507(var1x.field_10745)).mergeInt(var1x.field_10746, var4, class_2525::method_11504);
         }
      });
   }

   public int method_11512(UUID var1, Predicate<class_5279> var2) {
      class_3619 var5 = this.field_12522.get(var1);
      return var5 == null ? 0 : var5.method_16860(var2);
   }

   public void method_11514(UUID var1, class_5279 var2, int var3) {
      class_3619 var6 = this.method_11507(var1);
      class_3619.method_16857(var6).mergeInt(var2, var3, (var2x, var3x) -> this.method_11511(var2, var2x, var3x));
      var6.method_16854(var2);
      if (var6.method_16853()) {
         this.field_12522.remove(var1);
      }
   }

   public <T> Dynamic<T> method_11515(DynamicOps<T> var1) {
      return new Dynamic(var1, var1.createList(this.method_11505().<Dynamic>map(var1x -> var1x.method_10026(var1)).map(Dynamic::getValue)));
   }

   public void method_11506(Dynamic<?> var1) {
      var1.asStream()
         .<DataResult<class_2147>>map(class_2147::method_10027)
         .<class_2147>flatMap(var0 -> Util.method_44689(var0.result()))
         .forEach(var1x -> class_3619.method_16857(this.method_11507(var1x.field_10745)).put(var1x.field_10746, var1x.field_10744));
   }

   private static int method_11504(int var0, int var1) {
      return Math.max(var0, var1);
   }

   private int method_11511(class_5279 var1, int var2, int var3) {
      int var6 = var2 + var3;
      return var6 <= var1.field_26996 ? var6 : Math.max(var1.field_26996, var2);
   }
}
