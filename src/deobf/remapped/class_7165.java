package remapped;

public final class class_7165 implements class_4388 {
   private static String[] field_36875;

   public class_7165(class_4388 var1) {
      this.field_36876 = var1;
   }

   @Override
   public void method_20453(Object var1) {
      if (!(var1 instanceof String)) {
         String var7 = String.valueOf(((byte[])var1).length);
         byte[] var8 = new byte[var7.length() + 2];
         var8[0] = 1;

         for (int var9 = 0; var9 < var7.length(); var9++) {
            var8[var9 + 1] = (byte)Character.getNumericValue(var7.charAt(var9));
         }

         var8[var8.length - 1] = -1;
         this.field_36876.method_20453(class_2055.method_9598(new byte[][]{var8, (byte[])var1}));
      } else {
         String var4 = String.valueOf(((String)var1).length());
         byte[] var5 = new byte[var4.length() + 2];
         var5[0] = 0;

         for (int var6 = 0; var6 < var4.length(); var6++) {
            var5[var6 + 1] = (byte)Character.getNumericValue(var4.charAt(var6));
         }

         var5[var5.length - 1] = -1;
         this.field_36876.method_20453(class_2055.method_9598(new byte[][]{var5, class_8887.method_40917((String)var1)}));
      }
   }
}
