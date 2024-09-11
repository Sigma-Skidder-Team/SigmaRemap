package mapped;

import com.google.common.base.Joiner;

import java.util.UUID;
import java.util.logging.Level;

public class Class3092 implements Class2982 {
   public final Class3976 field18273;

   public Class3092(Class3976 var1) {
      this.field18273 = var1;
   }

   @Override
   public void method11398(Class8563 var1) throws Exception {
      Class6038 var4 = var1.method30580().method22465();
      var4.method18674(Class187.field702);
      UUID var5 = this.field18273.field20271.method19387(var1);
      var4.method18682(var5);
      String var6 = var1.<String>method30561(Class4750.field22539);
      var4.method18680(var6);
      ViaVersion3.getInstance().method34422(var1.method30580());
      if (var4.method18683().method19393().stream().allMatch(Class9019::method33366)) {
         var1.method30580().method22469(false);
      }

      if (ViaVersion3.getInstance().method34425()) {
         ViaVersion3.method27613()
            .getLogger()
            .log(
               Level.INFO,
               "{0} logged in with protocol {1}, Route: {2}",
               new Object[]{var6, var4.method18675(), Joiner.on(", ").join(var4.method18683().method19393(), ", ", new Object[0])}
            );
      }
   }
}
