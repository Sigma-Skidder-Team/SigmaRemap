package remapped;

public final class class_3493 {
   public static boolean method_16061(String var0) {
      return var0.equals("POST") || var0.equals("PATCH") || var0.equals("PUT") || var0.equals("DELETE") || var0.equals("MOVE");
   }

   public static boolean method_16064(String var0) {
      return var0.equals("POST") || var0.equals("PUT") || var0.equals("PATCH") || var0.equals("PROPPATCH") || var0.equals("REPORT");
   }

   public static boolean method_16060(String var0) {
      return method_16064(var0) || var0.equals("OPTIONS") || var0.equals("DELETE") || var0.equals("PROPFIND") || var0.equals("MKCOL") || var0.equals("LOCK");
   }

   public static boolean method_16062(String var0) {
      return var0.equals("PROPFIND");
   }

   public static boolean method_16065(String var0) {
      return !var0.equals("PROPFIND");
   }

   private class_3493() {
   }
}
