package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.gui.widget.TextFieldWidget;
import net.minecraft.util.text.ITextComponent;

import java.util.List;

public class Class1183 extends Class1182 {
   private final TextFieldWidget field6383;
   public final Class1127 field6384;

   public Class1183(Class1127 c, ITextComponent var1, List<Class9125> var2, String var3, Class7464 var5) {
      super(c, var2, var1);
      this.field6384 = c;
      this.field6383 = new TextFieldWidget(c.mc.fontRenderer, 10, 5, 42, 20, var1.deepCopy().appendString("\n").appendString(var3).appendString("\n"));
      this.field6383.method5635(Integer.toString(var5.method24155()));
      this.field6383.method5631(var2x -> {
         if (!var5.method24158(var2x)) {
            this.field6383.method5662(16711680);
            Class1127.method5429(this.field6384, this);
         } else {
            this.field6383.method5662(14737632);
            Class1127.method5428(this.field6384, this);
         }
      });
      this.field6382.add(this.field6383);
   }

   @Override
   public void render(MatrixStack var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, float var10) {
      this.method5612(var1, var3, var4);
      this.field6383.x = var4 + var5 - 44;
      this.field6383.y = var3;
      this.field6383.render(var1, var7, var8, var10);
   }
}
