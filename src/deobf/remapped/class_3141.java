package remapped;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.FieldFinder;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.CompoundList.CompoundListType;
import com.mojang.datafixers.types.templates.TaggedChoice.TaggedChoiceType;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.datafixers.util.Unit;
import com.mojang.serialization.Dynamic;
import java.util.List;

public class class_3141 extends DataFix {
   public class_3141(Schema var1, boolean var2) {
      super(var1, var2);
   }

   private static <A> Type<Pair<A, Dynamic<?>>> method_14528(String var0, Type<A> var1) {
      return DSL.and(DSL.field(var0, var1), DSL.remainderType());
   }

   private static <A> Type<Pair<Either<A, Unit>, Dynamic<?>>> method_14525(String var0, Type<A> var1) {
      return DSL.and(DSL.optional(DSL.field(var0, var1)), DSL.remainderType());
   }

   private static <A1, A2> Type<Pair<Either<A1, Unit>, Pair<Either<A2, Unit>, Dynamic<?>>>> method_14526(String var0, Type<A1> var1, String var2, Type<A2> var3) {
      return DSL.and(DSL.optional(DSL.field(var0, var1)), DSL.optional(DSL.field(var2, var3)), DSL.remainderType());
   }

   public TypeRewriteRule makeRule() {
      Schema var3 = this.getInputSchema();
      TaggedChoiceType var4 = new TaggedChoiceType(
         "type",
         DSL.string(),
         ImmutableMap.of(
            "minecraft:debug",
            DSL.remainderType(),
            "minecraft:flat",
            method_14525(
               "settings",
               method_14526("biome", var3.getType(class_4002.field_19440), "layers", DSL.list(method_14525("block", var3.getType(class_4002.field_19432))))
            ),
            "minecraft:noise",
            method_14526(
               "biome_source",
               DSL.taggedChoiceType(
                  "type",
                  DSL.string(),
                  ImmutableMap.of(
                     "minecraft:fixed",
                     method_14528("biome", var3.getType(class_4002.field_19440)),
                     "minecraft:multi_noise",
                     DSL.list(method_14528("biome", var3.getType(class_4002.field_19440))),
                     "minecraft:checkerboard",
                     method_14528("biomes", DSL.list(var3.getType(class_4002.field_19440))),
                     "minecraft:vanilla_layered",
                     DSL.remainderType(),
                     "minecraft:the_end",
                     DSL.remainderType()
                  )
               ),
               "settings",
               DSL.or(DSL.string(), method_14526("default_block", var3.getType(class_4002.field_19432), "default_fluid", var3.getType(class_4002.field_19432)))
            )
         )
      );
      CompoundListType var5 = DSL.compoundList(class_5178.method_23741(), method_14528("generator", var4));
      Type var6 = DSL.and(var5, DSL.remainderType());
      Type var7 = var3.getType(class_4002.field_19441);
      FieldFinder var8 = new FieldFinder("dimensions", var6);
      if (var7.findFieldType("dimensions").equals(var6)) {
         OpticFinder var9 = var5.finder();
         return this.fixTypeEverywhereTyped("MissingDimensionFix", var7, var4x -> var4x.updateTyped(var8, var4xx -> var4xx.updateTyped(var9, var3xxx -> {
                  if (var3xxx.getValue() instanceof List) {
                     if (!((List)var3xxx.getValue()).isEmpty()) {
                        return var3xxx;
                     } else {
                        Dynamic var6x = (Dynamic)var4x.get(DSL.remainderFinder());
                        Dynamic var7x = this.method_14527(var6x);
                        return (Typed)DataFixUtils.orElse(var5.readTyped(var7x).result().map(Pair::getFirst), var3xxx);
                     }
                  } else {
                     throw new IllegalStateException("List exptected");
                  }
               })));
      } else {
         throw new IllegalStateException();
      }
   }

   private <T> Dynamic<T> method_14527(Dynamic<T> var1) {
      long var4 = var1.get("seed").asLong(0L);
      return new Dynamic(var1.getOps(), class_9002.method_41312(var1, var4, class_9002.<T>method_41310(var1, var4), false));
   }
}
