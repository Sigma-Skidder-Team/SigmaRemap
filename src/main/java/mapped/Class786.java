package mapped;

public class Class786 implements Runnable {
   private static String[] field4113;
   public final int field4114;
   public final int field4115;
   public final float[][] field4116;
   public final boolean field4117;
   public final Class8543 field4118;

   public Class786(Class8543 var1, int var2, int var3, float[][] var4, boolean var5) {
      this.field4118 = var1;
      this.field4114 = var2;
      this.field4115 = var3;
      this.field4116 = var4;
      this.field4117 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field4114; var3 < this.field4115; var3++) {
         Class8543.method30434(this.field4118).method30953(this.field4116[var3], 0, this.field4117);
      }
   }
}
