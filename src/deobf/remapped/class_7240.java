package remapped;

import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;

public class class_7240 extends class_4117 {
   private final class_8845 field_37139;

   public class_7240(class_3511 var1, double var2, class_8845 var4) {
      this(var1, (class_2034)null, var2, var4);
   }

   public class_7240(class_3511 var1, class_2034 var2, double var3, class_8845 var5) {
      super(var1, var2, var3);
      this.field_37141 = var1;
      this.field_37139 = var5;
   }

   @Override
   public CompletableFuture<class_8490> method_19129(class_2848 var1) {
      if (!this.field_20070.get()) {
         if (this.field_37141.method_16154()) {
            if (!this.field_20070.get()) {
               Vector3d var4 = this.field_37141.field_17225.method_30747();
               float var5 = (float)var4.field_7336;
               float var6 = (float)var4.field_7333;
               float var7 = (float)var4.field_7334;
               class_7649 var8 = class_8845.method_40694(this.field_37139);
               if (var8 != null && class_8845.method_40687(this.field_37139).contains(RenderLayer.method_16762())) {
                  class_9633 var9 = var1.method_12956(RenderLayer.method_16762());
                  class_3511.method_16148(this.field_37141, var9);
                  var9.method_44477(var8);
                  var9.method_44482(
                     (float)class_3511.method_16145(this.field_37141) + var5 - (float)class_3511.method_16179(this.field_37141).method_12173(),
                     (float)class_3511.method_16144(this.field_37141) + var6 - (float)class_3511.method_16179(this.field_37141).method_12165(),
                     (float)class_3511.method_16153(this.field_37141) + var7 - (float)class_3511.method_16179(this.field_37141).method_12185()
                  );
                  class_8845.method_40692(this.field_37139, var9.method_44484());
                  var9.method_44487();
                  if (!this.field_20070.get()) {
                     CompletableFuture var10 = this.field_37141
                        .field_17225
                        .method_30744(var1.method_12956(RenderLayer.method_16762()), this.field_37141.method_16180(RenderLayer.method_16762()))
                        .<class_8490>thenApply(var0 -> class_8490.field_43499);
                     return var10.<class_8490>handle((var1x, var2) -> {
                        if (var2 != null && !(var2 instanceof CancellationException) && !(var2 instanceof InterruptedException)) {
                           MinecraftClient.getInstance().method_8555(class_159.method_643(var2, "Rendering chunk"));
                        }

                        return !this.field_20070.get() ? class_8490.field_43498 : class_8490.field_43499;
                     });
                  } else {
                     return CompletableFuture.<class_8490>completedFuture(class_8490.field_43499);
                  }
               } else {
                  return CompletableFuture.<class_8490>completedFuture(class_8490.field_43499);
               }
            } else {
               return CompletableFuture.<class_8490>completedFuture(class_8490.field_43499);
            }
         } else {
            this.field_20070.set(true);
            return CompletableFuture.<class_8490>completedFuture(class_8490.field_43499);
         }
      } else {
         return CompletableFuture.<class_8490>completedFuture(class_8490.field_43499);
      }
   }

   @Override
   public void method_19131() {
      this.field_20070.set(true);
   }
}
