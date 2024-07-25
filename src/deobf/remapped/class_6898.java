package remapped;

import java.io.IOException;

public class class_6898 extends class_6926 {
   private long[] field_35469;

   public class_6898() {
      super("Chunk Offset Box");
   }

   @Override
   public void method_18109(class_6041 var1) throws IOException {
      super.method_18109(var1);
      int var4 = this.field_19002 != 1668232756L ? 4 : 8;
      int var5 = (int)var1.method_27524(4);
      this.field_35469 = new long[var5];

      for (int var6 = 0; var6 < var5; var6++) {
         this.field_35469[var6] = var1.method_27524(var4);
      }
   }

   public long[] method_31595() {
      return this.field_35469;
   }
}
