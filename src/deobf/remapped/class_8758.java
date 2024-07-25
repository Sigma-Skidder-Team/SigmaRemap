package remapped;

import javax.annotation.Nullable;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_8758 extends class_5405 {
   private final Entity field_44817;

   public class_8758(String var1, Entity var2, Entity var3) {
      super(var1, var2);
      this.field_44817 = var3;
   }

   @Nullable
   @Override
   public Entity method_28353() {
      return this.field_27576;
   }

   @Nullable
   @Override
   public Entity method_28372() {
      return this.field_44817;
   }

   @Override
   public ITextComponent method_28362(class_5834 var1) {
      ITextComponent var4 = this.field_44817 != null ? this.field_44817.method_19839() : this.field_27576.method_19839();
      class_6098 var5 = !(this.field_44817 instanceof class_5834) ? class_6098.field_31203 : ((class_5834)this.field_44817).method_26446();
      String var6 = "death.attack." + this.field_31693;
      String var7 = var6 + ".item";
      return !var5.method_28022() && var5.method_28018()
         ? new TranslationTextComponent(var7, var1.method_19839(), var4, var5.method_28001())
         : new TranslationTextComponent(var6, var1.method_19839(), var4);
   }
}
