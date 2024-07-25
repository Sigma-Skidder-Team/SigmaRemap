package remapped;

import it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public final class class_7634 extends class_3581 {
   private static final ObjectOpenCustomHashSet<class_7634> field_38842 = new ObjectOpenCustomHashSet(class_3093.field_15396);
   private final class_8570 field_38839;
   private final int field_38838;
   private final Optional<class_3581> field_38837;
   private final boolean field_38841;
   private Map<Identifier, class_7634> field_38840 = new HashMap<Identifier, class_7634>();

   private class_7634(String var1, class_2868 var2, int var3, int var4, boolean var5, boolean var6, class_8570 var7) {
      super(
         var1,
         var2,
         var3,
         var4,
         var5,
         var6,
         () -> class_6151.method_28221(class_8570.method_39413(var7)),
         () -> class_6151.method_28226(class_8570.method_39413(var7))
      );
      this.field_38839 = var7;
      this.field_38837 = class_8570.method_39414(var7) != class_3409.field_16787
         ? Optional.<class_3581>empty()
         : class_8570.method_39409(var7).method_17452().<class_3581>map(var1x -> method_16741(var1x, class_8570.method_39410(var7)));
      this.field_38841 = class_8570.method_39414(var7) == class_3409.field_16786;
      this.field_38838 = class_5129.method_23522(super.hashCode(), var7);
   }

   private static class_7634 method_34593(String var0, class_2868 var1, int var2, int var3, boolean var4, boolean var5, class_8570 var6) {
      return (class_7634)field_38842.addOrGet(new class_7634(var0, var1, var2, var3, var4, var5, var6));
   }

   @Override
   public Optional<class_3581> method_16772() {
      return this.field_38837;
   }

   @Override
   public boolean method_16709() {
      return this.field_38841;
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1;
   }

   @Override
   public int hashCode() {
      return this.field_38838;
   }

   @Override
   public String toString() {
      return "RenderType[" + this.field_38839 + ", " + ']';
   }

   public class_7634 method_34592(Identifier var1) {
      if (var1 != null) {
         Optional var4 = class_8570.method_39409(this.field_38839).method_17452();
         if (var4.isPresent()) {
            Identifier var5 = (Identifier)var4.get();
            if (var5 != null) {
               if (!var1.equals(var5)) {
                  class_7634 var6 = this.field_38840.get(var1);
                  if (var6 == null) {
                     class_5604 var7 = this.field_38839.method_39415();
                     var7.method_25435(
                        new class_3771(var1, class_8570.method_39409(this.field_38839).method_17453(), class_8570.method_39409(this.field_38839).method_17451())
                     );
                     class_8570 var8 = var7.method_25436(this.field_38841);
                     var6 = method_16761(
                        this.field_27283, this.method_16718(), this.method_16764(), this.method_16742(), this.method_16713(), this.method_16710(), var8
                     );
                     this.field_38840.put(var1, var6);
                  }

                  return var6;
               } else {
                  return this;
               }
            } else {
               return this;
            }
         } else {
            return this;
         }
      } else {
         return this;
      }
   }

   @Override
   public Identifier method_16758() {
      Optional var3 = class_8570.method_39409(this.field_38839).method_17452();
      return var3.isPresent() ? (Identifier)var3.get() : null;
   }
}
