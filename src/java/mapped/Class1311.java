package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.gui.DialogTexts;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.Widget;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.util.text.ITextComponent;

public class Class1311 extends Screen {
   private static String[] field6917;
   private final Runnable field6918;
   public final ITextComponent field6919;
   private Class5991 field6920 = Class5991.field26162;
   public final ITextComponent field6921;
   private int field6922;

   public Class1311(Runnable var1, ITextComponent var2, ITextComponent var3) {
      this(var1, var2, var3, DialogTexts.field30663);
   }

   public Class1311(Runnable var1, ITextComponent var2, ITextComponent var3, ITextComponent var4) {
      super(var2);
      this.field6918 = var1;
      this.field6919 = var3;
      this.field6921 = var4;
   }

   @Override
   public void init() {
      super.init();
      this.<Button>addButton(new Button(this.width / 2 - 100, this.height / 6 + 168, 200, 20, this.field6921, var1 -> this.field6918.run()));
      this.field6920 = Class5991.method18584(this.font, this.field6919, this.width - 50);
   }

   @Override
   public void render(MatrixStack var1, int var2, int var3, float var4) {
      this.renderBackground(var1);
      drawCenteredString(var1, this.font, this.title, this.width / 2, 70, 16777215);
      this.field6920.method18588(var1, this.width / 2, 90);
      super.render(var1, var2, var3, var4);
   }

   @Override
   public void tick() {
      super.tick();
      if (--this.field6922 == 0) {
         for (Widget var4 : this.field4566) {
            var4.active = true;
         }
      }
   }
}
