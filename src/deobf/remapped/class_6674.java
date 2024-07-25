package remapped;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class class_6674 extends class_5287 {
   private static String[] field_34504;
   private long[] field_34505;

   public class_6674(String var1) {
      this(var1, new long[0]);
   }

   public class_6674(String var1, long[] var2) {
      super(var1);
      this.field_34505 = var2;
   }

   public long[] method_30625() {
      return (long[])this.field_34505.clone();
   }

   public void method_30623(long[] var1) {
      if (var1 != null) {
         this.field_34505 = (long[])var1.clone();
      }
   }

   public long method_30626(int var1) {
      return this.field_34505[var1];
   }

   public void method_30622(int var1, long var2) {
      this.field_34505[var1] = var2;
   }

   public int method_30624() {
      return this.field_34505.length;
   }

   @Override
   public void method_24130(DataInput var1) throws IOException {
      this.field_34505 = new long[var1.readInt()];

      for (int var4 = 0; var4 < this.field_34505.length; var4++) {
         this.field_34505[var4] = var1.readLong();
      }
   }

   @Override
   public void method_24127(DataOutput var1) throws IOException {
      var1.writeInt(this.field_34505.length);

      for (int var4 = 0; var4 < this.field_34505.length; var4++) {
         var1.writeLong(this.field_34505[var4]);
      }
   }

   public class_6674 clone() {
      return new class_6674(this.method_24126(), this.method_30625());
   }
}
