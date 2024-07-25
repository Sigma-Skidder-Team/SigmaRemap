package remapped;

import it.unimi.dsi.fastutil.objects.Object2FloatMap;
import it.unimi.dsi.fastutil.objects.Object2FloatOpenHashMap;
import java.util.Random;

public class class_7689 extends class_6414 implements class_8660 {
   private static String[] field_39052;
   public static final class_7044 field_39050 = class_6023.field_30755;
   public static final Object2FloatMap<class_8525> field_39051 = new Object2FloatOpenHashMap();
   private static final class_4190 field_39053 = class_3370.method_15524();
   private static final class_4190[] field_39054 = class_9665.<class_4190[]>method_44659(
      new class_4190[9],
      var0 -> {
         for (int var3 = 0; var3 < 8; var3++) {
            var0[var3] = class_3370.method_15533(
               field_39053, class_6414.method_29292(2.0, (double)Math.max(2, 1 + var3 * 2), 2.0, 14.0, 16.0, 14.0), class_8529.field_43656
            );
         }

         var0[8] = var0[7];
      }
   );

   public static void method_34842() {
      field_39051.defaultReturnValue(-1.0F);
      float var2 = 0.3F;
      float var3 = 0.5F;
      float var4 = 0.65F;
      float var5 = 0.85F;
      float var6 = 1.0F;
      method_34837(0.3F, class_4897.field_24752);
      method_34837(0.3F, class_4897.field_25006);
      method_34837(0.3F, class_4897.field_25229);
      method_34837(0.3F, class_4897.field_24636);
      method_34837(0.3F, class_4897.field_24401);
      method_34837(0.3F, class_4897.field_24861);
      method_34837(0.3F, class_4897.field_24443);
      method_34837(0.3F, class_4897.field_25054);
      method_34837(0.3F, class_4897.field_24488);
      method_34837(0.3F, class_4897.field_24398);
      method_34837(0.3F, class_4897.field_24656);
      method_34837(0.3F, class_4897.field_24709);
      method_34837(0.3F, class_4897.field_24883);
      method_34837(0.3F, class_4897.field_24494);
      method_34837(0.3F, class_4897.field_24822);
      method_34837(0.3F, class_4897.field_24523);
      method_34837(0.3F, class_4897.field_24435);
      method_34837(0.3F, class_4897.field_24480);
      method_34837(0.3F, class_4897.field_24788);
      method_34837(0.3F, class_4897.field_25205);
      method_34837(0.3F, class_4897.field_24621);
      method_34837(0.5F, class_4897.field_24633);
      method_34837(0.5F, class_4897.field_25109);
      method_34837(0.5F, class_4897.field_25036);
      method_34837(0.5F, class_4897.field_25275);
      method_34837(0.5F, class_4897.field_25266);
      method_34837(0.5F, class_4897.field_24950);
      method_34837(0.5F, class_4897.field_24417);
      method_34837(0.5F, class_4897.field_24334);
      method_34837(0.5F, class_4897.field_24341);
      method_34837(0.65F, class_4897.field_24333);
      method_34837(0.65F, class_4897.field_24485);
      method_34837(0.65F, class_4897.field_24620);
      method_34837(0.65F, class_4897.field_25172);
      method_34837(0.65F, class_4897.field_24529);
      method_34837(0.65F, class_4897.field_24753);
      method_34837(0.65F, class_4897.field_24362);
      method_34837(0.65F, class_4897.field_25136);
      method_34837(0.65F, class_4897.field_24645);
      method_34837(0.65F, class_4897.field_25273);
      method_34837(0.65F, class_4897.field_24813);
      method_34837(0.65F, class_4897.field_24467);
      method_34837(0.65F, class_4897.field_24972);
      method_34837(0.65F, class_4897.field_24386);
      method_34837(0.65F, class_4897.field_24379);
      method_34837(0.65F, class_4897.field_24963);
      method_34837(0.65F, class_4897.field_24573);
      method_34837(0.65F, class_4897.field_25160);
      method_34837(0.65F, class_4897.field_24965);
      method_34837(0.65F, class_4897.field_24669);
      method_34837(0.65F, class_4897.field_24515);
      method_34837(0.65F, class_4897.field_25233);
      method_34837(0.65F, class_4897.field_25014);
      method_34837(0.65F, class_4897.field_25227);
      method_34837(0.65F, class_4897.field_24400);
      method_34837(0.65F, class_4897.field_24875);
      method_34837(0.65F, class_4897.field_24674);
      method_34837(0.65F, class_4897.field_24949);
      method_34837(0.65F, class_4897.field_25232);
      method_34837(0.65F, class_4897.field_25305);
      method_34837(0.65F, class_4897.field_24892);
      method_34837(0.65F, class_4897.field_25234);
      method_34837(0.65F, class_4897.field_24893);
      method_34837(0.65F, class_4897.field_25056);
      method_34837(0.65F, class_4897.field_25074);
      method_34837(0.65F, class_4897.field_25219);
      method_34837(0.65F, class_4897.field_24870);
      method_34837(0.65F, class_4897.field_24533);
      method_34837(0.65F, class_4897.field_24900);
      method_34837(0.85F, class_4897.field_24742);
      method_34837(0.85F, class_4897.field_25092);
      method_34837(0.85F, class_4897.field_24942);
      method_34837(0.85F, class_4897.field_25236);
      method_34837(0.85F, class_4897.field_24987);
      method_34837(0.85F, class_4897.field_24456);
      method_34837(0.85F, class_4897.field_24397);
      method_34837(0.85F, class_4897.field_24763);
      method_34837(1.0F, class_4897.field_25240);
      method_34837(1.0F, class_4897.field_25148);
   }

