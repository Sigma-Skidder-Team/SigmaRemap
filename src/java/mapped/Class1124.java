package mapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.ITextProperties;
import net.minecraft.util.text.TranslationTextComponent;

public class Class1124 extends Class875<Class5824> {
   private static final ResourceLocation field6158 = new ResourceLocation("textures/gui/container/anvil.png");
   private static final ITextComponent field6159 = new TranslationTextComponent("container.repair.expensive");
   private Class1189 field6160;

   public Class1124(Class5824 var1, Class974 var2, ITextComponent var3) {
      super(var1, var2, var3, field6158);
      this.field4723 = 60;
   }

   @Override
   public void method1919() {
      super.method1919();
      this.field6160.method5633();
   }

   @Override
   public void method2716() {
      this.field4562.field1302.method36347(true);
      int var3 = (this.field4564 - this.field4721) / 2;
      int var4 = (this.field4565 - this.field4722) / 2;
      this.field6160 = new Class1189(this.field4568, var3 + 62, var4 + 24, 103, 12, new TranslationTextComponent("container.repair"));
      this.field6160.method5669(false);
      this.field6160.method5662(-1);
      this.field6160.method5663(-1);
      this.field6160.method5661(false);
      this.field6160.method5657(35);
      this.field6160.method5631(this::method5420);
      this.field4561.add(this.field6160);
      this.method5536(this.field6160);
   }

   @Override
   public void method2482(Minecraft var1, int var2, int var3) {
      String var6 = this.field6160.method5636();
      this.method2467(var1, var2, var3);
      this.field6160.method5635(var6);
   }

   @Override
   public void method1931() {
      super.method1931();
      this.field4562.field1302.method36347(false);
   }

   @Override
   public boolean method1920(int var1, int var2, int var3) {
      if (var1 == 256) {
         this.field4562.field1339.method2772();
      }

      return !this.field6160.method1920(var1, var2, var3) && !this.field6160.method5653() ? super.method1920(var1, var2, var3) : true;
   }

   private void method5420(String var1) {
      if (!var1.isEmpty()) {
         String var4 = var1;
         Class5839 var5 = this.field4727.method18131(0);
         if (var5 != null && var5.method18266() && !var5.method18265().method32152() && var1.equals(var5.method18265().method32149().getString())) {
            var4 = "";
         }

         this.field4727.method18197(var4);
         this.field4562.field1339.connection.sendPacket(new Class5558(var4));
      }
   }

   @Override
   public void method2617(Class9332 var1, int var2, int var3) {
      RenderSystem.disableBlend();
      super.method2617(var1, var2, var3);
      int var6 = this.field4727.method18198();
      if (var6 > 0) {
         int var7 = 8453920;
         Object var8;
         if (var6 >= 40 && !this.field4562.field1339.field4919.field29609) {
            var8 = field6159;
            var7 = 16736352;
         } else if (this.field4727.method18131(2).method18266()) {
            var8 = new TranslationTextComponent("container.repair.cost", var6);
            if (!this.field4727.method18131(2).method18273(this.field4728.field5444)) {
               var7 = 16736352;
            }
         } else {
            var8 = null;
         }

         if (var8 != null) {
            int var9 = this.field4721 - 8 - this.field4568.method38821((ITextProperties)var8) - 2;
            byte var10 = 69;
            method5686(var1, var9 - 2, 67, this.field4721 - 8, 79, 1325400064);
            this.field4568.method38803(var1, (ITextComponent)var8, (float)var9, 69.0F, var7);
         }
      }
   }

   @Override
   public void method2717(Class9332 var1, int var2, int var3, float var4) {
      this.field6160.method1923(var1, var2, var3, var4);
   }

   @Override
   public void method2720(Class5812 var1, int var2, ItemStack var3) {
      if (var2 == 0) {
         this.field6160.method5635(!var3.method32105() ? var3.method32149().getString() : "");
         this.field6160.method5666(!var3.method32105());
         this.method5534(this.field6160);
      }
   }
}
