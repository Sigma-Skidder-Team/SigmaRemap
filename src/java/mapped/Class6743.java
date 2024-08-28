package mapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class Class6743 extends Class6717 {
   public Class6743(Schema var1, boolean var2) {
      super(var1, var2, "BlockEntityKeepPacked", Class8239.field35386, "DUMMY");
   }

   private static Dynamic<?> method20556(Dynamic<?> var0) {
      return var0.set("keepPacked", var0.createBoolean(true));
   }

   @Override
   public Typed<?> method20508(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), Class6743::method20556);
   }
}
