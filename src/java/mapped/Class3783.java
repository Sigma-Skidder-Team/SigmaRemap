package mapped;

import com.google.common.base.Joiner;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class Class3783 extends Class3758 {
   public final Class6356 field19962;

   public Class3783(Class6356 var1) {
      this.field19962 = var1;
   }

   @Override
   public void method12725() {
      this.method12733(
         var0 -> {
            String var3 = var0.<String>method30561(Class4750.field22539);
            if (var3.length() <= 32) {
               if (var3.equals("minecraft:register") || var3.equals("minecraft:unregister")) {
                  String[] var4 = new String(var0.<byte[]>method30559(Class4750.field22521), StandardCharsets.UTF_8).split("\u0000");
                  ArrayList var5 = new ArrayList(var4.length);

                  for (String var9 : var4) {
                     if (var9.length() <= 32) {
                        var5.add(var9);
                     } else if (!ViaVersion3.method27612().method21941()) {
                        ViaVersion3.method27613()
                           .method27366()
                           .warning("Ignoring incoming plugin channel register of '" + var9 + "', as it is longer than 32 characters");
                     }
                  }

                  if (var5.isEmpty()) {
                     var0.method30578();
                     return;
                  }

                  var0.method30560(Class4750.field22521, Joiner.on('\u0000').join(var5).getBytes(StandardCharsets.UTF_8));
               }
            } else {
               if (!ViaVersion3.method27612().method21941()) {
                  ViaVersion3.method27613().method27366().warning("Ignoring incoming plugin channel, as it is longer than 32 characters: " + var3);
               }

               var0.method30578();
            }
         }
      );
   }
}
