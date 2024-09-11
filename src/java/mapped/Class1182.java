package mapped;

import com.google.common.collect.Lists;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.util.text.ITextComponent;

import java.util.List;

public abstract class Class1182 extends Class1180 {
   private final List<Class9125> field6381;
   public final List<IGuiEventListener2> field6382;

   public Class1182(Class1127 class1127, List<Class9125> var1, ITextComponent var2) {
      super(class1127, var1);
      this.field6382 = Lists.newArrayList();
      this.field6381 = class1127.mc.fontRenderer.method38828(var2, 175);
   }

   @Override
   public List<? extends IGuiEventListener2> getEventListeners() {
      return this.field6382;
   }

   public void method5612(MatrixStack var1, int var2, int var3) {
      if (this.field6381.size() != 1) {
         if (this.field6381.size() >= 2) {
            this.field6378.mc.fontRenderer.method38804(var1, this.field6381.get(0), (float)var3, (float)var2, 16777215);
            this.field6378.mc.fontRenderer.method38804(var1, this.field6381.get(1), (float)var3, (float)(var2 + 10), 16777215);
         }
      } else {
         this.field6378.mc.fontRenderer.method38804(var1, this.field6381.get(0), (float)var3, (float)(var2 + 5), 16777215);
      }
   }
}
