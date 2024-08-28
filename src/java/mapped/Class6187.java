package mapped;

import java.io.UnsupportedEncodingException;

public class Class6187 implements Class6180 {
   public final Class4499 field27630;

   public Class6187(Class4499 var1) {
      this.field27630 = var1;
   }

   @Override
   public Class7255 method19088(Object var1) {
      Class9757 var4 = Class9757.field45642;
      Class1857 var5 = null;
      String var6 = var1.toString();
      if (!Class9583.method37197(var6)) {
         var4 = Class9757.field45636;

         char[] var9;
         try {
            byte[] var7 = var6.getBytes("UTF-8");
            String var8 = new String(var7, "UTF-8");
            if (!var8.equals(var6)) {
               throw new Class2478("invalid string value has occurred");
            }

            var9 = Class8566.method30616(var7);
         } catch (UnsupportedEncodingException var10) {
            throw new Class2478(var10);
         }

         var6 = String.valueOf(var9);
         var5 = Class1857.field9896;
      }

      if (this.field27630.field21714 == Class1857.field9898 && Class4499.field21722.matcher(var6).find()) {
         var5 = Class1857.field9896;
      }

      return this.field27630.method14192(var4, var6, var5);
   }
}
