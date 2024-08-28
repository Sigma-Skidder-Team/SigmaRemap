package mapped;

import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import java.util.HashMap;
import java.util.Locale;
import javax.annotation.Nullable;

public class Class9681 implements TypeAdapterFactory {
   private static String[] field45274;

   @Nullable
   public <T> TypeAdapter<T> create(Gson var1, TypeToken<T> var2) {
      Class var5 = var2.getRawType();
      if (!var5.isEnum()) {
         return null;
      } else {
         HashMap var6 = Maps.newHashMap();

         for (Object var10 : var5.getEnumConstants()) {
            var6.put(this.method37906(var10), var10);
         }

         return new Class8501(this, var6);
      }
   }

   private String method37906(Object var1) {
      return !(var1 instanceof Enum) ? var1.toString().toLowerCase(Locale.ROOT) : ((Enum)var1).name().toLowerCase(Locale.ROOT);
   }

   // $VF: synthetic method
   public static String method37907(Class9681 var0, Object var1) {
      return var0.method37906(var1);
   }
}
