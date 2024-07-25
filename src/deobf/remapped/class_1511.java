package remapped;

import java.util.UUID;
import javax.annotation.Nullable;

public class class_1511 extends Entity {
   private int field_8003;
   private boolean field_8002;
   private int field_8001 = 22;
   private boolean field_8006;
   private class_5834 field_8005;
   private UUID field_8007;

   public class_1511(class_6629<? extends class_1511> var1, World var2) {
      super(var1, var2);
   }

   public class_1511(World var1, double var2, double var4, double var6, float var8, int var9, class_5834 var10) {
      this(class_6629.field_34309, var1);
      this.field_8003 = var9;
      this.method_6918(var10);
      this.field_41701 = var8 * (180.0F / (float)Math.PI);
      this.method_37256(var2, var4, var6);
   }

   @Override
   public void method_37329() {
   }

   public void method_6918(class_5834 var1) {
      this.field_8005 = var1;
      this.field_8007 = var1 != null ? var1.method_37328() : null;
   }

   @Nullable
   public class_5834 method_6916() {
      if (this.field_8005 == null && this.field_8007 != null && this.field_41768 instanceof class_6331) {
         Entity var3 = ((class_6331)this.field_41768).method_28925(this.field_8007);
         if (var3 instanceof class_5834) {
            this.field_8005 = (class_5834)var3;
         }
      }

      return this.field_8005;
   }

   @Override
   public void method_37314(CompoundNBT var1) {
      this.field_8003 = var1.method_25947("Warmup");
      if (var1.method_25954("Owner")) {
         this.field_8007 = var1.method_25926("Owner");
      }
   }

   @Override
   public void method_37376(CompoundNBT var1) {
      var1.method_25931("Warmup", this.field_8003);
      if (this.field_8007 != null) {
         var1.method_25964("Owner", this.field_8007);
      }
   }

   @Override
   public void method_37123() {
      super.method_37123();
      if (!this.field_41768.field_33055) {
         if (--this.field_8003 < 0) {
            if (this.field_8003 == -8) {
               for (class_5834 var16 : this.field_41768.<class_5834>method_25868(class_5834.class, this.method_37241().method_18899(0.2, 0.0, 0.2))) {
                  this.method_6917(var16);
               }
            }

            if (!this.field_8002) {
               this.field_41768.method_29587(this, (byte)4);
               this.field_8002 = true;
            }

            if (--this.field_8001 < 0) {
               this.method_37204();
            }
         }
      } else if (this.field_8006) {
         this.field_8001--;
         if (this.field_8001 == 14) {
            for (int var17 = 0; var17 < 12; var17++) {
               double var4 = this.method_37302() + (this.field_41717.nextDouble() * 2.0 - 1.0) * (double)this.method_37086() * 0.5;
               double var6 = this.method_37309() + 0.05 + this.field_41717.nextDouble();
               double var8 = this.method_37156() + (this.field_41717.nextDouble() * 2.0 - 1.0) * (double)this.method_37086() * 0.5;
               double var10 = (this.field_41717.nextDouble() * 2.0 - 1.0) * 0.3;
               double var12 = 0.3 + this.field_41717.nextDouble() * 0.3;
               double var14 = (this.field_41717.nextDouble() * 2.0 - 1.0) * 0.3;
               this.field_41768.method_43361(class_3090.field_15322, var4, var6 + 1.0, var8, var10, var12, var14);
            }
         }
      }
   }

   private void method_6917(class_5834 var1) {
      class_5834 var4 = this.method_6916();
      if (var1.method_37330() && !var1.method_37367() && var1 != var4) {
         if (var4 != null) {
            if (var4.method_37344(var1)) {
               return;
            }

            var1.method_37181(class_6199.method_28369(this, var4), 6.0F);
         } else {
            var1.method_37181(class_6199.field_31686, 6.0F);
         }
      }
   }

   @Override
   public void method_37336(byte var1) {
      super.method_37336(var1);
      if (var1 == 4) {
         this.field_8006 = true;
         if (!this.method_37378()) {
            this.field_41768
               .method_29527(
                  this.method_37302(),
                  this.method_37309(),
                  this.method_37156(),
                  class_463.field_2633,
                  this.method_37197(),
                  1.0F,
                  this.field_41717.nextFloat() * 0.2F + 0.85F,
                  false
               );
         }
      }
   }

   public float method_6919(float var1) {
      if (this.field_8006) {
         int var4 = this.field_8001 - 2;
         return var4 > 0 ? 1.0F - ((float)var4 - var1) / 20.0F : 1.0F;
      } else {
         return 0.0F;
      }
   }

   @Override
   public Packet<?> method_37142() {
      return new class_6589(this);
   }
}
