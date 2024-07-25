package remapped;

import com.google.common.collect.Lists;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import java.util.Iterator;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_1669 extends class_8958 {
   private static final Logger field_8640 = LogManager.getLogger();
   public List<class_8960> field_8642;

   public static class_1669 method_7442(String var0) {
      JsonParser var3 = new JsonParser();
      class_1669 var4 = new class_1669();
      var4.field_8642 = Lists.newArrayList();

      try {
         JsonElement var5 = var3.parse(var0).getAsJsonObject().get("backups");
         if (var5.isJsonArray()) {
            Iterator var6 = var5.getAsJsonArray().iterator();

            while (var6.hasNext()) {
               var4.field_8642.add(class_8960.method_41112((JsonElement)var6.next()));
            }
         }
      } catch (Exception var7) {
         field_8640.error("Could not parse BackupList: " + var7.getMessage());
      }

      return var4;
   }
}
