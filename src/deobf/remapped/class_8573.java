package remapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;

public class class_8573 extends DataFix {
   public class_8573(Schema var1, boolean var2) {
      super(var1, var2);
   }

   private Dynamic<?> method_39432(Dynamic<?> var1) {
      Optional var4 = var1.get("display").result();
      if (!var4.isPresent()) {
         return var1;
      } else {
         Dynamic var5 = (Dynamic)var4.get();
         Optional var6 = var5.get("Name").asString().result();
         if (var6.isPresent()) {
            String var7 = (String)var6.get();
            var7 = var7.replace("\"translate\":\"block.minecraft.illager_banner\"", "\"translate\":\"block.minecraft.ominous_banner\"");
            var5 = var5.set("Name", var5.createString(var7));
         }

         return var1.set("display", var5);
      }
   }

   public TypeRewriteRule makeRule() {
      Type var3 = this.getInputSchema().getType(class_4002.field_19433);
      OpticFinder var4 = DSL.fieldFinder("id", DSL.named(class_4002.field_19439.typeName(), class_5178.method_23741()));
      OpticFinder var5 = var3.findField("tag");
      return this.fixTypeEverywhereTyped("OminousBannerRenameFix", var3, var3x -> {
         Optional var6 = var3x.getOptional(var4);
         if (var6.isPresent() && Objects.equals(((Pair)var6.get()).getSecond(), "minecraft:white_banner")) {
            Optional var7 = var3x.getOptionalTyped(var5);
            if (var7.isPresent()) {
               Typed var8 = (Typed)var7.get();
               Dynamic var9 = (Dynamic)var8.get(DSL.remainderFinder());
               return var3x.set(var5, var8.set(DSL.remainderFinder(), this.method_39432(var9)));
            }
         }

         return var3x;
      });
   }
}
