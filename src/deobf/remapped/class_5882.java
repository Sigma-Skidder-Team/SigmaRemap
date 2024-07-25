package remapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Codec;
import com.mojang.serialization.OptionalDynamic;
import java.util.List;

public class class_5882 extends DataFix {
   private static final Codec<List<Float>> field_29866 = Codec.FLOAT.listOf();

   public class_5882(Schema var1, boolean var2) {
      super(var1, var2);
   }

   public TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(
         "EntityRedundantChanceTagsFix", this.getInputSchema().getType(class_4002.field_19444), var0 -> var0.update(DSL.remainderFinder(), var0x -> {
               if (method_26828(var0x.get("HandDropChances"), 2)) {
                  var0x = var0x.remove("HandDropChances");
               }

               if (method_26828(var0x.get("ArmorDropChances"), 4)) {
                  var0x = var0x.remove("ArmorDropChances");
               }

               return var0x;
            })
      );
   }

   private static boolean method_26828(OptionalDynamic<?> var0, int var1) {
      return var0.flatMap(field_29866::parse).map(var1x -> var1x.size() == var1 && var1x.stream().allMatch(var0xx -> var0xx == 0.0F)).result().orElse(false);
   }
}
