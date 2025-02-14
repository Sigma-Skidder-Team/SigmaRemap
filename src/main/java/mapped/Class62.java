package mapped;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class Class62 extends Class61 {
   private static String[] field135;
   private int[] field136;

   public Class62(String var1) {
      this(var1, new int[0]);
   }

   public Class62(String var1, int[] var2) {
      super(var1);
      this.field136 = var2;
   }

   public int[] method205() {
      return (int[])this.field136.clone();
   }

   public void method207(int[] var1) {
      if (var1 != null) {
         this.field136 = (int[])var1.clone();
      }
   }

   public int method208(int var1) {
      return this.field136[var1];
   }

   public void method209(int var1, int var2) {
      this.field136[var1] = var2;
   }

   public int method210() {
      return this.field136.length;
   }

   @Override
   public void method203(DataInput var1) throws IOException {
      this.field136 = new int[var1.readInt()];

      for (int var4 = 0; var4 < this.field136.length; var4++) {
         this.field136[var4] = var1.readInt();
      }
   }

   @Override
   public void method204(DataOutput var1) throws IOException {
      var1.writeInt(this.field136.length);

      for (int var4 = 0; var4 < this.field136.length; var4++) {
         var1.writeInt(this.field136[var4]);
      }
   }

   public Class62 clone() {
      return new Class62(this.method206(), this.method205());
   }
}
