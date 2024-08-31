package mapped;

import com.mojang.authlib.GameProfile;
import java.util.UUID;

import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.BlockPos;
import org.apache.commons.lang3.StringUtils;

public class Class3345 extends Class3343 {
   public Class3345(AbstractBlock var1) {
      super(Class2136.field13991, var1);
   }

   @Override
   public void method11563(World var1, BlockPos var2, BlockState var3, LivingEntity var4, ItemStack var5) {
      super.method11563(var1, var2, var3, var4, var5);
      TileEntity var8 = var1.getTileEntity(var2);
      if (var8 instanceof SkullTileEntity) {
         SkullTileEntity var9 = (SkullTileEntity)var8;
         GameProfile var10 = null;
         if (var5.method32141()) {
            CompoundNBT var11 = var5.method32142();
            if (!var11.method119("SkullOwner", 10)) {
               if (var11.method119("SkullOwner", 8) && !StringUtils.isBlank(var11.method126("SkullOwner"))) {
                  var10 = new GameProfile((UUID)null, var11.method126("SkullOwner"));
               }
            } else {
               var10 = Class8354.method29278(var11.getCompound("SkullOwner"));
            }
         }

         var9.method4006(var10);
      }
   }
}
