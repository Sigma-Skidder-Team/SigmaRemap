package remapped;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;

public class class_6119 extends class_7449 {
   public class_6119(Schema var1, String var2) {
      super(var1, false, "Memory expiry data fix (" + var2 + ")", class_4002.field_19444, var2);
   }

   @Override
   public Typed<?> method_33892(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), this::method_28106);
   }

   public Dynamic<?> method_28106(Dynamic<?> var1) {
      return var1.update("Brain", this::method_28108);
   }

   private Dynamic<?> method_28108(Dynamic<?> var1) {
      return var1.update("memories", this::method_28107);
   }

   private Dynamic<?> method_28107(Dynamic<?> var1) {
      return var1.updateMapValues(this::method_28105);
   }

   private Pair<Dynamic<?>, Dynamic<?>> method_28105(Pair<Dynamic<?>, Dynamic<?>> var1) {
      return var1.mapSecond(this::method_28104);
   }

   private Dynamic<?> method_28104(Dynamic<?> var1) {
      return var1.createMap(ImmutableMap.of(var1.createString("value"), var1));
   }
}
