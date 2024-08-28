package mapped;

public class Class1524 implements Runnable {
   private static String[] field8257;
   public final long field8258;
   public final long field8259;
   public final Class2378 field8260;
   public final long field8261;
   public final Class2378 field8262;
   public final Class8174 field8263;

   public Class1524(Class8174 var1, long var2, long var4, Class2378 var6, long var7, Class2378 var9) {
      this.field8263 = var1;
      this.field8258 = var2;
      this.field8259 = var4;
      this.field8260 = var6;
      this.field8261 = var7;
      this.field8262 = var9;
   }

   @Override
   public void run() {
      for (long var3 = this.field8258; var3 < this.field8259; var3++) {
         long var5 = 2L * var3;
         long var7 = var5 + 1L;
         this.field8260.method9685(this.field8261 + var3, this.field8262.method9651(var5) - this.field8262.method9651(var7));
         this.field8260
            .method9685(this.field8261 + Class8174.method28464(this.field8263) - var3, this.field8262.method9651(var5) + this.field8262.method9651(var7));
      }
   }
}
