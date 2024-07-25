package remapped;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class class_5028 extends class_6349 {
   private static final Pattern field_26006 = Pattern.compile("^(?:(https?)://)?([-\\w_\\.]{2,}\\.[a-z]{2,4})(/\\S*)?$");
   private String field_26005;

   public static class_6349[] method_23188(String var0) {
      return method_23189(var0, class_2909.field_14206);
   }

   public static class_6349[] method_23189(String var0, class_2909 var1) {
      ArrayList var4 = new ArrayList();
      StringBuilder var5 = new StringBuilder();
      class_5028 var6 = new class_5028();
      Matcher var7 = field_26006.matcher(var0);

      for (int var8 = 0; var8 < var0.length(); var8++) {
         char var9 = var0.charAt(var8);
         if (var9 == 167) {
            if (++var8 >= var0.length()) {
               break;
            }

            var9 = var0.charAt(var8);
            if (var9 >= 'A' && var9 <= 'Z') {
               var9 = (char)(var9 + ' ');
            }

            class_2909 var10 = class_2909.method_13308(var9);
            if (var10 != null) {
               if (var5.length() > 0) {
                  class_5028 var11 = var6;
                  var6 = new class_5028(var6);
                  var11.method_23187(var5.toString());
                  var5 = new StringBuilder();
                  var4.add(var11);
               }

               switch (var10) {
                  case field_14199:
                     var6.method_29050(Boolean.valueOf(true));
                     break;
                  case field_14211:
                     var6.method_29053(Boolean.valueOf(true));
                     break;
                  case field_14202:
                     var6.method_29068(Boolean.valueOf(true));
                     break;
                  case field_14193:
                     var6.method_29075(Boolean.valueOf(true));
                     break;
                  case field_14190:
                     var6.method_29082(Boolean.valueOf(true));
                     break;
                  case field_14192:
                     var10 = var1;
                  default:
                     var6 = new class_5028();
                     var6.method_29073(var10);
               }
            }
         } else {
            int var15 = var0.indexOf(32, var8);
            if (var15 == -1) {
               var15 = var0.length();
            }

            if (var7.region(var8, var15).find()) {
               if (var5.length() > 0) {
                  class_5028 var16 = var6;
                  var6 = new class_5028(var6);
                  var16.method_23187(var5.toString());
                  var5 = new StringBuilder();
                  var4.add(var16);
               }

               class_5028 var13 = new class_5028(var6);
               String var12 = var0.substring(var8, var15);
               var13.method_23187(var12);
               var13.method_29060(new class_2257(class_7354.field_37592, var12.startsWith("http") ? var12 : "http://" + var12));
               var4.add(var13);
               var8 += var15 - var8 - 1;
               var6 = var6;
            } else {
               var5.append(var9);
            }
         }
      }

      var6.method_23187(var5.toString());
      var4.add(var6);
      return var4.<class_6349>toArray(new class_6349[var4.size()]);
   }

   public class_5028() {
      this.field_26005 = "";
   }

   public class_5028(class_5028 var1) {
      super(var1);
      this.method_23187(var1.method_23190());
   }

   public class_5028(class_6349... var1) {
      this.method_23187("");
      this.method_29043(new ArrayList<class_6349>(Arrays.asList(var1)));
   }

   @Override
   public class_6349 method_29059() {
      return new class_5028(this);
   }

   @Override
   public void method_29066(StringBuilder var1) {
      var1.append(this.field_26005);
      super.method_29066(var1);
   }

   @Override
   public void method_29070(StringBuilder var1) {
      var1.append(this.method_29077());
      if (this.method_29051()) {
         var1.append(class_2909.field_14199);
      }

      if (this.method_29042()) {
         var1.append(class_2909.field_14211);
      }

      if (this.method_29044()) {
         var1.append(class_2909.field_14202);
      }

      if (this.method_29047()) {
         var1.append(class_2909.field_14193);
      }

      if (this.method_29063()) {
         var1.append(class_2909.field_14190);
      }

      var1.append(this.field_26005);
      super.method_29070(var1);
   }

   @Override
   public String toString() {
      return String.format("TextComponent{text=%s, %s}", this.field_26005, super.toString());
   }

   public String method_23190() {
      return this.field_26005;
   }

   public void method_23187(String var1) {
      this.field_26005 = var1;
   }

   public class_5028(String var1) {
      this.field_26005 = var1;
   }
}
