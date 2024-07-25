package remapped;

import com.google.common.collect.Lists;
import com.google.common.primitives.Doubles;
import com.google.common.primitives.Floats;
import com.mojang.brigadier.ParseResults;
import com.mojang.brigadier.StringReader;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import it.unimi.dsi.fastutil.ints.Int2ShortMap;
import it.unimi.dsi.fastutil.ints.Int2ShortOpenHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import net.minecraft.util.text.ChatType;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.ITextComponent$class_40;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.util.text.filter.IChatFilter;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_948 implements class_1243 {
   private static final Logger field_4870 = LogManager.getLogger();
   public final class_5121 field_4867;
   private final class_341 field_4877;
   public class_9359 field_4880;
   private int field_4862;
   private long field_4866;
   private boolean field_4869;
   private long field_4860;
   private int field_4850;
   private int field_4876;
   private final Int2ShortMap field_4872 = new Int2ShortOpenHashMap();
   private double field_4853;
   private double field_4881;
   private double field_4856;
   private double field_4859;
   private double field_4863;
   private double field_4855;
   private Entity field_4854;
   private double field_4865;
   private double field_4875;
   private double field_4871;
   private double field_4873;
   private double field_4882;
   private double field_4883;
   private class_1343 field_4874;
   private int field_4852;
   private int field_4858;
   private boolean field_4861;
   private int field_4857;
   private boolean field_4851;
   private int field_4878;
   private int field_4868;
   private int field_4864;

   public class_948(class_341 var1, class_5121 var2, class_9359 var3) {
      this.field_4877 = var1;
      this.field_4867 = var2;
      var2.method_23495(this);
      this.field_4880 = var3;
      var3.field_47794 = this;
      IChatFilter var6 = var3.method_43257();
      if (var6 != null) {
         var6.func_244800_a();
      }
   }

   public void method_4160() {
      this.method_4165();
      this.field_4880.field_41767 = this.field_4880.method_37302();
      this.field_4880.field_41698 = this.field_4880.method_37309();
      this.field_4880.field_41725 = this.field_4880.method_37156();
      this.field_4880.method_43233();
      this.field_4880.method_37249(this.field_4853, this.field_4881, this.field_4856, this.field_4880.field_41701, this.field_4880.field_41755);
      this.field_4862++;
      this.field_4864 = this.field_4868;
      if (this.field_4861 && !this.field_4880.method_26507()) {
         if (++this.field_4857 > 80) {
            field_4870.warn("{} was kicked for floating too long!", this.field_4880.method_45509().getString());
            this.method_4161(new TranslationTextComponent("multiplayer.disconnect.flying"));
            return;
         }
      } else {
         this.field_4861 = false;
         this.field_4857 = 0;
      }

      this.field_4854 = this.field_4880.method_37240();
      if (this.field_4854 != this.field_4880 && this.field_4854.method_37259() == this.field_4880) {
         this.field_4865 = this.field_4854.method_37302();
         this.field_4875 = this.field_4854.method_37309();
         this.field_4871 = this.field_4854.method_37156();
         this.field_4873 = this.field_4854.method_37302();
         this.field_4882 = this.field_4854.method_37309();
         this.field_4883 = this.field_4854.method_37156();
         if (this.field_4851 && this.field_4880.method_37240().method_37259() == this.field_4880) {
            if (++this.field_4878 > 80) {
               field_4870.warn("{} was kicked for floating a vehicle too long!", this.field_4880.method_45509().getString());
               this.method_4161(new TranslationTextComponent("multiplayer.disconnect.flying"));
               return;
            }
         } else {
            this.field_4851 = false;
            this.field_4878 = 0;
         }
      } else {
         this.field_4854 = null;
         this.field_4851 = false;
         this.field_4878 = 0;
      }

      this.field_4877.method_1704().startSection("keepAlive");
      long var3 = Util.getMeasuringTimeMs();
      if (var3 - this.field_4866 >= 15000L) {
         if (!this.field_4869) {
            this.field_4869 = true;
            this.field_4866 = var3;
            this.field_4860 = var3;
            this.method_4156(new class_7573(this.field_4860));
         } else {
            this.method_4161(new TranslationTextComponent("disconnect.timeout"));
         }
      }

      this.field_4877.method_1704().endSection();
      if (this.field_4850 > 0) {
         this.field_4850--;
      }

      if (this.field_4876 > 0) {
         this.field_4876--;
      }

      if (this.field_4880.method_43250() > 0L
         && this.field_4877.method_1696() > 0
         && Util.getMeasuringTimeMs() - this.field_4880.method_43250() > (long)(this.field_4877.method_1696() * 1000 * 60)) {
         this.method_4161(new TranslationTextComponent("multiplayer.disconnect.idling"));
      }
   }

   public void method_4165() {
      this.field_4853 = this.field_4880.method_37302();
      this.field_4881 = this.field_4880.method_37309();
      this.field_4856 = this.field_4880.method_37156();
      this.field_4859 = this.field_4880.method_37302();
      this.field_4863 = this.field_4880.method_37309();
      this.field_4855 = this.field_4880.method_37156();
   }

   @Override
   public class_5121 method_9091() {
      return this.field_4867;
   }

   private boolean method_4159() {
      return this.field_4877.method_1610(this.field_4880.method_3247());
   }

   public void method_4161(ITextComponent var1) {
      this.field_4867.method_23486(new class_7957(var1), var2 -> this.field_4867.method_23482(var1));
      this.field_4867.method_23479();
      this.field_4877.method_34465(this.field_4867::method_23480);
   }

   private <T> void method_4168(T var1, Consumer<T> var2, BiFunction<IChatFilter, T, CompletableFuture<Optional<T>>> var3) {
      class_341 var6 = this.field_4880.method_43235().method_29522();
      Consumer var7 = var2x -> {
         if (!this.method_9091().method_23493()) {
            field_4870.debug("Ignoring packet due to disconnection");
         } else {
            var2.accept(var2x);
         }
      };
      IChatFilter var8 = this.field_4880.method_43257();
      if (var8 == null) {
         var6.execute(() -> var7.accept(var1));
      } else {
         ((CompletableFuture)var3.apply(var8, var1)).thenAcceptAsync(var1x -> var1x.ifPresent(var7), var6);
      }
   }

   private void method_4175(String var1, Consumer<String> var2) {
      this.method_4168(var1, var2, IChatFilter::func_244432_a);
   }

   private void method_4155(List<String> var1, Consumer<List<String>> var2) {
      this.method_4168(var1, var2, IChatFilter::func_244433_a);
   }

   @Override
   public void method_5546(class_758 var1) {
      class_5965.method_27245(var1, this, this.field_4880.method_43235());
      this.field_4880.method_43249(var1.method_3426(), var1.method_3427(), var1.method_3430(), var1.method_3428());
   }

   private static boolean method_4169(class_4609 var0) {
      return Doubles.isFinite(var0.method_21364(0.0))
            && Doubles.isFinite(var0.method_21368(0.0))
            && Doubles.isFinite(var0.method_21367(0.0))
            && Floats.isFinite(var0.method_21369(0.0F))
            && Floats.isFinite(var0.method_21366(0.0F))
         ? Math.abs(var0.method_21364(0.0)) > 3.0E7 || Math.abs(var0.method_21368(0.0)) > 3.0E7 || Math.abs(var0.method_21367(0.0)) > 3.0E7
         : true;
   }

   private static boolean method_4173(class_4148 var0) {
      return !Doubles.isFinite(var0.method_19261())
         || !Doubles.isFinite(var0.method_19258())
         || !Doubles.isFinite(var0.method_19262())
         || !Floats.isFinite(var0.method_19259())
         || !Floats.isFinite(var0.method_19257());
   }

   @Override
   public void method_5539(class_4148 var1) {
      class_5965.method_27245(var1, this, this.field_4880.method_43235());
      if (!method_4173(var1)) {
         Entity var4 = this.field_4880.method_37240();
         if (var4 != this.field_4880 && var4.method_37259() == this.field_4880 && var4 == this.field_4854) {
            class_6331 var5 = this.field_4880.method_43235();
            double var6 = var4.method_37302();
            double var8 = var4.method_37309();
            double var10 = var4.method_37156();
            double var12 = var1.method_19261();
            double var14 = var1.method_19258();
            double var16 = var1.method_19262();
            float var18 = var1.method_19257();
            float var19 = var1.method_19259();
            double var20 = var12 - this.field_4865;
            double var22 = var14 - this.field_4875;
            double var24 = var16 - this.field_4871;
            double var26 = var4.method_37098().method_6221();
            double var28 = var20 * var20 + var22 * var22 + var24 * var24;
            if (var28 - var26 > 100.0 && !this.method_4159()) {
               field_4870.warn(
                  "{} (vehicle of {}) moved too quickly! {},{},{}",
                  var4.method_45509().getString(),
                  this.field_4880.method_45509().getString(),
                  var20,
                  var22,
                  var24
               );
               this.field_4867.method_23485(new class_3931(var4));
               return;
            }

            boolean var30 = var5.method_6683(var4, var4.method_37241().method_18924(0.0625));
            var20 = var12 - this.field_4873;
            var22 = var14 - this.field_4882 - 1.0E-6;
            var24 = var16 - this.field_4883;
            var4.method_37226(class_7412.field_37842, new class_1343(var20, var22, var24));
            var20 = var12 - var4.method_37302();
            var22 = var14 - var4.method_37309();
            if (var22 > -0.5 || var22 < 0.5) {
               var22 = 0.0;
            }

            var24 = var16 - var4.method_37156();
            var28 = var20 * var20 + var22 * var22 + var24 * var24;
            boolean var31 = false;
            if (var28 > 0.0625) {
               var31 = true;
               field_4870.warn(
                  "{} (vehicle of {}) moved wrongly! {}", var4.method_45509().getString(), this.field_4880.method_45509().getString(), Math.sqrt(var28)
               );
            }

            var4.method_37249(var12, var14, var16, var18, var19);
            boolean var32 = var5.method_6683(var4, var4.method_37241().method_18924(0.0625));
            if (var30 && (var31 || !var32)) {
               var4.method_37249(var6, var8, var10, var18, var19);
               this.field_4867.method_23485(new class_3931(var4));
               return;
            }

            this.field_4880.method_43235().method_28945().method_10186(this.field_4880);
            this.field_4880.method_3214(this.field_4880.method_37302() - var6, this.field_4880.method_37309() - var8, this.field_4880.method_37156() - var10);
            this.field_4851 = var22 >= -0.03125 && !this.field_4877.method_1632() && this.method_4166(var4);
            this.field_4873 = var4.method_37302();
            this.field_4882 = var4.method_37309();
            this.field_4883 = var4.method_37156();
         }
      } else {
         this.method_4161(new TranslationTextComponent("multiplayer.disconnect.invalid_vehicle_movement"));
      }
   }

   private boolean method_4166(Entity var1) {
      return var1.field_41768.method_28256(var1.method_37241().method_18898(0.0625).method_18928(0.0, -0.55, 0.0)).allMatch(class_1873::method_8345);
   }

   @Override
   public void method_5576(class_2492 var1) {
      class_5965.method_27245(var1, this, this.field_4880.method_43235());
      if (var1.method_11403() == this.field_4852) {
         this.field_4880
            .method_37249(
               this.field_4874.field_7336, this.field_4874.field_7333, this.field_4874.field_7334, this.field_4880.field_41701, this.field_4880.field_41755
            );
         this.field_4859 = this.field_4874.field_7336;
         this.field_4863 = this.field_4874.field_7333;
         this.field_4855 = this.field_4874.field_7334;
         if (this.field_4880.method_43262()) {
            this.field_4880.method_43281();
         }

         this.field_4874 = null;
      }
   }

   @Override
   public void method_5547(class_6074 var1) {
      class_5965.method_27245(var1, this, this.field_4880.method_43235());
      this.field_4877.method_1705().method_23139(var1.method_27817()).ifPresent(this.field_4880.method_43266()::method_5088);
   }

   @Override
   public void method_5564(class_9066 var1) {
      class_5965.method_27245(var1, this, this.field_4880.method_43235());
      this.field_4880.method_43266().method_5085(var1.method_41619(), var1.method_41618(), var1.method_41617());
   }

   @Override
   public void method_5579(class_3906 var1) {
      class_5965.method_27245(var1, this, this.field_4880.method_43235());
      if (var1.method_18087() == class_4756.field_23031) {
         Identifier var4 = var1.method_18085();
         class_3139 var5 = this.field_4877.method_1703().method_40818(var4);
         if (var5 != null) {
            this.field_4880.method_43253().method_15406(var5);
         }
      }
   }

   @Override
   public void method_5554(class_6248 var1) {
      class_5965.method_27245(var1, this, this.field_4880.method_43235());
      StringReader var4 = new StringReader(var1.method_28521());
      if (var4.canRead() && var4.peek() == '/') {
         var4.skip();
      }

      ParseResults var5 = this.field_4877.method_1631().method_2229().parse(var4, this.field_4880.method_37320());
      this.field_4877
         .method_1631()
         .method_2229()
         .getCompletionSuggestions(var5)
         .thenAccept(var2 -> this.field_4867.method_23485(new class_2610(var1.method_28522(), var2)));
   }

   @Override
   public void method_5550(class_6066 var1) {
      class_5965.method_27245(var1, this, this.field_4880.method_43235());
      if (!this.field_4877.method_1726()) {
         this.field_4880.method_26286(new TranslationTextComponent("advMode.notEnabled"), Util.NIL_UUID);
      } else if (!this.field_4880.method_3184()) {
         this.field_4880.method_26286(new TranslationTextComponent("advMode.notAllowed"), Util.NIL_UUID);
      } else {
         class_8116 var4 = null;
         class_7454 var5 = null;
         class_1331 var6 = var1.method_27779();
         class_3757 var7 = this.field_4880.field_41768.method_28260(var6);
         if (var7 instanceof class_7454) {
            var5 = (class_7454)var7;
            var4 = var5.method_33929();
         }

         String var8 = var1.method_27783();
         boolean var9 = var1.method_27784();
         if (var4 != null) {
            class_9776 var10 = var5.method_33927();
            Direction var11 = this.field_4880.field_41768.method_28262(var6).<Direction>method_10313(class_8151.field_41791);
            switch (var1.method_27780()) {
               case field_49629:
                  class_2522 var12 = class_4783.field_23601.method_29260();
                  this.field_4880
                     .field_41768
                     .method_7513(
                        var6, var12.method_10308(class_8151.field_41791, var11).method_10308(class_8151.field_41788, Boolean.valueOf(var1.method_27782())), 2
                     );
                  break;
               case field_49632:
                  class_2522 var13 = class_4783.field_23265.method_29260();
                  this.field_4880
                     .field_41768
                     .method_7513(
                        var6, var13.method_10308(class_8151.field_41791, var11).method_10308(class_8151.field_41788, Boolean.valueOf(var1.method_27782())), 2
                     );
                  break;
               case field_49631:
               default:
                  class_2522 var14 = class_4783.field_23730.method_29260();
                  this.field_4880
                     .field_41768
                     .method_7513(
                        var6, var14.method_10308(class_8151.field_41791, var11).method_10308(class_8151.field_41788, Boolean.valueOf(var1.method_27782())), 2
                     );
            }

            var7.method_17412();
            this.field_4880.field_41768.method_29558(var6, var7);
            var4.method_36930(var8);
            var4.method_36935(var9);
            if (!var9) {
               var4.method_36937((ITextComponent)null);
            }

            var5.method_33932(var1.method_27781());
            if (var10 != var1.method_27780()) {
               var5.method_33931();
            }

            var4.method_36932();
            if (!class_6660.method_30576(var8)) {
               this.field_4880.method_26286(new TranslationTextComponent("advMode.setCommand.success", var8), Util.NIL_UUID);
            }
         }
      }
   }

   @Override
   public void method_5555(class_685 var1) {
      class_5965.method_27245(var1, this, this.field_4880.method_43235());
      if (this.field_4877.method_1726()) {
         if (this.field_4880.method_3184()) {
            class_8116 var4 = var1.method_3102(this.field_4880.field_41768);
            if (var4 != null) {
               var4.method_36930(var1.method_3101());
               var4.method_36935(var1.method_3105());
               if (!var1.method_3105()) {
                  var4.method_36937((ITextComponent)null);
               }

               var4.method_36932();
               this.field_4880.method_26286(new TranslationTextComponent("advMode.setCommand.success", var1.method_3101()), Util.NIL_UUID);
            }
         } else {
            this.field_4880.method_26286(new TranslationTextComponent("advMode.notAllowed"), Util.NIL_UUID);
         }
      } else {
         this.field_4880.method_26286(new TranslationTextComponent("advMode.notEnabled"), Util.NIL_UUID);
      }
   }

   @Override
   public void method_5573(class_4006 var1) {
      class_5965.method_27245(var1, this, this.field_4880.method_43235());
      this.field_4880.inventory.method_32426(var1.method_18488());
      this.field_4880
         .field_47794
         .method_4156(
            new class_5491(-2, this.field_4880.inventory.field_36404, this.field_4880.inventory.method_31498(this.field_4880.inventory.field_36404))
         );
      this.field_4880.field_47794.method_4156(new class_5491(-2, var1.method_18488(), this.field_4880.inventory.method_31498(var1.method_18488())));
      this.field_4880.field_47794.method_4156(new class_4020(this.field_4880.inventory.field_36404));
   }

   @Override
   public void method_5544(class_5912 var1) {
      class_5965.method_27245(var1, this, this.field_4880.method_43235());
      if (this.field_4880.field_3874 instanceof class_6600) {
         class_6600 var4 = (class_6600)this.field_4880.field_3874;
         String var5 = class_7665.method_34677(var1.method_27017());
         if (var5.length() <= 35) {
            var4.method_30384(var5);
         }
      }
   }

   @Override
   public void method_5541(class_8879 var1) {
      class_5965.method_27245(var1, this, this.field_4880.method_43235());
      if (this.field_4880.field_3874 instanceof class_4034) {
         ((class_4034)this.field_4880.field_3874).method_18566(var1.method_40852(), var1.method_40851());
      }
   }

   @Override
   public void method_5571(class_6971 var1) {
      class_5965.method_27245(var1, this, this.field_4880.method_43235());
      if (this.field_4880.method_3184()) {
         class_1331 var4 = var1.method_31869();
         class_2522 var5 = this.field_4880.field_41768.method_28262(var4);
         class_3757 var6 = this.field_4880.field_41768.method_28260(var4);
         if (var6 instanceof class_945) {
            class_945 var7 = (class_945)var6;
            var7.method_4108(var1.method_31875());
            var7.method_4098(var1.method_31871());
            var7.method_4119(var1.method_31884());
            var7.method_4107(var1.method_31879());
            var7.method_4087(var1.method_31880());
            var7.method_4092(var1.method_31873());
            var7.method_4100(var1.method_31878());
            var7.method_4110(var1.method_31876());
            var7.method_4101(var1.method_31882());
            var7.method_4123(var1.method_31874());
            var7.method_4106(var1.method_31877());
            var7.method_4128(var1.method_31883());
            if (!var7.method_4121()) {
               this.field_4880.method_3251(new TranslationTextComponent("structure_block.invalid_structure_name", var1.method_31871()), false);
            } else {
               String var8 = var7.method_4113();
               if (var1.method_31872() != class_6664.field_34460) {
                  if (var1.method_31872() != class_6664.field_34462) {
                     if (var1.method_31872() == class_6664.field_34459) {
                        if (!var7.method_4094()) {
                           this.field_4880.method_3251(new TranslationTextComponent("structure_block.size_failure"), false);
                        } else {
                           this.field_4880.method_3251(new TranslationTextComponent("structure_block.size_success", var8), false);
                        }
                     }
                  } else if (var7.method_4117()) {
                     if (!var7.method_4103(this.field_4880.method_43235())) {
                        this.field_4880.method_3251(new TranslationTextComponent("structure_block.load_prepare", var8), false);
                     } else {
                        this.field_4880.method_3251(new TranslationTextComponent("structure_block.load_success", var8), false);
                     }
                  } else {
                     this.field_4880.method_3251(new TranslationTextComponent("structure_block.load_not_found", var8), false);
                  }
               } else if (!var7.method_4114()) {
                  this.field_4880.method_3251(new TranslationTextComponent("structure_block.save_failure", var8), false);
               } else {
                  this.field_4880.method_3251(new TranslationTextComponent("structure_block.save_success", var8), false);
               }
            }

            var7.method_17407();
            this.field_4880.field_41768.method_29572(var4, var5, var5, 3);
         }
      }
   }

   @Override
   public void method_5563(class_1074 var1) {
      class_5965.method_27245(var1, this, this.field_4880.method_43235());
      if (this.field_4880.method_3184()) {
         class_1331 var4 = var1.method_4704();
         class_2522 var5 = this.field_4880.field_41768.method_28262(var4);
         class_3757 var6 = this.field_4880.field_41768.method_28260(var4);
         if (var6 instanceof class_6786) {
            class_6786 var7 = (class_6786)var6;
            var7.method_31105(var1.method_4707());
            var7.method_31109(var1.method_4705());
            var7.method_31104(var1.method_4703());
            var7.method_31110(var1.method_4706());
            var7.method_31107(var1.method_4709());
            var7.method_17407();
            this.field_4880.field_41768.method_29572(var4, var5, var5, 3);
         }
      }
   }

   @Override
   public void method_5556(class_9054 var1) {
      class_5965.method_27245(var1, this, this.field_4880.method_43235());
      if (this.field_4880.method_3184()) {
         class_1331 var4 = var1.method_41593();
         class_3757 var5 = this.field_4880.field_41768.method_28260(var4);
         if (var5 instanceof class_6786) {
            class_6786 var6 = (class_6786)var5;
            var6.method_31112(this.field_4880.method_43235(), var1.method_41592(), var1.method_41594());
         }
      }
   }

   @Override
   public void method_5567(class_7028 var1) {
      class_5965.method_27245(var1, this, this.field_4880.method_43235());
      int var4 = var1.method_32062();
      class_4088 var5 = this.field_4880.field_3874;
      if (var5 instanceof class_6415) {
         class_6415 var6 = (class_6415)var5;
         var6.method_29323(var4);
         var6.method_29313(var4);
      }
   }

   @Override
   public void method_5561(class_703 var1) {
      ItemStack var4 = var1.method_3145();
      if (var4.method_27960() == class_4897.field_24805) {
         CompoundNBT var5 = var4.method_27990();
         if (class_7702.method_34884(var5)) {
            ArrayList var6 = Lists.newArrayList();
            boolean var7 = var1.method_3142();
            if (var7) {
               var6.add(var5.method_25965("title"));
            }

            class_3416 var8 = var5.method_25927("pages", 8);

            for (int var9 = 0; var9 < var8.size(); var9++) {
               var6.add(var8.method_15770(var9));
            }

            int var10 = var1.method_3143();
            if (class_7051.method_32417(var10) || var10 == 40) {
               this.method_4155(
                  var6, !var7 ? var2 -> this.method_4167(var2, var10) : var2 -> this.method_4158(var2.get(0), var2.subList(1, var2.size()), var10)
               );
            }
         }
      }
   }

   private void method_4167(List<String> var1, int var2) {
      ItemStack var5 = this.field_4880.inventory.method_31498(var2);
      if (var5.method_27960() == class_4897.field_24805) {
         class_3416 var6 = new class_3416();
         var1.stream().<class_473>map(class_473::method_2261).forEach(var6::add);
         var5.method_27954("pages", var6);
      }
   }

   private void method_4158(String var1, List<String> var2, int var3) {
      ItemStack var6 = this.field_4880.inventory.method_31498(var3);
      if (var6.method_27960() == class_4897.field_24805) {
         ItemStack var7 = new ItemStack(class_4897.field_24698);
         CompoundNBT var8 = var6.method_27990();
         if (var8 != null) {
            var7.method_27965(var8.method_25944());
         }

         var7.method_27954("author", class_473.method_2261(this.field_4880.method_45509().getString()));
         var7.method_27954("title", class_473.method_2261(var1));
         class_3416 var9 = new class_3416();

         for (String var11 : var2) {
            StringTextComponent var12 = new StringTextComponent(var11);
            String var13 = ITextComponent$class_40.toJson(var12);
            var9.add(class_473.method_2261(var13));
         }

         var7.method_27954("pages", var9);
         this.field_4880.inventory.method_31503(var3, var7);
      }
   }

   @Override
   public void method_5562(class_6187 var1) {
      class_5965.method_27245(var1, this, this.field_4880.method_43235());
      if (this.field_4880.method_37163(2)) {
         Entity var4 = this.field_4880.method_43235().method_29534(var1.method_28315());
         if (var4 != null) {
            CompoundNBT var5 = var4.method_37258(new CompoundNBT());
            this.field_4880.field_47794.method_4156(new class_4798(var1.method_28314(), var5));
         }
      }
   }

   @Override
   public void method_5543(class_7825 var1) {
      class_5965.method_27245(var1, this, this.field_4880.method_43235());
      if (this.field_4880.method_37163(2)) {
         class_3757 var4 = this.field_4880.method_43235().method_28260(var1.method_35429());
         CompoundNBT var5 = var4 == null ? null : var4.method_17396(new CompoundNBT());
         this.field_4880.field_47794.method_4156(new class_4798(var1.method_35431(), var5));
      }
   }

   @Override
   public void method_5568(class_4609 var1) {
      class_5965.method_27245(var1, this, this.field_4880.method_43235());
      if (!method_4169(var1)) {
         class_6331 var4 = this.field_4880.method_43235();
         if (!this.field_4880.field_47777) {
            if (this.field_4862 == 0) {
               this.method_4165();
            }

            if (this.field_4874 == null) {
               this.field_4858 = this.field_4862;
               if (!this.field_4880.method_37070()) {
                  double var5 = this.field_4880.method_37302();
                  double var7 = this.field_4880.method_37309();
                  double var9 = this.field_4880.method_37156();
                  double var11 = this.field_4880.method_37309();
                  double var13 = var1.method_21364(this.field_4880.method_37302());
                  double var15 = var1.method_21368(this.field_4880.method_37309());
                  double var17 = var1.method_21367(this.field_4880.method_37156());
                  float var19 = var1.method_21366(this.field_4880.field_41701);
                  float var20 = var1.method_21369(this.field_4880.field_41755);
                  double var21 = var13 - this.field_4853;
                  double var23 = var15 - this.field_4881;
                  double var25 = var17 - this.field_4856;
                  double var27 = this.field_4880.method_37098().method_6221();
                  double var29 = var21 * var21 + var23 * var23 + var25 * var25;
                  if (!this.field_4880.method_26507()) {
                     this.field_4868++;
                     int var31 = this.field_4868 - this.field_4864;
                     if (var31 > 5) {
                        field_4870.debug(
                           "{} is sending move packets too frequently ({} packets since last tick)", this.field_4880.method_45509().getString(), var31
                        );
                        var31 = 1;
                     }

                     if (!this.field_4880.method_43262()
                        && (!this.field_4880.method_43235().method_29537().method_1285(class_291.field_1030) || !this.field_4880.method_26618())) {
                        float var32 = !this.field_4880.method_26618() ? 100.0F : 300.0F;
                        if (var29 - var27 > (double)(var32 * (float)var31) && !this.method_4159()) {
                           field_4870.warn("{} moved too quickly! {},{},{}", this.field_4880.method_45509().getString(), var21, var23, var25);
                           this.method_4170(
                              this.field_4880.method_37302(),
                              this.field_4880.method_37309(),
                              this.field_4880.method_37156(),
                              this.field_4880.field_41701,
                              this.field_4880.field_41755
                           );
                           return;
                        }
                     }

                     class_4092 var42 = this.field_4880.method_37241();
                     var21 = var13 - this.field_4859;
                     var23 = var15 - this.field_4863;
                     var25 = var17 - this.field_4855;
                     boolean var33 = var23 > 0.0;
                     if (this.field_4880.method_37360() && !var1.method_21365() && var33) {
                        this.field_4880.method_26595();
                     }

                     this.field_4880.method_37226(class_7412.field_37842, new class_1343(var21, var23, var25));
                     var21 = var13 - this.field_4880.method_37302();
                     var23 = var15 - this.field_4880.method_37309();
                     if (var23 > -0.5 || var23 < 0.5) {
                        var23 = 0.0;
                     }

                     var25 = var17 - this.field_4880.method_37156();
                     var29 = var21 * var21 + var23 * var23 + var25 * var25;
                     boolean var34 = false;
                     if (!this.field_4880.method_43262()
                        && var29 > 0.0625
                        && !this.field_4880.method_26507()
                        && !this.field_4880.field_47807.method_39519()
                        && this.field_4880.field_47807.method_39517() != GameType.SPECTATOR) {
                        var34 = true;
                        field_4870.warn("{} moved wrongly!", this.field_4880.method_45509().getString());
                     }

                     this.field_4880.method_37249(var13, var15, var17, var19, var20);
                     if (this.field_4880.field_41731
                        || this.field_4880.method_26507()
                        || (!var34 || !var4.method_6683(this.field_4880, var42)) && !this.method_4174(var4, var42)) {
                        this.field_4861 = var23 >= -0.03125
                           && this.field_4880.field_47807.method_39517() != GameType.SPECTATOR
                           && !this.field_4877.method_1632()
                           && !this.field_4880.field_3876.allowFlying
                           && !this.field_4880.isPotionActive(Effects.LevitationEffect)
                           && !this.field_4880.method_26618()
                           && this.method_4166(this.field_4880);
                        this.field_4880.method_43235().method_28945().method_10186(this.field_4880);
                        this.field_4880.method_43251(this.field_4880.method_37309() - var11, var1.method_21365());
                        this.field_4880.method_37386(var1.method_21365());
                        if (var33) {
                           this.field_4880.field_41706 = 0.0F;
                        }

                        this.field_4880
                           .method_3214(this.field_4880.method_37302() - var5, this.field_4880.method_37309() - var7, this.field_4880.method_37156() - var9);
                        this.field_4859 = this.field_4880.method_37302();
                        this.field_4863 = this.field_4880.method_37309();
                        this.field_4855 = this.field_4880.method_37156();
                     } else {
                        this.method_4170(var5, var7, var9, var19, var20);
                     }
                  } else if (var29 > 1.0) {
                     this.method_4170(
                        this.field_4880.method_37302(),
                        this.field_4880.method_37309(),
                        this.field_4880.method_37156(),
                        var1.method_21366(this.field_4880.field_41701),
                        var1.method_21369(this.field_4880.field_41755)
                     );
                  }
               } else {
                  this.field_4880
                     .method_37249(
                        this.field_4880.method_37302(),
                        this.field_4880.method_37309(),
                        this.field_4880.method_37156(),
                        var1.method_21366(this.field_4880.field_41701),
                        var1.method_21369(this.field_4880.field_41755)
                     );
                  this.field_4880.method_43235().method_28945().method_10186(this.field_4880);
               }
            } else if (this.field_4862 - this.field_4858 > 20) {
               this.field_4858 = this.field_4862;
               this.method_4170(
                  this.field_4874.field_7336, this.field_4874.field_7333, this.field_4874.field_7334, this.field_4880.field_41701, this.field_4880.field_41755
               );
            }
         }
      } else {
         this.method_4161(new TranslationTextComponent("multiplayer.disconnect.invalid_player_movement"));
      }
   }

   private boolean method_4174(class_4924 var1, class_4092 var2) {
      Stream var5 = var1.method_6676(this.field_4880, this.field_4880.method_37241().method_18924(1.0E-5F), var0 -> true);
      class_4190 var6 = class_3370.method_15523(var2.method_18924(1.0E-5F));
      return var5.anyMatch(var1x -> !class_3370.method_15537(var1x, var6, class_8529.field_43655));
   }

   public void method_4170(double var1, double var3, double var5, float var7, float var8) {
      this.method_4171(var1, var3, var5, var7, var8, Collections.<class_8089>emptySet());
   }

   public void method_4171(double var1, double var3, double var5, float var7, float var8, Set<class_8089> var9) {
      double var12 = !var9.contains(class_8089.field_41423) ? 0.0 : this.field_4880.method_37302();
      double var14 = !var9.contains(class_8089.field_41427) ? 0.0 : this.field_4880.method_37309();
      double var16 = !var9.contains(class_8089.field_41424) ? 0.0 : this.field_4880.method_37156();
      float var18 = !var9.contains(class_8089.field_41428) ? 0.0F : this.field_4880.field_41701;
      float var19 = !var9.contains(class_8089.field_41429) ? 0.0F : this.field_4880.field_41755;
      this.field_4874 = new class_1343(var1, var3, var5);
      if (++this.field_4852 == Integer.MAX_VALUE) {
         this.field_4852 = 0;
      }

      this.field_4858 = this.field_4862;
      this.field_4880.method_37249(var1, var3, var5, var7, var8);
      this.field_4880.field_47794.method_4156(new class_509(var1 - var12, var3 - var14, var5 - var16, var7 - var18, var8 - var19, var9, this.field_4852));
   }

   @Override
   public void method_5570(class_1586 var1) {
      class_5965.method_27245(var1, this, this.field_4880.method_43235());
      class_1331 var4 = var1.method_7126();
      this.field_4880.method_43237();
      class_7500 var5 = var1.method_7130();
      switch (var5) {
         case field_38260:
            if (!this.field_4880.method_37221()) {
               ItemStack var6 = this.field_4880.method_26617(class_2584.field_12794);
               this.field_4880.method_26615(class_2584.field_12794, this.field_4880.method_26617(class_2584.field_12791));
               this.field_4880.method_26615(class_2584.field_12791, var6);
               this.field_4880.method_26529();
            }

            return;
         case field_38266:
            if (!this.field_4880.method_37221()) {
               this.field_4880.method_3235(false);
            }

            return;
         case field_38265:
            if (!this.field_4880.method_37221()) {
               this.field_4880.method_3235(true);
            }

            return;
         case field_38259:
            this.field_4880.method_26474();
            return;
         case field_38263:
         case field_38264:
         case field_38258:
            this.field_4880.field_47807.method_39523(var4, var5, var1.method_7129(), this.field_4877.method_1671());
            return;
         default:
            throw new IllegalArgumentException("Invalid player action");
      }
   }

   private static boolean method_4162(class_9359 var0, ItemStack var1) {
      if (var1.method_28022()) {
         return false;
      } else {
         class_2451 var4 = var1.method_27960();
         return (var4 instanceof class_6201 || var4 instanceof class_3997) && !var0.method_3173().method_32954(var4);
      }
   }

   @Override
   public void method_5557(class_8585 var1) {
      class_5965.method_27245(var1, this, this.field_4880.method_43235());
      class_6331 var4 = this.field_4880.method_43235();
      class_2584 var5 = var1.method_39483();
      ItemStack var6 = this.field_4880.method_26617(var5);
      class_9529 var7 = var1.method_39484();
      class_1331 var8 = var7.method_43955();
      Direction var9 = var7.method_43956();
      this.field_4880.method_43237();
      if (var8.method_12165() >= this.field_4877.method_1671()) {
         IFormattableTextComponent var10 = new TranslationTextComponent("build.tooHigh", this.field_4877.method_1671()).mergeStyle(TextFormatting.RED);
         this.field_4880.field_47794.method_4156(new class_5182(var10, ChatType.GAME_INFO, Util.NIL_UUID));
      } else if (this.field_4874 == null
         && this.field_4880.method_37273((double)var8.method_12173() + 0.5, (double)var8.method_12165() + 0.5, (double)var8.method_12185() + 0.5) < 64.0
         && var4.method_29538(this.field_4880, var8)) {
         class_6910 var12 = this.field_4880.field_47807.method_39528(this.field_4880, var4, var6, var5, var7);
         if (var9 == Direction.field_817
            && !var12.method_31662()
            && var8.method_12165() >= this.field_4877.method_1671() - 1
            && method_4162(this.field_4880, var6)) {
            IFormattableTextComponent var11 = new TranslationTextComponent("build.tooHigh", this.field_4877.method_1671()).mergeStyle(TextFormatting.RED);
            this.field_4880.field_47794.method_4156(new class_5182(var11, ChatType.GAME_INFO, Util.NIL_UUID));
         } else if (var12.method_31661()) {
            this.field_4880.method_26488(var5, true);
         }
      }

      this.field_4880.field_47794.method_4156(new class_4267(var4, var8));
      this.field_4880.field_47794.method_4156(new class_4267(var4, var8.method_6098(var9)));
   }

   @Override
   public void method_5559(class_1022 var1) {
      class_5965.method_27245(var1, this, this.field_4880.method_43235());
      class_6331 var4 = this.field_4880.method_43235();
      class_2584 var5 = var1.method_4516();
      ItemStack var6 = this.field_4880.method_26617(var5);
      this.field_4880.method_43237();
      if (!var6.method_28022()) {
         class_6910 var7 = this.field_4880.field_47807.method_39520(this.field_4880, var4, var6, var5);
         if (var7.method_31661()) {
            this.field_4880.method_26488(var5, true);
         }
      }
   }

   @Override
   public void method_5537(class_6404 var1) {
      class_5965.method_27245(var1, this, this.field_4880.method_43235());
      if (this.field_4880.method_37221()) {
         for (class_6331 var5 : this.field_4877.method_1719()) {
            Entity var6 = var1.method_29233(var5);
            if (var6 != null) {
               this.field_4880.method_43274(var5, var6.method_37302(), var6.method_37309(), var6.method_37156(), var6.field_41701, var6.field_41755);
               return;
            }
         }
      }
   }

   @Override
   public void method_5569(class_5982 var1) {
   }

   @Override
   public void method_5553(class_8125 var1) {
      class_5965.method_27245(var1, this, this.field_4880.method_43235());
      Entity var4 = this.field_4880.method_37243();
      if (var4 instanceof class_9149) {
         ((class_9149)var4).method_42087(var1.method_36966(), var1.method_36965());
      }
   }

   @Override
   public void method_9090(ITextComponent var1) {
      field_4870.info("{} lost connection: {}", this.field_4880.method_45509().getString(), var1.getString());
      this.field_4877.method_1717();
      this.field_4877
         .method_1600()
         .method_39983(
            new TranslationTextComponent("multiplayer.player.left", this.field_4880.method_19839()).mergeStyle(TextFormatting.YELLOW),
            ChatType.SYSTEM,
            Util.NIL_UUID
         );
      this.field_4880.method_43242();
      this.field_4877.method_1600().method_39973(this.field_4880);
      IChatFilter var4 = this.field_4880.method_43257();
      if (var4 != null) {
         var4.func_244434_b();
      }

      if (this.method_4159()) {
         field_4870.info("Stopping singleplayer server as player logged out");
         this.field_4877.method_1641(false);
      }
   }

   public void method_4156(Packet<?> var1) {
      this.method_4157(var1, (GenericFutureListener<? extends Future<? super Void>>)null);
   }

   public void method_4157(Packet<?> var1, GenericFutureListener<? extends Future<? super Void>> var2) {
      if (var1 instanceof class_5182) {
         class_5182 var5 = (class_5182)var1;
         class_1803 var6 = this.field_4880.method_43286();
         if (var6 == class_1803.field_9186 && var5.method_23771() != ChatType.GAME_INFO) {
            return;
         }

         if (var6 == class_1803.field_9181 && !var5.method_23769()) {
            return;
         }
      }

      try {
         this.field_4867.method_23486(var1, var2);
      } catch (Throwable var8) {
         class_159 var9 = class_159.method_643(var8, "Sending packet");
         class_6544 var7 = var9.method_639("Packet being sent");
         var7.method_29851("Packet class", () -> var1.getClass().getCanonicalName());
         throw new class_3297(var9);
      }
   }

   @Override
   public void method_5560(class_7371 var1) {
      class_5965.method_27245(var1, this, this.field_4880.method_43235());
      if (var1.method_33575() >= 0 && var1.method_33575() < class_7051.method_32422()) {
         if (this.field_4880.inventory.field_36404 != var1.method_33575() && this.field_4880.method_26500() == class_2584.field_12791) {
            this.field_4880.method_26529();
         }

         this.field_4880.inventory.field_36404 = var1.method_33575();
         this.field_4880.method_43237();
      } else {
         field_4870.warn("{} tried to set an invalid carried item", this.field_4880.method_45509().getString());
      }
   }

   @Override
   public void method_5581(class_3211 var1) {
      String var4 = StringUtils.normalizeSpace(var1.method_14751());
      if (!var4.startsWith("/")) {
         this.method_4175(var4, this::method_4172);
      } else {
         class_5965.method_27245(var1, this, this.field_4880.method_43235());
         this.method_4172(var4);
      }
   }

   private void method_4172(String var1) {
      if (this.field_4880.method_43286() != class_1803.field_9186) {
         this.field_4880.method_43237();

         for (int var4 = 0; var4 < var1.length(); var4++) {
            if (!class_7665.method_34675(var1.charAt(var4))) {
               this.method_4161(new TranslationTextComponent("multiplayer.disconnect.illegal_characters"));
               return;
            }
         }

         if (!var1.startsWith("/")) {
            TranslationTextComponent var5 = new TranslationTextComponent("chat.type.text", this.field_4880.method_19839(), var1);
            this.field_4877.method_1600().method_39983(var5, ChatType.CHAT, this.field_4880.method_37328());
         } else {
            this.method_4176(var1);
         }

         this.field_4850 += 20;
         if (this.field_4850 > 200 && !this.field_4877.method_1600().method_39962(this.field_4880.method_3247())) {
            this.method_4161(new TranslationTextComponent("disconnect.spam"));
         }
      } else {
         this.method_4156(
            new class_5182(new TranslationTextComponent("chat.cannotSend").mergeStyle(TextFormatting.RED), ChatType.SYSTEM, Util.NIL_UUID)
         );
      }
   }

   private void method_4176(String var1) {
      this.field_4877.method_1631().method_2232(this.field_4880.method_37320(), var1);
   }

   @Override
   public void method_5552(class_3195 var1) {
      class_5965.method_27245(var1, this, this.field_4880.method_43235());
      this.field_4880.method_43237();
      this.field_4880.method_26597(var1.method_14706());
   }

   @Override
   public void method_5575(class_2317 var1) {
      class_5965.method_27245(var1, this, this.field_4880.method_43235());
      this.field_4880.method_43237();
      switch (var1.method_10650()) {
         case field_20098:
            this.field_4880.method_37234(true);
            break;
         case field_20097:
            this.field_4880.method_37234(false);
            break;
         case field_20099:
            this.field_4880.method_37140(true);
            break;
         case field_20100:
            this.field_4880.method_37140(false);
            break;
         case field_20102:
            if (this.field_4880.method_26507()) {
               this.field_4880.method_3162(false, true);
               this.field_4874 = this.field_4880.method_37245();
            }
            break;
         case field_20103:
            if (this.field_4880.method_37243() instanceof class_9766) {
               class_9766 var6 = (class_9766)this.field_4880.method_37243();
               int var5 = var1.method_10652();
               if (var6.method_45066() && var5 > 0) {
                  var6.method_45067(var5);
               }
            }
            break;
         case field_20096:
            if (this.field_4880.method_37243() instanceof class_9766) {
               class_9766 var4 = (class_9766)this.field_4880.method_37243();
               var4.method_45068();
            }
            break;
         case field_20101:
            if (this.field_4880.method_37243() instanceof class_4109) {
               ((class_4109)this.field_4880.method_37243()).method_19076(this.field_4880);
            }
            break;
         case field_20093:
            if (!this.field_4880.method_3190()) {
               this.field_4880.method_3238();
            }
            break;
         default:
            throw new IllegalArgumentException("Invalid client command!");
      }
   }

   @Override
   public void method_5551(class_3398 var1) {
      class_5965.method_27245(var1, this, this.field_4880.method_43235());
      class_6331 var4 = this.field_4880.method_43235();
      Entity var5 = var1.method_15695(var4);
      this.field_4880.method_43237();
      this.field_4880.method_37234(var1.method_15692());
      if (var5 != null) {
         double var6 = 36.0;
         if (this.field_4880.method_37275(var5) < 36.0) {
            class_2584 var8 = var1.method_15691();
            ItemStack var9 = var8 == null ? ItemStack.EMPTY : this.field_4880.method_26617(var8).method_27973();
            Optional var10 = Optional.empty();
            if (var1.method_15694() != class_92.field_185) {
               if (var1.method_15694() != class_92.field_184) {
                  if (var1.method_15694() == class_92.field_183) {
                     if (var5 instanceof class_91 || var5 instanceof class_5614 || var5 instanceof class_6749 || var5 == this.field_4880) {
                        this.method_4161(new TranslationTextComponent("multiplayer.disconnect.invalid_entity_attacked"));
                        field_4870.warn("Player {} tried to attack an invalid entity", this.field_4880.method_45509().getString());
                        return;
                     }

                     this.field_4880.method_3158(var5);
                  }
               } else {
                  var10 = Optional.<class_6910>of(var5.method_37227(this.field_4880, var1.method_15697(), var8));
               }
            } else {
               var10 = Optional.<class_6910>of(this.field_4880.method_3204(var5, var8));
            }

            if (var10.isPresent() && ((class_6910)var10.get()).method_31662()) {
               class_8807.field_45063.method_17001(this.field_4880, var9, var5);
               if (((class_6910)var10.get()).method_31661()) {
                  this.field_4880.method_26488(var8, true);
               }
            }
         }
      }
   }

   @Override
   public void method_5577(class_8559 var1) {
      class_5965.method_27245(var1, this, this.field_4880.method_43235());
      this.field_4880.method_43237();
      class_2105 var4 = var1.method_39391();
      switch (var4) {
         case field_10549:
            if (this.field_4880.field_47777) {
               this.field_4880.field_47777 = false;
               this.field_4880 = this.field_4877.method_1600().method_39984(this.field_4880, true);
               class_8807.field_45058.method_38905(this.field_4880, World.field_33038, World.field_33048);
            } else {
               if (this.field_4880.method_26551() > 0.0F) {
                  return;
               }

               this.field_4880 = this.field_4877.method_1600().method_39984(this.field_4880, false);
               if (this.field_4877.method_1634()) {
                  this.field_4880.method_3155(GameType.SPECTATOR);
                  this.field_4880.method_43235().method_29537().<class_5850>method_1287(class_291.field_1059).method_26684(false, this.field_4877);
               }
            }
            break;
         case field_10550:
            this.field_4880.method_43271().method_35779(this.field_4880);
      }
   }

   @Override
   public void method_5580(class_1194 var1) {
      class_5965.method_27245(var1, this, this.field_4880.method_43235());
      this.field_4880.method_43263();
   }

   @Override
   public void method_5549(class_5955 var1) {
      class_5965.method_27245(var1, this, this.field_4880.method_43235());
      this.field_4880.method_43237();
      if (this.field_4880.field_3874.field_19925 == var1.method_27202() && this.field_4880.field_3874.method_18879(this.field_4880)) {
         if (!this.field_4880.method_37221()) {
            ItemStack var4 = this.field_4880.field_3874.method_18865(var1.method_27201(), var1.method_27205(), var1.method_27207(), this.field_4880);
            if (!ItemStack.method_27982(var1.method_27204(), var4)) {
               this.field_4872.put(this.field_4880.field_3874.field_19925, var1.method_27203());
               this.field_4880.field_47794.method_4156(new class_8913(var1.method_27202(), var1.method_27203(), false));
               this.field_4880.field_3874.method_18883(this.field_4880, false);
               class_2831 var5 = class_2831.method_12874();

               for (int var6 = 0; var6 < this.field_4880.field_3874.field_19926.size(); var6++) {
                  ItemStack var7 = this.field_4880.field_3874.field_19926.get(var6).method_35898();
                  var5.add(!var7.method_28022() ? var7 : ItemStack.EMPTY);
               }

               this.field_4880.method_347(this.field_4880.field_3874, var5);
            } else {
               this.field_4880.field_47794.method_4156(new class_8913(var1.method_27202(), var1.method_27203(), true));
               this.field_4880.field_47775 = true;
               this.field_4880.field_3874.method_18877();
               this.field_4880.method_43260();
               this.field_4880.field_47775 = false;
            }
         } else {
            class_2831 var8 = class_2831.method_12874();

            for (int var9 = 0; var9 < this.field_4880.field_3874.field_19926.size(); var9++) {
               var8.add(this.field_4880.field_3874.field_19926.get(var9).method_35898());
            }

            this.field_4880.method_347(this.field_4880.field_3874, var8);
         }
      }
   }

   @Override
   public void method_5548(class_6072 var1) {
      class_5965.method_27245(var1, this, this.field_4880.method_43235());
      this.field_4880.method_43237();
      if (!this.field_4880.method_37221()
         && this.field_4880.field_3874.field_19925 == var1.method_27810()
         && this.field_4880.field_3874.method_18879(this.field_4880)
         && this.field_4880.field_3874 instanceof class_3954) {
         this.field_4877
            .method_1705()
            .method_23139(var1.method_27812())
            .ifPresent(var2 -> ((class_3954)this.field_4880.field_3874).method_18264(var1.method_27811(), (class_8932<?>)var2, this.field_4880));
      }
   }

   @Override
   public void method_5566(class_8635 var1) {
      class_5965.method_27245(var1, this, this.field_4880.method_43235());
      this.field_4880.method_43237();
      if (this.field_4880.field_3874.field_19925 == var1.method_39639()
         && this.field_4880.field_3874.method_18879(this.field_4880)
         && !this.field_4880.method_37221()) {
         this.field_4880.field_3874.method_18886(this.field_4880, var1.method_39640());
         this.field_4880.field_3874.method_18877();
      }
   }

   @Override
   public void method_5558(class_6362 var1) {
      class_5965.method_27245(var1, this, this.field_4880.method_43235());
      if (this.field_4880.field_47807.method_39519()) {
         boolean var4 = var1.method_29139() < 0;
         ItemStack var5 = var1.method_29138();
         CompoundNBT var6 = var5.method_28021("BlockEntityTag");
         if (!var5.method_28022() && var6 != null && var6.method_25938("x") && var6.method_25938("y") && var6.method_25938("z")) {
            class_1331 var7 = new class_1331(var6.method_25947("x"), var6.method_25947("y"), var6.method_25947("z"));
            class_3757 var8 = this.field_4880.field_41768.method_28260(var7);
            if (var8 != null) {
               CompoundNBT var9 = var8.method_17396(new CompoundNBT());
               var9.method_25959("x");
               var9.method_25959("y");
               var9.method_25959("z");
               var5.method_27954("BlockEntityTag", var9);
            }
         }

         boolean var10 = var1.method_29139() >= 1 && var1.method_29139() <= 45;
         boolean var11 = var5.method_28022() || var5.method_28026() >= 0 && var5.method_27997() <= 64 && !var5.method_28022();
         if (var10 && var11) {
            if (!var5.method_28022()) {
               this.field_4880.field_3869.method_18871(var1.method_29139(), var5);
            } else {
               this.field_4880.field_3869.method_18871(var1.method_29139(), ItemStack.EMPTY);
            }

            this.field_4880.field_3869.method_18883(this.field_4880, true);
            this.field_4880.field_3869.method_18877();
         } else if (var4 && var11 && this.field_4876 < 200) {
            this.field_4876 += 20;
            this.field_4880.method_3153(var5, true);
         }
      }
   }

   @Override
   public void method_5572(class_3835 var1) {
      class_5965.method_27245(var1, this, this.field_4880.method_43235());
      int var4 = this.field_4880.field_3874.field_19925;
      if (var4 == var1.method_17822()
         && this.field_4872.getOrDefault(var4, (short)(var1.method_17819() + 1)) == var1.method_17819()
         && !this.field_4880.field_3874.method_18879(this.field_4880)
         && !this.field_4880.method_37221()) {
         this.field_4880.field_3874.method_18883(this.field_4880, true);
      }
   }

   @Override
   public void method_5540(class_1020 var1) {
      List var4 = Stream.<String>of(var1.method_4512()).<String>map(TextFormatting::getTextWithoutFormattingCodes).collect(Collectors.toList());
      this.method_4155(var4, var2 -> this.method_4164(var1, var2));
   }

   private void method_4164(class_1020 var1, List<String> var2) {
      this.field_4880.method_43237();
      class_6331 var5 = this.field_4880.method_43235();
      class_1331 var6 = var1.method_4510();
      if (var5.method_22559(var6)) {
         class_2522 var7 = var5.method_28262(var6);
         class_3757 var8 = var5.method_28260(var6);
         if (!(var8 instanceof class_8398)) {
            return;
         }

         class_8398 var9 = (class_8398)var8;
         if (!var9.method_38671() || var9.method_38679() != this.field_4880) {
            field_4870.warn("Player {} just tried to change non-editable sign", this.field_4880.method_45509().getString());
            return;
         }

         for (int var10 = 0; var10 < var2.size(); var10++) {
            var9.method_38677(var10, new StringTextComponent((String)var2.get(var10)));
         }

         var9.method_17407();
         var5.method_29572(var6, var7, var7, 3);
      }
   }

   @Override
   public void method_5574(class_2669 var1) {
      if (this.field_4869 && var1.method_12028() == this.field_4860) {
         int var4 = (int)(Util.getMeasuringTimeMs() - this.field_4866);
         this.field_4880.field_47790 = (this.field_4880.field_47790 * 3 + var4) / 4;
         this.field_4869 = false;
      } else if (!this.method_4159()) {
         this.method_4161(new TranslationTextComponent("disconnect.timeout"));
      }
   }

   @Override
   public void method_5542(class_9808 var1) {
      class_5965.method_27245(var1, this, this.field_4880.method_43235());
      this.field_4880.field_3876.isFlying = var1.method_45232() && this.field_4880.field_3876.allowFlying;
   }

   @Override
   public void method_5565(class_8244 var1) {
      class_5965.method_27245(var1, this, this.field_4880.method_43235());
      this.field_4880.method_43280(var1);
   }

   @Override
   public void method_5578(class_5930 var1) {
   }

   @Override
   public void method_5545(class_3005 var1) {
      class_5965.method_27245(var1, this, this.field_4880.method_43235());
      if (this.field_4880.method_37163(2) || this.method_4159()) {
         this.field_4877.method_1753(var1.method_13730(), false);
      }
   }

   @Override
   public void method_5538(class_3196 var1) {
      class_5965.method_27245(var1, this, this.field_4880.method_43235());
      if (this.field_4880.method_37163(2) || this.method_4159()) {
         this.field_4877.method_1646(var1.method_14709());
      }
   }
}
