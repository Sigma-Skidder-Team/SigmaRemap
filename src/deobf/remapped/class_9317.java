package remapped;

import java.util.List;
import org.apache.commons.lang3.mutable.MutableInt;

public class class_9317 extends class_3757 implements class_3745 {
   private static String[] field_47582;
   private long field_47579;
   public int field_47581;
   public boolean field_47584;
   public Direction field_47577;
   private List<class_5834> field_47583;
   private boolean field_47578;
   private int field_47580;

   public class_9317() {
      super(class_133.field_350);
   }

   @Override
   public boolean method_17408(int var1, int var2) {
      if (var1 != 1) {
         return super.method_17408(var1, var2);
      } else {
         this.method_43015();
         this.field_47580 = 0;
         this.field_47577 = Direction.method_1033(var2);
         this.field_47581 = 0;
         this.field_47584 = true;
         return true;
      }
   }

   @Override
   public void method_17353() {
      if (this.field_47584) {
         this.field_47581++;
      }

      if (this.field_47581 >= 50) {
         this.field_47584 = false;
         this.field_47581 = 0;
      }

      if (this.field_47581 >= 5 && this.field_47580 == 0 && this.method_43013()) {
         this.field_47578 = true;
         this.method_43012();
      }

      if (this.field_47578) {
         if (this.field_47580 >= 40) {
            this.method_43018(this.field_18364);
            this.method_43017(this.field_18364);
            this.field_47578 = false;
         } else {
            this.field_47580++;
         }
      }
   }

   private void method_43012() {
      this.field_18364.method_43359((class_704)null, this.method_17399(), class_463.field_2099, class_562.field_3322, 1.0F, 1.0F);
   }

   public void method_43016(Direction var1) {
      class_1331 var4 = this.method_17399();
      this.field_47577 = var1;
      if (!this.field_47584) {
         this.field_47584 = true;
      } else {
         this.field_47581 = 0;
      }

      this.field_18364.method_29521(var4, this.method_17403().method_8360(), 1, var1.method_1050());
   }

   private void method_43015() {
      class_1331 var3 = this.method_17399();
      if (this.field_18364.method_29546() > this.field_47579 + 60L || this.field_47583 == null) {
         this.field_47579 = this.field_18364.method_29546();
         class_4092 var4 = new class_4092(var3).method_18898(48.0);
         this.field_47583 = this.field_18364.<class_5834>method_25868(class_5834.class, var4);
      }

      if (!this.field_18364.field_33055) {
         for (class_5834 var5 : this.field_47583) {
            if (var5.method_37330() && !var5.field_41751 && var3.method_12170(var5.method_37245(), 32.0)) {
               var5.method_26525().method_5105(class_6044.field_30894, this.field_18364.method_29546());
            }
         }
      }
   }

   private boolean method_43013() {
      class_1331 var3 = this.method_17399();

      for (class_5834 var5 : this.field_47583) {
         if (var5.method_37330()
            && !var5.field_41751
            && var3.method_12170(var5.method_37245(), 32.0)
            && var5.method_37387().method_30453(class_5218.field_26788)) {
            return true;
         }
      }

      return false;
   }

   private void method_43018(World var1) {
      if (!var1.field_33055) {
         this.field_47583.stream().filter(this::method_43019).forEach(this::method_43014);
      }
   }

   private void method_43017(World var1) {
      if (var1.field_33055) {
         class_1331 var4 = this.method_17399();
         MutableInt var5 = new MutableInt(16700985);
         int var6 = (int)this.field_47583.stream().filter(var1x -> var4.method_12170(var1x.method_37245(), 48.0)).count();
         this.field_47583
            .stream()
            .filter(this::method_43019)
            .forEach(
               var4x -> {
                  float var7 = 1.0F;
                  float var8 = class_9299.method_42842(
                     (var4x.method_37302() - (double)var4.method_12173()) * (var4x.method_37302() - (double)var4.method_12173())
                        + (var4x.method_37156() - (double)var4.method_12185()) * (var4x.method_37156() - (double)var4.method_12185())
                  );
                  double var9 = (double)((float)var4.method_12173() + 0.5F) + (double)(1.0F / var8) * (var4x.method_37302() - (double)var4.method_12173());
                  double var11 = (double)((float)var4.method_12185() + 0.5F) + (double)(1.0F / var8) * (var4x.method_37156() - (double)var4.method_12185());
                  int var13 = class_9299.method_42829((var6 - 21) / -2, 3, 15);

                  for (int var14 = 0; var14 < var13; var14++) {
                     int var15 = var5.addAndGet(5);
                     double var16 = (double)class_8496.method_39151(var15) / 255.0;
                     double var18 = (double)class_8496.method_39152(var15) / 255.0;
                     double var20 = (double)class_8496.method_39157(var15) / 255.0;
                     var1.method_43361(class_3090.field_15353, var9, (double)((float)var4.method_12165() + 0.5F), var11, var16, var18, var20);
                  }
               }
            );
      }
   }

   private boolean method_43019(class_5834 var1) {
      return var1.method_37330()
         && !var1.field_41751
         && this.method_17399().method_12170(var1.method_37245(), 48.0)
         && var1.method_37387().method_30453(class_5218.field_26788);
   }

   private void method_43014(class_5834 var1) {
      var1.method_26558(new class_2250(Effects.field_19722, 60));
   }
}