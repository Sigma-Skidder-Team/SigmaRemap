package remapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_6068 {
   public static final Logger field_31035 = LogManager.getLogger();
   public static final class_6068 field_31042 = new class_6068(
      0.1F, Stream.<class_4565>of(class_4565.values()).collect(ImmutableMap.toImmutableMap(var0 -> var0, var0 -> ImmutableList.of())), ImmutableMap.of(), false
   );
   public static final MapCodec<class_6068> field_31038 = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
               Codec.FLOAT.optionalFieldOf("creature_spawn_probability", 0.1F).forGetter(var0x -> var0x.field_31037),
               Codec.simpleMap(
                     class_4565.field_22246,
                     class_3222.field_16054.listOf().promotePartial(Util.method_44690("Spawn data: ", field_31035::error)),
                     class_4530.method_21047(class_4565.values())
                  )
                  .fieldOf("spawners")
                  .forGetter(var0x -> var0x.field_31041),
               Codec.simpleMap(class_8669.field_44400, class_2658.field_13097, class_8669.field_44400)
                  .fieldOf("spawn_costs")
                  .forGetter(var0x -> var0x.field_31036),
               Codec.BOOL.fieldOf("player_spawn_friendly").orElse(false).forGetter(class_6068::method_27796)
            )
            .apply(var0, class_6068::new)
   );
   private final float field_31037;
   private final Map<class_4565, List<class_3222>> field_31041;
   private final Map<EntityType<?>, class_2658> field_31036;
   private final boolean field_31040;

   private class_6068(float var1, Map<class_4565, List<class_3222>> var2, Map<EntityType<?>, class_2658> var3, boolean var4) {
      this.field_31037 = var1;
      this.field_31041 = var2;
      this.field_31036 = var3;
      this.field_31040 = var4;
   }

   public List<class_3222> method_27794(class_4565 var1) {
      return this.field_31041.getOrDefault(var1, ImmutableList.of());
   }

   @Nullable
   public class_2658 method_27798(EntityType<?> var1) {
      return this.field_31036.get(var1);
   }

   public float method_27797() {
      return this.field_31037;
   }

   public boolean method_27796() {
      return this.field_31040;
   }
}
