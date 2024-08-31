package net.minecraft.client.gui.widget.button;

import mapped.Class1233;
import mapped.Class7192;
import mapped.Class9125;
import net.minecraft.client.AbstractOption;
import net.minecraft.util.text.ITextComponent;

import java.util.List;
import java.util.Optional;

public class OptionButton extends Button implements Class1233 {
   private static String[] field6511;
   private final AbstractOption field6577;

   public OptionButton(int var1, int var2, int var3, int var4, AbstractOption var5, ITextComponent var6, Class7192 var7) {
      super(var1, var2, var3, var4, var6, var7);
      this.field6577 = var5;
   }

   public AbstractOption method5809() {
      return this.field6577;
   }

   @Override
   public Optional<List<Class9125>> method5810() {
      return this.field6577.method17951();
   }

   public AbstractOption method5811() {
      return this.field6577;
   }
}
