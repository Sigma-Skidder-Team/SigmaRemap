package remapped;

import java.util.UUID;
import org.jetbrains.annotations.Nullable;

public abstract class class_2862 {
   private final Class<? extends class_4106> field_14009;
   private boolean field_14010;

   public class_2862(Class<? extends class_4106> var1) {
      this.field_14009 = var1;
   }

   @Nullable
   public class_1455 method_13106(UUID var1) {
      return class_3446.method_15883().method_33736(var1);
   }

   public boolean method_13108(UUID var1) {
      class_1455 var4 = this.method_13106(var1);
      return var4 != null && (this.field_14009 == null || var4.method_6744().method_17596().method_42441(this.field_14009));
   }

   public abstract void method_13105();

   public Class<? extends class_4106> method_13109() {
      return this.field_14009;
   }

   public boolean method_13110() {
      return this.field_14010;
   }

   public void method_13111(boolean var1) {
      this.field_14010 = var1;
   }
}
