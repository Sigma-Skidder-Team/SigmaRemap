package mapped;

import com.mojang.authlib.GameProfile;
import java.util.UUID;

import net.minecraft.block.BlockState;
import net.minecraft.block.SkullBlock;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.NBTUtil;
import net.minecraft.tileentity.SkullTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.apache.commons.lang3.StringUtils;

public class Class3345 extends SkullBlock {
   public Class3345(Properties var1) {
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
            CompoundNBT var11 = var5.getTag();
            if (!var11.contains("SkullOwner", 10)) {
               if (var11.contains("SkullOwner", 8) && !StringUtils.isBlank(var11.getString("SkullOwner"))) {
                  var10 = new GameProfile((UUID)null, var11.getString("SkullOwner"));
               }
            } else {
               var10 = NBTUtil.readGameProfile(var11.getCompound("SkullOwner"));
            }
         }

         var9.method4006(var10);
      }
   }
}
