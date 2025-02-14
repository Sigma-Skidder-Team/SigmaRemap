package mapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import net.minecraft.util.datafix.TypeReferences;

import java.util.Objects;

public class Class9091 extends DataFix {
   public Class9091(Schema var1, boolean var2) {
      super(var1, var2);
   }

   public TypeRewriteRule makeRule() {
      Type<?> var3 = this.getInputSchema().getType(TypeReferences.BLOCK_NAME);
      Type<?> var4 = this.getOutputSchema().getType(TypeReferences.BLOCK_NAME);
      Type<Pair<String, Either<Integer, String>>>  var5 = DSL.named(TypeReferences.BLOCK_NAME.typeName(), DSL.or(DSL.intType(), Class3639.method12354()));
      Type<Pair<String, String>> var6 = DSL.named(TypeReferences.BLOCK_NAME.typeName(), Class3639.method12354());
      if (Objects.equals(var3, var5) && Objects.equals(var4, var6)) {
         return this.fixTypeEverywhere(
            "BlockNameFlatteningFix",
            var5,
            var6,
            var0 -> var0x -> var0x.mapSecond(
                     var0xx -> (String)var0xx.map(Class9398::method35690, var0xxx -> Class9398.method35689(Class3639.method12353(var0xxx)))
                  )
         );
      } else {
         throw new IllegalStateException("Expected and actual types don't match.");
      }
   }
}
