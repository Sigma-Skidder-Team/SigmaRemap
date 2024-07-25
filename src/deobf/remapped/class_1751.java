package remapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;

public abstract class class_1751 extends class_6131 {
   public class_1751(String var1, Schema var2, boolean var3) {
      super(var1, var2, var3);
   }

   @Override
   public Pair<String, Typed<?>> method_28172(String var1, Typed<?> var2) {
      Pair var5 = this.method_7809(var1, (Dynamic<?>)var2.getOrCreate(DSL.remainderFinder()));
      return Pair.of(var5.getFirst(), var2.set(DSL.remainderFinder(), var5.getSecond()));
   }

   public abstract Pair<String, Dynamic<?>> method_7809(String var1, Dynamic<?> var2);
}
