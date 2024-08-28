package mapped;

import java.util.List;

public class Class2764 extends Class2595 {
   private static String[] field17332;
   private final Class1018 field17333;
   private Class1018 field17334;
   private final double field17335;
   private int field17336;

   public Class2764(Class1018 var1, double var2) {
      this.field17333 = var1;
      this.field17335 = var2;
   }

   @Override
   public boolean method10803() {
      if (this.field17333.method4767() < 0) {
         List<? extends Class1018> var3 = this.field17333.field5024.method7182(this.field17333.getClass(), this.field17333.method3389().method19663(8.0, 4.0, 8.0));
         Class1018 var4 = null;
         double var5 = Double.MAX_VALUE;

         for (Class1018 var8 : var3) {
            if (var8.method4767() >= 0) {
               double var9 = this.field17333.method3277(var8);
               if (!(var9 > var5)) {
                  var5 = var9;
                  var4 = var8;
               }
            }
         }

         if (var4 == null) {
            return false;
         } else if (!(var5 < 9.0)) {
            this.field17334 = var4;
            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   @Override
   public boolean method10806() {
      if (this.field17333.method4767() < 0) {
         if (!this.field17334.method3066()) {
            return false;
         } else {
            double var3 = this.field17333.method3277(this.field17334);
            return !(var3 < 9.0) && !(var3 > 256.0);
         }
      } else {
         return false;
      }
   }

   @Override
   public void method10804() {
      this.field17336 = 0;
   }

   @Override
   public void method10807() {
      this.field17334 = null;
   }

   @Override
   public void method10805() {
      if (--this.field17336 <= 0) {
         this.field17336 = 10;
         this.field17333.method4230().method21655(this.field17334, this.field17335);
      }
   }
}
