package remapped;

import java.util.List;
import java.util.function.Function;
import net.minecraft.util.text.ITextComponent;

public abstract class class_5979 implements class_3178 {
   private final class_5522 field_30481;

   public class_5979(class_5655 var1, class_5522 var2) {
      this.field_30480 = var1;
      this.field_30481 = var2;
   }

   public abstract List<class_5522> method_27281();

   public abstract List<class_5522> method_27285();

   @Override
   public Identifier method_14642() {
      return (Identifier)class_5655.method_25584(this.field_30480).apply(this.field_30481);
   }

   @Override
   public class_2057 method_14657() {
      return this.field_30481.method_25022();
   }

   @Override
   public ITextComponent method_14644() {
      return this.field_30481.method_25033();
   }

   @Override
   public ITextComponent method_14654() {
      return this.field_30481.method_25026();
   }

   @Override
   public class_2541 method_14651() {
      return this.field_30481.method_25025();
   }

   @Override
   public boolean method_14656() {
      return this.field_30481.method_25029();
   }

   @Override
   public boolean method_14646() {
      return this.field_30481.method_25024();
   }

   public void method_27284() {
      this.method_27281().remove(this.field_30481);
      this.field_30481.method_25031().method_5149(this.method_27285(), this.field_30481, Function.<class_5522>identity(), true);
      class_5655.method_25581(this.field_30480).run();
   }

   public void method_27282(int var1) {
      List var4 = this.method_27281();
      int var5 = var4.indexOf(this.field_30481);
      var4.remove(var5);
      var4.add(var5 + var1, this.field_30481);
      class_5655.method_25581(this.field_30480).run();
   }

   @Override
   public boolean method_14648() {
      List var3 = this.method_27281();
      int var4 = var3.indexOf(this.field_30481);
      return var4 > 0 && !((class_5522)var3.get(var4 - 1)).method_25029();
   }

   @Override
   public void method_14647() {
      this.method_27282(-1);
   }

   @Override
   public boolean method_14653() {
      List var3 = this.method_27281();
      int var4 = var3.indexOf(this.field_30481);
      return var4 >= 0 && var4 < var3.size() - 1 && !((class_5522)var3.get(var4 + 1)).method_25029();
   }

   @Override
   public void method_14652() {
      this.method_27282(1);
   }
}
