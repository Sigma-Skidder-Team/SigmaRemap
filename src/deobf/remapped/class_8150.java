package remapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;

public final class class_8150 {
   public static final Codec<class_8150> field_41784 = RecordCodecBuilder.create(
      var0 -> var0.group(
               World.field_33043.fieldOf("dimension").forGetter(class_8150::method_37408),
               BlockPos.field_7305.fieldOf("pos").forGetter(class_8150::method_37409)
            )
            .apply(var0, class_8150::method_37410)
   );
   private final class_5621<World> field_41785;
   private final BlockPos field_41786;

   private class_8150(class_5621<World> var1, BlockPos var2) {
      this.field_41785 = var1;
      this.field_41786 = var2;
   }

   public static class_8150 method_37410(class_5621<World> var0, BlockPos var1) {
      return new class_8150(var0, var1);
   }

   public class_5621<World> method_37408() {
      return this.field_41785;
   }

   public BlockPos method_37409() {
      return this.field_41786;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         class_8150 var4 = (class_8150)var1;
         return Objects.equals(this.field_41785, var4.field_41785) && Objects.equals(this.field_41786, var4.field_41786);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.field_41785, this.field_41786);
   }

   @Override
   public String toString() {
      return this.field_41785.toString() + " " + this.field_41786;
   }
}
