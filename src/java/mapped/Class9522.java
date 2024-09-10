package mapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import net.minecraft.util.text.ITextComponent$Serializer;
import net.minecraft.util.text.StringTextComponent;

public class Class9522 extends DataFix {
   public Class9522(Schema var1, boolean var2) {
      super(var1, var2);
   }

   public TypeRewriteRule makeRule() {
      Type<Pair<String, Dynamic<?>>> var3 = DSL.named(TypeReferences.field35397.typeName(), DSL.remainderType());
      if (Objects.equals(var3, this.getInputSchema().getType(TypeReferences.field35397))) {
         return this.fixTypeEverywhere(
            "TeamDisplayNameFix",
            var3,
            var0 -> var0x -> var0x.mapSecond(
                     var0xx -> var0xx.update(
                           "DisplayName",
                           var1 -> (Dynamic)DataFixUtils.orElse(
                                 var1.asString()
                                    .map(var0xxxx -> ITextComponent$Serializer.toJson(new StringTextComponent(var0xxxx)))
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
