package mapped;

import com.google.gson.Gson;
import com.google.gson.JsonElement;

public class Class8107 {
   private static String[] field34860;
   public static final Class8107 field34861 = new Class8107();
   private final Gson field34862 = Class8746.method31555().create();

   public final JsonElement method28095(ILootCondition[] var1) {
      return this.field34862.toJsonTree(var1);
   }
}
