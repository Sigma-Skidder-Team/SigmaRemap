package mapped;

import it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public final class Class4521 extends RenderType {
   private static final ObjectOpenCustomHashSet<Class4521> field21821 = new ObjectOpenCustomHashSet(Class2042.field13345);
   private final Class9484 field21822;
   private final int field21823;
   private final Optional<RenderType> field21824;
   private final boolean field21825;
   private Map<ResourceLocation, Class4521> field21826 = new HashMap<ResourceLocation, Class4521>();

   private Class4521(String var1, Class7831 var2, int var3, int var4, boolean var5, boolean var6, Class9484 var7) {
      super(
         var1, var2, var3, var4, var5, var6, () -> Class8861.method32252(Class9484.method36616(var7)), () -> Class8861.method32253(Class9484.method36616(var7))
      );
      this.field21822 = var7;
      this.field21824 = Class9484.method36617(var7) != Class2041.field13342
         ? Optional.<RenderType>empty()
         : Class9484.method36618(var7).method14290().<RenderType>map(var1x -> method14330(var1x, Class9484.method36619(var7)));
      this.field21825 = Class9484.method36617(var7) == Class2041.field13341;
      this.field21823 = Class8589.method30729(super.hashCode(), var7);
   }

   private static Class4521 method14389(String var0, Class7831 var1, int var2, int var3, boolean var4, boolean var5, Class9484 var6) {
      return (Class4521)field21821.addOrGet(new Class4521(var0, var1, var2, var3, var4, var5, var6));
   }

   @Override
   public Optional<RenderType> method14353() {
      return this.field21824;
   }

   @Override
   public boolean method14354() {
      return this.field21825;
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1;
   }

   @Override
   public int hashCode() {
      return this.field21823;
   }

   @Override
   public String toString() {
      return "RenderType[" + this.field21822 + ", " + ']';
   }

   public Class4521 method14390(ResourceLocation var1) {
      if (var1 != null) {
         Optional var4 = Class9484.method36618(this.field21822).method14290();
         if (var4.isPresent()) {
            ResourceLocation var5 = (ResourceLocation)var4.get();
            if (var5 != null) {
               if (!var1.equals(var5)) {
                  Class4521 var6 = this.field21826.get(var1);
                  if (var6 == null) {
                     Class8701 var7 = this.field21822.method36615();
                     var7.method31358(
                        new Class4518(var1, Class9484.method36618(this.field21822).method14291(), Class9484.method36618(this.field21822).method14292())
                     );
                     Class9484 var8 = var7.method31373(this.field21825);
                     var6 = method14347(
                        this.field21734, this.method14351(), this.method14352(), this.method14350(), this.method14355(), this.method14298(), var8
                     );
                     this.field21826.put(var1, var6);
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
   public ResourceLocation method14366() {
      Optional var3 = Class9484.method36618(this.field21822).method14290();
      return var3.isPresent() ? (ResourceLocation)var3.get() : null;
   }

   // $VF: synthetic method
   public static Class4521 method14394(String var0, Class7831 var1, int var2, int var3, boolean var4, boolean var5, Class9484 var6) {
      return method14389(var0, var1, var2, var3, var4, var5, var6);
   }

   // $VF: synthetic method
   public static Class9484 method14395(Class4521 var0) {
      return var0.field21822;
   }

   // $VF: synthetic method
   public static int method14396(Class4521 var0) {
      return var0.field21823;
   }
}
