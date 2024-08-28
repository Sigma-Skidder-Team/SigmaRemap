package mapped;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.EOFException;
import java.io.IOException;
import java.util.*;
import java.util.Map.Entry;

public class Class72 extends Class61 implements Iterable<Class61> {
   private Map<String, Class61> field154;

   public Class72(String var1) {
      this(var1, new LinkedHashMap<>());
   }

   public Class72(String var1, Map<String, Class61> var2) {
      super(var1);
      this.field154 = new LinkedHashMap<String, Class61>(var2);
   }

   public Map<String, Class61> method205() {
      return new LinkedHashMap<String, Class61>(this.field154);
   }

   public void method232(Map<String, Class61> var1) {
      this.field154 = new LinkedHashMap<String, Class61>(var1);
   }

   public boolean method233() {
      return this.field154.isEmpty();
   }

   public boolean method234(String var1) {
      return this.field154.containsKey(var1);
   }

   public <T extends Class61> T method235(String var1) {
      return (T)this.field154.get(var1);
   }

   public <T extends Class61> T method236(T var1) {
      return (T)this.field154.put(var1.method206(), var1);
   }

   public <T extends Class61> T method237(String var1) {
      return (T)this.field154.remove(var1);
   }

   public Set<String> method238() {
      return this.field154.keySet();
   }

   public Collection<Class61> values() {
      return this.field154.values();
   }

   public int method239() {
      return this.field154.size();
   }

   public void method240() {
      this.field154.clear();
   }

   @Override
   public Iterator<Class61> iterator() {
      return this.values().iterator();
   }

   @Override
   public void method203(DataInput var1) throws IOException {
      List<Class61> var4 = new ArrayList();

      Class61 var5;
      try {
         while ((var5 = Class8275.method28920(var1)) != null) {
            var4.add(var5);
         }
      } catch (EOFException var7) {
         throw new IOException("Closing EndTag was not found!");
      }

      for (Class61 var6 : var4) {
         this.<Class61>method236(var6);
      }
   }

   @Override
   public void method204(DataOutput var1) throws IOException {
      for (Class61 var5 : this.field154.values()) {
         Class8275.method28923(var1, var5);
      }

      var1.writeByte(0);
   }

   public Class72 clone() {
      LinkedHashMap var3 = new LinkedHashMap();

      for (Entry var5 : this.field154.entrySet()) {
         var3.put(var5.getKey(), ((Class61)var5.getValue()).clone());
      }

      return new Class72(this.method206(), var3);
   }
}
