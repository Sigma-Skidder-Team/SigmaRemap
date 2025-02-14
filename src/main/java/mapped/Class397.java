package mapped;

public class Class397 implements Runnable {
   private static String[] field1697;
   public final int field1698;
   public final int field1699;
   public final int field1700;
   public final float[][] field1701;
   public final boolean field1702;
   public final Class8682 field1703;

   public Class397(Class8682 var1, int var2, int var3, int var4, float[][] var5, boolean var6) {
      this.field1703 = var1;
      this.field1698 = var2;
      this.field1699 = var3;
      this.field1700 = var4;
      this.field1701 = var5;
      this.field1702 = var6;
   }

   @Override
   public void run() {
      if (this.field1698 != -1) {
         for (int var3 = this.field1699; var3 < Class8682.method31247(this.field1703); var3 += this.field1700) {
            Class8682.method31246(this.field1703).method28928(this.field1701[var3], this.field1702);
         }
      } else {
         for (int var4 = this.field1699; var4 < Class8682.method31247(this.field1703); var4 += this.field1700) {
            Class8682.method31246(this.field1703).method28924(this.field1701[var4], this.field1702);
         }
      }
   }
}
