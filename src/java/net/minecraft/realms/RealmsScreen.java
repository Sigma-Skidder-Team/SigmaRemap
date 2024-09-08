package net.minecraft.realms;

import mapped.*;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.Widget;

import java.util.List;
import java.util.stream.Collectors;

public abstract class RealmsScreen extends Screen {
   public RealmsScreen() {
      super(NarratorChatListener.field29300);
   }

   public static int method1929(int var0) {
      return 40 + var0 * 13;
   }

   @Override
   public void tick() {
      for (Widget var4 : this.field4566) {
         if (var4 instanceof IScreen) {
            ((IScreen)var4).tick();
         }
      }
   }

   public void func_231411_u_() {
      List var3 = this.field4561
         .stream()
         .filter(RealmsLabel.class::isInstance)
         .<RealmsLabel>map(RealmsLabel.class::cast)
         .<String>map(RealmsLabel::method5543)
         .collect(Collectors.toList());
      Class9229.method34714(var3);
   }
}
