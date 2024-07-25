package remapped;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.objects.Object2DoubleArrayMap;
import it.unimi.dsi.fastutil.objects.Object2DoubleMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.ITextComponent$class_40;
import net.minecraft.util.text.event.ClickEvent;
import net.minecraft.util.text.event.HoverEvent;
import net.minecraft.util.text.event.HoverEvent$class_48;
import net.minecraft.util.text.event.HoverEvent$class_49;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class Entity implements class_9875, class_5801 {
   public static final Logger field_41741 = LogManager.getLogger();
   private static final AtomicInteger field_41718 = new AtomicInteger();
   private static final List<ItemStack> field_41696 = Collections.<ItemStack>emptyList();
   private static final class_4092 field_41769 = new class_4092(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
   private static double field_41756 = 1.0;
   private final class_6629<?> field_41719;
   private int field_41740 = field_41718.incrementAndGet();
   public boolean field_41759;
   private final List<Entity> field_41707 = Lists.newArrayList();
   public int field_41773;
   private Entity field_41739;
   public boolean field_41722;
   public World field_41768;
   public double field_41767;
   public double field_41698;
   public double field_41725;
   public class_1343 field_41736;
   public class_1331 field_41702;
   private class_1343 field_41766 = class_1343.field_7335;
   public float field_41701;
   public float field_41755;
   public float field_41711;
   public float field_41762;
   public class_4092 field_41712 = field_41769;
   public boolean field_41726;
   public boolean field_41744;
   public boolean field_41774;
   public boolean field_41743;
   public class_1343 field_41729 = class_1343.field_7335;
   public boolean field_41751;
   public float field_41705;
   public float field_41695;
   public float field_41723;
   public float field_41706;
   private float field_41765 = 1.0F;
   private float field_41748 = 1.0F;
   public double field_41754;
   public double field_41713;
   public double field_41724;
   public float field_41733;
   public boolean field_41731;
   public float field_41721;
   public final Random field_41717 = new Random();
   public int field_41697;
   private int field_41728 = -this.method_37112();
   public boolean field_41737;
   public Object2DoubleMap<class_2307<class_2340>> field_41694 = new Object2DoubleArrayMap(2);
   public boolean field_41715;
   public class_2307<class_2340> field_41720;
   public int field_41749;
   public boolean field_41716 = true;
   public final class_8073 field_41735;
   public static final class_7821<Byte> field_41770 = class_8073.<Byte>method_36641(Entity.class, class_2734.field_13361);
   private static final class_7821<Integer> field_41746 = class_8073.<Integer>method_36641(Entity.class, class_2734.field_13366);
   private static final class_7821<Optional<ITextComponent>> field_41708 = class_8073.<Optional<ITextComponent>>method_36641(
      Entity.class, class_2734.field_13359
   );
   public static final class_7821<Boolean> field_41699 = class_8073.<Boolean>method_36641(Entity.class, class_2734.field_13347);
   private static final class_7821<Boolean> field_41753 = class_8073.<Boolean>method_36641(Entity.class, class_2734.field_13347);
   private static final class_7821<Boolean> field_41761 = class_8073.<Boolean>method_36641(Entity.class, class_2734.field_13347);
   public static final class_7821<class_7653> field_41734 = class_8073.<class_7653>method_36641(Entity.class, class_2734.field_13365);
   public boolean field_41727;
   public int field_41742;
   public int field_41747;
   public int field_41714;
   private boolean field_41745;
   public class_1343 field_41700;
   public boolean field_41750;
   public boolean field_41763;
   private int field_41771;
   public boolean field_41772;
   public int field_41709;
   public class_1331 field_41764;
   private boolean field_41704;
   public UUID field_41738 = class_9299.method_42791(this.field_41717);
   public String field_41730 = this.field_41738.toString();
   public boolean field_41760;
   private final Set<String> field_41757 = Sets.newHashSet();
   private boolean field_41752;
   private final double[] field_41703 = new double[]{0.0, 0.0, 0.0};
   private long field_41732;
   private class_6097 field_41758;
   public float field_41710;

   public Entity(class_6629<?> var1, World var2) {
      this.field_41719 = var1;
      this.field_41768 = var2;
      this.field_41758 = var1.method_30473();
      this.field_41736 = class_1343.field_7335;
      this.field_41702 = class_1331.field_7306;
      this.field_41700 = class_1343.field_7335;
      this.method_37256(0.0, 0.0, 0.0);
      this.field_41735 = new class_8073(this);
      this.field_41735.method_36634(field_41770, (byte)0);
      this.field_41735.method_36634(field_41746, this.method_37099());
      this.field_41735.method_36634(field_41699, false);
      this.field_41735.method_36634(field_41708, Optional.<ITextComponent>empty());
      this.field_41735.method_36634(field_41753, false);
      this.field_41735.method_36634(field_41761, false);
      this.field_41735.method_36634(field_41734, class_7653.field_38885);
      this.method_37329();
      this.field_41710 = this.method_37279(class_7653.field_38885, this.field_41758);
   }

   public boolean method_37381(class_1331 var1, class_2522 var2) {
      class_4190 var5 = var2.method_8325(this.field_41768, var1, class_214.method_926(this));
      class_4190 var6 = var5.method_19496((double)var1.method_12173(), (double)var1.method_12165(), (double)var1.method_12185());
      return class_3370.method_15537(var6, class_3370.method_15523(this.method_37241()), class_8529.field_43655);
   }

   public int method_37324() {
      class_5086 var3 = this.method_37095();
      return var3 != null && var3.method_23381().getColor() != null ? var3.method_23381().getColor() : 16777215;
   }

   public boolean method_37221() {
      return false;
   }

   public final void method_37269() {
      if (this.method_37151()) {
         this.method_37305();
      }

      if (this.method_37070()) {
         this.method_37390();
      }
   }

   public void method_37223(double var1, double var3, double var5) {
      this.method_37358(new class_1343(var1, var3, var5));
   }

   public void method_37358(class_1343 var1) {
      this.field_41700 = var1;
   }

   public class_1343 method_37103() {
      return this.field_41700;
   }

   public class_6629<?> method_37387() {
      return this.field_41719;
   }

   public int method_37145() {
      return this.field_41740;
   }

   public void method_37091(int var1) {
      this.field_41740 = var1;
   }

   public Set<String> method_37293() {
      return this.field_41757;
   }

   public boolean method_37292(String var1) {
      return this.field_41757.size() < 1024 ? this.field_41757.add(var1) : false;
   }

   public boolean method_37238(String var1) {
      return this.field_41757.remove(var1);
   }

   public void method_37250() {
      this.method_37204();
   }

   public abstract void method_37329();

   public class_8073 method_37372() {
      return this.field_41735;
   }

   @Override
   public boolean equals(Object var1) {
      return !(var1 instanceof Entity) ? false : ((Entity)var1).field_41740 == this.field_41740;
   }

   @Override
   public int hashCode() {
      return this.field_41740;
   }

   public void method_37100() {
      if (this.field_41768 != null) {
         for (double var3 = this.method_37309(); var3 > 0.0 && var3 < 256.0; var3++) {
            this.method_37256(this.method_37302(), var3, this.method_37156());
            if (this.field_41768.method_6682(this)) {
               break;
            }
         }

         this.method_37215(class_1343.field_7335);
         this.field_41755 = 0.0F;
      }
   }

   public void method_37204() {
      this.field_41751 = true;
   }

   public void method_37356(class_7653 var1) {
      this.field_41735.method_36633(field_41734, var1);
   }

   public class_7653 method_37102() {
      return this.field_41735.<class_7653>method_36640(field_41734);
   }

   public boolean method_37124(Entity var1, double var2) {
      double var6 = var1.field_41736.field_7336 - this.field_41736.field_7336;
      double var8 = var1.field_41736.field_7333 - this.field_41736.field_7333;
      double var10 = var1.field_41736.field_7334 - this.field_41736.field_7334;
      return var6 * var6 + var8 * var8 + var10 * var10 < var2 * var2;
   }

   public void method_37395(float var1, float var2) {
      this.field_41701 = var1 % 360.0F;
      this.field_41755 = var2 % 360.0F;
   }

   public void method_37256(double var1, double var3, double var5) {
      this.method_37222(var1, var3, var5);
      this.method_37094(this.field_41758.method_27940(var1, var3, var5));
   }

   public void method_37351() {
      this.method_37256(this.field_41736.field_7336, this.field_41736.field_7333, this.field_41736.field_7334);
   }

   public void method_37218(double var1, double var3) {
      double var7 = var3 * 0.15;
      double var9 = var1 * 0.15;
      this.field_41755 = (float)((double)this.field_41755 + var7);
      this.field_41701 = (float)((double)this.field_41701 + var9);
      this.field_41755 = class_9299.method_42828(this.field_41755, -90.0F, 90.0F);
      this.field_41762 = (float)((double)this.field_41762 + var7);
      this.field_41711 = (float)((double)this.field_41711 + var9);
      this.field_41762 = class_9299.method_42828(this.field_41762, -90.0F, 90.0F);
      if (this.field_41739 != null) {
         this.field_41739.method_37224(this);
      }
   }

   public void method_37123() {
      if (!this.field_41768.field_33055) {
         this.method_37220(6, this.method_37116());
      }

      this.method_37219();
   }

   public void method_37219() {
      this.field_41768.method_29599().method_16056("entityBaseTick");
      if (this.method_37070() && this.method_37243().field_41751) {
         this.method_37390();
      }

      if (this.field_41773 > 0) {
         this.field_41773--;
      }

      this.field_41705 = this.field_41695;
      this.field_41762 = this.field_41755;
      this.field_41711 = this.field_41701;
      this.method_37237();
      if (this.method_37374()) {
         this.method_37343();
      }

      this.method_37228();
      this.method_37236();
      this.method_37337();
      if (!this.field_41768.field_33055) {
         if (this.field_41728 > 0) {
            if (!this.method_37087()) {
               if (this.field_41728 % 20 == 0 && !this.method_37370()) {
                  this.method_37181(class_6199.field_31665, 1.0F);
               }

               this.method_37164(this.field_41728 - 1);
            } else {
               this.method_37164(this.field_41728 - 4);
               if (this.field_41728 < 0) {
                  this.method_37136();
               }
            }
         }
      } else {
         this.method_37136();
      }

      if (this.method_37370()) {
         this.method_37208();
         this.field_41706 *= 0.5F;
      }

      if (this.method_37309() < -64.0) {
         this.method_37150();
      }

      if (!this.field_41768.field_33055) {
         this.method_37220(0, this.field_41728 > 0);
      }

      this.field_41716 = false;
      this.field_41768.method_29599().method_16054();
   }

   public void method_37157() {
      this.field_41771 = this.method_37300();
   }

   public boolean method_37121() {
      return this.field_41771 > 0;
   }

   public void method_37263() {
      if (this.method_37121()) {
         this.field_41771--;
      }
   }

   public int method_37244() {
      return 0;
   }

   public void method_37208() {
      if (!this.method_37087()) {
         this.method_37178(15);
         this.method_37181(class_6199.field_31691, 4.0F);
      }
   }

   public void method_37178(int var1) {
      int var4 = var1 * 20;
      if (this instanceof class_5834) {
         var4 = class_5139.method_23552((class_5834)this, var4);
      }

      if (this.field_41728 < var4) {
         this.method_37164(var4);
      }
   }

   public void method_37164(int var1) {
      this.field_41728 = var1;
   }

   public int method_37230() {
      return this.field_41728;
   }

   public void method_37136() {
      this.method_37164(0);
   }

   public void method_37150() {
      this.method_37204();
   }

   public boolean method_37159(double var1, double var3, double var5) {
      return this.method_37089(this.method_37241().method_18918(var1, var3, var5));
   }

   private boolean method_37089(class_4092 var1) {
      return this.field_41768.method_6683(this, var1) && !this.field_41768.method_22550(var1);
   }

   public void method_37386(boolean var1) {
      this.field_41726 = var1;
   }

   public boolean method_37360() {
      return this.field_41726;
   }

   public void method_37226(class_7412 var1, class_1343 var2) {
      if (MinecraftClient.getInstance().thePlayer != null
         && MinecraftClient.getInstance().thePlayer.method_37243() != null
         && MinecraftClient.getInstance().thePlayer.method_37243().method_37145() == this.method_37145()) {
         class_5088 var5 = new class_5088(var2.field_7336, var2.field_7333, var2.field_7334);
         SigmaMainClass.getInstance().getEventManager().call(var5);
         if (var5.method_29716()) {
            return;
         }

         var2 = new class_1343(var5.method_23387(), var5.method_23390(), var5.method_23386());
      }

      if (this.field_41731) {
         this.method_37094(this.method_37241().method_18920(var2));
         this.method_37298();
      } else {
         if (var1 == class_7412.field_37838) {
            var2 = this.method_37346(var2);
            if (var2.equals(class_1343.field_7335)) {
               return;
            }
         }

         this.field_41768.method_29599().method_16056("move");
         if (this.field_41729.method_6221() > 1.0E-7) {
            var2 = var2.method_6211(this.field_41729);
            this.field_41729 = class_1343.field_7335;
            this.method_37215(class_1343.field_7335);
         }

         var2 = this.method_37295(var2, var1);
         class_1343 var25 = this.method_37287(var2);
         if (var25.method_6221() > 1.0E-7) {
            this.method_37094(this.method_37241().method_18920(var25));
            this.method_37298();
         }

         this.field_41768.method_29599().method_16054();
         this.field_41768.method_29599().method_16056("rest");
         this.field_41744 = !class_9299.method_42855(var2.field_7336, var25.field_7336) || !class_9299.method_42855(var2.field_7334, var25.field_7334);
         this.field_41774 = var2.field_7333 != var25.field_7333;
         this.field_41726 = this.field_41774 && var2.field_7333 < 0.0;
         class_1331 var6 = this.method_37341();
         class_2522 var7 = this.field_41768.method_28262(var6);
         this.method_37105(var25.field_7333, this.field_41726, var7, var6);
         class_1343 var8 = this.method_37098();
         if (var2.field_7336 != var25.field_7336) {
            this.method_37214(0.0, var8.field_7333, var8.field_7334);
         }

         if (var2.field_7334 != var25.field_7334) {
            this.method_37214(var8.field_7336, var8.field_7333, 0.0);
         }

         class_6414 var9 = var7.method_8360();
         if (var2.field_7333 != var25.field_7333) {
            var9.method_29297(this.field_41768, this);
         }

         if (this.field_41726 && !this.method_37117()) {
            var9.method_29286(this.field_41768, var6, this);
         }

         if (this.method_37126() && !this.method_37070()) {
            double var10 = var25.field_7336;
            double var12 = var25.field_7333;
            double var14 = var25.field_7334;
            if (!var9.method_29299(class_2351.field_11770)) {
               var12 = 0.0;
            }

            this.field_41695 = (float)((double)this.field_41695 + (double)class_9299.method_42842(method_37266(var25)) * 0.6);
            this.field_41723 = (float)((double)this.field_41723 + (double)class_9299.method_42842(var10 * var10 + var12 * var12 + var14 * var14) * 0.6);
            if (this.field_41723 > this.field_41765 && !var7.method_8345()) {
               this.field_41765 = this.method_37316();
               if (!this.method_37285()) {
                  this.method_37207(var6, var7);
               } else {
                  Entity var16 = this.method_37151() && this.method_37259() != null ? this.method_37259() : this;
                  float var17 = var16 == this ? 0.35F : 0.4F;
                  class_1343 var18 = var16.method_37098();
                  float var19 = class_9299.method_42842(
                        var18.field_7336 * var18.field_7336 * 0.2F + var18.field_7333 * var18.field_7333 + var18.field_7334 * var18.field_7334 * 0.2F
                     )
                     * var17;
                  if (var19 > 1.0F) {
                     var19 = 1.0F;
                  }

                  this.method_37203(var19);
               }
            } else if (this.field_41723 > this.field_41748 && this.method_37217() && var7.method_8345()) {
               this.field_41748 = this.method_37147(this.field_41723);
            }
         }

         try {
            this.method_37097();
         } catch (Throwable var23) {
            class_159 var21 = class_159.method_643(var23, "Checking entity block collision");
            class_6544 var22 = var21.method_639("Entity being checked for collision");
            this.method_37331(var22);
            throw new class_3297(var21);
         }

         float var20 = this.method_37364();
         this.method_37215(this.method_37098().method_6210((double)var20, 1.0, (double)var20));
         if (this.field_41768
               .method_22549(this.method_37241().method_18924(0.001))
               .noneMatch(var0 -> var0.method_8349(class_2351.field_11771) || var0.method_8350(class_4783.field_23811))
            && this.field_41728 <= 0) {
            this.method_37164(-this.method_37112());
         }

         if (this.method_37110() && this.method_37264()) {
            this.method_37155(class_463.field_2557, 0.7F, 1.6F + (this.field_41717.nextFloat() - this.field_41717.nextFloat()) * 0.4F);
            this.method_37164(-this.method_37112());
         }

         this.field_41768.method_29599().method_16054();
      }
   }

   public class_1331 method_37341() {
      int var3 = class_9299.method_42847(this.field_41736.field_7336);
      int var4 = class_9299.method_42847(this.field_41736.field_7333 - 0.2F);
      int var5 = class_9299.method_42847(this.field_41736.field_7334);
      class_1331 var6 = new class_1331(var3, var4, var5);
      if (this.field_41768.method_28262(var6).method_8345()) {
         class_1331 var7 = var6.method_6100();
         class_2522 var8 = this.field_41768.method_28262(var7);
         class_6414 var9 = var8.method_8360();
         if (var9.method_29299(class_2351.field_11728) || var9.method_29299(class_2351.field_11759) || var9 instanceof class_1645) {
            return var7;
         }
      }

      return var6;
   }

   public float method_37281() {
      float var3 = this.field_41768.method_28262(this.method_37075()).method_8360().method_29258();
      float var4 = this.field_41768.method_28262(this.method_37119()).method_8360().method_29258();
      return (double)var3 != 1.0 ? var3 : var4;
   }

   public float method_37364() {
      class_6414 var3 = this.field_41768.method_28262(this.method_37075()).method_8360();
      float var4 = var3.method_29287();
      if (var3 != class_4783.field_23900 && var3 != class_4783.field_23269) {
         return (double)var4 != 1.0 ? var4 : this.field_41768.method_28262(this.method_37119()).method_8360().method_29287();
      } else {
         return var4;
      }
   }

   public class_1331 method_37119() {
      return new class_1331(this.field_41736.field_7336, this.method_37241().field_19937 - 0.5000001, this.field_41736.field_7334);
   }

   public class_1343 method_37295(class_1343 var1, class_7412 var2) {
      return var1;
   }

   public class_1343 method_37346(class_1343 var1) {
      if (!(var1.method_6221() <= 1.0E-7)) {
         long var4 = this.field_41768.method_29546();
         if (var4 != this.field_41732) {
            Arrays.fill(this.field_41703, 0.0);
            this.field_41732 = var4;
         }

         if (var1.field_7336 == 0.0) {
            if (var1.field_7333 == 0.0) {
               if (var1.field_7334 == 0.0) {
                  return class_1343.field_7335;
               } else {
                  double var9 = this.method_37322(class_9249.field_47219, var1.field_7334);
                  return !(Math.abs(var9) <= 1.0E-5F) ? new class_1343(0.0, 0.0, var9) : class_1343.field_7335;
               }
            } else {
               double var8 = this.method_37322(class_9249.field_47216, var1.field_7333);
               return !(Math.abs(var8) <= 1.0E-5F) ? new class_1343(0.0, var8, 0.0) : class_1343.field_7335;
            }
         } else {
            double var6 = this.method_37322(class_9249.field_47215, var1.field_7336);
            return !(Math.abs(var6) <= 1.0E-5F) ? new class_1343(var6, 0.0, 0.0) : class_1343.field_7335;
         }
      } else {
         return var1;
      }
   }

   private double method_37322(class_9249 var1, double var2) {
      int var6 = var1.ordinal();
      double var7 = class_9299.method_42827(var2 + this.field_41703[var6], -0.51, 0.51);
      var2 = var7 - this.field_41703[var6];
      this.field_41703[var6] = var7;
      return var2;
   }

   public class_1343 method_37287(class_1343 var1) {
      class_4092 var4 = this.method_37241();
      class_214 var5 = class_214.method_926(this);
      class_4190 var6 = this.field_41768.method_6673().method_9820();
      Stream var7 = !class_3370.method_15537(var6, class_3370.method_15523(var4.method_18924(1.0E-7)), class_8529.field_43655)
         ? Stream.<class_4190>of(var6)
         : Stream.empty();
      Stream var8 = this.field_41768.method_6679(this, var4.method_18929(var1), var0 -> true);
      class_4997 var9 = new class_4997(Stream.concat(var8, var7));
      class_1343 var10 = var1.method_6221() != 0.0 ? method_37301(this, var1, var4, this.field_41768, var5, var9) : var1;
      boolean var11 = var1.field_7336 != var10.field_7336;
      boolean var12 = var1.field_7333 != var10.field_7333;
      boolean var13 = var1.field_7334 != var10.field_7334;
      boolean var14 = this.field_41726 || var12 && var1.field_7333 < 0.0;
      if (this.field_41733 > 0.0F && var14 && (var11 || var13)) {
         class_1343 var15 = method_37301(this, new class_1343(var1.field_7336, (double)this.field_41733, var1.field_7334), var4, this.field_41768, var5, var9);
         class_1343 var16 = method_37301(
            this, new class_1343(0.0, (double)this.field_41733, 0.0), var4.method_18928(var1.field_7336, 0.0, var1.field_7334), this.field_41768, var5, var9
         );
         if (var16.field_7333 < (double)this.field_41733) {
            class_1343 var17 = method_37301(this, new class_1343(var1.field_7336, 0.0, var1.field_7334), var4.method_18920(var16), this.field_41768, var5, var9)
               .method_6215(var16);
            if (method_37266(var17) > method_37266(var15)) {
               var15 = var17;
            }
         }

         double var18 = !(this instanceof class_5989)
            ? 0.0
            : method_37301(this, new class_1343(0.0, -var15.field_7333, 0.0), var4.method_18920(var15), this.field_41768, var5, var9).field_7333
               + var15.field_7333;
         boolean var20 = false;
         if (var18 != 0.0) {
            class_8544 var21 = new class_8544(var18, var10);
            SigmaMainClass.getInstance().getEventManager().call(var21);
            var20 = var21.method_29716();
         }

         if (method_37266(var15) > method_37266(var10) && !var20) {
            return var15.method_6215(
               method_37301(this, new class_1343(0.0, -var15.field_7333 + var1.field_7333, 0.0), var4.method_18920(var15), this.field_41768, var5, var9)
            );
         }
      }

      return var10;
   }

   public static double method_37266(class_1343 var0) {
      return var0.field_7336 * var0.field_7336 + var0.field_7334 * var0.field_7334;
   }

   public static class_1343 method_37301(Entity var0, class_1343 var1, class_4092 var2, World var3, class_214 var4, class_4997<class_4190> var5) {
      boolean var8 = var1.field_7336 == 0.0;
      boolean var9 = var1.field_7333 == 0.0;
      boolean var10 = var1.field_7334 == 0.0;
      if (var8 && var9 || var8 && var10 || var9 && var10) {
         boolean var12 = var0 != null && var0 instanceof class_5989;
         return method_37288(var1, var2, var3, var4, var5, var12);
      } else {
         class_4997 var11 = new class_4997<class_4190>(Stream.<class_4190>concat(var5.method_23007(), var3.method_6680(var0, var2.method_18929(var1))));
         return method_37194(var1, var2, var11);
      }
   }

   public static class_1343 method_37194(class_1343 var0, class_4092 var1, class_4997<class_4190> var2) {
      double var5 = var0.field_7336;
      double var7 = var0.field_7333;
      double var9 = var0.field_7334;
      if (var7 != 0.0) {
         var7 = class_3370.method_15520(class_9249.field_47216, var1, var2.method_23007(), var7);
         if (var7 != 0.0) {
            var1 = var1.method_18918(0.0, var7, 0.0);
         }
      }

      boolean var11 = Math.abs(var5) < Math.abs(var9);
      if (var11 && var9 != 0.0) {
         var9 = class_3370.method_15520(class_9249.field_47219, var1, var2.method_23007(), var9);
         if (var9 != 0.0) {
            var1 = var1.method_18918(0.0, 0.0, var9);
         }
      }

      if (var5 != 0.0) {
         var5 = class_3370.method_15520(class_9249.field_47215, var1, var2.method_23007(), var5);
         if (!var11 && var5 != 0.0) {
            var1 = var1.method_18918(var5, 0.0, 0.0);
         }
      }

      if (!var11 && var9 != 0.0) {
         var9 = class_3370.method_15520(class_9249.field_47219, var1, var2.method_23007(), var9);
      }

      return new class_1343(var5, var7, var9);
   }

   public static class_1343 method_37288(class_1343 var0, class_4092 var1, class_4924 var2, class_214 var3, class_4997<class_4190> var4, boolean var5) {
      double var8 = var0.field_7336;
      double var10 = var0.field_7333;
      double var12 = var0.field_7334;
      if (var10 != 0.0) {
         var10 = class_3370.method_15521(class_9249.field_47216, var1, var2, var10, var3, var4.method_23007(), var5);
         if (var10 != 0.0) {
            var1 = var1.method_18918(0.0, var10, 0.0);
         }
      }

      boolean var14 = Math.abs(var8) < Math.abs(var12);
      if (var14 && var12 != 0.0) {
         var12 = class_3370.method_15521(class_9249.field_47219, var1, var2, var12, var3, var4.method_23007(), var5);
         if (var12 != 0.0) {
            var1 = var1.method_18918(0.0, 0.0, var12);
         }
      }

      if (var8 != 0.0) {
         var8 = class_3370.method_15521(class_9249.field_47215, var1, var2, var8, var3, var4.method_23007(), var5);
         if (!var14 && var8 != 0.0) {
            var1 = var1.method_18918(var8, 0.0, 0.0);
         }
      }

      if (!var14 && var12 != 0.0) {
         var12 = class_3370.method_15521(class_9249.field_47219, var1, var2, var12, var3, var4.method_23007(), var5);
      }

      return new class_1343(var8, var10, var12);
   }

   public float method_37316() {
      return (float)((int)this.field_41723 + 1);
   }

   public void method_37298() {
      class_4092 var3 = this.method_37241();
      this.method_37222((var3.field_19941 + var3.field_19940) / 2.0, var3.field_19937, (var3.field_19938 + var3.field_19942) / 2.0);
   }

   public class_8461 method_37239() {
      return class_463.field_2056;
   }

   public class_8461 method_37133() {
      return class_463.field_2517;
   }

   public class_8461 method_37357() {
      return class_463.field_2517;
   }

   public void method_37097() {
      class_4092 var3 = this.method_37241();
      class_1331 var4 = new class_1331(var3.field_19941 + 0.001, var3.field_19937 + 0.001, var3.field_19938 + 0.001);
      class_1331 var5 = new class_1331(var3.field_19940 - 0.001, var3.field_19939 - 0.001, var3.field_19942 - 0.001);
      class_2921 var6 = new class_2921();
      if (this.field_41768.method_22570(var4, var5)) {
         for (int var7 = var4.method_12173(); var7 <= var5.method_12173(); var7++) {
            for (int var8 = var4.method_12165(); var8 <= var5.method_12165(); var8++) {
               for (int var9 = var4.method_12185(); var9 <= var5.method_12185(); var9++) {
                  var6.method_13362(var7, var8, var9);
                  class_2522 var10 = this.field_41768.method_28262(var6);

                  try {
                     var10.method_8326(this.field_41768, var6, this);
                     this.method_37170(var10);
                  } catch (Throwable var14) {
                     class_159 var12 = class_159.method_643(var14, "Colliding entity with block");
                     class_6544 var13 = var12.method_639("Block being collided with");
                     class_6544.method_29843(var13, var6, var10);
                     throw new class_3297(var12);
                  }
               }
            }
         }
      }
   }

   public void method_37170(class_2522 var1) {
   }

   public void method_37207(class_1331 var1, class_2522 var2) {
      if (!var2.method_8362().method_24494()) {
         class_2522 var5 = this.field_41768.method_28262(var1.method_6081());
         class_4618 var6 = !var5.method_8350(class_4783.field_23552) ? var2.method_8316() : var5.method_8316();
         this.method_37155(var6.method_21396(), var6.method_21395() * 0.15F, var6.method_21393());
      }
   }

   public void method_37203(float var1) {
      this.method_37155(this.method_37239(), var1, 1.0F + (this.field_41717.nextFloat() - this.field_41717.nextFloat()) * 0.4F);
   }

   public float method_37147(float var1) {
      return 0.0F;
   }

   public boolean method_37217() {
      return false;
   }

   public void method_37155(class_8461 var1, float var2, float var3) {
      if (!this.method_37378()) {
         this.field_41768.method_29528((class_704)null, this.method_37302(), this.method_37309(), this.method_37156(), var1, this.method_37197(), var2, var3);
      }
   }

   public boolean method_37378() {
      return this.field_41735.<Boolean>method_36640(field_41753);
   }

   public void method_37338(boolean var1) {
      this.field_41735.method_36633(field_41753, var1);
   }

   public boolean method_37078() {
      return this.field_41735.<Boolean>method_36640(field_41761);
   }

   public void method_37182(boolean var1) {
      this.field_41735.method_36633(field_41761, var1);
   }

   public boolean method_37126() {
      return true;
   }

   public void method_37105(double var1, boolean var3, class_2522 var4, class_1331 var5) {
      if (!var3) {
         if (var1 < 0.0) {
            this.field_41706 = (float)((double)this.field_41706 - var1);
         }
      } else {
         if (this.field_41706 > 0.0F) {
            var4.method_8360().method_29263(this.field_41768, var5, this, this.field_41706);
         }

         this.field_41706 = 0.0F;
      }
   }

   public boolean method_37087() {
      return this.method_37387().method_30470();
   }

   public boolean method_37270(float var1, float var2) {
      if (this.method_37151()) {
         for (Entity var6 : this.method_37114()) {
            var6.method_37270(var1, var2);
         }
      }

      return false;
   }

   public boolean method_37285() {
      return this.field_41737;
   }

   private boolean method_37127() {
      class_1331 var3 = this.method_37075();
      return this.field_41768.method_29569(var3)
         || this.field_41768.method_29569(new class_1331((double)var3.method_12173(), this.method_37241().field_19939, (double)var3.method_12185()));
   }

   private boolean method_37369() {
      return this.field_41768.method_28262(this.method_37075()).method_8350(class_4783.field_23269);
   }

   public boolean method_37363() {
      return this.method_37285() || this.method_37127();
   }

   public boolean method_37110() {
      return this.method_37285() || this.method_37127() || this.method_37369();
   }

   public boolean method_37134() {
      return this.method_37285() || this.method_37369();
   }

   public boolean method_37179() {
      return this.field_41715 && this.method_37285();
   }

   public void method_37337() {
      if (!this.method_37113()) {
         this.method_37260(this.method_37321() && this.method_37179() && !this.method_37070());
      } else {
         this.method_37260(this.method_37321() && this.method_37285() && !this.method_37070());
      }
   }

   public boolean method_37228() {
      this.field_41694.clear();
      this.method_37362();
      double var3 = !this.field_41768.method_22572().method_40242() ? 0.0023333333333333335 : 0.007;
      boolean var5 = this.method_37143(class_6503.field_33095, var3);
      return this.method_37285() || var5;
   }

   public void method_37362() {
      if (!(this.method_37243() instanceof class_9149)) {
         if (!this.method_37143(class_6503.field_33094, 0.014)) {
            this.field_41737 = false;
         } else {
            if (!this.field_41737 && !this.field_41716) {
               this.method_37101();
            }

            this.field_41706 = 0.0F;
            this.field_41737 = true;
            this.method_37136();
         }
      } else {
         this.field_41737 = false;
      }
   }

   private void method_37236() {
      this.field_41715 = this.method_37261(class_6503.field_33094);
      this.field_41720 = null;
      double var3 = this.method_37388() - 0.11111111F;
      Entity var5 = this.method_37243();
      if (var5 instanceof class_9149) {
         class_9149 var6 = (class_9149)var5;
         if (!var6.method_37179() && var6.method_37241().field_19939 >= var3 && var6.method_37241().field_19937 <= var3) {
            return;
         }
      }

      class_1331 var12 = new class_1331(this.method_37302(), var3, this.method_37156());
      class_4774 var7 = this.field_41768.method_28258(var12);

      for (class_2307 var9 : class_6503.method_29650()) {
         if (var7.method_22007(var9)) {
            double var10 = (double)((float)var12.method_12165() + var7.method_22008(this.field_41768, var12));
            if (var10 > var3) {
               this.field_41720 = var9;
            }

            return;
         }
      }
   }

   public void method_37101() {
      Entity var3 = this.method_37151() && this.method_37259() != null ? this.method_37259() : this;
      float var4 = var3 != this ? 0.9F : 0.2F;
      class_1343 var5 = var3.method_37098();
      float var6 = class_9299.method_42842(
            var5.field_7336 * var5.field_7336 * 0.2F + var5.field_7333 * var5.field_7333 + var5.field_7334 * var5.field_7334 * 0.2F
         )
         * var4;
      if (var6 > 1.0F) {
         var6 = 1.0F;
      }

      if (!((double)var6 < 0.25)) {
         this.method_37155(this.method_37357(), var6, 1.0F + (this.field_41717.nextFloat() - this.field_41717.nextFloat()) * 0.4F);
      } else {
         this.method_37155(this.method_37133(), var6, 1.0F + (this.field_41717.nextFloat() - this.field_41717.nextFloat()) * 0.4F);
      }

      float var7 = (float)class_9299.method_42847(this.method_37309());

      for (int var8 = 0; (float)var8 < 1.0F + this.field_41758.field_31199 * 20.0F; var8++) {
         double var9 = (this.field_41717.nextDouble() * 2.0 - 1.0) * (double)this.field_41758.field_31199;
         double var11 = (this.field_41717.nextDouble() * 2.0 - 1.0) * (double)this.field_41758.field_31199;
         this.field_41768
            .method_43361(
               class_3090.field_15340,
               this.method_37302() + var9,
               (double)(var7 + 1.0F),
               this.method_37156() + var11,
               var5.field_7336,
               var5.field_7333 - this.field_41717.nextDouble() * 0.2F,
               var5.field_7334
            );
      }

      for (int var13 = 0; (float)var13 < 1.0F + this.field_41758.field_31199 * 20.0F; var13++) {
         double var14 = (this.field_41717.nextDouble() * 2.0 - 1.0) * (double)this.field_41758.field_31199;
         double var15 = (this.field_41717.nextDouble() * 2.0 - 1.0) * (double)this.field_41758.field_31199;
         this.field_41768
            .method_43361(
               class_3090.field_15346,
               this.method_37302() + var14,
               (double)(var7 + 1.0F),
               this.method_37156() + var15,
               var5.field_7336,
               var5.field_7333,
               var5.field_7334
            );
      }
   }

   public class_2522 method_37304() {
      return this.field_41768.method_28262(this.method_37341());
   }

   public boolean method_37374() {
      return this.method_37321() && !this.method_37285() && !this.method_37221() && !this.method_37382() && !this.method_37370() && this.method_37330();
   }

   public void method_37343() {
      int var3 = class_9299.method_42847(this.method_37302());
      int var4 = class_9299.method_42847(this.method_37309() - 0.2F);
      int var5 = class_9299.method_42847(this.method_37156());
      class_1331 var6 = new class_1331(var3, var4, var5);
      class_2522 var7 = this.field_41768.method_28262(var6);
      if (var7.method_8352() != class_7537.field_38470) {
         class_1343 var8 = this.method_37098();
         this.field_41768
            .method_43361(
               new class_7110(class_3090.field_15325, var7),
               this.method_37302() + (this.field_41717.nextDouble() - 0.5) * (double)this.field_41758.field_31199,
               this.method_37309() + 0.1,
               this.method_37156() + (this.field_41717.nextDouble() - 0.5) * (double)this.field_41758.field_31199,
               var8.field_7336 * -4.0,
               1.5,
               var8.field_7334 * -4.0
            );
      }
   }

   public boolean method_37261(class_2307<class_2340> var1) {
      return this.field_41720 == var1;
   }

   public boolean method_37370() {
      return !this.field_41716 && this.field_41694.getDouble(class_6503.field_33095) > 0.0;
   }

   public void method_37092(float var1, class_1343 var2) {
      class_1343 var5 = method_37169(var2, var1, this.field_41701);
      this.method_37215(this.method_37098().method_6215(var5));
   }

   private static class_1343 method_37169(class_1343 var0, float var1, float var2) {
      double var5 = var0.method_6221();
      if (!(var5 < 1.0E-7)) {
         class_1343 var7 = (!(var5 > 1.0) ? var0 : var0.method_6213()).method_6209((double)var1);
         float var8 = class_9299.method_42818(var2 * (float) (Math.PI / 180.0));
         float var9 = class_9299.method_42840(var2 * (float) (Math.PI / 180.0));
         return new class_1343(
            var7.field_7336 * (double)var9 - var7.field_7334 * (double)var8, var7.field_7333, var7.field_7334 * (double)var9 + var7.field_7336 * (double)var8
         );
      } else {
         return class_1343.field_7335;
      }
   }

   public float method_37193() {
      class_2921 var3 = new class_2921(this.method_37302(), 0.0, this.method_37156());
      if (!this.field_41768.method_22559(var3)) {
         return 0.0F;
      } else {
         var3.method_12184(class_9299.method_42847(this.method_37388()));
         return this.field_41768.method_22566(var3);
      }
   }

   public void method_37120(World var1) {
      this.field_41768 = var1;
   }

   public void method_37249(double var1, double var3, double var5, float var7, float var8) {
      this.method_37165(var1, var3, var5);
      this.field_41701 = var7 % 360.0F;
      this.field_41755 = class_9299.method_42828(var8, -90.0F, 90.0F) % 360.0F;
      this.field_41711 = this.field_41701;
      this.field_41762 = this.field_41755;
   }

   public void method_37165(double var1, double var3, double var5) {
      double var9 = class_9299.method_42827(var1, -3.0E7, 3.0E7);
      double var11 = class_9299.method_42827(var5, -3.0E7, 3.0E7);
      this.field_41767 = var9;
      this.field_41698 = var3;
      this.field_41725 = var11;
      this.method_37256(var9, var3, var11);
   }

   public void method_37196(class_1343 var1) {
      this.method_37195(var1.field_7336, var1.field_7333, var1.field_7334);
   }

   public void method_37195(double var1, double var3, double var5) {
      this.method_37144(var1, var3, var5, this.field_41701, this.field_41755);
   }

   public void method_37253(class_1331 var1, float var2, float var3) {
      this.method_37144((double)var1.method_12173() + 0.5, (double)var1.method_12165(), (double)var1.method_12185() + 0.5, var2, var3);
   }

   public void method_37144(double var1, double var3, double var5, float var7, float var8) {
      this.method_37306(var1, var3, var5);
      this.field_41701 = var7;
      this.field_41755 = var8;
      this.method_37351();
   }

   public void method_37306(double var1, double var3, double var5) {
      this.method_37222(var1, var3, var5);
      this.field_41767 = var1;
      this.field_41698 = var3;
      this.field_41725 = var5;
      this.field_41754 = var1;
      this.field_41713 = var3;
      this.field_41724 = var5;
   }

   public float method_37175(Entity var1) {
      float var4 = (float)(this.method_37302() - var1.method_37302());
      float var5 = (float)(this.method_37309() - var1.method_37309());
      float var6 = (float)(this.method_37156() - var1.method_37156());
      return class_9299.method_42843(var4 * var4 + var5 * var5 + var6 * var6);
   }

   public double method_37273(double var1, double var3, double var5) {
      double var9 = this.method_37302() - var1;
      double var11 = this.method_37309() - var3;
      double var13 = this.method_37156() - var5;
      return var9 * var9 + var11 * var11 + var13 * var13;
   }

   public double method_37275(Entity var1) {
      return this.method_37274(var1.method_37245());
   }

   public double method_37274(class_1343 var1) {
      double var4 = this.method_37302() - var1.field_7336;
      double var6 = this.method_37309() - var1.field_7333;
      double var8 = this.method_37156() - var1.field_7334;
      return var4 * var4 + var6 * var6 + var8 * var8;
   }

   public void method_37347(class_704 var1) {
   }

   public void method_37183(Entity var1) {
      if (!this.method_37308(var1) && !var1.field_41731 && !this.field_41731) {
         double var4 = var1.method_37302() - this.method_37302();
         double var6 = var1.method_37156() - this.method_37156();
         double var8 = class_9299.method_42812(var4, var6);
         if (var8 >= 0.01F) {
            var8 = (double)class_9299.method_42842(var8);
            var4 /= var8;
            var6 /= var8;
            double var10 = 1.0 / var8;
            if (var10 > 1.0) {
               var10 = 1.0;
            }

            var4 *= var10;
            var6 *= var10;
            var4 *= 0.05F;
            var6 *= 0.05F;
            var4 *= (double)(1.0F - this.field_41721);
            var6 *= (double)(1.0F - this.field_41721);
            if (!this.method_37151()) {
               this.method_37186(-var4, 0.0, -var6);
            }

            if (!var1.method_37151()) {
               var1.method_37186(var4, 0.0, var6);
            }
         }
      }
   }

   public void method_37186(double var1, double var3, double var5) {
      this.method_37215(this.method_37098().method_6214(var1, var3, var5));
      this.field_41763 = true;
   }

   public void method_37138() {
      this.field_41743 = true;
   }

   public boolean method_37181(class_6199 var1, float var2) {
      if (!this.method_37180(var1)) {
         this.method_37138();
         return false;
      } else {
         return false;
      }
   }

   public final class_1343 method_37307(float var1) {
      return this.method_37076(this.method_37184(var1), this.method_37291(var1));
   }

   public float method_37184(float var1) {
      return var1 != 1.0F ? class_9299.method_42795(var1, this.field_41762, this.field_41755) : this.field_41755;
   }

   public float method_37291(float var1) {
      return var1 != 1.0F ? class_9299.method_42795(var1, this.field_41711, this.field_41701) : this.field_41701;
   }

   public final class_1343 method_37076(float var1, float var2) {
      float var5 = var1 * (float) (Math.PI / 180.0);
      float var6 = -var2 * (float) (Math.PI / 180.0);
      float var7 = class_9299.method_42840(var6);
      float var8 = class_9299.method_42818(var6);
      float var9 = class_9299.method_42840(var5);
      float var10 = class_9299.method_42818(var5);
      return new class_1343((double)(var8 * var9), (double)(-var10), (double)(var7 * var9));
   }

   public final class_1343 method_37371(float var1) {
      return this.method_37104(this.method_37184(var1), this.method_37291(var1));
   }

   public final class_1343 method_37104(float var1, float var2) {
      return this.method_37076(var1 - 90.0F, var2);
   }

   public final class_1343 method_37335(float var1) {
      if (var1 != 1.0F) {
         double var4 = class_9299.method_42794((double)var1, this.field_41767, this.method_37302());
         double var6 = class_9299.method_42794((double)var1, this.field_41698, this.method_37309()) + (double)this.method_37277();
         double var8 = class_9299.method_42794((double)var1, this.field_41725, this.method_37156());
         return new class_1343(var4, var6, var8);
      } else {
         return new class_1343(this.method_37302(), this.method_37388(), this.method_37156());
      }
   }

   public class_1343 method_37339(float var1) {
      return this.method_37335(var1);
   }

   public final class_1343 method_37280(float var1) {
      double var4 = class_9299.method_42794((double)var1, this.field_41767, this.method_37302());
      double var6 = class_9299.method_42794((double)var1, this.field_41698, this.method_37309());
      double var8 = class_9299.method_42794((double)var1, this.field_41725, this.method_37156());
      return new class_1343(var4, var6, var8);
   }

   public class_7474 method_37201(double var1, float var3, boolean var4) {
      class_1343 var7 = this.method_37335(var3);
      class_1343 var8 = this.method_37307(var3);
      class_1343 var9 = var7.method_6214(var8.field_7336 * var1, var8.field_7333 * var1, var8.field_7334 * var1);
      return this.field_41768.method_28265(new class_972(var7, var9, class_3132.field_15549, !var4 ? class_9583.field_48747 : class_9583.field_48752, this));
   }

   public boolean method_37167() {
      return false;
   }

   public boolean method_37177() {
      return false;
   }

   public void method_37392(Entity var1, int var2, class_6199 var3) {
      if (var1 instanceof class_9359) {
         class_8807.field_45060.method_11578((class_9359)var1, this, var3);
      }
   }

   public boolean method_37185(double var1, double var3, double var5) {
      double var9 = this.method_37302() - var1;
      double var11 = this.method_37309() - var3;
      double var13 = this.method_37156() - var5;
      double var15 = var9 * var9 + var11 * var11 + var13 * var13;
      return this.method_37176(var15);
   }

   public boolean method_37176(double var1) {
      double var5 = this.method_37241().method_18906();
      if (Double.isNaN(var5)) {
         var5 = 1.0;
      }

      var5 = var5 * 64.0 * field_41756;
      return var1 < var5 * var5;
   }

   public boolean method_37216(class_5734 var1) {
      String var4 = this.method_37271();
      if (!this.field_41751 && var4 != null) {
         var1.method_25941("id", var4);
         this.method_37258(var1);
         return true;
      } else {
         return false;
      }
   }

   public boolean method_37350(class_5734 var1) {
      return !this.method_37070() ? this.method_37216(var1) : false;
   }

   public class_5734 method_37258(class_5734 var1) {
      try {
         if (this.field_41739 != null) {
            var1.method_25946("Pos", this.method_37272(this.field_41739.method_37302(), this.method_37309(), this.field_41739.method_37156()));
         } else {
            var1.method_25946("Pos", this.method_37272(this.method_37302(), this.method_37309(), this.method_37156()));
         }

         class_1343 var4 = this.method_37098();
         var1.method_25946("Motion", this.method_37272(var4.field_7336, var4.field_7333, var4.field_7334));
         var1.method_25946("Rotation", this.method_37088(this.field_41701, this.field_41755));
         var1.method_25920("FallDistance", this.field_41706);
         var1.method_25958("Fire", (short)this.field_41728);
         var1.method_25958("Air", (short)this.method_37229());
         var1.method_25934("OnGround", this.field_41726);
         var1.method_25934("Invulnerable", this.field_41704);
         var1.method_25931("PortalCooldown", this.field_41771);
         var1.method_25964("UUID", this.method_37328());
         ITextComponent var11 = this.method_45508();
         if (var11 != null) {
            var1.method_25941("CustomName", ITextComponent$class_40.toJson(var11));
         }

         if (this.method_37135()) {
            var1.method_25934("CustomNameVisible", this.method_37135());
         }

         if (this.method_37378()) {
            var1.method_25934("Silent", this.method_37378());
         }

         if (this.method_37078()) {
            var1.method_25934("NoGravity", this.method_37078());
         }

         if (this.field_41760) {
            var1.method_25934("Glowing", this.field_41760);
         }

         if (!this.field_41757.isEmpty()) {
            class_3416 var12 = new class_3416();

            for (String var8 : this.field_41757) {
               var12.add(class_473.method_2261(var8));
            }

            var1.method_25946("Tags", var12);
         }

         this.method_37376(var1);
         if (this.method_37151()) {
            class_3416 var13 = new class_3416();

            for (Entity var15 : this.method_37114()) {
               class_5734 var9 = new class_5734();
               if (var15.method_37216(var9)) {
                  var13.add(var9);
               }
            }

            if (!var13.isEmpty()) {
               var1.method_25946("Passengers", var13);
            }
         }

         return var1;
      } catch (Throwable var10) {
         class_159 var5 = class_159.method_643(var10, "Saving entity NBT");
         class_6544 var6 = var5.method_639("Entity being saved");
         this.method_37331(var6);
         throw new class_3297(var5);
      }
   }

   public void method_37393(class_5734 var1) {
      try {
         class_3416 var4 = var1.method_25927("Pos", 6);
         class_3416 var18 = var1.method_25927("Motion", 6);
         class_3416 var19 = var1.method_25927("Rotation", 5);
         double var7 = var18.method_15763(0);
         double var9 = var18.method_15763(1);
         double var11 = var18.method_15763(2);
         this.method_37214(Math.abs(var7) > 10.0 ? 0.0 : var7, Math.abs(var9) > 10.0 ? 0.0 : var9, Math.abs(var11) > 10.0 ? 0.0 : var11);
         this.method_37306(var4.method_15763(0), var4.method_15763(1), var4.method_15763(2));
         this.field_41701 = var19.method_15769(0);
         this.field_41755 = var19.method_15769(1);
         this.field_41711 = this.field_41701;
         this.field_41762 = this.field_41755;
         this.method_37161(this.field_41701);
         this.method_37090(this.field_41701);
         this.field_41706 = var1.method_25955("FallDistance");
         this.field_41728 = var1.method_25956("Fire");
         this.method_37192(var1.method_25956("Air"));
         this.field_41726 = var1.method_25933("OnGround");
         this.field_41704 = var1.method_25933("Invulnerable");
         this.field_41771 = var1.method_25947("PortalCooldown");
         if (var1.method_25954("UUID")) {
            this.field_41738 = var1.method_25926("UUID");
            this.field_41730 = this.field_41738.toString();
         }

         if (!Double.isFinite(this.method_37302()) || !Double.isFinite(this.method_37309()) || !Double.isFinite(this.method_37156())) {
            throw new IllegalStateException("Entity has invalid position");
         } else if (Double.isFinite((double)this.field_41701) && Double.isFinite((double)this.field_41755)) {
            this.method_37351();
            this.method_37395(this.field_41701, this.field_41755);
            if (var1.method_25939("CustomName", 8)) {
               String var13 = var1.method_25965("CustomName");

               try {
                  this.method_37303(ITextComponent$class_40.func_240643_a_(var13));
               } catch (Exception var16) {
                  field_41741.warn("Failed to parse entity custom name {}", var13, var16);
               }
            }

            this.method_37319(var1.method_25933("CustomNameVisible"));
            this.method_37338(var1.method_25933("Silent"));
            this.method_37182(var1.method_25933("NoGravity"));
            this.method_37200(var1.method_25933("Glowing"));
            if (var1.method_25939("Tags", 9)) {
               this.field_41757.clear();
               class_3416 var20 = var1.method_25927("Tags", 8);
               int var14 = Math.min(var20.size(), 1024);

               for (int var15 = 0; var15 < var14; var15++) {
                  this.field_41757.add(var20.method_15770(var15));
               }
            }

            this.method_37314(var1);
            if (this.method_37118()) {
               this.method_37351();
            }
         } else {
            throw new IllegalStateException("Entity has invalid rotation");
         }
      } catch (Throwable var17) {
         class_159 var5 = class_159.method_643(var17, "Loading entity NBT");
         class_6544 var6 = var5.method_639("Entity being loaded");
         this.method_37331(var6);
         throw new class_3297(var5);
      }
   }

   public boolean method_37118() {
      return true;
   }

   @Nullable
   public final String method_37271() {
      class_6629 var3 = this.method_37387();
      Identifier var4 = class_6629.method_30472(var3);
      return var3.method_30471() && var4 != null ? var4.toString() : null;
   }

   public abstract void method_37314(class_5734 var1);

   public abstract void method_37376(class_5734 var1);

   public class_3416 method_37272(double... var1) {
      class_3416 var4 = new class_3416();

      for (double var8 : var1) {
         var4.add(class_9708.method_44846(var8));
      }

      return var4;
   }

   public class_3416 method_37088(float... var1) {
      class_3416 var4 = new class_3416();

      for (float var8 : var1) {
         var4.add(class_5718.method_25854(var8));
      }

      return var4;
   }

   @Nullable
   public class_91 method_37312(class_8525 var1) {
      return this.method_37313(var1, 0);
   }

   @Nullable
   public class_91 method_37313(class_8525 var1, int var2) {
      return this.method_37311(new ItemStack(var1), (float)var2);
   }

   @Nullable
   public class_91 method_37310(ItemStack var1) {
      return this.method_37311(var1, 0.0F);
   }

   @Nullable
   public class_91 method_37311(ItemStack var1, float var2) {
      if (!var1.method_28022()) {
         if (!this.field_41768.field_33055) {
            class_91 var5 = new class_91(this.field_41768, this.method_37302(), this.method_37309() + (double)var2, this.method_37156(), var1);
            var5.method_257();
            this.field_41768.method_7509(var5);
            return var5;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   public boolean method_37330() {
      return !this.field_41751;
   }

   public boolean method_37153() {
      if (!this.field_41731) {
         float var3 = 0.1F;
         float var4 = this.field_41758.field_31199 * 0.8F;
         class_4092 var5 = class_4092.method_18913((double)var4, 0.1F, (double)var4)
            .method_18918(this.method_37302(), this.method_37388(), this.method_37156());
         return this.field_41768.method_6674(this, var5, (var1, var2) -> var1.method_8313(this.field_41768, var2)).findAny().isPresent();
      } else {
         return false;
      }
   }

   public class_6910 method_37128(class_704 var1, class_2584 var2) {
      return class_6910.field_35521;
   }

   public boolean method_37325(Entity var1) {
      return var1.method_37173() && !this.method_37308(var1);
   }

   public boolean method_37173() {
      return false;
   }

   public void method_37189() {
      this.method_37215(class_1343.field_7335);
      this.method_37123();
      if (this.method_37070()) {
         this.method_37243().method_37340(this);
      }
   }

   public void method_37340(Entity var1) {
      this.method_37125(var1, Entity::method_37256);
   }

   private void method_37125(Entity var1, class_8015 var2) {
      if (this.method_37072(var1)) {
         double var5 = this.method_37309() + this.method_37149() + var1.method_37106();
         var2.method_36384(var1, this.method_37302(), var5, this.method_37156());
      }
   }

   public void method_37224(Entity var1) {
   }

   public double method_37106() {
      return 0.0;
   }

   public double method_37149() {
      return (double)this.field_41758.field_31200 * 0.75;
   }

   public boolean method_37353(Entity var1) {
      return this.method_37354(var1, false);
   }

   public boolean method_37359() {
      return this instanceof class_5834;
   }

   public boolean method_37354(Entity var1, boolean var2) {
      for (Entity var5 = var1; var5.field_41739 != null; var5 = var5.field_41739) {
         if (var5.field_41739 == this) {
            return false;
         }
      }

      if (var2 || this.method_37158(var1) && var1.method_37286(this)) {
         if (this.method_37070()) {
            this.method_37390();
         }

         this.method_37356(class_7653.field_38885);
         this.field_41739 = var1;
         this.field_41739.method_37211(this);
         return true;
      } else {
         return false;
      }
   }

   public boolean method_37158(Entity var1) {
      return !this.method_37252() && this.field_41773 <= 0;
   }

   public boolean method_37115(class_7653 var1) {
      return this.field_41768.method_6683(this, this.method_37242(var1).method_18924(1.0E-7));
   }

   public void method_37305() {
      for (int var3 = this.field_41707.size() - 1; var3 >= 0; var3--) {
         this.field_41707.get(var3).method_37390();
      }
   }

   public void method_37389() {
      if (this.field_41739 != null) {
         Entity var3 = this.field_41739;
         this.field_41739 = null;
         var3.method_37198(this);
      }
   }

   public void method_37390() {
      this.method_37389();
   }

   public void method_37211(Entity var1) {
      if (var1.method_37243() != this) {
         throw new IllegalStateException("Use x.startRiding(y), not y.addPassenger(x)");
      } else {
         if (!this.field_41768.field_33055 && var1 instanceof class_704 && !(this.method_37259() instanceof class_704)) {
            this.field_41707.add(0, var1);
         } else {
            this.field_41707.add(var1);
         }
      }
   }

   public void method_37198(Entity var1) {
      if (var1.method_37243() != this) {
         this.field_41707.remove(var1);
         var1.field_41773 = 60;
      } else {
         throw new IllegalStateException("Use x.stopRiding(y), not y.removePassenger(x)");
      }
   }

   public boolean method_37286(Entity var1) {
      return this.method_37114().size() < 1;
   }

   public void method_37318(double var1, double var3, double var5, float var7, float var8, int var9, boolean var10) {
      this.method_37256(var1, var3, var5);
      this.method_37395(var7, var8);
   }

   public void method_37257(float var1, int var2) {
      this.method_37161(var1);
   }

   public float method_37355() {
      return 0.0F;
   }

   public class_1343 method_37246() {
      return this.method_37076(this.field_41755, this.field_41701);
   }

   public class_4895 method_37366() {
      return new class_4895(this.field_41755, this.field_41701);
   }

   public class_1343 method_37129() {
      return class_1343.method_6199(this.method_37366());
   }

   public void method_37213(class_1331 var1) {
      if (!this.method_37121()) {
         if (!this.field_41768.field_33055 && !var1.equals(this.field_41764)) {
            this.field_41764 = var1.method_6072();
         }

         this.field_41772 = true;
      } else {
         this.method_37157();
      }
   }

   public void method_37237() {
      if (this.field_41768 instanceof class_6331) {
         int var3 = this.method_37244();
         class_6331 var4 = (class_6331)this.field_41768;
         if (!this.field_41772) {
            if (this.field_41709 > 0) {
               this.field_41709 -= 4;
            }

            if (this.field_41709 < 0) {
               this.field_41709 = 0;
            }
         } else {
            class_341 var5 = var4.method_29522();
            class_5621 var6 = this.field_41768.method_29545() != World.field_33029 ? World.field_33029 : World.field_33048;
            class_6331 var7 = var5.method_1697(var6);
            if (var7 != null && var5.method_1741() && !this.method_37070() && this.field_41709++ >= var3) {
               this.field_41768.method_29599().method_16056("portal");
               this.field_41709 = var3;
               this.method_37157();
               this.method_37326(var7);
               this.field_41768.method_29599().method_16054();
            }

            this.field_41772 = false;
         }

         this.method_37263();
      }
   }

   public int method_37300() {
      return 300;
   }

   public void method_37162(double var1, double var3, double var5) {
      this.method_37214(var1, var3, var5);
   }

   public void method_37336(byte var1) {
      switch (var1) {
         case 53:
            class_5864.method_26720(this);
      }
   }

   public void method_37082() {
   }

   public Iterable<ItemStack> method_37294() {
      return field_41696;
   }

   public Iterable<ItemStack> method_37262() {
      return field_41696;
   }

   public Iterable<ItemStack> method_37342() {
      return Iterables.concat(this.method_37294(), this.method_37262());
   }

   public void method_37349(class_6943 var1, ItemStack var2) {
   }

   public boolean method_37264() {
      boolean var3 = this.field_41768 != null && this.field_41768.field_33055;
      return !this.method_37087() && (this.field_41728 > 0 || var3 && this.method_37385(0));
   }

   public boolean method_37070() {
      return this.method_37243() != null;
   }

   public boolean method_37151() {
      return !this.method_37114().isEmpty();
   }

   public boolean method_37168() {
      return true;
   }

   public void method_37234(boolean var1) {
      this.method_37220(1, var1);
   }

   public boolean method_37252() {
      return this.method_37385(1);
   }

   public boolean method_37117() {
      return this.method_37252();
   }

   public boolean method_37154() {
      return this.method_37252();
   }

   public boolean method_37073() {
      return this.method_37252();
   }

   public boolean method_37283() {
      return this.method_37252();
   }

   public boolean method_37382() {
      return this.method_37102() == class_7653.field_38881;
   }

   public boolean method_37321() {
      return this.method_37385(3);
   }

   public void method_37140(boolean var1) {
      this.method_37220(3, var1);
   }

   public boolean method_37113() {
      return this.method_37385(4);
   }

   public boolean method_37297() {
      return this.method_37102() == class_7653.field_38888;
   }

   public boolean method_37290() {
      return this.method_37297() && !this.method_37285();
   }

   public void method_37260(boolean var1) {
      this.method_37220(4, var1);
   }

   public boolean method_37116() {
      return this.field_41760 || this.field_41768.field_33055 && this.method_37385(6);
   }

   public void method_37200(boolean var1) {
      this.field_41760 = var1;
      if (!this.field_41768.field_33055) {
         this.method_37220(6, this.field_41760);
      }
   }

   public boolean method_37109() {
      return this.method_37385(5);
   }

   public boolean method_37077(class_704 var1) {
      if (var1.method_37221()) {
         return false;
      } else {
         class_5086 var4 = this.method_37095();
         return var4 != null && var1 != null && var1.method_37095() == var4 && var4.method_23377() ? false : this.method_37109();
      }
   }

   @Nullable
   public class_5086 method_37095() {
      return this.field_41768.method_29562().method_4848(this.method_37206());
   }

   public boolean method_37344(Entity var1) {
      return this.method_37137(var1.method_37095());
   }

   public boolean method_37137(class_5086 var1) {
      return this.method_37095() == null ? false : this.method_37095().method_23384(var1);
   }

   public void method_37333(boolean var1) {
      this.method_37220(5, var1);
   }

   public boolean method_37385(int var1) {
      return (this.field_41735.<Byte>method_36640(field_41770) & 1 << var1) != 0;
   }

   public void method_37220(int var1, boolean var2) {
      byte var5 = this.field_41735.<Byte>method_36640(field_41770);
      if (!var2) {
         this.field_41735.method_36633(field_41770, (byte)(var5 & ~(1 << var1)));
      } else {
         this.field_41735.method_36633(field_41770, (byte)(var5 | 1 << var1));
      }
   }

   public int method_37099() {
      return 300;
   }

   public int method_37229() {
      return this.field_41735.<Integer>method_36640(field_41746);
   }

   public void method_37192(int var1) {
      this.field_41735.method_36633(field_41746, var1);
   }

   public void method_37384(class_6331 var1, class_900 var2) {
      this.method_37164(this.field_41728 + 1);
      if (this.field_41728 == 0) {
         this.method_37178(8);
      }

      this.method_37181(class_6199.field_31674, 5.0F);
   }

   public void method_37334(boolean var1) {
      class_1343 var4 = this.method_37098();
      double var5;
      if (!var1) {
         var5 = Math.min(1.8, var4.field_7333 + 0.1);
      } else {
         var5 = Math.max(-0.9, var4.field_7333 - 0.03);
      }

      this.method_37214(var4.field_7336, var5, var4.field_7334);
   }

   public void method_37188(boolean var1) {
      class_1343 var4 = this.method_37098();
      double var5;
      if (!var1) {
         var5 = Math.min(0.7, var4.field_7333 + 0.06);
      } else {
         var5 = Math.max(-0.3, var4.field_7333 - 0.03);
      }

      this.method_37214(var4.field_7336, var5, var4.field_7334);
      this.field_41706 = 0.0F;
   }

   public void method_37231(class_6331 var1, class_5834 var2) {
   }

   public void method_37160(double var1, double var3, double var5) {
      class_1331 var9 = new class_1331(var1, var3, var5);
      class_1343 var10 = new class_1343(var1 - (double)var9.method_12173(), var3 - (double)var9.method_12165(), var5 - (double)var9.method_12185());
      class_2921 var11 = new class_2921();
      Direction var12 = Direction.field_817;
      double var13 = Double.MAX_VALUE;

      for (Direction var18 : new Direction[]{Direction.field_818, Direction.field_800, Direction.field_809, Direction.field_804, Direction.field_817}) {
         var11.method_13371(var9, var18);
         if (!this.field_41768.method_28262(var11).method_8306(this.field_41768, var11)) {
            double var19 = var10.method_6197(var18.method_1029());
            double var21 = var18.method_1049() != class_137.field_405 ? var19 : 1.0 - var19;
            if (var21 < var13) {
               var13 = var21;
               var12 = var18;
            }
         }
      }

      float var23 = this.field_41717.nextFloat() * 0.2F + 0.1F;
      float var24 = (float)var12.method_1049().method_549();
      class_1343 var25 = this.method_37098().method_6209(0.75);
      if (var12.method_1029() != class_9249.field_47215) {
         if (var12.method_1029() != class_9249.field_47216) {
            if (var12.method_1029() == class_9249.field_47219) {
               this.method_37214(var25.field_7336, var25.field_7333, (double)(var24 * var23));
            }
         } else {
            this.method_37214(var25.field_7336, (double)(var24 * var23), var25.field_7334);
         }
      } else {
         this.method_37214((double)(var24 * var23), var25.field_7333, var25.field_7334);
      }
   }

   public void method_37130(class_2522 var1, class_1343 var2) {
      this.field_41706 = 0.0F;
      this.field_41729 = var2;
   }

   private static ITextComponent method_37139(ITextComponent var0) {
      IFormattableTextComponent var3 = var0.copyRaw().setStyle(var0.getStyle().setClickEvent((ClickEvent)null));

      for (ITextComponent var5 : var0.getSiblings()) {
         var3.append(method_37139(var5));
      }

      return var3;
   }

   @Override
   public ITextComponent method_45509() {
      ITextComponent var3 = this.method_45508();
      return var3 == null ? this.method_37391() : method_37139(var3);
   }

   public ITextComponent method_37391() {
      return this.field_41719.method_30464();
   }

   public boolean method_37171(Entity var1) {
      return this == var1;
   }

   public float method_37267() {
      return 0.0F;
   }

   public void method_37161(float var1) {
   }

   public void method_37090(float var1) {
   }

   public boolean method_37394() {
      return true;
   }

   public boolean method_37296(Entity var1) {
      return false;
   }

   @Override
   public String toString() {
      return String.format(
         Locale.ROOT,
         "%s['%s'/%d, l='%s', x=%.2f, y=%.2f, z=%.2f]",
         this.getClass().getSimpleName(),
         this.method_45509().getString(),
         this.field_41740,
         this.field_41768 != null ? this.field_41768.toString() : "~NULL~",
         this.method_37302(),
         this.method_37309(),
         this.method_37156()
      );
   }

   public boolean method_37180(class_6199 var1) {
      return this.field_41704 && var1 != class_6199.field_31685 && !var1.method_28349();
   }

   public boolean method_37367() {
      return this.field_41704;
   }

   public void method_37289(boolean var1) {
      this.field_41704 = var1;
   }

   public void method_37299(Entity var1) {
      this.method_37144(var1.method_37302(), var1.method_37309(), var1.method_37156(), var1.field_41701, var1.field_41755);
   }

   public void method_37199(Entity var1) {
      class_5734 var4 = var1.method_37258(new class_5734());
      var4.method_25959("Dimension");
      this.method_37393(var4);
      this.field_41771 = var1.field_41771;
      this.field_41764 = var1.field_41764;
   }

   @Nullable
   public Entity method_37326(class_6331 var1) {
      if (this.field_41768 instanceof class_6331 && !this.field_41751) {
         this.field_41768.method_29599().method_16056("changeDimension");
         this.method_37269();
         this.field_41768.method_29599().method_16056("reposition");
         class_9606 var4 = this.method_37081(var1);
         if (var4 != null) {
            this.field_41768.method_29599().method_16050("reloading");
            Entity var5 = this.method_37387().method_30484(var1);
            if (var5 != null) {
               var5.method_37199(this);
               var5.method_37144(var4.field_48952.field_7336, var4.field_48952.field_7333, var4.field_48952.field_7334, var4.field_48956, var5.field_41755);
               var5.method_37215(var4.field_48955);
               var1.method_28954(var5);
               if (var1.method_29545() == World.field_33038) {
                  class_6331.method_28936(var1);
               }
            }

            this.method_37247();
            this.field_41768.method_29599().method_16054();
            ((class_6331)this.field_41768).method_28932();
            var1.method_28932();
            this.field_41768.method_29599().method_16054();
            return var5;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   public void method_37247() {
      this.field_41751 = true;
   }

   @Nullable
   public class_9606 method_37081(class_6331 var1) {
      boolean var4 = this.field_41768.method_29545() == World.field_33038 && var1.method_29545() == World.field_33048;
      boolean var5 = var1.method_29545() == World.field_33038;
      if (!var4 && !var5) {
         boolean var19 = var1.method_29545() == World.field_33029;
         if (this.field_41768.method_29545() != World.field_33029 && !var19) {
            return null;
         } else {
            class_2098 var7 = var1.method_6673();
            double var8 = Math.max(-2.9999872E7, var7.method_9821() + 16.0);
            double var10 = Math.max(-2.9999872E7, var7.method_9825() + 16.0);
            double var12 = Math.min(2.9999872E7, var7.method_9828() - 16.0);
            double var14 = Math.min(2.9999872E7, var7.method_9816() - 16.0);
            double var16 = class_8760.method_40232(this.field_41768.method_22572(), var1.method_22572());
            class_1331 var18 = new class_1331(
               class_9299.method_42827(this.method_37302() * var16, var8, var12),
               this.method_37309(),
               class_9299.method_42827(this.method_37156() * var16, var10, var14)
            );
            return this.method_37111(var1, var18, var19)
               .<class_9606>map(
                  var2 -> {
                     class_2522 var5x = this.field_41768.method_28262(this.field_41764);
                     class_9249 var6x;
                     class_1343 var7x;
                     if (!var5x.method_10307(class_6023.field_30670)) {
                        var6x = class_9249.field_47215;
                        var7x = new class_1343(0.5, 0.0, 0.0);
                     } else {
                        var6x = var5x.<class_9249>method_10313(class_6023.field_30670);
                        class_8623 var8x = class_1535.method_6972(
                           this.field_41764, var6x, 21, class_9249.field_47216, 21, var2x -> this.field_41768.method_28262(var2x) == var5x
                        );
                        var7x = this.method_37375(var6x, var8x);
                     }

                     return class_2018.method_9379(
                        var1, var2, var6x, var7x, this.method_37190(this.method_37102()), this.method_37098(), this.field_41701, this.field_41755
                     );
                  }
               )
               .orElse((class_9606)null);
         }
      } else {
         class_1331 var6;
         if (!var5) {
            var6 = var1.method_22563(class_3801.field_18590, var1.method_28998());
         } else {
            var6 = class_6331.field_32327;
         }

         return new class_9606(
            new class_1343((double)var6.method_12173() + 0.5, (double)var6.method_12165(), (double)var6.method_12185() + 0.5),
            this.method_37098(),
            this.field_41701,
            this.field_41755
         );
      }
   }

   public class_1343 method_37375(class_9249 var1, class_8623 var2) {
      return class_2018.method_9370(var2, var1, this.method_37245(), this.method_37190(this.method_37102()));
   }

   public Optional<class_8623> method_37111(class_6331 var1, class_1331 var2, boolean var3) {
      return var1.method_28996().method_241(var2, var3);
   }

   public boolean method_37148() {
      return true;
   }

   public float method_37083(class_2730 var1, class_6163 var2, class_1331 var3, class_2522 var4, class_4774 var5, float var6) {
      return var6;
   }

   public boolean method_37348(class_2730 var1, class_6163 var2, class_1331 var3, class_2522 var4, float var5) {
      return true;
   }

   public int method_37232() {
      return 3;
   }

   public boolean method_37276() {
      return false;
   }

   public void method_37331(class_6544 var1) {
      var1.method_29851("Entity Type", () -> class_6629.method_30472(this.method_37387()) + " (" + this.getClass().getCanonicalName() + ")");
      var1.method_29850("Entity ID", this.field_41740);
      var1.method_29851("Entity Name", () -> this.method_45509().getString());
      var1.method_29850(
         "Entity's Exact location", String.format(Locale.ROOT, "%.2f, %.2f, %.2f", this.method_37302(), this.method_37309(), this.method_37156())
      );
      var1.method_29850(
         "Entity's Block location",
         class_6544.method_29845(
            class_9299.method_42847(this.method_37302()), class_9299.method_42847(this.method_37309()), class_9299.method_42847(this.method_37156())
         )
      );
      class_1343 var4 = this.method_37098();
      var1.method_29850("Entity's Momentum", String.format(Locale.ROOT, "%.2f, %.2f, %.2f", var4.field_7336, var4.field_7333, var4.field_7334));
      var1.method_29851("Entity's Passengers", () -> this.method_37114().toString());
      var1.method_29851("Entity's Vehicle", () -> this.method_37243().toString());
   }

   public boolean method_37174() {
      return this.method_37264() && !this.method_37221();
   }

   public void method_37377(UUID var1) {
      this.field_41738 = var1;
      this.field_41730 = this.field_41738.toString();
   }

   public UUID method_37328() {
      return this.field_41738;
   }

   public String method_37225() {
      return this.field_41730;
   }

   public String method_37206() {
      return this.field_41730;
   }

   public boolean method_37107() {
      return true;
   }

   public static double method_37345() {
      return field_41756;
   }

   public static void method_37327(double var0) {
      field_41756 = var0;
   }

   @Override
   public ITextComponent method_19839() {
      return class_3903.method_18063(this.method_37095(), this.method_45509())
         .modifyStyle(var1 -> var1.setHoverEvent(this.method_37248()).setInsertion(this.method_37225()));
   }

   public void method_37303(ITextComponent var1) {
      this.field_41735.method_36633(field_41708, Optional.<ITextComponent>ofNullable(var1));
   }

   @Nullable
   @Override
   public ITextComponent method_45508() {
      return this.field_41735.<Optional<ITextComponent>>method_36640(field_41708).orElse((ITextComponent)null);
   }

   @Override
   public boolean method_45507() {
      return this.field_41735.<Optional<ITextComponent>>method_36640(field_41708).isPresent();
   }

   public void method_37319(boolean var1) {
      this.field_41735.method_36633(field_41699, var1);
   }

   public boolean method_37135() {
      return this.field_41735.<Boolean>method_36640(field_41699);
   }

   public final void method_37079(double var1, double var3, double var5) {
      if (this.field_41768 instanceof class_6331) {
         class_2034 var9 = new class_2034(new class_1331(var1, var3, var5));
         ((class_6331)this.field_41768).method_28945().method_10177(class_5032.field_26020, var9, 0, this.method_37145());
         this.field_41768.method_29554(var9.field_10328, var9.field_10327);
         this.method_37254(var1, var3, var5);
      }
   }

   public void method_37254(double var1, double var3, double var5) {
      if (this.field_41768 instanceof class_6331) {
         class_6331 var9 = (class_6331)this.field_41768;
         this.method_37144(var1, var3, var5, this.field_41701, this.field_41755);
         this.method_37122().forEach(var1x -> {
            var9.method_28987(var1x);
            var1x.field_41752 = true;

            for (Entity var5x : var1x.field_41707) {
               var1x.method_37125(var5x, Entity::method_37195);
            }
         });
      }
   }

   public boolean method_37141() {
      return this.method_37135();
   }

   public void method_37191(class_7821<?> var1) {
      if (field_41734.equals(var1)) {
         this.method_37187();
      }
   }

   public void method_37187() {
      class_6097 var3 = this.field_41758;
      class_7653 var4 = this.method_37102();
      class_6097 var5 = this.method_37190(var4);
      this.field_41758 = var5;
      this.field_41710 = this.method_37279(var4, var5);
      if (!(var5.field_31199 < var3.field_31199)) {
         class_4092 var6 = this.method_37241();
         this.method_37094(
            new class_4092(
               var6.field_19941,
               var6.field_19937,
               var6.field_19938,
               var6.field_19941 + (double)var5.field_31199,
               var6.field_19937 + (double)var5.field_31200,
               var6.field_19938 + (double)var5.field_31199
            )
         );
         if (var5.field_31199 > var3.field_31199 && !this.field_41716 && !this.field_41768.field_33055) {
            float var9 = var3.field_31199 - var5.field_31199;
            this.method_37226(class_7412.field_37839, new class_1343((double)var9, 0.0, (double)var9));
         }
      } else {
         double var7 = (double)var5.field_31199 / 2.0;
         this.method_37094(
            new class_4092(
               this.method_37302() - var7,
               this.method_37309(),
               this.method_37156() - var7,
               this.method_37302() + var7,
               this.method_37309() + (double)var5.field_31200,
               this.method_37156() + var7
            )
         );
      }
   }

   public Direction method_37365() {
      return Direction.method_1036((double)this.field_41701);
   }

   public Direction method_37235() {
      return this.method_37365();
   }

   public HoverEvent method_37248() {
      return new HoverEvent(HoverEvent$class_48.SHOW_ENTITY, new HoverEvent$class_49(this.method_37387(), this.method_37328(), this.method_45509()));
   }

   public boolean method_37209(class_9359 var1) {
      return true;
   }

   public class_4092 method_37241() {
      return this.field_41712;
   }

   public class_4092 method_37210() {
      return this.method_37241();
   }

   public class_4092 method_37242(class_7653 var1) {
      class_6097 var4 = this.method_37190(var1);
      float var5 = var4.field_31199 / 2.0F;
      class_1343 var6 = new class_1343(this.method_37302() - (double)var5, this.method_37309(), this.method_37156() - (double)var5);
      class_1343 var7 = new class_1343(this.method_37302() + (double)var5, this.method_37309() + (double)var4.field_31200, this.method_37156() + (double)var5);
      return new class_4092(var6, var7);
   }

   public void method_37094(class_4092 var1) {
      this.field_41712 = var1;
   }

   public float method_37279(class_7653 var1, class_6097 var2) {
      return var2.field_31200 * 0.85F;
   }

   public float method_37278(class_7653 var1) {
      return this.method_37279(var1, this.method_37190(var1));
   }

   public final float method_37277() {
      return this.field_41710;
   }

   public class_1343 method_37323() {
      return new class_1343(0.0, (double)this.method_37277(), (double)(this.method_37086() * 0.4F));
   }

   public boolean method_37166(int var1, ItemStack var2) {
      return false;
   }

   @Override
   public void method_26286(ITextComponent var1, UUID var2) {
   }

   public World method_37084() {
      return this.field_41768;
   }

   @Nullable
   public class_341 method_37268() {
      return this.field_41768.method_29522();
   }

   public class_6910 method_37227(class_704 var1, class_1343 var2, class_2584 var3) {
      return class_6910.field_35521;
   }

   public boolean method_37085() {
      return false;
   }

   public void method_37096(class_5834 var1, Entity var2) {
      if (var2 instanceof class_5834) {
         class_2931.method_13429((class_5834)var2, var1);
      }

      class_2931.method_13406(var1, var2);
   }

   public void method_37093(class_9359 var1) {
   }

   public void method_37212(class_9359 var1) {
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public float method_37317(class_6631 var1) {
      float var4 = class_9299.method_42810(this.field_41701);
      switch (var1) {
         case field_34338:
            return var4 + 180.0F;
         case field_34335:
            return var4 + 270.0F;
         case field_34334:
            return var4 + 90.0F;
         default:
            return var4;
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public float method_37152(class_9022 var1) {
      float var4 = class_9299.method_42810(this.field_41701);
      switch (var1) {
         case field_46148:
            return -var4;
         case field_46144:
            return 180.0F - var4;
         default:
            return var4;
      }
   }

   public boolean method_37131() {
      return false;
   }

   public boolean method_37265() {
      boolean var3 = this.field_41752;
      this.field_41752 = false;
      return var3;
   }

   public boolean method_37251() {
      boolean var3 = this.field_41745;
      this.field_41745 = false;
      return var3;
   }

   @Nullable
   public Entity method_37259() {
      return null;
   }

   public List<Entity> method_37114() {
      return (List<Entity>)(!this.field_41707.isEmpty() ? Lists.newArrayList(this.field_41707) : Collections.<Entity>emptyList());
   }

   public boolean method_37072(Entity var1) {
      for (Entity var5 : this.method_37114()) {
         if (var5.equals(var1)) {
            return true;
         }
      }

      return false;
   }

   public boolean method_37071(Class<? extends Entity> var1) {
      for (Entity var5 : this.method_37114()) {
         if (var1.isAssignableFrom(var5.getClass())) {
            return true;
         }
      }

      return false;
   }

   public Collection<Entity> method_37379() {
      HashSet var3 = Sets.newHashSet();

      for (Entity var5 : this.method_37114()) {
         var3.add(var5);
         var5.method_37380(false, var3);
      }

      return var3;
   }

   public Stream<Entity> method_37122() {
      return Stream.<Entity>concat(Stream.of(this), this.field_41707.stream().flatMap(Entity::method_37122));
   }

   public boolean method_37172() {
      HashSet var3 = Sets.newHashSet();
      this.method_37380(true, var3);
      return var3.size() == 1;
   }

   private void method_37380(boolean var1, Set<Entity> var2) {
      for (Entity var6 : this.method_37114()) {
         if (!var1 || class_9359.class.isAssignableFrom(var6.getClass())) {
            var2.add(var6);
         }

         var6.method_37380(var1, var2);
      }
   }

   public Entity method_37240() {
      Entity var3 = this;

      while (var3.method_37070()) {
         var3 = var3.method_37243();
      }

      return var3;
   }

   public boolean method_37308(Entity var1) {
      return this.method_37240() == var1.method_37240();
   }

   public boolean method_37315(Entity var1) {
      for (Entity var5 : this.method_37114()) {
         if (var5.equals(var1)) {
            return true;
         }

         if (var5.method_37315(var1)) {
            return true;
         }
      }

      return false;
   }

   public boolean method_37069() {
      Entity var3 = this.method_37259();
      return !(var3 instanceof class_704) ? !this.field_41768.field_33055 : ((class_704)var3).method_3183();
   }

   public static class_1343 method_37373(double var0, double var2, float var4) {
      double var7 = (var0 + var2 + 1.0E-5F) / 2.0;
      float var9 = -class_9299.method_42818(var4 * (float) (Math.PI / 180.0));
      float var10 = class_9299.method_42840(var4 * (float) (Math.PI / 180.0));
      float var11 = Math.max(Math.abs(var9), Math.abs(var10));
      return new class_1343((double)var9 * var7 / (double)var11, 0.0, (double)var10 * var7 / (double)var11);
   }

   public class_1343 method_37282(class_5834 var1) {
      return new class_1343(this.method_37302(), this.method_37241().field_19939, this.method_37156());
   }

   @Nullable
   public Entity method_37243() {
      return this.field_41739;
   }

   public class_718 method_37132() {
      return class_718.field_3913;
   }

   public class_562 method_37197() {
      return class_562.field_3328;
   }

   public int method_37112() {
      return 1;
   }

   public class_9155 method_37320() {
      return new class_9155(
         this,
         this.method_37245(),
         this.method_37366(),
         !(this.field_41768 instanceof class_6331) ? null : (class_6331)this.field_41768,
         this.method_37352(),
         this.method_45509().getString(),
         this.method_19839(),
         this.field_41768.method_29522(),
         this
      );
   }

   public int method_37352() {
      return 0;
   }

   public boolean method_37163(int var1) {
      return this.method_37352() >= var1;
   }

   @Override
   public boolean method_26287() {
      return this.field_41768.method_29537().method_1285(class_291.field_1057);
   }

   @Override
   public boolean method_26285() {
      return true;
   }

   @Override
   public boolean method_26284() {
      return true;
   }

   public void method_37332(class_6139 var1, class_1343 var2) {
      class_1343 var5 = var1.method_28187(this);
      double var6 = var2.field_7336 - var5.field_7336;
      double var8 = var2.field_7333 - var5.field_7333;
      double var10 = var2.field_7334 - var5.field_7334;
      double var12 = (double)class_9299.method_42842(var6 * var6 + var10 * var10);
      this.field_41755 = class_9299.method_42810((float)(-(class_9299.method_42821(var8, var12) * 180.0F / (float)Math.PI)));
      this.field_41701 = class_9299.method_42810((float)(class_9299.method_42821(var10, var6) * 180.0F / (float)Math.PI) - 90.0F);
      this.method_37161(this.field_41701);
      this.field_41762 = this.field_41755;
      this.field_41711 = this.field_41701;
   }

   public boolean method_37143(class_2307<class_2340> var1, double var2) {
      class_4092 var6 = this.method_37241().method_18924(0.001);
      int var7 = class_9299.method_42847(var6.field_19941);
      int var8 = class_9299.method_42815(var6.field_19940);
      int var9 = class_9299.method_42847(var6.field_19937);
      int var10 = class_9299.method_42815(var6.field_19939);
      int var11 = class_9299.method_42847(var6.field_19938);
      int var12 = class_9299.method_42815(var6.field_19942);
      if (!this.field_41768.method_22569(var7, var9, var11, var8, var10, var12)) {
         return false;
      } else {
         double var13 = 0.0;
         boolean var15 = this.method_37107();
         boolean var16 = false;
         class_1343 var17 = class_1343.field_7335;
         int var18 = 0;
         class_2921 var19 = new class_2921();

         for (int var20 = var7; var20 < var8; var20++) {
            for (int var21 = var9; var21 < var10; var21++) {
               for (int var22 = var11; var22 < var12; var22++) {
                  var19.method_13362(var20, var21, var22);
                  class_4774 var23 = this.field_41768.method_28258(var19);
                  if (var23.method_22007(var1)) {
                     double var24 = (double)((float)var21 + var23.method_22008(this.field_41768, var19));
                     if (var24 >= var6.field_19937) {
                        var16 = true;
                        var13 = Math.max(var24 - var6.field_19937, var13);
                        if (var15) {
                           class_1343 var26 = var23.method_22003(this.field_41768, var19);
                           if (var13 < 0.4) {
                              var26 = var26.method_6209(var13);
                           }

                           var17 = var17.method_6215(var26);
                           var18++;
                        }
                     }
                  }
               }
            }
         }

         if (var17.method_6217() > 0.0) {
            if (var18 > 0) {
               var17 = var17.method_6209(1.0 / (double)var18);
            }

            if (!(this instanceof class_704)) {
               var17 = var17.method_6213();
            }

            class_1343 var30 = this.method_37098();
            var17 = var17.method_6209(var2 * 1.0);
            double var27 = 0.003;
            if (Math.abs(var30.field_7336) < 0.003 && Math.abs(var30.field_7334) < 0.003 && var17.method_6217() < 0.0045000000000000005) {
               var17 = var17.method_6213().method_6209(0.0045000000000000005);
            }

            this.method_37215(this.method_37098().method_6215(var17));
         }

         this.field_41694.put(var1, var13);
         return var16;
      }
   }

   public double method_37284(class_2307<class_2340> var1) {
      return this.field_41694.getDouble(var1);
   }

   public double method_37108() {
      return !((double)this.method_37277() < 0.4) ? 0.4 : 0.0;
   }

   public final float method_37086() {
      return this.field_41758.field_31199;
   }

   public final float method_37074() {
      return this.field_41758.field_31200;
   }

   public abstract Packet<?> method_37142();

   public class_6097 method_37190(class_7653 var1) {
      return this.field_41719.method_30473();
   }

   public class_1343 method_37245() {
      return this.field_41736;
   }

   public class_1331 method_37075() {
      return this.field_41702;
   }

   public class_1343 method_37098() {
      return this.field_41766;
   }

   public void method_37215(class_1343 var1) {
      this.field_41766 = var1;
   }

   public void method_37214(double var1, double var3, double var5) {
      this.method_37215(new class_1343(var1, var3, var5));
   }

   public final double method_37302() {
      return this.field_41736.field_7336;
   }

   public double method_37146(double var1) {
      return this.field_41736.field_7336 + (double)this.method_37086() * var1;
   }

   public double method_37361(double var1) {
      return this.method_37146((2.0 * this.field_41717.nextDouble() - 1.0) * var1);
   }

   public final double method_37309() {
      return this.field_41736.field_7333;
   }

   public double method_37080(double var1) {
      return this.field_41736.field_7333 + (double)this.method_37074() * var1;
   }

   public double method_37255() {
      return this.method_37080(this.field_41717.nextDouble());
   }

   public double method_37388() {
      return this.field_41736.field_7333 + (double)this.field_41710;
   }

   public final double method_37156() {
      return this.field_41736.field_7334;
   }

   public double method_37205(double var1) {
      return this.field_41736.field_7334 + (double)this.method_37086() * var1;
   }

   public double method_37383(double var1) {
      return this.method_37205((2.0 * this.field_41717.nextDouble() - 1.0) * var1);
   }

   public void method_37222(double var1, double var3, double var5) {
      if (this.field_41736.field_7336 != var1 || this.field_41736.field_7333 != var3 || this.field_41736.field_7334 != var5) {
         this.field_41736 = new class_1343(var1, var3, var5);
         int var9 = class_9299.method_42847(var1);
         int var10 = class_9299.method_42847(var3);
         int var11 = class_9299.method_42847(var5);
         if (var9 != this.field_41702.method_12173() || var10 != this.field_41702.method_12165() || var11 != this.field_41702.method_12185()) {
            this.field_41702 = new class_1331(var9, var10, var11);
         }

         this.field_41745 = true;
      }
   }

   public void method_37233() {
   }

   public class_1343 method_37202(float var1) {
      return this.method_37280(var1).method_6214(0.0, (double)this.field_41710 * 0.7, 0.0);
   }
}
