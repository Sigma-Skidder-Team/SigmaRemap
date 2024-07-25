package remapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import net.minecraft.util.text.ITextComponent$class_40;
import net.minecraft.util.text.StringTextComponent;

public class class_8703 extends DataFix {
   public class_8703(Schema var1, boolean var2) {
      super(var1, var2);
   }

   public TypeRewriteRule makeRule() {
      Type var3 = DSL.named(class_4002.field_19430.typeName(), DSL.remainderType());
      if (Objects.equals(var3, this.getInputSchema().getType(class_4002.field_19430))) {
         return this.fixTypeEverywhere(
            "TeamDisplayNameFix",
            var3,
            var0 -> var0x -> var0x.mapSecond(
                     var0xx -> var0xx.update(
                           "DisplayName",
                           var1 -> (Dynamic)DataFixUtils.orElse(
                                 var1.asString()
                                    .map(var0xxxx -> ITextComponent$class_40.toJson(new StringTextComponent(var0xxxx)))
                                    .map(var0xx::createString)
                                    .result(),
                                 var1
                              )
                        )
                  )
         );
      } else {
         throw new IllegalStateException("Team type is not what was expected.");
      }
   }
}
