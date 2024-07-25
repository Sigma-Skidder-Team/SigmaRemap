package remapped;

public class class_9573 extends class_4098 {
   public class_5329 field_48702;
   public int field_48701 = 0;

   public class_9573(class_7038 var1, String var2, int var3, int var4, class_5664[] var5) {
      super(var1, var2, var3 - 296, var4 - 346, 592, 692);

      for (class_9128 var9 : class_727.method_3328().method_3298().method_843().values()) {
         if (var9.method_42013()) {
            for (class_5664 var13 : var5) {
               if (var9.method_42004().equals(var13)) {
                  this.method_44238(var9);
               }
            }
         }
      }

      class_4980 var14;
      this.method_32148(var14 = new class_4980(this, "exit", this.method_32109() - 47, 18));
      var14.method_32100((var1x, var2x) -> {
         if (this.field_48702 == null) {
            ((class_4647)this.method_32167()).method_21496();
         } else {
            this.field_48702.method_24304();
         }
      });
      this.method_32105(false);
   }

   private void method_44238(class_9128 var1) {
      int var4 = this.field_48701 % 3;
      int var5 = (int)Math.floor((double)((float)this.field_48701 / 3.0F));
      short var6 = 170;
      byte var7 = 80;
      this.method_32148(new class_4599(this, var1.method_41992(), 40 + var6 * var4, 72 + var7 * var5, var6, var7, var1));
      this.field_48701++;
   }

   public void method_44239(class_9128 var1) {
      this.method_32102(() -> {
         if (this.field_48702 == null) {
            this.method_32148(this.field_48702 = new class_5329(this, "settings", 5, 70, this.method_32109() - 10, this.method_32137() - 75, var1));
            this.field_48702.method_32187(true);
         }
      });
   }

   @Override
   public void method_32178(float var1) {
      super.method_32178(var1);
      if (this.field_48702 == null) {
         for (class_7038 var5 : this.method_32134()) {
            if (var5 instanceof class_4599 && this.field_19963.method_11123() == 1.0F && var5.method_32120(this.method_32189(), this.method_32129())) {
               class_4599 var6 = (class_4599)var5;
               class_73.method_87(class_3054.field_14989, 20.0F, (float)(this.method_32137() - 26), var6.field_22361.method_42001(), -14540254);
               class_73.method_135(5.0F, (float)(this.method_32137() - 27), 12.0F, 24.0F);
               class_73.method_96(5.0F, (float)(this.method_32137() - 27), 24.0F, 24.0F, class_9898.field_50195);
               class_73.method_141();
               break;
            }
         }
      }
   }

   @Override
   public void method_32145(int var1, int var2) {
      super.method_32145(var1, var2);
      if (this.field_48702 != null && this.field_48702.method_24302()) {
         this.method_32102(() -> {
            this.method_32179(this.field_48702);
            this.field_48702 = null;
         });
      }
   }
}
