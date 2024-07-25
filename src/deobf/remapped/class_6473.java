package remapped;

import com.google.common.base.Joiner;
import java.util.UUID;
import java.util.logging.Level;

public class class_6473 implements class_857 {
   public class_6473(class_2398 var1) {
      this.field_32992 = var1;
   }

   @Override
   public void method_3722(class_5051 var1) throws Exception {
      class_3790 var4 = var1.method_23255().method_6744();
      var4.method_17599(class_1730.field_8920);
      UUID var5 = this.field_32992.field_11969.method_25130(var1);
      var4.method_17595(var5);
      String var6 = var1.<String>method_23261(class_8039.field_41171);
      var4.method_17605(var6);
      class_3446.method_15883().method_33725(var1.method_23255());
      if (var4.method_17596().method_42443().stream().allMatch(class_6710::method_30779)) {
         var1.method_23255().method_6718(false);
      }

      if (class_3446.method_15883().method_33731()) {
         class_3446.method_15886()
            .method_34617()
            .log(
               Level.INFO,
               "{0} logged in with protocol {1}, Route: {2}",
               new Object[]{var6, var4.method_17604(), Joiner.on(", ").join(var4.method_17596().method_42443(), ", ", new Object[0])}
            );
      }
   }
}
