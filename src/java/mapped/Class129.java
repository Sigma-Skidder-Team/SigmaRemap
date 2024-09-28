package mapped;

import com.google.common.collect.ImmutableSet;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.state.Property;

import java.util.Set;

public class Class129 extends Class128 {
   private final Block field443;
   private final Set<Property<?>> field444;

   public Class129(ILootCondition[] var1, Block var2, Set<Property<?>> var3) {
      super(var1);
      this.field443 = var2;
      this.field444 = var3;
   }

   @Override
   public LootFunctionType getFunctionType() {
      return LootFunctionManager.COPY_STATE;
   }

   @Override
   public Set<Class9821<?>> method355() {
      return ImmutableSet.of(Class9525.field44336);
   }

   @Override
   public ItemStack method371(ItemStack var1, LootContext var2) {
      BlockState var5 = var2.<BlockState>method26081(Class9525.field44336);
      if (var5 != null) {
         CompoundNBT var6 = var1.getOrCreateTag();
         CompoundNBT var7;
         if (!var6.contains("BlockStateTag", 10)) {
            var7 = new CompoundNBT();
            var6.put("BlockStateTag", var7);
         } else {
            var7 = var6.getCompound("BlockStateTag");
         }

         this.field444.stream().filter(var5::method23462).forEach(var2x -> var7.method109(var2x.method30472(), method374(var5, (Property<?>)var2x)));
      }

      return var1;
   }

   public static Class5880 method373(Block var0) {
      return new Class5880(var0);
   }

   private static <T extends Comparable<T>> String method374(BlockState var0, Property<T> var1) {
      Comparable var4 = var0.get(var1);
      return var1.method30475((T)var4);
   }

   // $VF: synthetic method
   public static Block method376(Class129 var0) {
      return var0.field443;
   }

   // $VF: synthetic method
   public static Set<Property<?>> method377(Class129 var0) {
      return var0.field444;
   }
}
