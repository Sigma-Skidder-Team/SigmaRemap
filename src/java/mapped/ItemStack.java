package mapped;

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
import java.util.*;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

import net.minecraft.block.BlockState;
import net.minecraft.client.util.Util;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.ITextComponent$Serializer;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextComponentUtils;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.util.text.event.HoverEvent;
import net.minecraft.util.text.event.HoverEvent$Action;
import net.minecraft.util.text.event.HoverEvent$ItemHover;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class ItemStack {
   public static final Codec<ItemStack> field39971 = RecordCodecBuilder.create(
      var0 -> var0.group(
               Registry.ITEM.fieldOf("id").forGetter(var0x -> var0x.field39978),
               Codec.INT.fieldOf("Count").forGetter(var0x -> var0x.field39976),
               CompoundNBT.field79.optionalFieldOf("tag").forGetter(var0x -> Optional.<CompoundNBT>ofNullable(var0x.field39979))
            )
            .apply(var0, ItemStack::new)
   );
   private static final Logger field39972 = LogManager.getLogger();
   public static final ItemStack EMPTY = new ItemStack((Item)null);
   public static final DecimalFormat field39974 = Util.<DecimalFormat>make(
      new DecimalFormat("#.##"), var0 -> var0.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT))
   );
   private static final Style field39975 = Style.EMPTY.setFormatting(TextFormatting.DARK_PURPLE).setItalic(true);
   public int field39976;
   private int field39977;
   /** @deprecated */
   private final Item field39978;
   private CompoundNBT field39979;
   private boolean field39980;
   private Entity field39981;
   private Class9632 field39982;
   private boolean field39983;
   private Class9632 field39984;
   private boolean field39985;

   public ItemStack(Class3303 var1) {
      this(var1, 1);
   }

   private ItemStack(Class3303 var1, int var2, Optional<CompoundNBT> var3) {
      this(var1, var2);
      var3.ifPresent(this::method32148);
   }

   public ItemStack(Class3303 var1, int var2) {
      this.field39978 = var1 != null ? var1.method11581() : null;
      this.field39976 = var2;
      if (this.field39978 != null && this.field39978.method11712()) {
         this.method32118(this.method32117());
      }

      this.method32103();
   }

   private void method32103() {
      this.field39980 = false;
      this.field39980 = this.isEmpty();
   }

   private ItemStack(CompoundNBT var1) {
      this.field39978 = Registry.ITEM.method9184(new ResourceLocation(var1.method126("id")));
      this.field39976 = var1.method120("Count");
      if (var1.method119("tag", 10)) {
         this.field39979 = var1.getCompound("tag");
         this.getItem().method11705(var1);
      }

      if (this.getItem().method11712()) {
         this.method32118(this.method32117());
      }

      this.method32103();
   }

   public static ItemStack method32104(CompoundNBT var0) {
      try {
         return new ItemStack(var0);
      } catch (RuntimeException var4) {
         field39972.debug("Tried to load invalid item: {}", var0, var4);
         return EMPTY;
      }
   }

   public boolean isEmpty() {
      if (this != EMPTY) {
         return this.getItem() != null && this.getItem() != Items.field37222 ? this.field39976 <= 0 : true;
      } else {
         return true;
      }
   }

   public ItemStack method32106(int var1) {
      int var4 = Math.min(var1, this.field39976);
      ItemStack var5 = this.copy();
      var5.method32180(var4);
      this.method32182(var4);
      return var5;
   }

   public Item getItem() {
      return !this.field39980 ? this.field39978 : Items.field37222;
   }

   public ActionResultType method32108(Class5911 var1) {
      PlayerEntity var4 = var1.method18358();
      BlockPos var5 = var1.method18345();
      Class9632 var6 = new Class9632(var1.method18360(), var5, false);
      if (var4 != null && !var4.abilities.field29610 && !this.method32176(var1.method18360().method6817(), var6)) {
         return ActionResultType.field14820;
      } else {
         Item var7 = this.getItem();
         ActionResultType var8 = var7.method11707(var1);
         if (var4 != null && var8.isSuccessOrConsume()) {
            var4.method2913(Class8876.field40098.method172(var7));
         }

         return var8;
      }
   }

   public float method32109(BlockState var1) {
      return this.getItem().method11708(this, var1);
   }

   public Class6794<ItemStack> method32110(World var1, PlayerEntity var2, Hand var3) {
      return this.getItem().method11700(var1, var2, var3);
   }

   public ItemStack method32111(World var1, LivingEntity var2) {
      return this.getItem().method11709(this, var1, var2);
   }

   public CompoundNBT method32112(CompoundNBT var1) {
      ResourceLocation var4 = Registry.ITEM.getKey(this.getItem());
      var1.method109("id", var4 != null ? var4.toString() : "minecraft:air");
      var1.method100("Count", (byte)this.field39976);
      if (this.field39979 != null) {
         var1.put("tag", this.field39979.method79());
      }

      return var1;
   }

   public int method32113() {
      return this.getItem().method11710();
   }

   public boolean method32114() {
      return this.method32113() > 1 && (!this.method32115() || !this.method32116());
   }

   public boolean method32115() {
      if (!this.field39980 && this.getItem().method11711() > 0) {
         CompoundNBT var3 = this.method32142();
         return var3 == null || !var3.method132("Unbreakable");
      } else {
         return false;
      }
   }

   public boolean method32116() {
      return this.method32115() && this.method32117() > 0;
   }

   public int method32117() {
      return this.field39979 != null ? this.field39979.method122("Damage") : 0;
   }

   public void method32118(int var1) {
      this.getOrCreateTag().method102("Damage", Math.max(0, var1));
   }

   public int method32119() {
      return this.getItem().method11711();
   }

   public boolean method32120(int var1, Random var2, ServerPlayerEntity var3) {
      if (!this.method32115()) {
         return false;
      } else {
         if (var1 > 0) {
            int var6 = Class7858.method26311(Class8122.field34917, this);
            int var7 = 0;

            for (int var8 = 0; var6 > 0 && var8 < var1; var8++) {
               if (Class6095.method18833(this, var6, var2)) {
                  var7++;
               }
            }

            var1 -= var7;
            if (var1 <= 0) {
               return false;
            }
         }

         if (var3 != null && var1 != 0) {
            CriteriaTriggers.field44484.method15106(var3, this, this.method32117() + var1);
         }

         int var9 = this.method32117() + var1;
         this.method32118(var9);
         return var9 >= this.method32119();
      }
   }

   public <T extends LivingEntity> void method32121(int var1, T var2, Consumer<T> var3) {
      if (!var2.world.isRemote
         && (!(var2 instanceof PlayerEntity) || !((PlayerEntity)var2).abilities.isCreativeMode)
         && this.method32115()
         && this.method32120(var1, var2.method3013(), !(var2 instanceof ServerPlayerEntity) ? null : (ServerPlayerEntity)var2)) {
         var3.accept(var2);
         Item var6 = this.getItem();
         this.method32182(1);
         if (var2 instanceof PlayerEntity) {
            ((PlayerEntity)var2).method2913(Class8876.field40099.method172(var6));
         }

         this.method32118(0);
      }
   }

   public void method32122(LivingEntity var1, PlayerEntity var2) {
      Item var5 = this.getItem();
      if (var5.method11713(this, var1, var2)) {
         var2.method2913(Class8876.field40098.method172(var5));
      }
   }

   public void method32123(World var1, BlockState var2, BlockPos var3, PlayerEntity var4) {
      Item var7 = this.getItem();
      if (var7.method11714(this, var1, var2, var3, var4)) {
         var4.method2913(Class8876.field40098.method172(var7));
      }
   }

   public boolean method32124(BlockState var1) {
      return this.getItem().method11715(var1);
   }

   public ActionResultType method32125(PlayerEntity var1, LivingEntity var2, Hand var3) {
      return this.getItem().method11716(this, var1, var2, var3);
   }

   public ItemStack copy() {
      if (!this.isEmpty()) {
         ItemStack var3 = new ItemStack(this.getItem(), this.field39976);
         var3.method32178(this.method32177());
         if (this.field39979 != null) {
            var3.field39979 = this.field39979.method79();
         }

         return var3;
      } else {
         return EMPTY;
      }
   }

   public static boolean method32127(ItemStack var0, ItemStack var1) {
      if (var0.isEmpty() && var1.isEmpty()) {
         return true;
      } else if (var0.isEmpty() || var1.isEmpty()) {
         return false;
      } else {
         return var0.field39979 == null && var1.field39979 != null ? false : var0.field39979 == null || var0.field39979.equals(var1.field39979);
      }
   }

   public static boolean method32128(ItemStack var0, ItemStack var1) {
      if (var0.isEmpty() && var1.isEmpty()) {
         return true;
      } else {
         return !var0.isEmpty() && !var1.isEmpty() ? var0.method32129(var1) : false;
      }
   }

   private boolean method32129(ItemStack var1) {
      if (this.field39976 != var1.field39976) {
         return false;
      } else if (this.getItem() == var1.getItem()) {
         return this.field39979 == null && var1.field39979 != null ? false : this.field39979 == null || this.field39979.equals(var1.field39979);
      } else {
         return false;
      }
   }

   public static boolean method32130(ItemStack var0, ItemStack var1) {
      if (var0 == var1) {
         return true;
      } else {
         return !var0.isEmpty() && !var1.isEmpty() ? var0.method32132(var1) : false;
      }
   }

   public static boolean method32131(ItemStack var0, ItemStack var1) {
      if (var0 == var1) {
         return true;
      } else {
         return !var0.isEmpty() && !var1.isEmpty() ? var0.method32133(var1) : false;
      }
   }

   public boolean method32132(ItemStack var1) {
      return !var1.isEmpty() && this.getItem() == var1.getItem();
   }

   public boolean method32133(ItemStack var1) {
      return !this.method32115() ? this.method32132(var1) : !var1.isEmpty() && this.getItem() == var1.getItem();
   }

   public String getTranslationKey() {
      return this.getItem().method11720(this);
   }

   @Override
   public String toString() {
      return this.field39976 + " " + this.getItem();
   }

   public void method32135(World var1, Entity var2, int var3, boolean var4) {
      if (this.field39977 > 0) {
         this.field39977--;
      }

      if (this.getItem() != null) {
         this.getItem().method11724(this, var1, var2, var3, var4);
      }
   }

   public void method32136(World var1, PlayerEntity var2, int var3) {
      var2.method2776(Class8876.field40097.method172(this.getItem()), var3);
      this.getItem().method11725(this, var1, var2);
   }

   public int method32137() {
      return this.getItem().method11728(this);
   }

   public Class2103 method32138() {
      return this.getItem().method11727(this);
   }

   public void method32139(World var1, LivingEntity var2, int var3) {
      this.getItem().method11729(this, var1, var2, var3);
   }

   public boolean method32140() {
      return this.getItem().method11741(this);
   }

   public boolean method32141() {
      return !this.field39980 && this.field39979 != null && !this.field39979.method134();
   }

   @Nullable
   public CompoundNBT method32142() {
      return this.field39979;
   }

   public CompoundNBT getOrCreateTag() {
      if (this.field39979 == null) {
         this.method32148(new CompoundNBT());
      }

      return this.field39979;
   }

   public CompoundNBT method32144(String var1) {
      if (this.field39979 != null && this.field39979.method119(var1, 10)) {
         return this.field39979.getCompound(var1);
      } else {
         CompoundNBT var4 = new CompoundNBT();
         this.setTagInfo(var1, var4);
         return var4;
      }
   }

   @Nullable
   public CompoundNBT method32145(String var1) {
      return this.field39979 != null && this.field39979.method119(var1, 10) ? this.field39979.getCompound(var1) : null;
   }

   public void method32146(String var1) {
      if (this.field39979 != null && this.field39979.contains(var1)) {
         this.field39979.method133(var1);
         if (this.field39979.method134()) {
            this.field39979 = null;
         }
      }
   }

   public ListNBT method32147() {
      return this.field39979 == null ? new ListNBT() : this.field39979.method131("Enchantments", 10);
   }

   public void method32148(CompoundNBT var1) {
      this.field39979 = var1;
      if (this.getItem().method11712()) {
         this.method32118(this.method32117());
      }
   }

   public ITextComponent method32149() {
      CompoundNBT var3 = this.method32145("display");
      if (var3 != null && var3.method119("Name", 8)) {
         try {
            IFormattableTextComponent var4 = ITextComponent$Serializer.func_240643_a_(var3.method126("Name"));
            if (var4 != null) {
               return var4;
            }

            var3.method133("Name");
         } catch (JsonParseException var5) {
            var3.method133("Name");
         }
      }

      return this.getItem().method11731(this);
   }

   public ItemStack method32150(ITextComponent var1) {
      CompoundNBT var4 = this.method32144("display");
      if (var1 == null) {
         var4.method133("Name");
      } else {
         var4.method109("Name", ITextComponent$Serializer.toJson(var1));
      }

      return this;
   }

   public void method32151() {
      CompoundNBT var3 = this.method32145("display");
      if (var3 != null) {
         var3.method133("Name");
         if (var3.method134()) {
            this.method32146("display");
         }
      }

      if (this.field39979 != null && this.field39979.method134()) {
         this.field39979 = null;
      }
   }

   public boolean method32152() {
      CompoundNBT var3 = this.method32145("display");
      return var3 != null && var3.method119("Name", 8);
   }

   public List<ITextComponent> getTooltip(PlayerEntity var1, Class2216 var2) {
      ArrayList var5 = Lists.newArrayList();
      IFormattableTextComponent var6 = new StringTextComponent("").append(this.method32149()).mergeStyle(this.method32160().field12889);
      if (this.method32152()) {
         var6.mergeStyle(TextFormatting.ITALIC);
      }

      var5.add(var6);
      if (!var2.method8944() && !this.method32152() && this.getItem() == Items.field37955) {
         var5.add(new StringTextComponent("#" + Class3316.method11862(this)).mergeStyle(TextFormatting.GRAY));
      }

      int var7 = this.method32155();
      if (method32154(var7, Class2304.field15735)) {
         this.getItem().method11730(this, var1 == null ? null : var1.world, var5, var2);
      }

      if (this.method32141()) {
         if (method32154(var7, Class2304.field15730)) {
            method32157(var5, this.method32147());
         }

         if (this.field39979.method119("display", 10)) {
            CompoundNBT var8 = this.field39979.getCompound("display");
            if (method32154(var7, Class2304.field15736) && var8.method119("color", 99)) {
               if (var2.method8944()) {
                  var5.add(new TranslationTextComponent("item.color", String.format("#%06X", var8.method122("color"))).mergeStyle(TextFormatting.GRAY));
               } else {
                  var5.add(new TranslationTextComponent("item.dyed").mergeStyle(new TextFormatting[]{TextFormatting.GRAY, TextFormatting.ITALIC}));
               }
            }

            if (var8.method117("Lore") == 9) {
               ListNBT var9 = var8.method131("Lore", 8);

               for (int var10 = 0; var10 < var9.size(); var10++) {
                  String var11 = var9.method160(var10);

                  try {
                     IFormattableTextComponent var12 = ITextComponent$Serializer.func_240643_a_(var11);
                     if (var12 != null) {
                        var5.add(TextComponentUtils.func_240648_a_(var12, field39975));
                     }
                  } catch (JsonParseException var21) {
                     var8.method133("Lore");
                  }
               }
            }
         }
      }

      if (method32154(var7, Class2304.field15731)) {
         for (Class2106 var29 : Class2106.values()) {
            Multimap<Class4869, Class9689> var30 = this.method32171(var29);
            if (!var30.isEmpty()) {
               var5.add(StringTextComponent.EMPTY);
               var5.add(new TranslationTextComponent("item.modifiers." + var29.method8775()).mergeStyle(TextFormatting.GRAY));

               for (Entry var14 : var30.entries()) {
                  Class9689 var15 = (Class9689)var14.getValue();
                  double var16 = var15.method37933();
                  boolean var18 = false;
                  if (var1 != null) {
                     if (var15.method37930() == Item.field18733) {
                        var16 += var1.method3087(Attributes.field42110);
                        var16 += (double)Class7858.method26318(this, Class7809.field33505);
                        var18 = true;
                     } else if (var15.method37930() == Item.field18734) {
                        var16 += var1.method3087(Attributes.ATTACK_SPEED);
                        var18 = true;
                     }
                  }

                  double var19;
                  if (var15.method37932() == AttributeModifierOperation.field13353 || var15.method37932() == AttributeModifierOperation.MULTIPLY_TOTAL) {
                     var19 = var16 * 100.0;
                  } else if (((Class4869)var14.getKey()).equals(Attributes.field42107)) {
                     var19 = var16 * 10.0;
                  } else {
                     var19 = var16;
                  }

                  if (var18) {
                     var5.add(
                        new StringTextComponent(" ")
                           .append(
                              new TranslationTextComponent(
                                 "attribute.modifier.equals." + var15.method37932().method8685(),
                                 field39974.format(var19),
                                 new TranslationTextComponent(((Class4869)var14.getKey()).method15032())
                              )
                           )
                           .mergeStyle(TextFormatting.DARK_GREEN)
                     );
                  } else if (var16 > 0.0) {
                     var5.add(
                        new TranslationTextComponent(
                              "attribute.modifier.plus." + var15.method37932().method8685(),
                              field39974.format(var19),
                              new TranslationTextComponent(((Class4869)var14.getKey()).method15032())
                           )
                           .mergeStyle(TextFormatting.BLUE)
                     );
                  } else if (var16 < 0.0) {
                     var19 *= -1.0;
                     var5.add(
                        new TranslationTextComponent(
                              "attribute.modifier.take." + var15.method37932().method8685(),
                              field39974.format(var19),
                              new TranslationTextComponent(((Class4869)var14.getKey()).method15032())
                           )
                           .mergeStyle(TextFormatting.RED)
                     );
                  }
               }
            }
         }
      }

      if (this.method32141()) {
         if (method32154(var7, Class2304.field15732) && this.field39979.method132("Unbreakable")) {
            var5.add(new TranslationTextComponent("item.unbreakable").mergeStyle(TextFormatting.BLUE));
         }

         if (method32154(var7, Class2304.field15733) && this.field39979.method119("CanDestroy", 9)) {
            ListNBT var23 = this.field39979.method131("CanDestroy", 8);
            if (!var23.isEmpty()) {
               var5.add(StringTextComponent.EMPTY);
               var5.add(new TranslationTextComponent("item.canBreak").mergeStyle(TextFormatting.GRAY));

               for (int var26 = 0; var26 < var23.size(); var26++) {
                  var5.addAll(method32158(var23.method160(var26)));
               }
            }
         }

         if (method32154(var7, Class2304.field15734) && this.field39979.method119("CanPlaceOn", 9)) {
            ListNBT var24 = this.field39979.method131("CanPlaceOn", 8);
            if (!var24.isEmpty()) {
               var5.add(StringTextComponent.EMPTY);
               var5.add(new TranslationTextComponent("item.canPlace").mergeStyle(TextFormatting.GRAY));

               for (int var27 = 0; var27 < var24.size(); var27++) {
                  var5.addAll(method32158(var24.method160(var27)));
               }
            }
         }
      }

      if (var2.method8944()) {
         if (this.method32116()) {
            var5.add(new TranslationTextComponent("item.durability", this.method32119() - this.method32117(), this.method32119()));
         }

         var5.add(new StringTextComponent(Registry.ITEM.getKey(this.getItem()).toString()).mergeStyle(TextFormatting.DARK_GRAY));
         if (this.method32141()) {
            var5.add(new TranslationTextComponent("item.nbt_tags", this.field39979.method97().size()).mergeStyle(TextFormatting.DARK_GRAY));
         }
      }

      return var5;
   }

   private static boolean method32154(int var0, Class2304 var1) {
      return (var0 & var1.method9072()) == 0;
   }

   private int method32155() {
      return this.method32141() && this.field39979.method119("HideFlags", 99) ? this.field39979.method122("HideFlags") : 0;
   }

   public void method32156(Class2304 var1) {
      CompoundNBT var4 = this.getOrCreateTag();
      var4.method102("HideFlags", var4.method122("HideFlags") | var1.method9072());
   }

   public static void method32157(List<ITextComponent> var0, ListNBT var1) {
      for (int var4 = 0; var4 < var1.size(); var4++) {
         CompoundNBT var5 = var1.method153(var4);
         Registry.field16073.method9187(ResourceLocation.method8289(var5.method126("id"))).ifPresent(var2 -> var0.add(var2.method18820(var5.method122("lvl"))));
      }
   }

   private static Collection<ITextComponent> method32158(String var0) {
      try {
         Class8268 var3 = new Class8268(new StringReader(var0), true).method28840(true);
         BlockState var4 = var3.method28837();
         ResourceLocation var5 = var3.method28839();
         boolean var6 = var4 != null;
         boolean var7 = var5 != null;
         if (var6 || var7) {
            if (var6) {
               return Lists.newArrayList(new ITextComponent[]{var4.getBlock().method11565().mergeStyle(TextFormatting.DARK_GRAY)});
            }

            ITag<Block> var8 = BlockTags.getCollection().get(var5);
            if (var8 != null) {
               List<Block> var9 = var8.method24918();
               if (!var9.isEmpty()) {
                  return var9.stream()
                     .map(Block::method11565)
                     .map(var0x -> var0x.mergeStyle(TextFormatting.DARK_GRAY))
                     .collect(Collectors.toList());
               }
            }
         }
      } catch (CommandSyntaxException var10) {
      }

      return Lists.newArrayList(new ITextComponent[]{new StringTextComponent("missingno").mergeStyle(TextFormatting.DARK_GRAY)});
   }

   public boolean method32159() {
      return this.getItem().method11732(this);
   }

   public Class1978 method32160() {
      return this.getItem().method11733(this);
   }

   public boolean method32161() {
      return this.getItem().method11734(this) ? !this.method32163() : false;
   }

   public void method32162(Class6069 var1, int var2) {
      this.getOrCreateTag();
      if (!this.field39979.method119("Enchantments", 9)) {
         this.field39979.put("Enchantments", new ListNBT());
      }

      ListNBT var5 = this.field39979.method131("Enchantments", 10);
      CompoundNBT var6 = new CompoundNBT();
      var6.method109("id", String.valueOf(Registry.field16073.getKey(var1)));
      var6.method101("lvl", (short)((byte)var2));
      var5.add(var6);
   }

   public boolean method32163() {
      return this.field39979 != null && this.field39979.method119("Enchantments", 9) ? !this.field39979.method131("Enchantments", 10).isEmpty() : false;
   }

   public void setTagInfo(String var1, Class30 var2) {
      this.getOrCreateTag().put(var1, var2);
   }

   public boolean method32165() {
      return this.field39981 instanceof ItemFrameEntity;
   }

   public void method32166(Entity var1) {
      this.field39981 = var1;
   }

   @Nullable
   public ItemFrameEntity method32167() {
      return !(this.field39981 instanceof ItemFrameEntity) ? null : (ItemFrameEntity)this.method32168();
   }

   @Nullable
   public Entity method32168() {
      return this.field39980 ? null : this.field39981;
   }

   public int method32169() {
      return this.method32141() && this.field39979.method119("RepairCost", 3) ? this.field39979.method122("RepairCost") : 0;
   }

   public void method32170(int var1) {
      this.getOrCreateTag().method102("RepairCost", var1);
   }

   public Multimap<Class4869, Class9689> method32171(Class2106 var1) {
      Multimap<Class4869, Class9689> var4;
      if (this.method32141() && this.field39979.method119("AttributeModifiers", 9)) {
         var4 = HashMultimap.create();
         ListNBT var5 = this.field39979.method131("AttributeModifiers", 10);

         for (int var6 = 0; var6 < var5.size(); var6++) {
            CompoundNBT var7 = var5.method153(var6);
            if (!var7.method119("Slot", 8) || var7.method126("Slot").equals(var1.method8775())) {
               Optional<Class4869> var8 = Registry.field16087.method9187(ResourceLocation.method8289(var7.method126("AttributeName")));
               if (var8.isPresent()) {
                  Class9689 var9 = Class9689.method37935(var7);
                  if (var9 != null && var9.method37930().getLeastSignificantBits() != 0L && var9.method37930().getMostSignificantBits() != 0L) {
                     var4.put(var8.get(), var9);
                  }
               }
            }
         }
      } else {
         var4 = this.getItem().method11740(var1);
      }

      return var4;
   }

   public void method32172(Class4869 var1, Class9689 var2, Class2106 var3) {
      this.getOrCreateTag();
      if (!this.field39979.method119("AttributeModifiers", 9)) {
         this.field39979.put("AttributeModifiers", new ListNBT());
      }

      ListNBT var6 = this.field39979.method131("AttributeModifiers", 10);
      CompoundNBT var7 = var2.method37934();
      var7.method109("AttributeName", Registry.field16087.getKey(var1).toString());
      if (var3 != null) {
         var7.method109("Slot", var3.method8775());
      }

      var6.add(var7);
   }

   public ITextComponent method32173() {
      IFormattableTextComponent var3 = new StringTextComponent("").append(this.method32149());
      if (this.method32152()) {
         var3.mergeStyle(TextFormatting.ITALIC);
      }

      IFormattableTextComponent var4 = TextComponentUtils.wrapWithSquareBrackets(var3);
      if (!this.field39980) {
         var4.mergeStyle(this.method32160().field12889)
            .modifyStyle(var1 -> var1.setHoverEvent(new HoverEvent(HoverEvent$Action.SHOW_ITEM, new HoverEvent$ItemHover(this))));
      }

      return var4;
   }

   private static boolean method32174(Class9632 var0, Class9632 var1) {
      if (var1 == null || var0.method37548() != var1.method37548()) {
         return false;
      } else if (var0.method37549() == null && var1.method37549() == null) {
         return true;
      } else {
         return var0.method37549() != null && var1.method37549() != null
            ? Objects.equals(var0.method37549().write(new CompoundNBT()), var1.method37549().write(new CompoundNBT()))
            : false;
      }
   }

   public boolean method32175(Class8933 var1, Class9632 var2) {
      if (method32174(var2, this.field39982)) {
         return this.field39983;
      } else {
         this.field39982 = var2;
         if (this.method32141() && this.field39979.method119("CanDestroy", 9)) {
            ListNBT var5 = this.field39979.method131("CanDestroy", 8);

            for (int var6 = 0; var6 < var5.size(); var6++) {
               String var7 = var5.method160(var6);

               try {
                  Predicate var8 = Class7505.method24464().parse(new StringReader(var7)).method29657(var1);
                  if (var8.test(var2)) {
                     this.field39983 = true;
                     return true;
                  }
               } catch (CommandSyntaxException var9) {
               }
            }
         }

         this.field39983 = false;
         return false;
      }
   }

   public boolean method32176(Class8933 var1, Class9632 var2) {
      if (method32174(var2, this.field39984)) {
         return this.field39985;
      } else {
         this.field39984 = var2;
         if (this.method32141() && this.field39979.method119("CanPlaceOn", 9)) {
            ListNBT var5 = this.field39979.method131("CanPlaceOn", 8);

            for (int var6 = 0; var6 < var5.size(); var6++) {
               String var7 = var5.method160(var6);

               try {
                  Predicate var8 = Class7505.method24464().parse(new StringReader(var7)).method29657(var1);
                  if (var8.test(var2)) {
                     this.field39985 = true;
                     return true;
                  }
               } catch (CommandSyntaxException var9) {
               }
            }
         }

         this.field39985 = false;
         return false;
      }
   }

   public int method32177() {
      return this.field39977;
   }

   public void method32178(int var1) {
      this.field39977 = var1;
   }

   public int getCount() {
      return !this.field39980 ? this.field39976 : 0;
   }

   public void method32180(int var1) {
      this.field39976 = var1;
      this.method32103();
   }

   public void method32181(int var1) {
      this.method32180(this.field39976 + var1);
   }

   public void method32182(int var1) {
      this.method32181(-var1);
   }

   public void method32183(World var1, LivingEntity var2, int var3) {
      this.getItem().method11704(var1, var2, this, var3);
   }

   public boolean method32184() {
      return this.getItem().method11744();
   }

   public SoundEvent method32185() {
      return this.getItem().method11746();
   }

   public SoundEvent method32186() {
      return this.getItem().method11747();
   }
}
