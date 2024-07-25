package remapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.DSL.TypeReference;
import com.mojang.datafixers.schemas.Schema;

public final class class_4277 extends class_7449 {
   private static String[] field_20716;

   public class_4277(Schema var1, boolean var2, String var3, TypeReference var4, String var5) {
      super(var1, var2, var3, var4, var5);
   }

   @Override
   public Typed<?> method_33892(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), class_1999::method_9283);
   }
}
