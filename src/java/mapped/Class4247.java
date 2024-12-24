package mapped;

import com.mentalfrostbyte.jello.resource.TrueTypeFont;
import com.mentalfrostbyte.jello.unmapped.CustomGuiScreen;

import java.util.ArrayList;
import java.util.List;

public class Class4247 extends Class4278 {
    private final List<Class8435> field20603 = new ArrayList<Class8435>();

   public Class4247(CustomGuiScreen var1, String var2, int var3, int var4, int var5, int var6, boolean var7) {
      super(var1, var2, var3, var4, var5, var6, var7);
   }

   public Class4247(CustomGuiScreen var1, String var2, int var3, int var4, int var5, int var6, ColorHelper var7, boolean var8) {
      super(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public Class4247(CustomGuiScreen var1, String var2, int var3, int var4, int var5, int var6, ColorHelper var7, String var8, boolean var9) {
      super(var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   public Class4247(CustomGuiScreen var1, String var2, int var3, int var4, int var5, int var6, ColorHelper var7, String var8, TrueTypeFont var9, boolean var10) {
      super(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
   }

   public final void method13036(Class8435 var1) {
      this.field20603.add(var1);
   }

   public final void method13037() {
      for (Class8435 var4 : this.field20603) {
         var4.method29648(this);
      }
   }
}
