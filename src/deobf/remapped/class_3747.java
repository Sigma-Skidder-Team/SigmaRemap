package remapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.List.ListType;
import com.mojang.datafixers.types.templates.TaggedChoice.TaggedChoiceType;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_3747 extends DataFix {
   private static final Logger field_18322 = LogManager.getLogger();

   public class_3747(Schema var1, boolean var2) {
      super(var1, var2);
   }

   public TypeRewriteRule makeRule() {
      Type var3 = this.getOutputSchema().getType(class_4002.field_19449);
      Type var4 = var3.findFieldType("Level");
      Type var5 = var4.findFieldType("TileEntities");
      if (var5 instanceof ListType) {
         ListType var6 = (ListType)var5;
         OpticFinder var7 = DSL.fieldFinder("TileEntities", var6);
         Type var8 = this.getInputSchema().getType(class_4002.field_19449);
         OpticFinder var9 = var8.findField("Level");
         OpticFinder var10 = var9.type().findField("Sections");
         Type var11 = var10.type();
         if (var11 instanceof ListType) {
            Type var12 = ((ListType)var11).getElement();
            OpticFinder var13 = DSL.typeFinder(var12);
            return TypeRewriteRule.seq(
               new class_1812(this.getOutputSchema(), "AddTrappedChestFix", class_4002.field_19434).makeRule(),
               this.fixTypeEverywhereTyped(
                  "Trapped Chest fix",
                  var8,
                  var5x -> var5x.updateTyped(
                        var9,
                        var4xx -> {
                           Optional var7x = var4xx.getOptionalTyped(var10);
                           if (!var7x.isPresent()) {
                              return var4xx;
                           } else {
                              List var8x = ((Typed)var7x.get()).getAllTyped(var13);
                              IntOpenHashSet var9x = new IntOpenHashSet();

                              for (Typed var11x : var8x) {
                                 class_6997 var12x = new class_6997(var11x, this.getInputSchema());
                                 if (!var12x.method_9086()) {
                                    for (int var13x = 0; var13x < 4096; var13x++) {
                                       int var14 = var12x.method_9087(var13x);
                                       if (var12x.method_31999(var14)) {
                                          var9x.add(var12x.method_9082() << 12 | var13x);
                                       }
                                    }
                                 }
                              }

                              Dynamic var15 = (Dynamic)var4xx.get(DSL.remainderFinder());
                              int var16 = var15.get("xPos").asInt(0);
                              int var17 = var15.get("zPos").asInt(0);
                              TaggedChoiceType var18 = this.getInputSchema().findChoiceType(class_4002.field_19434);
                              return var4xx.updateTyped(
                                 var7,
                                 var4xxx -> var4xxx.updateTyped(
                                       var18.finder(),
                                       var4xxxx -> {
                                          Dynamic var7xx = (Dynamic)var4xxxx.getOrCreate(DSL.remainderFinder());
                                          int var8xx = var7xx.get("x").asInt(0) - (var16 << 4);
                                          int var9xx = var7xx.get("y").asInt(0);
                                          int var10x = var7xx.get("z").asInt(0) - (var17 << 4);
                                          return !var9x.contains(class_8656.method_39691(var8xx, var9xx, var10x))
                                             ? var4xxxx
                                             : var4xxxx.update(var18.finder(), var0xx -> var0xx.mapFirst(var0xxx -> {
                                                   if (!Objects.equals(var0xxx, "minecraft:chest")) {
                                                      field_18322.warn("Block Entity was expected to be a chest");
                                                   }

                                                   return "minecraft:trapped_chest";
                                                }));
                                       }
                                    )
                              );
                           }
                        }
                     )
               )
            );
         } else {
            throw new IllegalStateException("Expecting sections to be a list.");
         }
      } else {
         throw new IllegalStateException("Tile entity type is not a list type.");
      }
   }
}
