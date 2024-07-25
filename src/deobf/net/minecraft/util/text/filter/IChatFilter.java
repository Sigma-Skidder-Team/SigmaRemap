package net.minecraft.util.text.filter;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public interface IChatFilter {
   void func_244800_a();

   void func_244434_b();

   CompletableFuture<Optional<String>> func_244432_a(String var1);

   CompletableFuture<Optional<List<String>>> func_244433_a(List<String> var1);
}
