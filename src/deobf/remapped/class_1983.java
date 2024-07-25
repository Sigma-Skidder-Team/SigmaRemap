package remapped;

import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Either;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Function;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_1983 implements AutoCloseable {
   private static final Logger field_10051 = LogManager.getLogger();
   private final AtomicBoolean field_10052 = new AtomicBoolean();
   private final class_2696<class_9465> field_10049;
   private final class_9820 field_10047;
   private final Map<class_2034, class_9443> field_10048 = Maps.newLinkedHashMap();

   public class_1983(File var1, boolean var2, String var3) {
      this.field_10047 = new class_9820(var1, var2);
      this.field_10049 = new class_2696<class_9465>(new class_5943(class_2632.values().length), Util.getIoWorkerExecutor(), "IOWorker-" + var3);
   }

   public CompletableFuture<Void> method_9152(class_2034 var1, CompoundNBT var2) {
      return this.method_9153(() -> {
         class_9443 var5 = this.field_10048.computeIfAbsent(var1, var1xx -> new class_9443(var2));
         class_9443.method_43680(var5, var2);
         return Either.left(class_9443.method_43678(var5));
      }).<Void>thenCompose(Function.<CompletionStage<Void>>identity());
   }

   @Nullable
   public CompoundNBT method_9148(class_2034 var1) throws IOException {
      CompletableFuture var4 = this.method_9153(() -> {
         class_9443 var4x = this.field_10048.get(var1);
         if (var4x != null) {
            return Either.left(class_9443.method_43677(var4x));
         } else {
            try {
               CompoundNBT var5 = this.field_10047.method_45249(var1);
               return Either.left(var5);
            } catch (Exception var6x) {
               field_10051.warn("Failed to read chunk {}", var1, var6x);
               return Either.right(var6x);
            }
         }
      });

      try {
         return (CompoundNBT)var4.join();
      } catch (CompletionException var6) {
         if (var6.getCause() instanceof IOException) {
            throw (IOException)var6.getCause();
         } else {
            throw var6;
         }
      }
   }

   public CompletableFuture<Void> method_9154() {
      CompletableFuture var3 = this.method_9153(
            () -> Either.left(
                  CompletableFuture.allOf(
                     this.field_10048
                        .values()
                        .stream()
                        .<CompletableFuture>map(var0 -> class_9443.method_43678(var0))
                        .<CompletableFuture<?>>toArray(CompletableFuture[]::new)
                  )
               )
         )
         .thenCompose(Function.identity());
      return var3.<Void>thenCompose(var1 -> this.<Void>method_9153(() -> {
            try {
               this.field_10047.method_45247();
               return Either.left((Void)null);
            } catch (Exception var4) {
               field_10051.warn("Failed to synchronized chunks", var4);
               return Either.right(var4);
            }
         }));
   }

   private <T> CompletableFuture<T> method_9153(Supplier<Either<T, Exception>> var1) {
      return this.field_10049.<T>method_40494(var2 -> new class_9465(class_2632.field_12967.ordinal(), () -> {
            if (!this.field_10052.get()) {
               var2.method_40495(var1.get());
            }

            this.method_9147();
         }));
   }

   private void method_9151() {
      Iterator var3 = this.field_10048.entrySet().iterator();
      if (var3.hasNext()) {
         Entry var4 = (Entry)var3.next();
         var3.remove();
         this.method_9149((class_2034)var4.getKey(), (class_9443)var4.getValue());
         this.method_9147();
      }
   }

   private void method_9147() {
      this.field_10049.method_40495(new class_9465(class_2632.field_12964.ordinal(), this::method_9151));
   }

   private void method_9149(class_2034 var1, class_9443 var2) {
      try {
         this.field_10047.method_45250(var1, class_9443.method_43677(var2));
         class_9443.method_43678(var2).complete((Void)null);
      } catch (Exception var6) {
         field_10051.error("Failed to store chunk {}", var1, var6);
         class_9443.method_43678(var2).completeExceptionally(var6);
      }
   }

   @Override
   public void close() throws IOException {
      if (this.field_10052.compareAndSet(false, true)) {
         CompletableFuture var3 = this.field_10049
            .method_40493(var0 -> new class_9465(class_2632.field_12967.ordinal(), () -> var0.method_40495(Unit.INSTANCE)));

         try {
            var3.join();
         } catch (CompletionException var6) {
            if (var6.getCause() instanceof IOException) {
               throw (IOException)var6.getCause();
            }

            throw var6;
         }

         this.field_10049.close();
         this.field_10048.forEach(this::method_9149);
         this.field_10048.clear();

         try {
            this.field_10047.close();
         } catch (Exception var5) {
            field_10051.error("Failed to close storage", var5);
         }
      }
   }
}
