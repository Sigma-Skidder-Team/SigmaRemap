package remapped;

public abstract class class_9401 {
   public static final int field_48067 = 2304;
   public static final int field_48068 = 2;

   public abstract void method_43544(int var1, short var2);

   public void method_43543(int var1, float[] var2) {
      int var5 = 0;

      while (var5 < 32) {
         short var6 = this.method_43538(var2[var5++]);
         this.method_43544(var1, var6);
      }
   }

   private final short method_43538(float var1) {
      return !(var1 > 32767.0F) ? (!(var1 < -32768.0F) ? (short)((int)var1) : -32768) : 32767;
   }

   public abstract void method_43545(int var1);

   public abstract void method_43540();

   public abstract void method_43542();

   public abstract void method_43539();
}
