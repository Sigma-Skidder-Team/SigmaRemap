package mapped;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import net.minecraft.client.util.Util;

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

public class Class7721 {
   private final Map<UUID, Class8102> field33154 = Maps.newHashMap();

   public void method25521() {
      Iterator<Class8102> var3 = this.field33154.values().iterator();

      while (var3.hasNext()) {
         Class8102 var4 = var3.next();
         var4.method28062();
         if (var4.method28063()) {
            var3.remove();
         }
      }
   }

   private Stream<Class7539> method25522() {
      return this.field33154.entrySet().stream().<Class7539>flatMap(var0 -> var0.getValue().method28061(var0.getKey()));
   }

   private Collection<Class7539> method25523(Random var1, int var2) {
      List var5 = this.method25522().collect(Collectors.toList());
      if (var5.isEmpty()) {
         return Collections.<Class7539>emptyList();
      } else {
         int[] var6 = new int[var5.size()];
         int var7 = 0;

         for (int var8 = 0; var8 < var5.size(); var8++) {
            Class7539 var9 = (Class7539)var5.get(var8);
            var7 += Math.abs(var9.method24647());
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

   private Class8102 method25524(UUID var1) {
      return this.field33154.computeIfAbsent(var1, var0 -> new Class8102());
   }

   public void method25525(Class7721 var1, Random var2, int var3) {
      Collection<Class7539> var6 = var1.method25523(var2, var3);
      var6.forEach(var1x -> {
         int var4 = var1x.field32351 - var1x.field32350.field13515;
         if (var4 >= 2) {
            Class8102.method28069(this.method25524(var1x.field32349)).mergeInt(var1x.field32350, var4, Class7721::method25530);
         }
      });
   }

   public int method25526(UUID var1, Predicate<Class2074> var2) {
      Class8102 var5 = this.field33154.get(var1);
      return var5 == null ? 0 : var5.method28060(var2);
   }

   public void method25527(UUID var1, Class2074 var2, int var3) {
      Class8102 var6 = this.method25524(var1);
      Class8102.method28069(var6).mergeInt(var2, var3, (var2x, var3x) -> this.method25531(var2, var2x, var3x));
      var6.method28064(var2);
      if (var6.method28063()) {
         this.field33154.remove(var1);
      }
   }

   public <T> Dynamic<T> method25528(DynamicOps<T> var1) {
      return new Dynamic(var1, var1.createList(this.method25522().map(var1x -> var1x.method24648(var1)).map(Dynamic::getValue)));
   }

   public void method25529(Dynamic<?> var1) {
      var1.asStream()
         .<DataResult<Class7539>>map(Class7539::method24649)
         .<Class7539>flatMap(var0 -> Util.method38511(var0.result()))
         .forEach(var1x -> Class8102.method28069(this.method25524(var1x.field32349)).put(var1x.field32350, var1x.field32351));
   }

   private static int method25530(int var0, int var1) {
      return Math.max(var0, var1);
   }

   private int method25531(Class2074 var1, int var2, int var3) {
      int var6 = var2 + var3;
      return var6 <= var1.field13513 ? var6 : Math.max(var1.field13513, var2);
   }
}
