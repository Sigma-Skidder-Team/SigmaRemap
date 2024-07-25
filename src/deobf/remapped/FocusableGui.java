package remapped;

import javax.annotation.Nullable;

public abstract class FocusableGui extends AbstractGui implements class_8983 {
   private class_5888 field_10912;
   private boolean field_10913;

   @Override
   public final boolean method_41182() {
      return this.field_10913;
   }

   @Override
   public final void method_41179(boolean var1) {
      this.field_10913 = var1;
   }

   @Nullable
   @Override
   public class_5888 method_41185() {
      return this.field_10912;
   }

   @Override
   public void method_41180(class_5888 var1) {
      this.field_10912 = var1;
   }
}
