package mapped;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.ArrayList;
import java.util.List;

public class Class8138 {
   private static String[] field35019;
   private Int2ObjectMap<Class9701> field35020 = new Int2ObjectOpenHashMap();
   private List<Class9701> field35021 = new ArrayList<Class9701>();
   private boolean field35022 = false;

   public Class9701 method28213(int var1, Class9701 var2) {
      Class9701 var5 = (Class9701)this.field35020.put(var1, var2);
      this.method28218();
      return var5;
   }

   public Class9701 method28214(int var1) {
      return (Class9701)this.field35020.get(var1);
   }

   public int method28215() {
      return this.field35020.size();
   }

   public Class9701 method28216(int var1) {
      Class9701 var4 = (Class9701)this.field35020.remove(var1);
      if (var4 != null) {
         this.method28218();
      }

      return var4;
   }

   public void method28217() {
      this.field35020.clear();
      this.field35021.clear();
      this.method28218();
   }

   private void method28218() {
      this.field35022 = true;
   }

   public List<Class9701> method28219() {
      if (this.field35022) {
         this.field35021.clear();
         this.field35021.addAll(this.field35020.values());
         this.field35022 = false;
      }

      return this.field35021;
   }
}
