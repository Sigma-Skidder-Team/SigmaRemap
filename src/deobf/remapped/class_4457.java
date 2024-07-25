package remapped;

import java.awt.Color;
import java.io.IOException;

public class class_4457 extends class_6926 {
   private long field_21716;
   private Color field_21717;

   public class_4457() {
      super("Video Media Header Box");
   }

   @Override
   public void method_18109(class_6041 var1) throws IOException {
      super.method_18109(var1);
      this.field_21716 = var1.method_27524(2);
      int[] var4 = new int[3];

      for (int var5 = 0; var5 < 3; var5++) {
         var4[var5] = var1.method_27531() & 0xFF | var1.method_27531() << 8 & 0xFF;
      }

      this.field_21717 = new Color(var4[0], var4[1], var4[2]);
   }

   public long method_20667() {
      return this.field_21716;
   }

   public Color method_20666() {
      return this.field_21717;
   }
}
