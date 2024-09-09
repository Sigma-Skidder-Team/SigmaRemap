package mapped;

import com.google.common.collect.ComparisonChain;
import net.minecraft.entity.LivingEntity;
import net.minecraft.nbt.CompoundNBT;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EffectInstance implements Comparable<EffectInstance> {
   private static final Logger field13133 = LogManager.getLogger();
   private final Effect field13134;
   private int field13135;
   private int field13136;
   private boolean field13137;
   private boolean field13138;
   private boolean field13139;
   private boolean field13140;
   private boolean field13141;
   private EffectInstance field13142;

   public EffectInstance(Effect var1) {
      this(var1, 0, 0);
   }

   public EffectInstance(Effect var1, int var2) {
      this(var1, var2, 0);
   }

   public EffectInstance(Effect var1, int var2, int var3) {
      this(var1, var2, var3, false, true);
   }

   public EffectInstance(Effect var1, int var2, int var3, boolean var4, boolean var5) {
      this(var1, var2, var3, var4, var5, var5);
   }

   public EffectInstance(Effect var1, int var2, int var3, boolean var4, boolean var5, boolean var6) {
      this(var1, var2, var3, var4, var5, var6, (EffectInstance)null);
   }

   public EffectInstance(Effect var1, int var2, int var3, boolean var4, boolean var5, boolean var6, EffectInstance var7) {
      this.field13134 = var1;
      this.field13135 = var2;
      this.field13136 = var3;
      this.field13138 = var4;
      this.field13140 = var5;
      this.field13141 = var6;
      this.field13142 = var7;
   }

   public EffectInstance(EffectInstance var1) {
      this.field13134 = var1.field13134;
      this.method8625(var1);
   }

   public void method8625(EffectInstance var1) {
      this.field13135 = var1.field13135;
      this.field13136 = var1.field13136;
      this.field13138 = var1.field13138;
      this.field13140 = var1.field13140;
      this.field13141 = var1.field13141;
   }

   public boolean method8626(EffectInstance var1) {
      if (this.field13134 != var1.field13134) {
         field13133.warn("This method should only be called for matching effects!");
      }

      boolean var4 = false;
      if (var1.field13136 <= this.field13136) {
         if (var1.field13135 > this.field13135) {
            if (var1.field13136 != this.field13136) {
               if (this.field13142 != null) {
                  this.field13142.method8626(var1);
               } else {
                  this.field13142 = new EffectInstance(var1);
               }
            } else {
               this.field13135 = var1.field13135;
               var4 = true;
            }
         }
      } else {
         if (var1.field13135 < this.field13135) {
            EffectInstance var5 = this.field13142;
            this.field13142 = new EffectInstance(this);
            this.field13142.field13142 = var5;
         }

         this.field13136 = var1.field13136;
         this.field13135 = var1.field13135;
         var4 = true;
      }

      if (!var1.field13138 && this.field13138 || var4) {
         this.field13138 = var1.field13138;
         var4 = true;
      }

      if (var1.field13140 != this.field13140) {
         this.field13140 = var1.field13140;
         var4 = true;
      }

      if (var1.field13141 != this.field13141) {
         this.field13141 = var1.field13141;
         var4 = true;
      }

      return var4;
   }

   public Effect getPotion() {
      return this.field13134;
   }

   public int method8628() {
      return this.field13135;
   }

   public int method8629() {
      return this.field13136;
   }

   public boolean isAmbient() {
      return this.field13138;
   }

   public boolean method8631() {
      return this.field13140;
   }

   public boolean method8632() {
      return this.field13141;
   }

   public boolean method8633(LivingEntity var1, Runnable var2) {
      if (this.field13135 > 0) {
         if (this.field13134.method22291(this.field13135, this.field13136)) {
            this.method8635(var1);
         }

         this.method8634();
         if (this.field13135 == 0 && this.field13142 != null) {
            this.method8625(this.field13142);
            this.field13142 = this.field13142.field13142;
            var2.run();
         }
      }

      return this.field13135 > 0;
   }

   private int method8634() {
      if (this.field13142 != null) {
         this.field13142.method8634();
      }

      return --this.field13135;
   }

   public void method8635(LivingEntity var1) {
      if (this.field13135 > 0) {
         this.field13134.method22289(var1, this.field13136);
      }
   }

   public String method8636() {
      return this.field13134.method22294();
   }

   @Override
   public String toString() {
      String var3;
      if (this.field13136 <= 0) {
         var3 = this.method8636() + ", Duration: " + this.field13135;
      } else {
         var3 = this.method8636() + " x " + (this.field13136 + 1) + ", Duration: " + this.field13135;
      }

      if (this.field13137) {
         var3 = var3 + ", Splash: true";
      }

      if (!this.field13140) {
         var3 = var3 + ", Particles: false";
      }

      if (!this.field13141) {
         var3 = var3 + ", Show Icon: false";
      }

      return var3;
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (!(var1 instanceof EffectInstance)) {
            return false;
         } else {
            EffectInstance var4 = (EffectInstance)var1;
            return this.field13135 == var4.field13135
               && this.field13136 == var4.field13136
               && this.field13137 == var4.field13137
               && this.field13138 == var4.field13138
               && this.field13134.equals(var4.field13134);
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      int var3 = this.field13134.hashCode();
      var3 = 31 * var3 + this.field13135;
      var3 = 31 * var3 + this.field13136;
      var3 = 31 * var3 + (!this.field13137 ? 0 : 1);
      return 31 * var3 + (!this.field13138 ? 0 : 1);
   }

   public CompoundNBT method8637(CompoundNBT var1) {
      var1.method100("Id", (byte) Effect.method22288(this.getPotion()));
      this.method8638(var1);
      return var1;
   }

   private void method8638(CompoundNBT var1) {
      var1.method100("Amplifier", (byte)this.method8629());
      var1.putInt("Duration", this.method8628());
      var1.putBoolean("Ambient", this.isAmbient());
      var1.putBoolean("ShowParticles", this.method8631());
      var1.putBoolean("ShowIcon", this.method8632());
      if (this.field13142 != null) {
         CompoundNBT var4 = new CompoundNBT();
         this.field13142.method8637(var4);
         var1.put("HiddenEffect", var4);
      }
   }

   public static EffectInstance method8639(CompoundNBT var0) {
      byte var3 = var0.getByte("Id");
      Effect var4 = Effect.method22287(var3);
      return var4 != null ? method8640(var4, var0) : null;
   }

   private static EffectInstance method8640(Effect var0, CompoundNBT var1) {
      byte var4 = var1.getByte("Amplifier");
      int var5 = var1.getInt("Duration");
      boolean var6 = var1.getBoolean("Ambient");
      boolean var7 = true;
      if (var1.contains("ShowParticles", 1)) {
         var7 = var1.getBoolean("ShowParticles");
      }

      boolean var8 = var7;
      if (var1.contains("ShowIcon", 1)) {
         var8 = var1.getBoolean("ShowIcon");
      }

      EffectInstance var9 = null;
      if (var1.contains("HiddenEffect", 10)) {
         var9 = method8640(var0, var1.getCompound("HiddenEffect"));
      }

      return new EffectInstance(var0, var5, var4 >= 0 ? var4 : 0, var6, var7, var8, var9);
   }

   public void method8641(boolean var1) {
      this.field13139 = var1;
   }

   public boolean method8642() {
      return this.field13139;
   }

   public int compareTo(EffectInstance var1) {
      short var4 = 32147;
      return this.method8628() > 32147 && var1.method8628() > 32147 || this.isAmbient() && var1.isAmbient()
         ? ComparisonChain.start()
            .compare(this.isAmbient(), var1.isAmbient())
            .compare(this.getPotion().method22297(), var1.getPotion().method22297())
            .result()
         : ComparisonChain.start()
            .compare(this.isAmbient(), var1.isAmbient())
            .compare(this.method8628(), var1.method8628())
            .compare(this.getPotion().method22297(), var1.getPotion().method22297())
            .result();
   }
}
