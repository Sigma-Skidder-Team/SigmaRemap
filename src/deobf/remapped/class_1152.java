package remapped;

import com.google.common.base.Preconditions;

public class class_1152 implements class_9523 {
   private final byte field_6561;
   private final byte field_6558;
   private final byte field_6560;
   private int field_6557;

   public class_1152(byte var1, byte var2, byte var3, int var4) {
      this.field_6561 = var1;
      this.field_6558 = var2;
      this.field_6560 = var3;
      this.field_6557 = var4;
   }

   public class_1152(int var1, int var2, int var3, int var4) {
      this((byte)var1, (byte)var2, (byte)var3, var4);
   }

   @Override
   public byte method_43936() {
      return this.field_6561;
   }

   @Override
   public byte method_43934() {
      return this.field_6558;
   }

   @Override
   public byte method_43930() {
      return this.field_6560;
   }

   @Override
   public short method_43932(int var1) {
      Preconditions.checkArgument(var1 >= 0 && var1 < 16, "Invalid chunkSectionY: " + var1);
      return (short)((var1 << 4) + this.field_6558);
   }

   @Override
   public int method_43935() {
      return this.field_6557;
   }

   @Override
   public void method_43933(int var1) {
      this.field_6557 = var1;
   }
}
