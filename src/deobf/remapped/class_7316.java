package remapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import java.util.Objects;
import java.util.Optional;

public class class_7316 extends DataFix {
   public class_7316(Schema var1, boolean var2) {
      super(var1, var2);
   }

   public TypeRewriteRule makeRule() {
      OpticFinder var3 = DSL.fieldFinder("id", class_5178.method_23741());
      return this.fixTypeEverywhereTyped(
         "BlockEntityCustomNameToComponentFix", this.getInputSchema().getType(class_4002.field_19434), var1 -> var1.update(DSL.remainderFinder(), var2 -> {
               Optional var5 = var1.getOptional(var3);
               return var5.isPresent() && Objects.equals(var5.get(), "minecraft:command_block") ? var2 : class_1999.method_9283(var2);
            })
      );
   }
}
