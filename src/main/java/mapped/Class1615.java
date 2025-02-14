package mapped;

public class Class1615 implements Runnable {
   private static String[] field8750;
   public final long field8751;
   public final long field8752;
   public final Class2381 field8753;
   public final boolean field8754;
   public final Class6352 field8755;

   public Class1615(Class6352 var1, long var2, long var4, Class2381 var6, boolean var7) {
      this.field8755 = var1;
      this.field8751 = var2;
      this.field8752 = var4;
      this.field8753 = var6;
      this.field8754 = var7;
   }

   @Override
   public void run() {
      Class2381 var3 = new Class2381(Class6352.method19339(this.field8755), false);

      for (long var4 = this.field8751; var4 < this.field8752; var4++) {
         long var6 = var4 * Class6352.method19337(this.field8755);

         for (long var8 = 0L; var8 < Class6352.method19338(this.field8755); var8++) {
            for (long var10 = 0L; var10 < Class6352.method19339(this.field8755); var10++) {
               long var12 = var10 * Class6352.method19335(this.field8755) + var6 + var8;
               var3.method9687(var10, this.field8753.method9653(var12));
            }

            Class6352.method19334(this.field8755).method38577(var3, this.field8754);

            for (long var14 = 0L; var14 < Class6352.method19339(this.field8755); var14++) {
               long var15 = var14 * Class6352.method19335(this.field8755) + var6 + var8;
               this.field8753.method9687(var15, var3.method9653(var14));
            }
         }
      }
   }
}
