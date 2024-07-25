package remapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;

public abstract class class_3807 extends DataFix {
   private final String field_18634;

   public class_3807(Schema var1, String var2) {
      super(var1, false);
      this.field_18634 = var2;
   }

   public TypeRewriteRule makeRule() {
      Type var3 = this.getInputSchema().getType(class_4002.field_19432);
      Type var4 = DSL.named(class_4002.field_19432.typeName(), class_5178.method_23741());
      if (Objects.equals(var3, var4)) {
         TypeRewriteRule var5 = this.fixTypeEverywhere(this.field_18634 + " for block", var4, var1 -> var1x -> var1x.mapSecond(this::method_17728));
         TypeRewriteRule var6 = this.fixTypeEverywhereTyped(
            this.field_18634 + " for block_state", this.getInputSchema().getType(class_4002.field_19435), var1 -> var1.update(DSL.remainderFinder(), var1x -> {
                  Optional var4x = var1x.get("Name").asString().result();
                  return !var4x.isPresent() ? var1x : var1x.set("Name", var1x.createString(this.method_17728((String)var4x.get())));
               })
         );
         return TypeRewriteRule.seq(var5, var6);
      } else {
         throw new IllegalStateException("block type is not what was expected.");
      }
   }

   public abstract String method_17728(String var1);

   public static DataFix method_17726(Schema var0, String var1, Function<String, String> var2) {
      return new class_2661(var0, var1, var2);
   }
}
