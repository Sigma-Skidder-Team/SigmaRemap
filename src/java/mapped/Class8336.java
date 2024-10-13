package mapped;

import net.minecraft.util.Unit;

import java.util.concurrent.CompletableFuture;

public class Class8336 implements Class8335 {
   private static String[] field35840;
   private final SimpleReloadableResourceManager.FailedPackException field35841;
   private final CompletableFuture<Unit> field35842;

   public Class8336(SimpleReloadableResourceManager.FailedPackException var1) {
      this.field35841 = var1;
      this.field35842 = new CompletableFuture<Unit>();
      this.field35842.completeExceptionally(var1);
   }

   @Override
   public CompletableFuture<Unit> method29223() {
      return this.field35842;
   }

   @Override
   public float method29224() {
      return 0.0F;
   }

   @Override
   public boolean method29225() {
      return false;
   }

   @Override
   public boolean method29226() {
      return true;
   }

   @Override
   public void method29227() {
      throw this.field35841;
   }
}
