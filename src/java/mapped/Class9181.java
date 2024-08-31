package mapped;

import com.google.common.collect.Maps;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import net.minecraft.network.PacketBuffer;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class Class9181 {
   private final Class4477 field42162;

   public Class9181(Class4477 var1) {
      this.field42162 = var1;
   }

   public Class9181() {
      this.field42162 = null;
   }

   public void method34335(PacketBuffer var1) {
   }

   public static Class9181 method34336(JsonObject var0, Class9366 var1) {
      ResourceLocation var4 = new ResourceLocation(JSONUtils.method32763(var0, "trigger"));
      Class4907 var5 = CriteriaTriggers.method37000(var4);
      if (var5 != null) {
         Class4477 var6 = var5.method15054(JSONUtils.method32783(var0, "conditions", new JsonObject()), var1);
         return new Class9181(var6);
      } else {
         throw new JsonSyntaxException("Invalid criterion trigger: " + var4);
      }
   }

   public static Class9181 method34337(PacketBuffer var0) {
      return new Class9181();
   }

   public static Map<String, Class9181> method34338(JsonObject var0, Class9366 var1) {
      HashMap var4 = Maps.newHashMap();

      for (Entry var6 : var0.entrySet()) {
         var4.put(var6.getKey(), method34336(JSONUtils.method32781((JsonElement)var6.getValue(), "criterion"), var1));
      }

      return var4;
   }

   public static Map<String, Class9181> method34339(PacketBuffer var0) {
      HashMap var3 = Maps.newHashMap();
      int var4 = var0.method35714();

      for (int var5 = 0; var5 < var4; var5++) {
         var3.put(var0.method35728(32767), method34337(var0));
      }

      return var3;
   }

   public static void method34340(Map<String, Class9181> var0, PacketBuffer var1) {
      var1.writeVarInt(var0.size());

      for (Entry var5 : var0.entrySet()) {
         var1.method35729((String)var5.getKey());
         ((Class9181)var5.getValue()).method34335(var1);
      }
   }

   @Nullable
   public Class4477 method34341() {
      return this.field42162;
   }

   public JsonElement method34342() {
      JsonObject var3 = new JsonObject();
      var3.addProperty("trigger", this.field42162.method14093().toString());
      JsonObject var4 = this.field42162.method14092(Class8107.field34861);
      if (var4.size() != 0) {
         var3.add("conditions", var4);
      }

      return var3;
   }
}
