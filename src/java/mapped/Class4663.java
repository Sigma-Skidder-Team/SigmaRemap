package mapped;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class Class4663 implements Class4664 {
   private final ResourceLocation field22198;
   private final Item field22199;
   private final int field22200;
   private final String field22201;
   private final List<String> field22202;
   private final Map<Character, Class120> field22203;
   private final Class7999 field22204;
   private final ResourceLocation field22205;
   public final Class8528 field22206;

   public Class4663(Class8528 var1, ResourceLocation var2, Item var3, int var4, String var5, List<String> var6, Map<Character, Class120> var7, Class7999 var8, ResourceLocation var9
   ) {
      this.field22206 = var1;
      this.field22198 = var2;
      this.field22199 = var3;
      this.field22200 = var4;
      this.field22201 = var5;
      this.field22202 = var6;
      this.field22203 = var7;
      this.field22204 = var8;
      this.field22205 = var9;
   }

   @Override
   public void method14632(JsonObject var1) {
      if (!this.field22201.isEmpty()) {
         var1.addProperty("group", this.field22201);
      }

      JsonArray var4 = new JsonArray();

      for (String var6 : this.field22202) {
         var4.add(var6);
      }

      var1.add("pattern", var4);
      JsonObject var8 = new JsonObject();

      for (Entry var7 : this.field22203.entrySet()) {
         var8.add(String.valueOf(var7.getKey()), ((Class120)var7.getValue()).method336());
      }

      var1.add("key", var8);
      JsonObject var10 = new JsonObject();
      var10.addProperty("item", Registry.ITEM.getKey(this.field22199).toString());
      if (this.field22200 > 1) {
         var10.addProperty("count", this.field22200);
      }

      var1.add("result", var10);
   }

   @Override
   public Class6504<?> method14633() {
      return Class6504.field28470;
   }

   @Override
   public ResourceLocation method14634() {
      return this.field22198;
   }

   @Nullable
   @Override
   public JsonObject method14635() {
      return this.field22204.method27318();
   }

   @Nullable
   @Override
   public ResourceLocation method14636() {
      return this.field22205;
   }
}
