package remapped;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class class_9502 extends class_5287 {
   private static String[] field_48392;
   private float[] field_48391;

   public class_9502(String var1) {
      this(var1, new float[0]);
   }

   public class_9502(String var1, float[] var2) {
      super(var1);
      this.field_48391 = var2;
   }

   public float[] method_43866() {
      return (float[])this.field_48391.clone();
   }

   public void method_43865(float[] var1) {
      if (var1 != null) {
         this.field_48391 = (float[])var1.clone();
      }
   }

   public float method_43867(int var1) {
      return this.field_48391[var1];
   }

   public void method_43864(int var1, float var2) {
      this.field_48391[var1] = var2;
   }

   public int method_43868() {
      return this.field_48391.length;
   }

   @Override
   public void method_24130(DataInput var1) throws IOException {
      this.field_48391 = new float[var1.readInt()];

      for (int var4 = 0; var4 < this.field_48391.length; var4++) {
         this.field_48391[var4] = var1.readFloat();
      }
   }

   @Override
   public void method_24127(DataOutput var1) throws IOException {
      var1.writeInt(this.field_48391.length);

      for (int var4 = 0; var4 < this.field_48391.length; var4++) {
         var1.writeFloat(this.field_48391[var4]);
      }
   }

   public class_9502 clone() {
      return new class_9502(this.method_24126(), this.method_43866());
   }
}
