package net.minecraft.entity;

import com.mojang.serialization.Codec;
import net.minecraft.util.IStringSerializable;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public enum EntityClassification implements IStringSerializable {
   MONSTER("monster", 70, false, false, 128),
   CREATURE("creature", 10, true, true, 128),
   AMBIENT("ambient", 15, true, false, 128),
   WATER_CREATURE("water_creature", 5, true, false, 128),
   WATER_AMBIENT("water_ambient", 20, true, false, 64),
   MISC("misc", -1, true, true, 128);

   public static final Codec<EntityClassification> field629 = IStringSerializable.<EntityClassification>createEnumCodec(EntityClassification::values, EntityClassification::method518);
   private static final Map<String, EntityClassification> field630 = Arrays.<EntityClassification>stream(values())
      .collect(Collectors.toMap(EntityClassification::method517, var0 -> (EntityClassification)var0));
   private final int field631;
   private final boolean field632;
   private final boolean field633;
   private final String field634;
   private final int field635 = 32;
   private final int field636;
   private static final EntityClassification[] field637 = new EntityClassification[]{MONSTER, CREATURE, AMBIENT, WATER_CREATURE, WATER_AMBIENT, MISC};

   private EntityClassification(String var3, int var4, boolean var5, boolean var6, int var7) {
      this.field634 = var3;
      this.field631 = var4;
      this.field632 = var5;
      this.field633 = var6;
      this.field636 = var7;
   }

   public String method517() {
      return this.field634;
   }

   @Override
   public String getString() {
      return this.field634;
   }

   public static EntityClassification method518(String var0) {
      return field630.get(var0);
   }

   public int method519() {
      return this.field631;
   }

   public boolean method520() {
      return this.field632;
   }

   public boolean method521() {
      return this.field633;
   }

   public int method522() {
      return this.field636;
   }

   public int method523() {
      return 32;
   }
}
