package mapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;

import java.util.Map;
import java.util.Objects;

public class Class7641 extends DataFix {
   private final String field32721;
   private final Map<String, String> field32722;

   public Class7641(Schema var1, boolean var2, String var3, Map<String, String> var4) {
      super(var1, var2);
      this.field32722 = var4;
      this.field32721 = var3;
   }

   public TypeRewriteRule makeRule() {
      Type<Pair<String, String>> var3 = DSL.named(TypeReferences.field35399.typeName(), Class3639.method12354());
      if (Objects.equals(var3, this.getInputSchema().getType(TypeReferences.field35399))) {
         return this.fixTypeEverywhere(this.field32721, var3, var1 -> var1x -> var1x.mapSecond(var1xx -> this.field32722.getOrDefault(var1xx, var1xx)));
      } else {
         throw new IllegalStateException("Biome type is not what was expected.");
      }
   }
}
