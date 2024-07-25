package remapped;

import net.sourceforge.jaad.aac.AACException;

public class class_5480 extends class_7958 {
   private static String[] field_27918;
   private byte[] field_27917;

   public void method_24900(class_7390 var1) throws AACException {
      boolean var4 = var1.method_33660();
      int var5 = var1.method_33662(8);
      if (var5 == 255) {
         var5 += var1.method_33662(8);
      }

      if (var4) {
         var1.method_33653();
      }

      this.field_27917 = new byte[var5];

      for (int var6 = 0; var6 < var5; var6++) {
         this.field_27917[var6] = (byte)var1.method_33662(8);
      }
   }
}
