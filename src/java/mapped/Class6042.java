package mapped;

public class Class6042 extends Class6037 {
   private static String[] field26239;
   private static final long field26253 = 50L;
   private static final long field26254 = 20L;
   private long field26255 = 0L;
   private boolean field26256 = true;

   public Class6042(Class7161 var1) {
      super(var1);
   }

   public void method18704() {
      this.field26255 = Math.max(this.field26255 + 50L, System.currentTimeMillis() - 1000L);
   }

   public long method18705() {
      return this.field26255;
   }

   public boolean method18706() {
      return this.field26256;
   }

   public void method18707(boolean var1) {
      this.field26256 = var1;
   }
}
