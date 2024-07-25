package remapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.List.ListType;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class class_7129 extends DataFix {
   public class_7129(Schema var1, boolean var2) {
      super(var1, var2);
   }

   public TypeRewriteRule makeRule() {
      Type var3 = this.getOutputSchema().getType(class_4002.field_19449);
      Type var4 = var3.findFieldType("Level");
      Type var5 = var4.findFieldType("TileEntities");
      if (var5 instanceof ListType) {
         ListType var6 = (ListType)var5;
         return this.method_32749(var4, var6);
      } else {
         throw new IllegalStateException("Tile entity type is not a list type.");
      }
   }

   private <TE> TypeRewriteRule method_32749(Type<?> var1, ListType<TE> var2) {
      Type var5 = var2.getElement();
      OpticFinder var6 = DSL.fieldFinder("Level", var1);
      OpticFinder var7 = DSL.fieldFinder("TileEntities", var2);
      short var8 = 416;
      return TypeRewriteRule.seq(
         this.fixTypeEverywhere(
            "InjectBedBlockEntityType",
            this.getInputSchema().findChoiceType(class_4002.field_19434),
            this.getOutputSchema().findChoiceType(class_4002.field_19434),
            var0 -> var0x -> var0x
         ),
         this.fixTypeEverywhereTyped(
            "BedBlockEntityInjecter",
            this.getOutputSchema().getType(class_4002.field_19449),
            var3 -> {
               Typed var6x = var3.getTyped(var6);
               Dynamic var7x = (Dynamic)var6x.get(DSL.remainderFinder());
               int var8x = var7x.get("xPos").asInt(0);
               int var9 = var7x.get("zPos").asInt(0);
               ArrayList var10 = Lists.newArrayList((Iterable)var6x.getOrCreate(var7));
               List var11 = var7x.get("Sections").asList(Function.identity());

               for (int var12 = 0; var12 < var11.size(); var12++) {
                  Dynamic var13 = (Dynamic)var11.get(var12);
                  int var14 = var13.get("Y").asInt(0);
                  Stream var15 = var13.get("Blocks").asStream().<Integer>map(var0x -> var0x.asInt(0));
                  int var16 = 0;

                  for (int var18 : var15::iterator) {
                     if (416 == (var18 & 0xFF) << 4) {
                        int var19 = var16 & 15;
                        int var20 = var16 >> 8 & 15;
                        int var21 = var16 >> 4 & 15;
                        HashMap var22 = Maps.newHashMap();
                        var22.put(var13.createString("id"), var13.createString("minecraft:bed"));
                        var22.put(var13.createString("x"), var13.createInt(var19 + (var8x << 4)));
                        var22.put(var13.createString("y"), var13.createInt(var20 + (var14 << 4)));
                        var22.put(var13.createString("z"), var13.createInt(var21 + (var9 << 4)));
                        var22.put(var13.createString("color"), var13.createShort((short)14));
                        var10.add(
                           ((Pair)var5.read(var13.createMap(var22))
                                 .result()
                                 .orElseThrow(() -> new IllegalStateException("Could not parse newly created bed block entity.")))
                              .getFirst()
                        );
                     }

                     var16++;
                  }
               }

               return var10.isEmpty() ? var3 : var3.set(var6, var6x.set(var7, var10));
            }
         )
      );
   }
}
