package mapped;

public class Class406 implements Runnable {
   private static String[] field1757;
   public final long field1758;
   public final int field1759;
   public final long field1760;
   public final int field1761;
   public final Class2378 field1762;
   public final boolean field1763;
   public final Class8543 field1764;

   public Class406(Class8543 var1, long var2, int var4, long var5, int var7, Class2378 var8, boolean var9) {
      this.field1764 = var1;
      this.field1758 = var2;
      this.field1759 = var4;
      this.field1760 = var5;
      this.field1761 = var7;
      this.field1762 = var8;
      this.field1763 = var9;
   }

   @Override
   public void run() {
      if (this.field1758 != 0L) {
         if (this.field1759 != 1) {
            for (long var3 = this.field1760; var3 < Class8543.method30437(this.field1764); var3 += (long)this.field1761) {
               Class8543.method30434(this.field1764).method30954(this.field1762, var3 * Class8543.method30439(this.field1764), this.field1763);
            }
         } else {
            for (long var5 = this.field1760; var5 < Class8543.method30437(this.field1764); var5 += (long)this.field1761) {
               Class8543.method30434(this.field1764).method30940(this.field1762, var5 * Class8543.method30439(this.field1764));
            }
         }
      } else if (this.field1759 != -1) {
         for (long var6 = this.field1760; var6 < Class8543.method30437(this.field1764); var6 += (long)this.field1761) {
            Class8543.method30434(this.field1764).method30936(this.field1762, var6 * Class8543.method30439(this.field1764), this.field1763);
         }
      } else {
         for (long var7 = this.field1760; var7 < Class8543.method30437(this.field1764); var7 += (long)this.field1761) {
            Class8543.method30434(this.field1764).method30932(this.field1762, var7 * Class8543.method30439(this.field1764));
         }
      }
   }
}
