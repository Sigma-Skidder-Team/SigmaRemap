package remapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import java.util.List;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.ITextProperties;

public class class_8889 extends class_266 {
   private final ITextProperties field_45600;
   private final ImmutableList<class_3337> field_45603;
   private class_416 field_45601 = class_416.field_1766;
   private int field_45604;
   private int field_45602;

   public class_8889(ITextComponent var1, List<ITextProperties> var2, ImmutableList<class_3337> var3) {
      super(var1);
      this.field_45600 = ITextProperties.func_240654_a_(var2);
      this.field_45603 = var3;
   }

   @Override
   public String method_1165() {
      return super.method_1165() + ". " + this.field_45600.getString();
   }

   @Override
   public void method_1164(class_1893 var1, int var2, int var3) {
      super.method_1164(var1, var2, var3);
      UnmodifiableIterator var6 = this.field_45603.iterator();

      while (var6.hasNext()) {
         class_3337 var7 = (class_3337)var6.next();
         this.field_45602 = Math.max(this.field_45602, 20 + this.field_948.method_45379(class_3337.method_15308(var7)) + 20);
      }

      int var13 = 5 + this.field_45602 + 5;
      int var14 = var13 * this.field_45603.size();
      this.field_45601 = class_416.method_2075(this.field_948, this.field_45600, var14);
      int var8 = this.field_45601.method_2072() * 9;
      this.field_45604 = (int)((double)var3 / 2.0 - (double)var8 / 2.0);
      int var9 = this.field_45604 + var8 + 18;
      int var10 = (int)((double)var2 / 2.0 - (double)var14 / 2.0);

      for (UnmodifiableIterator var11 = this.field_45603.iterator(); var11.hasNext(); var10 += var13) {
         class_3337 var12 = (class_3337)var11.next();
         this.<class_9521>method_1186(new class_9521(var10, var9, this.field_45602, 20, class_3337.method_15308(var12), class_3337.method_15307(var12)));
      }
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      this.method_1170(0);
      method_9788(var1, this.field_948, this.field_947, this.field_941 / 2, this.field_45604 - 18, -1);
      this.field_45601.method_2067(var1, this.field_941 / 2, this.field_45604);
      super.method_6767(var1, var2, var3, var4);
   }

   @Override
   public boolean method_1178() {
      return false;
   }
}
