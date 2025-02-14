package mapped;

public abstract class Class6748 {
   public static final int field29456 = 2304;
   public static final int field29457 = 2;

   public abstract void method20565(int var1, short var2);

   public void method20566(int var1, float[] var2) {
      int var5 = 0;

      while (var5 < 32) {
         short var6 = this.method20571(var2[var5++]);
         this.method20565(var1, var6);
      }
   }

   private final short method20571(float var1) {
      return !(var1 > 32767.0F) ? (!(var1 < -32768.0F) ? (short)((int)var1) : -32768) : 32767;
   }

   public abstract void method20567(int var1);

   public abstract void method20568();

   public abstract void method20569();

   public abstract void method20570();
}
