package remapped;

import com.google.common.collect.Lists;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.datafixers.util.Unit;
import com.mojang.serialization.Dynamic;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class class_9187 extends DataFix {
   public class_9187(Schema var1, boolean var2) {
      super(var1, var2);
   }

   public TypeRewriteRule makeRule() {
      return this.method_42349(this.getOutputSchema().getTypeRaw(class_4002.field_19437));
   }

   private <R> TypeRewriteRule method_42349(Type<R> var1) {
      Type var4 = DSL.and(DSL.optional(DSL.field("RecipesUsed", DSL.and(DSL.compoundList(var1, DSL.intType()), DSL.remainderType()))), DSL.remainderType());
      OpticFinder var5 = DSL.namedChoice("minecraft:furnace", this.getInputSchema().getChoiceType(class_4002.field_19434, "minecraft:furnace"));
      OpticFinder var6 = DSL.namedChoice("minecraft:blast_furnace", this.getInputSchema().getChoiceType(class_4002.field_19434, "minecraft:blast_furnace"));
      OpticFinder var7 = DSL.namedChoice("minecraft:smoker", this.getInputSchema().getChoiceType(class_4002.field_19434, "minecraft:smoker"));
      Type var8 = this.getOutputSchema().getChoiceType(class_4002.field_19434, "minecraft:furnace");
      Type var9 = this.getOutputSchema().getChoiceType(class_4002.field_19434, "minecraft:blast_furnace");
      Type var10 = this.getOutputSchema().getChoiceType(class_4002.field_19434, "minecraft:smoker");
      Type var11 = this.getInputSchema().getType(class_4002.field_19434);
      Type var12 = this.getOutputSchema().getType(class_4002.field_19434);
      return this.fixTypeEverywhereTyped(
         "FurnaceRecipesFix",
         var11,
         var12,
         var9x -> var9x.updateTyped(var5, var8, var3x -> this.method_42351(var1, var4, var3x))
               .updateTyped(var6, var9, var3x -> this.method_42351(var1, var4, var3x))
               .updateTyped(var7, var10, var3x -> this.method_42351(var1, var4, var3x))
      );
   }

   private <R> Typed<?> method_42351(Type<R> var1, Type<Pair<Either<Pair<List<Pair<R, Integer>>, Dynamic<?>>, Unit>, Dynamic<?>>> var2, Typed<?> var3) {
      Dynamic var6 = (Dynamic)var3.getOrCreate(DSL.remainderFinder());
      int var7 = var6.get("RecipesUsedSize").asInt(0);
      var6 = var6.remove("RecipesUsedSize");
      ArrayList var8 = Lists.newArrayList();

      for (int var9 = 0; var9 < var7; var9++) {
         String var10 = "RecipeLocation" + var9;
         String var11 = "RecipeAmount" + var9;
         Optional var12 = var6.get(var10).result();
         int var13 = var6.get(var11).asInt(0);
         if (var13 > 0) {
            var12.ifPresent(var3x -> {
               Optional var6x = var1.read(var3x).result();
               var6x.ifPresent(var2xx -> var8.add(Pair.of(var2xx.getFirst(), var13)));
            });
         }

         var6 = var6.remove(var10).remove(var11);
      }

      return var3.set(DSL.remainderFinder(), var2, Pair.of(Either.left(Pair.of(var8, var6.emptyMap())), var6));
   }
}
