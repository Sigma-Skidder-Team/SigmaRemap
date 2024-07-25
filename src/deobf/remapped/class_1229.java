package remapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Optional;

public class class_1229 extends class_7449 {
   public class_1229(Schema var1, boolean var2) {
      super(var1, var2, "EntityHorseSaddleFix", class_4002.field_19444, "EntityHorse");
   }

   @Override
   public Typed<?> method_33892(Typed<?> var1) {
      OpticFinder var4 = DSL.fieldFinder("id", DSL.named(class_4002.field_19439.typeName(), class_5178.method_23741()));
      Type var5 = this.getInputSchema().getTypeRaw(class_4002.field_19433);
      OpticFinder var6 = DSL.fieldFinder("SaddleItem", var5);
      Optional var7 = var1.getOptionalTyped(var6);
      Dynamic var8 = (Dynamic)var1.get(DSL.remainderFinder());
      if (!var7.isPresent() && var8.get("Saddle").asBoolean(false)) {
         Typed var9 = (Typed)var5.pointTyped(var1.getOps()).orElseThrow(IllegalStateException::new);
         var9 = var9.set(var4, Pair.of(class_4002.field_19439.typeName(), "minecraft:saddle"));
         Dynamic var10 = var8.emptyMap();
         var10 = var10.set("Count", var10.createByte((byte)1));
         var10 = var10.set("Damage", var10.createShort((short)0));
         var9 = var9.set(DSL.remainderFinder(), var10);
         var8.remove("Saddle");
         return var1.set(var6, var9).set(DSL.remainderFinder(), var8);
      } else {
         return var1;
      }
   }
}
