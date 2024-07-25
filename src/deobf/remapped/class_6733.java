package remapped;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class class_6733 extends class_5287 {
   private static String[] field_34771;
   private short field_34770;

   public class_6733(String var1) {
      this(var1, (short)0);
   }

   public class_6733(String var1, short var2) {
      super(var1);
      this.field_34770 = var2;
   }

   public Short method_30876() {
      return this.field_34770;
   }

   public void method_30875(short var1) {
      this.field_34770 = var1;
   }

   @Override
   public void method_24130(DataInput var1) throws IOException {
      this.field_34770 = var1.readShort();
   }

   @Override
   public void method_24127(DataOutput var1) throws IOException {
      var1.writeShort(this.field_34770);
   }

   public class_6733 clone() {
      return new class_6733(this.method_24126(), this.method_30876());
   }
}
