package mapped;

import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Objects;
import java.util.OptionalInt;
import net.minecraft.util.text.ITextComponent;

public final class Class8115 {
   private static String[] field34872;
   private final String field34873;
   private final Class1938 field34874;
   public final int field34875;
   private final Class8112<ITextComponent> field34876;
   public static final Map<String, Class8115> field34877 = Maps.newHashMap();

   public Class8115(String var1, Class1938 var2, int var3) {
      this.field34873 = var1;
      this.field34874 = var2;
      this.field34875 = var3;
      this.field34876 = new Class8112<ITextComponent>(() -> (ITextComponent)Class1938.method8203(var2).apply(var3, var1));
      field34877.put(var1, this);
   }

   public Class1938 method28099() {
      return this.field34874;
   }

   public int method28100() {
      return this.field34875;
   }

   public String method28101() {
      return this.field34873;
   }

   public ITextComponent method28102() {
      return this.field34876.method28097();
   }

   public OptionalInt method28103() {
      if (this.field34875 >= 48 && this.field34875 <= 57) {
         return OptionalInt.of(this.field34875 - 48);
      } else {
         return this.field34875 >= 320 && this.field34875 <= 329 ? OptionalInt.of(this.field34875 - 320) : OptionalInt.empty();
      }
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         Class8115 var4 = (Class8115)var1;
         return this.field34875 == var4.field34875 && this.field34874 == var4.field34874;
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.field34874, this.field34875);
   }

   @Override
   public String toString() {
      return this.field34873;
   }
}
