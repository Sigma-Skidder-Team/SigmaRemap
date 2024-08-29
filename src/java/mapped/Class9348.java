package mapped;

import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Decoder;
import com.mojang.serialization.Encoder;
import com.mojang.serialization.MapCodec;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class Class9348<O, S extends Class7378<O, S>> {
   private static final Pattern field43394 = Pattern.compile("^[a-z0-9_]+$");
   private final O field43395;
   private final ImmutableSortedMap<String, Class8550<?>> field43396;
   private final ImmutableList<S> field43397;

   public Class9348(Function<O, S> var1, O var2, Class6967<O, S> var3, Map<String, Class8550<?>> var4) {
      this.field43395 = (O)var2;
      this.field43396 = ImmutableSortedMap.copyOf(var4);
      Supplier<S> var7 = () -> var1.apply(var2);
      MapCodec<S> var8 = MapCodec.of(Encoder.empty(), Decoder.unit(var7));

       for (Entry<String, Class8550<?>> entry : this.field43396.entrySet()) {
           var8 = method35391(var8, var7, entry.getKey(), entry.getValue());
       }

      MapCodec<S>  var15 = var8;
      LinkedHashMap<Object, Object> var16 = Maps.newLinkedHashMap();
      List<S> var11 = Lists.newArrayList();
      Stream<List<Pair<Class8550<?>, Comparable<?>>>>var12 = Stream.of(Collections.emptyList());

       for (Class8550<?> var14 : this.field43396.values()) {
           var12 = var12.flatMap(var1x -> var14.method30474().stream().map(var2x -> {
               List<Pair<Class8550<?>, Comparable<?>>> var5 = Lists.newArrayList(var1x);
               var5.add(Pair.of(var14, var2x));
               return var5;
           }));
       }

      var12.forEach(var5 -> {
         ImmutableMap<Class8550<?>, Comparable<?>> var8x = var5.stream().collect(ImmutableMap.toImmutableMap(Pair::getFirst, Pair::getSecond));
         S var9x = var3.method21497(var2, var8x, var15);
         var16.put(var8x, var9x);
         var11.add(var9x);
      });

      for (Class7378 var18 : var11) {
         var18.method23466(var16);
      }

      this.field43397 = ImmutableList.copyOf(var11);
   }

   private static <S extends Class7378<?, S>, T extends Comparable<T>> MapCodec<S> method35391(
           MapCodec<S> p_241487_0_, Supplier<S> p_241487_1_, String p_241487_2_, Class8550<T> p_241487_3_) {
      return Codec.mapPair(p_241487_0_, p_241487_3_.method30471().fieldOf(p_241487_2_).setPartial(() -> {
         return p_241487_3_.method30469(p_241487_1_.get());
      })).xmap((p_241485_1_) -> {
         return p_241485_1_.getFirst().method23465(p_241487_3_, p_241485_1_.getSecond().method22835());
      }, (p_241484_1_) -> {
         return Pair.of(p_241484_1_, p_241487_3_.method30469(p_241484_1_));
      });
   }

   public ImmutableList<S> getValidStates() {
      return this.field43397;
   }

   public S method35393() {
      return (S)this.field43397.get(0);
   }

   public O method35394() {
      return this.field43395;
   }

   public Collection<Class8550<?>> method35395() {
      return this.field43396.values();
   }

   @Override
   public String toString() {
      return MoreObjects.toStringHelper(this)
         .add("block", this.field43395)
         .add("properties", this.field43396.values().stream().<String>map(Class8550::method30472).collect(Collectors.toList()))
         .toString();
   }

   @Nullable
   public Class8550<?> method35396(String var1) {
      return (Class8550<?>)this.field43396.get(var1);
   }

   // $VF: synthetic method
   public static Pattern method35404() {
      return field43394;
   }
}
