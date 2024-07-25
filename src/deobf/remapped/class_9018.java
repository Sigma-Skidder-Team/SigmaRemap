package remapped;

import java.io.IOException;

public class class_9018 extends class_6926 {
   private int[] field_46130;
   private long[] field_46132;

   public class_9018() {
      super("FEC Reservoir Box");
   }

   @Override
   public void method_18109(class_6041 var1) throws IOException {
      super.method_18109(var1);
      int var4 = (int)var1.method_27524(2);
      this.field_46130 = new int[var4];
      this.field_46132 = new long[var4];

      for (int var5 = 0; var5 < var4; var5++) {
         this.field_46130[var5] = (int)var1.method_27524(2);
         this.field_46132[var5] = var1.method_27524(4);
      }
   }

   public int[] method_41380() {
      return this.field_46130;
   }

   public long[] method_41381() {
      return this.field_46132;
   }
}
