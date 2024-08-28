package mapped;

import java.io.IOException;
import java.net.ProtocolException;

public class Class4233 implements Class4232 {
   public final Class8223 field20567;
   public final int field20568;
   public final Class8212 field20569;

   public Class4233(Class8212 var1, Class8223 var2, int var3) {
      this.field20569 = var1;
      this.field20567 = var2;
      this.field20568 = var3;
   }

   @Override
   public void method13024(Class2370 var1, Class1797 var2) {
      try {
         this.field20569.method28542(var2);
      } catch (ProtocolException var9) {
         this.field20569.method28559(var9, var2);
         Class9474.method36535(var2);
         return;
      }

      Class5751 var5 = Class6605.field29047.method20026(var1);
      var5.method17934();
      Class1803 var6 = var5.method17932().method22811(var5);

      try {
         this.field20569.field35265.method31224(this.field20569, var2);
         String var7 = "OkHttp WebSocket " + this.field20567.method28612().method22962();
         this.field20569.method28543(var7, (long)this.field20568, var6);
         var5.method17932().method22814().setSoTimeout(0);
         this.field20569.method28544();
      } catch (Exception var8) {
         this.field20569.method28559(var8, null);
      }
   }

   @Override
   public void method13023(Class2370 var1, IOException var2) {
      this.field20569.method28559(var2, null);
   }
}
