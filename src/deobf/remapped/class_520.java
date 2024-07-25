package remapped;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class class_520 extends class_5287 {
   private static String[] field_3178;
   private float field_3177;

   public class_520(String var1) {
      this(var1, 0.0F);
   }

   public class_520(String var1, float var2) {
      super(var1);
      this.field_3177 = var2;
   }

   public Float method_2539() {
      return this.field_3177;
   }

   public void method_2538(float var1) {
      this.field_3177 = var1;
   }

   @Override
   public void method_24130(DataInput var1) throws IOException {
      this.field_3177 = var1.readFloat();
   }

   @Override
   public void method_24127(DataOutput var1) throws IOException {
      var1.writeFloat(this.field_3177);
   }

   public class_520 clone() {
      return new class_520(this.method_24126(), this.method_2539());
   }
}
