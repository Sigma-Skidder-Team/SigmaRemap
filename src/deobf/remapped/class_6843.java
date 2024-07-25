package remapped;

import java.util.Arrays;
import java.util.List;

public abstract class class_6843 {
   private String field_35290 = null;
   private String field_35291 = null;
   private String field_35286 = null;
   private String[] field_35285 = null;
   private String field_35284 = null;
   private String[] field_35288 = null;
   private boolean field_35293 = true;
   private boolean field_35289 = true;
   public static final String field_35283 = "§a";
   public static final String field_35287 = "§c";
   public static final String field_35292 = "§9";

   public class_6843(String var1, String var2, String var3, String[] var4, String var5, String var6) {
      this.field_35290 = var1;
      this.field_35291 = var2;
      this.field_35286 = var3;
      this.field_35285 = var4;
      this.field_35284 = var5;
      if (var6 != null) {
         this.field_35288 = new String[]{var6};
      }
   }

   public String method_31405() {
      return this.field_35290;
   }

   public String method_31397() {
      return this.field_35291;
   }

   public String method_31392() {
      String var3 = class_3111.method_14305(this.field_35291);
      var3 = class_8251.method_37832(var3, "//");
      return class_6588.method_30244("option." + this.method_31405() + ".comment", var3);
   }

   public void method_31388(String var1) {
      this.field_35291 = var1;
   }

   public String method_31403() {
      return this.field_35286;
   }

   public boolean method_31398(String var1) {
      int var4 = method_31384(var1, this.field_35285);
      if (var4 >= 0) {
         this.field_35286 = var1;
         return true;
      } else {
         return false;
      }
   }

   public String method_31382() {
      return this.field_35284;
   }

   public void method_31401() {
      this.field_35286 = this.field_35284;
   }

   public void method_31385() {
      int var3 = method_31384(this.field_35286, this.field_35285);
      if (var3 >= 0) {
         var3 = (var3 + 1) % this.field_35285.length;
         this.field_35286 = this.field_35285[var3];
      }
   }

   public void method_31406() {
      int var3 = method_31384(this.field_35286, this.field_35285);
      if (var3 >= 0) {
         var3 = (var3 - 1 + this.field_35285.length) % this.field_35285.length;
         this.field_35286 = this.field_35285[var3];
      }
   }

   private static int method_31384(String var0, String[] var1) {
      for (int var4 = 0; var4 < var1.length; var4++) {
         String var5 = var1[var4];
         if (var5.equals(var0)) {
            return var4;
         }
      }

      return -1;
   }

   public String[] method_31402() {
      return this.field_35288;
   }

   public void method_31390(String[] var1) {
      List var4 = Arrays.<String>asList(this.field_35288);

      for (int var5 = 0; var5 < var1.length; var5++) {
         String var6 = var1[var5];
         if (!var4.contains(var6)) {
            this.field_35288 = (String[])class_3111.method_14441(this.field_35288, var6);
         }
      }
   }

   public boolean method_31389() {
      return this.field_35293;
   }

   public void method_31386(boolean var1) {
      this.field_35293 = var1;
   }

   public boolean method_31396() {
      return !class_3111.equals(this.field_35286, this.field_35284);
   }

   public boolean method_31394() {
      return this.field_35289;
   }

   public void method_31400(boolean var1) {
      this.field_35289 = var1;
   }

   public boolean method_31380(String var1) {
      return method_31384(var1, this.field_35285) >= 0;
   }

   public String method_31378() {
      return class_6588.method_30244("option." + this.field_35290, this.field_35290);
   }

   public String method_31395(String var1) {
      return class_6588.method_30244("value." + this.field_35290 + "." + var1, var1);
   }

   public String method_31381(String var1) {
      return "";
   }

   public boolean method_31407(String var1) {
      return false;
   }

   public boolean method_31399() {
      return false;
   }

   public boolean method_31379(String var1) {
      return false;
   }

   public String method_31391() {
      return null;
   }

   public String[] method_31383() {
      return (String[])this.field_35285.clone();
   }

   public float method_31404() {
      if (this.field_35285.length > 1) {
         int var3 = method_31384(this.field_35286, this.field_35285);
         return var3 >= 0 ? 1.0F * (float)var3 / ((float)this.field_35285.length - 1.0F) : 0.0F;
      } else {
         return 0.0F;
      }
   }

   public void method_31393(float var1) {
      if (this.field_35285.length > 1) {
         var1 = class_3111.method_14262(var1, 0.0F, 1.0F);
         int var4 = Math.round(var1 * (float)(this.field_35285.length - 1));
         this.field_35286 = this.field_35285[var4];
      }
   }

   @Override
   public String toString() {
      return ""
         + this.field_35290
         + ", value: "
         + this.field_35286
         + ", valueDefault: "
         + this.field_35284
         + ", paths: "
         + class_3111.method_14289(this.field_35288);
   }
}
