package remapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.List.ListType;
import com.mojang.datafixers.util.Pair;
import java.util.Objects;
import java.util.function.Function;

public class class_8754 extends class_7449 {
   public class_8754(Schema var1, boolean var2) {
      super(var1, var2, "Villager trade fix", class_4002.field_19444, "minecraft:villager");
   }

   @Override
   public Typed<?> method_33892(Typed<?> var1) {
      OpticFinder var4 = var1.getType().findField("Offers");
      OpticFinder var5 = var4.type().findField("Recipes");
      Type var6 = var5.type();
      if (var6 instanceof ListType) {
         ListType var7 = (ListType)var6;
         Type var8 = var7.getElement();
         OpticFinder var9 = DSL.typeFinder(var8);
         OpticFinder var10 = var8.findField("buy");
         OpticFinder var11 = var8.findField("buyB");
         OpticFinder var12 = var8.findField("sell");
         OpticFinder var13 = DSL.fieldFinder("id", DSL.named(class_4002.field_19439.typeName(), class_5178.method_23741()));
         Function var14 = var2 -> this.method_40195(var13, var2);
         return var1.updateTyped(
            var4,
            var6x -> var6x.updateTyped(
                  var5, var5xx -> var5xx.updateTyped(var9, var4xxx -> var4xxx.updateTyped(var10, var14).updateTyped(var11, var14).updateTyped(var12, var14))
               )
         );
      } else {
         throw new IllegalStateException("Recipes are expected to be a list.");
      }
   }

   private Typed<?> method_40195(OpticFinder<Pair<String, String>> var1, Typed<?> var2) {
      return var2.update(var1, var0 -> var0.mapSecond(var0x -> !Objects.equals(var0x, "minecraft:carved_pumpkin") ? var0x : "minecraft:pumpkin"));
   }
}
