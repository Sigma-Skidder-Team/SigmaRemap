package mapped;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;

public class Class6720 extends Class6717 {
   public Class6720(Schema var1, String var2) {
      super(var1, false, "Memory expiry data fix (" + var2 + ")", Class8239.field35391, var2);
   }

   @Override
   public Typed<?> method20508(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), this::method20514);
   }

   public Dynamic<?> method20514(Dynamic<?> var1) {
      return var1.update("Brain", this::method20515);
   }

   private Dynamic<?> method20515(Dynamic<?> var1) {
      return var1.update("memories", this::method20516);
   }

   private Dynamic<?> method20516(Dynamic<?> var1) {
      return var1.updateMapValues(this::method20517);
   }

   private Pair<Dynamic<?>, Dynamic<?>> method20517(Pair<Dynamic<?>, Dynamic<?>> var1) {
      return var1.mapSecond(this::method20518);
   }

   private Dynamic<?> method20518(Dynamic<?> var1) {
      return var1.createMap(ImmutableMap.of(var1.createString("value"), var1));
   }
}
