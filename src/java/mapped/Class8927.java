package mapped;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;

public class Class8927 extends Class8924 {
   private static String[] field40404;
   private final Class8992<?> field40405;

   public Class8927(Class8992<?> var1) {
      this.field40405 = var1;
   }

   @Override
   public boolean method32624(Class8992<?> var1) {
      return this.field40405 == var1;
   }

   @Override
   public JsonElement method32625() {
      return new JsonPrimitive(Class2348.field16074.method9181(this.field40405).toString());
   }
}
