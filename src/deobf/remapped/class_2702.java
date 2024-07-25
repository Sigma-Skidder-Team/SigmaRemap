package remapped;

import java.io.IOException;

public class class_2702 extends class_6926 {
   private long field_13239;
   private long field_13238;
   private long field_13237;
   private long field_13236;

   public class_2702() {
      super("Hint Media Header Box");
   }

   @Override
   public void method_18109(class_6041 var1) throws IOException {
      super.method_18109(var1);
      this.field_13239 = var1.method_27524(2);
      this.field_13238 = var1.method_27524(2);
      this.field_13237 = var1.method_27524(4);
      this.field_13236 = var1.method_27524(4);
      var1.method_27527(4L);
   }

   public long method_12189() {
      return this.field_13239;
   }

   public long method_12190() {
      return this.field_13238;
   }

   public long method_12191() {
      return this.field_13237;
   }

   public long method_12188() {
      return this.field_13236;
   }
}
