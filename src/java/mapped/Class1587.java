package mapped;

public class Class1587 implements Runnable {
   private static String[] field8599;
   public final long field8600;
   public final long field8601;
   public final Class2381 field8602;
   public final boolean field8603;
   public final Class6352 field8604;

   public Class1587(Class6352 var1, long var2, long var4, Class2381 var6, boolean var7) {
      this.field8604 = var1;
      this.field8600 = var2;
      this.field8601 = var4;
      this.field8602 = var6;
      this.field8603 = var7;
   }

   @Override
   public void run() {
      Class2381 var3 = new Class2381(Class6352.method19339(this.field8604), false);

      for (long var4 = this.field8600; var4 < this.field8601; var4++) {
         long var6 = var4 * Class6352.method19337(this.field8604);

         for (long var8 = 0L; var8 < Class6352.method19338(this.field8604); var8++) {
            for (long var10 = 0L; var10 < Class6352.method19339(this.field8604); var10++) {
               long var12 = var10 * Class6352.method19335(this.field8604) + var6 + var8;
               var3.method9687(var10, this.field8602.method9653(var12));
            }

            Class6352.method19334(this.field8604).method38581(var3, this.field8603);

            for (long var14 = 0L; var14 < Class6352.method19339(this.field8604); var14++) {
               long var15 = var14 * Class6352.method19335(this.field8604) + var6 + var8;
               this.field8602.method9687(var15, var3.method9653(var14));
            }
         }
      }
   }
}
