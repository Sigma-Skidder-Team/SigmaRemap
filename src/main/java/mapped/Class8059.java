package mapped;

public final class Class8059 {
   public static boolean method27666(String var0) {
      return var0.equals("POST") || var0.equals("PATCH") || var0.equals("PUT") || var0.equals("DELETE") || var0.equals("MOVE");
   }

   public static boolean method27667(String var0) {
      return var0.equals("POST") || var0.equals("PUT") || var0.equals("PATCH") || var0.equals("PROPPATCH") || var0.equals("REPORT");
   }

   public static boolean method27668(String var0) {
      return method27667(var0) || var0.equals("OPTIONS") || var0.equals("DELETE") || var0.equals("PROPFIND") || var0.equals("MKCOL") || var0.equals("LOCK");
   }

   public static boolean method27669(String var0) {
      return var0.equals("PROPFIND");
   }

   public static boolean method27670(String var0) {
      return !var0.equals("PROPFIND");
   }

   private Class8059() {
   }
}
