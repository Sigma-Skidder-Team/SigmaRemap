package remapped;

import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Decoder;
import com.mojang.serialization.Encoder;
import com.mojang.serialization.MapCodec;
import java.util.ArrayList;
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

public class class_8021<O, S extends class_2243<O, S>> {
   private static final Pattern field_41073 = Pattern.compile("^[a-z0-9_]+$");
   private final O field_41069;
   private final ImmutableSortedMap<String, class_5019<?>> field_41070;
   private final ImmutableList<S> field_41071;

   public class_8021(Function<O, S> var1, O var2, class_1177<O, S> var3, Map<String, class_5019<?>> var4) {
      this.field_41069 = (O)var2;
      this.field_41070 = ImmutableSortedMap.copyOf(var4);
      Supplier var7 = () -> (class_2243)var1.apply(var2);
      MapCodec var8 = MapCodec.of(Encoder.empty(), Decoder.unit(var7));
      UnmodifiableIterator var9 = this.field_41070.entrySet().iterator();

      while (var9.hasNext()) {
         Entry var10 = (Entry)var9.next();
         var8 = method_36445(var8, var7, (String)var10.getKey(), (class_5019)var10.getValue());
      }

      MapCodec var15 = var8;
      LinkedHashMap var16 = Maps.newLinkedHashMap();
      ArrayList var11 = Lists.newArrayList();
      Stream var12 = Stream.<List>of(Collections.emptyList());
      UnmodifiableIterator var13 = this.field_41070.values().iterator();

      while (var13.hasNext()) {
         class_5019 var14 = (class_5019)var13.next();
         var12 = var12.<List>flatMap(var1x -> var14.method_23105().stream().map(var2x -> {
               ArrayList var5 = Lists.newArrayList(var1x);
               var5.add(Pair.of(var14, var2x));
               return var5;
            }));
      }

      var12.forEach(var5 -> {
         ImmutableMap var8x = var5.stream().collect(ImmutableMap.toImmutableMap(Pair::getFirst, Pair::getSecond));
         class_2243 var9x = (class_2243)var3.method_5216(var2, var8x, var15);
         var16.put(var8x, var9x);
         var11.add(var9x);
      });

      for (class_2243 var18 : var11) {
         var18.method_10315(var16);
      }

      this.field_41071 = ImmutableList.copyOf(var11);
   }

   private static <S extends class_2243<?, S>, T extends Comparable<T>> MapCodec<S> method_36445(
      MapCodec<S> var0, Supplier<S> var1, String var2, class_5019<T> var3
   ) {
      return Codec.mapPair(var0, var3.method_23111().fieldOf(var2).setPartial(() -> var3.method_23107((class_2243<?, ?>)var1.get())))
         .xmap(
            var1x -> (class_2243)((class_2243)var1x.getFirst()).method_10308(var3, ((class_1632)var1x.getSecond()).method_7263()),
            var1x -> Pair.of(var1x, var3.method_23107(var1x))
         );
   }

   public ImmutableList<S> method_36441() {
      return this.field_41071;
   }

   public S method_36446() {
      return (S)this.field_41071.get(0);
   }

   public O method_36442() {
      return this.field_41069;
   }

   public Collection<class_5019<?>> method_36444() {
      return this.field_41070.values();
   }

   @Override
   public String toString() {
      return MoreObjects.toStringHelper(this)
         .add("block", this.field_41069)
         .add("properties", this.field_41070.values().stream().<String>map(class_5019::method_23109).collect(Collectors.toList()))
         .toString();
   }

   @Nullable
   public class_5019<?> method_36440(String var1) {
      return (class_5019<?>)this.field_41070.get(var1);
   }
}
