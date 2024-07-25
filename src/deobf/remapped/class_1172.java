package remapped;

import com.mojang.datafixers.util.Either;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

public interface class_1172 extends class_6617 {
   @Override
   default CompletableFuture<Either<class_5990, class_1361>> method_30431(
      class_7335 var1,
      class_6331 var2,
      class_6541 var3,
      class_5799 var4,
      class_2087 var5,
      Function<class_5990, CompletableFuture<Either<class_5990, class_1361>>> var6,
      List<class_5990> var7,
      class_5990 var8
   ) {
      if (!var8.method_27364().method_33453(var1)) {
         this.method_5197(var2, var3, var7, var8);
         if (var8 instanceof class_7481) {
            ((class_7481)var8).method_34030(var1);
         }
      }

      return CompletableFuture.<Either<class_5990, class_1361>>completedFuture(Either.left(var8));
   }

   void method_5197(class_6331 var1, class_6541 var2, List<class_5990> var3, class_5990 var4);
}
