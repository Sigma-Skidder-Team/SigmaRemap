package mapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.ITextProperties;

import java.util.List;

public class Class1307 extends Screen {
   private final ITextProperties field6908;
   private final ImmutableList<Class8001> field6909;
   private Class5991 field6910 = Class5991.field26162;
   private int field6911;
   private int field6912;

   public Class1307(ITextComponent var1, List<ITextProperties> var2, ImmutableList<Class8001> var3) {
      super(var1);
      this.field6908 = ITextProperties.func_240654_a_(var2);
      this.field6909 = var3;
   }

   @Override
   public String getNarrationMessage() {
      return super.getNarrationMessage() + ". " + this.field6908.getString();
   }

   @Override
   public void init(Minecraft var1, int var2, int var3) {
      super.init(var1, var2, var3);
      UnmodifiableIterator var6 = this.field6909.iterator();

      while (var6.hasNext()) {
         Class8001 var7 = (Class8001)var6.next();
         this.field6912 = Math.max(this.field6912, 20 + this.fontRenderer.method38821(Class8001.method27333(var7)) + 20);
      }

      int var13 = 5 + this.field6912 + 5;
      int var14 = var13 * this.field6909.size();
      this.field6910 = Class5991.method18584(this.fontRenderer, this.field6908, var14);
      int var8 = this.field6910.method18592() * 9;
      this.field6911 = (int)((double)var3 / 2.0 - (double)var8 / 2.0);
      int var9 = this.field6911 + var8 + 18;
      int var10 = (int)((double)var2 / 2.0 - (double)var14 / 2.0);

      for (UnmodifiableIterator var11 = this.field6909.iterator(); var11.hasNext(); var10 += var13) {
         Class8001 var12 = (Class8001)var11.next();
         this.<Button>addButton(new Button(var10, var9, this.field6912, 20, Class8001.method27333(var12), Class8001.method27334(var12)));
      }
   }

   @Override
   public void render(MatrixStack var1, int var2, int var3, float var4) {
      this.method2471(0);
      drawCenteredString(var1, this.fontRenderer, this.title, this.width / 2, this.field6911 - 18, -1);
      this.field6910.method18588(var1, this.width / 2, this.field6911);
      super.render(var1, var2, var3, var4);
   }

   @Override
   public boolean shouldCloseOnEsc() {
      return false;
   }
}
