package remapped;

import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Objects;
import java.util.OptionalInt;
import net.minecraft.util.text.ITextComponent;

public final class class_3654 {
   private static String[] field_17803;
   private final String field_17799;
   private final class_8863 field_17798;
   public final int field_17800;
   private final class_3642<ITextComponent> field_17802;
   public static final Map<String, class_3654> field_17801 = Maps.newHashMap();

   private class_3654(String var1, class_8863 var2, int var3) {
      this.field_17799 = var1;
      this.field_17798 = var2;
      this.field_17800 = var3;
      this.field_17802 = new class_3642<ITextComponent>(() -> (ITextComponent)class_8863.method_40761(var2).apply(var3, var1));
      field_17801.put(var1, this);
   }

   public class_8863 method_16990() {
      return this.field_17798;
   }

   public int method_16988() {
      return this.field_17800;
   }

   public String method_16985() {
      return this.field_17799;
   }

   public ITextComponent method_16989() {
      return this.field_17802.method_16960();
   }

   public OptionalInt method_16987() {
      if (this.field_17800 >= 48 && this.field_17800 <= 57) {
         return OptionalInt.of(this.field_17800 - 48);
      } else {
         return this.field_17800 >= 320 && this.field_17800 <= 329 ? OptionalInt.of(this.field_17800 - 320) : OptionalInt.empty();
      }
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         class_3654 var4 = (class_3654)var1;
         return this.field_17800 == var4.field_17800 && this.field_17798 == var4.field_17798;
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.field_17798, this.field_17800);
   }

   @Override
   public String toString() {
      return this.field_17799;
   }
}
