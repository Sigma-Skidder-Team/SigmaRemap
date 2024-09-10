package mapped;

import com.google.common.collect.Maps;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import net.minecraft.advancements.Advancement;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Class9281 {
   public static final Class9281 field42697 = new Class9017().method33351();
   private final Class8840 field42698;
   private final GameType field42699;
   private final Map<Class9007<?>, Class8840> field42700;
   private final Object2BooleanMap<ResourceLocation> field42701;
   private final Map<ResourceLocation, Class172> field42702;

   private static Class172 method34995(JsonElement var0) {
      if (!var0.isJsonPrimitive()) {
         Object2BooleanOpenHashMap var5 = new Object2BooleanOpenHashMap();
         JsonObject var4 = JSONUtils.method32781(var0, "criterion data");
         var4.entrySet().forEach(var1 -> {
            boolean var4x = JSONUtils.method32767((JsonElement)var1.getValue(), "criterion test");
            var5.put(var1.getKey(), var4x);
         });
         return new Class173(var5);
      } else {
         boolean var3 = var0.getAsBoolean();
         return new Class174(var3);
      }
   }

   public Class9281(Class8840 var1, GameType var2, Map<Class9007<?>, Class8840> var3, Object2BooleanMap<ResourceLocation> var4, Map<ResourceLocation, Class172> var5) {
      this.field42698 = var1;
      this.field42699 = var2;
      this.field42700 = var3;
      this.field42701 = var4;
      this.field42702 = var5;
   }

   public boolean method34996(Entity var1) {
      if (this == field42697) {
         return true;
      } else if (!(var1 instanceof ServerPlayerEntity)) {
         return false;
      } else {
         ServerPlayerEntity var4 = (ServerPlayerEntity)var1;
         if (!this.field42698.method32015(var4.field4920)) {
            return false;
         } else if (this.field42699 != GameType.field11101 && this.field42699 != var4.field4857.method33863()) {
            return false;
         } else {
            Class8287 var5 = var4.method2809();

            for (Entry var7 : this.field42700.entrySet()) {
               int var8 = var5.method28961((Class9007<?>)var7.getKey());
               if (!((Class8840)var7.getValue()).method32015(var8)) {
                  return false;
               }
            }

            Class6942 var12 = var4.method2810();
            ObjectIterator var13 = this.field42701.object2BooleanEntrySet().iterator();

            while (var13.hasNext()) {
               it.unimi.dsi.fastutil.objects.Object2BooleanMap.Entry var15 = (it.unimi.dsi.fastutil.objects.Object2BooleanMap.Entry)var13.next();
               if (var12.method21361((ResourceLocation)var15.getKey()) != var15.getBooleanValue()) {
                  return false;
               }
            }

            if (!this.field42702.isEmpty()) {
               Class8019 var14 = var4.method2823();
               AdvancementManager var16 = var4.method3396().method1396();

               for (Entry var10 : this.field42702.entrySet()) {
                  Advancement var11 = var16.method1065((ResourceLocation)var10.getKey());
                  if (var11 == null || !((Class172)var10.getValue()).test(var14.method27416(var11))) {
                     return false;
                  }
               }
            }

            return true;
         }
      }
   }

   public static Class9281 method34997(JsonElement var0) {
      if (var0 != null && !var0.isJsonNull()) {
         JsonObject var3 = JSONUtils.method32781(var0, "player");
         Class8840 var4 = Class8840.method32016(var3.get("level"));
         String var5 = JSONUtils.method32764(var3, "gamemode", "");
         GameType var6 = GameType.method8162(var5, GameType.field11101);
         HashMap var7 = Maps.newHashMap();
         JsonArray var8 = JSONUtils.method32786(var3, "stats", (JsonArray)null);
         if (var8 != null) {
            for (JsonElement var10 : var8) {
               JsonObject var11 = JSONUtils.method32781(var10, "stats entry");
               ResourceLocation var12 = new ResourceLocation(JSONUtils.getString(var11, "type"));
               Class49 var13 = Registry.field16088.method9184(var12);
               if (var13 == null) {
                  throw new JsonParseException("Invalid stat type: " + var12);
               }

               ResourceLocation var14 = new ResourceLocation(JSONUtils.getString(var11, "stat"));
               Class9007 var15 = method34998(var13, var14);
               Class8840 var16 = Class8840.method32016(var11.get("value"));
               var7.put(var15, var16);
            }
         }

         Object2BooleanOpenHashMap var17 = new Object2BooleanOpenHashMap();
         JsonObject var18 = JSONUtils.getJsonObject(var3, "recipes", new JsonObject());

         for (Entry var21 : var18.entrySet()) {
            ResourceLocation var23 = new ResourceLocation((String)var21.getKey());
            boolean var25 = JSONUtils.method32767((JsonElement)var21.getValue(), "recipe present");
            var17.put(var23, var25);
         }

         HashMap var20 = Maps.newHashMap();
         JsonObject var22 = JSONUtils.getJsonObject(var3, "advancements", new JsonObject());

         for (Entry var26 : var22.entrySet()) {
            ResourceLocation var27 = new ResourceLocation((String)var26.getKey());
            Class172 var28 = method34995((JsonElement)var26.getValue());
            var20.put(var27, var28);
         }

         return new Class9281(var4, var6, var7, var17, var20);
      } else {
         return field42697;
      }
   }

   private static <T> Class9007<T> method34998(Class49<T> var0, ResourceLocation var1) {
      Registry<T> var4 = var0.method171();
      T var5 = var4.method9184(var1);
      if (var5 != null) {
         return var0.method172(var5);
      } else {
         throw new JsonParseException("Unknown object " + var1 + " for stat type " + Registry.field16088.getKey(var0));
      }
   }

   private static <T> ResourceLocation method34999(Class9007<T> var0) {
      return var0.method33275().method171().getKey(var0.method33276());
   }

   public JsonElement method35000() {
      if (this != field42697) {
         JsonObject var3 = new JsonObject();
         var3.add("level", this.field42698.method32005());
         if (this.field42699 != GameType.field11101) {
            var3.addProperty("gamemode", this.field42699.method8153());
         }

         if (!this.field42700.isEmpty()) {
            JsonArray var4 = new JsonArray();
            this.field42700.forEach((var1, var2) -> {
               JsonObject var5x = new JsonObject();
               var5x.addProperty("type", Registry.field16088.getKey(var1.method33275()).toString());
               var5x.addProperty("stat", method34999((Class9007<?>)var1).toString());
               var5x.add("value", var2.method32005());
               var4.add(var5x);
            });
            var3.add("stats", var4);
         }

         if (!this.field42701.isEmpty()) {
            JsonObject var5 = new JsonObject();
            this.field42701.forEach((var1, var2) -> var5.addProperty(var1.toString(), var2));
            var3.add("recipes", var5);
         }

         if (!this.field42702.isEmpty()) {
            JsonObject var6 = new JsonObject();
            this.field42702.forEach((var1, var2) -> var6.add(var1.toString(), var2.method501()));
            var3.add("advancements", var6);
         }

         return var3;
      } else {
         return JsonNull.INSTANCE;
      }
   }
}
