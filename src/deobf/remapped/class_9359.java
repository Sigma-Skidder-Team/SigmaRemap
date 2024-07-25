package remapped;

import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import com.mojang.datafixers.util.Either;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Random;
import java.util.UUID;
import javax.annotation.Nullable;
import net.minecraft.util.text.ChatType;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.util.text.event.HoverEvent;
import net.minecraft.util.text.event.HoverEvent$class_48;
import net.minecraft.util.text.filter.IChatFilter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_9359 extends class_704 implements class_117 {
   private static final Logger field_47780 = LogManager.getLogger();
   public class_948 field_47794;
   public final class_341 field_47801;
   public final class_8598 field_47807;
   private final List<Integer> field_47791 = Lists.newLinkedList();
   private final class_3362 field_47788;
   private final class_7909 field_47778;
   private float field_47798 = Float.MIN_VALUE;
   private int field_47786 = Integer.MIN_VALUE;
   private int field_47800 = Integer.MIN_VALUE;
   private int field_47773 = Integer.MIN_VALUE;
   private int field_47792 = Integer.MIN_VALUE;
   private int field_47796 = Integer.MIN_VALUE;
   private float field_47810 = -1.0E8F;
   private int field_47799 = -99999999;
   private boolean field_47776 = true;
   private int field_47772 = -99999999;
   private int field_47781 = 60;
   private class_1803 field_47809;
   private boolean field_47784 = true;
   private long field_47785 = Util.getMeasuringTimeMs();
   private Entity field_47802;
   private boolean field_47789;
   private boolean field_47783;
   private final class_3071 field_47805 = new class_3071();
   private class_1343 field_47797;
   private int field_47795;
   private boolean field_47774;
   private class_1343 field_47793;
   private class_6979 field_47803 = class_6979.method_31893(0, 0, 0);
   private class_5621<World> field_47782 = World.field_33048;
   private BlockPos field_47779;
   private boolean field_47787;
   private float field_47808;
   private final IChatFilter field_47804;
   private int field_47806;
   public boolean field_47775;
   public int field_47790;
   public boolean field_47777;

   public class_9359(class_341 var1, class_6331 var2, GameProfile var3, class_8598 var4) {
      super(var2, var2.method_28998(), var2.method_28988(), var3);
      var4.field_44036 = this;
      this.field_47807 = var4;
      this.field_47801 = var1;
      this.field_47778 = var1.method_1600().method_39957(this);
      this.field_47788 = var1.method_1600().method_39950(this);
      this.field_41733 = 1.0F;
      this.method_43254(var2);
      this.field_47804 = var1.method_1684(this);
   }

   private void method_43254(class_6331 var1) {
      BlockPos var4 = var1.method_28998();
      if (var1.method_22572().method_40229() && var1.method_29522().method_1601().method_25709() != GameType.ADVENTURE) {
         int var5 = Math.max(0, this.field_47801.method_1720(var1));
         int var6 = class_9299.method_42847(var1.method_6673().method_9808((double)var4.method_12173(), (double)var4.method_12185()));
         if (var6 < var5) {
            var5 = var6;
         }

         if (var6 <= 1) {
            var5 = 1;
         }

         long var7 = (long)(var5 * 2 + 1);
         long var9 = var7 * var7;
         int var11 = var9 <= 2147483647L ? (int)var9 : Integer.MAX_VALUE;
         int var12 = this.method_43246(var11);
         int var13 = new Random().nextInt(var11);

         for (int var14 = 0; var14 < var11; var14++) {
            int var15 = (var13 + var12 * var14) % var11;
            int var16 = var15 % (var5 * 2 + 1);
            int var17 = var15 / (var5 * 2 + 1);
            BlockPos var18 = class_1077.method_4714(var1, var4.method_12173() + var16 - var5, var4.method_12185() + var17 - var5, false);
            if (var18 != null) {
               this.method_37253(var18, 0.0F, 0.0F);
               if (var1.method_6682(this)) {
                  break;
               }
            }
         }
      } else {
         this.method_37253(var4, 0.0F, 0.0F);

         while (!var1.method_6682(this) && this.method_37309() < 255.0) {
            this.method_37256(this.method_37302(), this.method_37309() + 1.0, this.method_37156());
         }
      }
   }

   private int method_43246(int var1) {
      return var1 > 16 ? 17 : var1 - 1;
   }

   @Override
   public void method_37314(CompoundNBT var1) {
      super.method_37314(var1);
      if (var1.contains("playerGameType", 99)) {
         if (!this.method_37268().method_1621()) {
            this.field_47807
               .method_39516(
                  GameType.method_21590(var1.method_25947("playerGameType")),
                  !var1.contains("previousPlayerGameType", 3)
                     ? GameType.NOT_SET
                     : GameType.method_21590(var1.method_25947("previousPlayerGameType"))
               );
         } else {
            this.field_47807.method_39516(this.method_37268().method_1602(), GameType.NOT_SET);
         }
      }

      if (var1.contains("enteredNetherPosition", 10)) {
         CompoundNBT var4 = var1.getCompound("enteredNetherPosition");
         this.field_47793 = new class_1343(var4.method_25932("x"), var4.method_25932("y"), var4.method_25932("z"));
      }

      this.field_47783 = var1.getBoolean("seenCredits");
      if (var1.contains("recipeBook", 10)) {
         this.field_47805.method_14034(var1.getCompound("recipeBook"), this.field_47801.method_1705());
      }

      if (this.method_26507()) {
         this.method_26557();
      }

      if (var1.contains("SpawnX", 99) && var1.contains("SpawnY", 99) && var1.contains("SpawnZ", 99)) {
         this.field_47779 = new BlockPos(var1.method_25947("SpawnX"), var1.method_25947("SpawnY"), var1.method_25947("SpawnZ"));
         this.field_47787 = var1.getBoolean("SpawnForced");
         this.field_47808 = var1.getFloat("SpawnAngle");
         if (var1.method_25938("SpawnDimension")) {
            this.field_47782 = World.field_33043
               .parse(class_3504.field_17178, var1.method_25929("SpawnDimension"))
               .resultOrPartial(field_47780::error)
               .orElse(World.field_33048);
         }
      }
   }

   @Override
   public void method_37376(CompoundNBT var1) {
      super.method_37376(var1);
      var1.method_25931("playerGameType", this.field_47807.method_39517().getID());
      var1.method_25931("previousPlayerGameType", this.field_47807.method_39524().getID());
      var1.putBoolean("seenCredits", this.field_47783);
      if (this.field_47793 != null) {
         CompoundNBT var4 = new CompoundNBT();
         var4.method_25923("x", this.field_47793.field_7336);
         var4.method_25923("y", this.field_47793.field_7333);
         var4.method_25923("z", this.field_47793.field_7334);
         var1.put("enteredNetherPosition", var4);
      }

      Entity var8 = this.method_37240();
      Entity var5 = this.method_37243();
      if (var5 != null && var8 != this && var8.method_37172()) {
         CompoundNBT var6 = new CompoundNBT();
         CompoundNBT var7 = new CompoundNBT();
         var8.method_37350(var7);
         var6.method_25964("Attach", var5.method_37328());
         var6.put("Entity", var7);
         var1.put("RootVehicle", var6);
      }

      var1.put("recipeBook", this.field_47805.method_14033());
      var1.method_25941("Dimension", this.world.method_29545().method_25499().toString());
      if (this.field_47779 != null) {
         var1.method_25931("SpawnX", this.field_47779.method_12173());
         var1.method_25931("SpawnY", this.field_47779.method_12165());
         var1.method_25931("SpawnZ", this.field_47779.method_12185());
         var1.putBoolean("SpawnForced", this.field_47787);
         var1.putFloat("SpawnAngle", this.field_47808);
         Identifier.field_22655
            .encodeStart(class_3504.field_17178, this.field_47782.method_25499())
            .resultOrPartial(field_47780::error)
            .ifPresent(var1x -> var1.put("SpawnDimension", var1x));
      }
   }

   public void method_43247(int var1) {
      float var4 = (float)this.method_3194();
      float var5 = (var4 - 1.0F) / var4;
      this.field_3842 = class_9299.method_42828((float)var1 / var4, 0.0F, var5);
      this.field_47772 = -1;
   }

   public void method_43277(int var1) {
      this.field_3840 = var1;
      this.field_47772 = -1;
   }

   @Override
   public void method_3220(int var1) {
      super.method_3220(var1);
      this.field_47772 = -1;
   }

   @Override
   public void method_3175(ItemStack var1, int var2) {
      super.method_3175(var1, var2);
      this.field_47772 = -1;
   }

   public void method_43243() {
      this.field_3874.method_18888(this);
   }

   @Override
   public void method_26546() {
      super.method_26546();
      this.field_47794.method_4156(new class_7214(this.method_26476(), class_2820.field_13846));
   }

   @Override
   public void method_26592() {
      super.method_26592();
      this.field_47794.method_4156(new class_7214(this.method_26476(), class_2820.field_13847));
   }

   @Override
   public void method_37170(class_2522 var1) {
      class_8807.field_45077.method_8117(this, var1);
   }

   @Override
   public class_7200 method_3229() {
      return new class_661(this);
   }

   @Override
   public void method_37123() {
      this.field_47807.method_39514();
      this.field_47781--;
      if (this.field_41749 > 0) {
         this.field_41749--;
      }

      this.field_3874.method_18877();
      if (!this.world.field_33055 && !this.field_3874.method_18861(this)) {
         this.method_3207();
         this.field_3874 = this.field_3869;
      }

      while (!this.field_47791.isEmpty()) {
         int var3 = Math.min(this.field_47791.size(), Integer.MAX_VALUE);
         int[] var4 = new int[var3];
         Iterator var5 = this.field_47791.iterator();
         int var6 = 0;

         while (var5.hasNext() && var6 < var3) {
            var4[var6++] = (Integer)var5.next();
            var5.remove();
         }

         this.field_47794.method_4156(new class_3985(var4));
      }

      Entity var7 = this.method_43276();
      if (var7 != this) {
         if (!var7.method_37330()) {
            this.method_43284(this);
         } else {
            this.method_37249(var7.method_37302(), var7.method_37309(), var7.method_37156(), var7.rotationYaw, var7.rotationPitch);
            this.method_43235().method_28945().method_10186(this);
            if (this.method_3199()) {
               this.method_43284(this);
            }
         }
      }

      class_8807.field_45079.method_970(this);
      if (this.field_47797 != null) {
         class_8807.field_45050.method_39389(this, this.field_47797, this.field_41697 - this.field_47795);
      }

      this.field_47788.method_15404(this);
   }

   public void method_43233() {
      try {
         if (!this.method_37221() || this.world.isBlockLoaded(this.method_37075())) {
            super.method_37123();
         }

         for (int var3 = 0; var3 < this.inventory.method_31505(); var3++) {
            ItemStack var7 = this.inventory.method_31498(var3);
            if (var7.method_27960().method_11221()) {
               Packet var8 = ((class_6249)var7.method_27960()).method_28525(var7, this.world, this);
               if (var8 != null) {
                  this.field_47794.method_4156(var8);
               }
            }
         }

         if (this.method_26551() != this.field_47810
            || this.field_47799 != this.field_3867.method_42238()
            || this.field_3867.method_42237() == 0.0F != this.field_47776) {
            this.field_47794.method_4156(new class_3605(this.method_26551(), this.field_3867.method_42238(), this.field_3867.method_42237()));
            this.field_47810 = this.method_26551();
            this.field_47799 = this.field_3867.method_42238();
            this.field_47776 = this.field_3867.method_42237() == 0.0F;
         }

         if (this.method_26551() + this.method_26493() != this.field_47798) {
            this.field_47798 = this.method_26551() + this.method_26493();
            this.method_43267(class_6810.field_35128, class_9299.method_42816(this.field_47798));
         }

         if (this.field_3867.method_42238() != this.field_47786) {
            this.field_47786 = this.field_3867.method_42238();
            this.method_43267(class_6810.field_35138, class_9299.method_42816((float)this.field_47786));
         }

         if (this.method_37229() != this.field_47800) {
            this.field_47800 = this.method_37229();
            this.method_43267(class_6810.field_35137, class_9299.method_42816((float)this.field_47800));
         }

         if (this.method_26565() != this.field_47773) {
            this.field_47773 = this.method_26565();
            this.method_43267(class_6810.field_35132, class_9299.method_42816((float)this.field_47773));
         }

         if (this.field_3862 != this.field_47796) {
            this.field_47796 = this.field_3862;
            this.method_43267(class_6810.field_35127, class_9299.method_42816((float)this.field_47796));
         }

         if (this.field_3840 != this.field_47792) {
            this.field_47792 = this.field_3840;
            this.method_43267(class_6810.field_35134, class_9299.method_42816((float)this.field_47792));
         }

         if (this.field_3862 != this.field_47772) {
            this.field_47772 = this.field_3862;
            this.field_47794.method_4156(new class_8175(this.field_3842, this.field_3862, this.field_3840));
         }

         if (this.field_41697 % 20 == 0) {
            class_8807.field_45067.method_7409(this);
         }
      } catch (Throwable var6) {
         class_159 var4 = class_159.method_643(var6, "Ticking player");
         class_6544 var5 = var4.method_639("Player being ticked");
         this.method_37331(var5);
         throw new class_3297(var4);
      }
   }

   private void method_43267(class_6810 var1, int var2) {
      this.method_3219().method_4851(var1, this.method_37206(), var1x -> var1x.method_38140(var2));
   }

   @Override
   public void method_26452(DamageSource var1) {
      boolean var4 = this.world.method_29537().method_1285(class_291.field_1060);
      if (!var4) {
         this.field_47794.method_4156(new class_7214(this.method_26476(), class_2820.field_13845));
      } else {
         ITextComponent var5 = this.method_26476().method_15870();
         this.field_47794
            .method_4157(
               new class_7214(this.method_26476(), class_2820.field_13845, var5),
               var2 -> {
                  if (!var2.isSuccess()) {
                     short var5x = 256;
                     String var6x = var5.getStringTruncated(256);
                     TranslationTextComponent var7x = new TranslationTextComponent(
                        "death.attack.message_too_long", new StringTextComponent(var6x).mergeStyle(TextFormatting.YELLOW)
                     );
                     IFormattableTextComponent var8 = new TranslationTextComponent("death.attack.even_more_magic", this.method_19839())
                        .modifyStyle(var1xx -> var1xx.setHoverEvent(new HoverEvent(HoverEvent$class_48.SHOW_TEXT, var7x)));
                     this.field_47794.method_4156(new class_7214(this.method_26476(), class_2820.field_13845, var8));
                  }
               }
            );
         class_5086 var6 = this.method_37095();
         if (var6 == null || var6.method_23374() == class_1014.field_5325) {
            this.field_47801.method_1600().method_39983(var5, ChatType.SYSTEM, Util.NIL_UUID);
         } else if (var6.method_23374() != class_1014.field_5327) {
            if (var6.method_23374() == class_1014.field_5328) {
               this.field_47801.method_1600().method_39965(this, var5);
            }
         } else {
            this.field_47801.method_1600().method_39990(this, var5);
         }
      }

      this.method_3157();
      if (this.world.method_29537().method_1285(class_291.field_1042)) {
         this.method_43256();
      }

      if (!this.method_37221()) {
         this.method_26513(var1);
      }

      this.method_3219().method_4851(class_6810.field_35131, this.method_37206(), class_8274::method_38145);
      class_5834 var7 = this.method_26560();
      if (var7 != null) {
         this.method_3211(class_6234.field_31834.method_43790(var7.method_37387()));
         var7.method_37392(this, this.field_29644, var1);
         this.method_26487(var7);
      }

      this.world.method_29587(this, (byte)3);
      this.method_3209(class_6234.field_31827);
      this.method_3166(class_6234.field_31829.method_43790(class_6234.field_31889));
      this.method_3166(class_6234.field_31829.method_43790(class_6234.field_31894));
      this.method_37136();
      this.method_37220(0, false);
      this.method_26476().method_15868();
   }

   private void method_43256() {
      class_4092 var3 = new class_4092(this.method_37075()).method_18899(32.0, 10.0, 32.0);
      this.world
         .<class_5886>method_25874(class_5886.class, var3)
         .stream()
         .filter(var0 -> var0 instanceof class_6250)
         .forEach(var1 -> ((class_6250)var1).method_28526(this));
   }

   @Override
   public void method_37392(Entity var1, int var2, DamageSource var3) {
      if (var1 != this) {
         super.method_37392(var1, var2, var3);
         this.method_3176(var2);
         String var6 = this.method_37206();
         String var7 = var1.method_37206();
         this.method_3219().method_4851(class_6810.field_35140, var6, class_8274::method_38145);
         if (!(var1 instanceof class_704)) {
            this.method_3209(class_6234.field_31909);
         } else {
            this.method_3209(class_6234.field_31867);
            this.method_3219().method_4851(class_6810.field_35133, var6, class_8274::method_38145);
         }

         this.method_43240(var6, var7, class_6810.field_35125);
         this.method_43240(var7, var6, class_6810.field_35141);
         class_8807.field_45078.method_11578(this, var1, var3);
      }
   }

   private void method_43240(String var1, String var2, class_6810[] var3) {
      class_3903 var6 = this.method_3219().method_4848(var2);
      if (var6 != null) {
         int var7 = var6.method_23381().getColorIndex();
         if (var7 >= 0 && var7 < var3.length) {
            this.method_3219().method_4851(var3[var7], var1, class_8274::method_38145);
         }
      }
   }

   @Override
   public boolean attackEntityFrom(DamageSource var1, float var2) {
      if (this.method_37180(var1)) {
         return false;
      } else {
         boolean var5 = this.field_47801.method_1718() && this.method_43241() && "fall".equals(var1.field_31693);
         if (!var5 && this.field_47781 > 0 && var1 != DamageSource.field_31685) {
            return false;
         } else {
            if (var1 instanceof class_5405) {
               Entity var6 = var1.method_28372();
               if (var6 instanceof class_704 && !this.method_3213((class_704)var6)) {
                  return false;
               }

               if (var6 instanceof class_6749) {
                  class_6749 var7 = (class_6749)var6;
                  Entity var8 = var7.method_26166();
                  if (var8 instanceof class_704 && !this.method_3213((class_704)var8)) {
                     return false;
                  }
               }
            }

            return super.attackEntityFrom(var1, var2);
         }
      }
   }

   @Override
   public boolean method_3213(class_704 var1) {
      return this.method_43241() ? super.method_3213(var1) : false;
   }

   private boolean method_43241() {
      return this.field_47801.method_1681();
   }

   @Nullable
   @Override
   public class_9606 method_37081(class_6331 var1) {
      class_9606 var4 = super.method_37081(var1);
      if (var4 != null && this.world.method_29545() == World.field_33048 && var1.method_29545() == World.field_33038) {
         class_1343 var5 = var4.field_48952.method_6214(0.0, -1.0, 0.0);
         return new class_9606(var5, class_1343.field_7335, 90.0F, 0.0F);
      } else {
         return var4;
      }
   }

   @Nullable
   @Override
   public Entity method_37326(class_6331 var1) {
      this.field_47789 = true;
      class_6331 var4 = this.method_43235();
      class_5621 var5 = var4.method_29545();
      if (var5 == World.field_33038 && var1.method_29545() == World.field_33048) {
         this.method_37269();
         this.method_43235().method_28964(this);
         if (!this.field_47777) {
            this.field_47777 = true;
            this.field_47794.method_4156(new class_2161(class_2161.field_10784, !this.field_47783 ? 1.0F : 0.0F));
            this.field_47783 = true;
         }

         return this;
      } else {
         class_1906 var6 = var1.method_43366();
         this.field_47794
            .method_4156(
               new class_7786(
                  var1.method_22572(),
                  var1.method_29545(),
                  class_859.method_3728(var1.method_3133()),
                  this.field_47807.method_39517(),
                  this.field_47807.method_39524(),
                  var1.method_29581(),
                  var1.method_28943(),
                  true
               )
            );
         this.field_47794.method_4156(new class_9275(var6.method_8661(), var6.method_8662()));
         class_8704 var7 = this.field_47801.method_1600();
         var7.method_39976(this);
         var4.method_28964(this);
         this.field_41751 = false;
         class_9606 var8 = this.method_37081(var1);
         if (var8 != null) {
            var4.method_29599().startSection("moving");
            if (var5 == World.field_33048 && var1.method_29545() == World.field_33029) {
               this.field_47793 = this.method_37245();
            } else if (var1.method_29545() == World.field_33038) {
               this.method_43239(var1, new BlockPos(var8.field_48952));
            }

            var4.method_29599().endSection();
            var4.method_29599().startSection("placing");
            this.method_37120(var1);
            var1.method_28989(this);
            this.method_37395(var8.field_48956, var8.field_48953);
            this.method_37195(var8.field_48952.field_7336, var8.field_48952.field_7333, var8.field_48952.field_7334);
            var4.method_29599().endSection();
            this.method_43269(var4);
            this.field_47807.method_39527(var1);
            this.field_47794.method_4156(new class_3727(this.playerAbilities));
            var7.method_39955(this, var1);
            var7.method_39971(this);

            for (class_2250 var10 : this.method_26503()) {
               this.field_47794.method_4156(new class_1661(this.method_37145(), var10));
            }

            this.field_47794.method_4156(new class_6639(1032, BlockPos.field_7306, 0, false));
            this.field_47772 = -1;
            this.field_47810 = -1.0F;
            this.field_47799 = -1;
         }

         return this;
      }
   }

   private void method_43239(class_6331 var1, BlockPos var2) {
      class_2921 var5 = var2.method_6089();

      for (int var6 = -2; var6 <= 2; var6++) {
         for (int var7 = -2; var7 <= 2; var7++) {
            for (int var8 = -1; var8 < 3; var8++) {
               class_2522 var9 = var8 != -1 ? class_4783.field_23184.method_29260() : class_4783.field_23881.method_29260();
               var1.method_29594(var5.method_13364(var2).method_13367(var7, var8, var6), var9);
            }
         }
      }
   }

   @Override
   public Optional<class_8623> method_37111(class_6331 var1, BlockPos var2, boolean var3) {
      Optional var6 = super.method_37111(var1, var2, var3);
      if (!var6.isPresent()) {
         class_9249 var7 = this.world.method_28262(this.field_41764).<class_9249>method_10309(class_3465.field_16975).orElse(class_9249.field_47215);
         Optional var8 = var1.method_28996().method_242(var2, var7);
         if (!var8.isPresent()) {
            field_47780.error("Unable to create a portal, likely target out of worldborder");
         }

         return var8;
      } else {
         return var6;
      }
   }

   private void method_43269(class_6331 var1) {
      class_5621 var4 = var1.method_29545();
      class_5621 var5 = this.world.method_29545();
      class_8807.field_45058.method_38905(this, var4, var5);
      if (var4 == World.field_33029 && var5 == World.field_33048 && this.field_47793 != null) {
         class_8807.field_45049.method_13945(this, this.field_47793);
      }

      if (var5 != World.field_33029) {
         this.field_47793 = null;
      }
   }

   @Override
   public boolean method_37209(class_9359 var1) {
      if (!var1.method_37221()) {
         return !this.method_37221() ? super.method_37209(var1) : false;
      } else {
         return this.method_43276() == this;
      }
   }

   private void method_43272(class_3757 var1) {
      if (var1 != null) {
         class_5029 var4 = var1.method_17413();
         if (var4 != null) {
            this.field_47794.method_4156(var4);
         }
      }
   }

   @Override
   public void method_26467(Entity var1, int var2) {
      super.method_26467(var1, var2);
      this.field_3874.method_18877();
   }

   @Override
   public Either<class_8614, Unit> method_3200(BlockPos var1) {
      Direction var4 = this.world.method_28262(var1).<Direction>method_10313(class_380.field_1543);
      if (this.method_26507() || !this.method_37330()) {
         return Either.left(class_8614.field_44186);
      } else if (!this.world.method_22572().method_40233()) {
         return Either.left(class_8614.field_44185);
      } else if (!this.method_43287(var1, var4)) {
         return Either.left(class_8614.field_44181);
      } else if (!this.method_43245(var1, var4)) {
         this.method_43248(this.world.method_29545(), var1, this.rotationYaw, false, true);
         if (!this.world.method_29602()) {
            if (!this.method_3186()) {
               double var6 = 8.0;
               double var8 = 5.0;
               class_1343 var10 = class_1343.method_6200(var1);
               List var11 = this.world
                  .<class_1173>method_25869(
                     class_1173.class,
                     new class_4092(
                        var10.method_61() - 8.0,
                        var10.method_60() - 5.0,
                        var10.method_62() - 8.0,
                        var10.method_61() + 8.0,
                        var10.method_60() + 5.0,
                        var10.method_62() + 8.0
                     ),
                     var1x -> var1x.method_5202(this)
                  );
               if (!var11.isEmpty()) {
                  return Either.left(class_8614.field_44184);
               }
            }

            Either var5 = super.method_3200(var1).ifRight(var1x -> {
               this.method_3209(class_6234.field_31847);
               class_8807.field_45071.method_7409(this);
            });
            ((class_6331)this.world).method_28928();
            return var5;
         } else {
            return Either.left(class_8614.field_44187);
         }
      } else {
         return Either.left(class_8614.field_44180);
      }
   }

   @Override
   public void method_26470(BlockPos var1) {
      this.method_3166(class_6234.field_31829.method_43790(class_6234.field_31894));
      super.method_26470(var1);
   }

   private boolean method_43287(BlockPos var1, Direction var2) {
      return this.method_43258(var1) || this.method_43258(var1.method_6098(var2.method_1046()));
   }

   private boolean method_43258(BlockPos var1) {
      class_1343 var4 = class_1343.method_6200(var1);
      return Math.abs(this.method_37302() - var4.method_61()) <= 3.0
         && Math.abs(this.method_37309() - var4.method_60()) <= 2.0
         && Math.abs(this.method_37156() - var4.method_62()) <= 3.0;
   }

   private boolean method_43245(BlockPos var1, Direction var2) {
      BlockPos var5 = var1.method_6081();
      return !this.method_3240(var5) || !this.method_3240(var5.method_6098(var2.method_1046()));
   }

   @Override
   public void method_3162(boolean var1, boolean var2) {
      if (this.method_26507()) {
         this.method_43235().method_28945().method_10209(this, new class_8329(this, 2));
      }

      super.method_3162(var1, var2);
      if (this.field_47794 != null) {
         this.field_47794.method_4170(this.method_37302(), this.method_37309(), this.method_37156(), this.rotationYaw, this.rotationPitch);
      }
   }

   @Override
   public boolean startRiding(Entity var1, boolean var2) {
      Entity var5 = this.method_37243();
      if (super.startRiding(var1, var2)) {
         Entity var6 = this.method_37243();
         if (var6 != var5 && this.field_47794 != null) {
            this.field_47794.method_4170(this.method_37302(), this.method_37309(), this.method_37156(), this.rotationYaw, this.rotationPitch);
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public void method_37390() {
      Entity var3 = this.method_37243();
      super.method_37390();
      Entity var4 = this.method_37243();
      if (var4 != var3 && this.field_47794 != null) {
         this.field_47794.method_4170(this.method_37302(), this.method_37309(), this.method_37156(), this.rotationYaw, this.rotationPitch);
      }
   }

   @Override
   public boolean method_37180(DamageSource var1) {
      return super.method_37180(var1) || this.method_43262() || this.playerAbilities.disableDamage && var1 == DamageSource.field_31669;
   }

   @Override
   public void method_37105(double var1, boolean var3, class_2522 var4, BlockPos var5) {
   }

   @Override
   public void method_26598(BlockPos var1) {
      if (!this.method_37221()) {
         super.method_26598(var1);
      }
   }

   public void method_43251(double var1, boolean var3) {
      BlockPos var6 = this.method_37341();
      if (this.world.isBlockLoaded(var6)) {
         super.method_37105(var1, var3, this.world.method_28262(var6), var6);
      }
   }

   @Override
   public void method_3244(class_8398 var1) {
      var1.method_38675(this);
      this.field_47794.method_4156(new class_9402(var1.method_17399()));
   }

   private void method_43278() {
      this.field_47806 = this.field_47806 % 100 + 1;
   }

   @Override
   public OptionalInt method_3152(class_4259 var1) {
      if (var1 != null) {
         if (this.field_3874 != this.field_3869) {
            this.method_3207();
         }

         this.method_43278();
         class_4088 var4 = var1.method_11419(this.field_47806, this.inventory, this);
         if (var4 != null) {
            this.field_47794.method_4156(new class_5149(var4.field_19925, var4.method_18891(), var1.method_19839()));
            var4.method_18888(this);
            this.field_3874 = var4;
            return OptionalInt.of(this.field_47806);
         } else {
            if (this.method_37221()) {
               this.method_3251(new TranslationTextComponent("container.spectatorCantOpen").mergeStyle(TextFormatting.RED), true);
            }

            return OptionalInt.empty();
         }
      } else {
         return OptionalInt.empty();
      }
   }

   @Override
   public void method_3169(int var1, class_2795 var2, int var3, int var4, boolean var5, boolean var6) {
      this.field_47794.method_4156(new class_9381(var1, var2, var3, var4, var5, var6));
   }

   @Override
   public void method_3191(class_4109 var1, class_6867 var2) {
      if (this.field_3874 != this.field_3869) {
         this.method_3207();
      }

      this.method_43278();
      this.field_47794.method_4156(new class_6390(this.field_47806, var2.method_31505(), var1.method_37145()));
      this.field_3874 = new class_7741(this.field_47806, this.inventory, var2, var1);
      this.field_3874.method_18888(this);
   }

   @Override
   public void method_3174(ItemStack var1, Hand var2) {
      class_2451 var5 = var1.method_27960();
      if (var5 == class_4897.field_24698) {
         if (class_1138.method_4993(var1, this.method_37320(), this)) {
            this.field_3874.method_18877();
         }

         this.field_47794.method_4156(new class_5036(var2));
      }
   }

   @Override
   public void method_3193(class_7454 var1) {
      var1.method_33933(true);
      this.method_43272(var1);
   }

   @Override
   public void method_348(class_4088 var1, int var2, ItemStack var3) {
      if (!(var1.method_18878(var2) instanceof class_8725)) {
         if (var1 == this.field_3869) {
            class_8807.field_45062.method_38159(this, this.inventory, var3);
         }

         if (!this.field_47775) {
            this.field_47794.method_4156(new class_5491(var1.field_19925, var2, var3));
         }
      }
   }

   public void method_43264(class_4088 var1) {
      this.method_347(var1, var1.method_18868());
   }

   @Override
   public void method_347(class_4088 var1, class_2831<ItemStack> var2) {
      this.field_47794.method_4156(new class_9860(var1.field_19925, var2));
      this.field_47794.method_4156(new class_5491(-1, -1, this.inventory.method_32424()));
   }

   @Override
   public void method_346(class_4088 var1, int var2, int var3) {
      this.field_47794.method_4156(new class_5403(var1.field_19925, var2, var3));
   }

   @Override
   public void method_3207() {
      this.field_47794.method_4156(new class_5257(this.field_3874.field_19925));
      this.method_43263();
   }

   public void method_43260() {
      if (!this.field_47775) {
         this.field_47794.method_4156(new class_5491(-1, -1, this.inventory.method_32424()));
      }
   }

   public void method_43263() {
      this.field_3874.method_18876(this);
      this.field_3874 = this.field_3869;
   }

   public void method_43249(float var1, float var2, boolean var3, boolean var4) {
      if (this.isPassenger()) {
         if (var1 >= -1.0F && var1 <= 1.0F) {
            this.field_29676 = var1;
         }

         if (var2 >= -1.0F && var2 <= 1.0F) {
            this.field_29673 = var2;
         }

         this.field_29654 = var3;
         this.method_37234(var4);
      }
   }

   @Override
   public void method_3212(class_6676<?> var1, int var2) {
      this.field_47778.method_19274(this, var1, var2);
      this.method_3219().method_4851(var1, this.method_37206(), var1x -> var1x.method_38142(var2));
   }

   @Override
   public void method_3166(class_6676<?> var1) {
      this.field_47778.method_19275(this, var1, 0);
      this.method_3219().method_4851(var1, this.method_37206(), class_8274::method_38143);
   }

   @Override
   public int method_3223(Collection<class_8932<?>> var1) {
      return this.field_47805.method_14039(var1, this);
   }

   @Override
   public void method_3224(Identifier[] var1) {
      ArrayList var4 = Lists.newArrayList();

      for (Identifier var8 : var1) {
         this.field_47801.method_1705().method_23139(var8).ifPresent(var4::add);
      }

      this.method_3223(var4);
   }

   @Override
   public int method_3197(Collection<class_8932<?>> var1) {
      return this.field_47805.method_14038(var1, this);
   }

   @Override
   public void method_3159(int var1) {
      super.method_3159(var1);
      this.field_47772 = -1;
   }

   public void method_43242() {
      this.field_47774 = true;
      this.method_37305();
      if (this.method_26507()) {
         this.method_3162(true, false);
      }
   }

   public boolean method_43252() {
      return this.field_47774;
   }

   public void method_43236() {
      this.field_47810 = -1.0E8F;
   }

   @Override
   public void method_3251(ITextComponent var1, boolean var2) {
      this.field_47794.method_4156(new class_5182(var1, !var2 ? ChatType.CHAT : ChatType.GAME_INFO, Util.NIL_UUID));
   }

   @Override
   public void method_26527() {
      if (!this.field_29668.method_28022() && this.method_26554()) {
         this.field_47794.method_4156(new class_295(this, (byte)9));
         super.method_26527();
      }
   }

   @Override
   public void method_37332(class_6139 var1, class_1343 var2) {
      super.method_37332(var1, var2);
      this.field_47794.method_4156(new class_2436(var1, var2.field_7336, var2.field_7333, var2.field_7334));
   }

   public void method_43282(class_6139 var1, Entity var2, class_6139 var3) {
      class_1343 var6 = var3.method_28187(var2);
      super.method_37332(var1, var6);
      this.field_47794.method_4156(new class_2436(var1, var2, var3));
   }

   public void method_43273(class_9359 var1, boolean var2) {
      if (!var2) {
         if (this.world.method_29537().method_1285(class_291.field_1051) || var1.method_37221()) {
            this.inventory.method_32421(var1.inventory);
            this.field_3840 = var1.field_3840;
            this.field_3862 = var1.field_3862;
            this.field_3842 = var1.field_3842;
            this.method_3215(var1.method_3227());
         }
      } else {
         this.inventory.method_32421(var1.inventory);
         this.method_26456(var1.method_26551());
         this.field_3867 = var1.field_3867;
         this.field_3840 = var1.field_3840;
         this.field_3862 = var1.field_3862;
         this.field_3842 = var1.field_3842;
         this.method_3215(var1.method_3227());
         this.field_41764 = var1.field_41764;
      }

      this.field_3847 = var1.field_3847;
      this.field_3860 = var1.field_3860;
      this.method_37372().method_36633(field_3873, var1.method_37372().<Byte>method_36640(field_3873));
      this.field_47772 = -1;
      this.field_47810 = -1.0F;
      this.field_47799 = -1;
      this.field_47805.method_5087(var1.field_47805);
      this.field_47791.addAll(var1.field_47791);
      this.field_47783 = var1.field_47783;
      this.field_47793 = var1.field_47793;
      this.method_3241(var1.method_3160());
      this.method_3165(var1.method_3171());
   }

   @Override
   public void method_26494(class_2250 var1) {
      super.method_26494(var1);
      this.field_47794.method_4156(new class_1661(this.method_37145(), var1));
      if (var1.method_10339() == Effects.LevitationEffect) {
         this.field_47795 = this.field_41697;
         this.field_47797 = this.method_37245();
      }

      class_8807.field_45059.method_22666(this);
   }

   @Override
   public void method_26552(class_2250 var1, boolean var2) {
      super.method_26552(var1, var2);
      this.field_47794.method_4156(new class_1661(this.method_37145(), var1));
      class_8807.field_45059.method_22666(this);
   }

   @Override
   public void method_26616(class_2250 var1) {
      super.method_26616(var1);
      this.field_47794.method_4156(new class_4671(this.method_37145(), var1.method_10339()));
      if (var1.method_10339() == Effects.LevitationEffect) {
         this.field_47797 = null;
      }

      class_8807.field_45059.method_22666(this);
   }

   @Override
   public void method_37254(double var1, double var3, double var5) {
      this.field_47794.method_4170(var1, var3, var5, this.rotationYaw, this.rotationPitch);
   }

   @Override
   public void method_37195(double var1, double var3, double var5) {
      this.method_37254(var1, var3, var5);
      this.field_47794.method_4165();
   }

   @Override
   public void method_3233(Entity var1) {
      this.method_43235().method_28945().method_10209(this, new class_8329(var1, 4));
   }

   @Override
   public void method_3226(Entity var1) {
      this.method_43235().method_28945().method_10209(this, new class_8329(var1, 5));
   }

   @Override
   public void method_3216() {
      if (this.field_47794 != null) {
         this.field_47794.method_4156(new class_3727(this.playerAbilities));
         this.method_26414();
      }
   }

   public class_6331 method_43235() {
      return (class_6331)this.world;
   }

   @Override
   public void method_3155(GameType var1) {
      this.field_47807.method_39526(var1);
      this.field_47794.method_4156(new class_2161(class_2161.field_10791, (float)var1.getID()));
      if (var1 != GameType.SPECTATOR) {
         this.method_43284(this);
      } else {
         this.method_3157();
         this.method_37390();
      }

      this.method_3216();
      this.method_26478();
   }

   @Override
   public boolean method_37221() {
      return this.field_47807.method_39517() == GameType.SPECTATOR;
   }

   @Override
   public boolean method_3186() {
      return this.field_47807.method_39517() == GameType.CREATIVE;
   }

   @Override
   public void method_26286(ITextComponent var1, UUID var2) {
      this.method_43265(var1, ChatType.SYSTEM, var2);
   }

   public void method_43265(ITextComponent var1, ChatType var2, UUID var3) {
      this.field_47794
         .method_4157(
            new class_5182(var1, var2, var3),
            var4 -> {
               if (!var4.isSuccess() && (var2 == ChatType.GAME_INFO || var2 == ChatType.SYSTEM)) {
                  short var7 = 256;
                  String var8 = var1.getStringTruncated(256);
                  IFormattableTextComponent var9 = new StringTextComponent(var8).mergeStyle(TextFormatting.YELLOW);
                  this.field_47794
                     .method_4156(
                        new class_5182(
                           new TranslationTextComponent("multiplayer.message_not_delivered", var9).mergeStyle(TextFormatting.RED), ChatType.SYSTEM, var3
                        )
                     );
               }
            }
         );
   }

   public String method_43255() {
      String var3 = this.field_47794.field_4867.method_23494().toString();
      var3 = var3.substring(var3.indexOf("/") + 1);
      return var3.substring(0, var3.indexOf(":"));
   }

   public void method_43280(class_8244 var1) {
      this.field_47809 = var1.method_37735();
      this.field_47784 = var1.method_37739();
      this.method_37372().method_36633(field_3873, (byte)var1.method_37736());
      this.method_37372().method_36633(field_3852, (byte)(var1.method_37738() != class_1736.field_8940 ? 1 : 0));
   }

   public class_1803 method_43286() {
      return this.field_47809;
   }

   public void method_43283(String var1, String var2) {
      this.field_47794.method_4156(new class_2289(var1, var2));
   }

   @Override
   public int method_37352() {
      return this.field_47801.method_1685(this.method_3247());
   }

   public void method_43237() {
      this.field_47785 = Util.getMeasuringTimeMs();
   }

   public class_7909 method_43271() {
      return this.field_47778;
   }

   public class_3071 method_43266() {
      return this.field_47805;
   }

   public void method_43275(Entity var1) {
      if (!(var1 instanceof class_704)) {
         this.field_47791.add(var1.method_37145());
      } else {
         this.field_47794.method_4156(new class_3985(var1.method_37145()));
      }
   }

   public void method_43288(Entity var1) {
      this.field_47791.remove(Integer.valueOf(var1.method_37145()));
   }

   @Override
   public void method_26414() {
      if (!this.method_37221()) {
         super.method_26414();
      } else {
         this.method_26517();
         this.method_37333(true);
      }
   }

   public Entity method_43276() {
      return (Entity)(this.field_47802 != null ? this.field_47802 : this);
   }

   public void method_43284(Entity var1) {
      Entity var4 = this.method_43276();
      this.field_47802 = (Entity)(var1 != null ? var1 : this);
      if (var4 != this.field_47802) {
         this.field_47794.method_4156(new class_8101(this.field_47802));
         this.method_37254(this.field_47802.method_37302(), this.field_47802.method_37309(), this.field_47802.method_37156());
      }
   }

   @Override
   public void method_37263() {
      if (!this.field_47789) {
         super.method_37263();
      }
   }

   @Override
   public void method_3158(Entity var1) {
      if (this.field_47807.method_39517() != GameType.SPECTATOR) {
         super.method_3158(var1);
      } else {
         this.method_43284(var1);
      }
   }

   public long method_43250() {
      return this.field_47785;
   }

   @Nullable
   public ITextComponent method_43244() {
      return null;
   }

   @Override
   public void method_26597(Hand var1) {
      super.method_26597(var1);
      this.method_3164();
   }

   public boolean method_43262() {
      return this.field_47789;
   }

   public void method_43281() {
      this.field_47789 = false;
   }

   public class_3362 method_43253() {
      return this.field_47788;
   }

   public void method_43274(class_6331 var1, double var2, double var4, double var6, float var8, float var9) {
      this.method_43284(this);
      this.method_37390();
      if (var1 != this.world) {
         class_6331 var12 = this.method_43235();
         class_1906 var13 = var1.method_43366();
         this.field_47794
            .method_4156(
               new class_7786(
                  var1.method_22572(),
                  var1.method_29545(),
                  class_859.method_3728(var1.method_3133()),
                  this.field_47807.method_39517(),
                  this.field_47807.method_39524(),
                  var1.method_29581(),
                  var1.method_28943(),
                  true
               )
            );
         this.field_47794.method_4156(new class_9275(var13.method_8661(), var13.method_8662()));
         this.field_47801.method_1600().method_39976(this);
         var12.method_28964(this);
         this.field_41751 = false;
         this.method_37144(var2, var4, var6, var8, var9);
         this.method_37120(var1);
         var1.method_28966(this);
         this.method_43269(var12);
         this.field_47794.method_4170(var2, var4, var6, var8, var9);
         this.field_47807.method_39527(var1);
         this.field_47801.method_1600().method_39955(this, var1);
         this.field_47801.method_1600().method_39971(this);
      } else {
         this.field_47794.method_4170(var2, var4, var6, var8, var9);
      }
   }

   @Nullable
   public BlockPos method_43279() {
      return this.field_47779;
   }

   public float method_43270() {
      return this.field_47808;
   }

   public class_5621<World> method_43259() {
      return this.field_47782;
   }

   public boolean method_43268() {
      return this.field_47787;
   }

   public void method_43248(class_5621<World> var1, BlockPos var2, float var3, boolean var4, boolean var5) {
      if (var2 == null) {
         this.field_47779 = null;
         this.field_47782 = World.field_33048;
         this.field_47808 = 0.0F;
         this.field_47787 = false;
      } else {
         boolean var8 = var2.equals(this.field_47779) && var1.equals(this.field_47782);
         if (var5 && !var8) {
            this.method_26286(new TranslationTextComponent("block.minecraft.set_spawn"), Util.NIL_UUID);
         }

         this.field_47779 = var2;
         this.field_47782 = var1;
         this.field_47808 = var3;
         this.field_47787 = var4;
      }
   }

   public void method_43285(class_2034 var1, Packet<?> var2, Packet<?> var3) {
      this.field_47794.method_4156(var3);
      this.field_47794.method_4156(var2);
   }

   public void method_43234(class_2034 var1) {
      if (this.method_37330()) {
         this.field_47794.method_4156(new class_2972(var1.field_10328, var1.field_10327));
      }
   }

   public class_6979 method_43238() {
      return this.field_47803;
   }

   public void method_43261(class_6979 var1) {
      this.field_47803 = var1;
   }

   @Override
   public void method_3172(class_8461 var1, class_562 var2, float var3, float var4) {
      this.field_47794.method_4156(new class_3740(var1, var2, this.method_37302(), this.method_37309(), this.method_37156(), var3, var4));
   }

   @Override
   public Packet<?> method_37142() {
      return new class_5000(this);
   }

   @Override
   public class_91 method_3154(ItemStack var1, boolean var2, boolean var3) {
      class_91 var6 = super.method_3154(var1, var2, var3);
      if (var6 != null) {
         this.world.method_7509(var6);
         ItemStack var7 = var6.method_264();
         if (var3) {
            if (!var7.method_28022()) {
               this.method_3212(class_6234.field_31850.method_43790(var7.method_27960()), var1.method_27997());
            }

            this.method_3209(class_6234.field_31858);
         }

         return var6;
      } else {
         return null;
      }
   }

   @Nullable
   public IChatFilter method_43257() {
      return this.field_47804;
   }
}
