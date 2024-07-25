package remapped;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;

public class class_6890 extends class_4106<class_3974, class_7956, class_4767, class_4023> {
   public static final class_2526<String, JsonElement> field_35446 = new class_6231(class_8039.field_41143);

   public class_6890() {
      super(class_3974.class, class_7956.class, class_4767.class, class_4023.class);
   }

   public static JsonElement method_31574(String var0) {
      if (var0 != null && !var0.equalsIgnoreCase("null")) {
         if ((!var0.startsWith("\"") || !var0.endsWith("\"")) && (!var0.startsWith("{") || !var0.endsWith("}"))) {
            return method_31577(var0);
         }

         if (var0.startsWith("\"") && var0.endsWith("\"")) {
            var0 = "{\"text\":" + var0 + "}";
         }
      } else {
         var0 = "{\"text\":\"\"}";
      }

      try {
         return (JsonElement)class_9012.method_41350().fromJson(var0, JsonObject.class);
      } catch (Exception var4) {
         if (class_3446.method_15884().method_25819()) {
            return method_31577(var0);
         } else {
            class_3446.method_15886()
               .method_34617()
               .warning("Invalid JSON String: \"" + var0 + "\" Please report this issue to the ViaVersion Github: " + var4.getMessage());
            return (JsonElement)class_9012.method_41350().fromJson("{\"text\":\"\"}", JsonObject.class);
         }
      }
   }

   private static JsonElement method_31577(String var0) {
      JsonObject var3 = new JsonObject();
      var3.addProperty("text", var0);
      return var3;
   }

   public static class_9530 method_31576(class_1455 var0) {
      return class_3446.method_15883().method_33743().<class_1694>method_24490(class_1694.class).method_7622(var0);
   }

   public static boolean method_31575(int var0) {
      if (var0 != 267) {
         if (var0 != 268) {
            if (var0 != 272) {
               return var0 != 276 ? var0 == 283 : true;
            } else {
               return true;
            }
         } else {
            return true;
         }
      } else {
         return true;
      }
   }

   @Override
   public void method_18998() {
      new class_1206(this);
      this.method_19017(class_1730.field_8922, 0, 0, new class_6927(this));
      class_5192.method_23852(this);
      class_5453.method_24841(this);
      class_6551.method_29875(this);
      class_4519.method_21015(this);
      class_2668.method_12027(this);
   }

   @Override
   public void method_19020(class_5368 var1) {
      var1.method_24491(class_1694.class, new class_1694());
      var1.method_24491(class_7627.class, new class_7627());
      var1.method_24491(class_1756.class, new class_1756());
      var1.method_24491(class_271.class, new class_271());
      var1.method_24491(class_2470.class, new class_2470());
      var1.method_24491(class_4160.class, new class_4160());
      var1.method_24488(class_3858.class);
   }

   @Override
   public boolean method_19000(Class var1) {
      return class_3446.method_15883().method_33743().<class_7627>method_24490(class_7627.class).method_34572(var1);
   }

   @Override
   public void method_19004(class_1455 var1, Object var2, List var3) throws Exception {
      var3.addAll(var1.<class_7291>method_6746(class_7291.class).method_33288(var2));
   }

   @Override
   public void method_19025(class_1455 var1) {
      var1.method_6737(new class_1189(var1));
      var1.method_6737(new class_7291(var1));
      var1.method_6737(new class_4257(var1));
      var1.method_6737(new class_4675(var1));
      var1.method_6737(new class_4477(var1));
      var1.method_6737(new class_4398(var1));
   }
}
