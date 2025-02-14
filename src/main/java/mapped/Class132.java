package mapped;

import com.google.common.collect.ImmutableSet;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.command.CommandSource;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Set;
import java.util.function.UnaryOperator;

public class Class132 extends Class128 {
   private static final Logger field449 = LogManager.getLogger();
   private final ITextComponent field450;
   private final Class2063 field451;

   public Class132(ILootCondition[] var1, ITextComponent var2, Class2063 var3) {
      super(var1);
      this.field450 = var2;
      this.field451 = var3;
   }

   @Override
   public LootFunctionType getFunctionType() {
      return LootFunctionManager.SET_NAME;
   }

   @Override
   public Set<Class9821<?>> method355() {
      return this.field451 == null ? ImmutableSet.of() : ImmutableSet.of(this.field451.method8717());
   }

   public static UnaryOperator<ITextComponent> method384(LootContext var0, Class2063 var1) {
      if (var1 != null) {
         Entity var4 = var0.method26081(var1.method8717());
         if (var4 != null) {
            CommandSource var5 = var4.getCommandSource().method20163(2);
            return var2 -> {
               try {
                  return TextComponentUtils.func_240645_a_(var5, var2, var4, 0);
               } catch (CommandSyntaxException var6) {
                  field449.warn("Failed to resolve text component", var6);
                  return var2;
               }
            };
         }
      }

      return var0x -> var0x;
   }

   @Override
   public ItemStack method371(ItemStack var1, LootContext var2) {
      if (this.field450 != null) {
         var1.method32150(method384(var2, this.field451).apply(this.field450));
      }

      return var1;
   }

   // $VF: synthetic method
   public static ITextComponent method387(Class132 var0) {
      return var0.field450;
   }

   // $VF: synthetic method
   public static Class2063 method388(Class132 var0) {
      return var0.field451;
   }
}
