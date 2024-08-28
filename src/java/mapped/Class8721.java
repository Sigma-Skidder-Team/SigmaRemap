package mapped;

public class Class8721 {
   private static String[] field39347;
   private long field39348;
   private Packet<?> field39349;
   public final Class8329 field39350;

   public Class8721(Class8329 var1, Packet<?> var2, long var3) {
      this.field39350 = var1;// ?
      this.field39349 = var2;
      this.field39348 = System.currentTimeMillis() + var3;
   }

   public boolean method31479() {
      return this.field39348 - System.currentTimeMillis() < 0L;
   }

   public Packet<?> method31480() {
      return this.field39349;
   }
}
