package remapped;

import java.util.ArrayList;

public class class_4058 extends class_6843 {
   private class_8471[] field_19767 = null;
   private class_6843[] field_19771 = null;
   private static final String field_19769 = "<profile>";
   private static final String field_19768 = "<custom>";

   public class_4058(class_8471[] var1, class_6843[] var2) {
      super("<profile>", "", method_18721(var1, var2), method_18723(var1), method_18722(var1, var2, true), (String)null);
      this.field_19767 = var1;
      this.field_19771 = var2;
   }

   @Override
   public void method_31385() {
      super.method_31385();
      if (this.method_31403().equals("<custom>")) {
         super.method_31385();
      }

      this.method_18725();
   }

   public void method_18720() {
      class_8471 var3 = this.method_18726(this.method_31403());
      if (var3 == null || !class_1001.method_4340(var3, this.field_19771, false)) {
         String var4 = method_18721(this.field_19767, this.field_19771);
         this.method_31398(var4);
      }
   }

   private void method_18725() {
      class_8471 var3 = this.method_18726(this.method_31403());
      if (var3 != null) {
         String[] var4 = var3.method_38987();

         for (int var5 = 0; var5 < var4.length; var5++) {
            String var6 = var4[var5];
            class_6843 var7 = this.method_18724(var6);
            if (var7 != null) {
               String var8 = var3.method_38983(var6);
               var7.method_31398(var8);
            }
         }
      }
   }

   private class_6843 method_18724(String var1) {
      for (int var4 = 0; var4 < this.field_19771.length; var4++) {
         class_6843 var5 = this.field_19771[var4];
         if (var5.method_31405().equals(var1)) {
            return var5;
         }
      }

      return null;
   }

   private class_8471 method_18726(String var1) {
      for (int var4 = 0; var4 < this.field_19767.length; var4++) {
         class_8471 var5 = this.field_19767[var4];
         if (var5.method_38982().equals(var1)) {
            return var5;
         }
      }

      return null;
   }

   @Override
   public String method_31378() {
      return class_3458.method_15912("of.shaders.profile");
   }

   @Override
   public String method_31395(String var1) {
      return !var1.equals("<custom>") ? class_6588.method_30244("profile." + var1, var1) : class_3458.method_15913("of.general.custom", "<custom>");
   }

   @Override
   public String method_31381(String var1) {
      return !var1.equals("<custom>") ? "§a" : "§c";
   }

   @Override
   public String method_31392() {
      String var3 = class_6588.method_30244("profile.comment", (String)null);
      if (var3 == null) {
         StringBuffer var4 = new StringBuffer();

         for (int var5 = 0; var5 < this.field_19767.length; var5++) {
            String var6 = this.field_19767[var5].method_38982();
            if (var6 != null) {
               String var7 = class_6588.method_30244("profile." + var6 + ".comment", (String)null);
               if (var7 != null) {
                  var4.append(var7);
                  if (!var7.endsWith(". ")) {
                     var4.append(". ");
                  }
               }
            }
         }

         return var4.toString();
      } else {
         return var3;
      }
   }

   private static String method_18721(class_8471[] var0, class_6843[] var1) {
      return method_18722(var0, var1, false);
   }

   private static String method_18722(class_8471[] var0, class_6843[] var1, boolean var2) {
      class_8471 var5 = class_1001.method_4339(var0, var1, var2);
      return var5 != null ? var5.method_38982() : "<custom>";
   }

   private static String[] method_18723(class_8471[] var0) {
      ArrayList var3 = new ArrayList();

      for (int var4 = 0; var4 < var0.length; var4++) {
         class_8471 var5 = var0[var4];
         var3.add(var5.method_38982());
      }

      var3.add("<custom>");
      return var3.<String>toArray(new String[var3.size()]);
   }
}
