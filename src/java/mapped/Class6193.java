package mapped;

import java.math.BigInteger;

public class Class6193 implements Class6180 {
   public final Class4499 field27638;

   public Class6193(Class4499 var1) {
      this.field27638 = var1;
   }

   @Override
   public Class7255 method19088(Object var1) {
      Class9757 var4;
      String var5;
      if (!(var1 instanceof Byte) && !(var1 instanceof Short) && !(var1 instanceof Integer) && !(var1 instanceof Long) && !(var1 instanceof BigInteger)) {
         Number var6 = (Number)var1;
         var4 = Class9757.field45638;
         if (!var6.equals(Double.NaN)) {
            if (!var6.equals(Double.POSITIVE_INFINITY)) {
               if (!var6.equals(Double.NEGATIVE_INFINITY)) {
                  var5 = var6.toString();
               } else {
                  var5 = "-.inf";
               }
            } else {
               var5 = ".inf";
            }
         } else {
            var5 = ".NaN";
         }
      } else {
         var4 = Class9757.field45637;
         var5 = var1.toString();
      }

      return this.field27638.method14193(this.field27638.method14203(var1.getClass(), var4), var5);
   }
}
