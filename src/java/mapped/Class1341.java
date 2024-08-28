package mapped;

import net.minecraft.util.text.TranslationTextComponent;

import java.util.List;

public class Class1341 extends Screen {
   public final Screen field7113;
   private List<Class9125> field7114;
   private Class1206 field7115;
   private Class1206 field7116;
   private Class1206 field7117;
   private Class1206 field7118;
   public Class1189 field7119;
   private Class1276 field7120;

   public Class1341(Screen var1) {
      super(new TranslationTextComponent("selectWorld.title"));
      this.field7113 = var1;
   }

   @Override
   public boolean method2649(double var1, double var3, double var5) {
      return super.method2649(var1, var3, var5);
   }

   @Override
   public void method1919() {
      this.field7119.method5633();
   }

   @Override
   public void method1921() {
      this.field4562.field1302.method36347(true);
      this.field7119 = new Class1189(this.field4568, this.field4564 / 2 - 100, 22, 200, 20, this.field7119, new TranslationTextComponent("selectWorld.search"));
      this.field7119.method5631(var1 -> this.field7120.method6066(() -> var1, false));
      this.field7120 = new Class1276(
         this, this.field4562, this.field4564, this.field4565, 48, this.field4565 - 64, 36, () -> this.field7119.method5636(), this.field7120
      );
      this.field4561.add(this.field7119);
      this.field4561.add(this.field7120);
      this.field7116 = this.<Class1206>method2455(
         new Class1206(
            this.field4564 / 2 - 154,
            this.field4565 - 52,
            150,
            20,
            new TranslationTextComponent("selectWorld.select"),
            var1 -> this.field7120.method6067().ifPresent(Class1173::method5578)
         )
      );
      this.<Class1206>method2455(
         new Class1206(
            this.field4564 / 2 + 4,
            this.field4565 - 52,
            150,
            20,
            new TranslationTextComponent("selectWorld.create"),
            var1 -> this.field4562.displayGuiScreen(Class1335.method6353(this))
         )
      );
      this.field7117 = this.<Class1206>method2455(
         new Class1206(
            this.field4564 / 2 - 154,
            this.field4565 - 28,
            72,
            20,
            new TranslationTextComponent("selectWorld.edit"),
            var1 -> this.field7120.method6067().ifPresent(Class1173::method5580)
         )
      );
      this.field7115 = this.<Class1206>method2455(
         new Class1206(
            this.field4564 / 2 - 76,
            this.field4565 - 28,
            72,
            20,
            new TranslationTextComponent("selectWorld.delete"),
            var1 -> this.field7120.method6067().ifPresent(Class1173::method5579)
         )
      );
      this.field7118 = this.<Class1206>method2455(
         new Class1206(
            this.field4564 / 2 + 4,
            this.field4565 - 28,
            72,
            20,
            new TranslationTextComponent("selectWorld.recreate"),
            var1 -> this.field7120.method6067().ifPresent(Class1173::method5581)
         )
      );
      this.<Class1206>method2455(
         new Class1206(this.field4564 / 2 + 82, this.field4565 - 28, 72, 20, Class7127.field30659, var1 -> this.field4562.displayGuiScreen(this.field7113))
      );
      this.method6422(false);
      this.method5536(this.field7119);
   }

   @Override
   public boolean method1920(int var1, int var2, int var3) {
      return !super.method1920(var1, var2, var3) ? this.field7119.method1920(var1, var2, var3) : true;
   }

   @Override
   public void method1945() {
      this.field4562.displayGuiScreen(this.field7113);
   }

   @Override
   public boolean method1932(char var1, int var2) {
      return this.field7119.method1932(var1, var2);
   }

   @Override
   public void method1923(MatrixStack var1, int var2, int var3, float var4) {
      this.field7114 = null;
      this.field7120.method1923(var1, var2, var3, var4);
      this.field7119.method1923(var1, var2, var3, var4);
      method5691(var1, this.field4568, this.field4560, this.field4564 / 2, 8, 16777215);
      super.method1923(var1, var2, var3, var4);
      if (this.field7114 != null) {
         this.method2461(var1, this.field7114, var2, var3);
      }
   }

   public void method6421(List<Class9125> var1) {
      this.field7114 = var1;
   }

   public void method6422(boolean var1) {
      this.field7116.field6482 = var1;
      this.field7115.field6482 = var1;
      this.field7117.field6482 = var1;
      this.field7118.field6482 = var1;
   }

   @Override
   public void onClose() {
      if (this.field7120 != null) {
         this.field7120.method2468().forEach(Class1173::close);
      }
   }
}
