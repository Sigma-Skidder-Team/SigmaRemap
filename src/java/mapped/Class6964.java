package mapped;

import com.mojang.datafixers.util.Either;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

public interface Class6964 extends Class6965 {
   @Override
   default CompletableFuture<Either<Class1670, Class7022>> method21487(
      Class9176 var1,
      ServerWorld var2,
      Class5646 var3,
      Class8761 var4,
      Class195 var5,
      Function<Class1670, CompletableFuture<Either<Class1670, Class7022>>> var6,
      List<Class1670> var7,
      Class1670 var8
   ) {
      if (!var8.method7080().method34306(var1)) {
         this.method21488(var2, var3, var7, var8);
         if (var8 instanceof Class1672) {
            ((Class1672)var8).method7111(var1);
         }
      }

      return CompletableFuture.<Either<Class1670, Class7022>>completedFuture(Either.left(var8));
   }

   void method21488(ServerWorld var1, Class5646 var2, List<Class1670> var3, Class1670 var4);
}
