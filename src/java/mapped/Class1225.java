package mapped;

import net.minecraft.client.gui.DialogTexts;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;

public class Class1225 extends Button {
   public final Class1127 field6570;
   public final ITextComponent field6571;
   public final Class7466 field6572;
   public final String field6573;
   public final Class1184 field6574;

   public Class1225(
      Class1184 var1,
      int var2,
      int var3,
      int var4,
      int var5,
      ITextComponent var6,
      Class7192 var7,
      Class1127 var8,
      ITextComponent var9,
      Class7466 var10,
      String var11
   ) {
      super(var2, var3, var4, var5, var6, var7);
      this.field6574 = var1;
      this.field6570 = var8;
      this.field6571 = var9;
      this.field6572 = var10;
      this.field6573 = var11;
   }

   @Override
   public IFormattableTextComponent method5634() {
      return DialogTexts.method22238(this.field6571, this.field6572.method24174()).appendString("\n").appendString(this.field6573);
   }
}
