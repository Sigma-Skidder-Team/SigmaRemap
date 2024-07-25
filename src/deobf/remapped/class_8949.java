package remapped;

import net.minecraft.util.text.ITextComponent;

public class class_8949 implements class_5888 {
   private static String[] field_45870;
   private final ITextComponent field_45872;
   private final int field_45874;
   private final int field_45873;
   private final int field_45871;

   public class_8949(ITextComponent var1, int var2, int var3, int var4) {
      this.field_45872 = var1;
      this.field_45874 = var2;
      this.field_45873 = var3;
      this.field_45871 = var4;
   }

   public void method_41093(Screen var1, class_7966 var2) {
      Screen.method_9788(var2, MinecraftClient.getInstance().textRenderer, this.field_45872, this.field_45874, this.field_45873, this.field_45871);
   }

   public String method_41091() {
      return this.field_45872.getString();
   }
}
