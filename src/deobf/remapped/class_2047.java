package remapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class class_2047 extends class_7449 {
   public class_2047(Schema var1, boolean var2) {
      super(var1, var2, "BlockEntityKeepPacked", class_4002.field_19434, "DUMMY");
   }

   private static Dynamic<?> method_9571(Dynamic<?> var0) {
      return var0.set("keepPacked", var0.createBoolean(true));
   }

   @Override
   public Typed<?> method_33892(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), class_2047::method_9571);
   }
}
