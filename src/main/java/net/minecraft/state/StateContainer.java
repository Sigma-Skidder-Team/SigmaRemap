package net.minecraft.state;

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
import mapped.Class6967;

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

public class StateContainer<O, S extends StateHolder<O, S>> {
   private static final Pattern field43394 = Pattern.compile("^[a-z0-9_]+$");
   private final O field43395;
   private final ImmutableSortedMap<String, Property<?>> field43396;
   private final ImmutableList<S> field43397;

   public StateContainer(Function<O, S> var1, O var2, Class6967<O, S> var3, Map<String, Property<?>> var4) {
      this.field43395 = (O)var2;
      this.field43396 = ImmutableSortedMap.copyOf(var4);
      Supplier<S> var7 = () -> var1.apply(var2);
      MapCodec<S> var8 = MapCodec.of(Encoder.empty(), Decoder.unit(var7));

       for (Entry<String, Property<?>> entry : this.field43396.entrySet()) {
           var8 = method35391(var8, var7, entry.getKey(), entry.getValue());
       }

      MapCodec<S>  var15 = var8;
      LinkedHashMap<Object, Object> var16 = Maps.newLinkedHashMap();
      List<S> var11 = Lists.newArrayList();
      Stream<List<Pair<Property<?>, Comparable<?>>>>var12 = Stream.of(Collections.emptyList());

       for (Property<?> var14 : this.field43396.values()) {
           var12 = var12.flatMap(var1x -> var14.method30474().stream().map(var2x -> {
               List<Pair<Property<?>, Comparable<?>>> var5 = Lists.newArrayList(var1x);
               var5.add(Pair.of(var14, var2x));
               return var5;
           }));
       }

      var12.forEach(var5 -> {
         ImmutableMap<Property<?>, Comparable<?>> var8x = var5.stream().collect(ImmutableMap.toImmutableMap(Pair::getFirst, Pair::getSecond));
         S var9x = var3.method21497(var2, var8x, var15);
         var16.put(var8x, var9x);
         var11.add(var9x);
      });

      for (StateHolder var18 : var11) {
         var18.method23466(var16);
      }

      this.field43397 = ImmutableList.copyOf(var11);
   }

   private static <S extends StateHolder<?, S>, T extends Comparable<T>> MapCodec<S> method35391(
           MapCodec<S> p_241487_0_, Supplier<S> p_241487_1_, String p_241487_2_, Property<T> p_241487_3_) {
      return Codec.mapPair(p_241487_0_, p_241487_3_.method30471().fieldOf(p_241487_2_).setPartial(() -> {
         return p_241487_3_.method30469(p_241487_1_.get());
      })).xmap((p_241485_1_) -> {
         return p_241485_1_.getFirst().with(p_241487_3_, p_241485_1_.getSecond().method22835());
      }, (p_241484_1_) -> {
         return Pair.of(p_241484_1_, p_241487_3_.method30469(p_241484_1_));
      });
   }

   public ImmutableList<S> getValidStates() {
      return this.field43397;
   }

   public S getBaseState() {
      return (S)this.field43397.get(0);
   }

   public O method35394() {
      return this.field43395;
   }

   public Collection<Property<?>> method35395() {
      return this.field43396.values();
   }

   @Override
   public String toString() {
      return MoreObjects.toStringHelper(this)
         .add("block", this.field43395)
         .add("properties", this.field43396.values().stream().<String>map(Property::getName).collect(Collectors.toList()))
         .toString();
   }

   @Nullable
   public Property<?> getProperty(String var1) {
      return (Property<?>)this.field43396.get(var1);
   }

   // $VF: synthetic method
   public static Pattern method35404() {
      return field43394;
   }

   public static class Builder<O, S extends StateHolder<O, S>> {
      private final O field32410;
      private final Map<String, Property<?>> field32411 = Maps.newHashMap();

      public Builder(O var1) {
         this.field32410 = (O)var1;
      }

      public Builder<O, S> add(Property<?>... var1) {
         for (Property var7 : var1) {
            this.method24738(var7);
            this.field32411.put(var7.getName(), var7);
         }

         return this;
      }

      private <T extends Comparable<T>> void method24738(Property<T> var1) {
         String var4 = var1.getName();
         if (!method35404().matcher(var4).matches()) {
            throw new IllegalArgumentException(this.field32410 + " has invalidly named property: " + var4);
         } else {
            Collection<T> var5 = var1.method30474();
            if (var5.size() <= 1) {
               throw new IllegalArgumentException(this.field32410 + " attempted use property " + var4 + " with <= 1 possible values");
            } else {
               for (Comparable var7 : var5) {
                  String var8 = var1.getName((T)var7);
                  if (!method35404().matcher(var8).matches()) {
                     throw new IllegalArgumentException(this.field32410 + " has property: " + var4 + " with invalidly named value: " + var8);
                  }
               }

               if (this.field32411.containsKey(var4)) {
                  throw new IllegalArgumentException(this.field32410 + " has duplicate property: " + var4);
               }
            }
         }
      }

      public StateContainer<O, S> method24739(Function<O, S> var1, Class6967<O, S> var2) {
         return new StateContainer<O, S>(var1, this.field32410, var2, this.field32411);
      }
   }
}
