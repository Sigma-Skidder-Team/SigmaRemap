package mapped;

import net.minecraft.client.Minecraft;
import net.minecraft.util.math.vector.Vector3d;

import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;

public class Class2010 extends Class2009 {
   private final Class7457 field13079;
   public final Class8066 field13078;

   public Class2010(Class8066 var1, double var2, Class7457 var4) {
      this(var1, (Class7481)null, var2, var4);
   }

   public Class2010(Class8066 var1, Class7481 var2, double var3, Class7457 var5) {
      super(var1, var2, var3);
      this.field13078 = var1;
      this.field13079 = var5;
   }

   @Override
   public CompletableFuture<Class2046> method8527(Class7828 var1) {
      if (!this.field13076.get()) {
         if (this.field13078.method27709()) {
            if (!this.field13076.get()) {
               Vector3d var4 = this.field13078.field34637.method33322();
               float var5 = (float)var4.x;
               float var6 = (float)var4.y;
               float var7 = (float)var4.z;
               Class9244 var8 = Class7457.method24122(this.field13079);
               if (var8 != null && Class7457.method24118(this.field13079).contains(RenderType.method14304())) {
                  BufferBuilder var9 = var1.method26203(RenderType.method14304());
                  Class8066.method27758(this.field13078, var9);
                  var9.method17062(var8);
                  var9.method17058(
                     (float)Class8066.method27761(this.field13078) + var5 - (float)Class8066.method27754(this.field13078).getX(),
                     (float)Class8066.method27762(this.field13078) + var6 - (float)Class8066.method27754(this.field13078).getY(),
                     (float)Class8066.method27763(this.field13078) + var7 - (float)Class8066.method27754(this.field13078).getZ()
                  );
                  Class7457.method24119(this.field13079, var9.method17060());
                  var9.finishDrawing();
                  if (!this.field13076.get()) {
                     CompletableFuture<Class2046> var10 = this.field13078
                        .field34637
                        .method33327(var1.method26203(RenderType.method14304()), this.field13078.method27711(RenderType.method14304()))
                        .<Class2046>thenApply(var0 -> Class2046.field13359);
                     return var10.handle((var1x, var2) -> {
                        if (var2 != null && !(var2 instanceof CancellationException) && !(var2 instanceof InterruptedException)) {
                           Minecraft.getInstance().crashed(CrashReport.makeCrashReport(var2, "Rendering chunk"));
                        }

                        return !this.field13076.get() ? Class2046.field13358 : Class2046.field13359;
                     });
                  } else {
                     return CompletableFuture.<Class2046>completedFuture(Class2046.field13359);
                  }
               } else {
                  return CompletableFuture.<Class2046>completedFuture(Class2046.field13359);
               }
            } else {
               return CompletableFuture.<Class2046>completedFuture(Class2046.field13359);
            }
         } else {
            this.field13076.set(true);
            return CompletableFuture.<Class2046>completedFuture(Class2046.field13359);
         }
      } else {
         return CompletableFuture.<Class2046>completedFuture(Class2046.field13359);
      }
   }

   @Override
   public void method8528() {
      this.field13076.set(true);
   }
}
