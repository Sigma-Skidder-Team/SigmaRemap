package mapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import java.util.Objects;
import java.util.Optional;

public class Class9167 extends DataFix {
   public Class9167(Schema var1, boolean var2) {
      super(var1, var2);
   }

   public TypeRewriteRule makeRule() {
      OpticFinder var3 = DSL.fieldFinder("id", Class3639.method12354());
      return this.fixTypeEverywhereTyped(
         "BlockEntityCustomNameToComponentFix", this.getInputSchema().getType(TypeReferences.field35386), var1 -> var1.update(DSL.remainderFinder(), var2 -> {
               Optional var5 = var1.getOptional(var3);
               return var5.isPresent() && Objects.equals(var5.get(), "minecraft:command_block") ? var2 : Class7467.method24180(var2);
            })
      );
   }
}
