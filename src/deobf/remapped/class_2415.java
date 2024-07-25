package remapped;

import java.net.URL;

public class class_2415 {
   public class_1672 field_12017;
   public String field_12020;
   public class_7414 field_12018;
   public class_9001 field_12016;
   public Object field_12015;

   public class_2415() {
      this.field_12020 = "GET";
      this.field_12018 = new class_7414();
   }

   public class_2415(class_3918 var1) {
      this.field_12017 = var1.field_19037;
      this.field_12020 = var1.field_19036;
      this.field_12016 = var1.field_19039;
      this.field_12015 = var1.field_19034;
      this.field_12018 = var1.field_19035.method_36952();
   }

   public class_2415 method_11007(class_1672 var1) {
      if (var1 != null) {
         this.field_12017 = var1;
         return this;
      } else {
         throw new NullPointerException("url == null");
      }
   }

   public class_2415 method_11005(String var1) {
      if (var1 != null) {
         if (!var1.regionMatches(true, 0, "ws:", 0, 3)) {
            if (var1.regionMatches(true, 0, "wss:", 0, 4)) {
               var1 = "https:" + var1.substring(4);
            }
         } else {
            var1 = "http:" + var1.substring(3);
         }

         class_1672 var4 = class_1672.method_7484(var1);
         if (var4 != null) {
            return this.method_11007(var4);
         } else {
            throw new IllegalArgumentException("unexpected url: " + var1);
         }
      } else {
         throw new NullPointerException("url == null");
      }
   }

   public class_2415 method_11006(URL var1) {
      if (var1 != null) {
         class_1672 var4 = class_1672.method_7457(var1);
         if (var4 != null) {
            return this.method_11007(var4);
         } else {
            throw new IllegalArgumentException("unexpected url: " + var1);
         }
      } else {
         throw new NullPointerException("url == null");
      }
   }

   public class_2415 method_11009(String var1, String var2) {
      this.field_12018.method_33774(var1, var2);
      return this;
   }

   public class_2415 method_11020(String var1, String var2) {
      this.field_12018.method_33778(var1, var2);
      return this;
   }

   public class_2415 method_11003(String var1) {
      this.field_12018.method_33783(var1);
      return this;
   }

   public class_2415 method_11012(class_8121 var1) {
      this.field_12018 = var1.method_36952();
      return this;
   }

   public class_2415 method_11011(class_1766 var1) {
      String var4 = var1.toString();
      return !var4.isEmpty() ? this.method_11009("Cache-Control", var4) : this.method_11003("Cache-Control");
   }

   public class_2415 method_11017() {
      return this.method_11008("GET", null);
   }

   public class_2415 method_11021() {
      return this.method_11008("HEAD", null);
   }

   public class_2415 method_11004(class_9001 var1) {
      return this.method_11008("POST", var1);
   }

   public class_2415 method_11019(class_9001 var1) {
      return this.method_11008("DELETE", var1);
   }

   public class_2415 method_11018() {
      return this.method_11019(class_8515.field_43591);
   }

   public class_2415 method_11016(class_9001 var1) {
      return this.method_11008("PUT", var1);
   }

   public class_2415 method_11014(class_9001 var1) {
      return this.method_11008("PATCH", var1);
   }

   public class_2415 method_11008(String var1, class_9001 var2) {
      if (var1 != null) {
         if (var1.length() != 0) {
            if (var2 != null && !class_3493.method_16060(var1)) {
               throw new IllegalArgumentException("method " + var1 + " must not have a request body.");
            } else if (var2 == null && class_3493.method_16064(var1)) {
               throw new IllegalArgumentException("method " + var1 + " must have a request body.");
            } else {
               this.field_12020 = var1;
               this.field_12016 = var2;
               return this;
            }
         } else {
            throw new IllegalArgumentException("method.length() == 0");
         }
      } else {
         throw new NullPointerException("method == null");
      }
   }

   public class_2415 method_11010(Object var1) {
      this.field_12015 = var1;
      return this;
   }

   public class_3918 method_11013() {
      if (this.field_12017 != null) {
         return new class_3918(this);
      } else {
         throw new IllegalStateException("url == null");
      }
   }
}
