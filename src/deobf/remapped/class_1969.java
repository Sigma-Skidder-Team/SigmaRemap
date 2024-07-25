package remapped;

import net.minecraft.util.text.ITextComponent;

public class class_1969 extends class_1280<class_9574> {
   private static final Identifier field_9989 = new Identifier("textures/gui/container/smithing.png");

   public class_1969(class_9574 var1, class_7051 var2, ITextComponent var3) {
      super(var1, var2, var3, field_9989);
      this.field_10959 = 60;
      this.field_10971 = 18;
   }

   @Override
   public void method_10221(class_7966 var1, int var2, int var3) {
      RenderSystem.method_16448();
      super.method_10221(var1, var2, var3);
   }
}
