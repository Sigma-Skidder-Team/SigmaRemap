package mapped;

import com.mojang.authlib.GameProfile;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.SkullTileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.vector.Vector3f;
import org.apache.commons.lang3.StringUtils;

import java.util.UUID;

public class Class235<T extends LivingEntity, M extends Class2827<T> & IHasHead> extends Class219<T, M> {
   private final float field881;
   private final float field882;
   private final float field883;

   public Class235(Class5714<T, M> var1) {
      this(var1, 1.0F, 1.0F, 1.0F);
   }

   public Class235(Class5714<T, M> var1, float var2, float var3, float var4) {
      super(var1);
      this.field881 = var2;
      this.field882 = var3;
      this.field883 = var4;
   }

   public void method820(MatrixStack var1, Class7733 var2, int var3, T var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      ItemStack var13 = var4.getItemStackFromSlot(EquipmentSlotType.HEAD);
      if (!var13.isEmpty()) {
         Item var14 = var13.getItem();
         var1.push();
         var1.scale(this.field881, this.field882, this.field883);
         boolean var15 = var4 instanceof Class1042 || var4 instanceof Class1040;
         if (var4.isChild() && !(var4 instanceof Class1042)) {
            float var16 = 2.0F;
            float var17 = 1.4F;
            var1.translate(0.0, 0.03125, 0.0);
            var1.scale(0.7F, 0.7F, 0.7F);
            var1.translate(0.0, 1.0, 0.0);
         }

         this.method825().getModelHead().translateRotate(var1);
         if (var14 instanceof Class3292 && ((Class3292)var14).method11845() instanceof Class3251) {
            float var21 = 1.1875F;
            var1.scale(1.1875F, -1.1875F, -1.1875F);
            if (var15) {
               var1.translate(0.0, 0.0625, 0.0);
            }

            GameProfile var22 = null;
            if (var13.method32141()) {
               CompoundNBT var18 = var13.method32142();
               if (!var18.contains("SkullOwner", 10)) {
                  if (var18.contains("SkullOwner", 8)) {
                     String var19 = var18.getString("SkullOwner");
                     if (!StringUtils.isBlank(var19)) {
                        var22 = SkullTileEntity.method4008(new GameProfile((UUID)null, var19));
                        var18.put("SkullOwner", Class8354.method29279(new CompoundNBT(), var22));
                     }
                  }
               } else {
                  var22 = Class8354.method29278(var18.getCompound("SkullOwner"));
               }
            }

            var1.translate(-0.5, 0.0, -0.5);
            Class5952.method18482((Direction)null, 180.0F, ((Class3251)((Class3292)var14).method11845()).method11696(), var22, var5, var1, var2, var3);
         } else if (!(var14 instanceof ArmorItem) || ((ArmorItem)var14).getType() != EquipmentSlotType.HEAD) {
            float var20 = 0.625F;
            var1.translate(0.0, -0.25, 0.0);
            var1.rotate(Vector3f.YP.rotationDegrees(180.0F));
            var1.scale(0.625F, -0.625F, -0.625F);
            if (var15) {
               var1.translate(0.0, 0.1875, 0.0);
            }

            Minecraft.getInstance().getFirstPersonRenderer().renderItemSide(var4, var13, ItemCameraTransformsTransformType.HEAD, false, var1, var2, var3);
         }

         var1.pop();
      }
   }
}
