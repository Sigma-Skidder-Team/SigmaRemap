package mapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Optional;

public class Class6734 extends Class6717 {
   public Class6734(Schema var1, boolean var2) {
      super(var1, var2, "EntityHorseSaddleFix", TypeReferences.ENTITY, "EntityHorse");
   }

   @Override
   public Typed<?> method20508(Typed<?> var1) {
      OpticFinder<Pair<String, String>> var4 = DSL.fieldFinder("id", DSL.named(TypeReferences.field35393.typeName(), Class3639.method12354()));
      Type<?> var5 = this.getInputSchema().getTypeRaw(TypeReferences.field35387);
      OpticFinder<?> var6 = DSL.fieldFinder("SaddleItem", var5);
      Optional<? extends Typed<?>> var7 = var1.getOptionalTyped(var6);
      Dynamic<?>  var8 = var1.get(DSL.remainderFinder());
      if (!var7.isPresent() && var8.get("Saddle").asBoolean(false)) {
         Typed var9 = (Typed)var5.pointTyped(var1.getOps()).orElseThrow(IllegalStateException::new);
         var9 = var9.set(var4, Pair.of(TypeReferences.field35393.typeName(), "minecraft:saddle"));
         Dynamic var10 = var8.emptyMap();
         var10 = var10.set("Count", var10.createByte((byte)1));
         var10 = var10.set("Damage", var10.createShort((short)0));
         var9 = var9.set(DSL.remainderFinder(), var10);
         var8.remove("Saddle");
         return var1.set(var6, var9).set(DSL.remainderFinder(), var8);
      } else {
         return var1;
      }
   }
}
