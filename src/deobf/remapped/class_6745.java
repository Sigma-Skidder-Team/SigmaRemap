package remapped;

import java.util.Iterator;
import org.json.JSONException;

public class class_6745 {
   public static final Character field_34818 = '&';
   public static final Character field_34813 = '\'';
   public static final Character field_34819 = '!';
   public static final Character field_34814 = '=';
   public static final Character field_34812 = '>';
   public static final Character field_34815 = '<';
   public static final Character field_34817 = '?';
   public static final Character field_34820 = '"';
   public static final Character field_34811 = '/';

   public static String method_30891(String var0) {
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

   public static void method_30892(String var0) throws JSONException {
      int var3 = var0.length();
      if (var3 == 0) {
         throw new class_7584("Empty string.");
      } else {
         for (int var4 = 0; var4 < var3; var4++) {
            if (Character.isWhitespace(var0.charAt(var4))) {
               throw new class_7584("'" + var0 + "' contains a space character.");
            }
         }
      }
   }

   private static boolean method_30895(class_2021 var0, JSONObjectImpl var1, String var2) throws JSONException {
      JSONObjectImpl var5 = null;
      Object var6 = var0.method_9391();
      if (var6 == field_34819) {
         char var8 = var0.method_17289();
         if (var8 != '-') {
            if (var8 == '[') {
               var6 = var0.method_9391();
               if ("CDATA".equals(var6) && var0.method_17289() == '[') {
                  String var19 = var0.method_9387();
                  if (var19.length() > 0) {
                     var1.method_5842("content", var19);
                  }

                  return false;
               }

               throw var0.method_17292("Expected 'CDATA['");
            }
         } else {
            if (var0.method_17289() == '-') {
               var0.method_9386("-->");
               return false;
            }

            var0.method_17299();
         }

         int var9 = 1;

         do {
            var6 = var0.method_9389();
            if (var6 == null) {
               throw var0.method_17292("Missing '>' after '<!'.");
            }

            if (var6 != field_34815) {
               if (var6 == field_34812) {
                  var9--;
               }
            } else {
               var9++;
            }
         } while (var9 > 0);

         return false;
      } else if (var6 == field_34817) {
         var0.method_9386("?>");
         return false;
      } else if (var6 == field_34811) {
         var6 = var0.method_9391();
         if (var2 != null) {
            if (var6.equals(var2)) {
               if (var0.method_9391() == field_34812) {
                  return true;
               } else {
                  throw var0.method_17292("Misshaped close tag");
               }
            } else {
               throw var0.method_17292("Mismatched " + var2 + " and " + var6);
            }
         } else {
            throw var0.method_17292("Mismatched close tag " + var6);
         }
      } else if (var6 instanceof Character) {
         throw var0.method_17292("Misshaped tag");
      } else {
         String var7 = (String)var6;
         var6 = null;
         var5 = new JSONObjectImpl();

         while (true) {
            if (var6 == null) {
               var6 = var0.method_9391();
            }

            if (!(var6 instanceof String)) {
               if (var6 == field_34811) {
                  if (var0.method_9391() == field_34812) {
                     if (var5.method_5806() <= 0) {
                        var1.method_5842(var7, "");
                     } else {
                        var1.method_5842(var7, var5);
                     }

                     return false;
                  }

                  throw var0.method_17292("Misshaped tag");
               }

               if (var6 != field_34812) {
                  throw var0.method_17292("Misshaped tag");
               }

               while (true) {
                  var6 = var0.method_9390();
                  if (var6 == null) {
                     if (var7 == null) {
                        return false;
                     }

                     throw var0.method_17292("Unclosed tag " + var7);
                  }

                  if (!(var6 instanceof String)) {
                     if (var6 == field_34815 && method_30895(var0, var5, var7)) {
                        if (var5.method_5806() != 0) {
                           if (var5.method_5806() == 1 && var5.method_5865("content") != null) {
                              var1.method_5842(var7, var5.method_5865("content"));
                           } else {
                              var1.method_5842(var7, var5);
                           }
                        } else {
                           var1.method_5842(var7, "");
                        }

                        return false;
                     }
                  } else {
                     String var18 = (String)var6;
                     if (var18.length() > 0) {
                        var5.method_5842("content", method_30893(var18));
                     }
                  }
               }
            }

            String var10 = (String)var6;
            var6 = var0.method_9391();
            if (var6 != field_34814) {
               var5.method_5842(var10, "");
            } else {
               var6 = var0.method_9391();
               if (!(var6 instanceof String)) {
                  throw var0.method_17292("Missing value");
               }

               var5.method_5842(var10, method_30893((String)var6));
               var6 = null;
            }
         }
      }
   }

   public static Object method_30893(String var0) {
      if ("true".equalsIgnoreCase(var0)) {
         return Boolean.TRUE;
      } else if ("false".equalsIgnoreCase(var0)) {
         return Boolean.FALSE;
      } else if ("null".equalsIgnoreCase(var0)) {
         return JSONObjectImpl.field_7112;
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

   public static JSONObjectImpl method_30896(String var0) throws JSONException {
      JSONObjectImpl var3 = new JSONObjectImpl();
      class_2021 var4 = new class_2021(var0);

      while (var4.method_17294() && var4.method_9386("<")) {
         method_30895(var4, var3, null);
      }

      return var3;
   }

   public static String toString(Object var0) throws JSONException {
      return toString(var0, null);
   }

   public static String toString(Object var0, String var1) throws JSONException {
      StringBuilder var4 = new StringBuilder();
      if (!(var0 instanceof JSONObjectImpl)) {
         if (var0 != null) {
            if (var0.getClass().isArray()) {
               var0 = new JSONArray(var0);
            }

            if (var0 instanceof JSONArray) {
               JSONArray var15 = (JSONArray)var0;
               int var17 = var15.method_6142();

               for (int var19 = 0; var19 < var17; var19++) {
                  var4.append(toString(var15.method_6135(var19), var1 != null ? var1 : "array"));
               }

               return var4.toString();
            }
         }

         String var9 = var0 != null ? method_30891(var0.toString()) : "null";
         return var1 != null ? (var9.length() != 0 ? "<" + var1 + ">" + var9 + "</" + var1 + ">" : "<" + var1 + "/>") : "\"" + var9 + "\"";
      } else {
         if (var1 != null) {
            var4.append('<');
            var4.append(var1);
            var4.append('>');
         }

         JSONObjectImpl var5 = (JSONObjectImpl)var0;
         Iterator var6 = var5.method_5841();

         while (var6.hasNext()) {
            String var7 = (String)var6.next();
            Object var8 = var5.method_5865(var7);
            if (var8 == null) {
               var8 = "";
            }

            if (!(var8 instanceof String)) {
               Object var10000 = null;
            }

            if (!"content".equals(var7)) {
               if (var8 instanceof JSONArray) {
                  JSONArray var14 = (JSONArray)var8;
                  int var16 = var14.method_6142();

                  for (int var18 = 0; var18 < var16; var18++) {
                     var8 = var14.method_6130(var18);
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
               var4.append(method_30891(var8.toString()));
            } else {
               JSONArray var10 = (JSONArray)var8;
               int var11 = var10.method_6142();

               for (int var12 = 0; var12 < var11; var12++) {
                  if (var12 > 0) {
                     var4.append('\n');
                  }

                  var4.append(method_30891(var10.method_6130(var12).toString()));
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
