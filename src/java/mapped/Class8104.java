package mapped;

import com.google.common.collect.Lists;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.datafixers.util.Unit;
import com.mojang.serialization.Dynamic;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Class8104 extends DataFix {
   public Class8104(Schema var1, boolean var2) {
      super(var1, var2);
   }

   public TypeRewriteRule makeRule() {
      return this.method28071(this.getInputSchema().getTypeRaw(Class8239.field35387));
   }

   private <IS> TypeRewriteRule method28071(Type<IS> var1) {
      Type var4 = DSL.and(DSL.optional(DSL.field("Equipment", DSL.list(var1))), DSL.remainderType());
      Type var5 = DSL.and(DSL.optional(DSL.field("ArmorItems", DSL.list(var1))), DSL.optional(DSL.field("HandItems", DSL.list(var1))), DSL.remainderType());
      OpticFinder var6 = DSL.typeFinder(var4);
      OpticFinder var7 = DSL.fieldFinder("Equipment", DSL.list(var1));
      return this.fixTypeEverywhereTyped(
         "EntityEquipmentToArmorAndHandFix",
         this.getInputSchema().getType(Class8239.field35391),
         this.getOutputSchema().getType(Class8239.field35391),
         var4x -> {
            Either<Object, Unit> var7x = Either.right(DSL.unit());
            Either<Object, Unit> var8 = Either.right(DSL.unit());
            Dynamic<?> var9 = (Dynamic)var4x.getOrCreate(DSL.remainderFinder());
            Optional var10 = var4x.getOptional(var7);
            if (var10.isPresent()) {
               List var11 = (List)var10.get();
               Object var12 = ((Pair)var1.read(var9.emptyMap())
                     .result()
                     .orElseThrow(() -> new IllegalStateException("Could not parse newly created empty itemstack.")))
                  .getFirst();
               if (!var11.isEmpty()) {
                  var7x = Either.left(Lists.newArrayList(new Object[]{var11.get(0), var12}));
               }

               if (var11.size() > 1) {
                  ArrayList var13 = Lists.newArrayList(new Object[]{var12, var12, var12, var12});

                  for (int var14 = 1; var14 < Math.min(var11.size(), 5); var14++) {
                     var13.set(var14 - 1, var11.get(var14));
                  }

                  var8 = Either.left(var13);
               }
            }

            Dynamic var16 = var9;
            Optional var17 = var9.get("DropChances").asStreamOpt().result();
            if (var17.isPresent()) {
               Iterator var18 = Stream.<Dynamic>concat((Stream<? extends Dynamic>)var17.get(), Stream.generate(() -> var16.createInt(0))).iterator();
               float var19 = ((Dynamic)var18.next()).asFloat(0.0F);
               if (!var9.get("HandDropChances").result().isPresent()) {
                  Dynamic var15 = var9.createList(Stream.<Float>of(var19, 0.0F).map(var9::createFloat));
                  var9 = var9.set("HandDropChances", var15);
               }

               if (!var9.get("ArmorDropChances").result().isPresent()) {
                  Dynamic var20 = var9.createList(
                     Stream.<Float>of(
                           ((Dynamic)var18.next()).asFloat(0.0F),
                           ((Dynamic)var18.next()).asFloat(0.0F),
                           ((Dynamic)var18.next()).asFloat(0.0F),
                           ((Dynamic)var18.next()).asFloat(0.0F)
                        )
                        .map(var9::createFloat)
                  );
                  var9 = var9.set("ArmorDropChances", var20);
               }

               var9 = var9.remove("DropChances");
            }

            return var4x.set(var6, var5, Pair.of(var7x, Pair.of(var8, var9)));
         }
      );
   }
}
