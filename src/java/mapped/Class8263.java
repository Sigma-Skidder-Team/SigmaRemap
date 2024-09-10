package mapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import java.util.Objects;

public class Class8263 extends DataFix {
   public Class8263(Schema var1, boolean var2) {
      super(var1, var2);
   }

   public TypeRewriteRule makeRule() {
      Type var3 = this.getInputSchema().getType(TypeReferences.field35378);
      Type var4 = var3.findFieldType("Level");
      OpticFinder var5 = DSL.fieldFinder("Level", var4);
      return this.fixTypeEverywhereTyped(
         "ChunkStatusFix", var3, this.getOutputSchema().getType(TypeReferences.field35378), var1 -> var1.updateTyped(var5, var0x -> {
               Dynamic var3x = (Dynamic)var0x.get(DSL.remainderFinder());
               String var4x = var3x.get("Status").asString("empty");
               if (Objects.equals(var4x, "postprocessed")) {
                  var3x = var3x.set("Status", var3x.createString("fullchunk"));
               }

               return var0x.set(DSL.remainderFinder(), var3x);
            })
      );
   }
}
