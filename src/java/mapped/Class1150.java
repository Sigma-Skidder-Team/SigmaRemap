package mapped;

import net.minecraft.client.gui.AbstractGui;

import javax.annotation.Nullable;

public abstract class Class1150 extends AbstractGui implements Class1151 {
   private Class1152 field6288;
   private boolean field6289;

   @Override
   public final boolean method5531() {
      return this.field6289;
   }

   @Override
   public final void method5532(boolean var1) {
      this.field6289 = var1;
   }

   @Nullable
   @Override
   public Class1152 method5533() {
      return this.field6288;
   }

   @Override
   public void method5534(Class1152 var1) {
      this.field6288 = var1;
   }
}
