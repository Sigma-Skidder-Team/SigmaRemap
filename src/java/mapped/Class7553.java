package mapped;

public class Class7553 extends CategoryDrawPartBackground {
   private static String[] field32390;
   private final String field32391;
   private final int field32392;

   public Class7553(String var1, int var2) {
      super(var2);
      this.field32391 = var1;
      this.field32392 = this.fontRenderer.getStringWidth(var1);
   }

   @Override
   public void method24718(float partialTicks) {
   }

   @Override
   public int getWidth() {
      short var3 = 200;
      return Math.max(super.getWidth(), this.field32392 + 14);
   }
}
