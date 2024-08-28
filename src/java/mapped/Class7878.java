package mapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;

public class Class7878 extends DataFix {
   public Class7878(Schema var1, boolean var2) {
      super(var1, var2);
   }

   public TypeRewriteRule makeRule() {
      Type var3 = this.getInputSchema().getType(Class8239.field35378);
      Type var4 = var3.findFieldType("Level");
      OpticFinder var5 = DSL.fieldFinder("Level", var4);
      return this.fixTypeEverywhereTyped(
         "ChunkLightRemoveFix",
         var3,
         this.getOutputSchema().getType(Class8239.field35378),
         var1 -> var1.updateTyped(var5, var0x -> var0x.update(DSL.remainderFinder(), var0xx -> var0xx.remove("isLightOn")))
      );
   }
}
