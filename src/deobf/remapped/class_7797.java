package remapped;

import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.util.text.ITextComponent;

public class class_7797 extends AbstractGui {
   private static String[] field_39496;
   private final MinecraftClient field_39488;
   private final class_9044 field_39492;
   private final class_483 field_39483;
   private final int field_39486;
   private final class_3139 field_39487;
   private final class_7750 field_39484;
   private final ItemStack field_39493;
   private final ITextComponent field_39490;
   private final class_4604 field_39495;
   private final Map<class_3139, class_4604> field_39498 = Maps.newLinkedHashMap();
   private double field_39481;
   private double field_39480;
   private int field_39497 = Integer.MAX_VALUE;
   private int field_39482 = Integer.MAX_VALUE;
   private int field_39489 = Integer.MIN_VALUE;
   private int field_39485 = Integer.MIN_VALUE;
   private float field_39491;
   private boolean field_39494;

   public class_7797(MinecraftClient var1, class_9044 var2, class_483 var3, int var4, class_3139 var5, class_7750 var6) {
      this.field_39488 = var1;
      this.field_39492 = var2;
      this.field_39483 = var3;
      this.field_39486 = var4;
      this.field_39487 = var5;
      this.field_39484 = var6;
      this.field_39493 = var6.method_35151();
      this.field_39490 = var6.method_35160();
      this.field_39495 = new class_4604(this, var1, var5, var6);
      this.method_35360(this.field_39495, var5);
   }

   public class_3139 method_35369() {
      return this.field_39487;
   }

   public ITextComponent method_35371() {
      return this.field_39490;
   }

   public void method_35361(class_7966 var1, int var2, int var3, boolean var4) {
      this.field_39483.method_2286(var1, this, var2, var3, var4, this.field_39486);
   }

   public void method_35365(int var1, int var2, ItemRenderer var3) {
      this.field_39483.method_2287(var1, var2, this.field_39486, var3, this.field_39493);
   }

   public void method_35364(class_7966 var1) {
      if (!this.field_39494) {
         this.field_39481 = (double)(117 - (this.field_39489 + this.field_39497) / 2);
         this.field_39480 = (double)(56 - (this.field_39485 + this.field_39482) / 2);
         this.field_39494 = true;
      }

      RenderSystem.method_16438();
      RenderSystem.enableDepthTest();
      RenderSystem.method_16413(0.0F, 0.0F, 950.0F);
      RenderSystem.method_16405(false, false, false, false);
      method_9774(var1, 4680, 2260, -4680, -2260, -16777216);
      RenderSystem.method_16405(true, true, true, true);
      RenderSystem.method_16413(0.0F, 0.0F, -950.0F);
      RenderSystem.method_16457(518);
      method_9774(var1, 234, 113, 0, 0, -16777216);
      RenderSystem.method_16457(515);
      Identifier var4 = this.field_39484.method_35164();
      if (var4 == null) {
         this.field_39488.getTextureManager().bindTexture(TextureManager.field_40364);
      } else {
         this.field_39488.getTextureManager().bindTexture(var4);
      }

      int var5 = class_9299.method_42847(this.field_39481);
      int var6 = class_9299.method_42847(this.field_39480);
      int var7 = var5 % 16;
      int var8 = var6 % 16;

      for (int var9 = -1; var9 <= 15; var9++) {
         for (int var10 = -1; var10 <= 8; var10++) {
            method_9778(var1, var7 + 16 * var9, var8 + 16 * var10, 0.0F, 0.0F, 16, 16, 16, 16);
         }
      }

      this.field_39495.method_21342(var1, var5, var6, true);
      this.field_39495.method_21342(var1, var5, var6, false);
      this.field_39495.method_21345(var1, var5, var6);
      RenderSystem.method_16457(518);
      RenderSystem.method_16413(0.0F, 0.0F, -950.0F);
      RenderSystem.method_16405(false, false, false, false);
      method_9774(var1, 4680, 2260, -4680, -2260, -16777216);
      RenderSystem.method_16405(true, true, true, true);
      RenderSystem.method_16413(0.0F, 0.0F, 950.0F);
      RenderSystem.method_16457(515);
      RenderSystem.method_16489();
   }

   public void method_35363(class_7966 var1, int var2, int var3, int var4, int var5) {
      RenderSystem.method_16438();
      RenderSystem.method_16413(0.0F, 0.0F, 200.0F);
      method_9774(var1, 0, 0, 234, 113, class_9299.method_42848(this.field_39491 * 255.0F) << 24);
      boolean var8 = false;
      int var9 = class_9299.method_42847(this.field_39481);
      int var10 = class_9299.method_42847(this.field_39480);
      if (var2 > 0 && var2 < 234 && var3 > 0 && var3 < 113) {
         for (class_4604 var12 : this.field_39498.values()) {
            if (var12.method_21336(var9, var10, var2, var3)) {
               var8 = true;
               var12.method_21335(var1, var9, var10, this.field_39491, var4, var5);
               break;
            }
         }
      }

      RenderSystem.method_16489();
      if (!var8) {
         this.field_39491 = class_9299.method_42828(this.field_39491 - 0.04F, 0.0F, 1.0F);
      } else {
         this.field_39491 = class_9299.method_42828(this.field_39491 + 0.02F, 0.0F, 0.3F);
      }
   }

   public boolean method_35368(int var1, int var2, double var3, double var5) {
      return this.field_39483.method_2284(var1, var2, this.field_39486, var3, var5);
   }

   @Nullable
   public static class_7797 method_35367(MinecraftClient var0, class_9044 var1, int var2, class_3139 var3) {
      if (var3.method_14511() == null) {
         return null;
      } else {
         for (class_483 var9 : class_483.values()) {
            if (var2 < var9.method_2290()) {
               return new class_7797(var0, var1, var9, var2, var3, var3.method_14511());
            }

            var2 -= var9.method_2290();
         }

         return null;
      }
   }

   public void method_35370(double var1, double var3) {
      if (this.field_39489 - this.field_39497 > 234) {
         this.field_39481 = class_9299.method_42827(this.field_39481 + var1, (double)(-(this.field_39489 - 234)), 0.0);
      }

      if (this.field_39485 - this.field_39482 > 113) {
         this.field_39480 = class_9299.method_42827(this.field_39480 + var3, (double)(-(this.field_39485 - 113)), 0.0);
      }
   }

   public void method_35359(class_3139 var1) {
      if (var1.method_14511() != null) {
         class_4604 var4 = new class_4604(this, this.field_39488, var1, var1.method_14511());
         this.method_35360(var4, var1);
      }
   }

   private void method_35360(class_4604 var1, class_3139 var2) {
      this.field_39498.put(var2, var1);
      int var5 = var1.method_21338();
      int var6 = var5 + 28;
      int var7 = var1.method_21340();
      int var8 = var7 + 27;
      this.field_39497 = Math.min(this.field_39497, var5);
      this.field_39489 = Math.max(this.field_39489, var6);
      this.field_39482 = Math.min(this.field_39482, var7);
      this.field_39485 = Math.max(this.field_39485, var8);

      for (class_4604 var10 : this.field_39498.values()) {
         var10.method_21334();
      }
   }

   @Nullable
   public class_4604 method_35366(class_3139 var1) {
      return this.field_39498.get(var1);
   }

   public class_9044 method_35362() {
      return this.field_39492;
   }
}
