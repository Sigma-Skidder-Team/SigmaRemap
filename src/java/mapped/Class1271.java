package mapped;

import com.google.common.collect.Maps;
import net.minecraft.util.text.ITextComponent;

import javax.annotation.Nullable;
import java.util.Map;

public class Class1271 extends Class1193 {
   private static String[] field6747;
   private final Minecraft field6748;
   private final Class1130 field6749;
   private final Class2166 field6750;
   private final int field6751;
   private final Class7952 field6752;
   private final Class9272 field6753;
   private final Class8848 field6754;
   private final ITextComponent field6755;
   private final Class1194 field6756;
   private final Map<Class7952, Class1194> field6757 = Maps.newLinkedHashMap();
   private double field6758;
   private double field6759;
   private int field6760 = Integer.MAX_VALUE;
   private int field6761 = Integer.MAX_VALUE;
   private int field6762 = Integer.MIN_VALUE;
   private int field6763 = Integer.MIN_VALUE;
   private float field6764;
   private boolean field6765;

   public Class1271(Minecraft var1, Class1130 var2, Class2166 var3, int var4, Class7952 var5, Class9272 var6) {
      this.field6748 = var1;
      this.field6749 = var2;
      this.field6750 = var3;
      this.field6751 = var4;
      this.field6752 = var5;
      this.field6753 = var6;
      this.field6754 = var6.method34936();
      this.field6755 = var6.method34934();
      this.field6756 = new Class1194(this, var1, var5, var6);
      this.method6011(this.field6756, var5);
   }

   public Class7952 method6001() {
      return this.field6752;
   }

   public ITextComponent method6002() {
      return this.field6755;
   }

   public void method6003(Class9332 var1, int var2, int var3, boolean var4) {
      this.field6750.method8886(var1, this, var2, var3, var4, this.field6751);
   }

   public void method6004(int var1, int var2, Class216 var3) {
      this.field6750.method8887(var1, var2, this.field6751, var3, this.field6754);
   }

   public void method6005(Class9332 var1) {
      if (!this.field6765) {
         this.field6758 = (double)(117 - (this.field6762 + this.field6760) / 2);
         this.field6759 = (double)(56 - (this.field6763 + this.field6761) / 2);
         this.field6765 = true;
      }

      RenderSystem.pushMatrix();
      RenderSystem.enableDepthTest();
      RenderSystem.translatef(0.0F, 0.0F, 950.0F);
      RenderSystem.method27870(false, false, false, false);
      method5686(var1, 4680, 2260, -4680, -2260, -16777216);
      RenderSystem.method27870(true, true, true, true);
      RenderSystem.translatef(0.0F, 0.0F, -950.0F);
      RenderSystem.depthFunc(518);
      method5686(var1, 234, 113, 0, 0, -16777216);
      RenderSystem.depthFunc(515);
      ResourceLocation var4 = this.field6753.method34937();
      if (var4 == null) {
         this.field6748.getTextureManager().bindTexture(TextureManager.field1094);
      } else {
         this.field6748.getTextureManager().bindTexture(var4);
      }

      int var5 = Class9679.method37769(this.field6758);
      int var6 = Class9679.method37769(this.field6759);
      int var7 = var5 % 16;
      int var8 = var6 % 16;

      for (int var9 = -1; var9 <= 15; var9++) {
         for (int var10 = -1; var10 <= 8; var10++) {
            method5699(var1, var7 + 16 * var9, var8 + 16 * var10, 0.0F, 0.0F, 16, 16, 16, 16);
         }
      }

      this.field6756.method5707(var1, var5, var6, true);
      this.field6756.method5707(var1, var5, var6, false);
      this.field6756.method5708(var1, var5, var6);
      RenderSystem.depthFunc(518);
      RenderSystem.translatef(0.0F, 0.0F, -950.0F);
      RenderSystem.method27870(false, false, false, false);
      method5686(var1, 4680, 2260, -4680, -2260, -16777216);
      RenderSystem.method27870(true, true, true, true);
      RenderSystem.translatef(0.0F, 0.0F, 950.0F);
      RenderSystem.depthFunc(515);
      RenderSystem.popMatrix();
   }

   public void method6006(Class9332 var1, int var2, int var3, int var4, int var5) {
      RenderSystem.pushMatrix();
      RenderSystem.translatef(0.0F, 0.0F, 200.0F);
      method5686(var1, 0, 0, 234, 113, Class9679.method37767(this.field6764 * 255.0F) << 24);
      boolean var8 = false;
      int var9 = Class9679.method37769(this.field6758);
      int var10 = Class9679.method37769(this.field6759);
      if (var2 > 0 && var2 < 234 && var3 > 0 && var3 < 113) {
         for (Class1194 var12 : this.field6757.values()) {
            if (var12.method5714(var9, var10, var2, var3)) {
               var8 = true;
               var12.method5711(var1, var9, var10, this.field6764, var4, var5);
               break;
            }
         }
      }

      RenderSystem.popMatrix();
      if (!var8) {
         this.field6764 = Class9679.method37777(this.field6764 - 0.04F, 0.0F, 1.0F);
      } else {
         this.field6764 = Class9679.method37777(this.field6764 + 0.02F, 0.0F, 0.3F);
      }
   }

   public boolean method6007(int var1, int var2, double var3, double var5) {
      return this.field6750.method8890(var1, var2, this.field6751, var3, var5);
   }

   @Nullable
   public static Class1271 method6008(Minecraft var0, Class1130 var1, int var2, Class7952 var3) {
      if (var3.method27027() == null) {
         return null;
      } else {
         for (Class2166 var9 : Class2166.values()) {
            if (var2 < var9.method8885()) {
               return new Class1271(var0, var1, var9, var2, var3, var3.method27027());
            }

            var2 -= var9.method8885();
         }

         return null;
      }
   }

   public void method6009(double var1, double var3) {
      if (this.field6762 - this.field6760 > 234) {
         this.field6758 = Class9679.method37778(this.field6758 + var1, (double)(-(this.field6762 - 234)), 0.0);
      }

      if (this.field6763 - this.field6761 > 113) {
         this.field6759 = Class9679.method37778(this.field6759 + var3, (double)(-(this.field6763 - 113)), 0.0);
      }
   }

   public void method6010(Class7952 var1) {
      if (var1.method27027() != null) {
         Class1194 var4 = new Class1194(this, this.field6748, var1, var1.method27027());
         this.method6011(var4, var1);
      }
   }

   private void method6011(Class1194 var1, Class7952 var2) {
      this.field6757.put(var2, var1);
      int var5 = var1.method5717();
      int var6 = var5 + 28;
      int var7 = var1.method5716();
      int var8 = var7 + 27;
      this.field6760 = Math.min(this.field6760, var5);
      this.field6762 = Math.max(this.field6762, var6);
      this.field6761 = Math.min(this.field6761, var7);
      this.field6763 = Math.max(this.field6763, var8);

      for (Class1194 var10 : this.field6757.values()) {
         var10.method5715();
      }
   }

   @Nullable
   public Class1194 method6012(Class7952 var1) {
      return this.field6757.get(var1);
   }

   public Class1130 method6013() {
      return this.field6749;
   }
}
