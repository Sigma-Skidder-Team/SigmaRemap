package mapped;

import net.minecraft.util.text.ITextComponent;

public class Class801 extends Class798 {
   private final ITextComponent field4181;
   private final ITextComponent field4182;
   private Class5991 field4183 = Class5991.field26162;
   private final Screen field4184;
   private int field4185;

   public Class801(Screen var1, ITextComponent var2, ITextComponent var3) {
      this.field4184 = var1;
      this.field4181 = var2;
      this.field4182 = var3;
   }

   @Override
   public void method1921() {
      Minecraft var3 = Minecraft.getInstance();
      var3.method1560(false);
      var3.method1539().method25150();
      Class9229.method34711(this.field4181.getString() + ": " + this.field4182.getString());
      this.field4183 = Class5991.method18584(this.field4568, this.field4182, this.field4564 - 50);
      this.field4185 = this.field4183.method18592() * 9;
      this.<Class1206>method2455(
         new Class1206(
            this.field4564 / 2 - 100, this.field4565 / 2 + this.field4185 / 2 + 9, 200, 20, Class7127.field30663, var2 -> var3.displayGuiScreen(this.field4184)
         )
      );
   }

   @Override
   public void method1945() {
      Minecraft.getInstance().displayGuiScreen(this.field4184);
   }

   @Override
   public void method1923(MatrixStack var1, int var2, int var3, float var4) {
      this.method2469(var1);
      method5691(var1, this.field4568, this.field4181, this.field4564 / 2, this.field4565 / 2 - this.field4185 / 2 - 18, 11184810);
      this.field4183.method18588(var1, this.field4564 / 2, this.field4565 / 2 - this.field4185 / 2);
      super.method1923(var1, var2, var3, var4);
   }
}
