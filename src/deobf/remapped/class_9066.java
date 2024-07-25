package remapped;

import java.io.IOException;

public class class_9066 implements Packet<class_1243> {
   private static String[] field_46386;
   private class_4269 field_46388;
   private boolean field_46389;
   private boolean field_46387;

   public class_9066() {
   }

   public class_9066(class_4269 var1, boolean var2, boolean var3) {
      this.field_46388 = var1;
      this.field_46389 = var2;
      this.field_46387 = var3;
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_46388 = var1.<class_4269>method_37787(class_4269.class);
      this.field_46389 = var1.readBoolean();
      this.field_46387 = var1.readBoolean();
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37750(this.field_46388);
      var1.writeBoolean(this.field_46389);
      var1.writeBoolean(this.field_46387);
   }

   public void method_41620(class_1243 var1) {
      var1.method_5564(this);
   }

   public class_4269 method_41619() {
      return this.field_46388;
   }

   public boolean method_41618() {
      return this.field_46389;
   }

   public boolean method_41617() {
      return this.field_46387;
   }
}
