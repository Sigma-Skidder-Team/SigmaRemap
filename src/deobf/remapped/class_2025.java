package remapped;

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

public class class_2025 {
   public static final Logger field_10262 = LogManager.getLogger();
   public static final class_2025 field_10261 = new class_2025(() -> class_7036.field_36236, ImmutableMap.of(), ImmutableList.of(), ImmutableList.of());
   public static final MapCodec<class_2025> field_10263 = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
               class_7929.field_40556.fieldOf("surface_builder").forGetter(var0x -> var0x.field_10269),
               Codec.simpleMap(
                     class_6033.field_30810,
                     class_987.field_5030.promotePartial(Util.method_44690("Carver: ", field_10262::error)),
                     class_4530.method_21047(class_6033.values())
                  )
                  .fieldOf("carvers")
                  .forGetter(var0x -> var0x.field_10264),
               class_5927.field_30067
                  .promotePartial(Util.method_44690("Feature: ", field_10262::error))
                  .listOf()
                  .fieldOf("features")
                  .forGetter(var0x -> var0x.field_10268),
               class_7865.field_40268
                  .promotePartial(Util.method_44690("Structure start: ", field_10262::error))
                  .fieldOf("starts")
                  .forGetter(var0x -> var0x.field_10265)
            )
            .apply(var0, class_2025::new)
   );
   private final Supplier<class_7929<?>> field_10269;
   private final Map<class_6033, List<Supplier<class_987<?>>>> field_10264;
   private final List<List<Supplier<class_5927<?, ?>>>> field_10268;
   private final List<Supplier<class_7865<?, ?>>> field_10265;
   private final List<class_5927<?, ?>> field_10267;

   private class_2025(
      Supplier<class_7929<?>> var1,
      Map<class_6033, List<Supplier<class_987<?>>>> var2,
      List<List<Supplier<class_5927<?, ?>>>> var3,
      List<Supplier<class_7865<?, ?>>> var4
   ) {
      this.field_10269 = var1;
      this.field_10264 = var2;
      this.field_10268 = var3;
      this.field_10265 = var4;
      this.field_10267 = var3.stream()
         .flatMap(Collection::stream)
         .map(Supplier::get)
         .<class_5927<?, ?>>flatMap(class_5927::method_27106)
         .filter(var0 -> var0.field_30065 == class_4285.field_20748)
         .collect(ImmutableList.toImmutableList());
   }

   public List<Supplier<class_987<?>>> method_9462(class_6033 var1) {
      return this.field_10264.getOrDefault(var1, ImmutableList.of());
   }

   public boolean method_9458(class_5390<?> var1) {
      return this.field_10265.stream().anyMatch(var1x -> var1x.get().field_40267 == var1);
   }

   public Collection<Supplier<class_7865<?, ?>>> method_9459() {
      return this.field_10265;
   }

   public class_7865<?, ?> method_9457(class_7865<?, ?> var1) {
      return (class_7865<?, ?>)DataFixUtils.orElse(
         this.field_10265.stream().<class_7865>map(Supplier::get).filter(var1x -> var1x.field_40267 == var1.field_40267).findAny(), var1
      );
   }

   public List<class_5927<?, ?>> method_9461() {
      return this.field_10267;
   }

   public List<List<Supplier<class_5927<?, ?>>>> method_9456() {
      return this.field_10268;
   }

   public Supplier<class_7929<?>> method_9455() {
      return this.field_10269;
   }

   public class_4139 method_9460() {
      return this.field_10269.get().method_35846();
   }
}
