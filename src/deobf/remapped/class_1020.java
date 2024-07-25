package remapped;

import java.io.IOException;

public class class_1020 implements Packet<class_1243> {
   private static String[] field_5335;
   private BlockPos field_5334;
   private String[] field_5336;

   public class_1020() {
   }

   public class_1020(BlockPos var1, String var2, String var3, String var4, String var5) {
      this.field_5334 = var1;
      this.field_5336 = new String[]{var2, var3, var4, var5};
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_5334 = var1.method_37748();
      this.field_5336 = new String[4];

      for (int var4 = 0; var4 < 4; var4++) {
         this.field_5336[var4] = var1.method_37784(384);
      }
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37770(this.field_5334);

      for (int var4 = 0; var4 < 4; var4++) {
         var1.method_37760(this.field_5336[var4]);
      }
   }

   public void method_4511(class_1243 var1) {
      var1.method_5540(this);
   }

   public BlockPos method_4510() {
      return this.field_5334;
   }

   public String[] method_4512() {
      return this.field_5336;
   }
}
