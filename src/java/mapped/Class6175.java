package mapped;

import java.io.IOException;
import java.util.List;

public final class Class6175 implements Class6172 {
   private final Class9520 field27611;

   public Class6175(Class9520 var1) {
      this.field27611 = var1;
   }

   @Override
   public Class1797 method19074(Class8165 var1) throws IOException {
      Class8223 var4 = var1.method28408();
      Class7677 var5 = var4.method28619();
      Class4864 var6 = var4.method28617();
      if (var6 != null) {
         Class7450 var7 = var6.method15007();
         if (var7 != null) {
            var5.method25238("Content-Type", var7.toString());
         }

         long var11 = var6.method15008();
         if (var11 == -1L) {
            var5.method25238("Transfer-Encoding", "chunked");
            var5.method25240("Content-Length");
         } else {
            var5.method25238("Content-Length", Long.toString(var11));
            var5.method25240("Transfer-Encoding");
         }
      }

      if (var4.method28615("Host") == null) {
         var5.method25238("Host", Class9474.method36545(var4.method28612(), false));
      }

      if (var4.method28615("Connection") == null) {
         var5.method25238("Connection", "Keep-Alive");
      }

      boolean var15 = false;
      if (var4.method28615("Accept-Encoding") == null && var4.method28615("Range") == null) {
         var15 = true;
         var5.method25238("Accept-Encoding", "gzip");
      }

      List var8 = this.field27611.method36786(var4.method28612());
      if (!var8.isEmpty()) {
         var5.method25238("Cookie", this.method19084(var8));
      }

      if (var4.method28615("User-Agent") == null) {
         var5.method25238("User-Agent", Class9669.method37724());
      }

      Class1797 var9 = var1.method28409(var5.method25252());
      Class8394.method29452(this.field27611, var4.method28612(), var9.method7853());
      Class9279 var10 = var9.method7856().method34977(var4);
      if (var15 && "gzip".equalsIgnoreCase(var9.method7851("Content-Encoding")) && Class8394.method29453(var9)) {
         Class1739 var13 = new Class1739(var9.method7855().method7836());
         Class9371 var14 = var9.method7853().method35550().method34438("Content-Encoding").method34438("Content-Length").method34442();
         var10.method34985(var14);
         var10.method34986(new Class1796(var14, Class7001.method21696(var13)));
      }

      return var10.method34994();
   }

   private String method19084(List<Class9454> var1) {
      StringBuilder var4 = new StringBuilder();
      int var5 = 0;

      for (int var6 = var1.size(); var5 < var6; var5++) {
         if (var5 > 0) {
            var4.append("; ");
         }

         Class9454 var7 = (Class9454)var1.get(var5);
         var4.append(var7.method36364()).append('=').append(var7.method36365());
      }

      return var4.toString();
   }
}
