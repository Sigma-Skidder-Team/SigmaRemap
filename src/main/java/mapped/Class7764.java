package mapped;

import com.mojang.datafixers.schemas.Schema;
import java.util.function.Function;

public final class Class7764 extends Class7765 {
   private static String[] field33337;
   public final Function field33338;

   public Class7764(Schema var1, String var2, Function var3) {
      super(var1, var2);
      this.field33338 = var3;
   }

   @Override
   public String method25737(String var1) {
      return (String)this.field33338.apply(var1);
   }
}
