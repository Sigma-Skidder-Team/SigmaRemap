package mapped;

import com.google.gson.*;

import javax.annotation.Nullable;
import java.lang.reflect.Type;

public class Class2558 implements JsonDeserializer<Class9163> {
   public Class9163 deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      JsonObject var6 = var1.getAsJsonObject();
      Direction var7 = this.method10755(var6);
      int var8 = this.method10753(var6);
      String var9 = this.method10754(var6);
      Class9840 var10 = (Class9840)var3.deserialize(var6, Class9840.class);
      return new Class9163(var7, var8, var9, var10);
   }

   public int method10753(JsonObject var1) {
      return Class8963.method32778(var1, "tintindex", -1);
   }

   private String method10754(JsonObject var1) {
      return Class8963.method32763(var1, "texture");
   }

   @Nullable
   private Direction method10755(JsonObject var1) {
      String var4 = Class8963.method32764(var1, "cullface", "");
      return Direction.method545(var4);
   }
}
