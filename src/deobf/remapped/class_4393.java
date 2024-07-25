package remapped;

import java.util.Optional;
import java.util.Random;
import java.util.UUID;
import org.apache.commons.lang3.tuple.Pair;

public class class_4393 extends class_2803 implements class_9897 {
   private static final class_7821<String> field_21514 = class_8073.<String>method_36641(class_4393.class, class_2734.field_13349);
   private class_1425 field_21516;
   private int field_21515;
   private UUID field_21517;

   public class_4393(class_6629<? extends class_4393> var1, World var2) {
      super(var1, var2);
   }

   @Override
   public float method_21376(class_1331 var1, class_4924 var2) {
      return !var2.method_28262(var1.method_6100()).method_8350(class_4783.field_23162) ? var2.method_22566(var1) - 0.5F : 10.0F;
   }

   public static boolean method_20460(class_6629<class_4393> var0, class_9379 var1, class_2417 var2, class_1331 var3, Random var4) {
      return var1.method_28262(var3.method_6100()).method_8350(class_4783.field_23162) && var1.method_25261(var3, 0) > 8;
   }

   @Override
   public void method_37384(class_6331 var1, class_900 var2) {
      UUID var5 = var2.method_37328();
      if (!var5.equals(this.field_21517)) {
         this.method_20464(this.method_20463() != class_2066.field_10427 ? class_2066.field_10427 : class_2066.field_10428);
         this.field_21517 = var5;
         this.method_37155(class_463.field_2904, 2.0F, 1.0F);
      }
   }

   @Override
   public void method_37329() {
      super.method_37329();
      this.field_41735.method_36634(field_21514, class_2066.method_9651(class_2066.field_10427));
   }

   @Override
   public class_6910 method_26857(class_704 var1, class_2584 var2) {
      ItemStack var5 = var1.method_26617(var2);
      if (var5.method_27960() == class_4897.field_24454 && !this.method_26449()) {
         boolean var11 = false;
         ItemStack var12;
         if (this.field_21516 == null) {
            var12 = new ItemStack(class_4897.field_24719);
         } else {
            var11 = true;
            var12 = new ItemStack(class_4897.field_24846);
            class_4699.method_21671(var12, this.field_21516, this.field_21515);
            this.field_21516 = null;
            this.field_21515 = 0;
         }

         ItemStack var13 = class_4754.method_21942(var5, var1, var12, false);
         var1.method_26615(var2, var13);
         class_8461 var9;
         if (!var11) {
            var9 = class_463.field_2342;
         } else {
            var9 = class_463.field_2663;
         }

         this.method_37155(var9, 1.0F, 1.0F);
         return class_6910.method_31659(this.field_41768.field_33055);
      } else if (var5.method_27960() == class_4897.field_24853 && this.method_45584()) {
         this.method_45583(class_562.field_3335);
         if (!this.field_41768.field_33055) {
            var5.method_28003(1, var1, var1x -> var1x.method_26447(var2));
         }

         return class_6910.method_31659(this.field_41768.field_33055);
      } else if (this.method_20463() == class_2066.field_10428 && var5.method_27960().method_11250(class_391.field_1644)) {
         if (this.field_21516 == null) {
            Optional var6 = this.method_20462(var5);
            if (!var6.isPresent()) {
               return class_6910.field_35521;
            }

            Pair var7 = (Pair)var6.get();
            if (!var1.field_3876.field_4944) {
               var5.method_27970(1);
            }

            for (int var8 = 0; var8 < 4; var8++) {
               this.field_41768
                  .method_43361(
                     class_3090.field_15338,
                     this.method_37302() + this.field_41717.nextDouble() / 2.0,
                     this.method_37080(0.5),
                     this.method_37156() + this.field_41717.nextDouble() / 2.0,
                     0.0,
                     this.field_41717.nextDouble() / 5.0,
                     0.0
                  );
            }

            this.field_21516 = (class_1425)var7.getLeft();
            this.field_21515 = (Integer)var7.getRight();
            this.method_37155(class_463.field_2248, 2.0F, 1.0F);
         } else {
            for (int var10 = 0; var10 < 2; var10++) {
               this.field_41768
                  .method_43361(
                     class_3090.field_15376,
                     this.method_37302() + this.field_41717.nextDouble() / 2.0,
                     this.method_37080(0.5),
                     this.method_37156() + this.field_41717.nextDouble() / 2.0,
                     0.0,
                     this.field_41717.nextDouble() / 5.0,
                     0.0
                  );
            }
         }

         return class_6910.method_31659(this.field_41768.field_33055);
      } else {
         return super.method_26857(var1, var2);
      }
   }

