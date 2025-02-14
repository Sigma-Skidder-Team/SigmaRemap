package mapped;

import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import net.minecraft.util.UUIDCodec;

import java.util.UUID;

public class Class7539 {
   public final UUID field32349;
   public final Class2074 field32350;
   public final int field32351;

   public Class7539(UUID var1, Class2074 var2, int var3) {
      this.field32349 = var1;
      this.field32350 = var2;
      this.field32351 = var3;
   }

   public int method24647() {
      return this.field32351 * this.field32350.field13512;
   }

   @Override
   public String toString() {
      return "GossipEntry{target=" + this.field32349 + ", type=" + this.field32350 + ", value=" + this.field32351 + '}';
   }

   public <T> Dynamic<T> method24648(DynamicOps<T> var1) {
      return new Dynamic(
         var1,
         var1.createMap(
            ImmutableMap.of(
               var1.createString("Target"),
               UUIDCodec.field39430.encodeStart(var1, this.field32349).result().orElseThrow(RuntimeException::new),
               var1.createString("Type"),
               var1.createString(this.field32350.field13511),
               var1.createString("Value"),
               var1.createInt(this.field32351)
            )
         )
      );
   }

   public static DataResult<Class7539> method24649(Dynamic<?> var0) {
      return DataResult.unbox(
         DataResult.instance()
            .group(
               var0.get("Target").read(UUIDCodec.field39430),
               var0.get("Type").asString().map(Class2074::method8731),
               var0.get("Value").asNumber().map(Number::intValue)
            )
            .apply(DataResult.instance(), Class7539::new)
      );
   }
}
