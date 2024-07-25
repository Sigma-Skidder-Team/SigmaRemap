package remapped;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class class_5568 extends class_5287 {
   private static String[] field_28294;
   private short[] field_28295;

   public class_5568(String var1) {
      this(var1, new short[0]);
   }

   public class_5568(String var1, short[] var2) {
      super(var1);
      this.field_28295 = var2;
   }

   public short[] method_25285() {
      return (short[])this.field_28295.clone();
   }

   public void method_25283(short[] var1) {
      if (var1 != null) {
         this.field_28295 = (short[])var1.clone();
      }
   }

   public short method_25286(int var1) {
      return this.field_28295[var1];
   }

   public void method_25282(int var1, short var2) {
      this.field_28295[var1] = var2;
   }

   public int method_25284() {
      return this.field_28295.length;
   }

   @Override
   public void method_24130(DataInput var1) throws IOException {
      this.field_28295 = new short[var1.readInt()];

      for (int var4 = 0; var4 < this.field_28295.length; var4++) {
         this.field_28295[var4] = var1.readShort();
      }
   }

   @Override
   public void method_24127(DataOutput var1) throws IOException {
      var1.writeInt(this.field_28295.length);

      for (int var4 = 0; var4 < this.field_28295.length; var4++) {
         var1.writeShort(this.field_28295[var4]);
      }
   }

   public class_5568 clone() {
      return new class_5568(this.method_24126(), this.method_25285());
   }
}
