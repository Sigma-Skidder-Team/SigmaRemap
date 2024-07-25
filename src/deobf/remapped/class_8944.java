package remapped;

import java.io.DataOutput;
import java.io.IOException;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;

public class class_8944 implements class_8406 {
   public static final class_3265<class_8944> field_45854 = new class_1323();
   public static final class_8944 field_45856 = new class_8944();

   private class_8944() {
   }

   @Override
   public void method_38707(DataOutput var1) throws IOException {
   }

   @Override
   public byte method_38706() {
      return 0;
   }

   @Override
   public class_3265<class_8944> method_38709() {
      return field_45854;
   }

   @Override
   public String toString() {
      return "END";
   }

   public class_8944 method_41084() {
      return this;
   }

   @Override
   public ITextComponent method_38712(String var1, int var2) {
      return StringTextComponent.EMPTY;
   }
}
