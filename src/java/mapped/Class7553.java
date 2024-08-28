package mapped;

public class Class7553 extends Class7554 {
   private static String[] field32390;
   private final String field32391;
   private final int field32392;

   public Class7553(String var1, int var2) {
      super(var2);
      this.field32391 = var1;
      this.field32392 = this.field32394.method23942(var1);
   }

   @Override
   public void method24718(float var1) {
   }

   @Override
   public int method24719() {
      short var3 = 200;
      return Math.max(super.method24719(), this.field32392 + 14);
   }
}
