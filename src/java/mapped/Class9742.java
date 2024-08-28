package mapped;

import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;

public class Class9742 {
   private static String[] field45486;
   private final Packet<?> field45487;
   private final GenericFutureListener<? extends Future<? super Void>> field45488;

   public Class9742(Packet<?> var1, GenericFutureListener<? extends Future<? super Void>> var2) {
      this.field45487 = var1;
      this.field45488 = var2;
   }

   // $VF: synthetic method
   public static Packet method38190(Class9742 var0) {
      return var0.field45487;
   }

   // $VF: synthetic method
   public static GenericFutureListener method38191(Class9742 var0) {
      return var0.field45488;
   }
}
