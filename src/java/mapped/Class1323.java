package mapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

import java.util.Objects;
import java.util.function.Consumer;

public class Class1323 extends Screen {
   private static final ITextComponent field6993 = new TranslationTextComponent("createWorld.customize.buffet.biome");
   private final Screen field6994;
   private final Consumer<Class8907> field6995;
   private final Class2349<Class8907> field6996;
   private Class1283 field6997;
   private Class8907 field6998;
   private Class1206 field6999;

   public Class1323(Screen var1, Class8904 var2, Consumer<Class8907> var3, Class8907 var4) {
      super(new TranslationTextComponent("createWorld.customize.buffet.title"));
      this.field6994 = var1;
      this.field6995 = var3;
      this.field6998 = var4;
      this.field6996 = var2.<Class8907>method32453(Class2348.field16106);
   }

   @Override
   public void method1945() {
      this.field4562.displayGuiScreen(this.field6994);
   }

   @Override
   public void method1921() {
      this.field4562.field1302.method36347(true);
      this.field6997 = new Class1283(this);
      this.field4561.add(this.field6997);
      this.field6999 = this.<Class1206>method2455(new Class1206(this.field4564 / 2 - 155, this.field4565 - 28, 150, 20, Class7127.field30658, var1 -> {
         this.field6995.accept(this.field6998);
         this.field4562.displayGuiScreen(this.field6994);
      }));
      this.<Class1206>method2455(
         new Class1206(this.field4564 / 2 + 5, this.field4565 - 28, 150, 20, Class7127.field30659, var1 -> this.field4562.displayGuiScreen(this.field6994))
      );
      this.field6997
         .method6024(
            this.field6997.method2468().stream().filter(var1 -> Objects.equals(Class1176.method5602(var1), this.field6998)).findFirst().orElse((Class1176)null)
         );
   }

   private void method6287() {
      this.field6999.field6482 = this.field6997.method6023() != null;
   }

   @Override
   public void method1923(Class9332 var1, int var2, int var3, float var4) {
      this.method2471(0);
      this.field6997.method1923(var1, var2, var3, var4);
      method5691(var1, this.field4568, this.field4560, this.field4564 / 2, 8, 16777215);
      method5691(var1, this.field4568, field6993, this.field4564 / 2, 28, 10526880);
      super.method1923(var1, var2, var3, var4);
   }

   // $VF: synthetic method
   public static Class2349<Class8907> method6291(Class1323 var0) {
      return var0.field6996;
   }

   // $VF: synthetic method
   public static Class8907 method6292(Class1323 var0, Class8907 var1) {
      return var0.field6998 = var1;
   }

   // $VF: synthetic method
   public static void method6293(Class1323 var0) {
      var0.method6287();
   }
}
