package mapped;

import com.mojang.datafixers.util.Pair;
import net.minecraft.client.Minecraft;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.text.ITextComponent;

import java.util.List;

public class Class865 extends Class851<Class5837> {
   private static final ResourceLocation field4801 = new ResourceLocation("textures/gui/container/loom.png");
   private static final int field4802 = (Class2154.field14124 - Class2154.field14125 - 1 + 4 - 1) / 4;
   private final Class7219 field4803;
   private List<Pair<Class2154, Class112>> field4804;
   private ItemStack field4805 = ItemStack.EMPTY;
   private ItemStack field4806 = ItemStack.EMPTY;
   private ItemStack field4807 = ItemStack.EMPTY;
   private boolean field4808;
   private boolean field4809;
   private boolean field4810;
   private float field4811;
   private boolean field4812;
   private int field4813 = 1;

   public Class865(Class5837 var1, PlayerInventory var2, ITextComponent var3) {
      super(var1, var2, var3);
      this.field4803 = Class5948.method18477();
      var1.method18245(this::method2678);
      this.field4724 -= 2;
   }

   @Override
   public void render(MatrixStack var1, int var2, int var3, float var4) {
      super.render(var1, var2, var3, var4);
      this.method2615(var1, var2, var3);
   }

   @Override
   public void method2618(MatrixStack var1, float var2, int var3, int var4) {
      this.renderBackground(var1);
      this.mc.getTextureManager().bindTexture(field4801);
      int var7 = this.field4734;
      int var8 = this.field4735;
      this.method5696(var1, var7, var8, 0, 0, this.field4721, this.field4722);
      Class5839 var9 = this.field4727.method18247();
      Class5839 var10 = this.field4727.method18248();
      Class5839 var11 = this.field4727.method18249();
      Class5839 var12 = this.field4727.method18250();
      if (!var9.method18266()) {
         this.method5696(var1, var7 + var9.field25580, var8 + var9.field25581, this.field4721, 0, 16, 16);
      }

      if (!var10.method18266()) {
         this.method5696(var1, var7 + var10.field25580, var8 + var10.field25581, this.field4721 + 16, 0, 16, 16);
      }

      if (!var11.method18266()) {
         this.method5696(var1, var7 + var11.field25580, var8 + var11.field25581, this.field4721 + 32, 0, 16, 16);
      }

      int var13 = (int)(41.0F * this.field4811);
      this.method5696(var1, var7 + 119, var8 + 13 + var13, 232 + (!this.field4808 ? 12 : 0), 0, 12, 15);
      Class7516.method24502();
      if (this.field4804 != null && !this.field4810) {
         Class7735 var14 = this.mc.getRenderTypeBuffers().method26536();
         var1.push();
         var1.translate((double)(var7 + 139), (double)(var8 + 52), 0.0);
         var1.method35292(24.0F, -24.0F, 1.0F);
         var1.translate(0.5, 0.5, 0.5);
         float var15 = 0.6666667F;
         var1.method35292(0.6666667F, -0.6666667F, -0.6666667F);
         this.field4803.field31035 = 0.0F;
         this.field4803.field31033 = -32.0F;
         Class5948.method18478(var1, var14, 15728880, Class213.field798, this.field4803, ModelBakery.field40513, true, this.field4804);
         var1.pop();
         var14.method25602();
      } else if (this.field4810) {
         this.method5696(var1, var7 + var12.field25580 - 2, var8 + var12.field25581 - 2, this.field4721, 17, 17, 16);
      }

      if (!this.field4808) {
         if (this.field4809) {
            int var22 = var7 + 60;
            int var24 = var8 + 13;
            this.mc.getTextureManager().bindTexture(field4801);
            this.method5696(var1, var22, var24, 0, this.field4722, 14, 14);
            int var16 = this.field4727.method18244();
            this.method2677(var16, var22, var24);
         }
      } else {
         int var23 = var7 + 60;
         int var25 = var8 + 13;
         int var26 = this.field4813 + 16;

         for (int var17 = this.field4813; var17 < var26 && var17 < Class2154.field14124 - Class2154.field14125; var17++) {
            int var18 = var17 - this.field4813;
            int var19 = var23 + var18 % 4 * 14;
            int var20 = var25 + var18 / 4 * 14;
            this.mc.getTextureManager().bindTexture(field4801);
            int var21 = this.field4722;
            if (var17 != this.field4727.method18244()) {
               if (var3 >= var19 && var4 >= var20 && var3 < var19 + 14 && var4 < var20 + 14) {
                  var21 += 28;
               }
            } else {
               var21 += 14;
            }

            this.method5696(var1, var19, var20, 0, var21, 14, 14);
            this.method2677(var17, var19, var20);
         }
      }

      Class7516.method24503();
   }

