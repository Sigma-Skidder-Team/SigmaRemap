package mapped;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import java.util.Optional;

public class Class8698 extends DataFix {
   public Class8698(Schema var1, boolean var2) {
      super(var1, var2);
   }

   public TypeRewriteRule makeRule() {
      Type var3 = this.getInputSchema().getType(TypeReferences.field35383);
      OpticFinder var4 = var3.findField("data");
      return this.fixTypeEverywhereTyped("Map id fix", var3, var1 -> {
         Optional var4x = var1.getOptionalTyped(var4);
         return !var4x.isPresent() ? var1.update(DSL.remainderFinder(), var0x -> var0x.createMap(ImmutableMap.of(var0x.createString("data"), var0x))) : var1;
      });
   }
}
