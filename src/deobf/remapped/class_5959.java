package remapped;

import java.io.IOException;

public class class_5959 extends class_6926 {
   private long[] field_30371;
   private long[] field_30372;

   public class_5959() {
      super("Time To Sample Box");
   }

   @Override
   public void method_18109(class_6041 var1) throws IOException {
      super.method_18109(var1);
      int var4 = (int)var1.method_27524(4);
      this.field_30371 = new long[var4];
      this.field_30372 = new long[var4];

      for (int var5 = 0; var5 < var4; var5++) {
         this.field_30371[var5] = var1.method_27524(4);
         this.field_30372[var5] = var1.method_27524(4);
      }
   }

   public long[] method_27229() {
      return this.field_30371;
   }

   public long[] method_27230() {
      return this.field_30372;
   }
}
