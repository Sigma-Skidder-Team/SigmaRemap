package mapped;

import java.io.IOException;
import java.net.ProtocolException;

public final class Class6173 implements Class6172 {
   private final boolean field27609;

   public Class6173(boolean var1) {
      this.field27609 = var1;
   }

   @Override
   public Class1797 method19074(Class8165 var1) throws IOException {
      Class8164 var4 = (Class8164)var1;
      Class7932 var5 = var4.method28407();
      Class5751 var6 = var4.method28406();
      Class7263 var7 = (Class7263)var4.method28405();
      Class8223 var8 = var4.method28408();
      long var9 = System.currentTimeMillis();
      var5.method26666(var8);
      Class9279 var11 = null;
      if (Class8059.method27668(var8.method28613()) && var8.method28617() != null) {
         if ("100-continue".equalsIgnoreCase(var8.method28615("Expect"))) {
            var5.method26667();
            var11 = var5.method26669(true);
         }

         if (var11 != null) {
            if (!var7.method22819()) {
               var6.method17934();
            }
         } else {
            Class1716 var12 = var5.method26665(var8, var8.method28617().method15008());
            Class1733 var13 = Class7001.method21697(var12);
            var8.method28617().method15009(var13);
            var13.close();
         }
      }

      var5.method26668();
      if (var11 == null) {
         var11 = var5.method26669(false);
      }

      Class1797 var14 = var11.method34977(var8)
         .method34992(var9)
         .method34993(System.currentTimeMillis())
         .method34994();
      int var16 = var14.method7846();
      if (this.field27609 && var16 == 101) {
         var14 = var14.method7856().method34986(Class9474.field44017).method34994();
      } else {
         var14 = var14.method7856().method34986(var5.method26672(var14)).method34994();
      }

      if ("close".equalsIgnoreCase(var14.method7844().method28615("Connection")) || "close".equalsIgnoreCase(var14.method7851("Connection"))) {
         var6.method17934();
      }

      if ((var16 == 204 || var16 == 205) && var14.method7855().method7834() > 0L) {
         throw new ProtocolException("HTTP " + var16 + " had non-zero Content-Length: " + var14.method7855().method7834());
      } else {
         return var14;
      }
   }
}
