package remapped;

import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_7772 {
   private static final Logger field_39399 = LogManager.getLogger();
   private final class_6331 field_39389;
   private final Entity field_39387;
   private final int field_39395;
   private final boolean field_39384;
   private final Consumer<Packet<?>> field_39396;
   private long field_39386;
   private long field_39392;
   private long field_39400;
   private int field_39383;
   private int field_39393;
   private int field_39398;
   private class_1343 field_39382 = class_1343.field_7335;
   private int field_39397;
   private int field_39388;
   private List<Entity> field_39385 = Collections.<Entity>emptyList();
   private boolean field_39394;
   private boolean field_39390;

   public class_7772(class_6331 var1, Entity var2, int var3, boolean var4, Consumer<Packet<?>> var5) {
      this.field_39389 = var1;
      this.field_39396 = var5;
      this.field_39387 = var2;
      this.field_39395 = var3;
      this.field_39384 = var4;
      this.method_35256();
      this.field_39383 = class_9299.method_42848(var2.rotationYaw * 256.0F / 360.0F);
      this.field_39393 = class_9299.method_42848(var2.rotationPitch * 256.0F / 360.0F);
      this.field_39398 = class_9299.method_42848(var2.method_37267() * 256.0F / 360.0F);
      this.field_39390 = var2.method_37360();
   }

   public void method_35259() {
      List var3 = this.field_39387.method_37114();
      if (!var3.equals(this.field_39385)) {
         this.field_39385 = var3;
         this.field_39396.accept(new class_4597(this.field_39387));
      }

      if (this.field_39387 instanceof class_7451 && this.field_39397 % 10 == 0) {
         class_7451 var4 = (class_7451)this.field_39387;
         ItemStack var5 = var4.method_33905();
         if (var5.method_27960() instanceof class_2143) {
            class_2134 var6 = class_2143.method_10005(var5, this.field_39389);

            for (class_9359 var8 : this.field_39389.method_25873()) {
               var6.method_9970(var8, var5);
               Packet var9 = ((class_2143)var5.method_27960()).method_28525(var5, this.field_39389, var8);
               if (var9 != null) {
                  var8.field_47794.method_4156(var9);
               }
            }
         }

         this.method_35263();
      }

      if (this.field_39397 % this.field_39395 == 0 || this.field_39387.field_41763 || this.field_39387.method_37372().method_36643()) {
         if (!this.field_39387.isPassenger()) {
            this.field_39388++;
            int var22 = class_9299.method_42848(this.field_39387.rotationYaw * 256.0F / 360.0F);
            int var25 = class_9299.method_42848(this.field_39387.rotationPitch * 256.0F / 360.0F);
            class_1343 var27 = this.field_39387.method_37245().method_6194(class_527.method_2556(this.field_39386, this.field_39392, this.field_39400));
            boolean var28 = var27.method_6221() >= 7.6293945E-6F;
            Object var29 = null;
            boolean var30 = var28 || this.field_39397 % 60 == 0;
            boolean var10 = Math.abs(var22 - this.field_39383) >= 1 || Math.abs(var25 - this.field_39393) >= 1;
            if (this.field_39397 > 0 || this.field_39387 instanceof class_6749) {
               long var11 = class_527.method_2563(var27.field_7336);
               long var13 = class_527.method_2563(var27.field_7333);
               long var15 = class_527.method_2563(var27.field_7334);
               boolean var17 = var11 < -32768L || var11 > 32767L || var13 < -32768L || var13 > 32767L || var15 < -32768L || var15 > 32767L;
               if (var17 || this.field_39388 > 400 || this.field_39394 || this.field_39390 != this.field_39387.method_37360()) {
                  this.field_39390 = this.field_39387.method_37360();
                  this.field_39388 = 0;
                  var29 = new class_2171(this.field_39387);
               } else if ((!var30 || !var10) && !(this.field_39387 instanceof class_6749)) {
                  if (!var30) {
                     if (var10) {
                        var29 = new class_2515(this.field_39387.method_37145(), (byte)var22, (byte)var25, this.field_39387.method_37360());
                     }
                  } else {
                     var29 = new class_8650(
                        this.field_39387.method_37145(), (short)((int)var11), (short)((int)var13), (short)((int)var15), this.field_39387.method_37360()
                     );
                  }
               } else {
                  var29 = new class_1248(
                     this.field_39387.method_37145(),
                     (short)((int)var11),
                     (short)((int)var13),
                     (short)((int)var15),
                     (byte)var22,
                     (byte)var25,
                     this.field_39387.method_37360()
                  );
               }
            }

            if ((this.field_39384 || this.field_39387.field_41763 || this.field_39387 instanceof LivingEntity && ((LivingEntity)this.field_39387).method_26618())
               && this.field_39397 > 0) {
               class_1343 var18 = this.field_39387.method_37098();
               double var19 = var18.method_6204(this.field_39382);
               if (var19 > 1.0E-7 || var19 > 0.0 && var18.method_6221() == 0.0) {
                  this.field_39382 = var18;
                  this.field_39396.accept(new class_4548(this.field_39387.method_37145(), this.field_39382));
               }
            }

            if (var29 != null) {
               this.field_39396.accept((Packet<?>)var29);
            }

            this.method_35263();
            if (var30) {
               this.method_35256();
            }

            if (var10) {
               this.field_39383 = var22;
               this.field_39393 = var25;
            }

            this.field_39394 = false;
         } else {
            int var21 = class_9299.method_42848(this.field_39387.rotationYaw * 256.0F / 360.0F);
            int var24 = class_9299.method_42848(this.field_39387.rotationPitch * 256.0F / 360.0F);
            boolean var26 = Math.abs(var21 - this.field_39383) >= 1 || Math.abs(var24 - this.field_39393) >= 1;
            if (var26) {
               this.field_39396.accept(new class_2515(this.field_39387.method_37145(), (byte)var21, (byte)var24, this.field_39387.method_37360()));
               this.field_39383 = var21;
               this.field_39393 = var24;
            }

            this.method_35256();
            this.method_35263();
            this.field_39394 = true;
         }

         int var23 = class_9299.method_42848(this.field_39387.method_37267() * 256.0F / 360.0F);
         if (Math.abs(var23 - this.field_39398) >= 1) {
            this.field_39396.accept(new class_457(this.field_39387, (byte)var23));
            this.field_39398 = var23;
         }

         this.field_39387.field_41763 = false;
      }

      this.field_39397++;
      if (this.field_39387.field_41743) {
         this.method_35257(new class_4548(this.field_39387));
         this.field_39387.field_41743 = false;
      }
   }

   public void method_35262(class_9359 var1) {
      this.field_39387.method_37212(var1);
      var1.method_43275(this.field_39387);
   }

   public void method_35258(class_9359 var1) {
      this.method_35260(var1.field_47794::method_4156);
      this.field_39387.method_37093(var1);
      var1.method_43288(this.field_39387);
   }

   public void method_35260(Consumer<Packet<?>> var1) {
      if (this.field_39387.field_41751) {
         field_39399.warn("Fetching packet for removed entity " + this.field_39387);
      }

      Packet var4 = this.field_39387.method_37142();
      this.field_39398 = class_9299.method_42848(this.field_39387.method_37267() * 256.0F / 360.0F);
      var1.accept(var4);
      if (!this.field_39387.method_37372().method_36637()) {
         var1.accept(new class_8163(this.field_39387.method_37145(), this.field_39387.method_37372(), true));
      }

      boolean var5 = this.field_39384;
      if (this.field_39387 instanceof LivingEntity) {
         Collection var6 = ((LivingEntity)this.field_39387).method_26590().method_30803();
         if (!var6.isEmpty()) {
            var1.accept(new class_4039(this.field_39387.method_37145(), var6));
         }

         if (((LivingEntity)this.field_39387).method_26618()) {
            var5 = true;
         }
      }

      this.field_39382 = this.field_39387.method_37098();
      if (var5 && !(var4 instanceof class_4228)) {
         var1.accept(new class_4548(this.field_39387.method_37145(), this.field_39382));
      }

      if (this.field_39387 instanceof LivingEntity) {
         ArrayList var12 = Lists.newArrayList();

         for (class_6943 var10 : class_6943.values()) {
            ItemStack var11 = ((LivingEntity)this.field_39387).method_26520(var10);
            if (!var11.method_28022()) {
               var12.add(Pair.of(var10, var11.method_27973()));
            }
         }

         if (!var12.isEmpty()) {
            var1.accept(new class_9014(this.field_39387.method_37145(), var12));
         }
      }

      if (this.field_39387 instanceof LivingEntity) {
         LivingEntity var13 = (LivingEntity)this.field_39387;

         for (class_2250 var16 : var13.method_26503()) {
            var1.accept(new class_1661(this.field_39387.method_37145(), var16));
         }
      }

      if (!this.field_39387.method_37114().isEmpty()) {
         var1.accept(new class_4597(this.field_39387));
      }

      if (this.field_39387.isPassenger()) {
         var1.accept(new class_4597(this.field_39387.getRidingEntity()));
      }

      if (this.field_39387 instanceof MobEntity) {
         MobEntity var14 = (MobEntity)this.field_39387;
         if (var14.method_26920()) {
            var1.accept(new class_2708(var14, var14.method_26922()));
         }
      }
   }

   private void method_35263() {
      class_8073 var3 = this.field_39387.method_37372();
      if (var3.method_36643()) {
         this.method_35257(new class_8163(this.field_39387.method_37145(), var3, false));
      }

      if (this.field_39387 instanceof LivingEntity) {
         Set var4 = ((LivingEntity)this.field_39387).method_26590().method_30813();
         if (!var4.isEmpty()) {
            this.method_35257(new class_4039(this.field_39387.method_37145(), var4));
         }

         var4.clear();
      }
   }

   private void method_35256() {
      this.field_39386 = class_527.method_2563(this.field_39387.getPosX());
      this.field_39392 = class_527.method_2563(this.field_39387.method_37309());
      this.field_39400 = class_527.method_2563(this.field_39387.getPosZ());
   }

   public class_1343 method_35255() {
      return class_527.method_2556(this.field_39386, this.field_39392, this.field_39400);
   }

   private void method_35257(Packet<?> var1) {
      this.field_39396.accept(var1);
      if (this.field_39387 instanceof class_9359) {
         ((class_9359)this.field_39387).field_47794.method_4156(var1);
      }
   }
}
