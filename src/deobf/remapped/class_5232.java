package remapped;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class class_5232 extends class_5287 {
   private static String[] field_26834;
   private int field_26833;

   public class_5232(String var1) {
      this(var1, 0);
   }

   public class_5232(String var1, int var2) {
      super(var1);
      this.field_26833 = var2;
   }

   public Integer method_23973() {
      return this.field_26833;
   }

   public void method_23972(int var1) {
      this.field_26833 = var1;
   }

   @Override
   public void method_24130(DataInput var1) throws IOException {
      this.field_26833 = var1.readInt();
   }

   @Override
   public void method_24127(DataOutput var1) throws IOException {
      var1.writeInt(this.field_26833);
   }

   public class_5232 clone() {
      return new class_5232(this.method_24126(), this.method_23973());
   }
}
