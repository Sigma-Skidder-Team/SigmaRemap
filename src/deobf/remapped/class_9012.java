package remapped;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParser;

public final class class_9012 {
   private static String[] field_46109;
   private static final JsonParser field_46111 = new JsonParser();
   private static final Gson field_46110 = method_41351().create();

   public static Gson method_41350() {
      return field_46110;
   }

   public static GsonBuilder method_41351() {
      return new GsonBuilder();
   }

   public static JsonParser method_41352() {
      return field_46111;
   }
}
