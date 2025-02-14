package mapped;

import com.google.common.collect.ImmutableSet;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.registry.Registry;

import javax.annotation.Nullable;

public class VillagerProfession {
   public static final VillagerProfession field36011 = method29461("none", PointOfInterestType.UNEMPLOYED, (SoundEvent)null);
   public static final VillagerProfession field36012 = method29461("armorer", PointOfInterestType.ARMORER, SoundEvents.field27196);
   public static final VillagerProfession field36013 = method29461("butcher", PointOfInterestType.BUTCHER, SoundEvents.field27197);
   public static final VillagerProfession field36014 = method29461("cartographer", PointOfInterestType.CARTOGRAPHER, SoundEvents.field27198);
   public static final VillagerProfession field36015 = method29461("cleric", PointOfInterestType.CLERIC, SoundEvents.field27199);
   public static final VillagerProfession field36016 = method29462(
      "farmer",
      PointOfInterestType.FARMER,
      ImmutableSet.of(Items.field37842, Items.field37841, Items.field38112, Items.field37934),
      ImmutableSet.of(Blocks.FARMLAND),
      SoundEvents.field27200
   );
   public static final VillagerProfession field36017 = method29461("fisherman", PointOfInterestType.FISHERMAN, SoundEvents.field27201);
   public static final VillagerProfession field36018 = method29461("fletcher", PointOfInterestType.FLETCHER, SoundEvents.field27202);
   public static final VillagerProfession field36019 = method29461("leatherworker", PointOfInterestType.LEATHERWORKER, SoundEvents.field27203);
   public static final VillagerProfession field36020 = method29461("librarian", PointOfInterestType.LIBRARIAN, SoundEvents.field27204);
   public static final VillagerProfession field36021 = method29461("mason", PointOfInterestType.MASON, SoundEvents.field27205);
   public static final VillagerProfession field36022 = method29461("nitwit", PointOfInterestType.NITWIT, (SoundEvent)null);
   public static final VillagerProfession field36023 = method29461("shepherd", PointOfInterestType.SHEPHERD, SoundEvents.field27206);
   public static final VillagerProfession field36024 = method29461("toolsmith", PointOfInterestType.TOOLSMITH, SoundEvents.field27207);
   public static final VillagerProfession field36025 = method29461("weaponsmith", PointOfInterestType.WEAPONSMITH, SoundEvents.field27208);
   private final String field36026;
   private final PointOfInterestType field36027;
   private final ImmutableSet<Item> field36028;
   private final ImmutableSet<Block> field36029;
   private final SoundEvent field36030;

   private VillagerProfession(String var1, PointOfInterestType var2, ImmutableSet<Item> var3, ImmutableSet<Block> var4, SoundEvent var5) {
      this.field36026 = var1;
      this.field36027 = var2;
      this.field36028 = var3;
      this.field36029 = var4;
      this.field36030 = var5;
   }

   public PointOfInterestType getPointOfInterest() {
      return this.field36027;
   }

   public ImmutableSet<Item> method29458() {
      return this.field36028;
   }

   public ImmutableSet<Block> method29459() {
      return this.field36029;
   }

   @Nullable
   public SoundEvent method29460() {
      return this.field36030;
   }

   @Override
   public String toString() {
      return this.field36026;
   }

   public static VillagerProfession method29461(String var0, PointOfInterestType var1, SoundEvent var2) {
      return method29462(var0, var1, ImmutableSet.of(), ImmutableSet.of(), var2);
   }

   public static VillagerProfession method29462(String var0, PointOfInterestType var1, ImmutableSet<Item> var2, ImmutableSet<Block> var3, SoundEvent var4) {
      return Registry.<VillagerProfession, VillagerProfession>register(Registry.VILLAGER_PROFESSION, new ResourceLocation(var0), new VillagerProfession(var0, var1, var2, var3, var4));
   }
}
