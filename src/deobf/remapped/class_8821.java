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

public class class_8821 extends DataFix {
   public static final String[] field_45111 = new String[]{
      "minecraft:white_shulker_box",
      "minecraft:orange_shulker_box",
      "minecraft:magenta_shulker_box",
      "minecraft:light_blue_shulker_box",
      "minecraft:yellow_shulker_box",
      "minecraft:lime_shulker_box",
      "minecraft:pink_shulker_box",
      "minecraft:gray_shulker_box",
      "minecraft:silver_shulker_box",
      "minecraft:cyan_shulker_box",
      "minecraft:purple_shulker_box",
      "minecraft:blue_shulker_box",
      "minecraft:brown_shulker_box",
      "minecraft:green_shulker_box",
      "minecraft:red_shulker_box",
      "minecraft:black_shulker_box"
   };

   public class_8821(Schema var1, boolean var2) {
      super(var1, var2);
   }

   public TypeRewriteRule makeRule() {
      Type var3 = this.getInputSchema().getType(class_4002.field_19433);
      OpticFinder var4 = DSL.fieldFinder("id", DSL.named(class_4002.field_19439.typeName(), class_5178.method_23741()));
      OpticFinder var5 = var3.findField("tag");
      OpticFinder var6 = var5.type().findField("BlockEntityTag");
      return this.fixTypeEverywhereTyped(
         "ItemShulkerBoxColorFix",
         var3,
         var3x -> {
            Optional var6x = var3x.getOptional(var4);
            if (var6x.isPresent() && Objects.equals(((Pair)var6x.get()).getSecond(), "minecraft:shulker_box")) {
               Optional var7 = var3x.getOptionalTyped(var5);
               if (var7.isPresent()) {
                  Typed var8 = (Typed)var7.get();
                  Optional var9 = var8.getOptionalTyped(var6);
                  if (var9.isPresent()) {
                     Typed var10 = (Typed)var9.get();
                     Dynamic var11 = (Dynamic)var10.get(DSL.remainderFinder());
                     int var12 = var11.get("Color").asInt(0);
                     var11.remove("Color");
                     return var3x.set(var5, var8.set(var6, var10.set(DSL.remainderFinder(), var11)))
                        .set(var4, Pair.of(class_4002.field_19439.typeName(), field_45111[var12 % 16]));
                  }
               }
            }

            return var3x;
         }
      );
   }
}
