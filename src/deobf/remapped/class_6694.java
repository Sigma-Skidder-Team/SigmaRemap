package remapped;

import java.util.EnumSet;
import java.util.Optional;
import java.util.function.Predicate;

public class class_6694 extends class_958 {
   private static String[] field_34582;
   private final Predicate<class_2522> field_34588;
   private int field_34586;
   private int field_34584;
   private boolean field_34589;
   private Vector3d field_34587;
   private int field_34585;

   public class_6694(class_8829 var1) {
      super(var1, null);
      this.field_34583 = var1;
      this.field_34588 = var0 -> {
         if (!var0.method_8349(class_2351.field_11741)) {
            return var0.method_8349(class_2351.field_11726);
         } else {
            return !var0.method_8350(class_4783.field_23554) ? true : var0.<class_7422>method_10313(class_3064.field_15063) == class_7422.field_37874;
         }
      };
      this.field_34586 = 0;
      this.field_34584 = 0;
      this.field_34585 = 0;
      this.method_16800(EnumSet.<Flag>of(Flag.MOVE));
   }

   @Override
   public boolean method_4213() {
      if (class_8829.method_40606(this.field_34583) <= 0) {
         if (!this.field_34583.method_40592()) {
            if (!this.field_34583.field_41768.method_29561()) {
               if (!(class_8829.method_40576(this.field_34583).nextFloat() < 0.7F)) {
                  Optional var3 = this.method_30685();
                  if (!var3.isPresent()) {
                     return false;
                  } else {
                     class_8829.method_40600(this.field_34583, (BlockPos)var3.get());
                     class_8829.method_40602(this.field_34583)
                        .method_5595(
                           (double)class_8829.method_40554(this.field_34583).method_12173() + 0.5,
                           (double)class_8829.method_40554(this.field_34583).method_12165() + 0.5,
                           (double)class_8829.method_40554(this.field_34583).method_12185() + 0.5,
                           1.2F
                        );
                     return true;
                  }
               } else {
                  return false;
               }
            } else {
               return false;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   @Override
   public boolean method_4214() {
      if (this.field_34589) {
         if (this.field_34583.method_40603()) {
            if (!this.field_34583.field_41768.method_29561()) {
               if (!this.method_30687()) {
                  if (this.field_34583.field_41697 % 20 == 0 && !class_8829.method_40621(this.field_34583, class_8829.method_40554(this.field_34583))) {
                     class_8829.method_40600(this.field_34583, null);
                     return false;
                  } else {
                     return true;
                  }
               } else {
                  return class_8829.method_40597(this.field_34583).nextFloat() < 0.2F;
               }
            } else {
               return false;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private boolean method_30687() {
      return this.field_34586 > 400;
   }

   private boolean method_30683() {
      return this.field_34589;
   }

   private void method_30684() {
      this.field_34589 = false;
   }

   @Override
   public void method_16796() {
      this.field_34586 = 0;
      this.field_34585 = 0;
      this.field_34584 = 0;
      this.field_34589 = true;
      this.field_34583.method_40584();
   }

   @Override
   public void method_16793() {
      if (this.method_30687()) {
         class_8829.method_40589(this.field_34583, true);
      }

      this.field_34589 = false;
      class_8829.method_40563(this.field_34583).method_5620();
      class_8829.method_40626(this.field_34583, 200);
   }

   @Override
   public void method_16794() {
      this.field_34585++;
      if (this.field_34585 <= 600) {
         Vector3d var3 = Vector3d.method_6200(class_8829.method_40554(this.field_34583)).method_6214(0.0, 0.6F, 0.0);
         if (!(var3.method_6195(this.field_34583.method_37245()) > 1.0)) {
            if (this.field_34587 == null) {
               this.field_34587 = var3;
            }

            boolean var4 = this.field_34583.method_37245().method_6195(this.field_34587) <= 0.1;
            boolean var5 = true;
            if (!var4 && this.field_34585 > 600) {
               class_8829.method_40600(this.field_34583, null);
            } else {
               if (var4) {
                  boolean var6 = class_8829.method_40574(this.field_34583).nextInt(25) == 0;
                  if (!var6) {
                     var5 = false;
                  } else {
                     this.field_34587 = new Vector3d(
                        var3.method_61() + (double)this.method_30691(), var3.method_60(), var3.method_62() + (double)this.method_30691()
                     );
                     class_8829.method_40575(this.field_34583).method_5620();
                  }

                  this.field_34583.method_26865().method_17230(var3.method_61(), var3.method_60(), var3.method_62());
               }

               if (var5) {
                  this.method_30688();
               }

               this.field_34586++;
               if (class_8829.method_40546(this.field_34583).nextFloat() < 0.05F && this.field_34586 > this.field_34584 + 60) {
                  this.field_34584 = this.field_34586;
                  this.field_34583.method_37155(SoundEvents.field_2250, 1.0F, 1.0F);
               }
            }
         } else {
            this.field_34587 = var3;
            this.method_30688();
         }
      } else {
         class_8829.method_40600(this.field_34583, null);
      }
   }

   private void method_30688() {
      this.field_34583.method_26905().method_12879(this.field_34587.method_61(), this.field_34587.method_60(), this.field_34587.method_62(), 0.35F);
   }

   private float method_30691() {
      return (class_8829.method_40608(this.field_34583).nextFloat() * 2.0F - 1.0F) * 0.33333334F;
   }

   private Optional<BlockPos> method_30685() {
      return this.method_30690(this.field_34588, 5.0);
   }

   private Optional<BlockPos> method_30690(Predicate<class_2522> var1, double var2) {
      BlockPos var6 = this.field_34583.method_37075();
      class_2921 var7 = new class_2921();

      for (int var8 = 0; (double)var8 <= var2; var8 = var8 <= 0 ? 1 - var8 : -var8) {
         for (int var9 = 0; (double)var9 < var2; var9++) {
            for (int var10 = 0; var10 <= var9; var10 = var10 <= 0 ? 1 - var10 : -var10) {
               for (int var11 = var10 < var9 && var10 > -var9 ? var9 : 0; var11 <= var9; var11 = var11 <= 0 ? 1 - var11 : -var11) {
                  var7.method_13360(var6, var10, var8 - 1, var11);
                  if (var6.method_12171(var7, var2) && var1.test(this.field_34583.field_41768.method_28262(var7))) {
                     return Optional.<BlockPos>of(var7);
                  }
               }
            }
         }
      }

      return Optional.<BlockPos>empty();
   }
}
