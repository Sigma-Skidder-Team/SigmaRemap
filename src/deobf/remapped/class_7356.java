package remapped;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class class_7356 extends class_5287 {
   private static String[] field_37602;
   private int[] field_37601;

   public class_7356(String var1) {
      this(var1, new int[0]);
   }

   public class_7356(String var1, int[] var2) {
      super(var1);
      this.field_37601 = var2;
   }

   public int[] method_33512() {
      return (int[])this.field_37601.clone();
   }

   public void method_33515(int[] var1) {
      if (var1 != null) {
         this.field_37601 = (int[])var1.clone();
      }
   }

   public int method_33513(int var1) {
      return this.field_37601[var1];
   }

   public void method_33514(int var1, int var2) {
      this.field_37601[var1] = var2;
   }

   public int method_33511() {
      return this.field_37601.length;
   }

   @Override
   public void method_24130(DataInput var1) throws IOException {
      this.field_37601 = new int[var1.readInt()];

      for (int var4 = 0; var4 < this.field_37601.length; var4++) {
         this.field_37601[var4] = var1.readInt();
      }
   }

   @Override
   public void method_24127(DataOutput var1) throws IOException {
      var1.writeInt(this.field_37601.length);

      for (int var4 = 0; var4 < this.field_37601.length; var4++) {
         var1.writeInt(this.field_37601[var4]);
      }
   }

   public class_7356 clone() {
      return new class_7356(this.method_24126(), this.method_33512());
   }
}
