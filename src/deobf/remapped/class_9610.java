package remapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class class_9610 {
   public static final Codec<class_9610> field_48974 = RecordCodecBuilder.create(
      var0 -> var0.group(
               class_7655.field_38896.optionalFieldOf("stronghold").forGetter(var0x -> Optional.<class_7655>ofNullable(var0x.field_48973)),
               Codec.simpleMap(class_8669.field_44457, class_4757.field_23036, class_8669.field_44457)
                  .fieldOf("structures")
                  .forGetter(var0x -> var0x.field_48976)
            )
            .apply(var0, class_9610::new)
   );
   public static final ImmutableMap<class_5390<?>, class_4757> field_48975 = ImmutableMap.builder()
      .put(class_5390.field_27516, new class_4757(32, 8, 10387312))
      .put(class_5390.field_27506, new class_4757(32, 8, 14357617))
      .put(class_5390.field_27519, new class_4757(32, 8, 14357618))
      .put(class_5390.field_27517, new class_4757(32, 8, 14357619))
      .put(class_5390.field_27515, new class_4757(32, 8, 14357620))
      .put(class_5390.field_27518, new class_4757(32, 8, 165745296))
      .put(class_5390.field_27511, new class_4757(1, 0, 0))
      .put(class_5390.field_27509, new class_4757(32, 5, 10387313))
      .put(class_5390.field_27504, new class_4757(20, 11, 10387313))
      .put(class_5390.field_27513, new class_4757(80, 20, 10387319))
      .put(class_5390.field_27501, new class_4757(1, 0, 0))
      .put(class_5390.field_27498, new class_4757(1, 0, 0))
      .put(class_5390.field_27512, new class_4757(40, 15, 34222645))
      .put(class_5390.field_27508, new class_4757(24, 4, 165745295))
      .put(class_5390.field_27495, new class_4757(20, 8, 14357621))
      .put(class_5390.field_27514, new class_4757(27, 4, 30084232))
      .put(class_5390.field_27510, new class_4757(27, 4, 30084232))
      .put(class_5390.field_27503, new class_4757(2, 1, 14357921))
      .build();
   public static final class_7655 field_48972;
   private final Map<class_5390<?>, class_4757> field_48976;
   private final class_7655 field_48973;

   public class_9610(Optional<class_7655> var1, Map<class_5390<?>, class_4757> var2) {
      this.field_48973 = var1.orElse((class_7655)null);
      this.field_48976 = var2;
   }

   public class_9610(boolean var1) {
      this.field_48976 = Maps.newHashMap(field_48975);
      this.field_48973 = !var1 ? null : field_48972;
   }

   public Map<class_5390<?>, class_4757> method_44377() {
      return this.field_48976;
   }

   @Nullable
   public class_4757 method_44376(class_5390<?> var1) {
      return this.field_48976.get(var1);
   }

   @Nullable
   public class_7655 method_44375() {
      return this.field_48973;
   }

   static {
      for (class_5390 var7 : class_8669.field_44457) {
         if (!field_48975.containsKey(var7)) {
            throw new IllegalStateException("Structure feature without default settings: " + class_8669.field_44457.method_39797(var7));
         }
      }

      field_48972 = new class_7655(32, 3, 128);
   }
}
