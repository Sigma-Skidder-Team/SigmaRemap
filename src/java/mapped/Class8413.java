package mapped;

import java.util.Iterator;
import org.json.JSONException;

public class Class8413 {
   private static Object method29537(Class7474 var0, boolean var1, Class2344 var2) throws Class2455 {
      Object var5 = null;
      Class2344 var6 = null;
      JSONObject var7 = null;
      Object var8 = null;

      while (var0.method24220()) {
         Object var9 = var0.method24212();
         if (var9 == Class9029.field41317) {
            var9 = var0.method24215();
            if (!(var9 instanceof Character)) {
               if (!(var9 instanceof String)) {
                  throw var0.method24230("Bad tagName '" + var9 + "'.");
               }

               var8 = (String)var9;
               var6 = new Class2344();
               var7 = new JSONObject();
               if (!var1) {
                  var7.method21806("tagName", var8);
                  if (var2 != null) {
                     var2.method9158(var7);
                  }
               } else {
                  var6.method9158(var8);
                  if (var2 != null) {
                     var2.method9158(var6);
                  }
               }

               var9 = null;

               while (true) {
                  if (var9 == null) {
                     var9 = var0.method24215();
                  }

                  if (var9 == null) {
                     throw var0.method24230("Misshaped tag");
                  }

                  if (!(var9 instanceof String)) {
                     if (var1 && var7.method21779() > 0) {
                        var6.method9158(var7);
                     }

                     if (var9 != Class9029.field41320) {
                        if (var9 != Class9029.field41316) {
                           throw var0.method24230("Misshaped tag");
                        }

                        var5 = (String)method29537(var0, var1, var6);
                        if (var5 != null) {
                           if (!var5.equals(var8)) {
                              throw var0.method24230("Mismatched '" + var8 + "' and '" + var5 + "'");
                           }

                           var8 = null;
                           if (!var1 && var6.method9134() > 0) {
                              var7.method21806("childNodes", var6);
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
                           throw var0.method24230("Misshaped tag");
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
                     throw var0.method24230("Reserved attribute.");
                  }

                  var9 = var0.method24215();
                  if (var9 != Class9029.field41315) {
                     var7.method21758(var12, "");
                  } else {
                     var9 = var0.method24215();
                     if (!(var9 instanceof String)) {
                        throw var0.method24230("Missing value");
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

                     throw var0.method24230("Misshaped close tag");
                  }

                  throw new Class2499("Expected a closing name instead of '" + var9 + "'.");
               }

               if (var9 != Class9029.field41314) {
                  if (var9 != Class9029.field41318) {
                     throw var0.method24230("Misshaped tag");
                  }

                  var0.method24216("?>");
               } else {
                  char var10 = var0.method24221();
                  if (var10 == '-') {
                     if (var0.method24221() != '-') {
                        var0.method24217();
                     } else {
                        var0.method24216("-->");
                     }
                  } else if (var10 == '[') {
                     var9 = var0.method24215();
                     if (!var9.equals("CDATA") || var0.method24221() != '[') {
                        throw var0.method24230("Expected 'CDATA['");
                     }

                     if (var2 != null) {
                        var2.method9158(var0.method24211());
                     }
                  } else {
                     int var11 = 1;

                     while (true) {
                        var9 = var0.method24214();
                        if (var9 == null) {
                           throw var0.method24230("Missing '>' after '<!'.");
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
            var2.method9158(!(var9 instanceof String) ? var9 : Class9029.method33430((String)var9));
         }
      }

      throw var0.method24230("Bad XML");
   }

   public static Class2344 method29538(String var0) throws Class2455 {
      return method29539(new Class7474(var0));
   }

   public static Class2344 method29539(Class7474 var0) throws Class2455 {
      return (Class2344)method29537(var0, true, null);
   }

   public static JSONObject method29540(Class7474 var0) throws Class2455 {
      return (JSONObject)method29537(var0, false, null);
   }

   public static JSONObject method29541(String var0) throws Class2455 {
      return method29540(new Class7474(var0));
   }

   public static String toString(Class2344 var0) throws Class2455 {
      StringBuilder var3 = new StringBuilder();
      String var4 = var0.method9131(0);
      Class9029.method33428(var4);
      var4 = Class9029.method33427(var4);
      var3.append('<');
      var3.append(var4);
      Object var5 = var0.method9135(1);
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

      int var9 = var0.method9134();
      if (var6 < var9) {
         var3.append('>');

         do {
            var5 = var0.method9121(var6);
            var6++;
            if (var5 != null) {
               if (!(var5 instanceof String)) {
                  if (!(var5 instanceof JSONObject)) {
                     if (!(var5 instanceof Class2344)) {
                        var3.append(var5.toString());
                     } else {
                        var3.append(toString((Class2344)var5));
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

   public static String toString(JSONObject var0) throws Class2455 {
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

         Class2344 var6 = var0.method21793("childNodes");
         if (var6 != null) {
            var3.append('>');
            int var7 = var6.method9134();

            for (int var8 = 0; var8 < var7; var8++) {
               Object var11 = var6.method9121(var8);
               if (var11 != null) {
                  if (!(var11 instanceof String)) {
                     if (!(var11 instanceof JSONObject)) {
                        if (!(var11 instanceof Class2344)) {
                           var3.append(var11.toString());
                        } else {
                           var3.append(toString((Class2344)var11));
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
