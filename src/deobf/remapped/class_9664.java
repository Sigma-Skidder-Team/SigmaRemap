package remapped;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Map;
import javax.annotation.Nullable;

public class class_9664 extends TypeAdapter<T> {
   private static String[] field_49223;

   public class_9664(class_9303 var1, Map var2) {
      this.field_49224 = var1;
      this.field_49225 = var2;
   }

   public void write(JsonWriter var1, T var2) throws IOException {
      if (var2 != null) {
         var1.value(class_9303.method_42954(this.field_49224, var2));
      } else {
         var1.nullValue();
      }
   }

   @Nullable
   public T read(JsonReader var1) throws IOException {
      if (var1.peek() != JsonToken.NULL) {
         return (T)this.field_49225.get(var1.nextString());
      } else {
         var1.nextNull();
         return null;
      }
   }
}
