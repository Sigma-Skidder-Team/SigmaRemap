package mapped;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class Class70 extends Class61 {
   private static String[] field151;
   private float field152;

   public Class70(String var1) {
      this(var1, 0.0F);
   }

   public Class70(String var1, float var2) {
      super(var1);
      this.field152 = var2;
   }

   public Float method205() {
      return this.field152;
   }

   public void method230(float var1) {
      this.field152 = var1;
   }

   @Override
   public void method203(DataInput var1) throws IOException {
      this.field152 = var1.readFloat();
   }

   @Override
   public void method204(DataOutput var1) throws IOException {
      var1.writeFloat(this.field152);
   }

   public Class70 clone() {
      return new Class70(this.method206(), this.method205());
   }
}
