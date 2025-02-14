package mapped;

public class Class395 implements Runnable {
   private static String[] field1683;
   public final long field1684;
   public final long field1685;
   public final Class2378 field1686;
   public final boolean field1687;
   public final Class7941 field1688;

   public Class395(Class7941 var1, long var2, long var4, Class2378 var6, boolean var7) {
      this.field1688 = var1;
      this.field1684 = var2;
      this.field1685 = var4;
      this.field1686 = var6;
      this.field1687 = var7;
   }

   @Override
   public void run() {
      Class2378 var3 = new Class2378(Class7941.method26775(this.field1688), false);

      for (long var4 = this.field1684; var4 < this.field1685; var4++) {
         long var6 = var4 * (long)Class7941.method26765(this.field1688);

         for (long var8 = 0L; var8 < Class7941.method26774(this.field1688); var8++) {
            for (long var10 = 0L; var10 < Class7941.method26775(this.field1688); var10++) {
               long var12 = var10 * (long)Class7941.method26763(this.field1688) + var6 + var8;
               var3.method9685(var10, this.field1686.method9651(var12));
            }

            Class7941.method26770(this.field1688).method28929(var3, this.field1687);

            for (long var14 = 0L; var14 < Class7941.method26775(this.field1688); var14++) {
               long var15 = var14 * (long)Class7941.method26763(this.field1688) + var6 + var8;
               this.field1686.method9685(var15, var3.method9651(var14));
            }
         }
      }
   }
}
