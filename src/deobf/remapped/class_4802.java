package remapped;

import java.util.function.BiConsumer;
import java.util.function.Predicate;
import net.minecraft.util.text.ITextComponent;

public class class_4802 extends class_1013 {
   private final Predicate<class_8881> field_23996;
   private final BiConsumer<class_8881, Boolean> field_23995;
   private final ITextComponent field_23994;

   public class_4802(String var1, Predicate<class_8881> var2, BiConsumer<class_8881, Boolean> var3) {
      this(var1, (ITextComponent)null, var2, var3);
   }

   public class_4802(String var1, ITextComponent var2, Predicate<class_8881> var3, BiConsumer<class_8881, Boolean> var4) {
      super(var1);
      this.field_23996 = var3;
      this.field_23995 = var4;
      this.field_23994 = var2;
   }

   public void method_22125(class_8881 var1, String var2) {
      this.method_22126(var1, "true".equals(var2));
   }

   public void method_22127(class_8881 var1) {
      this.method_22126(var1, !this.method_22129(var1));
      var1.method_40873();
   }

   private void method_22126(class_8881 var1, boolean var2) {
      this.field_23995.accept(var1, var2);
   }

   public boolean method_22129(class_8881 var1) {
      return this.field_23996.test(var1);
   }

   @Override
   public class_7114 method_4482(class_8881 var1, int var2, int var3, int var4) {
      if (this.field_23994 != null) {
         this.method_4487(MinecraftClient.method_8510().field_9668.method_45391(this.field_23994, 200));
      }

      return new class_2116(var2, var3, var4, 20, this, this.method_22128(var1), var2x -> {
         this.method_22127(var1);
         var2x.method_32687(this.method_22128(var1));
      });
   }

   public ITextComponent method_22128(class_8881 var1) {
      return class_1402.method_6480(this.method_4483(), this.method_22129(var1));
   }
}
