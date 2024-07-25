package remapped;

import java.util.concurrent.CompletableFuture;

public class class_4817 implements class_4302 {
   private static String[] field_24085;
   private final class_1782 field_24086;
   private final CompletableFuture<Unit> field_24087;

   public class_4817(class_1782 var1) {
      this.field_24086 = var1;
      this.field_24087 = new CompletableFuture<Unit>();
      this.field_24087.completeExceptionally(var1);
   }

   public CompletableFuture<Unit> 㞈刃붃핇낛佉() {
      return this.field_24087;
   }

   public float 圭甐贞騜ࢹⰛ() {
      return 0.0F;
   }

   public boolean 䬹쥦汌哝阢䄟() {
      return false;
   }

   public boolean 属杭硙綋嶗汌() {
      return true;
   }

   public void ᙽ㞈쿨鷏콗陂() {
      throw this.field_24086;
   }
}
