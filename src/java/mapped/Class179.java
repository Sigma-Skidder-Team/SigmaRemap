package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.util.IStringSerializable;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public enum Class179 implements IStringSerializable {
   field623("monster", 70, false, false, 128),
   field624("creature", 10, true, true, 128),
   field625("ambient", 15, true, false, 128),
   field626("water_creature", 5, true, false, 128),
   field627("water_ambient", 20, true, false, 64),
   field628("misc", -1, true, true, 128);

   public static final Codec<Class179> field629 = IStringSerializable.<Class179>method258(Class179::values, Class179::method518);
   private static final Map<String, Class179> field630 = Arrays.<Class179>stream(values())
      .collect(Collectors.toMap(Class179::method517, var0 -> (Class179)var0));
   private final int field631;
   private final boolean field632;
   private final boolean field633;
   private final String field634;
   private final int field635 = 32;
   private final int field636;
   private static final Class179[] field637 = new Class179[]{field623, field624, field625, field626, field627, field628};

   private Class179(String var3, int var4, boolean var5, boolean var6, int var7) {
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

   public static Class179 method518(String var0) {
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
