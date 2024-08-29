package mapped;

import com.google.common.collect.Sets;
import net.minecraft.client.gui.DialogTexts;
import net.minecraft.util.text.TranslationTextComponent;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;

public class Class1127 extends Screen {
   private final Consumer<Optional<Class5462>> field6166;
   private Class1294 field6167;
   private final Set<Class1180> field6168 = Sets.newHashSet();
   private Class1206 field6169;
   private List<Class9125> field6170;
   private final Class5462 field6171;

   public Class1127(Class5462 var1, Consumer<Optional<Class5462>> var2) {
      super(new TranslationTextComponent("editGamerule.title"));
      this.field6171 = var1;
      this.field6166 = var2;
   }

   @Override
   public void method1921() {
      this.mc.keyboardListener.method36347(true);
      super.method1921();
      this.field6167 = new Class1294(this, this.field6171);
      this.field4561.add(this.field6167);
      this.<Class1206>method2455(
         new Class1206(
            this.field4564 / 2 - 155 + 160, this.field4565 - 29, 150, 20, DialogTexts.GUI_CANCEL, var1 -> this.field6166.accept(Optional.<Class5462>empty())
         )
      );
      this.field6169 = this.<Class1206>method2455(
         new Class1206(
            this.field4564 / 2 - 155, this.field4565 - 29, 150, 20, DialogTexts.field30658, var1 -> this.field6166.accept(Optional.<Class5462>of(this.field6171))
         )
      );
   }

   @Override
   public void onClose() {
      this.mc.keyboardListener.method36347(false);
   }

   @Override
   public void method1945() {
      this.field6166.accept(Optional.<Class5462>empty());
   }

   @Override
   public void method1923(MatrixStack var1, int var2, int var3, float var4) {
      this.field6170 = null;
      this.field6167.method1923(var1, var2, var3, var4);
      method5691(var1, this.fontRenderer, this.field4560, this.field4564 / 2, 20, 16777215);
      super.method1923(var1, var2, var3, var4);
      if (this.field6170 != null) {
         this.method2461(var1, this.field6170, var2, var3);
      }
   }

   private void method5421(List<Class9125> var1) {
      this.field6170 = var1;
   }

   private void method5422() {
      this.field6169.field6482 = this.field6168.isEmpty();
   }

   private void method5423(Class1180 var1) {
      this.field6168.add(var1);
      this.method5422();
   }

   private void method5424(Class1180 var1) {
      this.field6168.remove(var1);
      this.method5422();
   }

   // $VF: synthetic method
   public static void method5427(Class1127 var0, List var1) {
      var0.method5421(var1);
   }

   // $VF: synthetic method
   public static void method5428(Class1127 var0, Class1180 var1) {
      var0.method5424(var1);
   }

   // $VF: synthetic method
   public static void method5429(Class1127 var0, Class1180 var1) {
      var0.method5423(var1);
   }
}
