package mapped;

public class Class408 implements Runnable {
   private static String[] field1772;
   public final long field1773;
   public final long field1774;
   public final long field1775;
   public final Class2378 field1776;
   public final long field1777;
   public final Class2378 field1778;
   public final Class8630 field1779;

   public Class408(Class8630 var1, long var2, long var4, long var6, Class2378 var8, long var9, Class2378 var11) {
      this.field1779 = var1;
      this.field1773 = var2;
      this.field1774 = var4;
      this.field1775 = var6;
      this.field1776 = var8;
      this.field1777 = var9;
      this.field1778 = var11;
   }

   @Override
   public void run() {
      if (this.field1773 <= 0L) {
         for (long var3 = this.field1774; var3 < this.field1775; var3++) {
            long var5 = 2L * var3;
            long var7 = var5 + 1L;
            this.field1776
               .method9685(
                  this.field1777 + var5,
                  Class8630.method31010(this.field1779).method9651(var5) * this.field1778.method9651(var5)
                     + Class8630.method31010(this.field1779).method9651(var7) * this.field1778.method9651(var7)
               );
            this.field1776
               .method9685(
                  this.field1777 + var7,
                  -Class8630.method31010(this.field1779).method9651(var7) * this.field1778.method9651(var5)
                     + Class8630.method31010(this.field1779).method9651(var5) * this.field1778.method9651(var7)
               );
         }
      } else {
         for (long var9 = this.field1774; var9 < this.field1775; var9++) {
            long var10 = 2L * var9;
            long var11 = var10 + 1L;
            this.field1776
               .method9685(
                  this.field1777 + var10,
                  Class8630.method31010(this.field1779).method9651(var10) * this.field1778.method9651(var10)
                     - Class8630.method31010(this.field1779).method9651(var11) * this.field1778.method9651(var11)
               );
            this.field1776
               .method9685(
                  this.field1777 + var11,
                  Class8630.method31010(this.field1779).method9651(var11) * this.field1778.method9651(var10)
                     + Class8630.method31010(this.field1779).method9651(var10) * this.field1778.method9651(var11)
               );
         }
      }
   }
}
