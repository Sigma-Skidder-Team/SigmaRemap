package mapped;

public class Class1620 implements Runnable {
   private static String[] field8773;
   public final long field8774;
   public final long field8775;
   public final Class2381 field8776;
   public final long field8777;
   public final Class2381 field8778;
   public final Class9049 field8779;

   public Class1620(Class9049 var1, long var2, long var4, Class2381 var6, long var7, Class2381 var9) {
      this.field8779 = var1;
      this.field8774 = var2;
      this.field8775 = var4;
      this.field8776 = var6;
      this.field8777 = var7;
      this.field8778 = var9;
   }

   @Override
   public void run() {
      for (long var3 = this.field8774; var3 < this.field8775; var3++) {
         long var5 = 2L * var3;
         long var7 = var5 + 1L;
         this.field8776.method9687(this.field8777 + var3, this.field8778.method9653(var5) - this.field8778.method9653(var7));
         this.field8776
            .method9687(this.field8777 + Class9049.method33655(this.field8779) - var3, this.field8778.method9653(var5) + this.field8778.method9653(var7));
      }
   }
}
