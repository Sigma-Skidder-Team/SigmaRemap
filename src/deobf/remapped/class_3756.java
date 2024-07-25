package remapped;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import javax.annotation.Nullable;

public class class_3756 extends class_3757 implements class_3745 {
   private static final class_6414[] field_18354 = new class_6414[]{
      class_4783.field_23186, class_4783.field_23536, class_4783.field_23329, class_4783.field_23441
   };
   public int field_18349;
   private float field_18350;
   private boolean field_18357;
   private boolean field_18353;
   private final List<BlockPos> field_18352 = Lists.newArrayList();
   private LivingEntity field_18356;
   private UUID field_18351;
   private long field_18348;

   public class_3756() {
      this(class_133.field_375);
   }

   public class_3756(class_133<?> var1) {
      super(var1);
   }

   @Override
   public void method_17394(class_2522 var1, CompoundNBT var2) {
      super.method_17394(var1, var2);
      if (!var2.method_25954("Target")) {
         this.field_18351 = null;
      } else {
         this.field_18351 = var2.method_25926("Target");
      }
   }

   @Override
   public CompoundNBT method_17396(CompoundNBT var1) {
      super.method_17396(var1);
      if (this.field_18356 != null) {
         var1.method_25964("Target", this.field_18356.method_37328());
      }

      return var1;
   }

   @Nullable
   @Override
   public class_5029 method_17413() {
      return new class_5029(this.field_18358, 5, this.method_17414());
   }

   @Override
   public CompoundNBT method_17414() {
      return this.method_17396(new CompoundNBT());
   }

   @Override
   public void method_17353() {
      this.field_18349++;
      long var3 = this.field_18364.method_29546();
      if (var3 % 40L == 0L) {
         this.method_17374(this.method_17373());
         if (!this.field_18364.field_33055 && this.method_17380()) {
            this.method_17378();
            this.method_17379();
         }
      }

      if (var3 % 80L == 0L && this.method_17380()) {
         this.method_17382(class_463.field_2766);
      }

      if (var3 > this.field_18348 && this.method_17380()) {
         this.field_18348 = var3 + 60L + (long)this.field_18364.method_43360().nextInt(40);
         this.method_17382(class_463.field_2356);
      }

      if (this.field_18364.field_33055) {
         this.method_17377();
         this.method_17372();
         if (this.method_17380()) {
            this.field_18350++;
         }
      }
   }

   private boolean method_17373() {
      this.field_18352.clear();

      for (int var3 = -1; var3 <= 1; var3++) {
         for (int var4 = -1; var4 <= 1; var4++) {
            for (int var5 = -1; var5 <= 1; var5++) {
               BlockPos var6 = this.field_18358.method_6104(var3, var4, var5);
               if (!this.field_18364.method_22565(var6)) {
                  return false;
               }
            }
         }
      }

      for (int var15 = -2; var15 <= 2; var15++) {
         for (int var16 = -2; var16 <= 2; var16++) {
            for (int var17 = -2; var17 <= 2; var17++) {
               int var18 = Math.abs(var15);
               int var7 = Math.abs(var16);
               int var8 = Math.abs(var17);
               if ((var18 > 1 || var7 > 1 || var8 > 1)
                  && (var15 == 0 && (var7 == 2 || var8 == 2) || var16 == 0 && (var18 == 2 || var8 == 2) || var17 == 0 && (var18 == 2 || var7 == 2))) {
                  BlockPos var9 = this.field_18358.method_6104(var15, var16, var17);
                  class_2522 var10 = this.field_18364.method_28262(var9);

                  for (class_6414 var14 : field_18354) {
                     if (var10.method_8350(var14)) {
                        this.field_18352.add(var9);
                     }
                  }
               }
            }
         }
      }

      this.method_17383(this.field_18352.size() >= 42);
      return this.field_18352.size() >= 16;
   }

   private void method_17378() {
      int var3 = this.field_18352.size();
      int var4 = var3 / 7 * 16;
      int var5 = this.field_18358.method_12173();
      int var6 = this.field_18358.method_12165();
      int var7 = this.field_18358.method_12185();
      Box var8 = new Box((double)var5, (double)var6, (double)var7, (double)(var5 + 1), (double)(var6 + 1), (double)(var7 + 1))
         .method_18898((double)var4)
         .method_18928(0.0, (double)this.field_18364.method_28261(), 0.0);
      List var9 = this.field_18364.<PlayerEntity>method_25868(PlayerEntity.class, var8);
      if (!var9.isEmpty()) {
         for (PlayerEntity var11 : var9) {
            if (this.field_18358.method_12171(var11.method_37075(), (double)var4) && var11.method_37363()) {
               var11.method_26558(new class_2250(Effects.field_19744, 260, 0, true, true));
            }
         }
      }
   }

