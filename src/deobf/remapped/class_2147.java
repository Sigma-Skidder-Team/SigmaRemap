package remapped;

import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.UUID;

public class class_2147 {
   public final UUID field_10745;
   public final class_5279 field_10746;
   public final int field_10744;

   public class_2147(UUID var1, class_5279 var2, int var3) {
      this.field_10745 = var1;
      this.field_10746 = var2;
      this.field_10744 = var3;
   }

   public int method_10028() {
      return this.field_10744 * this.field_10746.field_26994;
   }

   @Override
   public String toString() {
      return "GossipEntry{target=" + this.field_10745 + ", type=" + this.field_10746 + ", value=" + this.field_10744 + '}';
   }

   public <T> Dynamic<T> method_10026(DynamicOps<T> var1) {
      return new Dynamic(
         var1,
         var1.createMap(
            ImmutableMap.of(
               var1.createString("Target"),
               class_5753.field_29117.encodeStart(var1, this.field_10745).result().orElseThrow(RuntimeException::new),
               var1.createString("Type"),
               var1.createString(this.field_10746.field_27003),
               var1.createString("Value"),
               var1.createInt(this.field_10744)
            )
         )
      );
   }

   public static DataResult<class_2147> method_10027(Dynamic<?> var0) {
      return DataResult.unbox(
         DataResult.instance()
            .group(
               var0.get("Target").read(class_5753.field_29117),
               var0.get("Type").asString().map(class_5279::method_24103),
               var0.get("Value").asNumber().map(Number::intValue)
            )
            .apply(DataResult.instance(), class_2147::new)
      );
   }
}
