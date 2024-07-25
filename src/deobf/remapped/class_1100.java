package remapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.ITextComponent$class_40;
import net.minecraft.util.text.TranslationTextComponent;

public class class_1100 extends class_3757 implements class_4259, class_3745 {
   public static final class_1425[][] field_6316 = new class_1425[][]{
      {Effects.field_19739, Effects.field_19735}, {Effects.field_19727, Effects.field_19730}, {Effects.field_19733}, {Effects.field_19742}
   };
   private static final Set<class_1425> field_6324 = Arrays.<class_1425[]>stream(field_6316)
      .<class_1425>flatMap(Arrays::stream)
      .collect(Collectors.<class_1425>toSet());
   private List<class_3080> field_6319 = Lists.newArrayList();
   private List<class_3080> field_6317 = Lists.newArrayList();
   private int field_6318;
   private int field_6325 = -1;
   private class_1425 field_6322;
   private class_1425 field_6323;
   private ITextComponent field_6320;
   private class_3186 field_6321 = class_3186.field_15912;
   private final class_6844 field_6327 = new class_3874(this);

   public class_1100() {
      super(class_133.field_377);
   }

   @Override
   public void method_17353() {
      int var3 = this.field_18358.method_12173();
      int var4 = this.field_18358.method_12165();
      int var5 = this.field_18358.method_12185();
      BlockPos var6;
      if (this.field_6325 >= var4) {
         var6 = new BlockPos(var3, this.field_6325 + 1, var5);
      } else {
         var6 = this.field_18358;
         this.field_6317 = Lists.newArrayList();
         this.field_6325 = var6.method_12165() - 1;
      }

      class_3080 var7 = !this.field_6317.isEmpty() ? this.field_6317.get(this.field_6317.size() - 1) : null;
      int var8 = this.field_18364.method_22562(class_3801.field_18592, var3, var5);

      for (int var9 = 0; var9 < 10 && var6.method_12165() <= var8; var9++) {
         class_2522 var10 = this.field_18364.method_28262(var6);
         class_6414 var11 = var10.method_8360();
         if (!(var11 instanceof class_7431)) {
            if (var7 == null || var10.method_8320(this.field_18364, var6) >= 15 && var11 != class_4783.field_23433) {
               this.field_6317.clear();
               this.field_6325 = var8;
               break;
            }

            var7.method_14114();
         } else {
            float[] var12 = ((class_7431)var11).method_33828().method_41792();
            if (this.field_6317.size() > 1) {
               if (var7 != null) {
                  if (!Arrays.equals(var12, class_3080.method_14110(var7))) {
                     var7 = new class_3080(
                        new float[]{
                           (class_3080.method_14110(var7)[0] + var12[0]) / 2.0F,
                           (class_3080.method_14110(var7)[1] + var12[1]) / 2.0F,
                           (class_3080.method_14110(var7)[2] + var12[2]) / 2.0F
                        }
                     );
                     this.field_6317.add(var7);
                  } else {
                     var7.method_14114();
                  }
               }
            } else {
               var7 = new class_3080(var12);
               this.field_6317.add(var7);
            }
         }

         var6 = var6.method_6081();
         this.field_6325++;
      }

      int var14 = this.field_6318;
      if (this.field_18364.method_29546() % 80L == 0L) {
         if (!this.field_6319.isEmpty()) {
            this.method_4877(var3, var4, var5);
         }

         if (this.field_6318 > 0 && !this.field_6319.isEmpty()) {
            this.method_4890();
            this.method_4883(class_463.field_2501);
         }
      }

      if (this.field_6325 >= var8) {
         this.field_6325 = -1;
         boolean var15 = var14 > 0;
         this.field_6319 = this.field_6317;
         if (!this.field_18364.field_33055) {
            boolean var16 = this.field_6318 > 0;
            if (!var15 && var16) {
               this.method_4883(class_463.field_1928);

               for (class_9359 var13 : this.field_18364
                  .<class_9359>method_25868(
                     class_9359.class,
                     new class_4092((double)var3, (double)var4, (double)var5, (double)var3, (double)(var4 - 4), (double)var5).method_18899(10.0, 5.0, 10.0)
                  )) {
                  class_8807.field_45076.method_9160(var13, this);
               }
            } else if (var15 && !var16) {
               this.method_4883(class_463.field_2636);
            }
         }
      }
   }

