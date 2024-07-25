package remapped;

import java.io.IOException;

public class class_396 extends class_3912 {
   private long field_1661;
   private long field_1662;
   private long field_1660;

   public class_396() {
      super("Bitrate Box");
   }

   @Override
   public void method_18109(class_6041 var1) throws IOException {
      this.field_1661 = var1.method_27524(4);
      this.field_1662 = var1.method_27524(4);
      this.field_1660 = var1.method_27524(4);
   }

   public long method_1984() {
      return this.field_1661;
   }

   public long method_1986() {
      return this.field_1662;
   }

   public long method_1985() {
      return this.field_1660;
   }
}
