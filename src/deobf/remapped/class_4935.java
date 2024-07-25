package remapped;

import java.io.IOException;
import javax.annotation.Nullable;

public class class_4935 implements Packet<class_392> {
   private static String[] field_25580;
   private Identifier field_25582;
   private class_562 field_25581;

   public class_4935() {
   }

   public class_4935(Identifier var1, class_562 var2) {
      this.field_25582 = var1;
      this.field_25581 = var2;
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      byte var4 = var1.readByte();
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      if (this.field_25581 == null) {
         if (this.field_25582 == null) {
            var1.writeByte(0);
         } else {
            var1.writeByte(2);
            var1.method_37780(this.field_25582);
         }
      } else if (this.field_25582 == null) {
         var1.writeByte(1);
         var1.method_37750(this.field_25581);
      } else {
         var1.writeByte(3);
         var1.method_37750(this.field_25581);
         var1.method_37780(this.field_25582);
      }
   }

   @Nullable
   public Identifier method_22631() {
      return this.field_25582;
   }

   @Nullable
   public class_562 method_22632() {
      return this.field_25581;
   }

   public void method_22633(class_392 var1) {
      var1.method_1896(this);
   }
}
