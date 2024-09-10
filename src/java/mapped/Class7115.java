package mapped;

import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class Class7115 extends Class7114 {
   public Class7115(Schema var1) {
      super(var1, TypeReferences.field35386);
   }

   public TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped("BlockEntityUUIDFix", this.getInputSchema().getType(this.field30634), var1 -> {
         var1 = this.method22155(var1, "minecraft:conduit", this::method22169);
         return this.method22155(var1, "minecraft:skull", this::method22168);
      });
   }

   private Dynamic<?> method22168(Dynamic<?> var1) {
      return var1.get("Owner")
         .get()
         .map(var0 -> method22156(var0, "Id", "Id").orElse(var0))
         .<Dynamic<?>>map(var1x -> var1.remove("Owner").set("SkullOwner", var1x))
         .result()
         .orElse(var1);
   }

   private Dynamic<?> method22169(Dynamic<?> var1) {
      return method22157(var1, "target_uuid", "Target").orElse(var1);
   }
}
