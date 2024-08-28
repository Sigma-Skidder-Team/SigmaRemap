package mapped;

import com.google.common.collect.Lists;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class6108 extends Class6109 {
   private static final Logger field27364 = LogManager.getLogger();
   public List<Class6130> field27365;
   public int field27366;
   public int field27367;
   public int field27368;

   public Class6108() {
   }

   public Class6108(int var1) {
      this.field27365 = Collections.<Class6130>emptyList();
      this.field27366 = 0;
      this.field27367 = var1;
      this.field27368 = -1;
   }

   public static Class6108 method18870(String var0) {
      Class6108 var3 = new Class6108();
      var3.field27365 = Lists.newArrayList();

      try {
         JsonParser var4 = new JsonParser();
         JsonObject var5 = var4.parse(var0).getAsJsonObject();
         if (var5.get("templates").isJsonArray()) {
            Iterator var6 = var5.get("templates").getAsJsonArray().iterator();

            while (var6.hasNext()) {
               var3.field27365.add(Class6130.method18924(((JsonElement)var6.next()).getAsJsonObject()));
            }
         }

         var3.field27366 = Class5420.method17017("page", var5, 0);
         var3.field27367 = Class5420.method17017("size", var5, 0);
         var3.field27368 = Class5420.method17017("total", var5, 0);
      } catch (Exception var7) {
         field27364.error("Could not parse WorldTemplatePaginatedList: " + var7.getMessage());
      }

      return var3;
   }
}
