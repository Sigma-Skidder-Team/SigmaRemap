package mapped;

public class Class1512 implements Runnable {
   private static String[] field8175;
   public final int field8176;
   public final int field8177;
   public final int field8178;
   public final Class2378 field8179;
   public final boolean field8180;
   public final Class9533 field8181;

   public Class1512(Class9533 var1, int var2, int var3, int var4, Class2378 var5, boolean var6) {
      this.field8181 = var1;
      this.field8176 = var2;
      this.field8177 = var3;
      this.field8178 = var4;
      this.field8179 = var5;
      this.field8180 = var6;
   }

   @Override
   public void run() {
      if (this.field8176 != -1) {
         for (long var3 = (long)this.field8177; var3 < Class9533.method36861(this.field8181); var3 += (long)this.field8178) {
            Class9533.method36857(this.field8181).method29634(this.field8179, var3 * Class9533.method36860(this.field8181), this.field8180);
         }
      } else {
         for (long var5 = (long)this.field8177; var5 < Class9533.method36861(this.field8181); var5 += (long)this.field8178) {
            Class9533.method36857(this.field8181).method29630(this.field8179, var5 * Class9533.method36860(this.field8181), this.field8180);
         }
      }
   }
}
