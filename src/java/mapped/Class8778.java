package mapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import java.util.Optional;
import java.util.UUID;

public class Class8778 extends DataFix {
   public Class8778(Schema var1, boolean var2) {
      super(var1, var2);
   }

   public TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(
         "EntityStringUuidFix",
         this.getInputSchema().getType(TypeReferences.ENTITY),
         var0 -> var0.update(
               DSL.remainderFinder(),
               var0x -> {
                  Optional var3 = var0x.get("UUID").asString().result();
                  if (!var3.isPresent()) {
                     return var0x;
                  } else {
                     UUID var4 = UUID.fromString((String)var3.get());
                     return var0x.remove("UUID")
                        .set("UUIDMost", var0x.createLong(var4.getMostSignificantBits()))
                        .set("UUIDLeast", var0x.createLong(var4.getLeastSignificantBits()));
                  }
               }
            )
      );
   }
}
