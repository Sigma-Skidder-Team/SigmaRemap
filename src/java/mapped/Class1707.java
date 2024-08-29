package mapped;

import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Either;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Function;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class1707 implements AutoCloseable {
   private static final Logger field9301 = LogManager.getLogger();
   private final AtomicBoolean field9302 = new AtomicBoolean();
   private final Class322<Class497> field9303;
   private final Class1696 field9304;
   private final Map<Class7481, Class9713> field9305 = Maps.newLinkedHashMap();

   public Class1707(File var1, boolean var2, String var3) {
      this.field9304 = new Class1696(var1, var2);
      this.field9303 = new Class322<>(new Class7384(Class2262.values().length), Util.method38493(), "IOWorker-" + var3);
   }

   public CompletableFuture<Void> method7411(Class7481 var1, CompoundNBT var2) {
      return this.method7414(() -> {
         Class9713 var5 = this.field9305.computeIfAbsent(var1, var1xx -> new Class9713(var2));
         var5.field45380 = var2;
         return Either.left(Class9713.method38054(var5));
      }).thenCompose(Function.identity());
   }

   @Nullable
   public CompoundNBT method7412(Class7481 var1) throws IOException {
      CompletableFuture<CompoundNBT> var4 = this.method7414(() -> {
         Class9713 var4x = this.field9305.get(var1);
         if (var4x != null) {
            return Either.left(Class9713.method38053(var4x));
         } else {
            try {
               CompoundNBT var5 = this.field9304.method7296(var1);
               return Either.left(var5);
            } catch (Exception var6x) {
               field9301.warn("Failed to read chunk {}", var1, var6x);
               return Either.right(var6x);
            }
         }
      });

      try {
         return var4.join();
      } catch (CompletionException var6) {
         if (var6.getCause() instanceof IOException) {
            throw (IOException)var6.getCause();
         } else {
            throw var6;
         }
      }
   }

   public CompletableFuture<Void> method7413() {
      CompletableFuture var3 = this.method7414(
            () -> Either.left(
                  CompletableFuture.allOf(
                     this.field9305
                        .values()
                        .stream()
                        .<CompletableFuture>map(var0 -> Class9713.method38054(var0))
                        .<CompletableFuture<?>>toArray(CompletableFuture[]::new)
                  )
               )
         )
         .thenCompose(Function.identity());
      return var3.<Void>thenCompose(var1 -> this.<Void>method7414(() -> {
            try {
               this.field9304.method7298();
               return Either.left((Void)null);
            } catch (Exception var4) {
               field9301.warn("Failed to synchronized chunks", var4);
               return Either.right(var4);
            }
         }));
   }

   private <T> CompletableFuture<T> method7414(Supplier<Either<T, Exception>> var1) {
      return this.field9303.method1647(var2 -> new Class497(Class2262.field14710.ordinal(), () -> {
            if (!this.field9302.get()) {
               var2.method1641(var1.get());
            }

            this.method7416();
         }));
   }

   private void method7415() {
      Iterator var3 = this.field9305.entrySet().iterator();
      if (var3.hasNext()) {
         Entry var4 = (Entry)var3.next();
         var3.remove();
         this.method7417((Class7481)var4.getKey(), (Class9713)var4.getValue());
         this.method7416();
      }
   }

   private void method7416() {
      this.field9303.method1641(new Class497(Class2262.field14711.ordinal(), this::method7415));
   }

   private void method7417(Class7481 var1, Class9713 var2) {
      try {
         this.field9304.method7297(var1, Class9713.method38053(var2));
         Class9713.method38054(var2).complete((Void)null);
      } catch (Exception var6) {
         field9301.error("Failed to store chunk {}", var1, var6);
         Class9713.method38054(var2).completeExceptionally(var6);
      }
   }

   @Override
   public void close() throws IOException {
      if (this.field9302.compareAndSet(false, true)) {
         CompletableFuture var3 = this.field9303.method1646(var0 -> new Class497(Class2262.field14710.ordinal(), () -> var0.method1641(Class2341.field16010)));

         try {
            var3.join();
         } catch (CompletionException var6) {
            if (var6.getCause() instanceof IOException) {
               throw (IOException)var6.getCause();
            }

            throw var6;
         }

         this.field9303.close();
         this.field9305.forEach(this::method7417);
         this.field9305.clear();

         try {
            this.field9304.close();
         } catch (Exception var5) {
            field9301.error("Failed to close storage", var5);
         }
      }
   }
}
