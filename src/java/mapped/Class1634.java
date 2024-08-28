package mapped;

public class Class1634 implements Runnable {
   private static String[] field8860;
   public final long field8861;
   public final long field8862;
   public final Class2381 field8863;
   public final boolean field8864;
   public final Class7274 field8865;

   public Class1634(Class7274 var1, long var2, long var4, Class2381 var6, boolean var7) {
      this.field8865 = var1;
      this.field8861 = var2;
      this.field8862 = var4;
      this.field8863 = var6;
      this.field8864 = var7;
   }

   @Override
   public void run() {
      for (long var3 = this.field8861; var3 < this.field8862; var3++) {
         long var5 = var3 * Class7274.method22902(this.field8865);

         for (long var7 = 0L; var7 < Class7274.method22903(this.field8865); var7++) {
            Class7274.method22897(this.field8865).method27169(this.field8863, var5 + var7 * Class7274.method22904(this.field8865), this.field8864);
         }
      }
   }
}
