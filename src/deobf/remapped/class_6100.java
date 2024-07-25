package remapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;

public class class_6100 extends class_7449 {
   public class_6100(Schema var1, boolean var2) {
      super(var1, var2, "BlockEntityBlockStateFix", class_4002.field_19434, "minecraft:piston");
   }

   @Override
   public Typed<?> method_33892(Typed<?> var1) {
      Type var4 = this.getOutputSchema().getChoiceType(class_4002.field_19434, "minecraft:piston");
      Type var5 = var4.findFieldType("blockState");
      OpticFinder var6 = DSL.fieldFinder("blockState", var5);
      Dynamic var7 = (Dynamic)var1.get(DSL.remainderFinder());
      int var8 = var7.get("blockId").asInt(0);
      var7 = var7.remove("blockId");
      int var9 = var7.get("blockData").asInt(0) & 15;
      var7 = var7.remove("blockData");
      Dynamic var10 = class_8237.method_37732(var8 << 4 | var9);
      Typed var11 = (Typed)var4.pointTyped(var1.getOps()).orElseThrow(() -> new IllegalStateException("Could not create new piston block entity."));
      return var11.set(DSL.remainderFinder(), var7)
         .set(
            var6,
            (Typed)((Pair)var5.readTyped(var10).result().orElseThrow(() -> new IllegalStateException("Could not parse newly created block state tag.")))
               .getFirst()
         );
   }
}
