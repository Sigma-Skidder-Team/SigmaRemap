package mapped;

public final class Class8428 {
   private static String[] field36105;
   private static short field36106 = -32763;
   private short field36107 = -1;

   public void method29609(int var1, int var2) {
      int var5 = 1 << var2 - 1;

      do {
         if (!((this.field36107 & '耀') == 0 ^ (var1 & var5) == 0)) {
            this.field36107 = (short)(this.field36107 << 1);
         } else {
            this.field36107 = (short)(this.field36107 << 1);
            this.field36107 = (short)(this.field36107 ^ field36106);
         }
      } while ((var5 >>>= 1) != 0);
   }

   public short method29610() {
      short var3 = this.field36107;
      this.field36107 = -1;
      return var3;
   }
}
