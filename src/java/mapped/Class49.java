package mapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;

public class Class49<T> implements Iterable<Class9007<T>> {
   private final Registry<T> field100;
   private final Map<T, Class9007<T>> field101 = new IdentityHashMap<T, Class9007<T>>();
   private ITextComponent field102;

   public Class49(Registry<T> var1) {
      this.field100 = var1;
   }

   public boolean method169(T var1) {
      return this.field101.containsKey(var1);
   }

   public Class9007<T> method170(T var1, Class8762 var2) {
      return this.field101.computeIfAbsent((T)var1, var2x -> new Class9007<T>(this, (T)var2x, var2));
   }

   public Registry<T> method171() {
      return this.field100;
   }

   @Override
   public Iterator<Class9007<T>> iterator() {
      return this.field101.values().iterator();
   }

   public Class9007<T> method172(T var1) {
      return this.method170((T)var1, Class8762.field39447);
   }

   public String method173() {
      return "stat_type." + Registry.field16088.method9181(this).toString().replace(':', '.');
   }

   public ITextComponent method174() {
      if (this.field102 == null) {
         this.field102 = new TranslationTextComponent(this.method173());
      }

      return this.field102;
   }
}
