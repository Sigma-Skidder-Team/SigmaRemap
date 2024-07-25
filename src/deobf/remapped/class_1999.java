package remapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import net.minecraft.util.text.ITextComponent$class_40;
import net.minecraft.util.text.StringTextComponent;

public class class_1999 extends DataFix {
   public class_1999(Schema var1, boolean var2) {
      super(var1, var2);
   }

   public TypeRewriteRule makeRule() {
      OpticFinder var3 = DSL.fieldFinder("id", class_5178.method_23741());
      return this.fixTypeEverywhereTyped(
         "EntityCustomNameToComponentFix", this.getInputSchema().getType(class_4002.field_19444), var1 -> var1.update(DSL.remainderFinder(), var2 -> {
               Optional var5 = var1.getOptional(var3);
               return var5.isPresent() && Objects.equals(var5.get(), "minecraft:commandblock_minecart") ? var2 : method_9283(var2);
            })
      );
   }

   public static Dynamic<?> method_9283(Dynamic<?> var0) {
      String var3 = var0.get("CustomName").asString("");
      return !var3.isEmpty()
         ? var0.set("CustomName", var0.createString(ITextComponent$class_40.toJson(new StringTextComponent(var3))))
         : var0.remove("CustomName");
   }
}
