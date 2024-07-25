package remapped;

import java.io.IOException;

public class class_5029 implements Packet<class_392> {
   private static String[] field_26008;
   private class_1331 field_26011;
   private int field_26009;
   private class_5734 field_26010;

   public class_5029() {
   }

   public class_5029(class_1331 var1, int var2, class_5734 var3) {
      this.field_26011 = var1;
      this.field_26009 = var2;
      this.field_26010 = var3;
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_26011 = var1.method_37748();
      this.field_26009 = var1.readUnsignedByte();
      this.field_26010 = var1.method_37775();
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37770(this.field_26011);
      var1.writeByte((byte)this.field_26009);
      var1.method_37749(this.field_26010);
   }

   public void method_23194(class_392 var1) {
      var1.method_1903(this);
   }

   public class_1331 method_23192() {
      return this.field_26011;
   }

   public int method_23195() {
      return this.field_26009;
   }

   public class_5734 method_23191() {
      return this.field_26010;
   }
}
