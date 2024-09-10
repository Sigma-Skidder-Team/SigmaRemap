package mapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;

public class Class7116 extends Class7114 {
   public Class7116(Schema var1) {
      super(var1, TypeReferences.field35387);
   }

   public TypeRewriteRule makeRule() {
      OpticFinder<Pair<String, String>> var3 = DSL.fieldFinder("id", DSL.named(TypeReferences.field35393.typeName(), Class3639.method12354()));
      return this.fixTypeEverywhereTyped("ItemStackUUIDFix", this.getInputSchema().getType(this.field30634), var2 -> {
         OpticFinder<?> var5 = var2.getType().findField("tag");
         return var2.updateTyped(var5, var3x -> var3x.update(DSL.remainderFinder(), var3xx -> {
               var3xx = this.method22173(var3xx);
               if (var2.getOptional(var3).map(var0 -> "minecraft:player_head".equals(var0.getSecond())).orElse(false)) {
                  var3xx = this.method22174(var3xx);
               }

               return var3xx;
            }));
      });
   }

   private Dynamic<?> method22173(Dynamic<?> var1) {
      return var1.update(
         "AttributeModifiers",
         var1x -> var1.createList(var1x.asStream().map(var0x -> method22158(var0x, "UUID", "UUID").orElse(var0x)))
      );
   }

   private Dynamic<?> method22174(Dynamic<?> var1) {
      return var1.update("SkullOwner", var0 -> method22156(var0, "Id", "Id").orElse(var0));
   }
}
