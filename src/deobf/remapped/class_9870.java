package remapped;

import com.google.common.collect.ImmutableMap;
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
import java.util.stream.Stream;

public class class_9870 extends DataFix {
   public class_9870(Schema var1, boolean var2) {
      super(var1, var2);
   }

   public TypeRewriteRule makeRule() {
      Type var3 = this.getInputSchema().getType(class_4002.field_19433);
      OpticFinder var4 = DSL.fieldFinder("id", DSL.named(class_4002.field_19439.typeName(), class_5178.method_23741()));
      OpticFinder var5 = var3.findField("tag");
      OpticFinder var6 = var5.type().findField("BlockEntityTag");
      return this.fixTypeEverywhereTyped(
         "ItemBannerColorFix",
         var3,
         var3x -> {
            Optional var6x = var3x.getOptional(var4);
            if (var6x.isPresent() && Objects.equals(((Pair)var6x.get()).getSecond(), "minecraft:banner")) {
               Dynamic var7 = (Dynamic)var3x.get(DSL.remainderFinder());
               Optional var8 = var3x.getOptionalTyped(var5);
               if (var8.isPresent()) {
                  Typed var9 = (Typed)var8.get();
                  Optional var10 = var9.getOptionalTyped(var6);
                  if (var10.isPresent()) {
                     Typed var11 = (Typed)var10.get();
                     Dynamic var12 = (Dynamic)var9.get(DSL.remainderFinder());
                     Dynamic var13 = (Dynamic)var11.getOrCreate(DSL.remainderFinder());
                     if (var13.get("Base").asNumber().result().isPresent()) {
                        var7 = var7.set("Damage", var7.createShort((short)(var13.get("Base").asInt(0) & 15)));
                        Optional var14 = var12.get("display").result();
                        if (var14.isPresent()) {
                           Dynamic var15 = (Dynamic)var14.get();
                           Dynamic var16 = var15.createMap(
                              ImmutableMap.of(var15.createString("Lore"), var15.createList(Stream.<Dynamic>of(var15.createString("(+NBT"))))
                           );
                           if (Objects.equals(var15, var16)) {
                              return var3x.set(DSL.remainderFinder(), var7);
                           }
                        }

                        var13.remove("Base");
                        return var3x.set(DSL.remainderFinder(), var7).set(var5, var9.set(var6, var11.set(DSL.remainderFinder(), var13)));
                     }
                  }
               }

               return var3x.set(DSL.remainderFinder(), var7);
            } else {
               return var3x;
            }
         }
      );
   }
}
