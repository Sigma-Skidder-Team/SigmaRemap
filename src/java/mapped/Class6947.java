package mapped;

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

public class Class6947<E extends Class880> {
   private static final Logger field30098 = LogManager.getLogger();
   private final Supplier<Codec<Class6947<E>>> field30099;
   private final Map<Class8830<?>, Optional<? extends Class8222<?>>> field30100 = Maps.newHashMap();
   private final Map<Class7963<? extends Class7882<? super E>>, Class7882<? super E>> field30101 = Maps.newLinkedHashMap();
   private final Map<Integer, Map<Class8890, Set<Class3676<? super E>>>> field30102 = Maps.newTreeMap();
   private Class8234 field30103 = Class8234.field35349;
   private final Map<Class8890, Set<Pair<Class8830<?>, Class2217>>> field30104 = Maps.newHashMap();
   private final Map<Class8890, Set<Class8830<?>>> field30105 = Maps.newHashMap();
   private Set<Class8890> field30106 = Sets.newHashSet();
   private final Set<Class8890> field30107 = Sets.newHashSet();
   private Class8890 field30108 = Class8890.field40220;
   private long field30109 = -9999L;

   public static <E extends Class880> Class6971<E> method21400(
      Collection<? extends Class8830<?>> var0, Collection<? extends Class7963<? extends Class7882<? super E>>> var1
   ) {
      return new Class6971<E>(var0, var1, null);
   }

   public static <E extends Class880> Codec<Class6947<E>> method21401(
      Collection<? extends Class8830<?>> var0, Collection<? extends Class7963<? extends Class7882<? super E>>> var1
   ) {
      MutableObject var4 = new MutableObject();
      var4.setValue(new Class9490(var0, var1, var4).fieldOf("memories").codec());
      return (Codec<Class6947<E>>)var4.getValue();
   }

   public Class6947(
      Collection<? extends Class8830<?>> var1,
      Collection<? extends Class7963<? extends Class7882<? super E>>> var2,
      ImmutableList<Class9802<?>> var3,
      Supplier<Codec<Class6947<E>>> var4
   ) {
      this.field30099 = var4;

      for (Class8830 var8 : var1) {
         this.field30100.put(var8, Optional.empty());
      }

      for (Class7963 var14 : var2) {
         this.field30101.put(var14, var14.method27086());
      }

      for (Class7882 var15 : this.field30101.values()) {
         for (Object var10 : var15.method26424()) {
            this.field30100.put((Class8830<?>) var10, Optional.empty());
         }
      }

      UnmodifiableIterator var13 = var3.iterator();

      while (var13.hasNext()) {
         Class9802 var16 = (Class9802)var13.next();
         Class9802.method38650(var16, this);
      }
   }

   public <T> DataResult<T> method21402(DynamicOps<T> var1) {
      return this.field30099.get().encodeStart(var1, this);
   }

   private Stream<Class9802<?>> method21403() {
      return this.field30100.entrySet().stream().<Class9802<?>>map(var0 -> Class9802.method38651(var0.getKey(), var0.getValue()));
   }

   public boolean method21404(Class8830<?> var1) {
      return this.method21412(var1, Class2217.field14484);
   }

   public <U> void method21405(Class8830<U> var1) {
      this.method21408(var1, Optional.empty());
   }

   public <U> void method21406(Class8830<U> var1, U var2) {
      this.method21408(var1, Optional.ofNullable(var2));
   }

   public <U> void method21407(Class8830<U> var1, U var2, long var3) {
      this.method21409(var1, Optional.of(Class8222.<Object>method28603(var2, var3)));
   }

   public <U> void method21408(Class8830<U> var1, Optional<? extends U> var2) {
      this.method21409(var1, var2.map(Class8222::method28602));
   }

   private <U> void method21409(Class8830<U> var1, Optional<? extends Class8222<?>> var2) {
      if (this.field30100.containsKey(var1)) {
         if (var2.isPresent() && this.method21439(((Class8222)var2.get()).method28604())) {
            this.method21405(var1);
         } else {
            this.field30100.put(var1, var2);
         }
      }
   }

