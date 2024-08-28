package mapped;

public class Class5643 {
   private int field24956 = 64;
   private int field24957;
   private Class3257 field24958;
   private Class7401 field24959;
   private Class1978 field24960 = Class1978.field12885;
   private Class9427 field24961;
   private boolean field24962;

   public Class5643 method17774(Class9427 var1) {
      this.field24961 = var1;
      return this;
   }

   public Class5643 method17775(int var1) {
      if (this.field24957 <= 0) {
         this.field24956 = var1;
         return this;
      } else {
         throw new RuntimeException("Unable to have damage AND stack.");
      }
   }

   public Class5643 method17776(int var1) {
      return this.field24957 != 0 ? this : this.method17777(var1);
   }

   public Class5643 method17777(int var1) {
      this.field24957 = var1;
      this.field24956 = 1;
      return this;
   }

   public Class5643 method17778(Class3257 var1) {
      this.field24958 = var1;
      return this;
   }

   public Class5643 method17779(Class7401 var1) {
      this.field24959 = var1;
      return this;
   }

   public Class5643 method17780(Class1978 var1) {
      this.field24960 = var1;
      return this;
   }

   public Class5643 method17781() {
      this.field24962 = true;
      return this;
   }

   // $VF: synthetic method
   public static Class7401 method17782(Class5643 var0) {
      return var0.field24959;
   }

   // $VF: synthetic method
   public static Class1978 method17783(Class5643 var0) {
      return var0.field24960;
   }

   // $VF: synthetic method
   public static Class3257 method17784(Class5643 var0) {
      return var0.field24958;
   }

   // $VF: synthetic method
   public static int method17785(Class5643 var0) {
      return var0.field24957;
   }

   // $VF: synthetic method
   public static int method17786(Class5643 var0) {
      return var0.field24956;
   }

   // $VF: synthetic method
   public static Class9427 method17787(Class5643 var0) {
      return var0.field24961;
   }

   // $VF: synthetic method
   public static boolean method17788(Class5643 var0) {
      return var0.field24962;
   }
}
