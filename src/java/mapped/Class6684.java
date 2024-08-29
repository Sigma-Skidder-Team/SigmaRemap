package mapped;

import java.util.ArrayList;
import java.util.List;

public class Class6684 extends Class6679 {
   private Class9458[] field29292 = null;
   private Class6679[] field29293 = null;
   private static final String field29294 = "<profile>";
   private static final String field29295 = "<custom>";

   public Class6684(Class9458[] var1, Class6679[] var2) {
      super("<profile>", "", method20397(var1, var2), method20399(var1), method20398(var1, var2, true), (String)null);
      this.field29292 = var1;
      this.field29293 = var2;
   }

   @Override
   public void method20374() {
      super.method20374();
      if (this.method20370().equals("<custom>")) {
         super.method20374();
      }

      this.method20394();
   }

   public void method20393() {
      Class9458 var3 = this.method20396(this.method20370());
      if (var3 == null || !Class6817.method20784(var3, this.field29293, false)) {
         String var4 = method20397(this.field29292, this.field29293);
         this.method20371(var4);
      }
   }

   private void method20394() {
      Class9458 var3 = this.method20396(this.method20370());
      if (var3 != null) {
         String[] var4 = var3.method36404();

         for (int var5 = 0; var5 < var4.length; var5++) {
            String var6 = var4[var5];
            Class6679 var7 = this.method20395(var6);
            if (var7 != null) {
               String var8 = var3.method36405(var6);
               var7.method20371(var8);
            }
         }
      }
   }

   private Class6679 method20395(String var1) {
      for (int var4 = 0; var4 < this.field29293.length; var4++) {
         Class6679 var5 = this.field29293[var4];
         if (var5.method20366().equals(var1)) {
            return var5;
         }
      }

      return null;
   }

   private Class9458 method20396(String var1) {
      for (int var4 = 0; var4 < this.field29292.length; var4++) {
         Class9458 var5 = this.field29292[var4];
         if (var5.method36400().equals(var1)) {
            return var5;
         }
      }

      return null;
   }

   @Override
   public String method20385() {
      return Class8043.method27619("of.shaders.profile");
   }

   @Override
   public String method20361(String var1) {
      return !var1.equals("<custom>") ? Shaders.method33144("profile." + var1, var1) : Class8043.method27621("of.general.custom", "<custom>");
   }

   @Override
   public String method20362(String var1) {
      return !var1.equals("<custom>") ? "§a" : "§c";
   }

   @Override
   public String method20368() {
      String var3 = Shaders.method33144("profile.comment", (String)null);
      if (var3 == null) {
         StringBuffer var4 = new StringBuffer();

         for (int var5 = 0; var5 < this.field29292.length; var5++) {
            String var6 = this.field29292[var5].method36400();
            if (var6 != null) {
               String var7 = Shaders.method33144("profile." + var6 + ".comment", (String)null);
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

   private static String method20397(Class9458[] var0, Class6679[] var1) {
      return method20398(var0, var1, false);
   }

   private static String method20398(Class9458[] var0, Class6679[] var1, boolean var2) {
      Class9458 var5 = Class6817.method20783(var0, var1, var2);
      return var5 != null ? var5.method36400() : "<custom>";
   }

   private static String[] method20399(Class9458[] var0) {
      List<String> var3 = new ArrayList();

      for (int var4 = 0; var4 < var0.length; var4++) {
         Class9458 var5 = var0[var4];
         var3.add(var5.method36400());
      }

      var3.add("<custom>");
      return var3.toArray(new String[var3.size()]);
   }
}
