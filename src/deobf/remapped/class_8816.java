package remapped;

import com.mojang.datafixers.util.Either;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.function.Function;

public interface class_8816<Msg> extends AutoCloseable {
   String method_40492();

   void method_40495(Msg var1);

   @Override
   default void close() {
   }

   default <Source> CompletableFuture<Source> method_40493(Function<? super class_8816<Source>, ? extends Msg> var1) {
      CompletableFuture var4 = new CompletableFuture();
      Object var5 = var1.apply(method_40496("ask future procesor handle", var4::complete));
      this.method_40495((Msg)var5);
      return var4;
   }

   default <Source> CompletableFuture<Source> method_40494(Function<? super class_8816<Either<Source, Exception>>, ? extends Msg> var1) {
      CompletableFuture var4 = new CompletableFuture();
      Object var5 = var1.apply(method_40496("ask future procesor handle", var1x -> {
         var1x.ifLeft(var4::complete);
         var1x.ifRight(var4::completeExceptionally);
      }));
      this.method_40495((Msg)var5);
      return var4;
   }

   static <Msg> class_8816<Msg> method_40496(String var0, Consumer<Msg> var1) {
      return new class_7171(var0, var1);
   }
}
