package remapped;

import java.io.IOException;

public class class_8334 implements class_6310<class_8171> {
   private static String[] field_42661;
   private long field_42662;

   public class_8334() {
   }

   public class_8334(long var1) {
      this.field_42662 = var1;
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_42662 = var1.readLong();
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.writeLong(this.field_42662);
   }

   public void method_38382(class_8171 var1) {
      var1.method_37473(this);
   }
}
