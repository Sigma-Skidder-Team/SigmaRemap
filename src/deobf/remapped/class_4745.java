package remapped;

import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;

public class class_4745 extends class_4314 {
   private static final class_240[] field_22990 = new class_240[]{class_240.field_809, class_240.field_804, class_240.field_800};
   public static final class_6162 field_22991 = class_380.field_1543;
   public static final class_7044 field_22992 = class_6023.field_30749;

   public class_4745(class_3073 var1) {
      super(var1);
      this.method_29284(this.field_32751.method_36446().method_10308(field_22992, Integer.valueOf(0)).method_10308(field_22991, class_240.field_818));
   }

   @Override
   public boolean method_10770(class_2522 var1) {
      return true;
   }

   @Override
   public int method_10795(class_2522 var1, class_6486 var2, class_1331 var3) {
      return var1.<Integer>method_10313(field_22992);
   }

   @Override
   public void method_29298(class_6486 var1, class_704 var2, class_1331 var3, class_2522 var4, class_3757 var5, class_6098 var6) {
      super.method_29298(var1, var2, var3, var4, var5, var6);
      if (!var1.field_33055 && var5 instanceof class_5354) {
         class_5354 var9 = (class_5354)var5;
         if (class_2931.method_13423(class_3668.field_17870, var6) == 0) {
            var9.method_24447(var2, var4, class_8771.field_44900);
            var1.method_29523(var3, this);
            this.method_21917(var1, var3);
         }

         class_8807.field_45040.method_26171((class_9359)var2, var4.method_8360(), var6, var9.method_24448());
      }
   }

   private void method_21917(class_6486 var1, class_1331 var2) {
      List var5 = var1.<class_8829>method_25868(class_8829.class, new class_4092(var2).method_18899(8.0, 6.0, 8.0));
      if (!var5.isEmpty()) {
         List var6 = var1.<class_704>method_25868(class_704.class, new class_4092(var2).method_18899(8.0, 6.0, 8.0));
         int var7 = var6.size();

         for (class_8829 var9 : var5) {
            if (var9.method_17809() == null) {
               var9.method_26860((class_5834)var6.get(var1.field_33033.nextInt(var7)));
            }
         }
      }
   }

   public static void method_21913(class_6486 var0, class_1331 var1) {
      method_29267(var0, var1, new class_6098(class_4897.field_24747, 3));
   }

   @Override
   public class_6910 method_10777(class_2522 var1, class_6486 var2, class_1331 var3, class_704 var4, class_2584 var5, class_9529 var6) {
      class_6098 var9 = var4.method_26617(var5);
      int var10 = var1.<Integer>method_10313(field_22992);
      boolean var11 = false;
      if (var10 >= 5) {
         if (var9.method_27960() != class_4897.field_24853) {
            if (var9.method_27960() == class_4897.field_24812) {
               var9.method_27970(1);
               var2.method_29528(var4, var4.method_37302(), var4.method_37309(), var4.method_37156(), class_463.field_2054, class_562.field_3328, 1.0F, 1.0F);
               if (!var9.method_28022()) {
                  if (!var4.field_3853.method_32414(new class_6098(class_4897.field_24773))) {
                     var4.method_3153(new class_6098(class_4897.field_24773), false);
                  }
               } else {
                  var4.method_26615(var5, new class_6098(class_4897.field_24773));
               }

               var11 = true;
            }
         } else {
            var2.method_29528(var4, var4.method_37302(), var4.method_37309(), var4.method_37156(), class_463.field_2271, class_562.field_3328, 1.0F, 1.0F);
            method_21913(var2, var3);
            var9.method_28003(1, var4, var1x -> var1x.method_26447(var5));
            var11 = true;
         }
      }

      if (!var11) {
         return super.method_10777(var1, var2, var3, var4, var5, var6);
      } else {
         if (class_8474.method_39005(var2, var3)) {
            this.method_21919(var2, var1, var3);
         } else {
            if (this.method_21918(var2, var3)) {
               this.method_21917(var2, var3);
            }

            this.method_21920(var2, var1, var3, var4, class_8771.field_44900);
         }

         return class_6910.method_31659(var2.field_33055);
      }
   }

   private boolean method_21918(class_6486 var1, class_1331 var2) {
      class_3757 var5 = var1.method_28260(var2);
      if (!(var5 instanceof class_5354)) {
         return false;
      } else {
         class_5354 var6 = (class_5354)var5;
         return !var6.method_24452();
      }
   }

   public void method_21920(class_6486 var1, class_2522 var2, class_1331 var3, class_704 var4, class_8771 var5) {
      this.method_21919(var1, var2, var3);
      class_3757 var8 = var1.method_28260(var3);
      if (var8 instanceof class_5354) {
         class_5354 var9 = (class_5354)var8;
         var9.method_24447(var4, var2, var5);
      }
   }

   public void method_21919(class_6486 var1, class_2522 var2, class_1331 var3) {
      var1.method_7513(var3, var2.method_10308(field_22992, Integer.valueOf(0)), 3);
   }

