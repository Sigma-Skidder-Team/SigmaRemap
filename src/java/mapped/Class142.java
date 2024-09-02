package mapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.TileEntity;

import java.util.List;
import java.util.Set;
import java.util.function.Function;

public class Class142 extends Class128 {
   private final Class2343 field479;
   private final List<Class9603> field480;
   private static final Function<Entity, Class30> field481 = Class8811::method31813;
   private static final Function<TileEntity, Class30> field482 = var0 -> var0.write(new CompoundNBT());

   public Class142(ILootCondition[] var1, Class2343 var2, List<Class9603> var3) {
      super(var1);
      this.field479 = var2;
      this.field480 = ImmutableList.copyOf(var3);
   }

   @Override
   public LootFunctionType getFunctionType() {
      return LootFunctionManager.COPY_NBT;
   }

   private static Class9670 method430(String var0) {
      try {
         return new Class8320().parse(new StringReader(var0));
      } catch (CommandSyntaxException var4) {
         throw new IllegalArgumentException("Failed to parse path " + var0, var4);
      }
   }

   @Override
   public Set<Class9821<?>> method355() {
      return ImmutableSet.of(this.field479.field16023);
   }

   @Override
   public ItemStack method371(ItemStack var1, LootContext var2) {
      Class30 var5 = this.field479.field16024.apply(var2);
      if (var5 != null) {
         this.field480.forEach(var2x -> var2x.method37313(var1::getOrCreateTag, var5));
      }

      return var1;
   }

   public static Class5877 method431(Class2343 var0) {
      return new Class5877(var0);
   }

   // $VF: synthetic method
   public static Class9670 method434(String var0) {
      return method430(var0);
   }

   // $VF: synthetic method
   public static Class2343 method435(Class142 var0) {
      return var0.field479;
   }

   // $VF: synthetic method
   public static List<Class9603> method436(Class142 var0) {
      return var0.field480;
   }

   // $VF: synthetic method
   public static Function method437() {
      return field481;
   }

   // $VF: synthetic method
   public static Function method438() {
      return field482;
   }
}
