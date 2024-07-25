package remapped;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.IOException;
import java.nio.file.Path;

public class class_6564 implements class_5998 {
   private static final Gson field_33489 = new GsonBuilder().setPrettyPrinting().create();
   private final class_6901 field_33490;

   public class_6564(class_6901 var1) {
      this.field_33490 = var1;
   }

   @Override
   public void method_27389(class_4162 var1) throws IOException {
      JsonObject var4 = new JsonObject();
      class_8669.field_44446
         .method_39805()
         .forEach(var1x -> var4.add(var1x.toString(), method_30002((class_8669<?>)class_8669.field_44446.method_39806(var1x))));
      Path var5 = this.field_33490.method_31600().resolve("reports/registries.json");
      class_5998.method_27388(field_33489, var1, var4, var5);
   }

   private static <T> JsonElement method_30002(class_8669<T> var0) {
      JsonObject var3 = new JsonObject();
      if (var0 instanceof class_3991) {
         Identifier var4 = ((class_3991)var0).method_18397();
         var3.addProperty("default", var4.toString());
      }

      int var11 = class_8669.field_44446.method_14041(var0);
      var3.addProperty("protocol_id", var11);
      JsonObject var5 = new JsonObject();

      for (Identifier var7 : var0.method_39805()) {
         Object var8 = var0.method_39806(var7);
         int var9 = var0.method_14041(var8);
         JsonObject var10 = new JsonObject();
         var10.addProperty("protocol_id", var9);
         var5.add(var7.toString(), var10);
      }

      var3.add("entries", var5);
      return var3;
   }

   @Override
   public String method_27387() {
      return "Registry Dump";
   }
}
