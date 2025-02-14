package mapped;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import net.minecraft.util.ResourceLocation;
import net.optifine.Config;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Class8331 {
   public static final String field35805 = "entity";
   public static final String field35806 = "texture";
   public static final String field35807 = "shadowSize";
   public static final String field35808 = "type";
   public static final String field35809 = "textureSize";
   public static final String field35810 = "usePlayerTexture";
   public static final String field35811 = "models";
   public static final String field35812 = "animations";
   public static final String field35813 = "id";
   public static final String field35814 = "baseId";
   public static final String field35815 = "model";
   public static final String field35816 = "type";
   public static final String field35817 = "part";
   public static final String field35818 = "attach";
   public static final String field35819 = "invertAxis";
   public static final String field35820 = "mirrorTexture";
   public static final String field35821 = "translate";
   public static final String field35822 = "rotate";
   public static final String field35823 = "scale";
   public static final String field35824 = "boxes";
   public static final String field35825 = "sprites";
   public static final String field35826 = "submodel";
   public static final String field35827 = "submodels";
   public static final String field35828 = "textureOffset";
   public static final String field35829 = "coordinates";
   public static final String field35830 = "sizeAdd";
   public static final String field35831 = "EntityModel";
   public static final String field35832 = "EntityModelPart";

   public static Class9135 method29210(JsonObject var0, String var1) {
      Class8896 var4 = new Class8896("CustomEntityModels");
      String var5 = var4.method32382(var1);
      String var6 = var4.method32383(var1);
      String var7 = Class9664.method37717(var0, "texture");
      int[] var8 = Class9664.method37721(var0.get("textureSize"), 2);
      float var9 = Class9664.method37715(var0, "shadowSize", -1.0F);
      JsonArray var10 = (JsonArray)var0.get("models");
      method29217(var10, "Missing models");
      HashMap var11 = new HashMap();
      ArrayList<Class9734> var12 = new ArrayList();

      for (int var13 = 0; var13 < var10.size(); var13++) {
         JsonObject var14 = (JsonObject)var10.get(var13);
         method29211(var14, var11);
         method29212(var14, var11, var6);
         method29215(var14, var11);
         Class9734 var15 = method29216(var14, var8, var6);
         if (var15 != null) {
            var12.add(var15);
         }
      }

      Class9734[] var16 = var12.toArray(new Class9734[var12.size()]);
      ResourceLocation var17 = null;
      if (var7 != null) {
         var17 = method29214(var6, var7, ".png");
      }

      return new Class9135(var5, var6, var17, var16, var9);
   }

   private static void method29211(JsonObject var0, Map var1) {
      String var4 = Class9664.method37717(var0, "baseId");
      if (var4 != null) {
         JsonObject var5 = (JsonObject)var1.get(var4);
         if (var5 != null) {
            method29213(var5, var0);
         } else {
            Config.method26811("BaseID not found: " + var4);
         }
      }
   }

   private static void method29212(JsonObject var0, Map var1, String var2) {
      String var5 = Class9664.method37717(var0, "model");
      if (var5 != null) {
         ResourceLocation var6 = method29214(var2, var5, ".jpm");

         try {
            JsonObject var7 = method29218(var6);
            if (var7 == null) {
               Config.method26811("Model not found: " + var6);
               return;
            }

            method29213(var7, var0);
         } catch (IOException var8) {
            Config.method26813("" + var8.getClass().getName() + ": " + var8.getMessage());
         } catch (JsonParseException var9) {
            Config.method26813("" + var9.getClass().getName() + ": " + var9.getMessage());
         } catch (Exception var10) {
            var10.printStackTrace();
         }
      }
   }

   private static void method29213(JsonObject var0, JsonObject var1) {
      for (Entry var5 : var0.entrySet()) {
         if (!((String)var5.getKey()).equals("id") && !var1.has((String)var5.getKey())) {
            var1.add((String)var5.getKey(), (JsonElement)var5.getValue());
         }
      }
   }

   public static ResourceLocation method29214(String var0, String var1, String var2) {
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

      return new ResourceLocation(var1);
   }

   private static void method29215(JsonObject var0, Map var1) {
      String var4 = Class9664.method37717(var0, "id");
      if (var4 != null) {
         if (var4.length() >= 1) {
            if (!var1.containsKey(var4)) {
               var1.put(var4, var0);
            } else {
               Config.method26811("Duplicate model ID: " + var4);
            }
         } else {
            Config.method26811("Empty model ID: " + var4);
         }
      }
   }

   public static Class9734 method29216(JsonObject var0, int[] var1, String var2) {
      String var5 = Class9664.method37717(var0, "part");
      method29217(var5, "Model part not specified, missing \"replace\" or \"attachTo\".");
      boolean var6 = Class9664.method37716(var0, "attach", false);
      Class2829 var7 = new Class2829(RenderType::getEntityCutoutNoCull);
      if (var1 != null) {
         var7.textureWidth = var1[0];
         var7.textureHeight = var1[1];
      }

      Class8486 var8 = null;
      JsonArray var9 = (JsonArray)var0.get("animations");
      if (var9 != null) {
         ArrayList<Class8494> var10 = new ArrayList();

         for (int var11 = 0; var11 < var9.size(); var11++) {
            JsonObject var12 = (JsonObject)var9.get(var11);

            for (Entry var14 : var12.entrySet()) {
               String var15 = (String)var14.getKey();
               String var16 = ((JsonElement)var14.getValue()).getAsString();
               Class8494 var17 = new Class8494(var15, var16);
               var10.add(var17);
            }
         }

         if (var10.size() > 0) {
            Class8494[] var19 = var10.toArray(new Class8494[var10.size()]);
            var8 = new Class8486(var19);
         }
      }

      ModelRenderer var18 = Class9498.method36692(var0, var7, var1, var2);
      return new Class9734(var5, var6, var18, var8);
   }

   private static void method29217(Object var0, String var1) {
      if (var0 == null) {
         throw new JsonParseException(var1);
      }
   }

   public static JsonObject method29218(ResourceLocation var0) throws IOException, JsonParseException {
      InputStream var3 = Config.method26863(var0);
      if (var3 != null) {
         String var4 = Config.method26926(var3, "ASCII");
         var3.close();
         JsonParser var5 = new JsonParser();
         return (JsonObject)var5.parse(var4);
      } else {
         return null;
      }
   }
}
