package mapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class Class6729 extends Class6717 {
   public Class6729(Schema var1, boolean var2) {
      super(var1, var2, "JigsawPropertiesFix", TypeReferences.field35386, "minecraft:jigsaw");
   }

   private static Dynamic<?> method20532(Dynamic<?> var0) {
      String var3 = var0.get("attachement_type").asString("minecraft:empty");
      String var4 = var0.get("target_pool").asString("minecraft:empty");
      return var0.set("name", var0.createString(var3))
         .set("target", var0.createString(var3))
         .remove("attachement_type")
         .set("pool", var0.createString(var4))
         .remove("target_pool");
   }

   @Override
   public Typed<?> method20508(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), Class6729::method20532);
   }
}
