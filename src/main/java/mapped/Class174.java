package mapped;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;

public class Class174 implements Class172 {
   private static String[] field557;
   private final boolean field558;

   public Class174(boolean var1) {
      this.field558 = var1;
   }

   @Override
   public JsonElement method501() {
      return new JsonPrimitive(this.field558);
   }

   public boolean test(Class2006 var1) {
      return var1.method8489() == this.field558;
   }
}
