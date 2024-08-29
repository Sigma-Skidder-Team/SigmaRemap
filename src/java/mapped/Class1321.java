package mapped;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.DialogTexts;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class1321 extends Screen {
   private static final ITextComponent field6978 = new TranslationTextComponent("jigsaw_block.joint_label");
   private static final ITextComponent field6979 = new TranslationTextComponent("jigsaw_block.pool");
   private static final ITextComponent field6980 = new TranslationTextComponent("jigsaw_block.name");
   private static final ITextComponent field6981 = new TranslationTextComponent("jigsaw_block.target");
   private static final ITextComponent field6982 = new TranslationTextComponent("jigsaw_block.final_state");
   private final Class965 field6983;
   private Class1189 field6984;
   private Class1189 field6985;
   private Class1189 field6986;
   private Class1189 field6987;
   private int field6988;
   private boolean field6989 = true;
   private Class1206 field6990;
   private Class1206 field6991;
   private Class92 field6992;

   public Class1321(Class965 var1) {
      super(NarratorChatListener.field29300);
      this.field6983 = var1;
   }

   @Override
   public void tick() {
      this.field6984.method5633();
      this.field6985.method5633();
      this.field6986.method5633();
      this.field6987.method5633();
   }

   private void method6268() {
      this.method6270();
      this.field4562.displayGuiScreen((Screen)null);
   }

   private void method6269() {
      this.field4562.displayGuiScreen((Screen)null);
   }

   private void method6270() {
      this.field4562
         .getConnection()
         .sendPacket(
            new Class5544(
               this.field6983.getPos(),
               new ResourceLocation(this.field6984.method5636()),
               new ResourceLocation(this.field6985.method5636()),
               new ResourceLocation(this.field6986.method5636()),
               this.field6987.method5636(),
               this.field6992
            )
         );
   }

   private void method6271() {
      this.field4562.getConnection().sendPacket(new Class5468(this.field6983.getPos(), this.field6988, this.field6989));
   }

   @Override
   public void method1945() {
      this.method6269();
   }

   @Override
   public void method1921() {
      this.field4562.keyboardListener.method36347(true);
      this.field6986 = new Class1189(this.field4568, this.field4564 / 2 - 152, 20, 300, 20, new TranslationTextComponent("jigsaw_block.pool"));
      this.field6986.method5657(128);
      this.field6986.method5635(this.field6983.method3980().toString());
      this.field6986.method5631(var1 -> this.method6272());
      this.field4561.add(this.field6986);
      this.field6984 = new Class1189(this.field4568, this.field4564 / 2 - 152, 55, 300, 20, new TranslationTextComponent("jigsaw_block.name"));
      this.field6984.method5657(128);
      this.field6984.method5635(this.field6983.method3978().toString());
      this.field6984.method5631(var1 -> this.method6272());
      this.field4561.add(this.field6984);
      this.field6985 = new Class1189(this.field4568, this.field4564 / 2 - 152, 90, 300, 20, new TranslationTextComponent("jigsaw_block.target"));
      this.field6985.method5657(128);
      this.field6985.method5635(this.field6983.method3979().toString());
      this.field6985.method5631(var1 -> this.method6272());
      this.field4561.add(this.field6985);
      this.field6987 = new Class1189(this.field4568, this.field4564 / 2 - 152, 125, 300, 20, new TranslationTextComponent("jigsaw_block.final_state"));
      this.field6987.method5657(256);
      this.field6987.method5635(this.field6983.method3981());
      this.field4561.add(this.field6987);
      this.field6992 = this.field6983.method3982();
      int var3 = this.field4568.method38821(field6978) + 10;
      this.field6990 = this.<Class1206>method2455(new Class1206(this.field4564 / 2 - 152 + var3, 150, 300 - var3, 20, this.method6273(), var1 -> {
         Class92[] var4x = Class92.values();
         int var5 = (this.field6992.ordinal() + 1) % var4x.length;
         this.field6992 = var4x[var5];
         var1.method5743(this.method6273());
      }));
      boolean var4 = Class3249.method11675(this.field6983.method3775()).method544().method323();
      this.field6990.field6482 = var4;
      this.field6990.field6483 = var4;
      this.<Class1238>method2455(new Class1238(this, this.field4564 / 2 - 154, 180, 100, 20, StringTextComponent.EMPTY, 0.0));
      this.<Class1247>method2455(
         new Class1247(this, this.field4564 / 2 - 50, 180, 100, 20, new TranslationTextComponent("jigsaw_block.keep_jigsaws"), var1 -> {
            this.field6989 = !this.field6989;
            var1.method5744(250);
         })
      );
      this.<Class1206>method2455(new Class1206(this.field4564 / 2 + 54, 180, 100, 20, new TranslationTextComponent("jigsaw_block.generate"), var1 -> {
         this.method6268();
         this.method6271();
      }));
      this.field6991 = this.<Class1206>method2455(new Class1206(this.field4564 / 2 - 4 - 150, 210, 150, 20, DialogTexts.field30658, var1 -> this.method6268()));
      this.<Class1206>method2455(new Class1206(this.field4564 / 2 + 4, 210, 150, 20, DialogTexts.GUI_CANCEL, var1 -> this.method6269()));
      this.method5536(this.field6986);
      this.method6272();
   }

   private void method6272() {
      this.field6991.field6482 = ResourceLocation.method8300(this.field6984.method5636())
         && ResourceLocation.method8300(this.field6985.method5636())
         && ResourceLocation.method8300(this.field6986.method5636());
   }

   @Override
   public void resize(Minecraft var1, int var2, int var3) {
      String var6 = this.field6984.method5636();
      String var7 = this.field6985.method5636();
      String var8 = this.field6986.method5636();
      String var9 = this.field6987.method5636();
      int var10 = this.field6988;
      Class92 var11 = this.field6992;
      this.init(var1, var2, var3);
      this.field6984.method5635(var6);
      this.field6985.method5635(var7);
      this.field6986.method5635(var8);
      this.field6987.method5635(var9);
      this.field6988 = var10;
      this.field6992 = var11;
      this.field6990.method5743(this.method6273());
   }

   private ITextComponent method6273() {
      return new TranslationTextComponent("jigsaw_block.joint." + this.field6992.method257());
   }

   @Override
   public void onClose() {
      this.field4562.keyboardListener.method36347(false);
   }

   @Override
   public boolean method1920(int var1, int var2, int var3) {
      if (super.method1920(var1, var2, var3)) {
         return true;
      } else if (this.field6991.field6482 && (var1 == 257 || var1 == 335)) {
         this.method6268();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void method1923(MatrixStack var1, int var2, int var3, float var4) {
      this.method2469(var1);
      method5693(var1, this.field4568, field6979, this.field4564 / 2 - 153, 10, 10526880);
      this.field6986.method1923(var1, var2, var3, var4);
      method5693(var1, this.field4568, field6980, this.field4564 / 2 - 153, 45, 10526880);
      this.field6984.method1923(var1, var2, var3, var4);
      method5693(var1, this.field4568, field6981, this.field4564 / 2 - 153, 80, 10526880);
      this.field6985.method1923(var1, var2, var3, var4);
      method5693(var1, this.field4568, field6982, this.field4564 / 2 - 153, 115, 10526880);
      this.field6987.method1923(var1, var2, var3, var4);
      if (Class3249.method11675(this.field6983.method3775()).method544().method323()) {
         method5693(var1, this.field4568, field6978, this.field4564 / 2 - 153, 156, 16777215);
      }

      super.method1923(var1, var2, var3, var4);
   }

   // $VF: synthetic method
   public static int method6282(Class1321 var0) {
      return var0.field6988;
   }

   // $VF: synthetic method
   public static int method6283(Class1321 var0, int var1) {
      return var0.field6988 = var1;
   }

   // $VF: synthetic method
   public static boolean method6284(Class1321 var0) {
      return var0.field6989;
   }
}
