package mapped;

import com.mojang.datafixers.schemas.Schema;
import java.util.function.Function;

public final class Class7326 extends Class7325 {
   private static String[] field31407;
   public final Function field31408;

   public Class7326(Schema var1, String var2, Function var3) {
      super(var1, var2);
      this.field31408 = var3;
   }

   @Override
   public String method23220(String var1) {
      return (String)this.field31408.apply(var1);
   }
}
