package remapped;

import io.netty.util.internal.ThreadLocalRandom;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_9343 {
   private static final Logger field_47683 = LogManager.getLogger();
   private final double field_47682;
   private final class_9342 field_47681;
   private final Supplier<String> field_47686;
   private final UUID field_47685;

   public class_9343(String var1, double var2, class_9342 var4) {
      this(class_9299.method_42791(ThreadLocalRandom.current()), () -> var1, var2, var4);
   }

   public class_9343(UUID var1, String var2, double var3, class_9342 var5) {
      this(var1, () -> var2, var3, var5);
   }

   public class_9343(UUID var1, Supplier<String> var2, double var3, class_9342 var5) {
      this.field_47685 = var1;
      this.field_47686 = var2;
      this.field_47682 = var3;
      this.field_47681 = var5;
   }

   public UUID method_43122() {
      return this.field_47685;
   }

   public String method_43125() {
      return this.field_47686.get();
   }

   public class_9342 method_43121() {
      return this.field_47681;
   }

   public double method_43123() {
      return this.field_47682;
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 != null && this.getClass() == var1.getClass()) {
            class_9343 var4 = (class_9343)var1;
            return Objects.equals(this.field_47685, var4.field_47685);
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      return this.field_47685.hashCode();
   }

   @Override
   public String toString() {
      return "AttributeModifier{amount="
         + this.field_47682
         + ", operation="
         + this.field_47681
         + ", name='"
         + this.field_47686.get()
         + '\''
         + ", id="
         + this.field_47685
         + '}';
   }

   public CompoundNBT method_43119() {
      CompoundNBT var3 = new CompoundNBT();
      var3.method_25941("Name", this.method_43125());
      var3.method_25923("Amount", this.field_47682);
      var3.method_25931("Operation", this.field_47681.method_43115());
      var3.method_25964("UUID", this.field_47685);
      return var3;
   }

   @Nullable
   public static class_9343 method_43120(CompoundNBT var0) {
      try {
         UUID var3 = var0.method_25926("UUID");
         class_9342 var4 = class_9342.method_43116(var0.method_25947("Operation"));
         return new class_9343(var3, var0.method_25965("Name"), var0.method_25932("Amount"), var4);
      } catch (Exception var5) {
         field_47683.warn("Unable to create attribute: {}", var5.getMessage());
         return null;
      }
   }
}