   public <U> Optional<U> method21410(Class8830<U> class8830) {
      return (Optional<U>) this.field30100.get(class8830).map(Class8222::method28604);
   }
   public <U> boolean method21411(Class8830<U> class8830, U u) {
      return this.method21404(class8830) ? this.method21410(class8830).filter(object2 -> object2.equals(u)).isPresent() : false;
   }

   public boolean method21412(Class8830<?> var1, Class2217 var2) {
      Optional var5 = this.field30100.get(var1);
      return var5 == null
         ? false
         : var2 == Class2217.field14486 || var2 == Class2217.field14484 && var5.isPresent() || var2 == Class2217.field14485 && !var5.isPresent();
   }

   public Class8234 method21413() {
      return this.field30103;
   }

   public void method21414(Class8234 var1) {
      this.field30103 = var1;
   }

   public void method21415(Set<Class8890> var1) {
      this.field30106 = var1;
   }

   @Deprecated
   public List<Class3676<? super E>> method21416() {
      ObjectArrayList var3 = new ObjectArrayList();

      for (Map<Class8890, Set<Class3676<? super E>>> var5 : this.field30102.values()) {
         for (Set<Class3676<? super E>> var7 : var5.values()) {
            for (Class3676<? super E> var9 : var7) {
               if (var9.method12500() == Class2092.field13633) {
                  var3.add(var9);
               }
            }
         }
      }

      return var3;
   }

   public void method21417() {
      this.method21420(this.field30108);
   }

   public Optional<Class8890> method21418() {
      for (Class8890 var4 : this.field30107) {
         if (!this.field30106.contains(var4)) {
            return Optional.<Class8890>of(var4);
         }
      }

      return Optional.<Class8890>empty();
   }

   public void method21419(Class8890 var1) {
      if (!this.method21438(var1)) {
         this.method21417();
      } else {
         this.method21420(var1);
      }
   }

   private void method21420(Class8890 var1) {
      if (!this.method21430(var1)) {
         this.method21421(var1);
         this.field30107.clear();
         this.field30107.addAll(this.field30106);
         this.field30107.add(var1);
      }
   }

   private void method21421(Class8890 var1) {
      for (Class8890 var5 : this.field30107) {
         if (var5 != var1) {
            Set<Class8830<?>> var6 = this.field30105.get(var5);
            if (var6 != null) {
               for (Class8830 var8 : var6) {
                  this.method21405(var8);
               }
            }
         }
      }
   }

   public void method21422(long var1, long var3) {
      if (var3 - this.field30109 > 20L) {
         this.field30109 = var3;
         Class8890 var7 = this.method21413().method28663((int)(var1 % 24000L));
         if (!this.field30107.contains(var7)) {
            this.method21419(var7);
         }
      }
   }

   public void method21423(List<Class8890> var1) {
      for (Class8890 var5 : var1) {
         if (this.method21438(var5)) {
            this.method21420(var5);
            break;
         }
      }
   }

   public void method21424(Class8890 var1) {
      this.field30108 = var1;
   }

   public void method21425(Class8890 var1, int var2, ImmutableList<? extends Class3676<? super E>> var3) {
      this.method21427(var1, this.method21440(var2, var3));
   }

   public void method21426(Class8890 var1, int var2, ImmutableList<? extends Class3676<? super E>> var3, Class8830<?> var4) {
      ImmutableSet<Pair<Class8830<?>, Class2217>> var7 = ImmutableSet.of(Pair.of(var4, Class2217.field14484));
      ImmutableSet<Class8830<?>> var8 = ImmutableSet.of(var4);
      this.method21429(var1, this.method21440(var2, var3), var7, var8);
   }

   public void method21427(Class8890 var1, ImmutableList<? extends Pair<Integer, ? extends Class3676<? super E>>> var2) {
      this.method21429(var1, var2, ImmutableSet.of(), Sets.newHashSet());
   }

   public void method21428(Class8890 var1, ImmutableList<? extends Pair<Integer, ? extends Class3676<? super E>>> var2, Set<Pair<Class8830<?>, Class2217>> var3) {
      this.method21429(var1, var2, var3, Sets.newHashSet());
   }

