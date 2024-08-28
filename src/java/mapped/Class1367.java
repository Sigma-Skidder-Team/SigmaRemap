package mapped;

public class Class1367 implements Runnable {
   private static String[] field7299;
   public final long field7300;
   public final long field7301;
   public final Class2381 field7302;
   public final boolean field7303;
   public final Class6352 field7304;

   public Class1367(Class6352 var1, long var2, long var4, Class2381 var6, boolean var7) {
      this.field7304 = var1;
      this.field7300 = var2;
      this.field7301 = var4;
      this.field7302 = var6;
      this.field7303 = var7;
   }

   @Override
   public void run() {
      Class2381 var3 = new Class2381(Class6352.method19336(this.field7304), false);

      for (long var4 = this.field7300; var4 < this.field7301; var4++) {
         long var6 = var4 * Class6352.method19335(this.field7304);

         for (long var8 = 0L; var8 < Class6352.method19338(this.field7304); var8++) {
            for (long var10 = 0L; var10 < Class6352.method19336(this.field7304); var10++) {
               long var12 = var6 + var10 * Class6352.method19337(this.field7304) + var8;
               var3.method9687(var10, this.field7302.method9653(var12));
            }

            Class6352.method19332(this.field7304).method38581(var3, this.field7303);

            for (long var14 = 0L; var14 < Class6352.method19336(this.field7304); var14++) {
               long var15 = var6 + var14 * Class6352.method19337(this.field7304) + var8;
               this.field7302.method9687(var15, var3.method9653(var14));
            }
         }
      }
   }
}
