package mapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

import java.util.List;
import java.util.function.Consumer;

public class Class1324 extends Screen {
   public final Class1335 field7000;
   private final Consumer<Class9733> field7001;
   private Class9733 field7002;
   private ITextComponent field7003;
   private ITextComponent field7004;
   private Class1285 field7005;
   private Class1206 field7006;

   public Class1324(Class1335 var1, Consumer<Class9733> var2, Class9733 var3) {
      super(new TranslationTextComponent("createWorld.customize.flat.title"));
      this.field7000 = var1;
      this.field7001 = var2;
      this.field7002 = var3;
   }

   public Class9733 method6294() {
      return this.field7002;
   }

   public void method6295(Class9733 var1) {
      this.field7002 = var1;
   }

   @Override
   public void method1921() {
      this.field7003 = new TranslationTextComponent("createWorld.customize.flat.tile");
      this.field7004 = new TranslationTextComponent("createWorld.customize.flat.height");
      this.field7005 = new Class1285(this);
      this.field4561.add(this.field7005);
      this.field7006 = this.<Class1206>method2455(
         new Class1206(
            this.field4564 / 2 - 155, this.field4565 - 52, 150, 20, new TranslationTextComponent("createWorld.customize.flat.removeLayer"), var1 -> {
               if (this.method6297()) {
                  List var4 = this.field7002.method38129();
                  int var5 = this.field7005.method2468().indexOf(this.field7005.method6023());
                  int var6 = var4.size() - var5 - 1;
                  var4.remove(var6);
                  this.field7005.method6024(!var4.isEmpty() ? this.field7005.method2468().get(Math.min(var5, var4.size() - 1)) : null);
                  this.field7002.method38131();
                  this.field7005.method6106();
                  this.method6296();
               }
            }
         )
      );
      this.<Class1206>method2455(
         new Class1206(this.field4564 / 2 + 5, this.field4565 - 52, 150, 20, new TranslationTextComponent("createWorld.customize.presets"), var1 -> {
            this.field4562.displayGuiScreen(new Class1313(this));
            this.field7002.method38131();
            this.method6296();
         })
      );
      this.<Class1206>method2455(new Class1206(this.field4564 / 2 - 155, this.field4565 - 28, 150, 20, Class7127.field30658, var1 -> {
         this.field7001.accept(this.field7002);
         this.field4562.displayGuiScreen(this.field7000);
         this.field7002.method38131();
      }));
      this.<Class1206>method2455(new Class1206(this.field4564 / 2 + 5, this.field4565 - 28, 150, 20, Class7127.field30659, var1 -> {
         this.field4562.displayGuiScreen(this.field7000);
         this.field7002.method38131();
      }));
      this.field7002.method38131();
      this.method6296();
   }

   private void method6296() {
      this.field7006.field6482 = this.method6297();
   }

   private boolean method6297() {
      return this.field7005.method6023() != null;
   }

   @Override
   public void method1945() {
      this.field4562.displayGuiScreen(this.field7000);
   }

   @Override
   public void method1923(Class9332 var1, int var2, int var3, float var4) {
      this.method2469(var1);
      this.field7005.method1923(var1, var2, var3, var4);
      method5691(var1, this.field4568, this.field4560, this.field4564 / 2, 8, 16777215);
      int var7 = this.field4564 / 2 - 92 - 16;
      method5693(var1, this.field4568, this.field7003, var7, 32, 16777215);
      method5693(var1, this.field4568, this.field7004, var7 + 2 + 213 - this.field4568.method38821(this.field7004), 32, 16777215);
      super.method1923(var1, var2, var3, var4);
   }

   // $VF: synthetic method
   public static Class9733 method6302(Class1324 var0) {
      return var0.field7002;
   }

   // $VF: synthetic method
   public static void method6303(Class1324 var0) {
      var0.method6296();
   }
}
