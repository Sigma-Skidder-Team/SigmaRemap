package mapped;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class Class64 extends Class61 {
   private static String[] field139;
   private float[] field140;

   public Class64(String var1) {
      this(var1, new float[0]);
   }

   public Class64(String var1, float[] var2) {
      super(var1);
      this.field140 = var2;
   }

   public float[] method205() {
      return (float[])this.field140.clone();
   }

   public void method215(float[] var1) {
      if (var1 != null) {
         this.field140 = (float[])var1.clone();
      }
   }

   public float method216(int var1) {
      return this.field140[var1];
   }

   public void method217(int var1, float var2) {
      this.field140[var1] = var2;
   }

   public int method218() {
      return this.field140.length;
   }

   @Override
   public void method203(DataInput var1) throws IOException {
      this.field140 = new float[var1.readInt()];

      for (int var4 = 0; var4 < this.field140.length; var4++) {
         this.field140[var4] = var1.readFloat();
      }
   }

   @Override
   public void method204(DataOutput var1) throws IOException {
      var1.writeInt(this.field140.length);

      for (int var4 = 0; var4 < this.field140.length; var4++) {
         var1.writeFloat(this.field140[var4]);
      }
   }

   public Class64 clone() {
      return new Class64(this.method206(), this.method205());
   }
}
