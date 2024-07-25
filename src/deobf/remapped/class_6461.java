package remapped;

import java.io.IOException;

public class class_6461 extends class_6926 {
   private long[] field_32938;
   private long[] field_32939;
   private double[] field_32936;

   public class_6461() {
      super("Edit List Box");
   }

   @Override
   public void method_18109(class_6041 var1) throws IOException {
      super.method_18109(var1);
      int var4 = (int)var1.method_27524(4);
      int var5 = this.field_35590 != 1 ? 4 : 8;
      this.field_32938 = new long[var4];
      this.field_32939 = new long[var4];
      this.field_32936 = new double[var4];

      for (int var6 = 0; var6 < var4; var6++) {
         this.field_32938[var6] = var1.method_27524(var5);
         this.field_32939[var6] = var1.method_27524(var5);
         this.field_32936[var6] = var1.method_27530(16, 16);
      }
   }

   public long[] method_29439() {
      return this.field_32938;
   }

   public long[] method_29438() {
      return this.field_32939;
   }

   public double[] method_29437() {
      return this.field_32936;
   }
}
