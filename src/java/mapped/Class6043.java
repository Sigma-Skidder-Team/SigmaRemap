package mapped;

public class Class6043 extends Class6037 {
   private static String[] field26239;
   private int field26257;
   private String field26258;
   private String field26259;
   private long field26260;

   public Class6043(Class7161 var1) {
      super(var1);
   }

   public void method18708() {
      if (this.field26259 != null && this.field26260 <= System.currentTimeMillis()) {
         Class8563 var3 = new Class8563(1, null, this.method18672());
         var3.method30560(BruhMotha.field22539, this.field26259);
         var3.method30560(BruhMotha.field22524, false);
         var3.method30560(BruhMotha.field22559, null);

         try {
            var3.method30585(Class6380.class);
         } catch (Exception var5) {
            var5.printStackTrace();
         }

         this.field26259 = null;
      }
   }

   public int method18709() {
      return this.field26257;
   }

   public void method18710(int var1) {
      this.field26257 = var1;
   }

   public String method18711() {
      return this.field26258;
   }

   public void method18712(String var1) {
      this.field26258 = var1;
   }

   public String method18713() {
      return this.field26259;
   }

   public void method18714(String var1) {
      this.field26259 = var1;
   }

   public long method18715() {
      return this.field26260;
   }

   public void method18716(long var1) {
      this.field26260 = var1;
   }
}
