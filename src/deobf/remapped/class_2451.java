package remapped;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import javax.annotation.Nullable;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_2451 implements class_8525 {
   public static final Map<class_6414, class_2451> field_12170 = Maps.newHashMap();
   public static final UUID field_12168 = UUID.fromString("CB3F55D3-645C-4F38-A497-9C13A33DB5CF");
   public static final UUID field_12167 = UUID.fromString("FA233E1C-4180-4865-B01B-BCCE9785ACA3");
   public static final Random field_12172 = new Random();
   public final class_8230 field_12171;
   private final class_5053 field_12174;
   private final int field_12173;
   private final int field_12176;
   private final boolean field_12175;
   private final class_2451 field_12165;
   private String field_12169;
   private final class_8341 field_12166;

   public static int method_11244(class_2451 var0) {
      return var0 != null ? class_8669.field_44382.method_14041(var0) : 0;
   }

   public static class_2451 method_11220(int var0) {
      return class_8669.field_44382.method_14040(var0);
   }

   @Deprecated
   public static class_2451 method_11225(class_6414 var0) {
      return field_12170.getOrDefault(var0, class_4897.field_25302);
   }

   public class_2451(class_317 var1) {
      this.field_12171 = class_317.method_1476(var1);
      this.field_12174 = class_317.method_1479(var1);
      this.field_12165 = class_317.method_1473(var1);
      this.field_12176 = class_317.method_1475(var1);
      this.field_12173 = class_317.method_1472(var1);
      this.field_12166 = class_317.method_1482(var1);
      this.field_12175 = class_317.method_1484(var1);
   }

   public void method_11228(World var1, class_5834 var2, class_6098 var3, int var4) {
   }

   public boolean method_11215(class_5734 var1) {
      return false;
   }

   public boolean method_11203(class_2522 var1, World var2, class_1331 var3, class_704 var4) {
      return true;
   }

   @Override
   public class_2451 method_10803() {
      return this;
   }

   public class_6910 method_11237(class_4734 var1) {
      return class_6910.field_35521;
   }

   public float method_11235(class_6098 var1, class_2522 var2) {
      return 1.0F;
   }

   public class_954<class_6098> method_11231(World var1, class_704 var2, class_2584 var3) {
      if (!this.method_11247()) {
         return class_954.<class_6098>method_4207(var2.method_26617(var3));
      } else {
         class_6098 var6 = var2.method_26617(var3);
         if (!var2.method_3231(this.method_11227().method_38403())) {
            return class_954.<class_6098>method_4202(var6);
         } else {
            var2.method_26462(var3);
            return class_954.<class_6098>method_4206(var6);
         }
      }
   }

   public class_6098 method_11242(class_6098 var1, World var2, class_5834 var3) {
      return !this.method_11247() ? var1 : var3.method_26426(var2, var1);
   }

   public final int method_11245() {
      return this.field_12173;
   }

   public final int method_11234() {
      return this.field_12176;
   }

   public boolean method_11210() {
      return this.field_12176 > 0;
   }

   public boolean method_11246(class_6098 var1, class_5834 var2, class_5834 var3) {
      return false;
   }

   public boolean method_11209(class_6098 var1, World var2, class_2522 var3, class_1331 var4, class_5834 var5) {
      return false;
   }

   public boolean method_11222(class_2522 var1) {
      return false;
   }

   public class_6910 method_11202(class_6098 var1, class_704 var2, class_5834 var3, class_2584 var4) {
      return class_6910.field_35521;
   }

   public ITextComponent method_11219() {
      return new TranslationTextComponent(this.method_11216());
   }

   @Override
   public String toString() {
      return class_8669.field_44382.method_39797(this).method_21456();
   }

   public String method_11212() {
      if (this.field_12169 == null) {
         this.field_12169 = Util.createTranslationKey("item", class_8669.field_44382.method_39797(this));
      }

      return this.field_12169;
   }

   public String method_11216() {
      return this.method_11212();
   }

   public String method_11217(class_6098 var1) {
      return this.method_11216();
   }

   public boolean method_11251() {
      return true;
   }

   @Nullable
   public final class_2451 method_11241() {
      return this.field_12165;
   }

   public boolean method_11232() {
      return this.field_12165 != null;
   }

   public void method_11214(class_6098 var1, World var2, Entity var3, int var4, boolean var5) {
   }

   public void method_11236(class_6098 var1, World var2, class_704 var3) {
   }

   public boolean method_11221() {
      return false;
   }

   public class_6209 method_11233(class_6098 var1) {
      return !var1.method_27960().method_11247() ? class_6209.field_31737 : class_6209.field_31732;
   }

   public int method_11230(class_6098 var1) {
      if (!var1.method_27960().method_11247()) {
         return 0;
      } else {
         return !this.method_11227().method_38405() ? 32 : 16;
      }
   }

   public void method_11206(class_6098 var1, World var2, class_5834 var3, int var4) {
   }

   public void method_11218(class_6098 var1, World var2, List<ITextComponent> var3, class_4605 var4) {
   }

   public ITextComponent method_11249(class_6098 var1) {
      return new TranslationTextComponent(this.method_11217(var1));
   }

   public boolean method_11252(class_6098 var1) {
      return var1.method_28020();
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public class_5053 method_11240(class_6098 var1) {
      if (!var1.method_28020()) {
         return this.field_12174;
      } else {
         switch (this.field_12174) {
            case field_26116:
            case field_26120:
               return class_5053.field_26114;
            case field_26114:
               return class_5053.field_26115;
            case field_26115:
            default:
               return this.field_12174;
         }
      }
   }

   public boolean method_11248(class_6098 var1) {
      return this.method_11245() == 1 && this.method_11210();
   }

   public static class_9529 method_11238(World var0, class_704 var1, class_9583 var2) {
      float var5 = var1.field_41755;
      float var6 = var1.field_41701;
      class_1343 var7 = var1.method_37335(1.0F);
      float var8 = class_9299.method_42840(-var6 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float var9 = class_9299.method_42818(-var6 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float var10 = -class_9299.method_42840(-var5 * (float) (Math.PI / 180.0));
      float var11 = class_9299.method_42818(-var5 * (float) (Math.PI / 180.0));
      float var12 = var9 * var10;
      float var13 = var8 * var10;
      double var14 = 5.0;
      class_1343 var16 = var7.method_6214((double)var12 * 5.0, (double)var11 * 5.0, (double)var13 * 5.0);
      return var0.method_28265(new class_972(var7, var16, class_3132.field_15549, var2, var1));
   }

   public int method_11213() {
      return 0;
   }

   public void method_11239(class_8230 var1, class_2831<class_6098> var2) {
      if (this.method_11224(var1)) {
         var2.add(new class_6098(this));
      }
   }

   public boolean method_11224(class_8230 var1) {
      class_8230 var4 = this.method_11226();
      return var4 != null && (var1 == class_8230.field_42264 || var1 == var4);
   }

   @Nullable
   public final class_8230 method_11226() {
      return this.field_12171;
   }

   public boolean method_11223(class_6098 var1, class_6098 var2) {
      return false;
   }

   public Multimap<class_225, class_9343> method_11205(class_6943 var1) {
      return ImmutableMultimap.of();
   }

   public boolean method_11204(class_6098 var1) {
      return var1.method_27960() == class_4897.field_25030;
   }

   public class_6098 method_11207() {
      return new class_6098(this);
   }

   public boolean method_11250(class_2307<class_2451> var1) {
      return var1.method_10609(this);
   }

   public boolean method_11247() {
      return this.field_12166 != null;
   }

   @Nullable
   public class_8341 method_11227() {
      return this.field_12166;
   }

   public class_8461 method_11253() {
      return class_463.field_2202;
   }

   public class_8461 method_11243() {
      return class_463.field_2831;
   }

   public boolean method_11208() {
      return this.field_12175;
   }

   public boolean method_11211(class_6199 var1) {
      return !this.field_12175 || !var1.method_28360();
   }
}
