package remapped;

import java.io.IOException;

public class class_9666 extends class_6926 {
   private long[][] field_49236;
   private long[][] field_49235;

   public class_9666() {
      super("FD Session Group Box");
   }

   @Override
   public void method_18109(class_6041 var1) throws IOException {
      super.method_18109(var1);
      int var4 = (int)var1.method_27524(2);
      this.field_49236 = new long[var4][];
      this.field_49235 = new long[var4][];

      for (int var5 = 0; var5 < var4; var5++) {
         int var6 = var1.method_27531();
         this.field_49236[var5] = new long[var6];

         for (int var7 = 0; var7 < var6; var7++) {
            this.field_49236[var5][var7] = var1.method_27524(4);
         }

         int var8 = (int)var1.method_27524(2);
         this.field_49235[var5] = new long[var8];

         for (int var9 = 0; var9 < var8; var9++) {
            this.field_49235[var5][var9] = var1.method_27524(4);
         }
      }
   }

   public long[][] method_44703() {
      return this.field_49236;
   }

   public long[][] method_44704() {
      return this.field_49235;
   }
}
