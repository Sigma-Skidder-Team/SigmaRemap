package remapped;

import java.util.Optional;

public class class_3771 extends class_5348 {
   private final Optional<Identifier> field_18429;
   private final boolean field_18428;
   private final boolean field_18427;

   public class_3771(Identifier var1, boolean var2, boolean var3) {
      super("texture", () -> {
         RenderSystem.method_16432();
         TextureManager var5 = MinecraftClient.getInstance().getTextureManager();
         var5.bindTexture(var1);
         var5.method_35675().method_37049(var2, var3);
      }, () -> {
      });
      this.field_18429 = Optional.<Identifier>of(var1);
      this.field_18428 = var2;
      this.field_18427 = var3;
   }

   public class_3771() {
      super("texture", () -> RenderSystem.method_16354(), () -> RenderSystem.method_16432());
      this.field_18429 = Optional.<Identifier>empty();
      this.field_18428 = false;
      this.field_18427 = false;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         class_3771 var4 = (class_3771)var1;
         return this.field_18429.equals(var4.field_18429) && this.field_18428 == var4.field_18428 && this.field_18427 == var4.field_18427;
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.field_18429.hashCode();
   }

   @Override
   public String toString() {
      return this.field_27283 + '[' + this.field_18429 + "(blur=" + this.field_18428 + ", mipmap=" + this.field_18427 + ")]";
   }

   public Optional<Identifier> method_17452() {
      return this.field_18429;
   }

   public boolean method_17453() {
      return this.field_18428;
   }

   public boolean method_17451() {
      return this.field_18427;
   }
}
