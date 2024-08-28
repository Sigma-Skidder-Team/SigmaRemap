package mapped;

import com.google.common.collect.Lists;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import java.util.Iterator;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class6126 extends Class6109 {
   private static final Logger field27436 = LogManager.getLogger();
   public List<Class6122> field27437;

   public static Class6126 method18904(String var0) {
      JsonParser var3 = new JsonParser();
      Class6126 var4 = new Class6126();
      var4.field27437 = Lists.newArrayList();

      try {
         JsonElement var5 = var3.parse(var0).getAsJsonObject().get("backups");
         if (var5.isJsonArray()) {
            Iterator var6 = var5.getAsJsonArray().iterator();

            while (var6.hasNext()) {
               var4.field27437.add(Class6122.method18890((JsonElement)var6.next()));
            }
         }
      } catch (Exception var7) {
         field27436.error("Could not parse BackupList: " + var7.getMessage());
      }

      return var4;
   }
}
