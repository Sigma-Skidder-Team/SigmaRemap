package remapped;

import java.io.IOException;

public class class_6187 implements Packet<class_1243> {
   private static String[] field_31610;
   private int field_31612;
   private int field_31611;

   public class_6187() {
   }

   public class_6187(int var1, int var2) {
      this.field_31612 = var1;
      this.field_31611 = var2;
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_31612 = var1.method_37778();
      this.field_31611 = var1.method_37778();
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37743(this.field_31612);
      var1.method_37743(this.field_31611);
   }

   public void method_28316(class_1243 var1) {
      var1.method_5562(this);
   }

   public int method_28314() {
      return this.field_31612;
   }

   public int method_28315() {
      return this.field_31611;
   }
}
