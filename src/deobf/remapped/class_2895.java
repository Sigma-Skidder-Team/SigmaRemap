package remapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import java.util.Map;
import java.util.Objects;

public class class_2895 extends DataFix {
   private final String field_14154;
   private final Map<String, String> field_14155;

   public class_2895(Schema var1, boolean var2, String var3, Map<String, String> var4) {
      super(var1, var2);
      this.field_14155 = var4;
      this.field_14154 = var3;
   }

   public TypeRewriteRule makeRule() {
      Type var3 = DSL.named(class_4002.field_19440.typeName(), class_5178.method_23741());
      if (Objects.equals(var3, this.getInputSchema().getType(class_4002.field_19440))) {
         return this.fixTypeEverywhere(this.field_14154, var3, var1 -> var1x -> var1x.mapSecond(var1xx -> this.field_14155.getOrDefault(var1xx, var1xx)));
      } else {
         throw new IllegalStateException("Biome type is not what was expected.");
      }
   }
}
