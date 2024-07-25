package remapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;

public abstract class class_5134 extends DataFix {
   public class_5134(Schema var1, boolean var2) {
      super(var1, var2);
   }

   public TypeRewriteRule makeRule() {
      Type var3 = DSL.named(class_4002.field_19447.typeName(), DSL.remainderType());
      if (Objects.equals(var3, this.getInputSchema().getType(class_4002.field_19447))) {
         return this.fixTypeEverywhere("POI rename", var3, var1 -> var1x -> var1x.mapSecond(this::method_23545));
      } else {
         throw new IllegalStateException("Poi type is not what was expected.");
      }
   }

   private <T> Dynamic<T> method_23545(Dynamic<T> var1) {
      return var1.update(
         "Sections",
         var1x -> var1x.updateMapValues(
               var1xx -> var1xx.mapSecond(var1xxx -> var1xxx.update("Records", var1xxxx -> (Dynamic)DataFixUtils.orElse(this.method_23546(var1xxxx), var1xxxx)))
            )
      );
   }

   private <T> Optional<Dynamic<T>> method_23546(Dynamic<T> var1) {
      return var1.asStreamOpt()
         .map(
            var2 -> var1.createList(
                  var2.<Dynamic>map(
                     var1xx -> var1xx.update(
                           "type",
                           var1xxx -> (Dynamic)DataFixUtils.orElse(var1xxx.asString().map(this::method_23547).map(var1xxx::createString).result(), var1xxx)
                        )
                  )
               )
         )
         .result();
   }

   public abstract String method_23547(String var1);
}
