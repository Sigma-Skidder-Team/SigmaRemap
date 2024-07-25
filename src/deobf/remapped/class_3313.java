package remapped;

import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;

public class class_3313 extends DataFix {
   public class_3313(Schema var1, boolean var2) {
      super(var1, var2);
   }

   public TypeRewriteRule makeRule() {
      Type var3 = this.getOutputSchema().getType(class_4002.field_19452);
      Type var4 = this.getInputSchema().getType(class_4002.field_19452);
      OpticFinder var5 = var4.findField("stats");
      OpticFinder var6 = var5.type().findField("minecraft:custom");
      OpticFinder var7 = class_5178.method_23741().finder();
      return this.fixTypeEverywhereTyped(
         "SwimStatsRenameFix", var4, var3, var3x -> var3x.updateTyped(var5, var2x -> var2x.updateTyped(var6, var1xx -> var1xx.update(var7, var0xxx -> {
                     if (!var0xxx.equals("minecraft:swim_one_cm")) {
                        return !var0xxx.equals("minecraft:dive_one_cm") ? var0xxx : "minecraft:walk_under_water_one_cm";
                     } else {
                        return "minecraft:walk_on_water_one_cm";
                     }
                  })))
      );
   }
}
