package remapped;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.List;

public enum class_2691 {
   public class_2691(String var3) {
   }

   @Override
   public void method_32535(class_8406 var1, class_9257 var2, List<class_8406> var3) throws CommandSyntaxException {
      List var6 = var2.method_42651(var1, CompoundNBT::new);
      var6.forEach(var1x -> {
         if (var1x instanceof CompoundNBT) {
            var3.forEach(var1xx -> {
               if (var1xx instanceof CompoundNBT) {
                  ((CompoundNBT)var1x).method_25925((CompoundNBT)var1xx);
               }
            });
         }
      });
   }
}