   private void method_4877(int var1, int var2, int var3) {
      this.field_6318 = 0;

      for (int var6 = 1; var6 <= 4; this.field_6318 = var6++) {
         int var7 = var2 - var6;
         if (var7 < 0) {
            break;
         }

         boolean var8 = true;

         for (int var9 = var1 - var6; var9 <= var1 + var6 && var8; var9++) {
            for (int var10 = var3 - var6; var10 <= var3 + var6; var10++) {
               if (!this.field_18364.method_28262(new BlockPos(var9, var7, var10)).method_8349(class_2351.field_11729)) {
                  var8 = false;
                  break;
               }
            }
         }

         if (!var8) {
            break;
         }
      }
   }

   @Override
   public void method_17406() {
      this.method_4883(class_463.field_2636);
      super.method_17406();
   }

   private void method_4890() {
      if (!this.field_18364.field_33055 && this.field_6322 != null) {
         double var3 = (double)(this.field_6318 * 10 + 10);
         byte var5 = 0;
         if (this.field_6318 >= 4 && this.field_6322 == this.field_6323) {
            var5 = 1;
         }

         int var6 = (9 + this.field_6318 * 2) * 20;
         class_4092 var7 = new class_4092(this.field_18358).method_18898(var3).method_18928(0.0, (double)this.field_18364.method_28261(), 0.0);
         List var8 = this.field_18364.<class_704>method_25868(class_704.class, var7);

         for (class_704 var10 : var8) {
            var10.method_26558(new class_2250(this.field_6322, var6, var5, true, true));
         }

         if (this.field_6318 >= 4 && this.field_6322 != this.field_6323 && this.field_6323 != null) {
            for (class_704 var12 : var8) {
               var12.method_26558(new class_2250(this.field_6323, var6, 0, true, true));
            }
         }
      }
   }

   public void method_4883(class_8461 var1) {
      this.field_18364.method_43359((class_704)null, this.field_18358, var1, class_562.field_3322, 1.0F, 1.0F);
   }

   public List<class_3080> method_4891() {
      return (List<class_3080>)(this.field_6318 != 0 ? this.field_6319 : ImmutableList.of());
   }

   public int method_4880() {
      return this.field_6318;
   }

   @Nullable
   @Override
   public class_5029 method_17413() {
      return new class_5029(this.field_18358, 3, this.method_17414());
   }

   @Override
   public CompoundNBT method_17414() {
      return this.method_17396(new CompoundNBT());
   }

   @Override
   public double method_17404() {
      return 256.0;
   }

   @Nullable
   private static class_1425 method_4886(int var0) {
      class_1425 var3 = class_1425.method_6538(var0);
      return !field_6324.contains(var3) ? null : var3;
   }

   @Override
   public void method_17394(class_2522 var1, CompoundNBT var2) {
      super.method_17394(var1, var2);
      this.field_6322 = method_4886(var2.method_25947("Primary"));
      this.field_6323 = method_4886(var2.method_25947("Secondary"));
      if (var2.contains("CustomName", 8)) {
         this.field_6320 = ITextComponent$class_40.func_240643_a_(var2.method_25965("CustomName"));
      }

      this.field_6321 = class_3186.method_14664(var2);
   }

   @Override
   public CompoundNBT method_17396(CompoundNBT var1) {
      super.method_17396(var1);
      var1.method_25931("Primary", class_1425.method_6536(this.field_6322));
      var1.method_25931("Secondary", class_1425.method_6536(this.field_6323));
      var1.method_25931("Levels", this.field_6318);
      if (this.field_6320 != null) {
         var1.method_25941("CustomName", ITextComponent$class_40.toJson(this.field_6320));
      }

      this.field_6321.method_14666(var1);
      return var1;
   }

   public void method_4887(ITextComponent var1) {
      this.field_6320 = var1;
   }

   @Nullable
   @Override
   public class_4088 method_11419(int var1, class_7051 var2, class_704 var3) {
      return !class_8346.method_38434(var3, this.field_6321, this.method_19839())
         ? null
         : new class_4034(var1, var2, this.field_6327, class_9210.method_42530(this.field_18364, this.method_17399()));
   }

   @Override
   public ITextComponent method_19839() {
      return (ITextComponent)(this.field_6320 == null ? new TranslationTextComponent("container.beacon") : this.field_6320);
   }
}
