package mapped;

import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Objects;
import java.util.OptionalInt;
import net.minecraft.util.text.ITextComponent;

public final class InputMappingsInput {
    private final String name;
   private final InputMappingsType type;
   public final int keyCode;
   private final LazyValue<ITextComponent> field_237518_d_;
   public static final Map<String, InputMappingsInput> REGISTRY = Maps.newHashMap();

   public InputMappingsInput(String var1, InputMappingsType var2, int var3) {
      this.name = var1;
      this.type = var2;
      this.keyCode = var3;
      this.field_237518_d_ = new LazyValue<ITextComponent>(() -> (ITextComponent) InputMappingsType.method8203(var2).apply(var3, var1));
      REGISTRY.put(var1, this);
   }

   public InputMappingsType getType() {
      return this.type;
   }

   public int getKeyCode() {
      return this.keyCode;
   }

   public String getTranslationKey() {
      return this.name;
   }

   public ITextComponent func_237520_d_() {
      return this.field_237518_d_.getValue();
   }

   public OptionalInt func_241552_e_() {
      if (this.keyCode >= 48 && this.keyCode <= 57) {
         return OptionalInt.of(this.keyCode - 48);
      } else {
         return this.keyCode >= 320 && this.keyCode <= 329 ? OptionalInt.of(this.keyCode - 320) : OptionalInt.empty();
      }
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         InputMappingsInput var4 = (InputMappingsInput)var1;
         return this.keyCode == var4.keyCode && this.type == var4.type;
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.type, this.keyCode);
   }

   @Override
   public String toString() {
      return this.name;
   }
}
