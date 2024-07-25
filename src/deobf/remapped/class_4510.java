package remapped;

import java.util.Iterator;
import org.json.JSONException;

public class class_4510 {
   private static Object method_20970(class_2021 var0, boolean var1, class_1336 var2) throws JSONException {
      Object var5 = null;
      class_1336 var6 = null;
      class_1293 var7 = null;
      Object var8 = null;

      while (var0.method_17294()) {
         Object var9 = var0.method_9390();
         if (var9 == class_6745.field_34815) {
            var9 = var0.method_9391();
            if (!(var9 instanceof Character)) {
               if (!(var9 instanceof String)) {
                  throw var0.method_17292("Bad tagName '" + var9 + "'.");
               }

               var8 = (String)var9;
               var6 = new class_1336();
               var7 = new class_1293();
               if (!var1) {
                  var7.method_5820("tagName", var8);
                  if (var2 != null) {
                     var2.method_6159(var7);
                  }
               } else {
                  var6.method_6159(var8);
                  if (var2 != null) {
                     var2.method_6159(var6);
                  }
               }

               var9 = null;

               while (true) {
                  if (var9 == null) {
                     var9 = var0.method_9391();
                  }

                  if (var9 == null) {
                     throw var0.method_17292("Misshaped tag");
                  }

                  if (!(var9 instanceof String)) {
                     if (var1 && var7.method_5806() > 0) {
                        var6.method_6159(var7);
                     }

                     if (var9 != class_6745.field_34811) {
                        if (var9 != class_6745.field_34812) {
                           throw var0.method_17292("Misshaped tag");
                        }

                        var5 = (String)method_20970(var0, var1, var6);
                        if (var5 != null) {
                           if (!var5.equals(var8)) {
                              throw var0.method_17292("Mismatched '" + var8 + "' and '" + var5 + "'");
                           }

                           var8 = null;
                           if (!var1 && var6.method_6142() > 0) {
                              var7.method_5820("childNodes", var6);
                           }

                           if (var2 == null) {
                              if (!var1) {
                                 return var7;
                              }

                              return var6;
                           }
                        }
                     } else {
                        if (var0.method_9391() != class_6745.field_34812) {
                           throw var0.method_17292("Misshaped tag");
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
                     throw var0.method_17292("Reserved attribute.");
                  }

                  var9 = var0.method_9391();
                  if (var9 != class_6745.field_34814) {
                     var7.method_5842(var12, "");
                  } else {
                     var9 = var0.method_9391();
                     if (!(var9 instanceof String)) {
                        throw var0.method_17292("Missing value");
                     }

                     var7.method_5842(var12, class_6745.method_30893((String)var9));
                     var9 = null;
                  }
               }
            } else {
               if (var9 == class_6745.field_34811) {
                  var9 = var0.method_9391();
                  if (var9 instanceof String) {
                     if (var0.method_9391() == class_6745.field_34812) {
                        return var9;
                     }

                     throw var0.method_17292("Misshaped close tag");
                  }

                  throw new class_7584("Expected a closing name instead of '" + var9 + "'.");
               }

               if (var9 != class_6745.field_34819) {
                  if (var9 != class_6745.field_34817) {
                     throw var0.method_17292("Misshaped tag");
                  }

                  var0.method_9386("?>");
               } else {
                  char var10 = var0.method_17289();
                  if (var10 == '-') {
                     if (var0.method_17289() != '-') {
                        var0.method_17299();
                     } else {
                        var0.method_9386("-->");
                     }
                  } else if (var10 == '[') {
                     var9 = var0.method_9391();
                     if (!var9.equals("CDATA") || var0.method_17289() != '[') {
                        throw var0.method_17292("Expected 'CDATA['");
                     }

                     if (var2 != null) {
                        var2.method_6159(var0.method_9387());
                     }
                  } else {
                     int var11 = 1;

                     while (true) {
                        var9 = var0.method_9389();
                        if (var9 == null) {
                           throw var0.method_17292("Missing '>' after '<!'.");
                        }

                        if (var9 != class_6745.field_34815) {
                           if (var9 == class_6745.field_34812) {
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
            var2.method_6159(!(var9 instanceof String) ? var9 : class_6745.method_30893((String)var9));
         }
      }

      throw var0.method_17292("Bad XML");
   }

   public static class_1336 method_20968(String var0) throws JSONException {
      return method_20969(new class_2021(var0));
   }

   public static class_1336 method_20969(class_2021 var0) throws JSONException {
      return (class_1336)method_20970(var0, true, null);
   }

   public static class_1293 method_20967(class_2021 var0) throws JSONException {
      return (class_1293)method_20970(var0, false, null);
   }

   public static class_1293 method_20966(String var0) throws JSONException {
      return method_20967(new class_2021(var0));
   }

   public static String toString(class_1336 var0) throws JSONException {
      StringBuilder var3 = new StringBuilder();
      String var4 = var0.method_6133(0);
      class_6745.method_30892(var4);
      var4 = class_6745.method_30891(var4);
      var3.append('<');
      var3.append(var4);
      Object var5 = var0.method_6135(1);
      int var6;
      if (!(var5 instanceof class_1293)) {
         var6 = 1;
      } else {
         var6 = 2;
         class_1293 var7 = (class_1293)var5;
         Iterator var8 = var7.method_5841();

         while (var8.hasNext()) {
            String var10 = (String)var8.next();
            class_6745.method_30892(var10);
            String var11 = var7.method_5851(var10);
            if (var11 != null) {
               var3.append(' ');
               var3.append(class_6745.method_30891(var10));
               var3.append('=');
               var3.append('"');
               var3.append(class_6745.method_30891(var11));
               var3.append('"');
            }
         }
      }

      int var9 = var0.method_6142();
      if (var6 < var9) {
         var3.append('>');

         do {
            var5 = var0.method_6130(var6);
            var6++;
            if (var5 != null) {
               if (!(var5 instanceof String)) {
                  if (!(var5 instanceof class_1293)) {
                     if (!(var5 instanceof class_1336)) {
                        var3.append(var5.toString());
                     } else {
                        var3.append(toString((class_1336)var5));
                     }
                  } else {
                     var3.append(toString((class_1293)var5));
                  }
               } else {
                  var3.append(class_6745.method_30891(var5.toString()));
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

   public static String toString(class_1293 var0) throws JSONException {
      StringBuilder var3 = new StringBuilder();
      String var4 = var0.method_5851("tagName");
      if (var4 == null) {
         return class_6745.method_30891(var0.toString());
      } else {
         class_6745.method_30892(var4);
         var4 = class_6745.method_30891(var4);
         var3.append('<');
         var3.append(var4);
         Iterator var5 = var0.method_5841();

         while (var5.hasNext()) {
            String var9 = (String)var5.next();
            if (!"tagName".equals(var9) && !"childNodes".equals(var9)) {
               class_6745.method_30892(var9);
               String var10 = var0.method_5851(var9);
               if (var10 != null) {
                  var3.append(' ');
                  var3.append(class_6745.method_30891(var9));
                  var3.append('=');
                  var3.append('"');
                  var3.append(class_6745.method_30891(var10));
                  var3.append('"');
               }
            }
         }

         class_1336 var6 = var0.method_5809("childNodes");
         if (var6 != null) {
            var3.append('>');
            int var7 = var6.method_6142();

            for (int var8 = 0; var8 < var7; var8++) {
               Object var11 = var6.method_6130(var8);
               if (var11 != null) {
                  if (!(var11 instanceof String)) {
                     if (!(var11 instanceof class_1293)) {
                        if (!(var11 instanceof class_1336)) {
                           var3.append(var11.toString());
                        } else {
                           var3.append(toString((class_1336)var11));
                        }
                     } else {
                        var3.append(toString((class_1293)var11));
                     }
                  } else {
                     var3.append(class_6745.method_30891(var11.toString()));
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
