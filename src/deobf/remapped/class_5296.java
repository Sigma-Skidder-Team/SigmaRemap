package remapped;

import java.util.EnumSet;
import java.util.function.Predicate;

public class class_5296 extends class_3599 {
   private static String[] field_27051;
   private static final Predicate<class_2522> field_27052 = class_2263.method_10400(class_4783.field_23868);
   private final MobEntity field_27053;
   private final World field_27050;
   private int field_27054;

   public class_5296(MobEntity var1) {
      this.field_27053 = var1;
      this.field_27050 = var1.world;
      this.method_16800(EnumSet.<Flag>of(Flag.MOVE, Flag.LOOK, Flag.JUMP));
   }

   @Override
   public boolean method_16795() {
      if (this.field_27053.method_26594().nextInt(!this.field_27053.method_26449() ? 1000 : 50) == 0) {
         BlockPos var3 = this.field_27053.method_37075();
         return !field_27052.test(this.field_27050.method_28262(var3))
            ? this.field_27050.method_28262(var3.method_6100()).method_8350(class_4783.field_23259)
            : true;
      } else {
         return false;
      }
   }

   @Override
   public void method_16796() {
      this.field_27054 = 40;
      this.field_27050.method_29587(this.field_27053, (byte)10);
      this.field_27053.method_26927().method_5620();
   }

   @Override
   public void method_16793() {
      this.field_27054 = 0;
   }

   @Override
   public boolean method_16799() {
      return this.field_27054 > 0;
   }

   public int method_24145() {
      return this.field_27054;
   }

   @Override
   public void method_16794() {
      this.field_27054 = Math.max(0, this.field_27054 - 1);
      if (this.field_27054 == 4) {
         BlockPos var3 = this.field_27053.method_37075();
         if (!field_27052.test(this.field_27050.method_28262(var3))) {
            BlockPos var4 = var3.method_6100();
            if (this.field_27050.method_28262(var4).method_8350(class_4783.field_23259)) {
               if (this.field_27050.getGameRules().getBoolean(GameRules.MOB_GRIEFING)) {
                  this.field_27050.method_43364(2001, var4, class_6414.method_29285(class_4783.field_23259.method_29260()));
                  this.field_27050.method_7513(var4, class_4783.field_23592.method_29260(), 2);
               }

               this.field_27053.method_26897();
            }
         } else {
            if (this.field_27050.getGameRules().getBoolean(GameRules.MOB_GRIEFING)) {
               this.field_27050.method_7510(var3, false);
            }

            this.field_27053.method_26897();
         }
      }
   }
}
