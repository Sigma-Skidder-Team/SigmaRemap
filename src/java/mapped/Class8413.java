package mapped;

import totalcross.json.JSONArray;
import totalcross.json.JSONException;
import totalcross.json.JSONException2;
import totalcross.json.JSONObject;

import java.util.Iterator;

public class Class8413 {
   private static Object method29537(Class7474 var0, boolean var1, JSONArray var2) throws JSONException {
      Object var5 = null;
      JSONArray var6 = null;
      JSONObject var7 = null;
      Object var8 = null;

      while (var0.method24220()) {
         Object var9 = var0.method24212();
         if (var9 == Class9029.field41317) {
            var9 = var0.method24215();
            if (!(var9 instanceof Character)) {
               if (!(var9 instanceof String)) {
                  throw var0.syntaxError("Bad tagName '" + var9 + "'.");
               }

               var8 = (String)var9;
               var6 = new JSONArray();
               var7 = new JSONObject();
               if (!var1) {
                  var7.put("tagName", var8);
                  if (var2 != null) {
                     var2.put(var7);
                  }
               } else {
                  var6.put(var8);
                  if (var2 != null) {
                     var2.put(var6);
                  }
               }

               var9 = null;

               while (true) {
                  if (var9 == null) {
                     var9 = var0.method24215();
                  }

                  if (var9 == null) {
                     throw var0.syntaxError("Misshaped tag");
                  }

                  if (!(var9 instanceof String)) {
                     if (var1 && var7.method21779() > 0) {
                        var6.put(var7);
                     }

                     if (var9 != Class9029.field41320) {
                        if (var9 != Class9029.field41316) {
                           throw var0.syntaxError("Misshaped tag");
                        }

                        var5 = (String)method29537(var0, var1, var6);
                        if (var5 != null) {
                           if (!var5.equals(var8)) {
                              throw var0.syntaxError("Mismatched '" + var8 + "' and '" + var5 + "'");
                           }

                           var8 = null;
                           if (!var1 && var6.length() > 0) {
                              var7.put("childNodes", var6);
                           }

                           if (var2 == null) {
                              if (!var1) {
                                 return var7;
                              }

                              return var6;
                           }
                        }
                     } else {
                        if (var0.method24215() != Class9029.field41316) {
                           throw var0.syntaxError("Misshaped tag");
                        }

                        if (var2 == null) {
                           if (!var1) {
                              return var7;
                           }

                           return var6;
                        }
                     }
                     break;
                  }

                  String var12 = (String)var9;
                  if (!var1 && ("tagName".equals(var12) || "childNode".equals(var12))) {
                     throw var0.syntaxError("Reserved attribute.");
                  }

                  var9 = var0.method24215();
                  if (var9 != Class9029.field41315) {
                     var7.method21758(var12, "");
                  } else {
                     var9 = var0.method24215();
                     if (!(var9 instanceof String)) {
                        throw var0.syntaxError("Missing value");
                     }

                     var7.method21758(var12, Class9029.method33430((String)var9));
                     var9 = null;
                  }
               }
            } else {
               if (var9 == Class9029.field41320) {
                  var9 = var0.method24215();
                  if (var9 instanceof String) {
                     if (var0.method24215() == Class9029.field41316) {
                        return var9;
                     }

                     throw var0.syntaxError("Misshaped close tag");
                  }

                  throw new JSONException2("Expected a closing name instead of '" + var9 + "'.");
               }

               if (var9 != Class9029.field41314) {
                  if (var9 != Class9029.field41318) {
                     throw var0.syntaxError("Misshaped tag");
                  }

                  var0.method24216("?>");
               } else {
                  char var10 = var0.method24221();
                  if (var10 == '-') {
                     if (var0.method24221() != '-') {
                        var0.back();
                     } else {
                        var0.method24216("-->");
                     }
                  } else if (var10 == '[') {
                     var9 = var0.method24215();
                     if (!var9.equals("CDATA") || var0.method24221() != '[') {
                        throw var0.syntaxError("Expected 'CDATA['");
                     }

                     if (var2 != null) {
                        var2.put(var0.method24211());
                     }
                  } else {
                     int var11 = 1;

                     while (true) {
                        var9 = var0.method24214();
                        if (var9 == null) {
                           throw var0.syntaxError("Missing '>' after '<!'.");
                        }

                        if (var9 != Class9029.field41317) {
                           if (var9 == Class9029.field41316) {
                              var11--;
                           }
                        } else {
                           var11++;
                        }

                        if (var11 <= 0) {
                           break;
                        }
                     }
                  }
               }
            }
         } else if (var2 != null) {
            var2.put(!(var9 instanceof String) ? var9 : Class9029.method33430((String)var9));
         }
      }

      throw var0.syntaxError("Bad XML");
   }

