package remapped;

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
import java.util.Objects;
import java.util.Optional;

public class class_6479 extends DataFix {
   public class_6479(Schema var1, boolean var2) {
      super(var1, var2);
   }

   public TypeRewriteRule makeRule() {
      Schema var3 = this.getInputSchema();
      Schema var4 = this.getOutputSchema();
      Type var5 = var3.getTypeRaw(class_4002.field_19451);
      Type var6 = var4.getTypeRaw(class_4002.field_19451);
      Type var7 = var3.getTypeRaw(class_4002.field_19444);
      return this.method_29499(var3, var4, var5, var6, var7);
   }

   private <OldEntityTree, NewEntityTree, Entity> TypeRewriteRule method_29499(
      Schema var1, Schema var2, Type<OldEntityTree> var3, Type<NewEntityTree> var4, Type<Entity> var5
   ) {
      Type var8 = DSL.named(class_4002.field_19451.typeName(), DSL.and(DSL.optional(DSL.field("Riding", var3)), var5));
      Type var9 = DSL.named(class_4002.field_19451.typeName(), DSL.and(DSL.optional(DSL.field("Passengers", DSL.list(var4))), var5));
      Type var10 = var1.getType(class_4002.field_19451);
      Type var11 = var2.getType(class_4002.field_19451);
      if (Objects.equals(var10, var8)) {
         if (var11.equals(var9, true, true)) {
            OpticFinder var12 = DSL.typeFinder(var8);
            OpticFinder var13 = DSL.typeFinder(var9);
            OpticFinder var14 = DSL.typeFinder(var4);
            Type var15 = var1.getType(class_4002.field_19436);
            Type var16 = var2.getType(class_4002.field_19436);
            return TypeRewriteRule.seq(
               this.fixTypeEverywhere(
                  "EntityRidingToPassengerFix",
                  var8,
                  var9,
                  var5x -> var6 -> {
                        Optional var9x = Optional.empty();
                        Pair var10x = var6;

                        while (true) {
                           Either var11x = (Either)DataFixUtils.orElse(
                              var9x.<Either>map(
                                 var4xxx -> {
                                    Typed var7 = (Typed)var4.pointTyped(var5x).orElseThrow(() -> new IllegalStateException("Could not create new entity tree"));
                                    Object var8x = var7.set(var13, var4xxx)
                                       .getOptional(var14)
                                       .orElseThrow(() -> new IllegalStateException("Should always have an entity tree here"));
                                    return Either.left(ImmutableList.of(var8x));
                                 }
                              ),
                              Either.right(DSL.unit())
                           );
                           var9x = Optional.<Pair>of(Pair.of(class_4002.field_19451.typeName(), Pair.of(var11x, ((Pair)var10x.getSecond()).getSecond())));
                           Optional var12x = ((Either)((Pair)var10x.getSecond()).getFirst()).left();
                           if (!var12x.isPresent()) {
                              return (Pair)var9x.orElseThrow(() -> new IllegalStateException("Should always have an entity tree here"));
                           }

                           var10x = (Pair)new Typed(var3, var5x, var12x.get())
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
