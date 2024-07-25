package remapped;

import java.io.IOException;

public class class_3938 extends class_6926 {
   private long[][] field_19130;

   public class_3938() {
      super("Shadow Sync Sample Box");
   }

   @Override
   public void method_18109(class_6041 var1) throws IOException {
      super.method_18109(var1);
      int var4 = (int)var1.method_27524(4);
      this.field_19130 = new long[var4][2];

      for (int var5 = 0; var5 < var4; var5++) {
         this.field_19130[var5][0] = var1.method_27524(4);
         this.field_19130[var5][1] = var1.method_27524(4);
      }
   }

   public long[][] method_18205() {
      return this.field_19130;
   }
}
