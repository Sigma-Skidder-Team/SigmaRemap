package remapped;

import java.io.IOException;

public class class_2499 extends class_6926 {
   private long[] field_12427;
   private long[] field_12428;
   private long[] field_12426;

   public class_2499() {
      super("Sample To Chunk Box");
   }

   @Override
   public void method_18109(class_6041 var1) throws IOException {
      super.method_18109(var1);
      int var4 = (int)var1.method_27524(4);
      this.field_12427 = new long[var4];
      this.field_12428 = new long[var4];
      this.field_12426 = new long[var4];

      for (int var5 = 0; var5 < var4; var5++) {
         this.field_12427[var5] = var1.method_27524(4);
         this.field_12428[var5] = var1.method_27524(4);
         this.field_12426[var5] = var1.method_27524(4);
      }
   }

   public long[] method_11412() {
      return this.field_12427;
   }

   public long[] method_11413() {
      return this.field_12428;
   }

   public long[] method_11414() {
      return this.field_12426;
   }
}
