package mapped;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class Class8400 {
   private static String[] field36046;
   public final Int2ObjectMap<Class1997> field36047 = new Int2ObjectOpenHashMap(256);
   private final Int2ObjectMap<Class7202> field36048 = new Int2ObjectOpenHashMap(256);
   private final Class280 field36049;

   public Class8400(Class280 var1) {
      this.field36049 = var1;
   }

   public Class1713 method29490(Class3303 var1) {
      return this.method29491(new ItemStack(var1));
   }

   public Class1713 method29491(ItemStack var1) {
      Class7202 var4 = this.method29492(var1);
      return var4 == this.field36049.method1024() && var1.method32107() instanceof Class3292
         ? this.field36049.method1025().method38152(((Class3292)var1.method32107()).method11845().method11579())
         : var4.method22624();
   }

   public Class7202 method29492(ItemStack var1) {
      Class7202 var4 = this.method29493(var1.method32107());
      return var4 != null ? var4 : this.field36049.method1024();
   }

   @Nullable
   public Class7202 method29493(Class3257 var1) {
      return (Class7202)this.field36048.get(method29494(var1));
   }

   private static int method29494(Class3257 var0) {
      return Class3257.method11701(var0);
   }

   public void method29495(Class3257 var1, Class1997 var2) {
      this.field36047.put(method29494(var1), var2);
   }

   public Class280 method29496() {
      return this.field36049;
   }

   public void method29497() {
      this.field36048.clear();
      ObjectIterator var3 = this.field36047.entrySet().iterator();

      while (var3.hasNext()) {
         Entry var4 = (Entry)var3.next();
         this.field36048.put((Integer)var4.getKey(), this.field36049.method1023((Class1997)var4.getValue()));
      }
   }
}
