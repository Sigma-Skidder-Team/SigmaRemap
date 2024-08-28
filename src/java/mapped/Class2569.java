package mapped;

import com.google.common.collect.Lists;
import com.google.gson.*;
import org.apache.commons.lang3.Validate;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Class2569 implements JsonDeserializer<Class9304> {
   public Class9304 deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      JsonObject var6 = Class8963.method32781(var1, "entry");
      boolean var7 = Class8963.method32769(var6, "replace", false);
      String var8 = Class8963.method32764(var6, "subtitle", (String)null);
      List var9 = this.method10759(var6);
      return new Class9304(var9, var7, var8);
   }

   private List<Class6647> method10759(JsonObject var1) {
      ArrayList var4 = Lists.newArrayList();
      if (var1.has("sounds")) {
         JsonArray var5 = Class8963.method32785(var1, "sounds");

         for (int var6 = 0; var6 < var5.size(); var6++) {
            JsonElement var7 = var5.get(var6);
            if (!Class8963.method32756(var7)) {
               var4.add(this.method10760(Class8963.method32781(var7, "sound")));
            } else {
               String var8 = Class8963.method32762(var7, "sound");
               var4.add(new Class6647(var8, 1.0F, 1.0F, 1, Class2221.field14506, false, false, 16));
            }
         }
      }

      return var4;
   }

   private Class6647 method10760(JsonObject var1) {
      String var4 = Class8963.method32763(var1, "name");
      Class2221 var5 = this.method10761(var1, Class2221.field14506);
      float var6 = Class8963.method32772(var1, "volume", 1.0F);
      Validate.isTrue(var6 > 0.0F, "Invalid volume", new Object[0]);
      float var7 = Class8963.method32772(var1, "pitch", 1.0F);
      Validate.isTrue(var7 > 0.0F, "Invalid pitch", new Object[0]);
      int var8 = Class8963.method32778(var1, "weight", 1);
      Validate.isTrue(var8 > 0, "Invalid weight", new Object[0]);
      boolean var9 = Class8963.method32769(var1, "preload", false);
      boolean var10 = Class8963.method32769(var1, "stream", false);
      int var11 = Class8963.method32778(var1, "attenuation_distance", 16);
      return new Class6647(var4, var6, var7, var8, var5, var10, var9, var11);
   }

   private Class2221 method10761(JsonObject var1, Class2221 var2) {
      Class2221 var5 = var2;
      if (var1.has("type")) {
         var5 = Class2221.method8948(Class8963.method32763(var1, "type"));
         Validate.notNull(var5, "Invalid type", new Object[0]);
      }

      return var5;
   }
}
