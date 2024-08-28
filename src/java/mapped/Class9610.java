package mapped;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParser;

public final class Class9610 {
   private static String[] field44937;
   private static final JsonParser field44938 = new JsonParser();
   private static final Gson field44939 = method37358().create();

   public static Gson method37357() {
      return field44939;
   }

   public static GsonBuilder method37358() {
      return new GsonBuilder();
   }

   public static JsonParser method37359() {
      return field44938;
   }
}
