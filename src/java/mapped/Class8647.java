package mapped;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import java.util.Optional;

public class Class8647 extends Class8646 {
   private static String[] field38927;
   private final String field38928;

   public Class8647(String var1, String var2) {
      super(var1);
      this.field38928 = var2;
   }

   @Override
   public <T extends Comparable<T>> boolean method31076(Class7378<?, ?> var1, Class8550<T> var2) {
      Comparable var5 = var1.get(var2);
      Optional var6 = var2.method30476(this.field38928);
      return var6.isPresent() && var5.compareTo(var6.get()) == 0;
   }

   @Override
   public JsonElement method31077() {
      return new JsonPrimitive(this.field38928);
   }
}
