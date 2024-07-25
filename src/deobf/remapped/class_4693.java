package remapped;

import java.io.IOException;

public class class_4693 extends class_6926 {
   private int[] field_22839;
   private int[] field_22838;

   public class_4693() {
      super("Padding Bit Box");
   }

   @Override
   public void method_18109(class_6041 var1) throws IOException {
      super.method_18109(var1);
      int var4 = (int)(var1.method_27524(4) + 1L) / 2;
      this.field_22839 = new int[var4];
      this.field_22838 = new int[var4];

      for (int var5 = 0; var5 < var4; var5++) {
         byte var6 = (byte)var1.method_27531();
         this.field_22839[var5] = var6 >> 4 & 7;
         this.field_22838[var5] = var6 & 7;
      }
   }

   public int[] method_21665() {
      return this.field_22839;
   }

   public int[] method_21666() {
      return this.field_22838;
   }
}
