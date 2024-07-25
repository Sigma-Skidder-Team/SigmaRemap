package remapped;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class class_8735 extends class_5287 {
   private static String[] field_44751;
   private long field_44750;

   public class_8735(String var1) {
      this(var1, 0L);
   }

   public class_8735(String var1, long var2) {
      super(var1);
      this.field_44750 = var2;
   }

   public Long method_40102() {
      return this.field_44750;
   }

   public void method_40103(long var1) {
      this.field_44750 = var1;
   }

   @Override
   public void method_24130(DataInput var1) throws IOException {
      this.field_44750 = var1.readLong();
   }

   @Override
   public void method_24127(DataOutput var1) throws IOException {
      var1.writeLong(this.field_44750);
   }

   public class_8735 clone() {
      return new class_8735(this.method_24126(), this.method_40102());
   }
}