   public static JSONArray method29538(String var0) throws JSONException {
      return method29539(new Class7474(var0));
   }

   public static JSONArray method29539(Class7474 var0) throws JSONException {
      return (JSONArray)method29537(var0, true, null);
   }

   public static JSONObject method29540(Class7474 var0) throws JSONException {
      return (JSONObject)method29537(var0, false, null);
   }

   public static JSONObject method29541(String var0) throws JSONException {
      return method29540(new Class7474(var0));
   }

   public static String toString(JSONArray var0) throws JSONException {
      StringBuilder var3 = new StringBuilder();
      String var4 = var0.getString(0);
      Class9029.method33428(var4);
      var4 = Class9029.method33427(var4);
      var3.append('<');
      var3.append(var4);
      Object var5 = var0.opt(1);
      int var6;
      if (!(var5 instanceof JSONObject)) {
         var6 = 1;
      } else {
         var6 = 2;
         JSONObject var7 = (JSONObject)var5;
         Iterator var8 = var7.method21777();

         while (var8.hasNext()) {
            String var10 = (String)var8.next();
            Class9029.method33428(var10);
            String var11 = var7.method21797(var10);
            if (var11 != null) {
               var3.append(' ');
               var3.append(Class9029.method33427(var10));
               var3.append('=');
               var3.append('"');
               var3.append(Class9029.method33427(var11));
               var3.append('"');
            }
         }
      }

      int var9 = var0.length();
      if (var6 < var9) {
         var3.append('>');

         do {
            var5 = var0.get(var6);
            var6++;
            if (var5 != null) {
               if (!(var5 instanceof String)) {
                  if (!(var5 instanceof JSONObject)) {
                     if (!(var5 instanceof JSONArray)) {
                        var3.append(var5.toString());
                     } else {
                        var3.append(toString((JSONArray)var5));
                     }
                  } else {
                     var3.append(toString((JSONObject)var5));
                  }
               } else {
                  var3.append(Class9029.method33427(var5.toString()));
               }
            }
         } while (var6 < var9);

         var3.append('<');
         var3.append('/');
         var3.append(var4);
         var3.append('>');
      } else {
         var3.append('/');
         var3.append('>');
      }

      return var3.toString();
   }

   public static String toString(JSONObject var0) throws JSONException {
      StringBuilder var3 = new StringBuilder();
      String var4 = var0.method21797("tagName");
      if (var4 == null) {
         return Class9029.method33427(var0.toString());
      } else {
         Class9029.method33428(var4);
         var4 = Class9029.method33427(var4);
         var3.append('<');
         var3.append(var4);
         Iterator var5 = var0.method21777();

         while (var5.hasNext()) {
            String var9 = (String)var5.next();
            if (!"tagName".equals(var9) && !"childNodes".equals(var9)) {
               Class9029.method33428(var9);
               String var10 = var0.method21797(var9);
               if (var10 != null) {
                  var3.append(' ');
                  var3.append(Class9029.method33427(var9));
                  var3.append('=');
                  var3.append('"');
                  var3.append(Class9029.method33427(var10));
                  var3.append('"');
               }
            }
         }

         JSONArray var6 = var0.method21793("childNodes");
         if (var6 != null) {
            var3.append('>');
            int var7 = var6.length();

            for (int var8 = 0; var8 < var7; var8++) {
               Object var11 = var6.get(var8);
               if (var11 != null) {
                  if (!(var11 instanceof String)) {
                     if (!(var11 instanceof JSONObject)) {
                        if (!(var11 instanceof JSONArray)) {
                           var3.append(var11.toString());
                        } else {
                           var3.append(toString((JSONArray)var11));
                        }
                     } else {
                        var3.append(toString((JSONObject)var11));
                     }
                  } else {
                     var3.append(Class9029.method33427(var11.toString()));
                  }
               }
            }

            var3.append('<');
            var3.append('/');
            var3.append(var4);
            var3.append('>');
         } else {
            var3.append('/');
            var3.append('>');
         }

         return var3.toString();
      }
   }
}
