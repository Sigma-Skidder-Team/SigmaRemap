package remapped;

import com.google.gson.Gson;

public class class_5380 {
   private static String[] field_27460;
   private final Gson field_27459 = new Gson();

   public String method_24512(class_7818 var1) {
      return this.field_27459.toJson(var1);
   }

   public <T extends class_7818> T method_24513(String var1, Class<T> var2) {
      return (T)this.field_27459.fromJson(var1, var2);
   }
}
