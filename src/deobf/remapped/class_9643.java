package remapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class class_9643 extends DataFix {
   public class_9643(Schema var1) {
      super(var1, false);
   }

   public TypeRewriteRule makeRule() {
      Schema var3 = this.getInputSchema();
      return this.fixTypeEverywhereTyped(
         "RedstoneConnectionsFix", var3.getType(class_4002.field_19435), var1 -> var1.update(DSL.remainderFinder(), this::method_44514)
      );
   }

   private <T> Dynamic<T> method_44514(Dynamic<T> var1) {
      boolean var4 = var1.get("Name").asString().result().filter("minecraft:redstone_wire"::equals).isPresent();
      return var4
         ? var1.update(
            "Properties",
            var0 -> {
               String var3 = var0.get("east").asString("none");
               String var4x = var0.get("west").asString("none");
               String var5 = var0.get("north").asString("none");
               String var6 = var0.get("south").asString("none");
               boolean var7 = method_44512(var3) || method_44512(var4x);
               boolean var8 = method_44512(var5) || method_44512(var6);
               String var9 = !method_44512(var3) && !var8 ? "side" : var3;
               String var10 = !method_44512(var4x) && !var8 ? "side" : var4x;
               String var11 = !method_44512(var5) && !var7 ? "side" : var5;
               String var12 = !method_44512(var6) && !var7 ? "side" : var6;
               return var0.update("east", var1x -> var1x.createString(var9))
                  .update("west", var1x -> var1x.createString(var10))
                  .update("north", var1x -> var1x.createString(var11))
                  .update("south", var1x -> var1x.createString(var12));
            }
         )
         : var1;
   }

   private static boolean method_44512(String var0) {
      return !"none".equals(var0);
   }
}
