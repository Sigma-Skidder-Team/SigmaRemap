package remapped;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.lwjgl.BufferUtils;

public class class_5688 implements class_1155 {
   private int field_28804;
   private int field_28805;
   private int field_28806;
   private int field_28801;
   private byte[] field_28803;

   public class_5688(int var1, int var2) {
      this.field_28804 = var1;
      this.field_28805 = var2;
      this.field_28806 = this.method_25729(var1);
      this.field_28801 = this.method_25729(var2);
      this.field_28803 = new byte[this.field_28806 * this.field_28801 * 4];
   }

   public byte[] method_25724() {
      return this.field_28803;
   }

   @Override
   public int method_5154() {
      return 32;
   }

   @Override
   public int method_5153() {
      return this.field_28805;
   }

   @Override
   public int method_5151() {
      return this.field_28801;
   }

   @Override
   public int method_5150() {
      return this.field_28806;
   }

   @Override
   public int method_5155() {
      return this.field_28804;
   }

   @Override
   public ByteBuffer method_5152() {
      ByteBuffer var3 = BufferUtils.createByteBuffer(this.field_28803.length);
      var3.put(this.field_28803);
      ((Buffer)var3).flip();
      return var3;
   }

   public void method_25727(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 >= 0 && var1 < this.field_28804 && var2 >= 0 && var2 < this.field_28805) {
         int var9 = (var1 + var2 * this.field_28806) * 4;
         if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
            this.field_28803[var9] = (byte)var3;
            this.field_28803[var9 + 1] = (byte)var4;
            this.field_28803[var9 + 2] = (byte)var5;
            this.field_28803[var9 + 3] = (byte)var6;
         } else {
            this.field_28803[var9] = (byte)var5;
            this.field_28803[var9 + 1] = (byte)var4;
            this.field_28803[var9 + 2] = (byte)var3;
            this.field_28803[var9 + 3] = (byte)var6;
         }
      } else {
         throw new RuntimeException("Specified location: " + var1 + "," + var2 + " outside of image");
      }
   }

   public class_8112 method_25725() {
      return new class_8112(this);
   }

   public class_8112 method_25726(int var1) {
      return new class_8112(this, var1);
   }

   private int method_25729(int var1) {
      byte var4 = 2;

      while (var4 < var1) {
         var4 *= 2;
      }

      return var4;
   }
}
