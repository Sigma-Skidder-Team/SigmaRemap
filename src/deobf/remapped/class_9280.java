package remapped;

import javax.annotation.Nullable;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_9280 extends class_6414 {
   private static final ITextComponent field_47341 = new TranslationTextComponent("container.stonecutter");
   public static final class_6162 field_47339 = class_380.field_1543;
   public static final class_4190 field_47340 = class_6414.method_29292(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);

   public class_9280(class_3073 var1) {
      super(var1);
      this.method_29284(this.field_32751.method_36446().method_10308(field_47339, Direction.field_818));
   }

   @Override
   public class_2522 method_29302(class_353 var1) {
      return this.method_29260().method_10308(field_47339, var1.method_21863().method_1046());
   }

   @Override
   public class_6910 method_10777(class_2522 var1, World var2, class_1331 var3, class_704 var4, class_2584 var5, class_9529 var6) {
      if (!var2.field_33055) {
         var4.method_3152(var1.method_8317(var2, var3));
         var4.method_3209(class_6234.field_31880);
         return class_6910.field_35518;
      } else {
         return class_6910.field_35520;
      }
   }

   @Nullable
   @Override
   public class_4259 method_10767(class_2522 var1, World var2, class_1331 var3) {
      return new class_6872((var2x, var3x, var4) -> new class_338(var2x, var3x, class_9210.method_42530(var2, var3)), field_47341);
   }

   @Override
   public class_4190 method_10769(class_2522 var1, class_6163 var2, class_1331 var3, class_214 var4) {
      return field_47340;
   }

   @Override
   public boolean method_10768(class_2522 var1) {
      return true;
   }

   @Override
   public class_7537 method_10788(class_2522 var1) {
      return class_7537.field_38469;
   }

   @Override
   public class_2522 method_10785(class_2522 var1, class_6631 var2) {
      return var1.method_10308(field_47339, var2.method_30489(var1.<Direction>method_10313(field_47339)));
   }

   @Override
   public class_2522 method_10773(class_2522 var1, class_9022 var2) {
      return var1.method_8318(var2.method_41390(var1.<Direction>method_10313(field_47339)));
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_47339);
   }

   @Override
   public boolean method_10793(class_2522 var1, class_6163 var2, class_1331 var3, class_2929 var4) {
      return false;
   }
}
