package remapped;

import java.util.List;

public class class_5302 extends class_3599 {
   private static String[] field_27097;
   private int field_27096;
   private final class_4612 field_27098;
   private class_704 field_27099;
   private class_9414 field_27100;

   public class_5302(class_4612 var1) {
      this.field_27098 = var1;
   }

   @Override
   public boolean method_16795() {
      List var3 = this.field_27098.field_41768.<class_9149>method_25868(class_9149.class, this.field_27098.method_37241().method_18898(5.0));
      boolean var4 = false;

      for (class_9149 var6 : var3) {
         class_8145 var7 = var6.method_37259();
         if (var7 instanceof class_704
            && (class_9299.method_42804(((class_704)var7).field_29676) > 0.0F || class_9299.method_42804(((class_704)var7).field_29673) > 0.0F)) {
            var4 = true;
            break;
         }
      }

      return this.field_27099 != null
            && (class_9299.method_42804(this.field_27099.field_29676) > 0.0F || class_9299.method_42804(this.field_27099.field_29673) > 0.0F)
         || var4;
   }

   @Override
   public boolean method_16801() {
      return true;
   }

   @Override
   public boolean method_16799() {
      return this.field_27099 != null
         && this.field_27099.method_37070()
         && (class_9299.method_42804(this.field_27099.field_29676) > 0.0F || class_9299.method_42804(this.field_27099.field_29673) > 0.0F);
   }

   @Override
   public void method_16796() {
      for (class_9149 var4 : this.field_27098.field_41768.<class_9149>method_25868(class_9149.class, this.field_27098.method_37241().method_18898(5.0))) {
         if (var4.method_37259() != null && var4.method_37259() instanceof class_704) {
            this.field_27099 = (class_704)var4.method_37259();
            break;
         }
      }

      this.field_27096 = 0;
      this.field_27100 = class_9414.field_48135;
   }

   @Override
   public void method_16793() {
      this.field_27099 = null;
   }

   @Override
   public void method_16794() {
      boolean var3 = class_9299.method_42804(this.field_27099.field_29676) > 0.0F || class_9299.method_42804(this.field_27099.field_29673) > 0.0F;
      float var4 = this.field_27100 != class_9414.field_48137 ? 0.015F : (!var3 ? 0.0F : 0.01F);
      this.field_27098
         .method_37092(var4, new class_1343((double)this.field_27098.field_29676, (double)this.field_27098.field_29651, (double)this.field_27098.field_29673));
      this.field_27098.method_37226(class_7412.field_37839, this.field_27098.method_37098());
      if (--this.field_27096 <= 0) {
         this.field_27096 = 10;
         if (this.field_27100 != class_9414.field_48135) {
            if (this.field_27100 == class_9414.field_48137) {
               class_240 var5 = this.field_27099.method_37235();
               class_1331 var6 = this.field_27099.method_37075().method_6099(var5, 10);
               this.field_27098.method_26927().method_5595((double)var6.method_12173(), (double)(var6.method_12165() - 1), (double)var6.method_12185(), 1.0);
               if (this.field_27098.method_37175(this.field_27099) > 12.0F) {
                  this.field_27096 = 0;
                  this.field_27100 = class_9414.field_48135;
               }
            }
         } else {
            class_1331 var7 = this.field_27099.method_37075().method_6098(this.field_27099.method_37365().method_1046());
            var7 = var7.method_6104(0, -1, 0);
            this.field_27098.method_26927().method_5595((double)var7.method_12173(), (double)var7.method_12165(), (double)var7.method_12185(), 1.0);
            if (this.field_27098.method_37175(this.field_27099) < 4.0F) {
               this.field_27096 = 0;
               this.field_27100 = class_9414.field_48137;
            }
         }
      }
   }
}
