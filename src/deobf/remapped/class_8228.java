package remapped;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;
import java.util.List;
import java.util.UUID;

public class class_8228 extends class_2451 implements class_9866 {
   private static final UUID[] field_42247 = new UUID[]{
      UUID.fromString("845DB27C-C624-495F-8C9F-6020A9A58B6B"),
      UUID.fromString("D8499B04-0E66-4726-AB29-64469D734E0D"),
      UUID.fromString("9F3D476D-C118-4544-8365-64846904B48E"),
      UUID.fromString("2AD3F246-FEE1-4E67-B886-69FD380BB150")
   };
   public static final class_6191 field_42243 = new class_2265();
   public final class_6943 field_42246;
   public final int field_42244;
   private final float field_42240;
   public final float field_42242;
   public final class_4814 field_42245;
   private final Multimap<class_225, class_9343> field_42241;

   public static boolean method_37666(class_8743 var0, class_6098 var1) {
      class_1331 var4 = var0.method_40142().method_6098(var0.method_40141().<Direction>method_10313(class_6451.field_32900));
      List var5 = var0.method_40140().<Entity>method_25869(class_5834.class, new class_4092(var4), class_3572.field_17483.and(new class_8389(var1)));
      if (!var5.isEmpty()) {
         class_5834 var6 = (class_5834)var5.get(0);
         class_6943 var7 = class_5886.method_26896(var1);
         class_6098 var8 = var1.method_27953(1);
         var6.method_37349(var7, var8);
         if (var6 instanceof class_5886) {
            ((class_5886)var6).method_26861(var7, 2.0F);
            ((class_5886)var6).method_26883();
         }

         return true;
      } else {
         return false;
      }
   }

   public class_8228(class_4814 var1, class_6943 var2, class_317 var3) {
      super(var3.method_1471(var1.method_22184(var2)));
      this.field_42245 = var1;
      this.field_42246 = var2;
      this.field_42244 = var1.method_22190(var2);
      this.field_42240 = var1.method_22185();
      this.field_42242 = var1.method_22189();
      class_6451.method_29408(this, field_42243);
      Builder var6 = ImmutableMultimap.builder();
      UUID var7 = field_42247[var2.method_31767()];
      var6.put(class_7331.field_37473, new class_9343(var7, "Armor modifier", (double)this.field_42244, class_9342.field_47679));
      var6.put(class_7331.field_37472, new class_9343(var7, "Armor toughness", (double)this.field_42240, class_9342.field_47679));
      if (var1 == class_5667.field_28732) {
         var6.put(class_7331.field_37463, new class_9343(var7, "Armor knockback resistance", (double)this.field_42242, class_9342.field_47679));
      }

      this.field_42241 = var6.build();
   }

   public class_6943 method_37669() {
      return this.field_42246;
   }

   @Override
   public int method_11213() {
      return this.field_42245.method_22187();
   }

   public class_4814 method_37667() {
      return this.field_42245;
   }

   @Override
   public boolean method_11223(class_6098 var1, class_6098 var2) {
      return this.field_42245.method_22188().test(var2) || super.method_11223(var1, var2);
   }

   @Override
   public class_954<class_6098> method_11231(World var1, class_704 var2, class_2584 var3) {
      class_6098 var6 = var2.method_26617(var3);
      class_6943 var7 = class_5886.method_26896(var6);
      class_6098 var8 = var2.method_26520(var7);
      if (!var8.method_28022()) {
         return class_954.<class_6098>method_4202(var6);
      } else {
         var2.method_37349(var7, var6.method_27973());
         var6.method_28017(0);
         return class_954.<class_6098>method_4208(var6, var1.method_22567());
      }
   }

   @Override
   public Multimap<class_225, class_9343> method_11205(class_6943 var1) {
      return var1 != this.field_42246 ? super.method_11205(var1) : this.field_42241;
   }

   public int method_37665() {
      return this.field_42244;
   }

   public float method_37668() {
      return this.field_42240;
   }
}
