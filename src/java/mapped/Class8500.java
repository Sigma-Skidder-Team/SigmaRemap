package mapped;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

public class Class8500 extends TypeAdapter<Class2063> {
   private static String[] field37177;

   public void write(JsonWriter var1, Class2063 var2) throws IOException {
      var1.value(Class2063.method8719(var2));
   }

   public Class2063 read(JsonReader var1) throws IOException {
      return Class2063.method8718(var1.nextString());
   }
}
