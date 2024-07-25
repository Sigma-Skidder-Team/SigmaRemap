package remapped;

import java.io.IOException;

public class class_1165 extends class_6926 {
   private long field_6596;
   private long field_6594;
   private int field_6597;

   public class_1165() {
      super("Meta Box Relation Box");
   }

   @Override
   public void method_18109(class_6041 var1) throws IOException {
      super.method_18109(var1);
      this.field_6596 = var1.method_27524(4);
      this.field_6594 = var1.method_27524(4);
      this.field_6597 = var1.method_27531();
   }

   public long method_5178() {
      return this.field_6596;
   }

   public long method_5180() {
      return this.field_6594;
   }

   public int method_5179() {
      return this.field_6597;
   }
}
