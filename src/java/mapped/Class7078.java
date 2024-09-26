package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.player.AbstractClientPlayerEntity;
import net.minecraft.util.ResourceLocation;

import java.awt.Dimension;

public class Class7078 {
   private Dimension field30468 = null;
   private boolean field30469 = false;
   private Class7954[] field30470 = new Class7954[0];
   private ResourceLocation field30471 = null;
   private Class1806 field30472 = null;
   private Class291 field30473 = null;
   private ResourceLocation field30474 = new ResourceLocation("textures/block/red_wool.png");
   public static final int field30475 = 0;
   public static final int field30476 = 1;
   public static final int field30477 = 2;
   public static final int field30478 = 3;
   public static final int field30479 = 4;
   public static final int field30480 = 5;
   public static final int field30481 = 6;

   public Class7078(Dimension var1, boolean var2, Class7954[] var3) {
      this.field30468 = var1;
      this.field30469 = var2;
      this.field30470 = var3;
   }

   public void method21991(Class2797 var1, AbstractClientPlayerEntity var2, MatrixStack var3, Class7733 var4, int var5, int var6) {
      ResourceLocation var9 = this.field30474;
      if (!this.field30469) {
         if (this.field30471 == null) {
            var9 = this.field30474;
         } else {
            if (this.field30473 == null && this.field30472 != null) {
               this.field30473 = new Class291(this.field30472);
               Minecraft.getInstance().getTextureManager().method1073(this.field30471, this.field30473);
            }

            var9 = this.field30471;
         }
      } else {
         var9 = var2.method5371();
      }

      for (int var10 = 0; var10 < this.field30470.length; var10++) {
         Class7954 var11 = this.field30470[var10];
         var3.push();
         RenderType var12 = RenderType.getEntityCutoutNoCull(var9);
         Class5422 var13 = var4.method25597(var12);
         var11.method27044(var1, var3, var13, var5, var6);
         var3.pop();
      }
   }

   public static Class7219 method21992(Class2797 var0, int var1) {
      switch (var1) {
         case 0:
            return var0.field17434;
         case 1:
            return var0.field17432;
         case 2:
            return var0.field17436;
         case 3:
            return var0.field17435;
         case 4:
            return var0.field17438;
         case 5:
            return var0.field17437;
         default:
            return null;
      }
   }

   public Class1806 method21993() {
      return this.field30472;
   }

   public void method21994(Class1806 var1) {
      this.field30472 = var1;
   }

   public Class291 method21995() {
      return this.field30473;
   }

   public ResourceLocation method21996() {
      return this.field30471;
   }

   public void method21997(ResourceLocation var1) {
      this.field30471 = var1;
   }

   public boolean method21998() {
      return this.field30469;
   }
}