   private void method2677(int var1, int var2, int var3) {
      ItemStack var6 = new ItemStack(Items.field38099);
      CompoundNBT var7 = var6.method32144("BlockEntityTag");
      ListNBT var8 = new Class7291()
         .method23058(Class2154.field14082, Class112.field393)
         .method23058(Class2154.values()[var1], Class112.field386)
         .method23059();
      var7.put("Patterns", var8);
      MatrixStack var9 = new MatrixStack();
      var9.push();
      var9.translate((double)((float)var2 + 0.5F), (double)(var3 + 16), 0.0);
      var9.method35292(6.0F, -6.0F, 1.0F);
      var9.translate(0.5, 0.5, 0.0);
      var9.translate(0.5, 0.5, 0.5);
      float var10 = 0.6666667F;
      var9.method35292(0.6666667F, -0.6666667F, -0.6666667F);
      Class7735 var11 = this.mc.getRenderTypeBuffers().method26536();
      this.field4803.field31035 = 0.0F;
      this.field4803.field31033 = -32.0F;
      List var12 = Class958.method3891(Class112.field393, Class958.method3886(var6));
      Class5948.method18478(var9, var11, 15728880, Class213.field798, this.field4803, ModelBakery.field40513, true, var12);
      var9.pop();
      var11.method25602();
   }

   @Override
   public boolean method1958(double var1, double var3, int var5) {
      this.field4812 = false;
      if (this.field4808) {
         int var8 = this.field4734 + 60;
         int var9 = this.field4735 + 13;
         int var10 = this.field4813 + 16;

         for (int var11 = this.field4813; var11 < var10; var11++) {
            int var12 = var11 - this.field4813;
            double var13 = var1 - (double)(var8 + var12 % 4 * 14);
            double var15 = var3 - (double)(var9 + var12 / 4 * 14);
            if (var13 >= 0.0 && var15 >= 0.0 && var13 < 14.0 && var15 < 14.0 && this.field4727.method18104(this.mc.player, var11)) {
               Minecraft.getInstance().getSoundHandler().method1000(MinecraftSoundManager.playSoundWithCustomPitch(Sounds.field27177, 1.0F));
               this.mc.playerController.method23146(this.field4727.field25471, var11);
               return true;
            }
         }

         var8 = this.field4734 + 119;
         var9 = this.field4735 + 9;
         if (var1 >= (double)var8 && var1 < (double)(var8 + 12) && var3 >= (double)var9 && var3 < (double)(var9 + 56)) {
            this.field4812 = true;
         }
      }

      return super.method1958(var1, var3, var5);
   }

   @Override
   public boolean method2516(double var1, double var3, int var5, double var6, double var8) {
      if (this.field4812 && this.field4808) {
         int var12 = this.field4735 + 13;
         int var13 = var12 + 56;
         this.field4811 = ((float)var3 - (float)var12 - 7.5F) / ((float)(var13 - var12) - 15.0F);
         this.field4811 = MathHelper.method37777(this.field4811, 0.0F, 1.0F);
         int var14 = field4802 - 4;
         int var15 = (int)((double)(this.field4811 * (float)var14) + 0.5);
         if (var15 < 0) {
            var15 = 0;
         }

         this.field4813 = 1 + var15 * 4;
         return true;
      } else {
         return super.method2516(var1, var3, var5, var6, var8);
      }
   }

   @Override
   public boolean method2649(double var1, double var3, double var5) {
      if (this.field4808) {
         int var9 = field4802 - 4;
         this.field4811 = (float)((double)this.field4811 - var5 / (double)var9);
         this.field4811 = MathHelper.method37777(this.field4811, 0.0F, 1.0F);
         this.field4813 = 1 + (int)((double)(this.field4811 * (float)var9) + 0.5) * 4;
      }

      return true;
   }

   @Override
   public boolean method2623(double var1, double var3, int var5, int var6, int var7) {
      return var1 < (double)var5 || var3 < (double)var6 || var1 >= (double)(var5 + this.field4721) || var3 >= (double)(var6 + this.field4722);
   }

   private void method2678() {
      ItemStack var3 = this.field4727.method18250().method18265();
      if (!var3.isEmpty()) {
         this.field4804 = Class958.method3891(((Class3301)var3.getItem()).method11849(), Class958.method3886(var3));
      } else {
         this.field4804 = null;
      }

      ItemStack var4 = this.field4727.method18247().method18265();
      ItemStack var5 = this.field4727.method18248().method18265();
      ItemStack var6 = this.field4727.method18249().method18265();
      CompoundNBT var7 = var4.method32144("BlockEntityTag");
      this.field4810 = var7.method119("Patterns", 9) && !var4.isEmpty() && var7.method131("Patterns", 10).size() >= 6;
      if (this.field4810) {
         this.field4804 = null;
      }

      if (!ItemStack.method32128(var4, this.field4805) || !ItemStack.method32128(var5, this.field4806) || !ItemStack.method32128(var6, this.field4807)) {
         this.field4808 = !var4.isEmpty() && !var5.isEmpty() && var6.isEmpty() && !this.field4810;
         this.field4809 = !this.field4810 && !var6.isEmpty() && !var4.isEmpty() && !var5.isEmpty();
      }

      this.field4805 = var4.copy();
      this.field4806 = var5.copy();
      this.field4807 = var6.copy();
   }
}