   private static void method_34837(float var0, class_8525 var1) {
      field_39051.put(var1.method_10803(), var0);
   }

   public class_7689(class_3073 var1) {
      super(var1);
      this.method_29284(this.field_32751.method_36446().method_10308(field_39050, Integer.valueOf(0)));
   }

   public static void method_34836(class_6486 var0, class_1331 var1, boolean var2) {
      class_2522 var5 = var0.method_28262(var1);
      var0.method_29527(
         (double)var1.method_12173(),
         (double)var1.method_12165(),
         (double)var1.method_12185(),
         !var2 ? class_463.field_2700 : class_463.field_2286,
         class_562.field_3322,
         1.0F,
         1.0F,
         false
      );
      double var6 = var5.method_8334(var0, var1).method_19499(class_9249.field_47216, 0.5, 0.5) + 0.03125;
      double var8 = 0.13125F;
      double var10 = 0.7375F;
      Random var12 = var0.method_43360();

      for (int var13 = 0; var13 < 10; var13++) {
         double var14 = var12.nextGaussian() * 0.02;
         double var16 = var12.nextGaussian() * 0.02;
         double var18 = var12.nextGaussian() * 0.02;
         var0.method_43361(
            class_3090.field_15384,
            (double)var1.method_12173() + 0.13125F + 0.7375F * (double)var12.nextFloat(),
            (double)var1.method_12165() + var6 + (double)var12.nextFloat() * (1.0 - var6),
            (double)var1.method_12185() + 0.13125F + 0.7375F * (double)var12.nextFloat(),
            var14,
            var16,
            var18
         );
      }
   }

   @Override
   public class_4190 method_10769(class_2522 var1, class_6163 var2, class_1331 var3, class_214 var4) {
      return field_39054[var1.<Integer>method_10313(field_39050)];
   }

   @Override
   public class_4190 method_10776(class_2522 var1, class_6163 var2, class_1331 var3) {
      return field_39053;
   }

   @Override
   public class_4190 method_10775(class_2522 var1, class_6163 var2, class_1331 var3, class_214 var4) {
      return field_39054[0];
   }

   @Override
   public void method_10760(class_2522 var1, class_6486 var2, class_1331 var3, class_2522 var4, boolean var5) {
      if (var1.<Integer>method_10313(field_39050) == 7) {
         var2.method_43367().method_14011(var3, var1.method_8360(), 20);
      }
   }

