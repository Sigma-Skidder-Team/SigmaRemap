package mapped;

import com.mojang.authlib.GameProfile;
import java.util.UUID;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.commons.lang3.StringUtils;

public class SkullItem extends Class3298 {
   public SkullItem(Block var1, Block var2, Class5643 var3) {
      super(var1, var2, var3);
   }

   @Override
   public ITextComponent method11731(ItemStack var1) {
      if (var1.getItem() == Items.field38060 && var1.method32141()) {
         String var4 = null;
         CompoundNBT var5 = var1.method32142();
         if (!var5.contains("SkullOwner", 8)) {
            if (var5.contains("SkullOwner", 10)) {
               CompoundNBT var6 = var5.getCompound("SkullOwner");
               if (var6.contains("Name", 8)) {
                  var4 = var6.getString("Name");
               }
            }
         } else {
            var4 = var5.getString("SkullOwner");
         }

         if (var4 != null) {
            return new TranslationTextComponent(this.getTranslationKey() + ".named", var4);
         }
      }

      return super.method11731(var1);
   }

   @Override
   public boolean method11705(CompoundNBT var1) {
      super.method11705(var1);
      if (var1.contains("SkullOwner", 8) && !StringUtils.isBlank(var1.getString("SkullOwner"))) {
         GameProfile var4 = new GameProfile((UUID)null, var1.getString("SkullOwner"));
         var4 = SkullTileEntity.method4008(var4);
         var1.put("SkullOwner", Class8354.method29279(new CompoundNBT(), var4));
         return true;
      } else {
         return false;
      }
   }
}
