package remapped;

import java.io.IOException;

public class class_7825 implements Packet<class_1243> {
   private static String[] field_39685;
   private int field_39684;
   private class_1331 field_39686;

   public class_7825() {
   }

   public class_7825(int var1, class_1331 var2) {
      this.field_39684 = var1;
      this.field_39686 = var2;
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_39684 = var1.method_37778();
      this.field_39686 = var1.method_37748();
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37743(this.field_39684);
      var1.method_37770(this.field_39686);
   }

   public void method_35432(class_1243 var1) {
      var1.method_5543(this);
   }

   public int method_35431() {
      return this.field_39684;
   }

   public class_1331 method_35429() {
      return this.field_39686;
   }
}
