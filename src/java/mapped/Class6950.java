package mapped;

public class Class6950 implements Class6949 {
   private static String[] field30114;
   private final byte field30115;
   private final short field30116;
   private final byte field30117;
   private int field30118;

   public Class6950(byte var1, short var2, byte var3, int var4) {
      this.field30115 = var1;
      this.field30116 = var2;
      this.field30117 = var3;
      this.field30118 = var4;
   }

   public Class6950(int var1, int var2, int var3, int var4) {
      this((byte)var1, (short)var2, (byte)var3, var4);
   }

   @Override
   public byte method21448() {
      return this.field30115;
   }

   @Override
   public byte method21449() {
      return (byte)(this.field30116 & 15);
   }

   @Override
   public short method21451(int var1) {
      return this.field30116;
   }

   @Override
   public byte method21450() {
      return this.field30117;
   }

   @Override
   public int method21452() {
      return this.field30118;
   }

   @Override
   public void method21453(int var1) {
      this.field30118 = var1;
   }
}
