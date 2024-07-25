package remapped;

import com.mojang.datafixers.util.Pair;
import java.net.IDN;
import java.util.Hashtable;
import javax.naming.directory.Attribute;
import javax.naming.directory.Attributes;
import javax.naming.directory.InitialDirContext;

public class class_8140 {
   private final String field_41683;
   private final int field_41684;

   private class_8140(String var1, int var2) {
      this.field_41683 = var1;
      this.field_41684 = var2;
   }

   public String method_37039() {
      try {
         return IDN.toASCII(this.field_41683);
      } catch (IllegalArgumentException var4) {
         return "";
      }
   }

   public int method_37038() {
      return this.field_41684;
   }

   public static class_8140 method_37037(String var0) {
      if (var0 == null) {
         return null;
      } else {
         String[] var3 = var0.split(":");
         if (var0.startsWith("[")) {
            int var4 = var0.indexOf("]");
            if (var4 > 0) {
               String var5 = var0.substring(1, var4);
               String var6 = var0.substring(var4 + 1).trim();
               if (var6.startsWith(":") && !var6.isEmpty()) {
                  var6 = var6.substring(1);
                  var3 = new String[]{var5, var6};
               } else {
                  var3 = new String[]{var5};
               }
            }
         }

         if (var3.length > 2) {
            var3 = new String[]{var0};
         }

         String var7 = var3[0];
         int var8 = var3.length <= 1 ? 25565 : method_37040(var3[1], 25565);
         if (var8 == 25565) {
            Pair var10 = method_37042(var7);
            var7 = (String)var10.getFirst();
            var8 = (Integer)var10.getSecond();
         }

         return new class_8140(var7, var8);
      }
   }

   private static Pair<String, Integer> method_37042(String var0) {
      try {
         String var3 = "com.sun.jndi.dns.DnsContextFactory";
         Class.forName("com.sun.jndi.dns.DnsContextFactory");
         Hashtable var4 = new Hashtable();
         var4.put("java.naming.factory.initial", "com.sun.jndi.dns.DnsContextFactory");
         var4.put("java.naming.provider.url", "dns:");
         var4.put("com.sun.jndi.dns.timeout.retries", "1");
         InitialDirContext var5 = new InitialDirContext(var4);
         Attributes var6 = var5.getAttributes("_minecraft._tcp." + var0, new String[]{"SRV"});
         Attribute var7 = var6.get("srv");
         if (var7 != null) {
            String[] var8 = var7.get().toString().split(" ", 4);
            return Pair.of(var8[3], method_37040(var8[2], 25565));
         }
      } catch (Throwable var9) {
      }

      return Pair.of(var0, 25565);
   }

   private static int method_37040(String var0, int var1) {
      try {
         return Integer.parseInt(var0.trim());
      } catch (Exception var5) {
         return var1;
      }
   }
}
