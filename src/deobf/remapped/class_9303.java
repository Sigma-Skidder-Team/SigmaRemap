package remapped;

import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import java.util.HashMap;
import java.util.Locale;
import javax.annotation.Nullable;

public class class_9303 implements TypeAdapterFactory {
   private static String[] field_47525;

   @Nullable
   public <T> TypeAdapter<T> create(Gson var1, TypeToken<T> var2) {
      Class var5 = var2.getRawType();
      if (!var5.isEnum()) {
         return null;
      } else {
         HashMap var6 = Maps.newHashMap();

         for (Object var10 : var5.getEnumConstants()) {
            var6.put(this.method_42955(var10), var10);
         }

         return new class_9664(this, var6);
      }
   }

   private String method_42955(Object var1) {
      return !(var1 instanceof Enum) ? var1.toString().toLowerCase(Locale.ROOT) : ((Enum)var1).name().toLowerCase(Locale.ROOT);
   }
}
