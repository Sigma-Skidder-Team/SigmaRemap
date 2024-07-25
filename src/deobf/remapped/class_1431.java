package remapped;

import net.minecraft.util.text.TextFormatting;

public class class_1431 extends class_7164<class_7272, class_4490<class_7272>> {
   private static final Identifier field_7724 = new Identifier("textures/entity/rabbit/brown.png");
   private static final Identifier field_7725 = new Identifier("textures/entity/rabbit/white.png");
   private static final Identifier field_7727 = new Identifier("textures/entity/rabbit/black.png");
   private static final Identifier field_7722 = new Identifier("textures/entity/rabbit/gold.png");
   private static final Identifier field_7728 = new Identifier("textures/entity/rabbit/salt.png");
   private static final Identifier field_7730 = new Identifier("textures/entity/rabbit/white_splotched.png");
   private static final Identifier field_7723 = new Identifier("textures/entity/rabbit/toast.png");
   private static final Identifier field_7729 = new Identifier("textures/entity/rabbit/caerbannog.png");

   public class_1431(EntityRenderDispatcher var1) {
      super(var1, new class_4490<class_7272>(), 0.3F);
   }

   public Identifier method_6576(class_7272 var1) {
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
