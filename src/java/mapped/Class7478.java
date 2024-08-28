package mapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class7478 {
   public static final Logger field32135 = LogManager.getLogger();
   public static final Class7478 field32136 = new Class7478(() -> Class9109.field41856, ImmutableMap.of(), ImmutableList.of(), ImmutableList.of());
   public static final MapCodec<Class7478> field32137 = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
               Class9319.field43263.fieldOf("surface_builder").forGetter(var0x -> var0x.field32138),
               Codec.simpleMap(
                     Class97.field261,
                     Class6815.field29676.promotePartial(Util.method38529("Carver: ", field32135::error)),
                     Class83.method260(Class97.values())
                  )
                  .fieldOf("carvers")
                  .forGetter(var0x -> var0x.field32139),
               Class7909.field33884
                  .promotePartial(Util.method38529("Feature: ", field32135::error))
                  .listOf()
                  .fieldOf("features")
                  .forGetter(var0x -> var0x.field32140),
               Class9300.field43173
                  .promotePartial(Util.method38529("Structure start: ", field32135::error))
                  .fieldOf("starts")
                  .forGetter(var0x -> var0x.field32141)
            )
            .apply(var0, Class7478::new)
   );
   private final Supplier<Class9319<?>> field32138;
   private final Map<Class97, List<Supplier<Class6815<?>>>> field32139;
   private final List<List<Supplier<Class7909<?, ?>>>> field32140;
   private final List<Supplier<Class9300<?, ?>>> field32141;
   private final List<Class7909<?, ?>> field32142;

   public Class7478(
           Supplier<Class9319<?>> var1,
           Map<Class97, List<Supplier<Class6815<?>>>> var2,
           List<List<Supplier<Class7909<?, ?>>>> var3,
           List<Supplier<Class9300<?, ?>>> var4
   ) {
      this.field32138 = var1;
      this.field32139 = var2;
      this.field32140 = var3;
      this.field32141 = var4;
      this.field32142 = var3.stream()
         .flatMap(Collection::stream)
         .map(Supplier::get)
         .<Class7909<?, ?>>flatMap(Class7909::method26522)
         .filter(var0 -> var0.field33886 == Class2898.field17938)
         .collect(ImmutableList.toImmutableList());
   }

   public List<Supplier<Class6815<?>>> method24276(Class97 var1) {
      return this.field32139.getOrDefault(var1, ImmutableList.of());
   }

   public boolean method24277(Structure<?> var1) {
      return this.field32141.stream().anyMatch(var1x -> var1x.get().field43174 == var1);
   }

   public Collection<Supplier<Class9300<?, ?>>> method24278() {
      return this.field32141;
   }

   public Class9300<?, ?> method24279(Class9300<?, ?> var1) {
      return (Class9300<?, ?>)DataFixUtils.orElse(
         this.field32141.stream().<Class9300>map(Supplier::get).filter(var1x -> var1x.field43174 == var1.field43174).findAny(), var1
      );
   }

   public List<Class7909<?, ?>> method24280() {
      return this.field32142;
   }

   public List<List<Supplier<Class7909<?, ?>>>> method24281() {
      return this.field32140;
   }

   public Supplier<Class9319<?>> method24282() {
      return this.field32138;
   }

   public Class8277 method24283() {
      return this.field32138.get().method35211();
   }
}
