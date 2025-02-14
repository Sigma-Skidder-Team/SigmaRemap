package mapped;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

@Deprecated
public abstract class Class47 implements List {
   private final List field97;

   public Class47(List var1) {
      this.field97 = var1;
   }

   public abstract void method167(Object var1);

   public List method168() {
      return this.field97;
   }

   @Override
   public int size() {
      synchronized (this) {
         return this.field97.size();
      }
   }

   @Override
   public boolean isEmpty() {
      synchronized (this) {
         return this.field97.isEmpty();
      }
   }

   @Override
   public boolean contains(Object var1) {
      synchronized (this) {
         return this.field97.contains(var1);
      }
   }

   @Override
   public Iterator iterator() {
      synchronized (this) {
         return this.listIterator();
      }
   }

   @Override
   public Object[] toArray() {
      synchronized (this) {
         return this.field97.toArray();
      }
   }

   @Override
   public boolean add(Object var1) {
      this.method167(var1);
      synchronized (this) {
         return this.field97.add(var1);
      }
   }

   @Override
   public boolean remove(Object var1) {
      synchronized (this) {
         return this.field97.remove(var1);
      }
   }

   @Override
   public boolean addAll(Collection var1) {
      for (Object var5 : var1) {
         this.method167(var5);
      }

      synchronized (this) {
         return this.field97.addAll(var1);
      }
   }

   @Override
   public boolean addAll(int var1, Collection var2) {
      for (Object var6 : var2) {
         this.method167(var6);
      }

      synchronized (this) {
         return this.field97.addAll(var1, var2);
      }
   }

   @Override
   public void clear() {
      synchronized (this) {
         this.field97.clear();
      }
   }

   @Override
   public Object get(int var1) {
      synchronized (this) {
         return this.field97.get(var1);
      }
   }

   @Override
   public Object set(int var1, Object var2) {
      synchronized (this) {
         return this.field97.set(var1, var2);
      }
   }

   @Override
   public void add(int var1, Object var2) {
      synchronized (this) {
         this.field97.add(var1, var2);
      }
   }

   @Override
   public Object remove(int var1) {
      synchronized (this) {
         return this.field97.remove(var1);
      }
   }

   @Override
   public int indexOf(Object var1) {
      synchronized (this) {
         return this.field97.indexOf(var1);
      }
   }

   @Override
   public int lastIndexOf(Object var1) {
      synchronized (this) {
         return this.field97.lastIndexOf(var1);
      }
   }

   @Override
   public ListIterator listIterator() {
      synchronized (this) {
         return this.field97.listIterator();
      }
   }

   @Override
   public ListIterator listIterator(int var1) {
      synchronized (this) {
         return this.field97.listIterator(var1);
      }
   }

   @Override
   public List subList(int var1, int var2) {
      synchronized (this) {
         return this.field97.subList(var1, var2);
      }
   }

   @Override
   public boolean retainAll(Collection var1) {
      synchronized (this) {
         return this.field97.retainAll(var1);
      }
   }

   @Override
   public boolean removeAll(Collection var1) {
      synchronized (this) {
         return this.field97.removeAll(var1);
      }
   }

   @Override
   public boolean containsAll(Collection var1) {
      synchronized (this) {
         return this.field97.containsAll(var1);
      }
   }

   @Override
   public Object[] toArray(Object[] var1) {
      synchronized (this) {
         return this.field97.<Object>toArray(var1);
      }
   }
}
