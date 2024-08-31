package mapped;

import net.minecraft.client.gui.DialogTexts;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.util.text.ITextComponent;

import java.util.List;

public class Class1184 extends Class1182 {
   private final Button field6386;
   public final Class1127 field6387;

   public Class1184(Class1127 class1127, ITextComponent var1, List<Class9125> var2, String var3,  Class7466 var5) {
      super(class1127, var2, var1);
      this.field6387 = class1127;
      this.field6386 = new Class1225(this, 10, 5, 44, 20, DialogTexts.method22237(var5.method24174()), var1x -> {
         boolean var4x = !var5.method24174();
         var5.method24175(var4x, null);
         var1x.setMessage(DialogTexts.method22237(var5.method24174()));
      }, class1127, var1, var5, var3);
      this.field6382.add(this.field6386);
   }

   @Override
   public void method5544(MatrixStack var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, float var10) {
      this.method5612(var1, var3, var4);
      this.field6386.field6477 = var4 + var5 - 45;
      this.field6386.field6478 = var3;
      this.field6386.render(var1, var7, var8, var10);
   }
}
