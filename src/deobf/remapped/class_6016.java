package remapped;

import com.google.common.collect.UnmodifiableIterator;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.io.IOException;
import java.nio.file.Path;

public class class_6016 implements class_5998 {
   private static final Gson field_30648 = new GsonBuilder().setPrettyPrinting().create();
   private final class_6901 field_30647;

   public class_6016(class_6901 var1) {
      this.field_30647 = var1;
   }

   @Override
   public void method_27389(class_4162 var1) throws IOException {
      JsonObject var4 = new JsonObject();

      for (class_6414 var6 : class_8669.field_44462) {
         class_4639 var7 = class_8669.field_44462.method_39797(var6);
         JsonObject var8 = new JsonObject();
         class_8021 var9 = var6.method_29306();
         if (!var9.method_36444().isEmpty()) {
            JsonObject var10 = new JsonObject();

            for (class_5019 var12 : var9.method_36444()) {
               JsonArray var13 = new JsonArray();

               for (Comparable var15 : var12.method_23105()) {
                  var13.add(Util.getValueAsString(var12, var15));
               }

               var10.add(var12.method_23109(), var13);
            }

            var8.add("properties", var10);
         }

         JsonArray var18 = new JsonArray();
         UnmodifiableIterator var19 = var9.method_36441().iterator();

         while (var19.hasNext()) {
            class_2522 var20 = (class_2522)var19.next();
            JsonObject var21 = new JsonObject();
            JsonObject var22 = new JsonObject();

            for (class_5019 var16 : var9.method_36444()) {
               var22.addProperty(var16.method_23109(), Util.getValueAsString(var16, var20.method_10313(var16)));
            }

            if (var22.size() > 0) {
               var21.add("properties", var22);
            }

            var21.addProperty("id", class_6414.method_29285(var20));
            if (var20 == var6.method_29260()) {
               var21.addProperty("default", true);
            }

            var18.add(var21);
         }

         var8.add("states", var18);
         var4.add(var7.toString(), var8);
      }

      Path var17 = this.field_30647.method_31600().resolve("reports/blocks.json");
      class_5998.method_27388(field_30648, var1, var4, var17);
   }

   @Override
   public String method_27387() {
      return "Block List";
   }
}
