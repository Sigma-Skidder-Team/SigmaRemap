package remapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;

public class class_2860 extends class_7449 {
   public class_2860(Schema var1, boolean var2) {
      super(var1, var2, "BlockEntityShulkerBoxColorFix", class_4002.field_19434, "minecraft:shulker_box");
   }

   @Override
   public Typed<?> method_33892(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), var0 -> var0.remove("Color"));
   }
}
