package remapped;

import net.minecraft.util.text.TextFormatting;

public class class_1431 extends class_7164<class_7272, class_4490<class_7272>> {
   private static final class_4639 field_7724 = new class_4639("textures/entity/rabbit/brown.png");
   private static final class_4639 field_7725 = new class_4639("textures/entity/rabbit/white.png");
   private static final class_4639 field_7727 = new class_4639("textures/entity/rabbit/black.png");
   private static final class_4639 field_7722 = new class_4639("textures/entity/rabbit/gold.png");
   private static final class_4639 field_7728 = new class_4639("textures/entity/rabbit/salt.png");
   private static final class_4639 field_7730 = new class_4639("textures/entity/rabbit/white_splotched.png");
   private static final class_4639 field_7723 = new class_4639("textures/entity/rabbit/toast.png");
   private static final class_4639 field_7729 = new class_4639("textures/entity/rabbit/caerbannog.png");

   public class_1431(class_6122 var1) {
      super(var1, new class_4490<class_7272>(), 0.3F);
   }

   public class_4639 method_6576(class_7272 var1) {
      String var4 = TextFormatting.getTextWithoutFormattingCodes(var1.method_45509().getString());
      if (var4 != null && "Toast".equals(var4)) {
         return field_7723;
      } else {
         switch (var1.method_33239()) {
            case 0:
            default:
               return field_7724;
            case 1:
               return field_7725;
            case 2:
               return field_7727;
            case 3:
               return field_7730;
            case 4:
               return field_7722;
            case 5:
               return field_7728;
            case 99:
               return field_7729;
         }
      }
   }
}
