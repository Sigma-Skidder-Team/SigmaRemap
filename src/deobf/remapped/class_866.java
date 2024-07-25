package remapped;

import com.google.common.collect.Maps;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

public class class_866 {
   private static String[] field_4494;
   private final class_7832 field_4493;
   private final Map<Identifier, CompletableFuture<class_7493>> field_4492 = Maps.newHashMap();

   public class_866(class_7832 var1) {
      this.field_4493 = var1;
   }

   public CompletableFuture<class_7493> method_3748(Identifier var1) {
      return this.field_4492.computeIfAbsent(var1, var1x -> CompletableFuture.<class_7493>supplyAsync(() -> {
            try (
               class_4038 var4 = this.field_4493.method_35458(var1x);
               InputStream var6 = var4.method_18576();
               class_5934 var8 = new class_5934(var6);
            ) {
               ByteBuffer var10 = var8.method_27130();
               return new class_7493(var10, var8.method_11855());
            } catch (IOException var64) {
               throw new CompletionException(var64);
            }
         }, Util.getMainWorkerExecutor()));
   }

   public CompletableFuture<class_2613> method_3747(Identifier var1, boolean var2) {
      return CompletableFuture.<class_2613>supplyAsync(() -> {
         try {
            class_4038 var5 = this.field_4493.method_35458(var1);
            InputStream var6 = var5.method_18576();
            return (class_2613)(var2 ? new class_7638(class_5934::new, var6) : new class_5934(var6));
         } catch (IOException var7) {
            throw new CompletionException(var7);
         }
      }, Util.getMainWorkerExecutor());
   }

   public void method_3751() {
      this.field_4492.values().forEach(var0 -> var0.thenAccept(class_7493::method_34068));
      this.field_4492.clear();
   }

   public CompletableFuture<?> method_3750(Collection<class_2049> var1) {
      return CompletableFuture.allOf(
         var1.stream()
            .<CompletableFuture<class_7493>>map(var1x -> this.method_3748(var1x.method_9577()))
            .<CompletableFuture<?>>toArray(CompletableFuture[]::new)
      );
   }
}
