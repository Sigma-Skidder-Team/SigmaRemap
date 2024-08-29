package mapped;

import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import java.util.BitSet;
import java.util.List;
import java.util.Set;

public class Class7457 {
   private static String[] field32070;
   public static final Class7457 field32071 = new Class7456();
   private final Set<RenderType> field32072 = new ObjectArraySet();
   private final Set<RenderType> field32073 = new ObjectArraySet();
   private boolean field32074 = true;
   private final List<TileEntity> field32075 = Lists.newArrayList();
   private Class9045 field32076 = new Class9045();
   private Class9244 field32077;
   private BitSet[] field32078 = new BitSet[RenderType.field21819.length];

   public boolean method24109() {
      return this.field32074;
   }

   public boolean method24110(RenderType var1) {
      return !this.field32072.contains(var1);
   }

   public List<TileEntity> method24111() {
      return this.field32075;
   }

   public boolean method24107(Direction var1, Direction var2) {
      return !Class5184.field23483.isEnabled() ? this.field32076.method33635(var1, var2) : true;
   }

   public BitSet method24112(RenderType var1) {
      return this.field32078[var1.method14297()];
   }

   public void method24108(RenderType var1, BitSet var2) {
      this.field32078[var1.method14297()] = var2;
   }

   public boolean method24113(RenderType var1) {
      return this.field32073.contains(var1);
   }

   public void method24114(RenderType var1) {
      this.field32073.add(var1);
   }

   public void method24115(RenderType var1) {
      this.field32072.add(var1);
   }

   // $VF: synthetic method
   public static Set<RenderType> method24116(Class7457 var0) {
      return var0.field32073;
   }

   // $VF: synthetic method
   public static boolean method24117(Class7457 var0, boolean var1) {
      return var0.field32074 = var1;
   }

   // $VF: synthetic method
   public static Set method24118(Class7457 var0) {
      return var0.field32072;
   }

   // $VF: synthetic method
   public static Class9244 method24119(Class7457 var0, Class9244 var1) {
      return var0.field32077 = var1;
   }

   // $VF: synthetic method
   public static Class9045 method24120(Class7457 var0, Class9045 var1) {
      return var0.field32076 = var1;
   }

   // $VF: synthetic method
   public static List method24121(Class7457 var0) {
      return var0.field32075;
   }

   // $VF: synthetic method
   public static Class9244 method24122(Class7457 var0) {
      return var0.field32077;
   }
}
