package mapped;

public class Class1592 implements Runnable {
   private static String[] field8626;
   public final int field8627;
   public final long field8628;
   public final int field8629;
   public final Class2378 field8630;
   public final boolean field8631;
   public final Class7821 field8632;

   public Class1592(Class7821 var1, int var2, long var3, int var5, Class2378 var6, boolean var7) {
      this.field8632 = var1;
      this.field8627 = var2;
      this.field8628 = var3;
      this.field8629 = var5;
      this.field8630 = var6;
      this.field8631 = var7;
   }

   @Override
   public void run() {
      if (this.field8627 != -1) {
         for (long var3 = this.field8628; var3 < Class7821.method26154(this.field8632); var3 += (long)this.field8629) {
            Class7821.method26150(this.field8632).method28462(this.field8630, var3 * Class7821.method26153(this.field8632), this.field8631);
         }
      } else {
         for (long var5 = this.field8628; var5 < Class7821.method26154(this.field8632); var5 += (long)this.field8629) {
            Class7821.method26150(this.field8632).method28458(this.field8630, var5 * Class7821.method26153(this.field8632));
         }
      }
   }
}
