package net.minecraft.entity.ai.attributes;

import io.netty.util.internal.ThreadLocalRandom;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Supplier;
import javax.annotation.Nullable;

import net.minecraft.util.math.MathHelper;
import net.minecraft.nbt.CompoundNBT;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AttributeModifier {
   private static final Logger field45301 = LogManager.getLogger();
   private final double field45302;
   private final Operation field45303;
   private final Supplier<String> field45304;
   private final UUID field45305;

   public AttributeModifier(String var1, double var2, Operation var4) {
      this(MathHelper.getRandomUUID(ThreadLocalRandom.current()), () -> var1, var2, var4);
   }

   public AttributeModifier(UUID var1, String var2, double var3, Operation var5) {
      this(var1, () -> var2, var3, var5);
   }

   public AttributeModifier(UUID var1, Supplier<String> var2, double var3, Operation var5) {
      this.field45305 = var1;
      this.field45304 = var2;
      this.field45302 = var3;
      this.field45303 = var5;
   }

   public UUID getID() {
      return this.field45305;
   }

   public String method37931() {
      return this.field45304.get();
   }

   public Operation getOperation() {
      return this.field45303;
   }

   public double getAmount() {
      return this.field45302;
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 != null && this.getClass() == var1.getClass()) {
            AttributeModifier var4 = (AttributeModifier)var1;
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
      var3.putInt("Operation", this.field45303.getId());
      var3.method104("UUID", this.field45305);
      return var3;
   }

   @Nullable
   public static AttributeModifier method37935(CompoundNBT var0) {
      try {
         UUID var3 = var0.method105("UUID");
         Operation var4 = Operation.byId(var0.getInt("Operation"));
         return new AttributeModifier(var3, var0.getString("Name"), var0.getDouble("Amount"), var4);
      } catch (Exception var5) {
         field45301.warn("Unable to create attribute: {}", var5.getMessage());
         return null;
      }
   }

   public enum Operation {
      ADDITION(0),
      field13353(1),
      MULTIPLY_TOTAL(2);

      private static final Operation[] field13355 = new Operation[]{ADDITION, field13353, MULTIPLY_TOTAL};
      private final int field13356;
      private static final Operation[] field13357 = new Operation[]{ADDITION, field13353, MULTIPLY_TOTAL};

      private Operation(int var3) {
         this.field13356 = var3;
      }

      public int getId() {
         return this.field13356;
      }

      public static Operation byId(int var0) {
         if (var0 >= 0 && var0 < field13355.length) {
            return field13355[var0];
         } else {
            throw new IllegalArgumentException("No operation with value " + var0);
         }
      }
   }
}
