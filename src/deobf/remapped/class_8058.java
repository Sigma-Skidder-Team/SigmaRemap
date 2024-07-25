package remapped;

import com.google.common.collect.ImmutableSet;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Set;
import java.util.function.UnaryOperator;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_8058 extends class_5837 {
   private static final Logger field_41254 = LogManager.getLogger();
   private final ITextComponent field_41253;
   private final class_5848 field_41255;

   private class_8058(class_7279[] var1, ITextComponent var2, class_5848 var3) {
      super(var1);
      this.field_41253 = var2;
      this.field_41255 = var3;
   }

   @Override
   public class_1404 method_13321() {
      return class_5116.field_26386;
   }

   @Override
   public Set<class_9791<?>> method_12681() {
      return this.field_41255 == null ? ImmutableSet.of() : ImmutableSet.of(this.field_41255.method_26666());
   }

   public static UnaryOperator<ITextComponent> method_36559(class_2792 var0, class_5848 var1) {
      if (var1 != null) {
         Entity var4 = var0.<Entity>method_12698(var1.method_26666());
         if (var4 != null) {
            class_9155 var5 = var4.method_37320().method_42194(2);
            return var2 -> {
               try {
                  return TextComponentUtils.func_240645_a_(var5, var2, var4, 0);
               } catch (CommandSyntaxException var6) {
                  field_41254.warn("Failed to resolve text component", var6);
                  return var2;
               }
            };
         }
      }

      return var0x -> var0x;
   }

   @Override
   public ItemStack method_26627(ItemStack var1, class_2792 var2) {
      if (this.field_41253 != null) {
         var1.method_28032(method_36559(var2, this.field_41255).apply(this.field_41253));
      }

      return var1;
   }
}
