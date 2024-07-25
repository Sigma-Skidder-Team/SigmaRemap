package remapped;

import com.google.common.collect.Maps;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class class_7780 {
   public static final class_7780 field_39437 = new class_6708().method_30766();
   private final class_7781 field_39436;
   private final GameType field_39433;
   private final Map<class_6676<?>, class_7781> field_39438;
   private final Object2BooleanMap<Identifier> field_39432;
   private final Map<Identifier, class_4334> field_39434;

   private static class_4334 method_35303(JsonElement var0) {
      if (!var0.isJsonPrimitive()) {
         Object2BooleanOpenHashMap var5 = new Object2BooleanOpenHashMap();
         JsonObject var4 = class_6539.method_29782(var0, "criterion data");
         var4.entrySet().forEach(var1 -> {
            boolean var4x = class_6539.method_29770((JsonElement)var1.getValue(), "criterion test");
            var5.put(var1.getKey(), var4x);
         });
         return new class_8168(var5);
      } else {
         boolean var3 = var0.getAsBoolean();
         return new class_164(var3);
      }
   }

   private class_7780(
           class_7781 var1, GameType var2, Map<class_6676<?>, class_7781> var3, Object2BooleanMap<Identifier> var4, Map<Identifier, class_4334> var5
   ) {
      this.field_39436 = var1;
      this.field_39433 = var2;
      this.field_39438 = var3;
      this.field_39432 = var4;
      this.field_39434 = var5;
   }

   public boolean method_35301(Entity var1) {
      if (this == field_39437) {
         return true;
      } else if (!(var1 instanceof class_9359)) {
         return false;
      } else {
         class_9359 var4 = (class_9359)var1;
         if (!this.field_39436.method_35307(var4.field_3840)) {
            return false;
         } else if (this.field_39433 != GameType.NOT_SET && this.field_39433 != var4.field_47807.method_39517()) {
            return false;
         } else {
            class_7909 var5 = var4.method_43271();

            for (Entry var7 : this.field_39438.entrySet()) {
               int var8 = var5.method_19276((class_6676<?>)var7.getKey());
               if (!((class_7781)var7.getValue()).method_35307(var8)) {
                  return false;
               }
            }

            class_3071 var12 = var4.method_43266();
            ObjectIterator var13 = this.field_39432.object2BooleanEntrySet().iterator();

            while (var13.hasNext()) {
               it.unimi.dsi.fastutil.objects.Object2BooleanMap.Entry var15 = (it.unimi.dsi.fastutil.objects.Object2BooleanMap.Entry)var13.next();
               if (var12.method_5073((Identifier)var15.getKey()) != var15.getBooleanValue()) {
                  return false;
               }
            }

            if (!this.field_39434.isEmpty()) {
               class_3362 var14 = var4.method_43253();
               class_8873 var16 = var4.method_37268().method_1703();

               for (Entry var10 : this.field_39434.entrySet()) {
                  class_3139 var11 = var16.method_40818((Identifier)var10.getKey());
                  if (var11 == null || !((class_4334)var10.getValue()).test(var14.method_15389(var11))) {
                     return false;
                  }
               }
            }

            return true;
         }
      }
   }

   public static class_7780 method_35297(JsonElement var0) {
      if (var0 != null && !var0.isJsonNull()) {
         JsonObject var3 = class_6539.method_29782(var0, "player");
         class_7781 var4 = class_7781.method_35310(var3.get("level"));
         String var5 = class_6539.method_29797(var3, "gamemode", "");
         GameType var6 = GameType.method_21595(var5, GameType.NOT_SET);
         HashMap var7 = Maps.newHashMap();
         JsonArray var8 = class_6539.method_29788(var3, "stats", (JsonArray)null);
         if (var8 != null) {
            for (JsonElement var10 : var8) {
               JsonObject var11 = class_6539.method_29782(var10, "stats entry");
               Identifier var12 = new Identifier(class_6539.method_29796(var11, "type"));
               class_9478 var13 = class_8669.field_44376.method_39806(var12);
               if (var13 == null) {
                  throw new JsonParseException("Invalid stat type: " + var12);
               }

               Identifier var14 = new Identifier(class_6539.method_29796(var11, "stat"));
               class_6676 var15 = method_35299(var13, var14);
               class_7781 var16 = class_7781.method_35310(var11.get("value"));
               var7.put(var15, var16);
            }
         }

         Object2BooleanOpenHashMap var17 = new Object2BooleanOpenHashMap();
         JsonObject var18 = class_6539.method_29784(var3, "recipes", new JsonObject());

         for (Entry var21 : var18.entrySet()) {
            Identifier var23 = new Identifier((String)var21.getKey());
            boolean var25 = class_6539.method_29770((JsonElement)var21.getValue(), "recipe present");
            var17.put(var23, var25);
         }

         HashMap var20 = Maps.newHashMap();
         JsonObject var22 = class_6539.method_29784(var3, "advancements", new JsonObject());

         for (Entry var26 : var22.entrySet()) {
            Identifier var27 = new Identifier((String)var26.getKey());
            class_4334 var28 = method_35303((JsonElement)var26.getValue());
            var20.put(var27, var28);
         }

         return new class_7780(var4, var6, var7, var17, var20);
      } else {
         return field_39437;
      }
   }

   private static <T> class_6676<T> method_35299(class_9478<T> var0, Identifier var1) {
      class_8669 var4 = var0.method_43788();
      Object var5 = var4.method_39806(var1);
      if (var5 != null) {
         return (class_6676<T>)var0.method_43790(var5);
      } else {
         throw new JsonParseException("Unknown object " + var1 + " for stat type " + class_8669.field_44376.method_39797(var0));
      }
   }

   private static <T> Identifier method_35302(class_6676<T> var0) {
      return var0.method_30631().method_43788().method_39797(var0.method_30630());
   }

   public JsonElement method_35298() {
      if (this != field_39437) {
         JsonObject var3 = new JsonObject();
         var3.add("level", this.field_39436.method_27853());
         if (this.field_39433 != GameType.NOT_SET) {
            var3.addProperty("gamemode", this.field_39433.getName());
         }

         if (!this.field_39438.isEmpty()) {
            JsonArray var4 = new JsonArray();
            this.field_39438.forEach((var1, var2) -> {
               JsonObject var5x = new JsonObject();
               var5x.addProperty("type", class_8669.field_44376.method_39797(var1.method_30631()).toString());
               var5x.addProperty("stat", method_35302((class_6676<?>)var1).toString());
               var5x.add("value", var2.method_27853());
               var4.add(var5x);
            });
            var3.add("stats", var4);
         }

         if (!this.field_39432.isEmpty()) {
            JsonObject var5 = new JsonObject();
            this.field_39432.forEach((var1, var2) -> var5.addProperty(var1.toString(), var2));
            var3.add("recipes", var5);
         }

         if (!this.field_39434.isEmpty()) {
            JsonObject var6 = new JsonObject();
            this.field_39434.forEach((var1, var2) -> var6.add(var1.toString(), var2.method_20160()));
            var3.add("advancements", var6);
         }

         return var3;
      } else {
         return JsonNull.INSTANCE;
      }
   }
}
