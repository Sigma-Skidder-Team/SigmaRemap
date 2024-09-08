package mapped;

import com.google.common.collect.ImmutableSet;
import com.mojang.authlib.GameProfile;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;

import java.util.Set;

public class Class147 extends Class128 {
   private final Class2063 field490;

   public Class147(ILootCondition[] var1, Class2063 var2) {
      super(var1);
      this.field490 = var2;
   }

   @Override
   public LootFunctionType getFunctionType() {
      return LootFunctionManager.FILL_PLAYER_HEAD;
   }

   @Override
   public Set<Class9821<?>> method355() {
      return ImmutableSet.of(this.field490.method8717());
   }

   @Override
   public ItemStack method371(ItemStack var1, LootContext var2) {
      if (var1.getItem() == Items.field38060) {
         Entity var5 = var2.method26081(this.field490.method8717());
         if (var5 instanceof PlayerEntity) {
            GameProfile var6 = ((PlayerEntity)var5).getGameProfile();
            var1.getOrCreateTag().put("SkullOwner", Class8354.method29279(new CompoundNBT(), var6));
         }
      }

      return var1;
   }

   // $VF: synthetic method
   public static Class2063 method450(Class147 var0) {
      return var0.field490;
   }
}
