package remapped;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

public class class_4832 extends TypeAdapter<class_5848> {
   private static String[] field_24116;

   public void write(JsonWriter var1, class_5848 var2) throws IOException {
      var1.value(class_5848.method_26663(var2));
   }

   public class_5848 read(JsonReader var1) throws IOException {
      return class_5848.method_26664(var1.nextString());
   }
}
