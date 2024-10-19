package mapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import net.minecraft.util.datafix.TypeReferences;

import java.util.List;

public class Class6733 extends Class6717 {
   public Class6733(Schema var1) {
      super(var1, false, "EntityShulkerRotationFix", TypeReferences.ENTITY, "minecraft:shulker");
   }

   public Dynamic<?> method20544(Dynamic<?> var1) {
      List<Double> var4 = var1.get("Rotation").asList(var0 -> var0.asDouble(180.0));
      if (var4.isEmpty()) {
         return var1;
      } else {
         var4.set(0, (Double)var4.get(0) - 180.0);
         return var1.set("Rotation", var1.createList(var4.stream().map(var1::createDouble)));
      }
   }

   @Override
   public Typed<?> method20508(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), this::method20544);
   }
}
