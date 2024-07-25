package remapped;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import com.google.gson.JsonParseException;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;
import java.util.Random;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.ITextComponent$class_40;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextComponentUtils;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.util.text.event.HoverEvent;
import net.minecraft.util.text.event.HoverEvent$class_48;
import net.minecraft.util.text.event.HoverEvent$class_50;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class ItemStack {
   public static final Codec<ItemStack> field_31201 = RecordCodecBuilder.create(
      var0 -> var0.group(
               class_8669.field_44382.fieldOf("id").forGetter(var0x -> var0x.field_31210),
               Codec.INT.fieldOf("Count").forGetter(var0x -> var0x.field_31206),
               CompoundNBT.field_28974.optionalFieldOf("tag").forGetter(var0x -> Optional.<CompoundNBT>ofNullable(var0x.field_31204))
            )
            .apply(var0, ItemStack::new)
   );
   private static final Logger field_31209 = LogManager.getLogger();
   public static final ItemStack EMPTY = new ItemStack((class_2451)null);
   public static final DecimalFormat field_31202 = Util.<DecimalFormat>method_44659(
      new DecimalFormat("#.##"), var0 -> var0.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT))
   );
   private static final Style field_31216 = Style.EMPTY.setFormatting(TextFormatting.DARK_PURPLE).setItalic(true);
   public int field_31206;
   private int field_31208;
   /** @deprecated */
   private final class_2451 field_31210;
   private CompoundNBT field_31204;
   private boolean field_31214;
   private Entity field_31207;
   private class_9115 field_31211;
   private boolean field_31213;
   private class_9115 field_31212;
   private boolean field_31205;

   public ItemStack(class_8525 var1) {
      this(var1, 1);
   }

   private ItemStack(class_8525 var1, int var2, Optional<CompoundNBT> var3) {
      this(var1, var2);
      var3.ifPresent(this::method_27965);
   }

   public ItemStack(class_8525 var1, int var2) {
      this.field_31210 = var1 != null ? var1.method_10803() : null;
      this.field_31206 = var2;
      if (this.field_31210 != null && this.field_31210.method_11210()) {
         this.method_27999(this.method_28026());
      }

      this.method_27981();
   }

   private void method_27981() {
      this.field_31214 = false;
      this.field_31214 = this.method_28022();
   }

   private ItemStack(CompoundNBT var1) {
      this.field_31210 = class_8669.field_44382.method_39806(new Identifier(var1.method_25965("id")));
      this.field_31206 = var1.method_25950("Count");
      if (var1.contains("tag", 10)) {
         this.field_31204 = var1.getCompound("tag");
         this.method_27960().method_11215(var1);
      }

      if (this.method_27960().method_11210()) {
         this.method_27999(this.method_28026());
      }

      this.method_27981();
   }

   public static ItemStack method_28015(CompoundNBT var0) {
      try {
         return new ItemStack(var0);
      } catch (RuntimeException var4) {
         field_31209.debug("Tried to load invalid item: {}", var0, var4);
         return EMPTY;
      }
   }

   public boolean method_28022() {
      if (this != EMPTY) {
         return this.method_27960() != null && this.method_27960() != class_4897.field_25302 ? this.field_31206 <= 0 : true;
      } else {
         return true;
      }
   }

   public ItemStack method_27953(int var1) {
      int var4 = Math.min(var1, this.field_31206);
      ItemStack var5 = this.method_27973();
      var5.method_28017(var4);
      this.method_27970(var4);
      return var5;
   }

   public class_2451 method_27960() {
      return !this.field_31214 ? this.field_31210 : class_4897.field_25302;
   }

   public class_6910 method_27972(class_4734 var1) {
      PlayerEntity var4 = var1.method_21868();
      BlockPos var5 = var1.method_21858();
      class_9115 var6 = new class_9115(var1.method_21862(), var5, false);
      if (var4 != null && !var4.playerAbilities.allowEdit && !this.method_28027(var1.method_21862().method_29600(), var6)) {
         return class_6910.field_35521;
      } else {
         class_2451 var7 = this.method_27960();
         class_6910 var8 = var7.method_11237(var1);
         if (var4 != null && var8.method_31662()) {
            var4.method_3211(class_6234.field_31907.method_43790(var7));
         }

         return var8;
      }
   }

   public float method_28035(class_2522 var1) {
      return this.method_27960().method_11235(this, var1);
   }

   public class_954<ItemStack> method_28006(World var1, PlayerEntity var2, Hand var3) {
      return this.method_27960().method_11231(var1, var2, var3);
   }

   public ItemStack method_27971(World var1, class_5834 var2) {
      return this.method_27960().method_11242(this, var1, var2);
   }

   public CompoundNBT method_27998(CompoundNBT var1) {
      Identifier var4 = class_8669.field_44382.method_39797(this.method_27960());
      var1.method_25941("id", var4 != null ? var4.toString() : "minecraft:air");
      var1.method_25921("Count", (byte)this.field_31206);
      if (this.field_31204 != null) {
         var1.put("tag", this.field_31204.method_25944());
      }

      return var1;
   }

   public int method_28016() {
      return this.method_27960().method_11245();
   }

   public boolean method_28005() {
      return this.method_28016() > 1 && (!this.method_27959() || !this.method_27995());
   }

   public boolean method_27959() {
      if (!this.field_31214 && this.method_27960().method_11234() > 0) {
         CompoundNBT var3 = this.method_27990();
         return var3 == null || !var3.getBoolean("Unbreakable");
      } else {
         return false;
      }
   }

   public boolean method_27995() {
      return this.method_27959() && this.method_28026() > 0;
   }

   public int method_28026() {
      return this.field_31204 != null ? this.field_31204.method_25947("Damage") : 0;
   }

   public void method_27999(int var1) {
      this.method_27994().method_25931("Damage", Math.max(0, var1));
   }

   public int method_27957() {
      return this.method_27960().method_11234();
   }

   public boolean method_27996(int var1, Random var2, class_9359 var3) {
      if (!this.method_27959()) {
         return false;
      } else {
         if (var1 > 0) {
            int var6 = class_2931.method_13423(class_3668.field_17860, this);
            int var7 = 0;

            for (int var8 = 0; var6 > 0 && var8 < var1; var8++) {
               if (class_8981.method_41175(this, var6, var2)) {
                  var7++;
               }
            }

            var1 -= var7;
            if (var1 <= 0) {
               return false;
            }
         }

         if (var3 != null && var1 != 0) {
            class_8807.field_45042.method_8054(var3, this, this.method_28026() + var1);
         }

         int var9 = this.method_28026() + var1;
         this.method_27999(var9);
         return var9 >= this.method_27957();
      }
   }

   public <T extends class_5834> void method_28003(int var1, T var2, Consumer<T> var3) {
      if (!var2.world.field_33055
         && (!(var2 instanceof PlayerEntity) || !((PlayerEntity)var2).playerAbilities.isCreativeMode)
         && this.method_27959()
         && this.method_27996(var1, var2.method_26594(), !(var2 instanceof class_9359) ? null : (class_9359)var2)) {
         var3.accept(var2);
         class_2451 var6 = this.method_27960();
         this.method_27970(1);
         if (var2 instanceof PlayerEntity) {
            ((PlayerEntity)var2).method_3211(class_6234.field_31879.method_43790(var6));
         }

         this.method_27999(0);
      }
   }

   public void method_27974(class_5834 var1, PlayerEntity var2) {
      class_2451 var5 = this.method_27960();
      if (var5.method_11246(this, var1, var2)) {
         var2.method_3211(class_6234.field_31907.method_43790(var5));
      }
   }

   public void method_27987(World var1, class_2522 var2, BlockPos var3, PlayerEntity var4) {
      class_2451 var7 = this.method_27960();
      if (var7.method_11209(this, var1, var2, var3, var4)) {
         var4.method_3211(class_6234.field_31907.method_43790(var7));
      }
   }

   public boolean method_28025(class_2522 var1) {
      return this.method_27960().method_11222(var1);
   }

   public class_6910 method_28000(PlayerEntity var1, class_5834 var2, Hand var3) {
      return this.method_27960().method_11202(this, var1, var2, var3);
   }

   public ItemStack method_27973() {
      if (!this.method_28022()) {
         ItemStack var3 = new ItemStack(this.method_27960(), this.field_31206);
         var3.method_27968(this.method_27975());
         if (this.field_31204 != null) {
            var3.field_31204 = this.field_31204.method_25944();
         }

         return var3;
      } else {
         return EMPTY;
      }
   }

   public static boolean method_27956(ItemStack var0, ItemStack var1) {
      if (var0.method_28022() && var1.method_28022()) {
         return true;
      } else if (var0.method_28022() || var1.method_28022()) {
         return false;
      } else {
         return var0.field_31204 == null && var1.field_31204 != null ? false : var0.field_31204 == null || var0.field_31204.equals(var1.field_31204);
      }
   }

   public static boolean method_27982(ItemStack var0, ItemStack var1) {
      if (var0.method_28022() && var1.method_28022()) {
         return true;
      } else {
         return !var0.method_28022() && !var1.method_28022() ? var0.method_27988(var1) : false;
      }
   }

   private boolean method_27988(ItemStack var1) {
      if (this.field_31206 != var1.field_31206) {
         return false;
      } else if (this.method_27960() == var1.method_27960()) {
         return this.field_31204 == null && var1.field_31204 != null ? false : this.field_31204 == null || this.field_31204.equals(var1.field_31204);
      } else {
         return false;
      }
   }

   public static boolean method_28019(ItemStack var0, ItemStack var1) {
      if (var0 == var1) {
         return true;
      } else {
         return !var0.method_28022() && !var1.method_28022() ? var0.method_27991(var1) : false;
      }
   }

   public static boolean method_27984(ItemStack var0, ItemStack var1) {
      if (var0 == var1) {
         return true;
      } else {
         return !var0.method_28022() && !var1.method_28022() ? var0.method_28036(var1) : false;
      }
   }

   public boolean method_27991(ItemStack var1) {
      return !var1.method_28022() && this.method_27960() == var1.method_27960();
   }

   public boolean method_28036(ItemStack var1) {
      return !this.method_27959() ? this.method_27991(var1) : !var1.method_28022() && this.method_27960() == var1.method_27960();
   }

   public String method_27958() {
      return this.method_27960().method_11217(this);
   }

   @Override
   public String toString() {
      return this.field_31206 + " " + this.method_27960();
   }

   public void method_28007(World var1, Entity var2, int var3, boolean var4) {
      if (this.field_31208 > 0) {
         this.field_31208--;
      }

      if (this.method_27960() != null) {
         this.method_27960().method_11214(this, var1, var2, var3, var4);
      }
   }

   public void method_27964(World var1, PlayerEntity var2, int var3) {
      var2.method_3212(class_6234.field_31839.method_43790(this.method_27960()), var3);
      this.method_27960().method_11236(this, var1, var2);
   }

   public int method_28004() {
      return this.method_27960().method_11230(this);
   }

   public class_6209 method_27952() {
      return this.method_27960().method_11233(this);
   }

   public void method_27989(World var1, class_5834 var2, int var3) {
      this.method_27960().method_11206(this, var1, var2, var3);
   }

   public boolean method_28028() {
      return this.method_27960().method_11204(this);
   }

   public boolean method_28002() {
      return !this.field_31214 && this.field_31204 != null && !this.field_31204.method_25940();
   }

   @Nullable
   public CompoundNBT method_27990() {
      return this.field_31204;
   }

   public CompoundNBT method_27994() {
      if (this.field_31204 == null) {
         this.method_27965(new CompoundNBT());
      }

      return this.field_31204;
   }

   public CompoundNBT method_27978(String var1) {
      if (this.field_31204 != null && this.field_31204.contains(var1, 10)) {
         return this.field_31204.getCompound(var1);
      } else {
         CompoundNBT var4 = new CompoundNBT();
         this.method_27954(var1, var4);
         return var4;
      }
   }

   @Nullable
   public CompoundNBT method_28021(String var1) {
      return this.field_31204 != null && this.field_31204.contains(var1, 10) ? this.field_31204.getCompound(var1) : null;
   }

   public void method_27976(String var1) {
      if (this.field_31204 != null && this.field_31204.method_25938(var1)) {
         this.field_31204.method_25959(var1);
         if (this.field_31204.method_25940()) {
            this.field_31204 = null;
         }
      }
   }

   public class_3416 method_27983() {
      return this.field_31204 == null ? new class_3416() : this.field_31204.method_25927("Enchantments", 10);
   }

   public void method_27965(CompoundNBT var1) {
      this.field_31204 = var1;
      if (this.method_27960().method_11210()) {
         this.method_27999(this.method_28026());
      }
   }

   public ITextComponent method_28008() {
      CompoundNBT var3 = this.method_28021("display");
      if (var3 != null && var3.contains("Name", 8)) {
         try {
            IFormattableTextComponent var4 = ITextComponent$class_40.func_240643_a_(var3.method_25965("Name"));
            if (var4 != null) {
               return var4;
            }

            var3.method_25959("Name");
         } catch (JsonParseException var5) {
            var3.method_25959("Name");
         }
      }

      return this.method_27960().method_11249(this);
   }

   public ItemStack method_28032(ITextComponent var1) {
      CompoundNBT var4 = this.method_27978("display");
      if (var1 == null) {
         var4.method_25959("Name");
      } else {
         var4.method_25941("Name", ITextComponent$class_40.toJson(var1));
      }

      return this;
   }

   public void method_27967() {
      CompoundNBT var3 = this.method_28021("display");
      if (var3 != null) {
         var3.method_25959("Name");
         if (var3.method_25940()) {
            this.method_27976("display");
         }
      }

      if (this.field_31204 != null && this.field_31204.method_25940()) {
         this.field_31204 = null;
      }
   }

   public boolean method_28018() {
      CompoundNBT var3 = this.method_28021("display");
      return var3 != null && var3.contains("Name", 8);
   }

   public List<ITextComponent> method_28012(PlayerEntity var1, class_4605 var2) {
      ArrayList var5 = Lists.newArrayList();
      IFormattableTextComponent var6 = new StringTextComponent("").append(this.method_28008()).mergeStyle(this.method_28010().field_26118);
      if (this.method_28018()) {
         var6.mergeStyle(TextFormatting.ITALIC);
      }

      var5.add(var6);
      if (!var2.method_21347() && !this.method_28018() && this.method_27960() == class_4897.field_25262) {
         var5.add(new StringTextComponent("#" + class_2143.method_10009(this)).mergeStyle(TextFormatting.GRAY));
      }

      int var7 = this.method_28023();
      if (method_27955(var7, class_8749.field_44785)) {
         this.method_27960().method_11218(this, var1 == null ? null : var1.world, var5, var2);
      }

      if (this.method_28002()) {
         if (method_27955(var7, class_8749.field_44783)) {
            method_28029(var5, this.method_27983());
         }

         if (this.field_31204.contains("display", 10)) {
            CompoundNBT var8 = this.field_31204.getCompound("display");
            if (method_27955(var7, class_8749.field_44784) && var8.contains("color", 99)) {
               if (var2.method_21347()) {
                  var5.add(new TranslationTextComponent("item.color", String.format("#%06X", var8.method_25947("color"))).mergeStyle(TextFormatting.GRAY));
               } else {
                  var5.add(new TranslationTextComponent("item.dyed").mergeStyle(new TextFormatting[]{TextFormatting.GRAY, TextFormatting.ITALIC}));
               }
            }

            if (var8.method_25943("Lore") == 9) {
               class_3416 var9 = var8.method_25927("Lore", 8);

               for (int var10 = 0; var10 < var9.size(); var10++) {
                  String var11 = var9.method_15770(var10);

                  try {
                     IFormattableTextComponent var12 = ITextComponent$class_40.func_240643_a_(var11);
                     if (var12 != null) {
                        var5.add(TextComponentUtils.func_240648_a_(var12, field_31216));
                     }
                  } catch (JsonParseException var21) {
                     var8.method_25959("Lore");
                  }
               }
            }
         }
      }

      if (method_27955(var7, class_8749.field_44786)) {
         for (class_6943 var29 : class_6943.values()) {
            Multimap var30 = this.method_28034(var29);
            if (!var30.isEmpty()) {
               var5.add(StringTextComponent.EMPTY);
               var5.add(new TranslationTextComponent("item.modifiers." + var29.method_31769()).mergeStyle(TextFormatting.GRAY));

               for (Entry var14 : var30.entries()) {
                  class_9343 var15 = (class_9343)var14.getValue();
                  double var16 = var15.method_43123();
                  boolean var18 = false;
                  if (var1 != null) {
                     if (var15.method_43122() == class_2451.field_12168) {
                        var16 += var1.method_26419(class_7331.field_37462);
                        var16 += (double)class_2931.method_13425(this, class_2780.field_13574);
                        var18 = true;
                     } else if (var15.method_43122() == class_2451.field_12167) {
                        var16 += var1.method_26419(class_7331.field_37466);
                        var18 = true;
                     }
                  }

                  double var19;
                  if (var15.method_43121() == class_9342.field_47678 || var15.method_43121() == class_9342.field_47677) {
                     var19 = var16 * 100.0;
                  } else if (((class_225)var14.getKey()).equals(class_7331.field_37463)) {
                     var19 = var16 * 10.0;
                  } else {
                     var19 = var16;
                  }

                  if (var18) {
                     var5.add(
                        new StringTextComponent(" ")
                           .append(
                              new TranslationTextComponent(
                                 "attribute.modifier.equals." + var15.method_43121().method_43115(),
                                 field_31202.format(var19),
                                 new TranslationTextComponent(((class_225)var14.getKey()).method_952())
                              )
                           )
                           .mergeStyle(TextFormatting.DARK_GREEN)
                     );
                  } else if (var16 > 0.0) {
                     var5.add(
                        new TranslationTextComponent(
                              "attribute.modifier.plus." + var15.method_43121().method_43115(),
                              field_31202.format(var19),
                              new TranslationTextComponent(((class_225)var14.getKey()).method_952())
                           )
                           .mergeStyle(TextFormatting.BLUE)
                     );
                  } else if (var16 < 0.0) {
                     var19 *= -1.0;
                     var5.add(
                        new TranslationTextComponent(
                              "attribute.modifier.take." + var15.method_43121().method_43115(),
                              field_31202.format(var19),
                              new TranslationTextComponent(((class_225)var14.getKey()).method_952())
                           )
                           .mergeStyle(TextFormatting.RED)
                     );
                  }
               }
            }
         }
      }

      if (this.method_28002()) {
         if (method_27955(var7, class_8749.field_44789) && this.field_31204.getBoolean("Unbreakable")) {
            var5.add(new TranslationTextComponent("item.unbreakable").mergeStyle(TextFormatting.BLUE));
         }

         if (method_27955(var7, class_8749.field_44791) && this.field_31204.contains("CanDestroy", 9)) {
            class_3416 var23 = this.field_31204.method_25927("CanDestroy", 8);
            if (!var23.isEmpty()) {
               var5.add(StringTextComponent.EMPTY);
               var5.add(new TranslationTextComponent("item.canBreak").mergeStyle(TextFormatting.GRAY));

               for (int var26 = 0; var26 < var23.size(); var26++) {
                  var5.addAll(method_27963(var23.method_15770(var26)));
               }
            }
         }

         if (method_27955(var7, class_8749.field_44790) && this.field_31204.contains("CanPlaceOn", 9)) {
            class_3416 var24 = this.field_31204.method_25927("CanPlaceOn", 8);
            if (!var24.isEmpty()) {
               var5.add(StringTextComponent.EMPTY);
               var5.add(new TranslationTextComponent("item.canPlace").mergeStyle(TextFormatting.GRAY));

               for (int var27 = 0; var27 < var24.size(); var27++) {
                  var5.addAll(method_27963(var24.method_15770(var27)));
               }
            }
         }
      }

      if (var2.method_21347()) {
         if (this.method_27995()) {
            var5.add(new TranslationTextComponent("item.durability", this.method_27957() - this.method_28026(), this.method_27957()));
         }

         var5.add(new StringTextComponent(class_8669.field_44382.method_39797(this.method_27960()).toString()).mergeStyle(TextFormatting.DARK_GRAY));
         if (this.method_28002()) {
            var5.add(new TranslationTextComponent("item.nbt_tags", this.field_31204.method_25952().size()).mergeStyle(TextFormatting.DARK_GRAY));
         }
      }

      return var5;
   }

   private static boolean method_27955(int var0, class_8749 var1) {
      return (var0 & var1.method_40158()) == 0;
   }

   private int method_28023() {
      return this.method_28002() && this.field_31204.contains("HideFlags", 99) ? this.field_31204.method_25947("HideFlags") : 0;
   }

   public void method_27980(class_8749 var1) {
      CompoundNBT var4 = this.method_27994();
      var4.method_25931("HideFlags", var4.method_25947("HideFlags") | var1.method_40158());
   }

   public static void method_28029(List<ITextComponent> var0, class_3416 var1) {
      for (int var4 = 0; var4 < var1.size(); var4++) {
         CompoundNBT var5 = var1.method_15764(var4);
         class_8669.field_44445
            .method_39794(Identifier.method_21455(var5.method_25965("id")))
            .ifPresent(var2 -> var0.add(var2.method_20423(var5.method_25947("lvl"))));
      }
   }

   private static Collection<ITextComponent> method_27963(String var0) {
      try {
         class_4104 var3 = new class_4104(new StringReader(var0), true).method_18973(true);
         class_2522 var4 = var3.method_18967();
         Identifier var5 = var3.method_18971();
         boolean var6 = var4 != null;
         boolean var7 = var5 != null;
         if (var6 || var7) {
            if (var6) {
               return Lists.newArrayList(new ITextComponent[]{var4.method_8360().method_29307().mergeStyle(TextFormatting.DARK_GRAY)});
            }

            class_2307 var8 = class_2351.method_10755().method_43140(var5);
            if (var8 != null) {
               List var9 = var8.method_10608();
               if (!var9.isEmpty()) {
                  return var9.stream()
                     .<IFormattableTextComponent>map(class_6414::method_29307)
                     .<ITextComponent>map(var0x -> var0x.mergeStyle(TextFormatting.DARK_GRAY))
                     .collect(Collectors.<ITextComponent>toList());
               }
            }
         }
      } catch (CommandSyntaxException var10) {
      }

      return Lists.newArrayList(new ITextComponent[]{new StringTextComponent("missingno").mergeStyle(TextFormatting.DARK_GRAY)});
   }

   public boolean method_27977() {
      return this.method_27960().method_11252(this);
   }

   public class_5053 method_28010() {
      return this.method_27960().method_11240(this);
   }

   public boolean method_27985() {
      return this.method_27960().method_11248(this) ? !this.method_28020() : false;
   }

   public void method_28031(class_4382 var1, int var2) {
      this.method_27994();
      if (!this.field_31204.contains("Enchantments", 9)) {
         this.field_31204.put("Enchantments", new class_3416());
      }

      class_3416 var5 = this.field_31204.method_25927("Enchantments", 10);
      CompoundNBT var6 = new CompoundNBT();
      var6.method_25941("id", String.valueOf(class_8669.field_44445.method_39797(var1)));
      var6.method_25958("lvl", (short)((byte)var2));
      var5.add(var6);
   }

   public boolean method_28020() {
      return this.field_31204 != null && this.field_31204.contains("Enchantments", 9)
         ? !this.field_31204.method_25927("Enchantments", 10).isEmpty()
         : false;
   }

   public void method_27954(String var1, class_8406 var2) {
      this.method_27994().put(var1, var2);
   }

   public boolean method_27966() {
      return this.field_31207 instanceof class_7451;
   }

   public void method_27992(Entity var1) {
      this.field_31207 = var1;
   }

   @Nullable
   public class_7451 method_27961() {
      return !(this.field_31207 instanceof class_7451) ? null : (class_7451)this.method_27993();
   }

   @Nullable
   public Entity method_27993() {
      return this.field_31214 ? null : this.field_31207;
   }

   public int method_27969() {
      return this.method_28002() && this.field_31204.contains("RepairCost", 3) ? this.field_31204.method_25947("RepairCost") : 0;
   }

   public void method_27986(int var1) {
      this.method_27994().method_25931("RepairCost", var1);
   }

   public Multimap<class_225, class_9343> method_28034(class_6943 var1) {
      Object var4;
      if (this.method_28002() && this.field_31204.contains("AttributeModifiers", 9)) {
         var4 = HashMultimap.create();
         class_3416 var5 = this.field_31204.method_25927("AttributeModifiers", 10);

         for (int var6 = 0; var6 < var5.size(); var6++) {
            CompoundNBT var7 = var5.method_15764(var6);
            if (!var7.contains("Slot", 8) || var7.method_25965("Slot").equals(var1.method_31769())) {
               Optional var8 = class_8669.field_44403.method_39794(Identifier.method_21455(var7.method_25965("AttributeName")));
               if (var8.isPresent()) {
                  class_9343 var9 = class_9343.method_43120(var7);
                  if (var9 != null && var9.method_43122().getLeastSignificantBits() != 0L && var9.method_43122().getMostSignificantBits() != 0L) {
                     var4.put(var8.get(), var9);
                  }
               }
            }
         }
      } else {
         var4 = this.method_27960().method_11205(var1);
      }

      return (Multimap<class_225, class_9343>)var4;
   }

   public void method_27962(class_225 var1, class_9343 var2, class_6943 var3) {
      this.method_27994();
      if (!this.field_31204.contains("AttributeModifiers", 9)) {
         this.field_31204.put("AttributeModifiers", new class_3416());
      }

      class_3416 var6 = this.field_31204.method_25927("AttributeModifiers", 10);
      CompoundNBT var7 = var2.method_43119();
      var7.method_25941("AttributeName", class_8669.field_44403.method_39797(var1).toString());
      if (var3 != null) {
         var7.method_25941("Slot", var3.method_31769());
      }

      var6.add(var7);
   }

   public ITextComponent method_28001() {
      IFormattableTextComponent var3 = new StringTextComponent("").append(this.method_28008());
      if (this.method_28018()) {
         var3.mergeStyle(TextFormatting.ITALIC);
      }

      IFormattableTextComponent var4 = TextComponentUtils.wrapWithSquareBrackets(var3);
      if (!this.field_31214) {
         var4.mergeStyle(this.method_28010().field_26118)
            .modifyStyle(var1 -> var1.setHoverEvent(new HoverEvent(HoverEvent$class_48.SHOW_ITEM, new HoverEvent$class_50(this))));
      }

      return var4;
   }

   private static boolean method_28024(class_9115 var0, class_9115 var1) {
      if (var1 == null || var0.method_41968() != var1.method_41968()) {
         return false;
      } else if (var0.method_41967() == null && var1.method_41967() == null) {
         return true;
      } else {
         return var0.method_41967() != null && var1.method_41967() != null
            ? Objects.equals(var0.method_41967().method_17396(new CompoundNBT()), var1.method_41967().method_17396(new CompoundNBT()))
            : false;
      }
   }

   public boolean method_28009(ITagCollectionSupplier var1, class_9115 var2) {
      if (method_28024(var2, this.field_31211)) {
         return this.field_31213;
      } else {
         this.field_31211 = var2;
         if (this.method_28002() && this.field_31204.contains("CanDestroy", 9)) {
            class_3416 var5 = this.field_31204.method_25927("CanDestroy", 8);

            for (int var6 = 0; var6 < var5.size(); var6++) {
               String var7 = var5.method_15770(var6);

               try {
                  Predicate var8 = class_2061.method_9620().parse(new StringReader(var7)).method_21239(var1);
                  if (var8.test(var2)) {
                     this.field_31213 = true;
                     return true;
                  }
               } catch (CommandSyntaxException var9) {
               }
            }
         }

         this.field_31213 = false;
         return false;
      }
   }

   public boolean method_28027(ITagCollectionSupplier var1, class_9115 var2) {
      if (method_28024(var2, this.field_31212)) {
         return this.field_31205;
      } else {
         this.field_31212 = var2;
         if (this.method_28002() && this.field_31204.contains("CanPlaceOn", 9)) {
            class_3416 var5 = this.field_31204.method_25927("CanPlaceOn", 8);

            for (int var6 = 0; var6 < var5.size(); var6++) {
               String var7 = var5.method_15770(var6);

               try {
                  Predicate var8 = class_2061.method_9620().parse(new StringReader(var7)).method_21239(var1);
                  if (var8.test(var2)) {
                     this.field_31205 = true;
                     return true;
                  }
               } catch (CommandSyntaxException var9) {
               }
            }
         }

         this.field_31205 = false;
         return false;
      }
   }

   public int method_27975() {
      return this.field_31208;
   }

   public void method_27968(int var1) {
      this.field_31208 = var1;
   }

   public int method_27997() {
      return !this.field_31214 ? this.field_31206 : 0;
   }

   public void method_28017(int var1) {
      this.field_31206 = var1;
      this.method_27981();
   }

   public void method_28030(int var1) {
      this.method_28017(this.field_31206 + var1);
   }

   public void method_27970(int var1) {
      this.method_28030(-var1);
   }

   public void method_28033(World var1, class_5834 var2, int var3) {
      this.method_27960().method_11228(var1, var2, this, var3);
   }

   public boolean method_28013() {
      return this.method_27960().method_11247();
   }

   public class_8461 method_28011() {
      return this.method_27960().method_11253();
   }

   public class_8461 method_27979() {
      return this.method_27960().method_11243();
   }
}
