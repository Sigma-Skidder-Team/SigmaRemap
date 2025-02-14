package mapped;

import java.net.URL;

public class Class7677 {
   public Class7284 field32888;
   public String field32889;
   public Class9192 field32890;
   public Class4864 field32891;
   public Object field32892;

   public Class7677() {
      this.field32889 = "GET";
      this.field32890 = new Class9192();
   }

   public Class7677(Class8223 var1) {
      this.field32888 = var1.field35315;
      this.field32889 = var1.field35316;
      this.field32891 = var1.field35318;
      this.field32892 = var1.field35319;
      this.field32890 = var1.field35317.method35550();
   }

   public Class7677 method25235(Class7284 var1) {
      if (var1 != null) {
         this.field32888 = var1;
         return this;
      } else {
         throw new NullPointerException("url == null");
      }
   }

   public Class7677 method25236(String var1) {
      if (var1 != null) {
         if (!var1.regionMatches(true, 0, "ws:", 0, 3)) {
            if (var1.regionMatches(true, 0, "wss:", 0, 4)) {
               var1 = "https:" + var1.substring(4);
            }
         } else {
            var1 = "http:" + var1.substring(3);
         }

         Class7284 var4 = Class7284.method22966(var1);
         if (var4 != null) {
            return this.method25235(var4);
         } else {
            throw new IllegalArgumentException("unexpected url: " + var1);
         }
      } else {
         throw new NullPointerException("url == null");
      }
   }

   public Class7677 method25237(URL var1) {
      if (var1 != null) {
         Class7284 var4 = Class7284.method22967(var1);
         if (var4 != null) {
            return this.method25235(var4);
         } else {
            throw new IllegalArgumentException("unexpected url: " + var1);
         }
      } else {
         throw new NullPointerException("url == null");
      }
   }

   public Class7677 method25238(String var1, String var2) {
      this.field32890.method34439(var1, var2);
      return this;
   }

   public Class7677 method25239(String var1, String var2) {
      this.field32890.method34436(var1, var2);
      return this;
   }

   public Class7677 method25240(String var1) {
      this.field32890.method34438(var1);
      return this;
   }

   public Class7677 method25241(Class9371 var1) {
      this.field32890 = var1.method35550();
      return this;
   }

   public Class7677 method25242(Class7319 var1) {
      String var4 = var1.toString();
      return !var4.isEmpty() ? this.method25238("Cache-Control", var4) : this.method25240("Cache-Control");
   }

   public Class7677 method25243() {
      return this.method25250("GET", null);
   }

   public Class7677 method25244() {
      return this.method25250("HEAD", null);
   }

   public Class7677 method25245(Class4864 var1) {
      return this.method25250("POST", var1);
   }

   public Class7677 method25246(Class4864 var1) {
      return this.method25250("DELETE", var1);
   }

   public Class7677 method25247() {
      return this.method25246(Class9474.field44018);
   }

   public Class7677 method25248(Class4864 var1) {
      return this.method25250("PUT", var1);
   }

   public Class7677 method25249(Class4864 var1) {
      return this.method25250("PATCH", var1);
   }

   public Class7677 method25250(String var1, Class4864 var2) {
      if (var1 != null) {
         if (var1.length() != 0) {
            if (var2 != null && !Class8059.method27668(var1)) {
               throw new IllegalArgumentException("method " + var1 + " must not have a request body.");
            } else if (var2 == null && Class8059.method27667(var1)) {
               throw new IllegalArgumentException("method " + var1 + " must have a request body.");
            } else {
               this.field32889 = var1;
               this.field32891 = var2;
               return this;
            }
         } else {
            throw new IllegalArgumentException("method.length() == 0");
         }
      } else {
         throw new NullPointerException("method == null");
      }
   }

   public Class7677 method25251(Object var1) {
      this.field32892 = var1;
      return this;
   }

   public Class8223 method25252() {
      if (this.field32888 != null) {
         return new Class8223(this);
      } else {
         throw new IllegalStateException("url == null");
      }
   }
}
