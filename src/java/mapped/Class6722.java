package mapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.DSL.TypeReference;
import com.mojang.datafixers.schemas.Schema;

public final class Class6722 extends Class6717 {
   private static String[] field29438;

   public Class6722(Schema var1, boolean var2, String var3, TypeReference var4, String var5) {
      super(var1, var2, var3, var4, var5);
   }

   @Override
   public Typed<?> method20508(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), Class7467::method24180);
   }
}
