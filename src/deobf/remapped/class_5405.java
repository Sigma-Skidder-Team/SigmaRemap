package remapped;

import javax.annotation.Nullable;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_5405 extends DamageSource {
   public final Entity field_27576;
   private boolean field_27578;

   public class_5405(String var1, Entity var2) {
      super(var1);
      this.field_27576 = var2;
   }

   public class_5405 method_24599() {
      this.field_27578 = true;
      return this;
   }

   public boolean method_24600() {
      return this.field_27578;
   }

   @Nullable
   @Override
   public Entity method_28372() {
      return this.field_27576;
   }

   @Override
   public ITextComponent method_28362(class_5834 var1) {
      ItemStack var4 = !(this.field_27576 instanceof class_5834) ? ItemStack.EMPTY : ((class_5834)this.field_27576).method_26446();
      String var5 = "death.attack." + this.field_31693;
      return !var4.method_28022() && var4.method_28018()
         ? new TranslationTextComponent(var5 + ".item", var1.method_19839(), this.field_27576.method_19839(), var4.method_28001())
         : new TranslationTextComponent(var5, var1.method_19839(), this.field_27576.method_19839());
   }

   @Override
   public boolean method_28374() {
      return this.field_27576 != null && this.field_27576 instanceof class_5834 && !(this.field_27576 instanceof class_704);
   }

   @Nullable
   @Override
   public class_1343 method_28365() {
      return this.field_27576 == null ? null : this.field_27576.method_37245();
   }

   @Override
   public String toString() {
      return "EntityDamageSource (" + this.field_27576 + ")";
   }
}
