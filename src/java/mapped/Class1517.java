package mapped;

public class Class1517 implements Runnable {
   private static String[] field8208;
   public final long field8209;
   public final long field8210;
   public final Class2381 field8211;
   public final boolean field8212;
   public final Class6352 field8213;

   public Class1517(Class6352 var1, long var2, long var4, Class2381 var6, boolean var7) {
      this.field8213 = var1;
      this.field8209 = var2;
      this.field8210 = var4;
      this.field8211 = var6;
      this.field8212 = var7;
   }

   @Override
   public void run() {
      Class2381 var3 = new Class2381(Class6352.method19336(this.field8213), false);

      for (long var4 = this.field8209; var4 < this.field8210; var4++) {
         long var6 = var4 * Class6352.method19335(this.field8213);

         for (long var8 = 0L; var8 < Class6352.method19338(this.field8213); var8++) {
            for (long var10 = 0L; var10 < Class6352.method19336(this.field8213); var10++) {
               long var12 = var6 + var10 * Class6352.method19337(this.field8213) + var8;
               var3.method9687(var10, this.field8211.method9653(var12));
            }

            Class6352.method19332(this.field8213).method38577(var3, this.field8212);

            for (long var14 = 0L; var14 < Class6352.method19336(this.field8213); var14++) {
               long var15 = var6 + var14 * Class6352.method19337(this.field8213) + var8;
               this.field8211.method9687(var15, var3.method9653(var14));
            }
         }
      }
   }
}
