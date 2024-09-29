package mapped;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.NativeImage;
import net.minecraft.util.ResourceLocation;
import net.optifine.Config;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class Class6859 {
   private String field29782 = null;
   public static final String field29783 = "items";
   public static final String field29784 = "type";
   public static final String field29785 = "active";

   public Class6859(String var1) {
      this.field29782 = var1;
   }

   public Class7773 method20904(JsonElement var1) {
      if (var1 == null) {
         throw new JsonParseException("JSON object is null, player: " + this.field29782);
      } else {
         JsonObject var4 = (JsonObject)var1;
         Class7773 var5 = new Class7773();
         JsonArray var6 = (JsonArray)var4.get("items");
         if (var6 != null) {
            for (int var7 = 0; var7 < var6.size(); var7++) {
               JsonObject var8 = (JsonObject)var6.get(var7);
               boolean var9 = Class9664.method37716(var8, "active", true);
               if (var9) {
                  String var10 = Class9664.method37717(var8, "type");
                  if (var10 != null) {
                     String var11 = Class9664.method37717(var8, "model");
                     if (var11 == null) {
                        var11 = "items/" + var10 + "/model.cfg";
                     }

                     Class7078 var12 = this.method20906(var11);
                     if (var12 != null) {
                        if (!var12.method21998()) {
                           String var13 = Class9664.method37717(var8, "texture");
                           if (var13 == null) {
                              var13 = "items/" + var10 + "/users/" + this.field29782 + ".png";
                           }

                           NativeImage var14 = this.method20905(var13);
                           if (var14 == null) {
                              continue;
                           }

                           var12.method21994(var14);
                           ResourceLocation var15 = new ResourceLocation("optifine.net", var13);
                           var12.method21997(var15);
                        }

                        var5.method25753(var12);
                     }
                  } else {
                     Config.method26811("Item type is null, player: " + this.field29782);
                  }
               }
            }
         }

         return var5;
      }
   }

   private NativeImage method20905(String var1) {
      String var4 = Class8819.method31850() + "/" + var1;

      try {
         byte[] var5 = Class7615.method24949(var4, Minecraft.getInstance().getProxy());
         return NativeImage.method7879(new ByteArrayInputStream(var5));
      } catch (IOException var6) {
         Config.method26811("Error loading item texture " + var1 + ": " + var6.getClass().getName() + ": " + var6.getMessage());
         return null;
      }
   }

   private Class7078 method20906(String var1) {
      String var4 = Class8819.method31850() + "/" + var1;

      try {
         byte[] var5 = Class7615.method24949(var4, Minecraft.getInstance().getProxy());
         String var6 = new String(var5, "ASCII");
         JsonParser var7 = new JsonParser();
         JsonObject var8 = (JsonObject)var7.parse(var6);
         return Class9498.method36687(var8);
      } catch (Exception var9) {
         Config.method26811("Error loading item model " + var1 + ": " + var9.getClass().getName() + ": " + var9.getMessage());
         return null;
      }
   }
}
