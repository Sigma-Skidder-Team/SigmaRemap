package mapped;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;

public class Class173 implements Class172 {
   private static String[] field555;
   private final Object2BooleanMap<String> field556;

   public Class173(Object2BooleanMap<String> var1) {
      this.field556 = var1;
   }

   @Override
   public JsonElement method501() {
      JsonObject var3 = new JsonObject();
      this.field556.forEach(var3::addProperty);
      return var3;
   }

   public boolean test(Class2006 var1) {
      ObjectIterator var4 = this.field556.object2BooleanEntrySet().iterator();

      while (var4.hasNext()) {
         Entry var5 = (Entry)var4.next();
         Class9599 var6 = var1.method8495((String)var5.getKey());
         if (var6 == null || var6.method37263() != var5.getBooleanValue()) {
            return false;
         }
      }

      return true;
   }
}