   @Override
   public void method_29280(class_2522 var1, class_6486 var2, class_1331 var3, Random var4) {
      if (var1.<Integer>method_10313(field_22992) >= 5) {
         for (int var7 = 0; var7 < var4.nextInt(1) + 1; var7++) {
            this.method_21915(var2, var3, var1);
         }
      }
   }

   private void method_21915(class_6486 var1, class_1331 var2, class_2522 var3) {
      if (var3.method_8364().method_22001() && !(var1.field_33033.nextFloat() < 0.3F)) {
         class_4190 var6 = var3.method_8324(var1, var2);
         double var7 = var6.method_19495(class_9249.field_47216);
         if (var7 >= 1.0 && !var3.method_8349(class_2351.field_11735)) {
            double var9 = var6.method_19491(class_9249.field_47216);
            if (!(var9 > 0.0)) {
               class_1331 var11 = var2.method_6100();
               class_2522 var12 = var1.method_28262(var11);
               class_4190 var13 = var12.method_8324(var1, var11);
               double var14 = var13.method_19495(class_9249.field_47216);
               if ((var14 < 1.0 || !var12.method_8306(var1, var11)) && var12.method_8364().method_22001()) {
                  this.method_21916(var1, var2, var6, (double)var2.method_12165() - 0.05);
               }
            } else {
               this.method_21916(var1, var2, var6, (double)var2.method_12165() + var9 - 0.05);
            }
         }
      }
   }

   private void method_21916(class_6486 var1, class_1331 var2, class_4190 var3, double var4) {
      this.method_21914(
         var1,
         (double)var2.method_12173() + var3.method_19491(class_9249.field_47215),
         (double)var2.method_12173() + var3.method_19495(class_9249.field_47215),
         (double)var2.method_12185() + var3.method_19491(class_9249.field_47219),
         (double)var2.method_12185() + var3.method_19495(class_9249.field_47219),
         var4
      );
   }

   private void method_21914(class_6486 var1, double var2, double var4, double var6, double var8, double var10) {
      var1.method_43361(
         class_3090.field_15316,
         class_9299.method_42794(var1.field_33033.nextDouble(), var2, var4),
         var10,
         class_9299.method_42794(var1.field_33033.nextDouble(), var6, var8),
         0.0,
         0.0,
         0.0
      );
   }

   @Override
   public class_2522 method_29302(class_353 var1) {
      return this.method_29260().method_10308(field_22991, var1.method_21863().method_1046());
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_22992, field_22991);
   }

   @Override
   public class_7537 method_10788(class_2522 var1) {
      return class_7537.field_38469;
   }

   @Nullable
   @Override
   public class_3757 method_3281(class_6163 var1) {
      return new class_5354();
   }

   @Override
   public void method_29265(class_6486 var1, class_1331 var2, class_2522 var3, class_704 var4) {
      if (!var1.field_33055 && var4.method_3186() && var1.method_29537().method_1285(class_291.field_1058)) {
         class_3757 var7 = var1.method_28260(var2);
         if (var7 instanceof class_5354) {
            class_5354 var8 = (class_5354)var7;
            class_6098 var9 = new class_6098(this);
            int var10 = var3.<Integer>method_10313(field_22992);
            boolean var11 = !var8.method_24452();
            if (!var11 && var10 == 0) {
               return;
            }

            if (var11) {
               class_5734 var12 = new class_5734();
               var12.method_25946("Bees", var8.method_24439());
               var9.method_27954("BlockEntityTag", var12);
            }

            class_5734 var14 = new class_5734();
            var14.method_25931("honey_level", var10);
            var9.method_27954("BlockStateTag", var14);
            class_91 var13 = new class_91(var1, (double)var2.method_12173(), (double)var2.method_12165(), (double)var2.method_12185(), var9);
            var13.method_257();
            var1.method_7509(var13);
         }
      }

      super.method_29265(var1, var2, var3, var4);
   }

   @Override
   public List<class_6098> method_10796(class_2522 var1, class_8480 var2) {
      class_8145 var5 = var2.<class_8145>method_39071(class_8712.field_44676);
      if (var5 instanceof class_1356 || var5 instanceof class_9490 || var5 instanceof class_1044 || var5 instanceof class_4653 || var5 instanceof class_2048) {
         class_3757 var6 = var2.<class_3757>method_39071(class_8712.field_44673);
         if (var6 instanceof class_5354) {
            class_5354 var7 = (class_5354)var6;
            var7.method_24447((class_704)null, var1, class_8771.field_44900);
         }
      }

      return super.method_10796(var1, var2);
   }

   @Override
   public class_2522 method_10763(class_2522 var1, class_240 var2, class_2522 var3, class_9379 var4, class_1331 var5, class_1331 var6) {
      if (var4.method_28262(var6).method_8360() instanceof class_1878) {
         class_3757 var9 = var4.method_28260(var5);
         if (var9 instanceof class_5354) {
            class_5354 var10 = (class_5354)var9;
            var10.method_24447((class_704)null, var1, class_8771.field_44900);
         }
      }

      return super.method_10763(var1, var2, var3, var4, var5, var6);
   }

   public static class_240 method_21912(Random var0) {
      return Util.<class_240>method_44697(field_22990, var0);
   }
}
