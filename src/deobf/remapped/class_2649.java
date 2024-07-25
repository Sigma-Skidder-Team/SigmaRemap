package remapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Set;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.ITextComponent$class_40;

public class class_2649 extends class_5837 {
   private final boolean field_13042;
   private final List<ITextComponent> field_13043;
   private final class_5848 field_13044;

   public class_2649(class_7279[] var1, boolean var2, List<ITextComponent> var3, class_5848 var4) {
      super(var1);
      this.field_13042 = var2;
      this.field_13043 = ImmutableList.copyOf(var3);
      this.field_13044 = var4;
   }

   @Override
   public class_1404 method_13321() {
      return class_5116.field_26390;
   }

   @Override
   public Set<class_9791<?>> method_12681() {
      return this.field_13044 == null ? ImmutableSet.of() : ImmutableSet.of(this.field_13044.method_26666());
   }

   @Override
   public ItemStack method_26627(ItemStack var1, class_2792 var2) {
      class_3416 var5 = this.method_11960(var1, !this.field_13043.isEmpty());
      if (var5 != null) {
         if (this.field_13042) {
            var5.clear();
         }

         UnaryOperator var6 = class_8058.method_36559(var2, this.field_13044);
         this.field_13043
            .stream()
            .<ITextComponent>map(var6)
            .<String>map(ITextComponent$class_40::toJson)
            .<class_473>map(class_473::method_2261)
            .forEach(var5::add);
      }

      return var1;
   }

   @Nullable
   private class_3416 method_11960(ItemStack var1, boolean var2) {
      CompoundNBT var5;
      if (!var1.method_28002()) {
         if (!var2) {
            return null;
         }

         var5 = new CompoundNBT();
         var1.method_27965(var5);
      } else {
         var5 = var1.method_27990();
      }

      CompoundNBT var6;
      if (!var5.method_25939("display", 10)) {
         if (!var2) {
            return null;
         }

         var6 = new CompoundNBT();
         var5.method_25946("display", var6);
      } else {
         var6 = var5.method_25937("display");
      }

      if (!var6.method_25939("Lore", 9)) {
         if (!var2) {
            return null;
         } else {
            class_3416 var7 = new class_3416();
            var6.method_25946("Lore", var7);
            return var7;
         }
      } else {
         return var6.method_25927("Lore", 8);
      }
   }
}
