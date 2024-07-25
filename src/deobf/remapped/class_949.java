package remapped;

import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;

public class class_949 extends class_958 {
   private static String[] field_4889;
   private int field_4885;
   private List<BlockPos> field_4886;
   private class_3998 field_4887;
   private int field_4888;

   public class_949(class_8829 var1) {
      super(var1, null);
      this.field_4884 = var1;
      this.field_4885 = this.field_4884.field_41768.field_33033.nextInt(10);
      this.field_4886 = Lists.newArrayList();
      this.field_4887 = null;
      this.method_16800(EnumSet.<Flag>of(Flag.MOVE));
   }

   @Override
   public boolean method_4213() {
      return class_8829.method_40569(this.field_4884) != null
         && !this.field_4884.method_26848()
         && class_8829.method_40561(this.field_4884)
         && !this.method_4185(class_8829.method_40569(this.field_4884))
         && this.field_4884.field_41768.method_28262(class_8829.method_40569(this.field_4884)).method_8349(class_2351.field_11727);
   }

   @Override
   public boolean method_4214() {
      return this.method_4213();
   }

   @Override
   public void method_16796() {
      this.field_4885 = 0;
      this.field_4888 = 0;
      super.method_16796();
   }

   @Override
   public void method_16793() {
      this.field_4885 = 0;
      this.field_4888 = 0;
      class_8829.method_40614(this.field_4884).method_5620();
      class_8829.method_40567(this.field_4884).method_5622();
   }

   @Override
   public void method_16794() {
      if (class_8829.method_40569(this.field_4884) != null) {
         this.field_4885++;
         if (this.field_4885 <= 600) {
            if (!class_8829.method_40550(this.field_4884).method_5608()) {
               if (class_8829.method_40573(this.field_4884, class_8829.method_40569(this.field_4884), 16)) {
                  boolean var3 = this.method_4178(class_8829.method_40569(this.field_4884));
                  if (var3) {
                     if (this.field_4887 != null && class_8829.method_40607(this.field_4884).method_5594().method_18446(this.field_4887)) {
                        this.field_4888++;
                        if (this.field_4888 > 60) {
                           this.method_4180();
                           this.field_4888 = 0;
                        }
                     } else {
                        this.field_4887 = class_8829.method_40583(this.field_4884).method_5594();
                     }
                  } else {
                     this.method_4179();
                  }
               } else if (!class_8829.method_40609(this.field_4884, class_8829.method_40569(this.field_4884))) {
                  class_8829.method_40578(this.field_4884, class_8829.method_40569(this.field_4884));
               } else {
                  this.method_4180();
               }
            }
         } else {
            this.method_4179();
         }
      }
   }

   private boolean method_4178(BlockPos var1) {
      class_8829.method_40571(this.field_4884).method_5613(10.0F);
      class_8829.method_40555(this.field_4884).method_5595((double)var1.method_12173(), (double)var1.method_12165(), (double)var1.method_12185(), 1.0);
      return class_8829.method_40613(this.field_4884).method_5594() != null && class_8829.method_40577(this.field_4884).method_5594().method_18433();
   }

   private boolean method_4181(BlockPos var1) {
      return this.field_4886.contains(var1);
   }

   private void method_4182(BlockPos var1) {
      this.field_4886.add(var1);

      while (this.field_4886.size() > 3) {
         this.field_4886.remove(0);
      }
   }

   private void method_4183() {
      this.field_4886.clear();
   }

   private void method_4179() {
      if (class_8829.method_40569(this.field_4884) != null) {
         this.method_4182(class_8829.method_40569(this.field_4884));
      }

      this.method_4180();
   }

   private void method_4180() {
      class_8829.method_40570(this.field_4884, null);
      class_8829.method_40599(this.field_4884, 200);
   }

   private boolean method_4185(BlockPos var1) {
      if (class_8829.method_40573(this.field_4884, var1, 2)) {
         return true;
      } else {
         class_3998 var4 = class_8829.method_40591(this.field_4884).method_5594();
         return var4 != null && var4.method_18426().equals(var1) && var4.method_18433() && var4.method_18436();
      }
   }
}
