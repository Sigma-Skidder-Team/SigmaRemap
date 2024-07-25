package net.minecraft.util.text;

import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;

public class KeybindTextComponent extends TextComponent {
   private static Function<String, Supplier<ITextComponent>> displaySupplierFunction = p_193635_0_ -> () -> new StringTextComponent(p_193635_0_);
   private final String keybind;
   private Supplier<ITextComponent> displaySupplier;

   public KeybindTextComponent(String keybind) {
      this.keybind = keybind;
   }

   public static void func_240696_a_(Function<String, Supplier<ITextComponent>> p_240696_0_) {
      displaySupplierFunction = p_240696_0_;
   }

   private ITextComponent func_240698_i_() {
      if (this.displaySupplier == null) {
         this.displaySupplier = displaySupplierFunction.apply(this.keybind);
      }

      return this.displaySupplier.get();
   }

   @Override
   public <T> Optional<T> func_230533_b_(ITextProperties$class_42<T> p_230533_1_) {
      return this.func_240698_i_().<T>func_230438_a_(p_230533_1_);
   }

   @Override
   public <T> Optional<T> func_230534_b_(ITextProperties$class_41<T> p_230534_1_, Style p_230534_2_) {
      return this.func_240698_i_().<T>func_230439_a_(p_230534_1_, p_230534_2_);
   }

   public KeybindTextComponent copyRaw() {
      return new KeybindTextComponent(this.keybind);
   }

   @Override
   public boolean equals(Object p_equals_1_) {
      if (this == p_equals_1_) {
         return true;
      } else if (!(p_equals_1_ instanceof KeybindTextComponent)) {
         return false;
      } else {
         KeybindTextComponent var4 = (KeybindTextComponent)p_equals_1_;
         return this.keybind.equals(var4.keybind) && super.equals(p_equals_1_);
      }
   }

   @Override
   public String toString() {
      return "KeybindComponent{keybind='" + this.keybind + '\'' + ", siblings=" + this.siblings + ", style=" + this.getStyle() + '}';
   }

   public String getKeybind() {
      return this.keybind;
   }
}
