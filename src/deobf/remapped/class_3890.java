package remapped;

import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class class_3890 extends class_7784 {
   public class_3890(Schema var1) {
      super(var1, class_4002.field_19434);
   }

   public TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped("BlockEntityUUIDFix", this.getInputSchema().getType(this.field_39450), var1 -> {
         var1 = this.method_35324(var1, "minecraft:conduit", this::method_18005);
         return this.method_35324(var1, "minecraft:skull", this::method_18006);
      });
   }

   private Dynamic<?> method_18006(Dynamic<?> var1) {
      return var1.get("Owner")
         .get()
         .map(var0 -> method_35319(var0, "Id", "Id").orElse(var0))
         .map(var1x -> var1.remove("Owner").set("SkullOwner", var1x))
         .result()
         .orElse(var1);
   }

   private Dynamic<?> method_18005(Dynamic<?> var1) {
      return method_35322(var1, "target_uuid", "Target").orElse(var1);
   }
}
