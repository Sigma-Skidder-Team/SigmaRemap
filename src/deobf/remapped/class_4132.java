package remapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;

public class class_4132 extends class_7449 {
   public class_4132(Schema var1, boolean var2) {
      super(var1, var2, "BlockEntityJukeboxFix", class_4002.field_19434, "minecraft:jukebox");
   }

   @Override
   public Typed<?> method_33892(Typed<?> var1) {
      Type var4 = this.getInputSchema().getChoiceType(class_4002.field_19434, "minecraft:jukebox");
      Type var5 = var4.findFieldType("RecordItem");
      OpticFinder var6 = DSL.fieldFinder("RecordItem", var5);
      Dynamic var7 = (Dynamic)var1.get(DSL.remainderFinder());
      int var8 = var7.get("Record").asInt(0);
      if (var8 > 0) {
         var7.remove("Record");
         String var9 = class_2703.method_12195(class_3626.method_16899(var8), 0);
         if (var9 != null) {
            Dynamic var10 = var7.emptyMap();
            var10 = var10.set("id", var10.createString(var9));
            var10 = var10.set("Count", var10.createByte((byte)1));
            return var1.set(
                  var6,
                  (Typed)((Pair)var5.readTyped(var10).result().orElseThrow(() -> new IllegalStateException("Could not create record item stack."))).getFirst()
               )
               .set(DSL.remainderFinder(), var7);
         }
      }

      return var1;
   }
}