   private void method21429(
      Class8890 var1,
      ImmutableList<? extends Pair<Integer, ? extends Class3676<? super E>>> var2,
      Set<Pair<Class8830<?>, Class2217>> var3,
      Set<Class8830<?>> var4
   ) {
      this.field30104.put(var1, var3);
      if (!var4.isEmpty()) {
         this.field30105.put(var1, var4);
      }

      UnmodifiableIterator var7 = var2.iterator();

      while (var7.hasNext()) {
         Pair var8 = (Pair)var7.next();
         this.field30102
            .computeIfAbsent((Integer)var8.getFirst(), var0 -> Maps.newHashMap())
            .computeIfAbsent(var1, var0 -> Sets.newLinkedHashSet())
            .add((Class3676<? super E>)var8.getSecond());
      }
   }

   public boolean method21430(Class8890 var1) {
      return this.field30107.contains(var1);
   }

   public Class6947<E> method21431() {
      Class6947 var3 = new Class6947<E>(this.field30100.keySet(), this.field30101.keySet(), ImmutableList.of(), this.field30099);

      for (Entry var5 : this.field30100.entrySet()) {
         Class8830 var6 = (Class8830)var5.getKey();
         if (((Optional)var5.getValue()).isPresent()) {
            var3.field30100.put(var6, (Optional<? extends Class8222<?>>)var5.getValue());
         }
      }

      return var3;
   }

   public void method21432(Class1657 var1, E var2) {
      this.method21434();
      this.method21433(var1, (E)var2);
      this.method21436(var1, (E)var2);
      this.method21437(var1, (E)var2);
   }

   private void method21433(Class1657 var1, E var2) {
      for (Class7882 var6 : this.field30101.values()) {
         var6.method26429(var1, var2);
      }
   }

   private void method21434() {
      for (Entry var4 : this.field30100.entrySet()) {
         if (((Optional)var4.getValue()).isPresent()) {
            Class8222 var5 = (Class8222)((Optional)var4.getValue()).get();
            var5.method28601();
            if (var5.method28605()) {
               this.method21405((Class8830)var4.getKey());
            }
         }
      }
   }

   public void method21435(Class1657 var1, E var2) {
      long var5 = var2.field5024.method6783();

      for (Class3676 var8 : this.method21416()) {
         var8.method12505(var1, var2, var5);
      }
   }

   private void method21436(Class1657 var1, E var2) {
      long var5 = var1.method6783();

      for (Map<Class8890, Set<Class3676<? super E>>> var8 : this.field30102.values()) {
         for (Entry<Class8890, Set<Class3676<? super E>>> var10 : var8.entrySet()) {
            Class8890 var11 = var10.getKey();
            if (this.field30107.contains(var11)) {
               for (Class3676<? super E> var13 : var10.getValue()) {
                  if (var13.method12500() == Class2092.field13632) {
                     var13.method12501(var1, var2, var5);
                  }
               }
            }
         }
      }
   }

   private void method21437(Class1657 var1, E var2) {
      long var5 = var1.method6783();

      for (Class3676 var8 : this.method21416()) {
         var8.method12503(var1, var2, var5);
      }
   }

   private boolean method21438(Class8890 var1) {
      if (!this.field30104.containsKey(var1)) {
         return false;
      } else {
         for (Pair var5 : this.field30104.get(var1)) {
            Class8830 var6 = (Class8830)var5.getFirst();
            Class2217 var7 = (Class2217)var5.getSecond();
            if (!this.method21412(var6, var7)) {
               return false;
            }
         }

         return true;
      }
   }

   private boolean method21439(Object var1) {
      return var1 instanceof Collection && ((Collection)var1).isEmpty();
   }

   public ImmutableList<? extends Pair<Integer, ? extends Class3676<? super E>>> method21440(int var1, ImmutableList<? extends Class3676<? super E>> var2) {
      int var5 = var1;
      Builder var6 = ImmutableList.builder();
      UnmodifiableIterator var7 = var2.iterator();

      while (var7.hasNext()) {
         Class3676 var8 = (Class3676)var7.next();
         var6.add(Pair.of(var5++, var8));
      }

      return var6.build();
   }

   // $VF: synthetic method
   public static Logger method21445() {
      return field30098;
   }

   // $VF: synthetic method
   public static Stream<Class9802<?>> method21446(Class6947 var0) {
      return var0.method21403();
   }

   // $VF: synthetic method
   public static void method21447(Class6947 var0, Class8830 var1, Optional var2) {
      var0.method21409(var1, var2);
   }
}
