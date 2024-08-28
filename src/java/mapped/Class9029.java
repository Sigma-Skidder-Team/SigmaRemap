package mapped;

import totalcross.json.JSONArray;
import totalcross.json.JSONException;
import totalcross.json.JSONException2;
import totalcross.json.JSONObject;

import java.util.Iterator;

public class Class9029 {
   public static final Character field41312 = '&';
   public static final Character field41313 = '\'';
   public static final Character field41314 = '!';
   public static final Character field41315 = '=';
   public static final Character field41316 = '>';
   public static final Character field41317 = '<';
   public static final Character field41318 = '?';
   public static final Character field41319 = '"';
   public static final Character field41320 = '/';

   public static String method33427(String var0) {
      StringBuilder var3 = new StringBuilder(var0.length());
      int var4 = 0;

      for (int var5 = var0.length(); var4 < var5; var4++) {
         char var6 = var0.charAt(var4);
         switch (var6) {
            case '"':
               var3.append("&quot;");
               break;
            case '&':
               var3.append("&amp;");
               break;
            case '\'':
               var3.append("&apos;");
               break;
            case '<':
               var3.append("&lt;");
               break;
            case '>':
               var3.append("&gt;");
               break;
            default:
               var3.append(var6);
         }
      }

      return var3.toString();
   }

   public static void method33428(String var0) throws JSONException {
      int var3 = var0.length();
      if (var3 == 0) {
         throw new JSONException2("Empty string.");
      } else {
         for (int var4 = 0; var4 < var3; var4++) {
            if (Character.isWhitespace(var0.charAt(var4))) {
               throw new JSONException2("'" + var0 + "' contains a space character.");
            }
         }
      }
   }

   private static boolean method33429(Class7474 var0, JSONObject var1, String var2) throws JSONException {
      JSONObject var5 = null;
      Object var6 = var0.method24215();
      if (var6 == field41314) {
         char var8 = var0.method24221();
         if (var8 != '-') {
            if (var8 == '[') {
               var6 = var0.method24215();
               if ("CDATA".equals(var6) && var0.method24221() == '[') {
                  String var19 = var0.method24211();
                  if (var19.length() > 0) {
                     var1.method21758("content", var19);
                  }

                  return false;
               }

               throw var0.syntaxError("Expected 'CDATA['");
            }
         } else {
            if (var0.method24221() == '-') {
               var0.method24216("-->");
               return false;
            }

            var0.back();
         }

         int var9 = 1;

         do {
            var6 = var0.method24214();
            if (var6 == null) {
               throw var0.syntaxError("Missing '>' after '<!'.");
            }

            if (var6 != field41317) {
               if (var6 == field41316) {
                  var9--;
               }
            } else {
               var9++;
            }
         } while (var9 > 0);

         return false;
      } else if (var6 == field41318) {
         var0.method24216("?>");
         return false;
      } else if (var6 == field41320) {
         var6 = var0.method24215();
         if (var2 != null) {
            if (var6.equals(var2)) {
               if (var0.method24215() == field41316) {
                  return true;
               } else {
                  throw var0.syntaxError("Misshaped close tag");
               }
            } else {
               throw var0.syntaxError("Mismatched " + var2 + " and " + var6);
            }
         } else {
            throw var0.syntaxError("Mismatched close tag " + var6);
         }
      } else if (var6 instanceof Character) {
         throw var0.syntaxError("Misshaped tag");
      } else {
         String var7 = (String)var6;
         var6 = null;
         var5 = new JSONObject();

         while (true) {
            if (var6 == null) {
               var6 = var0.method24215();
            }

            if (!(var6 instanceof String)) {
               if (var6 == field41320) {
                  if (var0.method24215() == field41316) {
                     if (var5.method21779() <= 0) {
                        var1.method21758(var7, "");
                     } else {
                        var1.method21758(var7, var5);
                     }

                     return false;
                  }

                  throw var0.syntaxError("Misshaped tag");
               }

               if (var6 != field41316) {
                  throw var0.syntaxError("Misshaped tag");
               }

               while (true) {
                  var6 = var0.method24212();
                  if (var6 == null) {
                     if (var7 == null) {
                        return false;
                     }

                     throw var0.syntaxError("Unclosed tag " + var7);
                  }

                  if (!(var6 instanceof String)) {
                     if (var6 == field41317 && method33429(var0, var5, var7)) {
                        if (var5.method21779() != 0) {
                           if (var5.method21779() == 1 && var5.opt("content") != null) {
                              var1.method21758(var7, var5.opt("content"));
                           } else {
                              var1.method21758(var7, var5);
                           }
                        } else {
                           var1.method21758(var7, "");
                        }

                        return false;
                     }
                  } else {
                     String var18 = (String)var6;
                     if (var18.length() > 0) {
                        var5.method21758("content", method33430(var18));
                     }
                  }
               }
            }

            String var10 = (String)var6;
            var6 = var0.method24215();
            if (var6 != field41315) {
               var5.method21758(var10, "");
            } else {
               var6 = var0.method24215();
               if (!(var6 instanceof String)) {
                  throw var0.syntaxError("Missing value");
               }

               var5.method21758(var10, method33430((String)var6));
               var6 = null;
            }
         }
      }
   }

