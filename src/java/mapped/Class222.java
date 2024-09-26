package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.entity.player.AbstractClientPlayerEntity;
import net.minecraft.entity.Entity;

import java.util.Map;
import java.util.Set;

public class Class222 extends Class219 {
   private Class5713 field867 = null;

   public Class222(Class5713 var1) {
      super(var1);
      this.field867 = var1;
   }

   @Override
   public void method820(MatrixStack var1, Class7733 var2, int var3, Entity var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      this.method829(var4, var1, var2, var3, Class213.field798);
   }

   public void method829(Entity var1, MatrixStack var2, Class7733 var3, int var4, int var5) {
      if (Class7944.method26914() && var1 instanceof AbstractClientPlayerEntity) {
         AbstractClientPlayerEntity var8 = (AbstractClientPlayerEntity)var1;
         Class2797 var9 = this.field867.method17881();
         Class7749.method25667(var9, var8, var2, var3, var4, var5);
      }
   }

   public static void method830(Map var0) {
      Set var3 = var0.keySet();
      boolean var4 = false;

      for (Object var6 : var3) {
         Object var7 = var0.get(var6);
         if (var7 instanceof Class5713) {
            Class5713 var8 = (Class5713)var7;
            var8.method17880(new Class222(var8));
            var4 = true;
         }
      }

      if (!var4) {
         Class7944.method26811("PlayerItemsLayer not registered");
      }
   }
}
