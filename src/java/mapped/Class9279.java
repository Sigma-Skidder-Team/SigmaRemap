package mapped;

public class Class9279 {
   public Class8223 field42684;
   public Class2201 field42685;
   public int field42686 = -1;
   public String field42687;
   public Class6027 field42688;
   public Class9192 field42689;
   public Class1793 field42690;
   public Class1797 field42691;
   public Class1797 field42692;
   public Class1797 field42693;
   public long field42694;
   public long field42695;

   public Class9279() {
      this.field42689 = new Class9192();
   }

   public Class9279(Class1797 var1) {
      this.field42684 = var1.field9682;
      this.field42685 = var1.field9683;
      this.field42686 = var1.field9684;
      this.field42687 = var1.field9685;
      this.field42688 = var1.field9686;
      this.field42689 = var1.field9687.method35550();
      this.field42690 = var1.field9688;
      this.field42691 = var1.field9689;
      this.field42692 = var1.field9690;
      this.field42693 = var1.field9691;
      this.field42694 = var1.field9692;
      this.field42695 = var1.field9693;
   }

   public Class9279 method34977(Class8223 var1) {
      this.field42684 = var1;
      return this;
   }

   public Class9279 method34978(Class2201 var1) {
      this.field42685 = var1;
      return this;
   }

   public Class9279 method34979(int var1) {
      this.field42686 = var1;
      return this;
   }

   public Class9279 method34980(String var1) {
      this.field42687 = var1;
      return this;
   }

   public Class9279 method34981(Class6027 var1) {
      this.field42688 = var1;
      return this;
   }

   public Class9279 method34982(String var1, String var2) {
      this.field42689.method34439(var1, var2);
      return this;
   }

   public Class9279 method34983(String var1, String var2) {
      this.field42689.method34436(var1, var2);
      return this;
   }

   public Class9279 method34984(String var1) {
      this.field42689.method34438(var1);
      return this;
   }

   public Class9279 method34985(Class9371 var1) {
      this.field42689 = var1.method35550();
      return this;
   }

   public Class9279 method34986(Class1793 var1) {
      this.field42690 = var1;
      return this;
   }

   public Class9279 method34987(Class1797 var1) {
      if (var1 != null) {
         this.method34989("networkResponse", var1);
      }

      this.field42691 = var1;
      return this;
   }

   public Class9279 method34988(Class1797 var1) {
      if (var1 != null) {
         this.method34989("cacheResponse", var1);
      }

      this.field42692 = var1;
      return this;
   }

   private void method34989(String var1, Class1797 var2) {
      if (var2.field9688 == null) {
         if (var2.field9689 == null) {
            if (var2.field9690 == null) {
               if (var2.field9691 != null) {
                  throw new IllegalArgumentException(var1 + ".priorResponse != null");
               }
            } else {
               throw new IllegalArgumentException(var1 + ".cacheResponse != null");
            }
         } else {
            throw new IllegalArgumentException(var1 + ".networkResponse != null");
         }
      } else {
         throw new IllegalArgumentException(var1 + ".body != null");
      }
   }

   public Class9279 method34990(Class1797 var1) {
      if (var1 != null) {
         this.method34991(var1);
      }

      this.field42693 = var1;
      return this;
   }

   private void method34991(Class1797 var1) {
      if (var1.field9688 != null) {
         throw new IllegalArgumentException("priorResponse.body != null");
      }
   }

   public Class9279 method34992(long var1) {
      this.field42694 = var1;
      return this;
   }

   public Class9279 method34993(long var1) {
      this.field42695 = var1;
      return this;
   }

   public Class1797 method34994() {
      if (this.field42684 != null) {
         if (this.field42685 != null) {
            if (this.field42686 >= 0) {
               if (this.field42687 != null) {
                  return new Class1797(this);
               } else {
                  throw new IllegalStateException("message == null");
               }
            } else {
               throw new IllegalStateException("code < 0: " + this.field42686);
            }
         } else {
            throw new IllegalStateException("protocol == null");
         }
      } else {
         throw new IllegalStateException("request == null");
      }
   }
}
