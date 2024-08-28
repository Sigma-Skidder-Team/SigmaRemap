package mapped;

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

public class Class8193 extends DataFix {
   private static final List<String> field35219 = Lists.newArrayList(new String[]{"MinecartRideable", "MinecartChest", "MinecartFurnace"});

   public Class8193(Schema var1, boolean var2) {
      super(var1, var2);
   }

   public TypeRewriteRule makeRule() {
      TaggedChoiceType<String> var3 = (TaggedChoiceType<String>) this.getInputSchema().findChoiceType(Class8239.field35391);
      TaggedChoiceType<String> var4 = (TaggedChoiceType<String>) this.getOutputSchema().findChoiceType(Class8239.field35391);
      return this.fixTypeEverywhere(
         "EntityMinecartIdentifiersFix",
         var3,
         var4,
         var2 -> var3x -> {
               if (!Objects.equals(var3x.getFirst(), "Minecart")) {
                  return var3x;
               } else {
                  Typed<? extends Pair < String, ? >> var6 = (Typed)var3.point(var2, "Minecart", var3x.getSecond()).orElseThrow(IllegalStateException::new);
                  Dynamic var7 = (Dynamic)var6.getOrCreate(DSL.remainderFinder());
                  int var8 = var7.get("Type").asInt(0);
                  String var9;
                  if (var8 > 0 && var8 < field35219.size()) {
                     var9 = field35219.get(var8);
                  } else {
                     var9 = "MinecartRideable";
                  }

                  return Pair.of(
                     var9,
                     var6.write()
                        .<com.mojang.serialization.DataResult>map(var2xx -> ((Type)var4.types().get(var9)).read(var2xx))
                        .result()
                        .orElseThrow(() -> new IllegalStateException("Could not read the new minecart."))
                  );
               }
            }
      );
   }
}
