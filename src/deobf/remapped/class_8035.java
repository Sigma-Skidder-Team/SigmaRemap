package remapped;

public class class_8035 implements class_9523 {
   private static String[] field_41120;
   private final byte field_41119;
   private final short field_41118;
   private final byte field_41121;
   private int field_41117;

   public class_8035(byte var1, short var2, byte var3, int var4) {
      this.field_41119 = var1;
      this.field_41118 = var2;
      this.field_41121 = var3;
      this.field_41117 = var4;
   }

   public class_8035(int var1, int var2, int var3, int var4) {
      this((byte)var1, (short)var2, (byte)var3, var4);
   }

   @Override
   public byte method_43936() {
      return this.field_41119;
   }

   @Override
   public byte method_43934() {
      return (byte)(this.field_41118 & 15);
   }

   @Override
   public short method_43932(int var1) {
      return this.field_41118;
   }

   @Override
   public byte method_43930() {
      return this.field_41121;
   }

   @Override
   public int method_43935() {
      return this.field_41117;
   }

   @Override
   public void method_43933(int var1) {
      this.field_41117 = var1;
   }
}
