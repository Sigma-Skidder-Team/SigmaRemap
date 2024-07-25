package remapped;

import com.mojang.datafixers.schemas.Schema;
import java.util.function.Function;

public final class class_4956 extends class_1795 {
   private static String[] field_25641;

   public class_4956(Schema var1, String var2, Function var3) {
      super(var1, var2);
      this.field_25642 = var3;
   }

   @Override
   public String method_7992(String var1) {
      return (String)this.field_25642.apply(var1);
   }
}
