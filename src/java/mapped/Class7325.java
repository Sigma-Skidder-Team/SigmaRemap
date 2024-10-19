package mapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import net.minecraft.util.datafix.TypeReferences;

import java.util.Objects;
import java.util.function.Function;

public abstract class Class7325 extends DataFix {
   private final String field31406;

   public Class7325(Schema var1, String var2) {
      super(var1, false);
      this.field31406 = var2;
   }

   public TypeRewriteRule makeRule() {
      Type<Pair<String, String>> var3 = DSL.named(TypeReferences.ITEM_NAME.typeName(), Class3639.method12354());
      if (Objects.equals(this.getInputSchema().getType(TypeReferences.ITEM_NAME), var3)) {
         return this.fixTypeEverywhere(this.field31406, var3, var1 -> var1x -> var1x.mapSecond(this::method23220));
      } else {
         throw new IllegalStateException("item name type is not what was expected.");
      }
   }

   public abstract String method23220(String var1);

   public static DataFix method23221(Schema var0, String var1, Function<String, String> var2) {
      return new Class7326(var0, var1, var2);
   }
}
