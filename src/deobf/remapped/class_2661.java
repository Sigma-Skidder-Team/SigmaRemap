package remapped;

import com.mojang.datafixers.schemas.Schema;
import java.util.function.Function;

public final class class_2661 extends class_3807 {
   private static String[] field_13101;

   public class_2661(Schema var1, String var2, Function var3) {
      super(var1, var2);
      this.field_13102 = var3;
   }

   @Override
   public String method_17728(String var1) {
      return (String)this.field_13102.apply(var1);
   }
}