   private void method_17379() {
      LivingEntity var3 = this.field_18356;
      int var4 = this.field_18352.size();
      if (var4 >= 42) {
         if (this.field_18356 == null && this.field_18351 != null) {
            this.field_18356 = this.method_17381();
            this.field_18351 = null;
         } else if (this.field_18356 != null) {
            if (!this.field_18356.isAlive() || !this.field_18358.method_12171(this.field_18356.method_37075(), 8.0)) {
               this.field_18356 = null;
            }
         } else {
            List var5 = this.field_18364
               .<LivingEntity>method_25869(LivingEntity.class, this.method_17371(), var0 -> var0 instanceof class_1869 && var0.method_37363());
            if (!var5.isEmpty()) {
               this.field_18356 = (LivingEntity)var5.get(this.field_18364.field_33033.nextInt(var5.size()));
            }
         }
      } else {
         this.field_18356 = null;
      }

      if (this.field_18356 != null) {
         this.field_18364
            .method_29528(
               (PlayerEntity)null,
               this.field_18356.getPosX(),
               this.field_18356.method_37309(),
               this.field_18356.getPosZ(),
               class_463.field_2692,
               class_562.field_3322,
               1.0F,
               1.0F
            );
         this.field_18356.attackEntityFrom(DamageSource.field_31686, 4.0F);
      }

      if (var3 != this.field_18356) {
         class_2522 var6 = this.method_17403();
         this.field_18364.method_29572(this.field_18358, var6, var6, 2);
      }
   }

   private void method_17377() {
      if (this.field_18351 != null) {
         if (this.field_18356 == null || !this.field_18356.method_37328().equals(this.field_18351)) {
            this.field_18356 = this.method_17381();
            if (this.field_18356 == null) {
               this.field_18351 = null;
            }
         }
      } else {
         this.field_18356 = null;
      }
   }

   private Box method_17371() {
      int var3 = this.field_18358.method_12173();
      int var4 = this.field_18358.method_12165();
      int var5 = this.field_18358.method_12185();
      return new Box((double)var3, (double)var4, (double)var5, (double)(var3 + 1), (double)(var4 + 1), (double)(var5 + 1)).method_18898(8.0);
   }

   @Nullable
   private LivingEntity method_17381() {
      List var3 = this.field_18364.<LivingEntity>method_25869(LivingEntity.class, this.method_17371(), var1 -> var1.method_37328().equals(this.field_18351));
      return var3.size() != 1 ? null : (LivingEntity)var3.get(0);
   }

   private void method_17372() {
      Random var3 = this.field_18364.field_33033;
      double var4 = (double)(class_9299.method_42818((float)(this.field_18349 + 35) * 0.1F) / 2.0F + 0.5F);
      var4 = (var4 * var4 + var4) * 0.3F;
      class_1343 var6 = new class_1343(
         (double)this.field_18358.method_12173() + 0.5, (double)this.field_18358.method_12165() + 1.5 + var4, (double)this.field_18358.method_12185() + 0.5
      );

      for (BlockPos var8 : this.field_18352) {
         if (var3.nextInt(50) == 0) {
            float var9 = -0.5F + var3.nextFloat();
            float var10 = -2.0F + var3.nextFloat();
            float var11 = -0.5F + var3.nextFloat();
            BlockPos var12 = var8.method_6093(this.field_18358);
            class_1343 var13 = new class_1343((double)var9, (double)var10, (double)var11)
               .method_6214((double)var12.method_12173(), (double)var12.method_12165(), (double)var12.method_12185());
            this.field_18364
               .method_43361(class_3090.field_15357, var6.field_7336, var6.field_7333, var6.field_7334, var13.field_7336, var13.field_7333, var13.field_7334);
         }
      }

      if (this.field_18356 != null) {
         class_1343 var15 = new class_1343(this.field_18356.getPosX(), this.field_18356.method_37388(), this.field_18356.getPosZ());
         float var16 = (-0.5F + var3.nextFloat()) * (3.0F + this.field_18356.method_37086());
         float var17 = -1.0F + var3.nextFloat() * this.field_18356.method_37074();
         float var18 = (-0.5F + var3.nextFloat()) * (3.0F + this.field_18356.method_37086());
         class_1343 var19 = new class_1343((double)var16, (double)var17, (double)var18);
         this.field_18364
            .method_43361(class_3090.field_15357, var15.field_7336, var15.field_7333, var15.field_7334, var19.field_7336, var19.field_7333, var19.field_7334);
      }
   }

   public boolean method_17380() {
      return this.field_18357;
   }

   public boolean method_17375() {
      return this.field_18353;
   }

   private void method_17374(boolean var1) {
      if (var1 != this.field_18357) {
         this.method_17382(!var1 ? class_463.field_2772 : class_463.field_2404);
      }

      this.field_18357 = var1;
   }

   private void method_17383(boolean var1) {
      this.field_18353 = var1;
   }

   public float method_17376(float var1) {
      return (this.field_18350 + var1) * -0.0375F;
   }

   public void method_17382(class_8461 var1) {
      this.field_18364.method_43359((PlayerEntity)null, this.field_18358, var1, class_562.field_3322, 1.0F, 1.0F);
   }
}
