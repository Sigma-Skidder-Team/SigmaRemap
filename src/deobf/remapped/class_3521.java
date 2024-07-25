package remapped;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class class_3521 {
   private static final Logger field_17257 = LogManager.getLogger();
   private int field_17251 = 20;
   private final List<class_4877> field_17258 = Lists.newArrayList();
   private class_4877 field_17261 = new class_4877();
   private double field_17259;
   private double field_17252;
   private int field_17262 = 200;
   private int field_17255 = 800;
   private int field_17260 = 4;
   private Entity field_17254;
   private int field_17253 = 6;
   private int field_17256 = 16;
   private int field_17263 = 4;

   @Nullable
   private Identifier method_16256() {
      String var3 = this.field_17261.method_22391().method_25965("id");

      try {
         return class_6660.method_30576(var3) ? null : new Identifier(var3);
      } catch (class_7485 var6) {
         class_1331 var5 = this.method_16261();
         field_17257.warn(
            "Invalid entity id '{}' at spawner {}:[{},{},{}]",
            var3,
            this.method_16252().method_29545().method_25499(),
            var5.method_12173(),
            var5.method_12165(),
            var5.method_12185()
         );
         return null;
      }
   }

   public void method_16253(class_6629<?> var1) {
      this.field_17261.method_22391().method_25941("id", class_8669.field_44400.method_39797(var1).toString());
   }

   private boolean method_16259() {
      class_1331 var3 = this.method_16261();
      return this.method_16252()
         .method_25866((double)var3.method_12173() + 0.5, (double)var3.method_12165() + 0.5, (double)var3.method_12185() + 0.5, (double)this.field_17256);
   }

   public void method_16267() {
      if (this.method_16259()) {
         World var3 = this.method_16252();
         class_1331 var4 = this.method_16261();
         if (var3 instanceof class_6331) {
            if (this.field_17251 == -1) {
               this.method_16265();
            }

            if (this.field_17251 > 0) {
               this.field_17251--;
               return;
            }

            boolean var5 = false;

            for (int var6 = 0; var6 < this.field_17260; var6++) {
               CompoundNBT var13 = this.field_17261.method_22391();
               Optional var14 = class_6629.method_30474(var13);
               if (!var14.isPresent()) {
                  this.method_16265();
                  return;
               }

               class_3416 var15 = var13.method_25927("Pos", 6);
               int var16 = var15.size();
               double var17 = var16 < 1
                  ? (double)var4.method_12173() + (var3.field_33033.nextDouble() - var3.field_33033.nextDouble()) * (double)this.field_17263 + 0.5
                  : var15.method_15763(0);
               double var19 = var16 < 2 ? (double)(var4.method_12165() + var3.field_33033.nextInt(3) - 1) : var15.method_15763(1);
               double var21 = var16 < 3
                  ? (double)var4.method_12185() + (var3.field_33033.nextDouble() - var3.field_33033.nextDouble()) * (double)this.field_17263 + 0.5
                  : var15.method_15763(2);
               if (var3.method_6681(((class_6629)var14.get()).method_30456(var17, var19, var21))) {
                  class_6331 var23 = (class_6331)var3;
                  if (class_1136.method_4983((class_6629)var14.get(), var23, class_2417.field_12024, new class_1331(var17, var19, var21), var3.method_43360())) {
                     Entity var24 = class_6629.method_30455(var13, var3, var6x -> {
                        var6x.method_37144(var17, var19, var21, var6x.field_41701, var6x.field_41755);
                        return var6x;
                     });
                     if (var24 == null) {
                        this.method_16265();
                        return;
                     }

                     int var25 = var3.method_25868(
                           var24.getClass(),
                           new class_4092(
                                 (double)var4.method_12173(),
                                 (double)var4.method_12165(),
                                 (double)var4.method_12185(),
                                 (double)(var4.method_12173() + 1),
                                 (double)(var4.method_12165() + 1),
                                 (double)(var4.method_12185() + 1)
                              )
                              .method_18898((double)this.field_17263)
                        )
                        .size();
                     if (var25 >= this.field_17253) {
                        this.method_16265();
                        return;
                     }

                     var24.method_37144(var24.method_37302(), var24.method_37309(), var24.method_37156(), var3.field_33033.nextFloat() * 360.0F, 0.0F);
                     if (var24 instanceof class_5886) {
                        class_5886 var26 = (class_5886)var24;
                        if (!var26.method_26889(var3, class_2417.field_12024) || !var26.method_26855(var3)) {
                           continue;
                        }

                        if (this.field_17261.method_22391().method_25924() == 1 && this.field_17261.method_22391().method_25939("id", 8)) {
                           ((class_5886)var24)
                              .method_26864(var23, var3.method_43368(var24.method_37075()), class_2417.field_12024, (class_8733)null, (CompoundNBT)null);
                        }
                     }

                     if (!var23.method_28933(var24)) {
                        this.method_16265();
                        return;
                     }

                     var3.method_43364(2004, var4, 0);
                     if (var24 instanceof class_5886) {
                        ((class_5886)var24).method_26909();
                     }

                     var5 = true;
                  }
               }
            }

            if (var5) {
               this.method_16265();
            }
         } else {
            double var7 = (double)var4.method_12173() + var3.field_33033.nextDouble();
            double var9 = (double)var4.method_12165() + var3.field_33033.nextDouble();
            double var11 = (double)var4.method_12185() + var3.field_33033.nextDouble();
            var3.method_43361(class_3090.field_15376, var7, var9, var11, 0.0, 0.0, 0.0);
            var3.method_43361(class_3090.field_15321, var7, var9, var11, 0.0, 0.0, 0.0);
            if (this.field_17251 > 0) {
               this.field_17251--;
            }

            this.field_17252 = this.field_17259;
            this.field_17259 = (this.field_17259 + (double)(1000.0F / ((float)this.field_17251 + 200.0F))) % 360.0;
         }
      } else {
         this.field_17252 = this.field_17259;
      }
   }

   private void method_16265() {
      if (this.field_17255 > this.field_17262) {
         int var3 = this.field_17255 - this.field_17262;
         this.field_17251 = this.field_17262 + this.method_16252().field_33033.nextInt(var3);
      } else {
         this.field_17251 = this.field_17262;
      }

      if (!this.field_17258.isEmpty()) {
         this.method_16266(class_6242.<class_4877>method_28510(this.method_16252().field_33033, this.field_17258));
      }

      this.method_16254(1);
   }

   public void method_16255(CompoundNBT var1) {
      this.field_17251 = var1.method_25956("Delay");
      this.field_17258.clear();
      if (var1.method_25939("SpawnPotentials", 9)) {
         class_3416 var4 = var1.method_25927("SpawnPotentials", 10);

         for (int var5 = 0; var5 < var4.size(); var5++) {
            this.field_17258.add(new class_4877(var4.method_15764(var5)));
         }
      }

      if (!var1.method_25939("SpawnData", 10)) {
         if (!this.field_17258.isEmpty()) {
            this.method_16266(class_6242.<class_4877>method_28510(this.method_16252().field_33033, this.field_17258));
         }
      } else {
         this.method_16266(new class_4877(1, var1.method_25937("SpawnData")));
      }

      if (var1.method_25939("MinSpawnDelay", 99)) {
         this.field_17262 = var1.method_25956("MinSpawnDelay");
         this.field_17255 = var1.method_25956("MaxSpawnDelay");
         this.field_17260 = var1.method_25956("SpawnCount");
      }

      if (var1.method_25939("MaxNearbyEntities", 99)) {
         this.field_17253 = var1.method_25956("MaxNearbyEntities");
         this.field_17256 = var1.method_25956("RequiredPlayerRange");
      }

      if (var1.method_25939("SpawnRange", 99)) {
         this.field_17263 = var1.method_25956("SpawnRange");
      }

      if (this.method_16252() != null) {
         this.field_17254 = null;
      }
   }

   public CompoundNBT method_16258(CompoundNBT var1) {
      Identifier var4 = this.method_16256();
      if (var4 == null) {
         return var1;
      } else {
         var1.method_25958("Delay", (short)this.field_17251);
         var1.method_25958("MinSpawnDelay", (short)this.field_17262);
         var1.method_25958("MaxSpawnDelay", (short)this.field_17255);
         var1.method_25958("SpawnCount", (short)this.field_17260);
         var1.method_25958("MaxNearbyEntities", (short)this.field_17253);
         var1.method_25958("RequiredPlayerRange", (short)this.field_17256);
         var1.method_25958("SpawnRange", (short)this.field_17263);
         var1.method_25946("SpawnData", this.field_17261.method_22391().method_25944());
         class_3416 var5 = new class_3416();
         if (!this.field_17258.isEmpty()) {
            for (class_4877 var7 : this.field_17258) {
               var5.add(var7.method_22390());
            }
         } else {
            var5.add(this.field_17261.method_22390());
         }

         var1.method_25946("SpawnPotentials", var5);
         return var1;
      }
   }

   @Nullable
   public Entity method_16260() {
      if (this.field_17254 == null) {
         this.field_17254 = class_6629.method_30455(this.field_17261.method_22391(), this.method_16252(), Function.<Entity>identity());
         if (this.field_17261.method_22391().method_25924() == 1
            && this.field_17261.method_22391().method_25939("id", 8)
            && !(this.field_17254 instanceof class_5886)) {
         }
      }

      return this.field_17254;
   }

   public boolean method_16262(int var1) {
      if (var1 == 1 && this.method_16252().field_33055) {
         this.field_17251 = this.field_17262;
         return true;
      } else {
         return false;
      }
   }

   public void method_16266(class_4877 var1) {
      this.field_17261 = var1;
   }

   public abstract void method_16254(int var1);

   public abstract World method_16252();

   public abstract class_1331 method_16261();

   public double method_16264() {
      return this.field_17259;
   }

   public double method_16263() {
      return this.field_17252;
   }
}
