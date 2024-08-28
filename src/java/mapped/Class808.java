package mapped;

import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class808 extends Class798 {
   private final Class2134 field4326;
   private final ITextComponent field4327;
   private final ITextComponent field4328;
   public final BooleanConsumer field4329;
   private final boolean field4330;

   public Class808(BooleanConsumer var1, Class2134 var2, ITextComponent var3, ITextComponent var4, boolean var5) {
      this.field4329 = var1;
      this.field4326 = var2;
      this.field4327 = var3;
      this.field4328 = var4;
      this.field4330 = var5;
   }

   @Override
   public void method1921() {
      Class9229.method34713(this.field4326.field13982, this.field4327.getString(), this.field4328.getString());
      if (!this.field4330) {
         this.<Class1206>method2455(
            new Class1206(this.field4564 / 2 - 50, method1929(8), 100, 20, new TranslationTextComponent("mco.gui.ok"), var1 -> this.field4329.accept(true))
         );
      } else {
         this.<Class1206>method2455(new Class1206(this.field4564 / 2 - 105, method1929(8), 100, 20, Class7127.field30660, var1 -> this.field4329.accept(true)));
         this.<Class1206>method2455(new Class1206(this.field4564 / 2 + 5, method1929(8), 100, 20, Class7127.field30661, var1 -> this.field4329.accept(false)));
      }
   }

   @Override
   public boolean method1920(int var1, int var2, int var3) {
      if (var1 != 256) {
         return super.method1920(var1, var2, var3);
      } else {
         this.field4329.accept(false);
         return true;
      }
   }

   @Override
   public void method1923(Class9332 var1, int var2, int var3, float var4) {
      this.method2469(var1);
      method5690(var1, this.field4568, this.field4326.field13982, this.field4564 / 2, method1929(2), this.field4326.field13981);
      method5691(var1, this.field4568, this.field4327, this.field4564 / 2, method1929(4), 16777215);
      method5691(var1, this.field4568, this.field4328, this.field4564 / 2, method1929(6), 16777215);
      super.method1923(var1, var2, var3, var4);
   }
}
