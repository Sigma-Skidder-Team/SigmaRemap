package mapped;

public abstract class Class6399 {
   private final Class2268 field28009;

   public static Class6399 method19498(Class5066 var0) {
      Object var3 = null;
      if (var0.method15437(1935894637L)) {
         Class4988 var4 = (Class4988)var0.method15438(1935894637L);
         long var5 = var4.method15308();
         if (var5 == Class2257.method8991(Class2257.field14685)) {
            var3 = new Class6401(var0);
         }
      }

      if (var3 == null) {
         var3 = new Class6400(var0);
      }

      return (Class6399)var3;
   }

   public Class6399(Class5066 var1) {
      long var4 = ((Class5067)var1.method15438(1718775137L)).method15503();
      Class2268 var6;
      if ((var6 = Class2267.method8996(var4)).equals(Class2267.field14749)) {
         if ((var6 = Class2269.method8997(var4)).equals(Class2269.field14754)) {
            this.field28009 = null;
         } else {
            this.field28009 = var6;
         }
      } else {
         this.field28009 = var6;
      }
   }

   public Class2268 method19499() {
      return this.field28009;
   }

   public abstract Class2257 method19500();
}
