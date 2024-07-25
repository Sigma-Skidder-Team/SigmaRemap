package remapped;

import java.io.IOException;

public class class_9054 implements Packet<class_1243> {
   private static String[] field_46361;
   private class_1331 field_46364;
   private int field_46363;
   private boolean field_46362;

   public class_9054() {
   }

   public class_9054(class_1331 var1, int var2, boolean var3) {
      this.field_46364 = var1;
      this.field_46363 = var2;
      this.field_46362 = var3;
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_46364 = var1.method_37748();
      this.field_46363 = var1.method_37778();
      this.field_46362 = var1.readBoolean();
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37770(this.field_46364);
      var1.method_37743(this.field_46363);
      var1.writeBoolean(this.field_46362);
   }

   public void method_41595(class_1243 var1) {
      var1.method_5556(this);
   }

   public class_1331 method_41593() {
      return this.field_46364;
   }

   public int method_41592() {
      return this.field_46363;
   }

   public boolean method_41594() {
      return this.field_46362;
   }
}
