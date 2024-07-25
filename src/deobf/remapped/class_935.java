package remapped;

public class class_935 extends class_1201 {
   private static String[] field_4780;

   public class_935() {
      super(128);
   }

   public class_935(class_1201 var1, int var2) {
      super(128);
      System.arraycopy(var1.method_5317(), var2 * 128, this.field_6708, 0, 128);
   }

   @Override
   public int method_5322(int var1, int var2, int var3) {
      return var3 << 4 | var1;
   }

   @Override
   public byte[] method_5317() {
      byte[] var3 = new byte[2048];

      for (int var4 = 0; var4 < 16; var4++) {
         System.arraycopy(this.field_6708, 0, var3, var4 * 128, 128);
      }

      return var3;
   }
}
