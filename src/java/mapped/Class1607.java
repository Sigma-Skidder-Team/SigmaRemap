package mapped;

public class Class1607 implements Runnable {
   private static String[] field8707;
   public final long field8708;
   public final long field8709;
   public final long field8710;
   public final Class2378 field8711;
   public final Class2378 field8712;
   public final Class8431 field8713;

   public Class1607(Class8431 var1, long var2, long var4, long var6, Class2378 var8, Class2378 var9) {
      this.field8713 = var1;
      this.field8708 = var2;
      this.field8709 = var4;
      this.field8710 = var6;
      this.field8711 = var8;
      this.field8712 = var9;
   }

   @Override
   public void run() {
      for (long var3 = this.field8708; var3 < this.field8709; var3++) {
         long var5 = 2L * var3;
         long var7 = this.field8710 + var3;
         this.field8711
            .method9685(
               var7,
               Class8431.method29642(this.field8713).method9651(var5) * this.field8712.method9651(var5)
                  - Class8431.method29642(this.field8713).method9651(var5 + 1L) * this.field8712.method9651(var5 + 1L)
            );
      }
   }
}
