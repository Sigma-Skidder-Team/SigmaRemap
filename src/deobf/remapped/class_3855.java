package remapped;

import com.google.common.collect.Lists;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.TaggedChoice.TaggedChoiceType;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.Objects;

public class class_3855 extends DataFix {
   private static final List<String> field_18801 = Lists.newArrayList(new String[]{field_18802[3], "MinecartChest", "MinecartFurnace"});

   public class_3855(Schema var1, boolean var2) {
      super(var1, var2);
   }

   public TypeRewriteRule makeRule() {
      TaggedChoiceType var3 = this.getInputSchema().findChoiceType(class_4002.field_19444);
      TaggedChoiceType var4 = this.getOutputSchema().findChoiceType(class_4002.field_19444);
      return this.fixTypeEverywhere(
         "EntityMinecartIdentifiersFix",
         var3,
         var4,
         var2 -> var3x -> {
               if (!Objects.equals(var3x.getFirst(), "Minecart")) {
                  return var3x;
               } else {
                  Typed var6 = (Typed)var3.point(var2, "Minecart", var3x.getSecond()).orElseThrow(IllegalStateException::new);
                  Dynamic var7 = (Dynamic)var6.getOrCreate(DSL.remainderFinder());
                  int var8 = var7.get("Type").asInt(0);
                  String var9;
                  if (var8 > 0 && var8 < field_18801.size()) {
                     var9 = field_18801.get(var8);
                  } else {
                     var9 = "MinecartRideable";
                  }

                  return Pair.of(
                     var9,
                     var6.write()
                        .map(var2xx -> ((Type)var4.types().get(var9)).read(var2xx))
                        .result()
                        .orElseThrow(() -> new IllegalStateException("Could not read the new minecart."))
                  );
               }
            }
      );
   }
}
