package mapped;

import java.util.List;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;

public class Class3334 extends Item {
   public Class3334(Properties var1) {
      super(var1);
      Class3357.method11931(this, ArmorItem.DISPENSER_BEHAVIOR);
   }

   @Override
   public String method11720(ItemStack var1) {
      return var1.method32145("BlockEntityTag") == null ? super.method11720(var1) : this.getTranslationKey() + '.' + method11882(var1).method310();
   }

   @Override
   public void method11730(ItemStack var1, World var2, List<ITextComponent> var3, Class2216 var4) {
      Class3301.method11848(var1, var3);
   }

   @Override
   public Class2103 method11727(ItemStack var1) {
      return Class2103.field13709;
   }

   @Override
   public int method11728(ItemStack var1) {
      return 72000;
   }

   @Override
   public Class6794<ItemStack> method11700(World var1, PlayerEntity var2, Hand var3) {
      ItemStack var6 = var2.getHeldItem(var3);
      var2.setActiveHand(var3);
      return Class6794.<ItemStack>method20697(var6);
   }

   @Override
   public boolean method11699(ItemStack var1, ItemStack var2) {
      return Class5985.field26071.method24917(var2.getItem()) || super.method11699(var1, var2);
   }

   public static Class112 method11882(ItemStack var0) {
      return Class112.method315(var0.method32144("BlockEntityTag").getInt("Base"));
   }
}
