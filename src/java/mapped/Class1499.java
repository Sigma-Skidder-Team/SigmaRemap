package mapped;

public class Class1499 implements Runnable {
   private static String[] field8084;
   public final long field8085;
   public final long field8086;
   public final Class2381 field8087;
   public final long field8088;
   public final Class2381 field8089;
   public final Class9788 field8090;

   public Class1499(Class9788 var1, long var2, long var4, Class2381 var6, long var7, Class2381 var9) {
      this.field8090 = var1;
      this.field8085 = var2;
      this.field8086 = var4;
      this.field8087 = var6;
      this.field8088 = var7;
      this.field8089 = var9;
   }

   @Override
   public void run() {
      for (long var3 = this.field8085; var3 < this.field8086; var3++) {
         long var5 = 2L * var3;
         double var7 = this.field8087.method9653(this.field8088 + var3);
         this.field8089.method9687(var5, Class9788.method38591(this.field8090).method9653(var5) * var7);
         this.field8089.method9687(var5 + 1L, -Class9788.method38591(this.field8090).method9653(var5 + 1L) * var7);
      }
   }
}
