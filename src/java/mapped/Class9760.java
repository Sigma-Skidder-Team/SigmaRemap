package mapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.List.ListType;
import com.mojang.serialization.Dynamic;
import net.minecraft.util.math.MathHelper;

import java.util.Optional;

public class Class9760 extends DataFix {
   private static final int[] field45663 = new int[]{0, 10, 50, 100, 150};

   public static int method38367(int var0) {
      return field45663[MathHelper.method37775(var0 - 1, 0, field45663.length - 1)];
   }

   public Class9760(Schema var1, boolean var2) {
      super(var1, var2);
   }

   public TypeRewriteRule makeRule() {
      Type<?> var3 = this.getInputSchema().getChoiceType(TypeReferences.ENTITY, "minecraft:villager");
      OpticFinder var4 = DSL.namedChoice("minecraft:villager", var3);
      OpticFinder<?> var5 = var3.findField("Offers");
      Type var6 = var5.type();
      OpticFinder<?> var7 = var6.findField("Recipes");
      ListType var8 = (ListType)var7.type();
      OpticFinder<?> var9 = var8.getElement().finder();
      return this.fixTypeEverywhereTyped(
         "Villager level and xp rebuild",
         this.getInputSchema().getType(TypeReferences.ENTITY),
         var5x -> var5x.updateTyped(
               var4,
               var3,
               var3xx -> {
                  Dynamic var6x = (Dynamic)var3xx.get(DSL.remainderFinder());
                  int var7x = var6x.get("VillagerData").get("level").asInt(0);
                  Typed<?> var8x = var3xx;
                  if (var7x == 0 || var7x == 1) {
                     int var9x = var3xx.getOptionalTyped(var5)
                             .flatMap(var1xx -> var1xx.getOptionalTyped(var7))
                             .map(var1xx -> var1xx.getAllTyped(var9).size())
                        .orElse(0);
                     var7x = MathHelper.method37775(var9x / 2, 1, 5);
                     if (var7x > 1) {
                        var8x = method38368(var3xx, var7x);
                     }
                  }

                  Optional var10 = var6x.get("Xp").asNumber().result();
                  if (!var10.isPresent()) {
                     var8x = method38369(var8x, var7x);
                  }

                  return var8x;
               }
            )
      );
   }

   private static Typed<?> method38368(Typed<?> var0, int var1) {
      return var0.update(DSL.remainderFinder(), var1x -> var1x.update("VillagerData", var1xx -> var1xx.set("level", var1xx.createInt(var1))));
   }

   private static Typed<?> method38369(Typed<?> var0, int var1) {
      int var4 = method38367(var1);
      return var0.update(DSL.remainderFinder(), var1x -> var1x.set("Xp", var1x.createInt(var4)));
   }
}
