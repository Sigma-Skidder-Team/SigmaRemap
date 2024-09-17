package mapped;

import totalcross.json.JSONArray;
import totalcross.json.JSONException2;
import totalcross.json.JSONObject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Class8020 {
   private static final String field34458 = "_placeholder";
   private static final String field34459 = "num";
   private static final Logger field34460 = Logger.getLogger(Class8020.class.getName());

   public static Class7592 method27421(Class8200 var0) {
      ArrayList<byte[]> var3 = new ArrayList();
      var0.field35229 = method27422(var0.field35229, var3);
      var0.field35230 = var3.size();
      Class7592 var4 = new Class7592();
      var4.field32595 = var0;
      var4.field32596 = var3.toArray(new byte[var3.size()][]);
      return var4;
   }

   private static Object method27422(Object var0, List<byte[]> var1) {
      if (var0 == null) {
         return null;
      } else if (var0 instanceof byte[]) {
         JSONObject var13 = new JSONObject();

         try {
            var13.method21800("_placeholder", true);
            var13.put("num", var1.size());
         } catch (JSONException2 var9) {
            field34460.log(Level.WARNING, "An error occured while putting data to JSONObject", (Throwable)var9);
            return null;
         }

          var1.add((byte[])var0);
         return var13;
      } else if (var0 instanceof JSONArray) {
         JSONArray var12 = new JSONArray();
         JSONArray var14 = (JSONArray)var0;
         int var15 = var14.length();

         for (int var16 = 0; var16 < var15; var16++) {
            try {
               var12.method9165(var16, method27422(var14.get(var16), var1));
            } catch (JSONException2 var10) {
               field34460.log(Level.WARNING, "An error occured while putting packet data to JSONObject", (Throwable)var10);
               return null;
            }
         }

         return var12;
      } else if (!(var0 instanceof JSONObject)) {
         return var0;
      } else {
         JSONObject var4 = new JSONObject();
         JSONObject var5 = (JSONObject)var0;
         Iterator var6 = var5.method21777();

         while (var6.hasNext()) {
            String var7 = (String)var6.next();

            try {
               var4.put(var7, method27422(var5.getObjectOrThrow(var7), var1));
            } catch (JSONException2 var11) {
               field34460.log(Level.WARNING, "An error occured while putting data to JSONObject", (Throwable)var11);
               return null;
            }
         }

         return var4;
      }
   }

   public static Class8200 method27423(Class8200 var0, byte[][] var1) {
      var0.field35229 = method27424(var0.field35229, var1);
      var0.field35230 = -1;
      return var0;
   }

   private static Object method27424(Object var0, byte[][] var1) {
      if (var0 instanceof JSONArray) {
         JSONArray var10 = (JSONArray)var0;
         int var12 = var10.length();

         for (int var13 = 0; var13 < var12; var13++) {
            try {
               var10.method9165(var13, method27424(var10.get(var13), var1));
            } catch (JSONException2 var8) {
               field34460.log(Level.WARNING, "An error occured while putting packet data to JSONObject", (Throwable)var8);
               return null;
            }
         }

         return var10;
      } else if (!(var0 instanceof JSONObject)) {
         return var0;
      } else {
         JSONObject var4 = (JSONObject)var0;
         if (var4.method21785("_placeholder")) {
            int var11 = var4.method21792("num", -1);
            return var11 >= 0 && var11 < var1.length ? var1[var11] : null;
         } else {
            Iterator var5 = var4.method21777();

            while (var5.hasNext()) {
               String var6 = (String)var5.next();

               try {
                  var4.put(var6, method27424(var4.getObjectOrThrow(var6), var1));
               } catch (JSONException2 var9) {
                  field34460.log(Level.WARNING, "An error occured while putting data to JSONObject", (Throwable)var9);
                  return null;
               }
            }

            return var4;
         }
      }
   }
}
