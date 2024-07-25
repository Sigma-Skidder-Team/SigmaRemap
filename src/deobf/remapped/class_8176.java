package remapped;

public class class_8176 {
   private static String[] field_41860;
   private int field_41858;
   private int field_41861;
   private int field_41862;
   private int field_41859;
   private byte[] field_41857;

   private class_8176() {
   }

   public static class_8176 method_37493(class_5051 var0, boolean var1) throws Exception {
      class_8176 var4 = new class_8176();
      var4.method_37489(var0.<Integer>method_23242(class_8039.field_41179));
      var4.method_37490(var0.<Integer>method_23242(class_8039.field_41179));
      var4.method_37483(var0.<Integer>method_23242(class_8039.field_41138));
      int var5 = Integer.bitCount(var4.method_37487());
      var4.method_37486(var5 * 10240 + (!var1 ? 0 : var5 * 2048) + 256);
      return var4;
   }

   public int method_37494() {
      return this.field_41858;
   }

   public void method_37489(int var1) {
      this.field_41858 = var1;
   }

   public int method_37488() {
      return this.field_41861;
   }

   public void method_37490(int var1) {
      this.field_41861 = var1;
   }

   public int method_37487() {
      return this.field_41862;
   }

   public void method_37483(int var1) {
      this.field_41862 = var1;
   }

   public int method_37491() {
      return this.field_41859;
   }

   public void method_37486(int var1) {
      this.field_41859 = var1;
   }

   public byte[] method_37492() {
      return this.field_41857;
   }

   public void method_37485(byte[] var1) {
      this.field_41857 = var1;
   }
}
