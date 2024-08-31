package mapped;

import net.minecraft.nbt.CompoundNBT;

import java.util.concurrent.CompletableFuture;

public class Class9713 {
   public CompoundNBT field45380;
   private final CompletableFuture<Void> field45381 = new CompletableFuture<Void>();

   public Class9713(CompoundNBT var1) {
      this.field45380 = var1;
   }

   // $VF: synthetic method
   public static CompoundNBT method38053(Class9713 var0) {
      return var0.field45380;
   }

   // $VF: synthetic method
   public static CompletableFuture<Void> method38054(Class9713 var0) {
      return var0.field45381;
   }
}