   @Override
   public class_6910 method_10777(class_2522 var1, class_6486 var2, class_1331 var3, class_704 var4, class_2584 var5, class_9529 var6) {
      int var9 = var1.<Integer>method_10313(field_39050);
      class_6098 var10 = var4.method_26617(var5);
      if (var9 < 8 && field_39051.containsKey(var10.method_27960())) {
         if (var9 < 7 && !var2.field_33055) {
            class_2522 var11 = method_34844(var1, var2, var3, var10);
            var2.method_43364(1500, var3, var1 == var11 ? 0 : 1);
            if (!var4.field_3876.field_4944) {
               var10.method_27970(1);
            }
         }

         return class_6910.method_31659(var2.field_33055);
      } else if (var9 != 8) {
         return class_6910.field_35521;
      } else {
         method_34839(var1, var2, var3);
         return class_6910.method_31659(var2.field_33055);
      }
   }

   public static class_2522 method_34840(class_2522 var0, class_6331 var1, class_6098 var2, class_1331 var3) {
      int var6 = var0.<Integer>method_10313(field_39050);
      if (var6 < 7 && field_39051.containsKey(var2.method_27960())) {
         class_2522 var7 = method_34844(var0, var1, var3, var2);
         var2.method_27970(1);
         return var7;
      } else {
         return var0;
      }
   }

   public static class_2522 method_34839(class_2522 var0, class_6486 var1, class_1331 var2) {
      if (!var1.field_33055) {
         float var5 = 0.7F;
         double var6 = (double)(var1.field_33033.nextFloat() * 0.7F) + 0.15F;
         double var8 = (double)(var1.field_33033.nextFloat() * 0.7F) + 0.060000002F + 0.6;
         double var10 = (double)(var1.field_33033.nextFloat() * 0.7F) + 0.15F;
         class_91 var12 = new class_91(
            var1,
            (double)var2.method_12173() + var6,
            (double)var2.method_12165() + var8,
            (double)var2.method_12185() + var10,
            new class_6098(class_4897.field_24640)
         );
         var12.method_257();
         var1.method_7509(var12);
      }

      class_2522 var13 = method_34838(var0, var1, var2);
      var1.method_43359((class_704)null, var2, class_463.field_2852, class_562.field_3322, 1.0F, 1.0F);
      return var13;
   }

   private static class_2522 method_34838(class_2522 var0, class_9379 var1, class_1331 var2) {
      class_2522 var5 = var0.method_10308(field_39050, Integer.valueOf(0));
      var1.method_7513(var2, var5, 3);
      return var5;
   }

   private static class_2522 method_34844(class_2522 var0, class_9379 var1, class_1331 var2, class_6098 var3) {
      int var6 = var0.<Integer>method_10313(field_39050);
      float var7 = field_39051.getFloat(var3.method_27960());
      if ((var6 != 0 || !(var7 > 0.0F)) && !(var1.method_43360().nextDouble() < (double)var7)) {
         return var0;
      } else {
         int var8 = var6 + 1;
         class_2522 var9 = var0.method_10308(field_39050, Integer.valueOf(var8));
         var1.method_7513(var2, var9, 3);
         if (var8 == 7) {
            var1.method_43367().method_14011(var2, var0.method_8360(), 20);
         }

         return var9;
      }
   }

   @Override
   public void method_10797(class_2522 var1, class_6331 var2, class_1331 var3, Random var4) {
      if (var1.<Integer>method_10313(field_39050) == 7) {
         var2.method_7513(var3, var1.method_10317(field_39050), 3);
         var2.method_43359((class_704)null, var3, class_463.field_2157, class_562.field_3322, 1.0F, 1.0F);
      }
   }

   @Override
   public boolean method_10770(class_2522 var1) {
      return true;
   }

   @Override
   public int method_10795(class_2522 var1, class_6486 var2, class_1331 var3) {
      return var1.<Integer>method_10313(field_39050);
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_39050);
   }

   @Override
   public boolean method_10793(class_2522 var1, class_6163 var2, class_1331 var3, class_2929 var4) {
      return false;
   }

   @Override
   public class_372 method_39702(class_2522 var1, class_9379 var2, class_1331 var3) {
      int var6 = var1.<Integer>method_10313(field_39050);
      return (class_372)(var6 != 8
         ? (class_372)(var6 >= 7 ? new class_4831() : new class_2129(var1, var2, var3))
         : new class_1865(var1, var2, var3, new class_6098(class_4897.field_24640)));
   }
}
