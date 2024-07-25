package remapped;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.List;

public enum class_489 {
   public class_489(String var3) {
   }

   @Override
   public void method_32535(class_8406 var1, class_9257 var2, List<class_8406> var3) throws CommandSyntaxException {
      List var6 = var2.method_42651(var1, class_3416::new);
      var6.forEach(var1x -> {
         if (var1x instanceof class_3416) {
            var3.forEach(var1xx -> ((class_3416)var1x).add(var1xx.method_38708()));
         }
      });
   }
}
