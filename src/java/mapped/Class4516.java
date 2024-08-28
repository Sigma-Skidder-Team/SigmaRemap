package mapped;

import java.util.Objects;
import java.util.OptionalDouble;

public class Class4516 extends Class4510 {
   private final OptionalDouble field21788;

   public Class4516(OptionalDouble var1) {
      super("line_width", () -> {
         if (!Objects.equals(var1, OptionalDouble.of(1.0))) {
            if (!var1.isPresent()) {
               RenderSystem.method27893(Math.max(2.5F, (float) Minecraft.getInstance().method1580().getFramebufferWidth() / 1920.0F * 2.5F));
            } else {
               RenderSystem.method27893((float)var1.getAsDouble());
            }
         }
      }, () -> {
         if (!Objects.equals(var1, OptionalDouble.of(1.0))) {
            RenderSystem.method27893(1.0F);
         }
      });
      this.field21788 = var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 != null && this.getClass() == var1.getClass()) {
            return super.equals(var1) ? Objects.equals(this.field21788, ((Class4516)var1).field21788) : false;
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      return Class8589.method30729(super.hashCode(), this.field21788);
   }

   @Override
   public String toString() {
      return this.field21734 + '[' + (!this.field21788.isPresent() ? "window_scale" : this.field21788.getAsDouble()) + ']';
   }
}
