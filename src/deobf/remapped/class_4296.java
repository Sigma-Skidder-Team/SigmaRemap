package remapped;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class class_4296 {
   public static final String field_20845 = "entity";
   public static final String field_20867 = "texture";
   public static final String field_20857 = "shadowSize";
   public static final String field_20858 = "type";
   public static final String field_20841 = "textureSize";
   public static final String field_20855 = "usePlayerTexture";
   public static final String field_20844 = "models";
   public static final String field_20853 = "animations";
   public static final String field_20846 = "id";
   public static final String field_20856 = "baseId";
   public static final String field_20842 = "model";
   public static final String field_20868 = "type";
   public static final String field_20862 = "part";
   public static final String field_20843 = "attach";
   public static final String field_20859 = "invertAxis";
   public static final String field_20863 = "mirrorTexture";
   public static final String field_20869 = "translate";
   public static final String field_20848 = "rotate";
   public static final String field_20849 = "scale";
   public static final String field_20865 = "boxes";
   public static final String field_20861 = "sprites";
   public static final String field_20864 = "submodel";
   public static final String field_20860 = "submodels";
   public static final String field_20854 = "textureOffset";
   public static final String field_20852 = "coordinates";
   public static final String field_20866 = "sizeAdd";
   public static final String field_20851 = "EntityModel";
   public static final String field_20847 = "EntityModelPart";

   public static class_7175 method_19949(JsonObject var0, String var1) {
      class_6284 var4 = new class_6284("CustomEntityModels");
      String var5 = var4.method_28678(var1);
      String var6 = var4.method_28649(var1);
      String var7 = class_9235.method_42595(var0, "texture");
      int[] var8 = class_9235.method_42601(var0.get("textureSize"), 2);
      float var9 = class_9235.method_42594(var0, "shadowSize", -1.0F);
      JsonArray var10 = (JsonArray)var0.get("models");
      method_19957(var10, "Missing models");
      HashMap var11 = new HashMap();
      ArrayList var12 = new ArrayList();

      for (int var13 = 0; var13 < var10.size(); var13++) {
         JsonObject var14 = (JsonObject)var10.get(var13);
         method_19956(var14, var11);
         method_19955(var14, var11, var6);
         method_19950(var14, var11);
         class_9514 var15 = method_19953(var14, var8, var6);
         if (var15 != null) {
            var12.add(var15);
         }
      }

      class_9514[] var16 = var12.<class_9514>toArray(new class_9514[var12.size()]);
      Identifier var17 = null;
      if (var7 != null) {
         var17 = method_19951(var6, var7, ".png");
      }

      return new class_7175(var5, var6, var17, var16, var9);
   }

   private static void method_19956(JsonObject var0, Map var1) {
      String var4 = class_9235.method_42595(var0, "baseId");
      if (var4 != null) {
         JsonObject var5 = (JsonObject)var1.get(var4);
         if (var5 != null) {
            method_19952(var5, var0);
         } else {
            class_3111.method_14317("BaseID not found: " + var4);
         }
      }
   }

   private static void method_19955(JsonObject var0, Map var1, String var2) {
      String var5 = class_9235.method_42595(var0, "model");
      if (var5 != null) {
         Identifier var6 = method_19951(var2, var5, ".jpm");

         try {
            JsonObject var7 = method_19954(var6);
            if (var7 == null) {
               class_3111.method_14317("Model not found: " + var6);
               return;
            }

            method_19952(var7, var0);
         } catch (IOException var8) {
            class_3111.method_14348("" + var8.getClass().getName() + ": " + var8.getMessage());
         } catch (JsonParseException var9) {
            class_3111.method_14348("" + var9.getClass().getName() + ": " + var9.getMessage());
         } catch (Exception var10) {
            var10.printStackTrace();
         }
      }
   }

   private static void method_19952(JsonObject var0, JsonObject var1) {
      for (Entry var5 : var0.entrySet()) {
         if (!((String)var5.getKey()).equals("id") && !var1.has((String)var5.getKey())) {
            var1.add((String)var5.getKey(), (JsonElement)var5.getValue());
         }
      }
   }

   public static Identifier method_19951(String var0, String var1, String var2) {
      if (!var1.endsWith(var2)) {
         var1 = var1 + var2;
      }

      if (var1.contains("/")) {
         if (!var1.startsWith("./")) {
            if (var1.startsWith("~/")) {
               var1 = "optifine/" + var1.substring(2);
            }
         } else {
            var1 = var0 + "/" + var1.substring(2);
         }
      } else {
         var1 = var0 + "/" + var1;
      }

      return new Identifier(var1);
   }

   private static void method_19950(JsonObject var0, Map var1) {
      String var4 = class_9235.method_42595(var0, "id");
      if (var4 != null) {
         if (var4.length() >= 1) {
            if (!var1.containsKey(var4)) {
               var1.put(var4, var0);
            } else {
               class_3111.method_14317("Duplicate model ID: " + var4);
            }
         } else {
            class_3111.method_14317("Empty model ID: " + var4);
         }
      }
   }

   public static class_9514 method_19953(JsonObject var0, int[] var1, String var2) {
      String var5 = class_9235.method_42595(var0, "part");
      method_19957(var5, "Model part not specified, missing \"replace\" or \"attachTo\".");
      boolean var6 = class_9235.method_42600(var0, "attach", false);
      class_9151 var7 = new class_9151(class_3581::method_16755);
      if (var1 != null) {
         var7.field_49928 = var1[0];
         var7.field_49927 = var1[1];
      }

      class_4776 var8 = null;
      JsonArray var9 = (JsonArray)var0.get("animations");
      if (var9 != null) {
         ArrayList var10 = new ArrayList();

         for (int var11 = 0; var11 < var9.size(); var11++) {
            JsonObject var12 = (JsonObject)var9.get(var11);

            for (Entry var14 : var12.entrySet()) {
               String var15 = (String)var14.getKey();
               String var16 = ((JsonElement)var14.getValue()).getAsString();
               class_4801 var17 = new class_4801(var15, var16);
               var10.add(var17);
            }
         }

         if (var10.size() > 0) {
            class_4801[] var19 = var10.<class_4801>toArray(new class_4801[var10.size()]);
            var8 = new class_4776(var19);
         }
      }

      class_1549 var18 = class_8616.method_39597(var0, var7, var1, var2);
      return new class_9514(var5, var6, var18, var8);
   }

   private static void method_19957(Object var0, String var1) {
      if (var0 == null) {
         throw new JsonParseException(var1);
      }
   }

   public static JsonObject method_19954(Identifier var0) throws IOException, JsonParseException {
      InputStream var3 = class_3111.method_14374(var0);
      if (var3 != null) {
         String var4 = class_3111.method_14271(var3, "ASCII");
         var3.close();
         JsonParser var5 = new JsonParser();
         return (JsonObject)var5.parse(var4);
      } else {
         return null;
      }
   }
}
