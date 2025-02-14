package mapped;

import com.google.common.collect.Sets;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Class9818 {
   private static String[] field45873;
   private final Set<Class9617> field45874 = Sets.newIdentityHashSet();
   private final Class7993 field45875;
   private final Executor field45876;

   public Class9818(Class7993 var1, Executor var2) {
      this.field45875 = var1;
      this.field45876 = var2;
   }

   public CompletableFuture<Class9617> method38753(Class2149 var1) {
      CompletableFuture var4 = new CompletableFuture();
      this.field45876.execute(() -> {
         Class8506 var5 = this.field45875.method27288(var1);
         if (var5 == null) {
            var4.complete((Class9617)null);
         } else {
            Class9617 var6 = new Class9617(this, var5);
            this.field45874.add(var6);
            var4.complete(var6);
         }
      });
      return var4;
   }

   public void method38754(Consumer<Stream<Class8506>> var1) {
      this.field45876.execute(() -> var1.accept(this.field45874.stream().<Class8506>map(var0 -> Class9617.method37441(var0)).filter(Objects::nonNull)));
   }

   public void method38755() {
      this.field45876.execute(() -> {
         Iterator var3 = this.field45874.iterator();

         while (var3.hasNext()) {
            Class9617 var4 = (Class9617)var3.next();
            Class9617.method37441(var4).method30131();
            if (Class9617.method37441(var4).method30119()) {
               var4.method37439();
               var3.remove();
            }
         }
      });
   }

   public void method38756() {
      this.field45874.forEach(Class9617::method37439);
      this.field45874.clear();
   }

   // $VF: synthetic method
   public static Executor method38761(Class9818 var0) {
      return var0.field45876;
   }

   // $VF: synthetic method
   public static Class7993 method38762(Class9818 var0) {
      return var0.field45875;
   }
}
