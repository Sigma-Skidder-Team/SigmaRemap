package mapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.ITextComponent$Serializer;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Set;
import java.util.function.UnaryOperator;

public class Class137 extends Class128 {
   private final boolean field460;
   private final List<ITextComponent> field461;
   private final Class2063 field462;

   public Class137(ILootCondition[] var1, boolean var2, List<ITextComponent> var3, Class2063 var4) {
      super(var1);
      this.field460 = var2;
      this.field461 = ImmutableList.copyOf(var3);
      this.field462 = var4;
   }

   @Override
   public LootFunctionType getFunctionType() {
      return LootFunctionManager.SET_LORE;
   }

   @Override
   public Set<Class9821<?>> method355() {
      return this.field462 == null ? ImmutableSet.of() : ImmutableSet.of(this.field462.method8717());
   }

   @Override
   public ItemStack method371(ItemStack var1, LootContext var2) {
      ListNBT var5 = this.method402(var1, !this.field461.isEmpty());
      if (var5 != null) {
         if (this.field460) {
            var5.clear();
         }

         UnaryOperator<ITextComponent> var6 = Class132.method384(var2, this.field462);
         this.field461.stream().map(var6).map(ITextComponent$Serializer::toJson).map(StringNBT::valueOf).forEach(var5::add);
      }

      return var1;
   }

   @Nullable
   private ListNBT method402(ItemStack var1, boolean var2) {
      CompoundNBT var5;
      if (!var1.method32141()) {
         if (!var2) {
            return null;
         }

         var5 = new CompoundNBT();
         var1.setTag(var5);
      } else {
         var5 = var1.getTag();
      }

      CompoundNBT var6;
      if (!var5.contains("display", 10)) {
         if (!var2) {
            return null;
         }

         var6 = new CompoundNBT();
         var5.put("display", var6);
      } else {
         var6 = var5.getCompound("display");
      }

      if (!var6.contains("Lore", 9)) {
         if (!var2) {
            return null;
         } else {
            ListNBT var7 = new ListNBT();
            var6.put("Lore", var7);
            return var7;
         }
      } else {
         return var6.method131("Lore", 8);
      }
   }

   // $VF: synthetic method
   public static boolean method403(Class137 var0) {
      return var0.field460;
   }

   // $VF: synthetic method
   public static List<ITextComponent> method404(Class137 var0) {
      return var0.field461;
   }

   // $VF: synthetic method
   public static Class2063 method405(Class137 var0) {
      return var0.field462;
   }
}
