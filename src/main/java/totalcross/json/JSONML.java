package totalcross.json;

import java.util.Iterator;

public class JSONML {
   private static Object parse(XMLTokener var0, boolean var1, JSONArray var2) throws JSONException {
      Object var5 = null;
      JSONArray var6 = null;
      JSONObject var7 = null;
      Object var8 = null;

      while (var0.more()) {
         Object var9 = var0.nextContent();
         if (var9 == XML.LT) {
            var9 = var0.nextToken();
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
                     var9 = var0.nextToken();
                  }

                  if (var9 == null) {
                     throw var0.syntaxError("Misshaped tag");
                  }

                  if (!(var9 instanceof String)) {
                     if (var1 && var7.length() > 0) {
                        var6.put(var7);
                     }

                     if (var9 != XML.SLASH) {
                        if (var9 != XML.GT) {
                           throw var0.syntaxError("Misshaped tag");
                        }

                        var5 = (String) parse(var0, var1, var6);
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
                        if (var0.nextToken() != XML.GT) {
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

                  var9 = var0.nextToken();
                  if (var9 != XML.EQ) {
                     var7.accumulate(var12, "");
                  } else {
                     var9 = var0.nextToken();
                     if (!(var9 instanceof String)) {
                        throw var0.syntaxError("Missing value");
                     }

                     var7.accumulate(var12, XML.stringToValue((String)var9));
                     var9 = null;
                  }
               }
            } else {
               if (var9 == XML.SLASH) {
                  var9 = var0.nextToken();
                  if (var9 instanceof String) {
                     if (var0.nextToken() == XML.GT) {
                        return var9;
                     }

                     throw var0.syntaxError("Misshaped close tag");
                  }

                  throw new JSONException2("Expected a closing name instead of '" + var9 + "'.");
               }

               if (var9 != XML.BANG) {
                  if (var9 != XML.QUEST) {
                     throw var0.syntaxError("Misshaped tag");
                  }

                  var0.skipPast("?>");
               } else {
                  char var10 = var0.next();
                  if (var10 == '-') {
                     if (var0.next() != '-') {
                        var0.back();
                     } else {
                        var0.skipPast("-->");
                     }
                  } else if (var10 == '[') {
                     var9 = var0.nextToken();
                     if (!var9.equals("CDATA") || var0.next() != '[') {
                        throw var0.syntaxError("Expected 'CDATA['");
                     }

                     if (var2 != null) {
                        var2.put(var0.nextCDATA());
                     }
                  } else {
                     int var11 = 1;

                     while (true) {
                        var9 = var0.nextMeta();
                        if (var9 == null) {
                           throw var0.syntaxError("Missing '>' after '<!'.");
                        }

                        if (var9 != XML.LT) {
                           if (var9 == XML.GT) {
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
            var2.put(!(var9 instanceof String) ? var9 : XML.stringToValue((String)var9));
         }
      }

      throw var0.syntaxError("Bad XML");
   }

   public static JSONArray toJSONArray(String var0) throws JSONException {
      return toJSONArray(new XMLTokener(var0));
   }

   public static JSONArray toJSONArray(XMLTokener var0) throws JSONException {
      return (JSONArray) parse(var0, true, null);
   }

   public static JSONObject toJSONObject(XMLTokener var0) throws JSONException {
      return (JSONObject) parse(var0, false, null);
   }

   public static JSONObject toJSONObject(String var0) throws JSONException {
      return toJSONObject(new XMLTokener(var0));
   }

   public static String toString(JSONArray var0) throws JSONException {
      StringBuilder var3 = new StringBuilder();
      String var4 = var0.getString(0);
      XML.noSpace(var4);
      var4 = XML.escape(var4);
      var3.append('<');
      var3.append(var4);
      Object var5 = var0.opt(1);
      int var6;
      if (!(var5 instanceof JSONObject)) {
         var6 = 1;
      } else {
         var6 = 2;
         JSONObject var7 = (JSONObject)var5;
         Iterator var8 = var7.keys();

         while (var8.hasNext()) {
            String var10 = (String)var8.next();
            XML.noSpace(var10);
            String var11 = var7.optString(var10);
            if (var11 != null) {
               var3.append(' ');
               var3.append(XML.escape(var10));
               var3.append('=');
               var3.append('"');
               var3.append(XML.escape(var11));
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
                  var3.append(XML.escape(var5.toString()));
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
      String var4 = var0.optString("tagName");
      if (var4 == null) {
         return XML.escape(var0.toString());
      } else {
         XML.noSpace(var4);
         var4 = XML.escape(var4);
         var3.append('<');
         var3.append(var4);
         Iterator var5 = var0.keys();

         while (var5.hasNext()) {
            String var9 = (String)var5.next();
            if (!"tagName".equals(var9) && !"childNodes".equals(var9)) {
               XML.noSpace(var9);
               String var10 = var0.optString(var9);
               if (var10 != null) {
                  var3.append(' ');
                  var3.append(XML.escape(var9));
                  var3.append('=');
                  var3.append('"');
                  var3.append(XML.escape(var10));
                  var3.append('"');
               }
            }
         }

         JSONArray var6 = var0.optJSONArray("childNodes");
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
                     var3.append(XML.escape(var11.toString()));
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
