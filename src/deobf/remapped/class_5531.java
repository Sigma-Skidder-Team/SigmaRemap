package remapped;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class class_5531 extends class_5287 implements Iterable<class_5287> {
   private Map<String, class_5287> field_28207;

   public class_5531(String var1) {
      this(var1, new LinkedHashMap<String, class_5287>());
   }

   public class_5531(String var1, Map<String, class_5287> var2) {
      super(var1);
      this.field_28207 = new LinkedHashMap<String, class_5287>(var2);
   }

   public Map<String, class_5287> method_25124() {
      return new LinkedHashMap<String, class_5287>(this.field_28207);
   }

   public void method_25118(Map<String, class_5287> var1) {
      this.field_28207 = new LinkedHashMap<String, class_5287>(var1);
   }

   public boolean method_25117() {
      return this.field_28207.isEmpty();
   }

   public boolean method_25125(String var1) {
      return this.field_28207.containsKey(var1);
   }

   public <T extends class_5287> T method_25123(String var1) {
      return (T)this.field_28207.get(var1);
   }

   public <T extends class_5287> T method_25122(T var1) {
      return (T)this.field_28207.put(var1.method_24126(), var1);
   }

   public <T extends class_5287> T method_25126(String var1) {
      return (T)this.field_28207.remove(var1);
   }

   public Set<String> method_25121() {
      return this.field_28207.keySet();
   }

   public Collection<class_5287> values() {
      return this.field_28207.values();
   }

   public int method_25120() {
      return this.field_28207.size();
   }

   public void method_25119() {
      this.field_28207.clear();
   }

   @Override
   public Iterator<class_5287> iterator() {
      return this.values().iterator();
   }

   @Override
   public void method_24130(DataInput var1) throws IOException {
      ArrayList var4 = new ArrayList();

      class_5287 var5;
      try {
         while ((var5 = class_4129.method_19186(var1)) != null) {
            var4.add(var5);
         }
      } catch (EOFException var7) {
         throw new IOException("Closing EndTag was not found!");
      }

      for (class_5287 var6 : var4) {
         this.<class_5287>method_25122(var6);
      }
   }

   @Override
   public void method_24127(DataOutput var1) throws IOException {
      for (class_5287 var5 : this.field_28207.values()) {
         class_4129.method_19179(var1, var5);
      }

      var1.writeByte(0);
   }

   public class_5531 clone() {
      LinkedHashMap var3 = new LinkedHashMap();

      for (Entry var5 : this.field_28207.entrySet()) {
         var3.put(var5.getKey(), ((class_5287)var5.getValue()).clone());
      }

      return new class_5531(this.method_24126(), var3);
   }
}
