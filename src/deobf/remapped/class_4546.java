package remapped;

public final class class_4546 {
   private static String[] field_22158;
   private static short field_22160 = -32763;
   private short field_22159 = -1;

   public void method_21089(int var1, int var2) {
      int var5 = 1 << var2 - 1;

      do {
         if (!((this.field_22159 & '耀') == 0 ^ (var1 & var5) == 0)) {
            this.field_22159 = (short)(this.field_22159 << 1);
         } else {
            this.field_22159 = (short)(this.field_22159 << 1);
            this.field_22159 = (short)(this.field_22159 ^ field_22160);
         }
      } while ((var5 >>>= 1) != 0);
   }

   public short method_21088() {
      short var3 = this.field_22159;
      this.field_22159 = -1;
      return var3;
   }
}
