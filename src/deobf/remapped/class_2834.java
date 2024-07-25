package remapped;

import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.Validate;

public class class_2834 implements JsonDeserializer<class_7874> {
   public class_7874 deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      JsonObject var6 = class_6539.method_29782(var1, "entry");
      boolean var7 = class_6539.method_29772(var6, "replace", false);
      String var8 = class_6539.method_29797(var6, "subtitle", (String)null);
      List var9 = this.method_12888(var6);
      return new class_7874(var9, var7, var8);
   }

   private List<class_2049> method_12888(JsonObject var1) {
      ArrayList var4 = Lists.newArrayList();
      if (var1.has("sounds")) {
         JsonArray var5 = class_6539.method_29787(var1, "sounds");

         for (int var6 = 0; var6 < var5.size(); var6++) {
            JsonElement var7 = var5.get(var6);
            if (!class_6539.method_29792(var7)) {
               var4.add(this.method_12889(class_6539.method_29782(var7, "sound")));
            } else {
               String var8 = class_6539.method_29795(var7, "sound");
               var4.add(new class_2049(var8, 1.0F, 1.0F, 1, class_2031.field_10317, false, false, 16));
            }
         }
      }

      return var4;
   }

   private class_2049 method_12889(JsonObject var1) {
      String var4 = class_6539.method_29796(var1, "name");
      class_2031 var5 = this.method_12890(var1, class_2031.field_10317);
      float var6 = class_6539.method_29775(var1, "volume", 1.0F);
      Validate.isTrue(var6 > 0.0F, "Invalid volume", new Object[0]);
      float var7 = class_6539.method_29775(var1, "pitch", 1.0F);
      Validate.isTrue(var7 > 0.0F, "Invalid pitch", new Object[0]);
      int var8 = class_6539.method_29768(var1, "weight", 1);
      Validate.isTrue(var8 > 0, "Invalid weight", new Object[0]);
      boolean var9 = class_6539.method_29772(var1, "preload", false);
      boolean var10 = class_6539.method_29772(var1, "stream", false);
      int var11 = class_6539.method_29768(var1, "attenuation_distance", 16);
      return new class_2049(var4, var6, var7, var8, var5, var10, var9, var11);
   }

   private class_2031 method_12890(JsonObject var1, class_2031 var2) {
      class_2031 var5 = var2;
      if (var1.has("type")) {
         var5 = class_2031.method_9516(class_6539.method_29796(var1, "type"));
         Validate.notNull(var5, "Invalid type", new Object[0]);
      }

      return var5;
   }
}
