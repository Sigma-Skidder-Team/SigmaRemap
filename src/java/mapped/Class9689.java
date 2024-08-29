package mapped;

import io.netty.util.internal.ThreadLocalRandom;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class9689 {
   private static final Logger field45301 = LogManager.getLogger();
   private final double field45302;
   private final Class2045 field45303;
   private final Supplier<String> field45304;
   private final UUID field45305;

   public Class9689(String var1, double var2, Class2045 var4) {
      this(MathHelper.method37811(ThreadLocalRandom.current()), () -> var1, var2, var4);
   }

   public Class9689(UUID var1, String var2, double var3, Class2045 var5) {
      this(var1, () -> var2, var3, var5);
   }

   public Class9689(UUID var1, Supplier<String> var2, double var3, Class2045 var5) {
      this.field45305 = var1;
      this.field45304 = var2;
      this.field45302 = var3;
      this.field45303 = var5;
   }

   public UUID method37930() {
      return this.field45305;
   }

   public String method37931() {
      return this.field45304.get();
   }

   public Class2045 method37932() {
      return this.field45303;
   }

   public double method37933() {
      return this.field45302;
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 != null && this.getClass() == var1.getClass()) {
            Class9689 var4 = (Class9689)var1;
            return Objects.equals(this.field45305, var4.field45305);
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      return this.field45305.hashCode();
   }

   @Override
   public String toString() {
      return "AttributeModifier{amount="
         + this.field45302
         + ", operation="
         + this.field45303
         + ", name='"
         + this.field45304.get()
         + '\''
         + ", id="
         + this.field45305
         + '}';
   }

   public CompoundNBT method37934() {
      CompoundNBT var3 = new CompoundNBT();
      var3.method109("Name", this.method37931());
      var3.method108("Amount", this.field45302);
      var3.method102("Operation", this.field45303.method8685());
      var3.method104("UUID", this.field45305);
      return var3;
   }

   @Nullable
   public static Class9689 method37935(CompoundNBT var0) {
      try {
         UUID var3 = var0.method105("UUID");
         Class2045 var4 = Class2045.method8686(var0.method122("Operation"));
         return new Class9689(var3, var0.method126("Name"), var0.method125("Amount"), var4);
      } catch (Exception var5) {
         field45301.warn("Unable to create attribute: {}", var5.getMessage());
         return null;
      }
   }
}
