package mapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import net.minecraft.util.datafix.TypeReferences;

import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;

public abstract class Class7765 extends DataFix {
   private final String field33339;

   public Class7765(Schema var1, String var2) {
      super(var1, false);
      this.field33339 = var2;
   }

   public TypeRewriteRule makeRule() {
      Type<?> var3 = this.getInputSchema().getType(TypeReferences.BLOCK_NAME);
      Type<Pair<String, String>> var4 = DSL.named(TypeReferences.BLOCK_NAME.typeName(), Class3639.method12354());
      if (Objects.equals(var3, var4)) {
         TypeRewriteRule var5 = this.fixTypeEverywhere(this.field33339 + " for block", var4, var1 -> var1x -> var1x.mapSecond(this::method25737));
         TypeRewriteRule var6 = this.fixTypeEverywhereTyped(
            this.field33339 + " for block_state", this.getInputSchema().getType(TypeReferences.BLOCK_STATE), var1 -> var1.update(DSL.remainderFinder(), var1x -> {
                  Optional var4x = var1x.get("Name").asString().result();
                  return !var4x.isPresent() ? var1x : var1x.set("Name", var1x.createString(this.method25737((String)var4x.get())));
               })
         );
         return TypeRewriteRule.seq(var5, var6);
      } else {
         throw new IllegalStateException("block type is not what was expected.");
      }
   }

   public abstract String method25737(String var1);

   public static DataFix method25738(Schema var0, String var1, Function<String, String> var2) {
      return new Class7764(var0, var1, var2);
   }
}
