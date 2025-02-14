package mapped;

import com.google.common.base.Preconditions;

public class Class6948 implements Class6949 {
   private final byte field30110;
   private final byte field30111;
   private final byte field30112;
   private int field30113;

   public Class6948(byte var1, byte var2, byte var3, int var4) {
      this.field30110 = var1;
      this.field30111 = var2;
      this.field30112 = var3;
      this.field30113 = var4;
   }

   public Class6948(int var1, int var2, int var3, int var4) {
      this((byte)var1, (byte)var2, (byte)var3, var4);
   }

   @Override
   public byte method21448() {
      return this.field30110;
   }

   @Override
   public byte method21449() {
      return this.field30111;
   }

   @Override
   public byte method21450() {
      return this.field30112;
   }

   @Override
   public short method21451(int var1) {
      Preconditions.checkArgument(var1 >= 0 && var1 < 16, "Invalid chunkSectionY: " + var1);
      return (short)((var1 << 4) + this.field30111);
   }

   @Override
   public int method21452() {
      return this.field30113;
   }

   @Override
   public void method21453(int var1) {
      this.field30113 = var1;
   }
}
