package remapped;

import java.io.IOException;

public class class_282 extends class_2159 {
   private int field_1003;
   private int field_1000;
   private int field_998;
   private int field_1001;
   private int field_1004;
   private boolean field_999;

   public class_282() {
      super("AC-3 Specific Box");
   }

   @Override
   public void method_18109(class_6041 var1) throws IOException {
      long var4 = var1.method_27524(3);
      this.field_1003 = (int)(var4 >> 22 & 3L);
      this.field_1000 = (int)(var4 >> 17 & 31L);
      this.field_998 = (int)(var4 >> 14 & 7L);
      this.field_1001 = (int)(var4 >> 11 & 7L);
      this.field_999 = (var4 >> 10 & 1L) == 1L;
      this.field_1004 = (int)(var4 >> 5 & 31L);
   }

   public int method_1261() {
      return this.field_1003;
   }

   public int method_1263() {
      return this.field_1000;
   }

   public int method_1258() {
      return this.field_998;
   }

   public int method_1262() {
      return this.field_1001;
   }

   public boolean method_1260() {
      return this.field_999;
   }

   public int method_1259() {
      return this.field_1004;
   }
}
