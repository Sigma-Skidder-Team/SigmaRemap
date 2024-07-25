package remapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import java.util.Objects;
import java.util.function.Function;

public class class_5735 extends DataFix {
   private final String field_28979;
   private final Function<String, String> field_28977;

   public class_5735(Schema var1, boolean var2, String var3, Function<String, String> var4) {
      super(var1, var2);
      this.field_28979 = var3;
      this.field_28977 = var4;
   }

   public TypeRewriteRule makeRule() {
      Type var3 = DSL.named(class_4002.field_19437.typeName(), class_5178.method_23741());
      if (Objects.equals(var3, this.getInputSchema().getType(class_4002.field_19437))) {
         return this.fixTypeEverywhere(this.field_28979, var3, var1 -> var1x -> var1x.mapSecond(this.field_28977));
      } else {
         throw new IllegalStateException("Recipe type is not what was expected.");
      }
   }
}
