package remapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class class_2028 extends class_7449 {
   public class_2028(Schema var1, boolean var2) {
      super(var1, var2, "JigsawPropertiesFix", class_4002.field_19434, "minecraft:jigsaw");
   }

   private static Dynamic<?> method_9511(Dynamic<?> var0) {
      String var3 = var0.get("attachement_type").asString("minecraft:empty");
      String var4 = var0.get("target_pool").asString("minecraft:empty");
      return var0.set("name", var0.createString(var3))
         .set("target", var0.createString(var3))
         .remove("attachement_type")
         .set("pool", var0.createString(var4))
         .remove("target_pool");
   }

   @Override
   public Typed<?> method_33892(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), class_2028::method_9511);
   }
}
