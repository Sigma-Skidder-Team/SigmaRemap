package remapped;

import java.io.IOException;

public abstract class class_2159 extends class_3912 {
   private long field_10773;
   private int field_10774;

   public class_2159(String var1) {
      super(var1);
   }

   public void method_10051(class_6041 var1) throws IOException {
      this.field_10773 = var1.method_27524(4);
      this.field_10774 = var1.method_27531();
   }

   public long method_10052() {
      return this.field_10773;
   }

   public int method_10050() {
      return this.field_10774;
   }
}
