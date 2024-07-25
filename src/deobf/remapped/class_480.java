package remapped;

import com.google.common.collect.Lists;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_480 extends class_8958 {
   private static final Logger field_2976 = LogManager.getLogger();
   public List<class_2496> field_2981;
   public int field_2977;
   public int field_2979;
   public int field_2978;

   public class_480() {
   }

   public class_480(int var1) {
      this.field_2981 = Collections.<class_2496>emptyList();
      this.field_2977 = 0;
      this.field_2979 = var1;
      this.field_2978 = -1;
   }

   public static class_480 method_2272(String var0) {
      class_480 var3 = new class_480();
      var3.field_2981 = Lists.newArrayList();

      try {
         JsonParser var4 = new JsonParser();
         JsonObject var5 = var4.parse(var0).getAsJsonObject();
         if (var5.get("templates").isJsonArray()) {
            Iterator var6 = var5.get("templates").getAsJsonArray().iterator();

            while (var6.hasNext()) {
               var3.field_2981.add(class_2496.method_11409(((JsonElement)var6.next()).getAsJsonObject()));
            }
         }

         var3.field_2977 = class_274.method_1245("page", var5, 0);
         var3.field_2979 = class_274.method_1245("size", var5, 0);
         var3.field_2978 = class_274.method_1245("total", var5, 0);
      } catch (Exception var7) {
         field_2976.error("Could not parse WorldTemplatePaginatedList: " + var7.getMessage());
      }

      return var3;
   }
}
