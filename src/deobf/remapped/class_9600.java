package remapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.List.ListType;
import com.mojang.serialization.Dynamic;
import java.util.Optional;

public class class_9600 extends DataFix {
   private static final int[] field_48942 = new int[]{0, 10, 50, 100, 150};

   public static int method_44353(int var0) {
      return field_48942[class_9299.method_42829(var0 - 1, 0, field_48942.length - 1)];
   }

   public class_9600(Schema var1, boolean var2) {
      super(var1, var2);
   }

   public TypeRewriteRule makeRule() {
      Type var3 = this.getInputSchema().getChoiceType(class_4002.field_19444, "minecraft:villager");
      OpticFinder var4 = DSL.namedChoice("minecraft:villager", var3);
      OpticFinder var5 = var3.findField("Offers");
      Type var6 = var5.type();
      OpticFinder var7 = var6.findField("Recipes");
      ListType var8 = (ListType)var7.type();
      OpticFinder var9 = var8.getElement().finder();
      return this.fixTypeEverywhereTyped(
         "Villager level and xp rebuild",
         this.getInputSchema().getType(class_4002.field_19444),
         var5x -> var5x.updateTyped(
               var4,
               var3,
               var3xx -> {
                  Dynamic var6x = (Dynamic)var3xx.get(DSL.remainderFinder());
                  int var7x = var6x.get("VillagerData").get("level").asInt(0);
                  Typed var8x = var3xx;
                  if (var7x == 0 || var7x == 1) {
                     int var9x = var3xx.getOptionalTyped(var5)
                        .<Typed>flatMap(var1xx -> var1xx.getOptionalTyped(var7))
                        .<Integer>map(var1xx -> var1xx.getAllTyped(var9).size())
                        .orElse(0);
                     var7x = class_9299.method_42829(var9x / 2, 1, 5);
                     if (var7x > 1) {
                        var8x = method_44355(var3xx, var7x);
                     }
                  }

                  Optional var10 = var6x.get("Xp").asNumber().result();
                  if (!var10.isPresent()) {
                     var8x = method_44354(var8x, var7x);
                  }

                  return var8x;
               }
            )
      );
   }

   private static Typed<?> method_44355(Typed<?> var0, int var1) {
      return var0.update(DSL.remainderFinder(), var1x -> var1x.update("VillagerData", var1xx -> var1xx.set("level", var1xx.createInt(var1))));
   }

   private static Typed<?> method_44354(Typed<?> var0, int var1) {
      int var4 = method_44353(var1);
      return var0.update(DSL.remainderFinder(), var1x -> var1x.set("Xp", var1x.createInt(var4)));
   }
}
