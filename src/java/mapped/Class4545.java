package mapped;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Class4545 implements Iterator<BlockPos> {
   private double field21897;
   private double field21898;
   private int field21899;
   private int field21900;
   private double field21901;
   private double field21902;
   private double field21903;
   private double field21904;
   private int field21905;
   private double field21906;
   private double field21907;
   private Class2001 field21908 = new Class2001(0, 0, 0);
   private boolean field21909 = false;

   public Class4545(BlockPos var1, BlockPos var2, double var3, double var5) {
      this.field21897 = var3;
      this.field21898 = var5;
      this.field21899 = var1.method8304();
      this.field21900 = var2.method8304();
      this.field21901 = (double)var1.getY();
      this.field21902 = (double)var2.getY() - 0.5;
      this.field21903 = (double)var1.method8306();
      this.field21904 = (double)var2.method8306() - 0.5;
      this.field21905 = this.field21899;
      this.field21906 = this.field21901;
      this.field21907 = this.field21903;
      this.field21909 = this.field21905 < this.field21900 && this.field21906 < this.field21902 && this.field21907 < this.field21904;
   }

   @Override
   public boolean hasNext() {
      return this.field21909;
   }

   public BlockPos next() {
      if (!this.field21909) {
         throw new NoSuchElementException();
      } else {
         this.field21908.method8385((double)this.field21905, this.field21906, this.field21907);
         this.method14497();
         this.field21909 = this.field21905 < this.field21900 && this.field21906 < this.field21902 && this.field21907 < this.field21904;
         return this.field21908;
      }
   }

   private void method14497() {
      this.field21907++;
      if (!(this.field21907 < this.field21904)) {
         this.field21907 = this.field21903;
         this.field21906++;
         if (!(this.field21906 < this.field21902)) {
            this.field21906 = this.field21901;
            this.field21901 = this.field21901 + this.field21897;
            this.field21902 = this.field21902 + this.field21897;
            this.field21906 = this.field21901;
            this.field21903 = this.field21903 + this.field21898;
            this.field21904 = this.field21904 + this.field21898;
            this.field21907 = this.field21903;
            this.field21905++;
            if (this.field21905 < this.field21900) {
            }
         }
      }
   }

   @Override
   public void remove() {
      throw new RuntimeException("Not implemented");
   }

   public static void main(String[] var0) throws Exception {
      BlockPos var3 = new BlockPos(-2, 10, 20);
      BlockPos var4 = new BlockPos(2, 12, 22);
      double var5 = -0.5;
      double var7 = 0.5;
      Class4545 var9 = new Class4545(var3, var4, var5, var7);
      System.out.println("Start: " + var3 + ", end: " + var4 + ", yDelta: " + var5 + ", zDelta: " + var7);

      while (var9.hasNext()) {
         BlockPos var10 = var9.next();
         System.out.println("" + var10);
      }
   }
}
