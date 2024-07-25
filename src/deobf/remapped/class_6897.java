package remapped;

import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Objects;

public class class_6897 extends class_1751 {
   public class_6897(Schema var1, boolean var2) {
      super("EntityCatSplitFix", var1, var2);
   }

   @Override
   public Pair<String, Dynamic<?>> method_7809(String var1, Dynamic<?> var2) {
      if (Objects.equals("minecraft:ocelot", var1)) {
         int var5 = var2.get("CatType").asInt(0);
         if (var5 != 0) {
            if (var5 > 0 && var5 < 4) {
               var2 = var2.set("CatType", var2.createInt(var5));
               var2 = var2.set("OwnerUUID", var2.createString(var2.get("OwnerUUID").asString("")));
               return Pair.of("minecraft:cat", var2);
            }
         } else {
            String var6 = var2.get("Owner").asString("");
            String var7 = var2.get("OwnerUUID").asString("");
            if (var6.length() > 0 || var7.length() > 0) {
               var2.set("Trusting", var2.createBoolean(true));
            }
         }
      }

      return Pair.of(var1, var2);
   }
}
