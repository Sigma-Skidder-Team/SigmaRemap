package remapped;

import java.io.IOException;

public class class_8175 implements Packet<class_392> {
   private static String[] field_41854;
   private float field_41856;
   private int field_41853;
   private int field_41855;

   public class_8175() {
   }

   public class_8175(float var1, int var2, int var3) {
      this.field_41856 = var1;
      this.field_41853 = var2;
      this.field_41855 = var3;
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_41856 = var1.readFloat();
      this.field_41855 = var1.method_37778();
      this.field_41853 = var1.method_37778();
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.writeFloat(this.field_41856);
      var1.method_37743(this.field_41855);
      var1.method_37743(this.field_41853);
   }

   public void method_37481(class_392 var1) {
      var1.method_1955(this);
   }

   public float method_37479() {
      return this.field_41856;
   }

   public int method_37480() {
      return this.field_41853;
   }

   public int method_37478() {
      return this.field_41855;
   }
}
