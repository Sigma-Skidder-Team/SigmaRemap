package remapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import java.util.Objects;
import java.util.function.Function;

public abstract class class_1795 extends DataFix {
   private final String field_9164;

   public class_1795(Schema var1, String var2) {
      super(var1, false);
      this.field_9164 = var2;
   }

   public TypeRewriteRule makeRule() {
      Type var3 = DSL.named(class_4002.field_19439.typeName(), class_5178.method_23741());
      if (Objects.equals(this.getInputSchema().getType(class_4002.field_19439), var3)) {
         return this.fixTypeEverywhere(this.field_9164, var3, var1 -> var1x -> var1x.mapSecond(this::method_7992));
      } else {
         throw new IllegalStateException("item name type is not what was expected.");
      }
   }

   public abstract String method_7992(String var1);

   public static DataFix method_7993(Schema var0, String var1, Function<String, String> var2) {
      return new class_4956(var0, var1, var2);
   }
}
