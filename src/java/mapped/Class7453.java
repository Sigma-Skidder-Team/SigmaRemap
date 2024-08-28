package mapped;

import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.Int2IntMap;
import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.Objects;

public final class Class7453 extends Class7452 {
   private IntSet field32064;
   private IntSet field32065;
   private Int2IntMap field32066;

   public Class7453(Typed<?> var1, Schema var2) {
      super(var1, var2);
   }

   @Override
   public boolean method24095() {
      this.field32064 = new IntOpenHashSet();
      this.field32065 = new IntOpenHashSet();
      this.field32066 = new Int2IntOpenHashMap();

      for (int var3 = 0; var3 < this.field32061.size(); var3++) {
         Dynamic var4 = this.field32061.get(var3);
         String var5 = var4.get("Name").asString("");
         if (Class9508.method36720().containsKey(var5)) {
            boolean var6 = Objects.equals(var4.get("Properties").get("decayable").asString(""), "false");
            this.field32064.add(var3);
            this.field32066.put(this.method24093(var5, var6, 7), var3);
            this.field32061.set(var3, this.method24099(var4, var5, var6, 7));
         }

         if (Class9508.method36721().contains(var5)) {
            this.field32065.add(var3);
         }
      }

      return this.field32064.isEmpty() && this.field32065.isEmpty();
   }

   private Dynamic<?> method24099(Dynamic<?> var1, String var2, boolean var3, int var4) {
      Dynamic var7 = var1.emptyMap();
      var7 = var7.set("persistent", var7.createString(!var3 ? "false" : "true"));
      var7 = var7.set("distance", var7.createString(Integer.toString(var4)));
      Dynamic var8 = var1.emptyMap();
      var8 = var8.set("Properties", var7);
      return var8.set("Name", var8.createString(var2));
   }

   public boolean method24100(int var1) {
      return this.field32065.contains(var1);
   }

   public boolean method24101(int var1) {
      return this.field32064.contains(var1);
   }

   private int method24102(int var1) {
      return !this.method24100(var1) ? Integer.parseInt(this.field32061.get(var1).get("Properties").get("distance").asString("")) : 0;
   }

   private void method24103(int var1, int var2, int var3) {
      Dynamic var6 = this.field32061.get(var2);
      String var7 = var6.get("Name").asString("");
      boolean var8 = Objects.equals(var6.get("Properties").get("persistent").asString(""), "true");
      int var9 = this.method24093(var7, var8, var3);
      if (!this.field32066.containsKey(var9)) {
         int var10 = this.field32061.size();
         this.field32064.add(var10);
         this.field32066.put(var9, var10);
         this.field32061.add(this.method24099(var6, var7, var8, var3));
      }

      int var13 = this.field32066.get(var9);
      if (1 << this.field32063.method29141() <= var13) {
         Class8321 var11 = new Class8321(this.field32063.method29141() + 1, 4096);

         for (int var12 = 0; var12 < 4096; var12++) {
            var11.method29138(var12, this.field32063.method29139(var12));
         }

         this.field32063 = var11;
      }

      this.field32063.method29138(var1, var13);
   }

   // $VF: synthetic method
   public static int method24104(Class7453 var0, int var1) {
      return var0.method24102(var1);
   }

   // $VF: synthetic method
   public static void method24105(Class7453 var0, int var1, int var2, int var3) {
      var0.method24103(var1, var2, var3);
   }
}
