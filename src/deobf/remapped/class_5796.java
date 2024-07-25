package remapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import java.util.Locale;
import java.util.Optional;

public class class_5796 extends DataFix {
   public class_5796(Schema var1, boolean var2) {
      super(var1, var2);
   }

   public TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(
         "OptionsLowerCaseLanguageFix", this.getInputSchema().getType(class_4002.field_19442), var0 -> var0.update(DSL.remainderFinder(), var0x -> {
               Optional var3 = var0x.get("lang").asString().result();
               return !var3.isPresent() ? var0x : var0x.set("lang", var0x.createString(((String)var3.get()).toLowerCase(Locale.ROOT)));
            })
      );
   }
}
