package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class Class240<T extends LivingEntity> extends Class239<T, Class2891<T>> {
   private static String[] field893;

   public Class240(Class5714<T, Class2891<T>> var1) {
      super(var1);
   }

   @Override
   public void method820(MatrixStack var1, Class7733 var2, int var3, T var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      ItemStack var13 = var4.getHeldItemMainhand();
      var1.push();
      if (var13.getItem() == Items.field37971) {
         this.method825().method11012().method22682(var1);
         this.method825().method11206().method22682(var1);
         var1.translate(0.0625, 0.25, 0.0);
         var1.rotate(Vector3f.field32902.rotationDegrees(180.0F));
         var1.rotate(Vector3f.field32898.rotationDegrees(140.0F));
         var1.rotate(Vector3f.field32902.rotationDegrees(10.0F));
         var1.translate(0.0, -0.4F, 0.4F);
      }

      super.method820(var1, var2, var3, (T)var4, var5, var6, var7, var8, var9, var10);
      var1.pop();
   }
}