   @Override
   public void method_45583(class_562 var1) {
      this.field_41768.method_29540((class_704)null, this, class_463.field_2892, var1, 1.0F, 1.0F);
      if (!this.field_41768.method_22567()) {
         ((class_6331)this.field_41768)
            .method_28957(class_3090.field_15339, this.method_37302(), this.method_37080(0.5), this.method_37156(), 1, 0.0, 0.0, 0.0, 0.0);
         this.method_37204();
         class_2803 var4 = class_6629.field_34325.method_30484(this.field_41768);
         var4.method_37144(this.method_37302(), this.method_37309(), this.method_37156(), this.field_41701, this.field_41755);
         var4.method_26456(this.method_26551());
         var4.field_29605 = this.field_29605;
         if (this.method_45507()) {
            var4.method_37303(this.method_45508());
            var4.method_37319(this.method_37135());
         }

         if (this.method_26925()) {
            var4.method_26883();
         }

         var4.method_37289(this.method_37367());
         this.field_41768.method_7509(var4);

         for (int var5 = 0; var5 < 5; var5++) {
            this.field_41768
               .method_7509(
                  new class_91(
                     this.field_41768,
                     this.method_37302(),
                     this.method_37080(1.0),
                     this.method_37156(),
                     new ItemStack(class_2066.method_9650(this.method_20463()).method_8360())
                  )
               );
         }
      }
   }

   @Override
   public boolean method_45584() {
      return this.method_37330() && !this.method_26449();
   }

   @Override
   public void method_37376(class_5734 var1) {
      super.method_37376(var1);
      var1.method_25941("Type", class_2066.method_9651(this.method_20463()));
      if (this.field_21516 != null) {
         var1.method_25921("EffectId", (byte)class_1425.method_6536(this.field_21516));
         var1.method_25931("EffectDuration", this.field_21515);
      }
   }

   @Override
   public void method_37314(class_5734 var1) {
      super.method_37314(var1);
      this.method_20464(class_2066.method_9654(var1.method_25965("Type")));
      if (var1.method_25939("EffectId", 1)) {
         this.field_21516 = class_1425.method_6538(var1.method_25950("EffectId"));
      }

      if (var1.method_25939("EffectDuration", 3)) {
         this.field_21515 = var1.method_25947("EffectDuration");
      }
   }

   private Optional<Pair<class_1425, Integer>> method_20462(ItemStack var1) {
      class_2451 var4 = var1.method_27960();
      if (var4 instanceof class_6201) {
         class_6414 var5 = ((class_6201)var4).method_28392();
         if (var5 instanceof class_8543) {
            class_8543 var6 = (class_8543)var5;
            return Optional.<Pair<class_1425, Integer>>of(Pair.of(var6.method_39321(), var6.method_39322()));
         }
      }

      return Optional.<Pair<class_1425, Integer>>empty();
   }

   private void method_20464(class_2066 var1) {
      this.field_41735.method_36633(field_21514, class_2066.method_9651(var1));
   }

   public class_2066 method_20463() {
      return class_2066.method_9654(this.field_41735.<String>method_36640(field_21514));
   }

   public class_4393 method_20465(class_6331 var1, class_1899 var2) {
      class_4393 var5 = class_6629.field_34269.method_30484(var1);
      var5.method_20464(this.method_20461((class_4393)var2));
      return var5;
   }

   private class_2066 method_20461(class_4393 var1) {
      class_2066 var4 = this.method_20463();
      class_2066 var5 = var1.method_20463();
      class_2066 var6;
      if (var4 == var5 && this.field_41717.nextInt(1024) == 0) {
         var6 = var4 != class_2066.field_10428 ? class_2066.field_10428 : class_2066.field_10427;
      } else {
         var6 = !this.field_41717.nextBoolean() ? var5 : var4;
      }

      return var6;
   }
}
