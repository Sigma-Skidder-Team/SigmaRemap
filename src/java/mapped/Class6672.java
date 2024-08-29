package mapped;

import com.google.common.collect.Maps;
import net.minecraft.client.util.Util;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

public class Class6672 {
   private static String[] field29256;
   private final IResourceManager field29257;
   private final Map<ResourceLocation, CompletableFuture<Class9216>> field29258 = Maps.newHashMap();

   public Class6672(IResourceManager var1) {
      this.field29257 = var1;
   }

   public CompletableFuture<Class9216> method20333(ResourceLocation var1) {
      return this.field29258.computeIfAbsent(var1, var1x -> CompletableFuture.<Class9216>supplyAsync(() -> {
            try (
               Class1783 var4 = this.field29257.method580(var1x);
               InputStream var6 = var4.method7763();
               Class1799 var8 = new Class1799(var6);
            ) {
               ByteBuffer var10 = var8.method7872();
               return new Class9216(var10, var8.method7865());
            } catch (IOException var64) {
               throw new CompletionException(var64);
            }
         }, Util.getServerExecutor()));
   }

   public CompletableFuture<Class1798> method20334(ResourceLocation var1, boolean var2) {
      return CompletableFuture.<Class1798>supplyAsync(() -> {
         try {
            Class1783 var5 = this.field29257.method580(var1);
            InputStream var6 = var5.method7763();
            return (Class1798)(var2 ? new Class1800(Class1799::new, var6) : new Class1799(var6));
         } catch (IOException var7) {
            throw new CompletionException(var7);
         }
      }, Util.getServerExecutor());
   }

   public void method20335() {
      this.field29258.values().forEach(var0 -> var0.thenAccept(Class9216::method34533));
      this.field29258.clear();
   }

   public CompletableFuture<?> method20336(Collection<Class6647> var1) {
      return CompletableFuture.allOf(
         var1.stream()
            .<CompletableFuture<Class9216>>map(var1x -> this.method20333(var1x.method20292()))
            .<CompletableFuture<?>>toArray(CompletableFuture[]::new)
      );
   }
}
