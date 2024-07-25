package remapped;

import com.google.common.collect.Sets;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class class_9779 {
   private static String[] field_49637;
   private final Set<class_9046> field_49639 = Sets.newIdentityHashSet();
   private final class_3301 field_49636;
   private final Executor field_49638;

   public class_9779(class_3301 var1, Executor var2) {
      this.field_49636 = var1;
      this.field_49638 = var2;
   }

   public CompletableFuture<class_9046> method_45143(class_8959 var1) {
      CompletableFuture var4 = new CompletableFuture();
      this.field_49638.execute(() -> {
         class_4850 var5 = this.field_49636.method_15146(var1);
         if (var5 == null) {
            var4.complete((class_9046)null);
         } else {
            class_9046 var6 = new class_9046(this, var5);
            this.field_49639.add(var6);
            var4.complete(var6);
         }
      });
      return var4;
   }

   public void method_45142(Consumer<Stream<class_4850>> var1) {
      this.field_49638.execute(() -> var1.accept(this.field_49639.stream().<class_4850>map(var0 -> class_9046.method_41527(var0)).filter(Objects::nonNull)));
   }

   public void method_45146() {
      this.field_49638.execute(() -> {
         Iterator var3 = this.field_49639.iterator();

         while (var3.hasNext()) {
            class_9046 var4 = (class_9046)var3.next();
            class_9046.method_41527(var4).method_22327();
            if (class_9046.method_41527(var4).method_22346()) {
               var4.method_41526();
               var3.remove();
            }
         }
      });
   }

   public void method_45141() {
      this.field_49639.forEach(class_9046::method_41526);
      this.field_49639.clear();
   }
}
