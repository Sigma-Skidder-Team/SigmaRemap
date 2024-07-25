package remapped;

import com.google.common.collect.ContiguousSet;
import com.google.common.collect.DiscreteDomain;
import com.google.common.collect.Lists;
import com.google.common.collect.Range;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_2810 {
   private static final Logger field_13789 = LogManager.getLogger();
   private static final Predicate<class_8145> field_13800 = class_3572.field_17481.and(class_3572.method_16617(0.0, 128.0, 0.0, 192.0));
   private final class_495 field_13802 = (class_495)new class_495(
         new TranslationTextComponent("entity.minecraft.ender_dragon"), class_1062.field_5825, class_2976.field_14631
      )
      .method_43457(true)
      .method_43463(true);
   private final class_6331 field_13790;
   private final List<Integer> field_13787 = Lists.newArrayList();
   private final class_9741 field_13794;
   private int field_13799;
   private int field_13798;
   private int field_13801;
   private int field_13805;
   private boolean field_13796;
   private boolean field_13803;
   private UUID field_13804;
   private boolean field_13788 = true;
   private class_1331 field_13797;
   private class_3486 field_13792;
   private int field_13795;
   private List<class_3577> field_13793;

   public class_2810(class_6331 var1, long var2, class_5734 var4) {
      this.field_13790 = var1;
      if (!var4.method_25939("DragonKilled", 99)) {
         this.field_13796 = true;
         this.field_13803 = true;
      } else {
         if (var4.method_25954("Dragon")) {
            this.field_13804 = var4.method_25926("Dragon");
         }

         this.field_13796 = var4.method_25933("DragonKilled");
         this.field_13803 = var4.method_25933("PreviouslyKilled");
         if (var4.method_25933("IsRespawning")) {
            this.field_13792 = class_3486.field_17113;
         }

         if (var4.method_25939("ExitPortalLocation", 10)) {
            this.field_13797 = class_4338.method_20189(var4.method_25937("ExitPortalLocation"));
         }
      }

      if (!var4.method_25939("Gateways", 9)) {
         this.field_13787.addAll(ContiguousSet.create(Range.closedOpen(0, 20), DiscreteDomain.integers()));
         Collections.shuffle(this.field_13787, new Random(var2));
      } else {
         class_3416 var7 = var4.method_25927("Gateways", 3);

         for (int var8 = 0; var8 < var7.size(); var8++) {
            this.field_13787.add(var7.method_15762(var8));
         }
      }

      this.field_13794 = class_9224.method_42577()
         .method_42575("       ", "       ", "       ", "   #   ", "       ", "       ", "       ")
         .method_42575("       ", "       ", "       ", "   #   ", "       ", "       ", "       ")
         .method_42575("       ", "       ", "       ", "   #   ", "       ", "       ", "       ")
         .method_42575("  ###  ", " #   # ", "#     #", "#  #  #", "#     #", " #   # ", "  ###  ")
         .method_42575("       ", "  ###  ", " ##### ", " ##### ", " ##### ", "  ###  ", "       ")
         .method_42576('#', class_9115.method_41965(class_813.method_3557(class_4783.field_23433)))
         .method_42571();
   }

   public class_5734 method_12785() {
      class_5734 var3 = new class_5734();
      if (this.field_13804 != null) {
         var3.method_25964("Dragon", this.field_13804);
      }

      var3.method_25934("DragonKilled", this.field_13796);
      var3.method_25934("PreviouslyKilled", this.field_13803);
      if (this.field_13797 != null) {
         var3.method_25946("ExitPortalLocation", class_4338.method_20190(this.field_13797));
      }

      class_3416 var4 = new class_3416();

      for (int var6 : this.field_13787) {
         var4.add(class_9413.method_43597(var6));
      }

      var3.method_25946("Gateways", var4);
      return var3;
   }

   public void method_12766() {
      this.field_13802.method_2404(!this.field_13796);
      if (++this.field_13805 >= 20) {
         this.method_12781();
         this.field_13805 = 0;
      }

      if (this.field_13802.method_2406().isEmpty()) {
         this.field_13790.method_28945().method_10193(class_5032.field_26023, new class_2034(0, 0), 9, class_3256.field_16155);
      } else {
         this.field_13790.method_28945().method_10177(class_5032.field_26023, new class_2034(0, 0), 9, class_3256.field_16155);
         boolean var3 = this.method_12778();
         if (this.field_13788 && var3) {
            this.method_12771();
            this.field_13788 = false;
         }

         if (this.field_13792 != null) {
            if (this.field_13793 == null && var3) {
               this.field_13792 = null;
               this.method_12774();
            }

            this.field_13792.method_16031(this.field_13790, this, this.field_13793, this.field_13795++, this.field_13797);
         }

         if (!this.field_13796) {
            if ((this.field_13804 == null || ++this.field_13799 >= 1200) && var3) {
               this.method_12773();
               this.field_13799 = 0;
            }

            if (++this.field_13801 >= 100 && var3) {
               this.method_12767();
               this.field_13801 = 0;
            }
         }
      }
   }

   private void method_12771() {
      field_13789.info("Scanning for legacy world dragon fight...");
      boolean var3 = this.method_12780();
      if (!var3) {
         field_13789.info("Found that the dragon has not yet been killed in this world.");
         this.field_13803 = false;
         if (this.method_12769() == null) {
            this.method_12782(false);
         }
      } else {
         field_13789.info("Found that the dragon has been killed in this world already.");
         this.field_13803 = true;
      }

      List var4 = this.field_13790.method_28947();
      if (!var4.isEmpty()) {
         class_2770 var5 = (class_2770)var4.get(0);
         this.field_13804 = var5.method_37328();
         field_13789.info("Found that there's a dragon still alive ({})", var5);
         this.field_13796 = false;
         if (!var3) {
            field_13789.info("But we didn't have a portal, let's remove it.");
            var5.method_37204();
            this.field_13804 = null;
         }
      } else {
         this.field_13796 = true;
      }

      if (!this.field_13803 && this.field_13796) {
         this.field_13796 = false;
      }
   }

   private void method_12773() {
      List var3 = this.field_13790.method_28947();
      if (!var3.isEmpty()) {
         field_13789.debug("Haven't seen our dragon, but found another one to use.");
         this.field_13804 = ((class_2770)var3.get(0)).method_37328();
      } else {
         field_13789.debug("Haven't seen the dragon, respawning it");
         this.method_12776();
      }
   }

   public void method_12768(class_3486 var1) {
      if (this.field_13792 == null) {
         throw new IllegalStateException("Dragon respawn isn't in progress, can't skip ahead in the animation.");
      } else {
         this.field_13795 = 0;
         if (var1 != class_3486.field_17115) {
            this.field_13792 = var1;
         } else {
            this.field_13792 = null;
            this.field_13796 = false;
            class_2770 var4 = this.method_12776();

            for (class_9359 var6 : this.field_13802.method_2406()) {
               class_8807.field_45046.method_22685(var6, var4);
            }
         }
      }
   }

   private boolean method_12780() {
      for (int var3 = -8; var3 <= 8; var3++) {
         for (int var4 = -8; var4 <= 8; var4++) {
            class_2654 var5 = this.field_13790.method_29554(var3, var4);

            for (class_3757 var7 : var5.method_12004().values()) {
               if (var7 instanceof class_9795) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   @Nullable
   private class_6953 method_12769() {
      for (int var3 = -8; var3 <= 8; var3++) {
         for (int var4 = -8; var4 <= 8; var4++) {
            class_2654 var5 = this.field_13790.method_29554(var3, var4);

            for (class_3757 var7 : var5.method_12004().values()) {
               if (var7 instanceof class_9795) {
                  class_6953 var8 = this.field_13794.method_44981(this.field_13790, var7.method_17399());
                  if (var8 != null) {
                     class_1331 var9 = var8.method_31795(3, 3, 3).method_41966();
                     if (this.field_13797 == null && var9.method_12173() == 0 && var9.method_12185() == 0) {
                        this.field_13797 = var9;
                     }

                     return var8;
                  }
               }
            }
         }
      }

      int var10 = this.field_13790.method_22563(class_3801.field_18595, class_8870.field_45348).method_12165();

      for (int var11 = var10; var11 >= 0; var11--) {
         class_6953 var12 = this.field_13794
            .method_44981(this.field_13790, new class_1331(class_8870.field_45348.method_12173(), var11, class_8870.field_45348.method_12185()));
         if (var12 != null) {
            if (this.field_13797 == null) {
               this.field_13797 = var12.method_31795(3, 3, 3).method_41966();
            }

            return var12;
         }
      }

      return null;
   }

   private boolean method_12778() {
      for (int var3 = -8; var3 <= 8; var3++) {
         for (int var4 = 8; var4 <= 8; var4++) {
            class_5990 var5 = this.field_13790.method_22555(var3, var4, class_7335.field_37514, false);
            if (!(var5 instanceof class_2654)) {
               return false;
            }

            class_7581 var6 = ((class_2654)var5).method_11999();
            if (!var6.method_34447(class_7581.field_38632)) {
               return false;
            }
         }
      }

      return true;
   }

   private void method_12781() {
      HashSet var3 = Sets.newHashSet();

      for (class_9359 var5 : this.field_13790.method_28990(field_13800)) {
         this.field_13802.method_2403(var5);
         var3.add(var5);
      }

      HashSet var7 = Sets.newHashSet(this.field_13802.method_2406());
      var7.removeAll(var3);

      for (class_9359 var6 : var7) {
         this.field_13802.method_2405(var6);
      }
   }

   private void method_12767() {
      this.field_13801 = 0;
      this.field_13798 = 0;

      for (class_9191 var4 : class_9484.method_43809(this.field_13790)) {
         this.field_13798 = this.field_13798 + this.field_13790.<class_3577>method_25868(class_3577.class, var4.method_42372()).size();
      }

      field_13789.debug("Found {} end crystals still alive", this.field_13798);
   }

   public void method_12779(class_2770 var1) {
      if (var1.method_37328().equals(this.field_13804)) {
         this.field_13802.method_43459(0.0F);
         this.field_13802.method_2404(false);
         this.method_12782(true);
         this.method_12765();
         if (!this.field_13803) {
            this.field_13790.method_29594(this.field_13790.method_22563(class_3801.field_18595, class_8870.field_45348), class_4783.field_23615.method_29260());
         }

         this.field_13803 = true;
         this.field_13796 = true;
      }
   }

   private void method_12765() {
      if (!this.field_13787.isEmpty()) {
         int var3 = this.field_13787.remove(this.field_13787.size() - 1);
         int var4 = class_9299.method_42847(96.0 * Math.cos(2.0 * (-Math.PI + (Math.PI / 20) * (double)var3)));
         int var5 = class_9299.method_42847(96.0 * Math.sin(2.0 * (-Math.PI + (Math.PI / 20) * (double)var3)));
         this.method_12787(new class_1331(var4, 75, var5));
      }
   }

   private void method_12787(class_1331 var1) {
      this.field_13790.method_43364(3000, var1, 0);
      class_7024.field_36071.method_27104(this.field_13790, this.field_13790.method_28945().method_10189(), new Random(), var1);
   }

   private void method_12782(boolean var1) {
      class_8870 var4 = new class_8870(var1);
      if (this.field_13797 == null) {
         this.field_13797 = this.field_13790.method_22563(class_3801.field_18590, class_8870.field_45348).method_6100();

         while (
            this.field_13790.method_28262(this.field_13797).method_8350(class_4783.field_23433)
               && this.field_13797.method_12165() > this.field_13790.method_22552()
         ) {
            this.field_13797 = this.field_13797.method_6100();
         }
      }

      var4.method_19909(class_6157.field_31540).method_27104(this.field_13790, this.field_13790.method_28945().method_10189(), new Random(), this.field_13797);
   }

   private class_2770 method_12776() {
      this.field_13790.method_29542(new class_1331(0, 128, 0));
      class_2770 var3 = class_6629.field_34310.method_30484(this.field_13790);
      var3.method_12611().method_29422(class_8978.field_46006);
      var3.method_37144(0.0, 128.0, 0.0, this.field_13790.field_33033.nextFloat() * 360.0F, 0.0F);
      this.field_13790.method_7509(var3);
      this.field_13804 = var3.method_37328();
      return var3;
   }

   public void method_12783(class_2770 var1) {
      if (var1.method_37328().equals(this.field_13804)) {
         this.field_13802.method_43459(var1.method_26551() / var1.method_26465());
         this.field_13799 = 0;
         if (var1.method_45507()) {
            this.field_13802.method_43451(var1.method_19839());
         }
      }
   }

   public int method_12784() {
      return this.field_13798;
   }

   public void method_12775(class_3577 var1, class_6199 var2) {
      if (this.field_13792 != null && this.field_13793.contains(var1)) {
         field_13789.debug("Aborting respawn sequence");
         this.field_13792 = null;
         this.field_13795 = 0;
         this.method_12770();
         this.method_12782(true);
      } else {
         this.method_12767();
         class_8145 var5 = this.field_13790.method_28925(this.field_13804);
         if (var5 instanceof class_2770) {
            ((class_2770)var5).method_12617(var1, var1.method_37075(), var2);
         }
      }
   }

   public boolean method_12777() {
      return this.field_13803;
   }

   public void method_12774() {
      if (this.field_13796 && this.field_13792 == null) {
         class_1331 var3 = this.field_13797;
         if (var3 == null) {
            field_13789.debug("Tried to respawn, but need to find the portal first.");
            class_6953 var4 = this.method_12769();
            if (var4 != null) {
               field_13789.debug("Found the exit portal & temporarily using it.");
            } else {
               field_13789.debug("Couldn't find a portal, so we made one.");
               this.method_12782(true);
            }

            var3 = this.field_13797;
         }

         ArrayList var9 = Lists.newArrayList();
         class_1331 var5 = var3.method_6082(1);

         for (class_240 var7 : class_9594.field_48893) {
            List var8 = this.field_13790.<class_3577>method_25868(class_3577.class, new class_4092(var5.method_6099(var7, 2)));
            if (var8.isEmpty()) {
               return;
            }

            var9.addAll(var8);
         }

         field_13789.debug("Found all crystals, respawning dragon.");
         this.method_12786(var9);
      }
   }

   private void method_12786(List<class_3577> var1) {
      if (this.field_13796 && this.field_13792 == null) {
         for (class_6953 var4 = this.method_12769(); var4 != null; var4 = this.method_12769()) {
            for (int var5 = 0; var5 < this.field_13794.method_44984(); var5++) {
               for (int var6 = 0; var6 < this.field_13794.method_44986(); var6++) {
                  for (int var7 = 0; var7 < this.field_13794.method_44982(); var7++) {
                     class_9115 var8 = var4.method_31795(var5, var6, var7);
                     if (var8.method_41968().method_8350(class_4783.field_23433) || var8.method_41968().method_8350(class_4783.field_23258)) {
                        this.field_13790.method_29594(var8.method_41966(), class_4783.field_23894.method_29260());
                     }
                  }
               }
            }
         }

         this.field_13792 = class_3486.field_17113;
         this.field_13795 = 0;
         this.method_12782(false);
         this.field_13793 = var1;
      }
   }

   public void method_12770() {
      for (class_9191 var4 : class_9484.method_43809(this.field_13790)) {
         for (class_3577 var6 : this.field_13790.<class_3577>method_25868(class_3577.class, var4.method_42372())) {
            var6.method_37289(false);
            var6.method_16625((class_1331)null);
         }
      }
   }
}
