package remapped;

import java.io.IOException;

public class class_9457 extends class_6926 {
   private boolean field_48254;
   private int field_48256;
   private int field_48255;

   public class_9457() {
      super("OMA DRM Access Unit Format Box");
   }

   @Override
   public void method_18109(class_6041 var1) throws IOException {
      super.method_18109(var1);
      this.field_48254 = (var1.method_27531() >> 7 & 1) == 1;
      this.field_48256 = var1.method_27531();
      this.field_48255 = var1.method_27531();
   }

   public boolean method_43727() {
      return this.field_48254;
   }

   public int method_43726() {
      return this.field_48256;
   }

   public int method_43728() {
      return this.field_48255;
   }
}
