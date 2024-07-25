package remapped;

public class class_7775 {
   public class_3918 field_39412;
   public class_7976 field_39411;
   public int field_39414 = -1;
   public String field_39408;
   public class_442 field_39410;
   public class_7414 field_39409;
   public class_8856 field_39417;
   public class_7839 field_39407;
   public class_7839 field_39415;
   public class_7839 field_39416;
   public long field_39418;
   public long field_39419;

   public class_7775() {
      this.field_39409 = new class_7414();
   }

   public class_7775(class_7839 var1) {
      this.field_39412 = var1.field_39741;
      this.field_39411 = var1.field_39750;
      this.field_39414 = var1.field_39749;
      this.field_39408 = var1.field_39748;
      this.field_39410 = var1.field_39737;
      this.field_39409 = var1.field_39739.method_36952();
      this.field_39417 = var1.field_39747;
      this.field_39407 = var1.field_39744;
      this.field_39415 = var1.field_39738;
      this.field_39416 = var1.field_39742;
      this.field_39418 = var1.field_39740;
      this.field_39419 = var1.field_39746;
   }

   public class_7775 method_35283(class_3918 var1) {
      this.field_39412 = var1;
      return this;
   }

   public class_7775 method_35269(class_7976 var1) {
      this.field_39411 = var1;
      return this;
   }

   public class_7775 method_35267(int var1) {
      this.field_39414 = var1;
      return this;
   }

   public class_7775 method_35281(String var1) {
      this.field_39408 = var1;
      return this;
   }

   public class_7775 method_35272(class_442 var1) {
      this.field_39410 = var1;
      return this;
   }

   public class_7775 method_35279(String var1, String var2) {
      this.field_39409.method_33774(var1, var2);
      return this;
   }

   public class_7775 method_35273(String var1, String var2) {
      this.field_39409.method_33778(var1, var2);
      return this;
   }

   public class_7775 method_35284(String var1) {
      this.field_39409.method_33783(var1);
      return this;
   }

   public class_7775 method_35271(class_8121 var1) {
      this.field_39409 = var1.method_36952();
      return this;
   }

   public class_7775 method_35282(class_8856 var1) {
      this.field_39417 = var1;
      return this;
   }

   public class_7775 method_35280(class_7839 var1) {
      if (var1 != null) {
         this.method_35274("networkResponse", var1);
      }

      this.field_39407 = var1;
      return this;
   }

   public class_7775 method_35275(class_7839 var1) {
      if (var1 != null) {
         this.method_35274("cacheResponse", var1);
      }

      this.field_39415 = var1;
      return this;
   }

   private void method_35274(String var1, class_7839 var2) {
      if (var2.field_39747 == null) {
         if (var2.field_39744 == null) {
            if (var2.field_39738 == null) {
               if (var2.field_39742 != null) {
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

   public class_7775 method_35277(class_7839 var1) {
      if (var1 != null) {
         this.method_35270(var1);
      }

      this.field_39416 = var1;
      return this;
   }

   private void method_35270(class_7839 var1) {
      if (var1.field_39747 != null) {
         throw new IllegalArgumentException("priorResponse.body != null");
      }
   }

   public class_7775 method_35276(long var1) {
      this.field_39418 = var1;
      return this;
   }

   public class_7775 method_35278(long var1) {
      this.field_39419 = var1;
      return this;
   }

   public class_7839 method_35268() {
      if (this.field_39412 != null) {
         if (this.field_39411 != null) {
            if (this.field_39414 >= 0) {
               if (this.field_39408 != null) {
                  return new class_7839(this);
               } else {
                  throw new IllegalStateException("message == null");
               }
            } else {
               throw new IllegalStateException("code < 0: " + this.field_39414);
            }
         } else {
            throw new IllegalStateException("protocol == null");
         }
      } else {
         throw new IllegalStateException("request == null");
      }
   }
}
