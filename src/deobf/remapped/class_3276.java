package remapped;

import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.Int2IntMap;
import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.Objects;

public final class class_3276 extends class_1974 {
   private IntSet field_16219;
   private IntSet field_16218;
   private Int2IntMap field_16217;

   public class_3276(Typed<?> var1, Schema var2) {
      super(var1, var2);
   }

   @Override
   public boolean method_9080() {
      this.field_16219 = new IntOpenHashSet();
      this.field_16218 = new IntOpenHashSet();
      this.field_16217 = new Int2IntOpenHashMap();

      for (int var3 = 0; var3 < this.field_10006.size(); var3++) {
         Dynamic var4 = this.field_10006.get(var3);
         String var5 = var4.get("Name").asString("");
         if (class_8656.method_39687().containsKey(var5)) {
            boolean var6 = Objects.equals(var4.get("Properties").get("decayable").asString(""), "false");
            this.field_16219.add(var3);
            this.field_16217.put(this.method_9081(var5, var6, 7), var3);
            this.field_10006.set(var3, this.method_14956(var4, var5, var6, 7));
         }

         if (class_8656.method_39686().contains(var5)) {
            this.field_16218.add(var3);
         }
      }

      return this.field_16219.isEmpty() && this.field_16218.isEmpty();
   }

   private Dynamic<?> method_14956(Dynamic<?> var1, String var2, boolean var3, int var4) {
      Dynamic var7 = var1.emptyMap();
      var7 = var7.set("persistent", var7.createString(!var3 ? "false" : "true"));
      var7 = var7.set("distance", var7.createString(Integer.toString(var4)));
      Dynamic var8 = var1.emptyMap();
      var8 = var8.set("Properties", var7);
      return var8.set("Name", var8.createString(var2));
   }

   public boolean method_14961(int var1) {
      return this.field_16218.contains(var1);
   }

   public boolean method_14962(int var1) {
      return this.field_16219.contains(var1);
   }

   private int method_14960(int var1) {
      return !this.method_14961(var1) ? Integer.parseInt(this.field_10006.get(var1).get("Properties").get("distance").asString("")) : 0;
   }

   private void method_14957(int var1, int var2, int var3) {
      Dynamic var6 = this.field_10006.get(var2);
      String var7 = var6.get("Name").asString("");
      boolean var8 = Objects.equals(var6.get("Properties").get("persistent").asString(""), "true");
      int var9 = this.method_9081(var7, var8, var3);
      if (!this.field_16217.containsKey(var9)) {
         int var10 = this.field_10006.size();
         this.field_16219.add(var10);
         this.field_16217.put(var9, var10);
         this.field_10006.add(this.method_14956(var6, var7, var8, var3));
      }

      int var13 = this.field_16217.get(var9);
      if (1 << this.field_10008.method_19757() <= var13) {
         class_4236 var11 = new class_4236(this.field_10008.method_19757() + 1, 4096);

         for (int var12 = 0; var12 < 4096; var12++) {
            var11.method_19760(var12, this.field_10008.method_19759(var12));
         }

         this.field_10008 = var11;
      }

      this.field_10008.method_19760(var1, var13);
   }
}
