package mapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;

public class Class7119 extends Class7114 {
   public Class7119(Schema var1) {
      super(var1, Class8239.field35377);
   }

   public TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(
         "PlayerUUIDFix",
         this.getInputSchema().getType(this.field30634),
         var0 -> {
            OpticFinder<?> var3 = var0.getType().findField("RootVehicle");
            return var0.updateTyped(
                  var3, var3.type(), var0x -> var0x.update(DSL.remainderFinder(), var0xx -> method22158(var0xx, "Attach", "Attach").orElse(var0xx))
               )
               .update(DSL.remainderFinder(), var0x -> Class7118.method22208(Class7118.method22206(var0x)));
         }
      );
   }
}
