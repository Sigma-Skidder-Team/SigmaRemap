package mapped;

import com.mojang.datafixers.util.Either;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

public interface Class6965 {
   CompletableFuture<Either<Class1670, Class7022>> method21487(
      Class9176 var1,
      ServerWorld var2,
      Class5646 var3,
      Class8761 var4,
      Class195 var5,
      Function<Class1670, CompletableFuture<Either<Class1670, Class7022>>> var6,
      List<Class1670> var7,
      Class1670 var8
   );
}
