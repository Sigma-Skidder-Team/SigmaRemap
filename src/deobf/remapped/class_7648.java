package remapped;

import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class class_7648 extends class_2840<Map<Identifier, JsonElement>> {
   private static final Logger field_38870 = LogManager.getLogger();
   private static final int field_38868 = ".json".length();
   private final Gson field_38867;
   private final String field_38869;

   public class_7648(Gson var1, String var2) {
      this.field_38867 = var1;
      this.field_38869 = var2;
   }

   public Map<Identifier, JsonElement> method_34644(class_7832 var1, class_3492 var2) {
      HashMap var5 = Maps.newHashMap();
      int var6 = this.field_38869.length() + 1;

      for (Identifier var8 : var1.method_35460(this.field_38869, var0 -> var0.endsWith(".json"))) {
         String var9 = var8.method_21456();
         Identifier var10 = new Identifier(var8.method_21461(), var9.substring(var6, var9.length() - field_38868));

         try (
            class_4038 var11 = var1.method_35458(var8);
            InputStream var13 = var11.method_18576();
            BufferedReader var15 = new BufferedReader(new InputStreamReader(var13, StandardCharsets.UTF_8));
         ) {
            JsonElement var17 = class_6539.<JsonElement>method_29801(this.field_38867, var15, JsonElement.class);
            if (var17 != null) {
               JsonElement var18 = var5.put(var10, var17);
               if (var18 != null) {
                  throw new IllegalStateException("Duplicate data file ignored with ID " + var10);
               }
            } else {
               field_38870.error("Couldn't load data file {} from {} as it's null or empty", var10, var8);
            }
         } catch (IOException | JsonParseException | IllegalArgumentException var70) {
            field_38870.error("Couldn't parse data file {} from {}", var10, var8, var70);
         }
      }

      return var5;
   }
}
