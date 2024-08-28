package mapped;

public class Class6401 extends Class6399 {
   private static String[] field28011;
   private final String field28012;
   private final String field28013;
   private final String field28014;
   private final byte[] field28015;
   private final byte[] field28016;

   public Class6401(Class5066 var1) {
      super(var1);
      Class5066 var4 = var1.method15438(1935894633L);
      this.field28012 = new String(((Class5042)var4.method15438(1970496882L)).method15443());
      byte[] var5 = ((Class5042)var4.method15438(1851878757L)).method15443();
      int var6 = 0;

      while (var5[var6] != 0) {
         var6++;
      }

      this.field28013 = new String(var5, 0, var6 - 1);
      this.field28014 = new String(((Class5042)var4.method15438(1801812256L)).method15443());
      this.field28015 = ((Class5042)var4.method15438(1886546294L)).method15443();
      this.field28016 = ((Class5042)var4.method15438(1769367926L)).method15443();
   }

   @Override
   public Class2257 method19500() {
      return Class2257.field14685;
   }

   public String method19501() {
      return this.field28012;
   }

   public String method19502() {
      return this.field28013;
   }

   public String method19503() {
      return this.field28014;
   }

   public byte[] method19504() {
      return this.field28015;
   }

   public byte[] method19505() {
      return this.field28016;
   }
}
