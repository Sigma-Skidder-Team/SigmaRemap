package remapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class class_3248 extends class_7784 {
   public class_3248(Schema var1) {
      super(var1, class_4002.field_19433);
   }

   public TypeRewriteRule makeRule() {
      OpticFinder var3 = DSL.fieldFinder("id", DSL.named(class_4002.field_19439.typeName(), class_5178.method_23741()));
      return this.fixTypeEverywhereTyped("ItemStackUUIDFix", this.getInputSchema().getType(this.field_39450), var2 -> {
         OpticFinder var5 = var2.getType().findField("tag");
         return var2.updateTyped(var5, var3x -> var3x.update(DSL.remainderFinder(), var3xx -> {
               var3xx = this.method_14861(var3xx);
               if (var2.getOptional(var3).<Boolean>map(var0 -> "minecraft:player_head".equals(var0.getSecond())).orElse(false)) {
                  var3xx = this.method_14860(var3xx);
               }

               return var3xx;
            }));
      });
   }

   private Dynamic<?> method_14861(Dynamic<?> var1) {
      return var1.update(
         "AttributeModifiers",
         var1x -> var1.createList(var1x.asStream().<Dynamic>map(var0x -> (Dynamic)method_35321((Dynamic<?>)var0x, "UUID", "UUID").orElse((Dynamic<?>)var0x)))
      );
   }

   private Dynamic<?> method_14860(Dynamic<?> var1) {
      return var1.update("SkullOwner", var0 -> method_35319(var0, "Id", "Id").orElse(var0));
   }
}
