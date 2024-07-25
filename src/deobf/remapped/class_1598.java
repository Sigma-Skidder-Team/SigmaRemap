package remapped;

import com.google.common.collect.Lists;
import com.mojang.serialization.Dynamic;
import java.util.ArrayList;
import java.util.Random;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_1598 extends class_8131 {
   private static final Logger field_8320 = LogManager.getLogger();
   private final Identifier field_8322;
   private final class_6631 field_8318;
   private final class_9022 field_8316;
   private final class_3487 field_8319;
   private final class_4168 field_8321;

   public class_1598(class_1331 var1, class_3487 var2, class_4168 var3, Identifier var4, class_6561 var5, class_6631 var6, class_9022 var7, class_1331 var8) {
      super(class_2746.field_13398, 0);
      this.field_41648 = var1;
      this.field_8322 = var4;
      this.field_8318 = var6;
      this.field_8316 = var7;
      this.field_8319 = var2;
      this.field_8321 = var3;
      this.method_7168(var5, var8);
   }

   public class_1598(class_5799 var1, CompoundNBT var2) {
      super(class_2746.field_13398, var2);
      this.field_8322 = new Identifier(var2.method_25965("Template"));
      this.field_8318 = class_6631.valueOf(var2.method_25965("Rotation"));
      this.field_8316 = class_9022.valueOf(var2.method_25965("Mirror"));
      this.field_8319 = class_3487.method_16036(var2.method_25965("VerticalPlacement"));
      this.field_8321 = (class_4168)class_4168.field_20275
         .parse(new Dynamic(class_3504.field_17178, var2.method_25929("Properties")))
         .getOrThrow(true, field_8320::error);
      class_6561 var5 = var1.method_26279(this.field_8322);
      this.method_7168(var5, new class_1331(var5.method_29975().method_12173() / 2, 0, var5.method_29975().method_12185() / 2));
   }

   @Override
   public void method_32517(CompoundNBT var1) {
      super.method_32517(var1);
      var1.method_25941("Template", this.field_8322.toString());
      var1.method_25941("Rotation", this.field_8318.name());
      var1.method_25941("Mirror", this.field_8316.name());
      var1.method_25941("VerticalPlacement", this.field_8319.method_16035());
      class_4168.field_20275
         .encodeStart(class_3504.field_17178, this.field_8321)
         .resultOrPartial(field_8320::error)
         .ifPresent(var1x -> var1.put("Properties", var1x));
   }

   private void method_7168(class_6561 var1, class_1331 var2) {
      class_2010 var5 = !this.field_8321.field_20274 ? class_2010.field_10193 : class_2010.field_10194;
      ArrayList var6 = Lists.newArrayList();
      var6.add(method_7157(class_4783.field_23692, 0.3F, class_4783.field_23184));
      var6.add(this.method_7167());
      if (!this.field_8321.field_20278) {
         var6.add(method_7157(class_4783.field_23700, 0.07F, class_4783.field_23215));
      }

      class_8478 var7 = new class_8478()
         .method_39053(this.field_8318)
         .method_39055(this.field_8316)
         .method_39037(var2)
         .method_39048(var5)
         .method_39048(new class_9425(var6))
         .method_39048(new class_6171(this.field_8321.field_20271))
         .method_39048(new class_9146());
      if (this.field_8321.field_20273) {
         var7.method_39048(class_1374.field_7456);
      }

      this.method_36998(var1, this.field_41648, var7);
   }

   private class_2958 method_7167() {
      if (this.field_8319 != class_3487.field_17119) {
         return !this.field_8321.field_20278
            ? method_7157(class_4783.field_23811, 0.2F, class_4783.field_23215)
            : method_7161(class_4783.field_23811, class_4783.field_23700);
      } else {
         return method_7161(class_4783.field_23811, class_4783.field_23215);
      }
   }

   @Override
   public boolean method_32501(class_700 var1, class_2033 var2, class_6541 var3, Random var4, class_9616 var5, class_2034 var6, class_1331 var7) {
      if (!var5.method_44395(this.field_41648)) {
         return true;
      } else {
         var5.method_44392(this.field_41647.method_29986(this.field_41650, this.field_41648));
         boolean var10 = super.method_32501(var1, var2, var3, var4, var5, var6, var7);
         this.method_7158(var4, var1);
         this.method_7163(var4, var1);
         if (this.field_8321.field_20276 || this.field_8321.field_20277) {
            class_1331.method_6086(this.method_32512()).forEach(var3x -> {
               if (this.field_8321.field_20276) {
                  this.method_7165(var4, var1, var3x);
               }

               if (this.field_8321.field_20277) {
                  this.method_7162(var4, var1, var3x);
               }
            });
         }

         return var10;
      }
   }

   @Override
   public void method_36999(String var1, class_1331 var2, class_1556 var3, Random var4, class_9616 var5) {
   }

   private void method_7165(Random var1, class_9379 var2, class_1331 var3) {
      class_2522 var6 = var2.method_28262(var3);
      if (!var6.method_8345() && !var6.method_8350(class_4783.field_23323)) {
         Direction var7 = class_9594.field_48893.method_44313(var1);
         class_1331 var8 = var3.method_6098(var7);
         class_2522 var9 = var2.method_28262(var8);
         if (var9.method_8345() && class_6414.method_29303(var6.method_8324(var2, var3), var7)) {
            class_6720 var10 = class_4196.method_19521(var7.method_1046());
            var2.method_7513(var8, class_4783.field_23323.method_29260().method_10308(var10, Boolean.valueOf(true)), 3);
         }
      }
   }

   private void method_7162(Random var1, class_9379 var2, class_1331 var3) {
      if (var1.nextFloat() < 0.5F && var2.method_28262(var3).method_8350(class_4783.field_23700) && var2.method_28262(var3.method_6081()).method_8345()) {
         var2.method_7513(var3.method_6081(), class_4783.field_23386.method_29260().method_10308(class_4423.field_21619, Boolean.valueOf(true)), 3);
      }
   }

   private void method_7163(Random var1, class_9379 var2) {
      for (int var5 = this.field_36435.field_48996 + 1; var5 < this.field_36435.field_48991; var5++) {
         for (int var6 = this.field_36435.field_48992 + 1; var6 < this.field_36435.field_48994; var6++) {
            class_1331 var7 = new class_1331(var5, this.field_36435.field_48995, var6);
            if (var2.method_28262(var7).method_8350(class_4783.field_23700)) {
               this.method_7160(var1, var2, var7.method_6100());
            }
         }
      }
   }

   private void method_7160(Random var1, class_9379 var2, class_1331 var3) {
      class_2921 var6 = var3.method_6089();
      this.method_7164(var1, var2, var6);
      int var7 = 8;

      while (var7 > 0 && var1.nextFloat() < 0.5F) {
         var6.method_13368(Direction.field_802);
         var7--;
         this.method_7164(var1, var2, var6);
      }
   }

   private void method_7158(Random var1, class_9379 var2) {
      boolean var5 = this.field_8319 == class_3487.field_17125 || this.field_8319 == class_3487.field_17119;
      class_2700 var6 = this.field_36435.method_44396();
      int var7 = var6.method_12173();
      int var8 = var6.method_12185();
      float[] var9 = new float[]{1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.9F, 0.9F, 0.8F, 0.7F, 0.6F, 0.4F, 0.2F};
      int var10 = var9.length;
      int var11 = (this.field_36435.method_44393() + this.field_36435.method_44387()) / 2;
      int var12 = var1.nextInt(Math.max(1, 8 - var11 / 2));
      byte var13 = 3;
      class_2921 var14 = class_1331.field_7306.method_6089();

      for (int var15 = var7 - var10; var15 <= var7 + var10; var15++) {
         for (int var16 = var8 - var10; var16 <= var8 + var10; var16++) {
            int var17 = Math.abs(var15 - var7) + Math.abs(var16 - var8);
            int var18 = Math.max(0, var17 + var12);
            if (var18 < var10) {
               float var19 = var9[var18];
               if (var1.nextDouble() < (double)var19) {
                  int var20 = method_7159(var2, var15, var16, this.field_8319);
                  int var21 = !var5 ? Math.min(this.field_36435.field_48995, var20) : var20;
                  var14.method_13362(var15, var21, var16);
                  if (Math.abs(var21 - this.field_36435.field_48995) <= 3 && this.method_7166(var2, var14)) {
                     this.method_7164(var1, var2, var14);
                     if (this.field_8321.field_20277) {
                        this.method_7162(var1, var2, var14);
                     }

                     this.method_7160(var1, var2, var14.method_6100());
                  }
               }
            }
         }
      }
   }

   private boolean method_7166(class_9379 var1, class_1331 var2) {
      class_2522 var5 = var1.method_28262(var2);
      return !var5.method_8350(class_4783.field_23184)
         && !var5.method_8350(class_4783.field_23881)
         && !var5.method_8350(class_4783.field_23471)
         && (this.field_8319 == class_3487.field_17121 || !var5.method_8350(class_4783.field_23811));
   }

   private void method_7164(Random var1, class_9379 var2, class_1331 var3) {
      if (!this.field_8321.field_20278 && var1.nextFloat() < 0.07F) {
         var2.method_7513(var3, class_4783.field_23215.method_29260(), 3);
      } else {
         var2.method_7513(var3, class_4783.field_23700.method_29260(), 3);
      }
   }

   private static int method_7159(class_9379 var0, int var1, int var2, class_3487 var3) {
      return var0.method_22562(method_7169(var3), var1, var2) - 1;
   }

   public static class_3801 method_7169(class_3487 var0) {
      return var0 != class_3487.field_17119 ? class_3801.field_18598 : class_3801.field_18591;
   }

   private static class_2958 method_7157(class_6414 var0, float var1, class_6414 var2) {
      return new class_2958(new class_3500(var0, var1), class_6771.field_34945, var2.method_29260());
   }

   private static class_2958 method_7161(class_6414 var0, class_6414 var1) {
      return new class_2958(new class_9034(var0), class_6771.field_34945, var1.method_29260());
   }
}
