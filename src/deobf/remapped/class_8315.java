package remapped;

import java.util.Objects;
import java.util.OptionalDouble;

public class class_8315 extends class_5348 {
   private final OptionalDouble field_42576;

   public class_8315(OptionalDouble var1) {
      super("line_width", () -> {
         if (!Objects.equals(var1, OptionalDouble.of(1.0))) {
            if (!var1.isPresent()) {
               RenderSystem.method_16484(Math.max(2.5F, (float) MinecraftClient.getInstance().getMainWindow().method_43178() / 1920.0F * 2.5F));
            } else {
               RenderSystem.method_16484((float)var1.getAsDouble());
            }
         }
      }, () -> {
         if (!Objects.equals(var1, OptionalDouble.of(1.0))) {
            RenderSystem.method_16484(1.0F);
         }
      });
      this.field_42576 = var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 != null && this.getClass() == var1.getClass()) {
            return super.equals(var1) ? Objects.equals(this.field_42576, ((class_8315)var1).field_42576) : false;
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      return class_5129.method_23522(super.hashCode(), this.field_42576);
   }

   @Override
   public String toString() {
      return this.field_27283 + '[' + (!this.field_42576.isPresent() ? "window_scale" : this.field_42576.getAsDouble()) + ']';
   }
}