   public static Object method33430(String var0) {
      if ("true".equalsIgnoreCase(var0)) {
         return Boolean.TRUE;
      } else if ("false".equalsIgnoreCase(var0)) {
         return Boolean.FALSE;
      } else if ("null".equalsIgnoreCase(var0)) {
         return JSONObject.NULL;
      } else {
         try {
            char var3 = var0.charAt(0);
            if (var3 == '-' || var3 >= '0' && var3 <= '9') {
               Long var7 = new Long(var0);
               if (var7.toString().equals(var0)) {
                  return var7;
               }
            }
         } catch (Exception var6) {
            try {
               Double var4 = new Double(var0);
               if (var4.toString().equals(var0)) {
                  return var4;
               }
            } catch (Exception var5) {
            }
         }

         return var0;
      }
   }

   public static JSONObject method33431(String var0) throws JSONException {
      JSONObject var3 = new JSONObject();
      Class7474 var4 = new Class7474(var0);

      while (var4.method24220() && var4.method24216("<")) {
         method33429(var4, var3, null);
      }

      return var3;
   }

   public static String toString(Object var0) throws JSONException {
      return toString(var0, null);
   }

   public static String toString(Object var0, String var1) throws JSONException {
      StringBuilder var4 = new StringBuilder();
      if (!(var0 instanceof JSONObject)) {
         if (var0 != null) {
            if (var0.getClass().isArray()) {
               var0 = new JSONArray(var0);
            }

            if (var0 instanceof JSONArray) {
               JSONArray var15 = (JSONArray)var0;
               int var17 = var15.length();

               for (int var19 = 0; var19 < var17; var19++) {
                  var4.append(toString(var15.opt(var19), var1 != null ? var1 : "array"));
               }

               return var4.toString();
            }
         }

         String var9 = var0 != null ? method33427(var0.toString()) : "null";
         return var1 != null ? (var9.length() != 0 ? "<" + var1 + ">" + var9 + "</" + var1 + ">" : "<" + var1 + "/>") : "\"" + var9 + "\"";
      } else {
         if (var1 != null) {
            var4.append('<');
            var4.append(var1);
            var4.append('>');
         }

         JSONObject var5 = (JSONObject)var0;
         Iterator var6 = var5.method21777();

         while (var6.hasNext()) {
            String var7 = (String)var6.next();
            Object var8 = var5.opt(var7);
            if (var8 == null) {
               var8 = "";
            }

            if (!(var8 instanceof String)) {
               Object var10000 = null;
            }

            if (!"content".equals(var7)) {
               if (var8 instanceof JSONArray) {
                  JSONArray var14 = (JSONArray)var8;
                  int var16 = var14.length();

                  for (int var18 = 0; var18 < var16; var18++) {
                     var8 = var14.get(var18);
                     if (!(var8 instanceof JSONArray)) {
                        var4.append(toString(var8, var7));
                     } else {
                        var4.append('<');
                        var4.append(var7);
                        var4.append('>');
                        var4.append(toString(var8));
                        var4.append("</");
                        var4.append(var7);
                        var4.append('>');
                     }
                  }
               } else if (!"".equals(var8)) {
                  var4.append(toString(var8, var7));
               } else {
                  var4.append('<');
                  var4.append(var7);
                  var4.append("/>");
               }
            } else if (!(var8 instanceof JSONArray)) {
               var4.append(method33427(var8.toString()));
            } else {
               JSONArray var10 = (JSONArray)var8;
               int var11 = var10.length();

               for (int var12 = 0; var12 < var11; var12++) {
                  if (var12 > 0) {
                     var4.append('\n');
                  }

                  var4.append(method33427(var10.get(var12).toString()));
               }
            }
         }

         if (var1 != null) {
            var4.append("</");
            var4.append(var1);
            var4.append('>');
         }

         return var4.toString();
      }
   }
}
