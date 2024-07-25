package remapped;

import com.google.common.collect.Multimap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;

public class class_4428 implements class_2231 {
   private final class_9639<class_6414> field_21633 = new class_9639<class_6414>(class_8669.field_44462::method_39794, "tags/blocks", "block");
   private final class_9639<class_2451> field_21630 = new class_9639<class_2451>(class_8669.field_44382::method_39794, "tags/items", "item");
   private final class_9639<class_2340> field_21634 = new class_9639<class_2340>(class_8669.field_44447::method_39794, "tags/fluids", "fluid");
   private final class_9639<EntityType<?>> field_21632 = new class_9639<EntityType<?>>(class_8669.field_44400::method_39794, "tags/entity_types", "entity_type");
   private ITagCollectionSupplier field_21631 = ITagCollectionSupplier.field_32865;

   public ITagCollectionSupplier method_20577() {
      return this.field_21631;
   }

   @Override
   public CompletableFuture<Void> method_10277(class_6895 var1, class_7832 var2, class_3492 var3, class_3492 var4, Executor var5, Executor var6) {
      CompletableFuture var9 = this.field_21633.method_44502(var2, var5);
      CompletableFuture var10 = this.field_21630.method_44502(var2, var5);
      CompletableFuture var11 = this.field_21634.method_44502(var2, var5);
      CompletableFuture var12 = this.field_21632.method_44502(var2, var5);
      return CompletableFuture.allOf(var9, var10, var11, var12)
         .<Void>thenCompose(var1::method_31587)
         .thenAcceptAsync(
            var5x -> {
               ITagCollection var8 = this.field_21633.method_44503((Map<Identifier, class_1079>)var9.join());
               ITagCollection var9x = this.field_21630.method_44503((Map<Identifier, class_1079>)var10.join());
               ITagCollection var10x = this.field_21634.method_44503((Map<Identifier, class_1079>)var11.join());
               ITagCollection var11x = this.field_21632.method_44503((Map<Identifier, class_1079>)var12.join());
               ITagCollectionSupplier var12x = ITagCollectionSupplier.method_29388(var8, var9x, var10x, var11x);
               Multimap var13 = TagRegistryManager.method_20601(var12x);
               if (var13.isEmpty()) {
                  class_8410.method_38722(var12x);
                  this.field_21631 = var12x;
               } else {
                  throw new IllegalStateException(
                     "Missing required tags: "
                        + var13.entries().stream().<CharSequence>map(var0 -> var0.getKey() + ":" + var0.getValue()).sorted().collect(Collectors.joining(","))
                  );
               }
            },
            var6
         );
   }
}
