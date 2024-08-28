package mapped;

public class Class9491 {
   private static String[] field44116;
   private long field44117;

   public Class9491(long var1) {
      this.field44117 = System.currentTimeMillis() + var1;
   }

   public boolean method36664() {
      return this.field44117 - System.currentTimeMillis() < 0L;
   }
}
