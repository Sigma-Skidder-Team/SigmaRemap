package remapped;

import java.io.IOException;

public class class_8135 implements class_6310<class_963> {
   private static String[] field_41669;
   private int field_41667;
   private String field_41671;
   private int field_41670;
   private class_5776 field_41668;

   public class_8135() {
   }

   public class_8135(String var1, int var2, class_5776 var3) {
      this.field_41667 = class_7665.method_34674().getProtocolVersion();
      this.field_41671 = var1;
      this.field_41670 = var2;
      this.field_41668 = var3;
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_41667 = var1.method_37778();
      this.field_41671 = var1.method_37784(255);
      this.field_41670 = var1.readUnsignedShort();
      this.field_41668 = class_5776.method_26115(var1.method_37778());
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37743(this.field_41667);
      var1.method_37760(this.field_41671);
      var1.writeShort(this.field_41670);
      var1.method_37743(this.field_41668.method_26117());
   }

   public void method_37007(class_963 var1) {
      var1.method_4227(this);
   }

   public class_5776 method_37006() {
      return this.field_41668;
   }

   public int method_37005() {
      return this.field_41667;
   }
}
