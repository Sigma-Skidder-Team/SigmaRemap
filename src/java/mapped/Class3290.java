package mapped;

import java.util.List;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;

public class Class3290 extends Item {
   public Class3290(Properties var1) {
      super(var1);
   }

   @Override
   public boolean method11732(ItemStack var1) {
      return true;
   }

   @Override
   public boolean method11734(ItemStack var1) {
      return false;
   }

   public static ListNBT method11830(ItemStack var0) {
      CompoundNBT var3 = var0.getTag();
      return var3 == null ? new ListNBT() : var3.method131("StoredEnchantments", 10);
   }

   @Override
   public void method11730(ItemStack var1, World var2, List<ITextComponent> var3, Class2216 var4) {
      super.method11730(var1, var2, var3, var4);
      ItemStack.method32157(var3, method11830(var1));
   }

   public static void method11831(ItemStack var0, Class6694 var1) {
      ListNBT var4 = method11830(var0);
      boolean var5 = true;
      ResourceLocation var6 = Registry.ENCHANTMENT.getKey(var1.field29316);

      for (int var7 = 0; var7 < var4.size(); var7++) {
         CompoundNBT var8 = var4.method153(var7);
         ResourceLocation var9 = ResourceLocation.method8289(var8.getString("id"));
         if (var9 != null && var9.equals(var6)) {
            if (var8.getInt("lvl") < var1.field29317) {
               var8.putShort("lvl", (short)var1.field29317);
            }

            var5 = false;
            break;
         }
      }

      if (var5) {
         CompoundNBT var10 = new CompoundNBT();
         var10.method109("id", String.valueOf(var6));
         var10.putShort("lvl", (short)var1.field29317);
         var4.add(var10);
      }

      var0.getOrCreateTag().put("StoredEnchantments", var4);
   }

   public static ItemStack method11832(Class6694 var0) {
      ItemStack var3 = new ItemStack(Items.field38070);
      method11831(var3, var0);
      return var3;
   }

   @Override
   public void fillItemGroup(ItemGroup var1, NonNullList<ItemStack> var2) {
      if (var1 != ItemGroup.SEARCH) {
         if (var1.method23655().length != 0) {
            for (Enchantment var6 : Registry.ENCHANTMENT) {
               if (var1.method23657(var6.type)) {
                  var2.add(method11832(new Class6694(var6, var6.method18809())));
               }
            }
         }
      } else {
         for (Enchantment var9 : Registry.ENCHANTMENT) {
            if (var9.type != null) {
               for (int var7 = var9.method18813(); var7 <= var9.method18809(); var7++) {
                  var2.add(method11832(new Class6694(var9, var7)));
               }
            }
         }
      }
   }
}
