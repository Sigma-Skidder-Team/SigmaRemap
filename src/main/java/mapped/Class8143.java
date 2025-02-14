package mapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import net.minecraft.util.datafix.TypeReferences;

import java.util.Objects;
import java.util.Optional;

public abstract class Class8143 extends DataFix {
   public Class8143(Schema var1, boolean var2) {
      super(var1, var2);
   }

   public TypeRewriteRule makeRule() {
      Type<Pair<String, Dynamic<?>>> var3 = DSL.named(TypeReferences.POI_CHUNK.typeName(), DSL.remainderType());
      if (Objects.equals(var3, this.getInputSchema().getType(TypeReferences.POI_CHUNK))) {
         return this.fixTypeEverywhere("POI rename", var3, var1 -> var1x -> var1x.mapSecond(this::method28237));
      } else {
         throw new IllegalStateException("Poi type is not what was expected.");
      }
   }

   private <T> Dynamic<T> method28237(Dynamic<T> var1) {
      return var1.update(
         "Sections",
         var1x -> var1x.updateMapValues(
               var1xx -> var1xx.mapSecond(var1xxx -> var1xxx.update("Records", var1xxxx -> (Dynamic)DataFixUtils.orElse(this.method28238(var1xxxx), var1xxxx)))
            )
      );
   }

   private <T> Optional<Dynamic<T>> method28238(Dynamic<T> var1) {
      return var1.asStreamOpt()
         .map(
            var2 -> var1.createList(
                  var2.map(
                     var1xx -> var1xx.update(
                           "type",
                           var1xxx -> DataFixUtils.orElse(var1xxx.asString().map(this::method28236).map(var1xxx::createString).result(), var1xxx)
                        )
                  )
               )
         )
         .result();
   }

   public abstract String method28236(String var1);
}
