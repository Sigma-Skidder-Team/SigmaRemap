package remapped;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap.Entry;

public class class_8168 implements class_4334 {
   private static String[] field_41836;
   private final Object2BooleanMap<String> field_41835;

   public class_8168(Object2BooleanMap<String> var1) {
      this.field_41835 = var1;
   }

   @Override
   public JsonElement method_20160() {
      JsonObject var3 = new JsonObject();
      this.field_41835.forEach(var3::addProperty);
      return var3;
   }

   public boolean test(class_3604 var1) {
      ObjectIterator var4 = this.field_41835.object2BooleanEntrySet().iterator();

      while (var4.hasNext()) {
         Entry var5 = (Entry)var4.next();
         class_8984 var6 = var1.method_16820((String)var5.getKey());
         if (var6 == null || var6.method_41192() != var5.getBooleanValue()) {
            return false;
         }
      }

      return true;
   }
}
