package remapped;

import java.util.UUID;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;

public class class_4224 implements class_5801 {
   private static final StringTextComponent field_20494 = new StringTextComponent(field_20497[0]);
   private final StringBuffer field_20495 = new StringBuffer();
   private final class_341 field_20496;

   public class_4224(class_341 var1) {
      this.field_20496 = var1;
   }

   public void method_19671() {
      this.field_20495.setLength(0);
   }

   public String method_19670() {
      return this.field_20495.toString();
   }

   public class_9155 method_19669() {
      class_6331 var3 = this.field_20496.method_1736();
      return new class_9155(
         this, class_1343.method_6205(var3.method_28998()), class_4895.field_24322, var3, 4, "Rcon", field_20494, this.field_20496, (Entity)null
      );
   }

   @Override
   public void method_26286(ITextComponent var1, UUID var2) {
      this.field_20495.append(var1.getString());
   }

   @Override
   public boolean method_26287() {
      return true;
   }

   @Override
   public boolean method_26285() {
      return true;
   }

   @Override
   public boolean method_26284() {
      return this.field_20496.method_1626();
   }
}
