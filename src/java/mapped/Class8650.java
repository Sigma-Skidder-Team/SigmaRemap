package mapped;

import com.google.gson.Gson;

public class Class8650 {
   private static String[] field38984;
   private final Gson field38985 = new Gson();

   public String method31093(Class6112 var1) {
      return this.field38985.toJson(var1);
   }

   public <T extends Class6112> T method31094(String var1, Class<T> var2) {
      return (T)this.field38985.fromJson(var1, var2);
   }
}
