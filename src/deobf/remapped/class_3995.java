package remapped;

public class class_3995 extends class_4314 {
   public static final class_6720 field_19411 = class_6023.field_30690;

   public class_3995(class_3073 var1) {
      super(var1);
      this.method_29284(this.field_32751.method_36446().method_10308(field_19411, Boolean.valueOf(false)));
   }

   @Override
   public void method_29257(World var1, BlockPos var2, class_2522 var3, class_5834 var4, ItemStack var5) {
      super.method_29257(var1, var2, var3, var4, var5);
      CompoundNBT var8 = var5.method_27994();
      if (var8.method_25938("BlockEntityTag")) {
         CompoundNBT var9 = var8.getCompound("BlockEntityTag");
         if (var9.method_25938("RecordItem")) {
            var1.method_7513(var2, var3.method_10308(field_19411, Boolean.valueOf(true)), 2);
         }
      }
   }

   @Override
   public class_6910 method_10777(class_2522 var1, World var2, BlockPos var3, PlayerEntity var4, Hand var5, class_9529 var6) {
      if (!var1.<Boolean>method_10313(field_19411)) {
         return class_6910.field_35521;
      } else {
         this.method_18420(var2, var3);
         var1 = var1.method_10308(field_19411, Boolean.valueOf(false));
         var2.method_7513(var3, var1, 2);
         return class_6910.method_31659(var2.field_33055);
      }
   }

   public void method_18419(class_9379 var1, BlockPos var2, class_2522 var3, ItemStack var4) {
      class_3757 var7 = var1.method_28260(var2);
      if (var7 instanceof class_6838) {
         ((class_6838)var7).method_31352(var4.method_27973());
         var1.method_7513(var2, var3.method_10308(field_19411, Boolean.valueOf(true)), 2);
      }
   }

   private void method_18420(World var1, BlockPos var2) {
      if (!var1.field_33055) {
         class_3757 var5 = var1.method_28260(var2);
         if (var5 instanceof class_6838) {
            class_6838 var6 = (class_6838)var5;
            ItemStack var7 = var6.method_31351();
            if (!var7.method_28022()) {
               var1.method_43364(1010, var2, 0);
               var6.method_24975();
               float var8 = 0.7F;
               double var9 = (double)(var1.field_33033.nextFloat() * 0.7F) + 0.15F;
               double var11 = (double)(var1.field_33033.nextFloat() * 0.7F) + 0.060000002F + 0.6;
               double var13 = (double)(var1.field_33033.nextFloat() * 0.7F) + 0.15F;
               ItemStack var15 = var7.method_27973();
               class_91 var16 = new class_91(
                  var1, (double)var2.method_12173() + var9, (double)var2.method_12165() + var11, (double)var2.method_12185() + var13, var15
               );
               var16.method_257();
               var1.method_7509(var16);
            }
         }
      }
   }

   @Override
   public void method_10761(class_2522 var1, World var2, BlockPos var3, class_2522 var4, boolean var5) {
      if (!var1.method_8350(var4.method_8360())) {
         this.method_18420(var2, var3);
         super.method_10761(var1, var2, var3, var4, var5);
      }
   }

   @Override
   public class_3757 method_3281(class_6163 var1) {
      return new class_6838();
   }

   @Override
   public boolean method_10770(class_2522 var1) {
      return true;
   }

   @Override
   public int method_10795(class_2522 var1, World var2, BlockPos var3) {
      class_3757 var6 = var2.method_28260(var3);
      if (var6 instanceof class_6838) {
         class_2451 var7 = ((class_6838)var6).method_31351().method_27960();
         if (var7 instanceof class_7738) {
            return ((class_7738)var7).method_35030();
         }
      }

      return 0;
   }

   @Override
   public class_7537 method_10788(class_2522 var1) {
      return class_7537.field_38469;
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_19411);
   }
}
