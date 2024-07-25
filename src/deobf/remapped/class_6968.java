package remapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import java.util.Objects;

public class class_6968 extends DataFix {
   public class_6968(Schema var1, boolean var2) {
      super(var1, var2);
   }

   public TypeRewriteRule makeRule() {
      Type var3 = this.getInputSchema().getType(class_4002.field_19432);
      Type var4 = this.getOutputSchema().getType(class_4002.field_19432);
      Type var5 = DSL.named(class_4002.field_19432.typeName(), DSL.or(DSL.intType(), class_5178.method_23741()));
      Type var6 = DSL.named(class_4002.field_19432.typeName(), class_5178.method_23741());
      if (Objects.equals(var3, var5) && Objects.equals(var4, var6)) {
         return this.fixTypeEverywhere(
            "BlockNameFlatteningFix",
            var5,
            var6,
            var0 -> var0x -> var0x.mapSecond(
                     var0xx -> (String)var0xx.map(class_8237::method_37728, var0xxx -> class_8237.method_37726(class_5178.method_23742(var0xxx)))
                  )
         );
      } else {
         throw new IllegalStateException("Expected and actual types don't match.");
      }
   }
}
