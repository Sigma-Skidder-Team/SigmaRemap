package remapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Supplier;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_1150<E extends class_5834> {
   private static final Logger field_6550 = LogManager.getLogger();
   private final Supplier<Codec<class_1150<E>>> field_6548;
   private final Map<class_6044<?>, Optional<? extends class_3909<?>>> field_6546 = Maps.newHashMap();
   private final Map<class_3172<? extends class_6127<? super E>>, class_6127<? super E>> field_6543 = Maps.newLinkedHashMap();
   private final Map<Integer, Map<class_6275, Set<class_5920<? super E>>>> field_6541 = Maps.newTreeMap();
   private class_3975 field_6545 = class_3975.field_19363;
   private final Map<class_6275, Set<Pair<class_6044<?>, class_561>>> field_6544 = Maps.newHashMap();
   private final Map<class_6275, Set<class_6044<?>>> field_6547 = Maps.newHashMap();
   private Set<class_6275> field_6549 = Sets.newHashSet();
   private final Set<class_6275> field_6538 = Sets.newHashSet();
   private class_6275 field_6539 = class_6275.field_32075;
   private long field_6540 = -9999L;

   public static <E extends class_5834> class_1193<E> method_5128(
      Collection<? extends class_6044<?>> var0, Collection<? extends class_3172<? extends class_6127<? super E>>> var1
   ) {
      return new class_1193<E>(var0, var1, null);
   }

   public static <E extends class_5834> Codec<class_1150<E>> method_5120(
      Collection<? extends class_6044<?>> var0, Collection<? extends class_3172<? extends class_6127<? super E>>> var1
   ) {
      MutableObject var4 = new MutableObject();
      var4.setValue(new class_8589(var0, var1, var4).fieldOf("memories").codec());
      return (Codec<class_1150<E>>)var4.getValue();
   }

   public class_1150(
      Collection<? extends class_6044<?>> var1,
      Collection<? extends class_3172<? extends class_6127<? super E>>> var2,
      ImmutableList<class_9739<?>> var3,
      Supplier<Codec<class_1150<E>>> var4
   ) {
      this.field_6548 = var4;

      for (class_6044 var8 : var1) {
         this.field_6546.put(var8, Optional.empty());
      }

      for (class_3172 var14 : var2) {
         this.field_6543.put(var14, var14.method_14624());
      }

      for (class_6127 var15 : this.field_6543.values()) {
         for (class_6044 var10 : var15.method_28152()) {
            this.field_6546.put(var10, Optional.empty());
         }
      }

      UnmodifiableIterator var13 = var3.iterator();

      while (var13.hasNext()) {
         class_9739 var16 = (class_9739)var13.next();
         class_9739.method_44971(var16, this);
      }
   }

   public <T> DataResult<T> method_5131(DynamicOps<T> var1) {
      return this.field_6548.get().encodeStart(var1, this);
   }

   private Stream<class_9739<?>> method_5109() {
      return this.field_6546.entrySet().stream().<class_9739<?>>map(var0 -> class_9739.method_44973(var0.getKey(), var0.getValue()));
   }

   public boolean method_5117(class_6044<?> var1) {
      return this.method_5118(var1, class_561.field_3320);
   }

   public <U> void method_5127(class_6044<U> var1) {
      this.method_5106(var1, Optional.empty());
   }

   public <U> void method_5105(class_6044<U> var1, U var2) {
      this.method_5106(var1, Optional.ofNullable(var2));
   }

   public <U> void method_5107(class_6044<U> var1, U var2, long var3) {
      this.method_5136(var1, Optional.of(class_3909.<Object>method_18099(var2, var3)));
   }

   public <U> void method_5106(class_6044<U> var1, Optional<? extends U> var2) {
      this.method_5136(var1, var2.map(class_3909::method_18102));
   }

   private <U> void method_5136(class_6044<U> var1, Optional<? extends class_3909<?>> var2) {
      if (this.field_6546.containsKey(var1)) {
         if (var2.isPresent() && this.method_5133(((class_3909)var2.get()).method_18098())) {
            this.method_5127(var1);
         } else {
            this.field_6546.put(var1, var2);
         }
      }
   }

   public <U> Optional<U> method_5138(class_6044<U> var1) {
      return this.field_6546.get(var1).<U>map(class_3909::method_18098);
   }

   public <U> boolean method_5140(class_6044<U> var1, U var2) {
      return this.method_5117(var1) ? this.<Object>method_5138(var1).filter(var1x -> var1x.equals(var2)).isPresent() : false;
   }

   public boolean method_5118(class_6044<?> var1, class_561 var2) {
      Optional var5 = this.field_6546.get(var1);
      return var5 == null
         ? false
         : var2 == class_561.field_3319 || var2 == class_561.field_3320 && var5.isPresent() || var2 == class_561.field_3318 && !var5.isPresent();
   }

   public class_3975 method_5122() {
      return this.field_6545;
   }

   public void method_5129(class_3975 var1) {
      this.field_6545 = var1;
   }

   public void method_5114(Set<class_6275> var1) {
      this.field_6549 = var1;
   }

   @Deprecated
   public List<class_5920<? super E>> method_5139() {
      ObjectArrayList var3 = new ObjectArrayList();

      for (Map var5 : this.field_6541.values()) {
         for (Set var7 : var5.values()) {
            for (class_5920 var9 : var7) {
               if (var9.method_27087() == class_1494.field_7948) {
                  var3.add(var9);
               }
            }
         }
      }

      return var3;
   }

   public void method_5103() {
      this.method_5119(this.field_6539);
   }

   public Optional<class_6275> method_5126() {
      for (class_6275 var4 : this.field_6538) {
         if (!this.field_6549.contains(var4)) {
            return Optional.<class_6275>of(var4);
         }
      }

      return Optional.<class_6275>empty();
   }

   public void method_5113(class_6275 var1) {
      if (!this.method_5137(var1)) {
         this.method_5103();
      } else {
         this.method_5119(var1);
      }
   }

   private void method_5119(class_6275 var1) {
      if (!this.method_5134(var1)) {
         this.method_5099(var1);
         this.field_6538.clear();
         this.field_6538.addAll(this.field_6549);
         this.field_6538.add(var1);
      }
   }

   private void method_5099(class_6275 var1) {
      for (class_6275 var5 : this.field_6538) {
         if (var5 != var1) {
            Set var6 = this.field_6547.get(var5);
            if (var6 != null) {
               for (class_6044 var8 : var6) {
                  this.method_5127(var8);
               }
            }
         }
      }
   }

   public void method_5132(long var1, long var3) {
      if (var3 - this.field_6540 > 20L) {
         this.field_6540 = var3;
         class_6275 var7 = this.method_5122().method_18353((int)(var1 % 24000L));
         if (!this.field_6538.contains(var7)) {
            this.method_5113(var7);
         }
      }
   }

   public void method_5110(List<class_6275> var1) {
      for (class_6275 var5 : var1) {
         if (this.method_5137(var5)) {
            this.method_5119(var5);
            break;
         }
      }
   }

   public void method_5130(class_6275 var1) {
      this.field_6539 = var1;
   }

   public void method_5124(class_6275 var1, int var2, ImmutableList<? extends class_5920<? super E>> var3) {
      this.method_5111(var1, this.method_5142(var2, var3));
   }

   public void method_5116(class_6275 var1, int var2, ImmutableList<? extends class_5920<? super E>> var3, class_6044<?> var4) {
      ImmutableSet var7 = ImmutableSet.of(Pair.of(var4, class_561.field_3320));
      ImmutableSet var8 = ImmutableSet.of(var4);
      this.method_5104(var1, this.method_5142(var2, var3), var7, var8);
   }

   public void method_5111(class_6275 var1, ImmutableList<? extends Pair<Integer, ? extends class_5920<? super E>>> var2) {
      this.method_5104(var1, var2, ImmutableSet.of(), Sets.newHashSet());
   }

   public void method_5102(
      class_6275 var1, ImmutableList<? extends Pair<Integer, ? extends class_5920<? super E>>> var2, Set<Pair<class_6044<?>, class_561>> var3
   ) {
      this.method_5104(var1, var2, var3, Sets.newHashSet());
   }

   private void method_5104(
      class_6275 var1,
      ImmutableList<? extends Pair<Integer, ? extends class_5920<? super E>>> var2,
      Set<Pair<class_6044<?>, class_561>> var3,
      Set<class_6044<?>> var4
   ) {
      this.field_6544.put(var1, var3);
      if (!var4.isEmpty()) {
         this.field_6547.put(var1, var4);
      }

      UnmodifiableIterator var7 = var2.iterator();

      while (var7.hasNext()) {
         Pair var8 = (Pair)var7.next();
         this.field_6541
            .computeIfAbsent((Integer)var8.getFirst(), var0 -> Maps.newHashMap())
            .computeIfAbsent(var1, var0 -> Sets.newLinkedHashSet())
            .add((class_5920<? super E>)var8.getSecond());
      }
   }

   public boolean method_5134(class_6275 var1) {
      return this.field_6538.contains(var1);
   }

   public class_1150<E> method_5115() {
      class_1150 var3 = new class_1150<E>(this.field_6546.keySet(), this.field_6543.keySet(), ImmutableList.of(), this.field_6548);

      for (Entry var5 : this.field_6546.entrySet()) {
         class_6044 var6 = (class_6044)var5.getKey();
         if (((Optional)var5.getValue()).isPresent()) {
            var3.field_6546.put(var6, (Optional<? extends class_3909<?>>)var5.getValue());
         }
      }

      return var3;
   }

   public void method_5141(class_6331 var1, E var2) {
      this.method_5108();
      this.method_5123(var1, (E)var2);
      this.method_5135(var1, (E)var2);
      this.method_5121(var1, (E)var2);
   }

   private void method_5123(class_6331 var1, E var2) {
      for (class_6127 var6 : this.field_6543.values()) {
         var6.method_28151(var1, var2);
      }
   }

   private void method_5108() {
      for (Entry var4 : this.field_6546.entrySet()) {
         if (((Optional)var4.getValue()).isPresent()) {
            class_3909 var5 = (class_3909)((Optional)var4.getValue()).get();
            var5.method_18104();
            if (var5.method_18100()) {
               this.method_5127((class_6044)var4.getKey());
            }
         }
      }
   }

   public void method_5100(class_6331 var1, E var2) {
      long var5 = var2.field_41768.method_29546();

      for (class_5920 var8 : this.method_5139()) {
         var8.method_27079(var1, var2, var5);
      }
   }

   private void method_5135(class_6331 var1, E var2) {
      long var5 = var1.method_29546();

      for (Map var8 : this.field_6541.values()) {
         for (Entry var10 : var8.entrySet()) {
            class_6275 var11 = (class_6275)var10.getKey();
            if (this.field_6538.contains(var11)) {
               for (class_5920 var13 : (Set)var10.getValue()) {
                  if (var13.method_27087() == class_1494.field_7949) {
                     var13.method_27083(var1, var2, var5);
                  }
               }
            }
         }
      }
   }

   private void method_5121(class_6331 var1, E var2) {
      long var5 = var1.method_29546();

      for (class_5920 var8 : this.method_5139()) {
         var8.method_27082(var1, var2, var5);
      }
   }

   private boolean method_5137(class_6275 var1) {
      if (!this.field_6544.containsKey(var1)) {
         return false;
      } else {
         for (Pair var5 : this.field_6544.get(var1)) {
            class_6044 var6 = (class_6044)var5.getFirst();
            class_561 var7 = (class_561)var5.getSecond();
            if (!this.method_5118(var6, var7)) {
               return false;
            }
         }

         return true;
      }
   }

   private boolean method_5133(Object var1) {
      return var1 instanceof Collection && ((Collection)var1).isEmpty();
   }

   public ImmutableList<? extends Pair<Integer, ? extends class_5920<? super E>>> method_5142(int var1, ImmutableList<? extends class_5920<? super E>> var2) {
      int var5 = var1;
      Builder var6 = ImmutableList.builder();
      UnmodifiableIterator var7 = var2.iterator();

      while (var7.hasNext()) {
         class_5920 var8 = (class_5920)var7.next();
         var6.add(Pair.of(var5++, var8));
      }

      return var6.build();
   }
}
