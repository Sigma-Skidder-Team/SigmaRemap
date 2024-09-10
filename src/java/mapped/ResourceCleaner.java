package mapped;

public class ResourceCleaner implements Runnable {
   private static String[] field8838;
   private long field8839;
   private final long field8840;
   private final long field8841;

   public ResourceCleaner(long var1, long var3, long var5) {
      this.field8839 = var1;
      this.field8840 = var3;
      this.field8841 = var5;
   }

   @Override
   public void run() {
      if (this.field8839 != 0L) {
         Class8133.field34961.freeMemory(this.field8839);
         this.field8839 = 0L;
         Class8065.method27707(this.field8840 * this.field8841);
      }
   }
}
