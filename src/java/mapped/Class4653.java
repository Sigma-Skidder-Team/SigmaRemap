package mapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;

public abstract class Class4653 extends EntityRename {
   public Class4653(String var1, Schema var2, boolean var3) {
      super(var1, var2, var3);
   }

   @Override
   public Pair<String, Typed<?>> method14620(String var1, Typed<?> var2) {
      Pair<String, Dynamic<?>> var5 = this.method14619(var1, var2.getOrCreate(DSL.remainderFinder()));
      return Pair.of(var5.getFirst(), var2.set(DSL.remainderFinder(), var5.getSecond()));
   }

   public abstract Pair<String, Dynamic<?>> method14619(String var1, Dynamic<?> var2);
}
