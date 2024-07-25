package remapped;

import com.google.gson.JsonElement;

public class class_68 {
   private static String[] field_85;
   private static final class_9078 field_84 = new class_9702();

   public static String method_67(String var0, class_2909 var1, boolean var2) {
      class_5028 var5 = new class_5028();
      class_5028 var6 = new class_5028();
      StringBuilder var7 = new StringBuilder();
      if (var2) {
         var5.method_29053(Boolean.valueOf(false));
      }

      for (int var8 = 0; var8 < var0.length(); var8++) {
         char var9 = var0.charAt(var8);
         if (var9 != 167) {
            var7.append(var9);
         } else {
            if (++var8 >= var0.length()) {
               break;
            }

            var9 = var0.charAt(var8);
            if (var9 >= 'A' && var9 <= 'Z') {
               var9 = (char)(var9 + ' ');
            }

            class_2909 var10 = class_2909.method_13308(var9);
            if (var10 != null) {
               if (var7.length() > 0) {
                  class_5028 var11 = var6;
                  var6 = new class_5028(var6);
                  var11.method_23187(var7.toString());
                  var7 = new StringBuilder();
                  var5.method_29080(var11);
               }

               if (!class_2909.field_14199.equals(var10)) {
                  if (!class_2909.field_14211.equals(var10)) {
                     if (!class_2909.field_14202.equals(var10)) {
                        if (!class_2909.field_14193.equals(var10)) {
                           if (!class_2909.field_14190.equals(var10)) {
                              if (!class_2909.field_14192.equals(var10)) {
                                 var6 = new class_5028();
                                 var6.method_29073(var10);
                              } else {
                                 var6 = new class_5028();
                                 var6.method_29073(var1);
                              }
                           } else {
                              var6.method_29082(Boolean.valueOf(true));
                           }
                        } else {
                           var6.method_29075(Boolean.valueOf(true));
                        }
                     } else {
                        var6.method_29068(Boolean.valueOf(true));
                     }
                  } else {
                     var6.method_29053(Boolean.valueOf(true));
                  }
               } else {
                  var6.method_29050(Boolean.valueOf(true));
               }
            }
         }
      }

      var6.method_23187(var7.toString());
      var5.method_29080(var6);
      return class_9578.toString(var5);
   }

   public static JsonElement method_66(String var0, class_2909 var1) {
      return class_9012.method_41352().parse(method_67(var0, var1, false));
   }

   public static JsonElement method_70(String var0) {
      return method_66(var0, class_2909.field_14206);
   }

   public static String method_69(String var0) {
      return method_67(var0, class_2909.field_14206, false);
   }

   public static String method_72(String var0) {
      return class_5028.method_29071(class_9578.method_44258(var0));
   }

   public static void method_71(JsonElement var0) {
      field_84.method_41802(var0);
   }
}
