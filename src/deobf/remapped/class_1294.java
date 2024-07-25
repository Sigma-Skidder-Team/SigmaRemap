package remapped;

import java.io.IOException;

public class class_1294 extends class_6926 {
   private long[] field_7116;

   public class_1294() {
      super("Sync Sample Box");
   }

   @Override
   public void method_18109(class_6041 var1) throws IOException {
      super.method_18109(var1);
      int var4 = (int)var1.method_27524(4);
      this.field_7116 = new long[var4];

      for (int var5 = 0; var5 < var4; var5++) {
         this.field_7116[var5] = var1.method_27524(4);
      }
   }

   public long[] method_5869() {
      return this.field_7116;
   }
}
