package mapped;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Map;
import javax.annotation.Nullable;

public class Class8501<T> extends TypeAdapter<T> {
   private static String[] field37178;
   public final Map field37179;
   public final Class9681 field37180;

   public Class8501(Class9681 var1, Map var2) {
      this.field37180 = var1;
      this.field37179 = var2;
   }

   public void write(JsonWriter var1, T var2) throws IOException {
      if (var2 != null) {
         var1.value(Class9681.method37907(this.field37180, var2));
      } else {
         var1.nullValue();
      }
   }

   @Nullable
   public T read(JsonReader var1) throws IOException {
      if (var1.peek() != JsonToken.NULL) {
         return (T)this.field37179.get(var1.nextString());
      } else {
         var1.nextNull();
         return null;
      }
   }
}
