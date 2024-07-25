package remapped;

import net.minecraft.util.text.ITextComponent;

public interface class_3178 {
   Identifier method_14642();

   class_2057 method_14657();

   ITextComponent method_14644();

   ITextComponent method_14654();

   class_2541 method_14651();

   default ITextComponent method_14649() {
      return this.method_14651().method_11573(this.method_14654());
   }

   boolean method_14656();

   boolean method_14646();

   void method_14641();

   void method_14655();

   void method_14647();

   void method_14652();

   boolean method_14645();

   default boolean method_14650() {
      return !this.method_14645();
   }

   default boolean method_14643() {
      return this.method_14645() && !this.method_14646();
   }

   boolean method_14648();

   boolean method_14653();
}
