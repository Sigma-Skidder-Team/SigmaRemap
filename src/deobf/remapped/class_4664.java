package remapped;

import java.util.Random;

public class class_4664 extends class_8131 {
   private final class_4161 field_22747;
   private final float field_22749;
   private final Identifier field_22750;
   private final class_6631 field_22745;
   private final boolean field_22748;

   public class_4664(class_5799 var1, Identifier var2, BlockPos var3, class_6631 var4, float var5, class_4161 var6, boolean var7) {
      super(class_2746.field_13429, 0);
      this.field_22750 = var2;
      this.field_41648 = var3;
      this.field_22745 = var4;
      this.field_22749 = var5;
      this.field_22747 = var6;
      this.field_22748 = var7;
      this.method_21572(var1);
   }

   public class_4664(class_5799 var1, CompoundNBT var2) {
      super(class_2746.field_13429, var2);
      this.field_22750 = new Identifier(var2.method_25965("Template"));
      this.field_22745 = class_6631.valueOf(var2.method_25965("Rot"));
      this.field_22749 = var2.getFloat("Integrity");
      this.field_22747 = class_4161.valueOf(var2.method_25965("BiomeType"));
      this.field_22748 = var2.getBoolean("IsLarge");
      this.method_21572(var1);
   }

   private void method_21572(class_5799 var1) {
      class_6561 var4 = var1.method_26279(this.field_22750);
      class_8478 var5 = new class_8478().method_39053(this.field_22745).method_39055(class_9022.field_46145).method_39048(class_2010.field_10193);
      this.method_36998(var4, this.field_41648, var5);
   }

   @Override
   public void method_32517(CompoundNBT var1) {
      super.method_32517(var1);
      var1.method_25941("Template", this.field_22750.toString());
      var1.method_25941("Rot", this.field_22745.name());
      var1.putFloat("Integrity", this.field_22749);
      var1.method_25941("BiomeType", this.field_22747.toString());
      var1.putBoolean("IsLarge", this.field_22748);
   }

   @Override
   public void method_36999(String var1, BlockPos var2, class_1556 var3, Random var4, class_9616 var5) {
      if (!"chest".equals(var1)) {
         if ("drowned".equals(var1)) {
            class_4359 var8 = EntityType.field_34211.method_30484(var3.method_7066());
            var8.method_26883();
            var8.method_37253(var2, 0.0F, 0.0F);
            var8.method_26864(var3, var3.method_43368(var2), class_2417.field_12033, (class_8733)null, (CompoundNBT)null);
            var3.method_7065(var8);
            if (var2.method_12165() <= var3.method_22552()) {
               var3.method_7513(var2, class_4783.field_23900.method_29260(), 2);
            } else {
               var3.method_7513(var2, class_4783.field_23184.method_29260(), 2);
            }
         }
      } else {
         var3.method_7513(
            var2,
            class_4783.field_23471
               .method_29260()
               .method_10308(class_6942.field_35690, Boolean.valueOf(var3.method_28258(var2).method_22007(class_6503.field_33094))),
            2
         );
         class_3757 var9 = var3.method_28260(var2);
         if (var9 instanceof class_7099) {
            ((class_7099)var9).method_10816(!this.field_22748 ? class_5931.field_30117 : class_5931.field_30134, var4.nextLong());
         }
      }
   }

   @Override
   public boolean method_32501(class_700 var1, class_2033 var2, class_6541 var3, Random var4, class_9616 var5, class_2034 var6, BlockPos var7) {
      this.field_41650.method_39035().method_39048(new class_9098(this.field_22749)).method_39048(class_2010.field_10193);
      int var10 = var1.method_22562(class_3801.field_18591, this.field_41648.getX(), this.field_41648.method_12185());
      this.field_41648 = new BlockPos(this.field_41648.getX(), var10, this.field_41648.method_12185());
      BlockPos var11 = class_6561.method_29966(
            new BlockPos(this.field_41647.method_29975().getX() - 1, 0, this.field_41647.method_29975().method_12185() - 1),
            class_9022.field_46145,
            this.field_22745,
            BlockPos.field_7306
         )
         .method_6105(this.field_41648);
      this.field_41648 = new BlockPos(this.field_41648.getX(), this.method_21573(this.field_41648, var1, var11), this.field_41648.method_12185());
      return super.method_32501(var1, var2, var3, var4, var5, var6, var7);
   }

   private int method_21573(BlockPos var1, class_6163 var2, BlockPos var3) {
      int var6 = var1.method_12165();
      int var7 = 512;
      int var8 = var6 - 1;
      int var9 = 0;

      for (BlockPos var11 : BlockPos.method_6076(var1, var3)) {
         int var12 = var11.getX();
         int var13 = var11.method_12185();
         int var14 = var1.method_12165() - 1;
         class_2921 var15 = new class_2921(var12, var14, var13);
         class_2522 var16 = var2.method_28262(var15);

         for (class_4774 var17 = var2.method_28258(var15);
            (var16.method_8345() || var17.method_22007(class_6503.field_33094) || var16.method_8360().method_29299(class_2351.field_11805)) && var14 > 1;
            var17 = var2.method_28258(var15)
         ) {
            var15.method_13362(var12, --var14, var13);
            var16 = var2.method_28262(var15);
         }

         var7 = Math.min(var7, var14);
         if (var14 < var8 - 2) {
            var9++;
         }
      }

      int var18 = Math.abs(var1.getX() - var3.getX());
      if (var8 - var7 > 2 && var9 > var18 - 2) {
         var6 = var7 + 1;
      }

      return var6;
   }
}
