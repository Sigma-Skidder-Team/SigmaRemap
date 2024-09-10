package mapped;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.datafixers.util.Unit;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Class8946 extends DataFix {
   public Class8946(Schema var1, boolean var2) {
      super(var1, var2);
   }

   public TypeRewriteRule makeRule() {
      Schema var3 = this.getInputSchema();
      Schema var4 = this.getOutputSchema();
      Type var5 = var3.getTypeRaw(TypeReferences.field35390);
      Type var6 = var4.getTypeRaw(TypeReferences.field35390);
      Type var7 = var3.getTypeRaw(TypeReferences.ENTITY);
      return this.method32688(var3, var4, var5, var6, var7);
   }

   private <OldEntityTree, NewEntityTree, Entity> TypeRewriteRule method32688(
      Schema var1, Schema var2, Type<OldEntityTree> var3, Type<NewEntityTree> var4, Type<Entity> var5
   ) {
      Type<Pair<String, Pair<Either<OldEntityTree, Unit>, Entity>>> var8 = DSL.named(TypeReferences.field35390.typeName(), DSL.and(DSL.optional(DSL.field("Riding", var3)), var5));
      Type<Pair<String, Pair<Either<List<NewEntityTree>, Unit>, Entity>>> var9 = DSL.named(TypeReferences.field35390.typeName(), DSL.and(DSL.optional(DSL.field("Passengers", DSL.list(var4))), var5));
      Type<?> var10 = var1.getType(TypeReferences.field35390);
      Type<?> var11 = var2.getType(TypeReferences.field35390);
      if (Objects.equals(var10, var8)) {
         if (var11.equals(var9, true, true)) {
            OpticFinder<Pair<String, Pair<Either<OldEntityTree, Unit>, Entity>>> var12 = DSL.typeFinder(var8);
            OpticFinder<Pair<String, Pair<Either<List<NewEntityTree>, Unit>, Entity>>> var13 = DSL.typeFinder(var9);
            OpticFinder<NewEntityTree> var14 = DSL.typeFinder(var4);
            Type<?> var15 = var1.getType(TypeReferences.field35377);
            Type<?> var16 = var2.getType(TypeReferences.field35377);
            return TypeRewriteRule.seq(
               this.fixTypeEverywhere(
                  "EntityRidingToPassengerFix",
                  var8,
                  var9,
                  var5x -> var6 -> {
                        Optional<Pair<String, Pair<Either<List<NewEntityTree>, Unit>, Entity>>> var9x = Optional.empty();
                        Pair<String, Pair<Either<OldEntityTree, Unit>, Entity>> var10x = var6;

                        while (true) {
                           Either<List<NewEntityTree>, Unit> var11x = DataFixUtils.orElse(var9x.map(
                                 var4xxx -> {
                                    Typed<NewEntityTree> var7 = var4.pointTyped(var5x).orElseThrow(() ->
                                            new IllegalStateException("Could not create new entity tree"));
                                    NewEntityTree var8x = var7.set(var13, var4xxx)
                                       .getOptional(var14)
                                       .orElseThrow(() -> new IllegalStateException("Should always have an entity tree here"));
                                    return Either.left(ImmutableList.of(var8x));
                                 }
                              ),
                              Either.right(DSL.unit())
                           );
                           var9x = Optional.of(Pair.of(TypeReferences.field35390.typeName(), Pair.of(var11x, (var10x.getSecond()).getSecond())));
                           Optional<OldEntityTree> var12x = var10x.getSecond().getFirst().left();
                           if (!var12x.isPresent()) {
                              return var9x.orElseThrow(() -> new IllegalStateException("Should always have an entity tree here"));
                           }

                           var10x = new Typed<>(var3, var5x, var12x.get())
                              .getOptional(var12)
                              .orElseThrow(() -> new IllegalStateException("Should always have an entity here"));
                        }
                     }
               ),
               this.writeAndRead("player RootVehicle injecter", var15, var16)
            );
         } else {
            throw new IllegalStateException("New entity type is not what was expected.");
         }
      } else {
         throw new IllegalStateException("Old entity type is not what was expected.");
      }
   }
}
