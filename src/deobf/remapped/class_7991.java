package remapped;

import net.sourceforge.jaad.aac.AACException;

public final class class_7991 {
   private static String[] field_40953;
   private static final long field_40960 = 1094994246L;
   private long field_40954;
   private boolean field_40955;
   private byte[] field_40958 = new byte[9];
   private boolean field_40952;
   private boolean field_40957;
   private boolean field_40951;
   private int field_40949;
   private int field_40950;
   private int[] field_40959;
   private class_6828[] field_40956;

   public static boolean method_36265(class_7390 var0) throws AACException {
      return (long)var0.method_33666(32) == 1094994246L;
   }

   private class_7991() {
   }

   public static class_7991 method_36267(class_7390 var0) throws AACException {
      class_7991 var3 = new class_7991();
      var3.method_36269(var0);
      return var3;
   }

   private void method_36269(class_7390 var1) throws AACException {
      this.field_40954 = (long)var1.method_33662(32);
      this.field_40955 = var1.method_33660();
      if (this.field_40955) {
         for (int var4 = 0; var4 < 9; var4++) {
            this.field_40958[var4] = (byte)var1.method_33662(8);
         }
      }

      this.field_40952 = var1.method_33660();
      this.field_40957 = var1.method_33660();
      this.field_40951 = var1.method_33660();
      this.field_40949 = var1.method_33662(23);
      this.field_40950 = var1.method_33662(4) + 1;
      this.field_40956 = new class_6828[this.field_40950];
      this.field_40959 = new int[this.field_40950];

      for (int var5 = 0; var5 < this.field_40950; var5++) {
         if (!this.field_40951) {
            this.field_40959[var5] = var1.method_33662(20);
         } else {
            this.field_40959[var5] = -1;
         }

         this.field_40956[var5] = new class_6828();
         this.field_40956[var5].method_31315(var1);
      }
   }

   public class_6828 method_36266() {
      return this.field_40956[0];
   }
}
