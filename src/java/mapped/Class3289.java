package mapped;

import java.util.Random;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;

public class Class3289 extends Item {
   private static String[] field18800;

   public Class3289(Class5643 var1) {
      super(var1);
   }

   @Override
   public ActionResultType method11707(Class5911 var1) {
      Direction var4 = var1.method18354();
      if (var4 != Direction.DOWN) {
         World var5 = var1.method18360();
         Class5909 var6 = new Class5909(var1);
         BlockPos var7 = var6.method18345();
         ItemStack var8 = var1.method18357();
         Vector3d var9 = Vector3d.method11330(var7);
         AxisAlignedBB var10 = EntityType.field41006.getSize().method32098(var9.method11320(), var9.method11321(), var9.method11322());
         if (var5.method7054((Entity)null, var10, var0 -> true) && var5.method7181((Entity)null, var10).isEmpty()) {
            if (var5 instanceof ServerWorld) {
               ServerWorld var11 = (ServerWorld)var5;
               ArmorStandEntity var12 = EntityType.field41006
                  .method33202(var11, var8.method32142(), (ITextComponent)null, var1.method18358(), var7, Class2202.field14403, true, true);
               if (var12 == null) {
                  return ActionResultType.FAIL;
               }

               var11.method6995(var12);
               float var13 = (float) MathHelper.method37767((MathHelper.method37792(var1.method18352() - 180.0F) + 22.5F) / 45.0F) * 45.0F;
               var12.method3273(var12.getPosX(), var12.getPosY(), var12.getPosZ(), var13, 0.0F);
               this.method11828(var12, var5.rand);
               var5.method6916(var12);
               var5.method6743(
                  (PlayerEntity)null, var12.getPosX(), var12.getPosY(), var12.getPosZ(), Sounds.field26360, Class2266.field14732, 0.75F, 0.8F
               );
            }

            var8.method32182(1);
            return ActionResultType.method9002(var5.isRemote);
         } else {
            return ActionResultType.FAIL;
         }
      } else {
         return ActionResultType.FAIL;
      }
   }

   private void method11828(ArmorStandEntity var1, Random var2) {
      Class7087 var5 = var1.method4211();
      float var6 = var2.nextFloat() * 5.0F;
      float var7 = var2.nextFloat() * 20.0F - 10.0F;
      Class7087 var8 = new Class7087(var5.method22013() + var6, var5.method22014() + var7, var5.method22015());
      var1.method4205(var8);
      var5 = var1.method4212();
      var6 = var2.nextFloat() * 10.0F - 5.0F;
      var8 = new Class7087(var5.method22013(), var5.method22014() + var6, var5.method22015());
      var1.method4206(var8);
   }
}
