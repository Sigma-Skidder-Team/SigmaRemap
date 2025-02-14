package mapped;

public class Class8206 implements Class8202 {
   private static String[] field35240;
   private final int[] field35241;

   public Class8206(int var1) {
      this.field35241 = new int[var1];
   }

   @Override
   public int method28505(int var1) {
      return this.field35241[var1];
   }

   @Override
   public void method28506(int var1, int var2) {
      this.field35241[var1] = var2;
   }

   @Override
   public int size() {
      return this.field35241.length;
   }
}
