package mapped;

import com.mojang.datafixers.util.Either;

import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.function.Function;

public interface Class321<Msg> extends AutoCloseable {
   String method1631();

   void enqueue(Msg var1);

   @Override
   default void close() {
   }

   default <Source> CompletableFuture<Source> method1646(Function<? super Class321<Source>, ? extends Msg> var1) {
      CompletableFuture<Source> var4 = new CompletableFuture<>();
      Msg var5 = var1.apply(method1648("ask future procesor handle", var4::complete));
      this.enqueue((Msg)var5);
      return var4;
   }

   default <Source> CompletableFuture<Source> method1647(Function<? super Class321<Either<Source, Exception>>, ? extends Msg> var1) {
      CompletableFuture var4 = new CompletableFuture();
      Object var5 = var1.apply(method1648("ask future procesor handle", var1x -> {
         var1x.ifLeft(var4::complete);
         var1x.ifRight(var4::completeExceptionally);
      }));
      this.enqueue((Msg)var5);
      return var4;
   }

   static <Msg> Class321<Msg> method1648(String var0, Consumer<Msg> var1) {
      return new Class1642(var0, var1);
   }
}
