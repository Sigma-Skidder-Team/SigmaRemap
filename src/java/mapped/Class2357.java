package mapped;

import java.lang.reflect.Field;
import java.util.*;

@Deprecated
public class Class2357<E> extends ArrayList<E> {
   private final Object field16171 = new Object();

   @Override
   public boolean add(E var1) {
      synchronized (this.field16171) {
         return super.add((E)var1);
      }
   }

   @Override
   public void add(int var1, E var2) {
      synchronized (this.field16171) {
         super.add(var1, (E)var2);
      }
   }

   @Override
   public boolean addAll(Collection<? extends E> var1) {
      synchronized (this.field16171) {
         return super.addAll(var1);
      }
   }

   @Override
   public boolean addAll(int var1, Collection<? extends E> var2) {
      synchronized (this.field16171) {
         return super.addAll(var1, var2);
      }
   }

   @Override
   public void clear() {
      synchronized (this.field16171) {
         super.clear();
      }
   }

   @Override
   public Object clone() {
      synchronized (this.field16171) {
         Class2357 var10000;
         try {
            Class2357 var4 = (Class2357)super.clone();
            var4.modCount = 0;
            Field var5 = ArrayList.class.getDeclaredField("elementData");
            var5.setAccessible(true);
            var5.set(var4, Arrays.copyOf((Object[])var5.get(this), this.size()));
            var10000 = var4;
         } catch (ReflectiveOperationException var7) {
            throw new RuntimeException(var7);
         }

         return var10000;
      }
   }

   @Override
   public boolean contains(Object var1) {
      synchronized (this.field16171) {
         return super.contains(var1);
      }
   }

   @Override
   public void ensureCapacity(int var1) {
      synchronized (this.field16171) {
         super.ensureCapacity(var1);
      }
   }

   @Override
   public E get(int var1) {
      synchronized (this.field16171) {
         return super.get(var1);
      }
   }

   @Override
   public int indexOf(Object var1) {
      synchronized (this.field16171) {
         return super.indexOf(var1);
      }
   }

   @Override
   public int lastIndexOf(Object var1) {
      synchronized (this.field16171) {
         return super.lastIndexOf(var1);
      }
   }

   @Override
   public E remove(int var1) {
      synchronized (this.field16171) {
         return super.remove(var1);
      }
   }

   @Override
   public boolean remove(Object var1) {
      synchronized (this.field16171) {
         return super.remove(var1);
      }
   }

   @Override
   public boolean removeAll(Collection<?> var1) {
      synchronized (this.field16171) {
         return super.removeAll(var1);
      }
   }

   @Override
   public boolean retainAll(Collection<?> var1) {
      synchronized (this.field16171) {
         return super.retainAll(var1);
      }
   }

   @Override
   public E set(int var1, E var2) {
      synchronized (this.field16171) {
         return super.set(var1, (E)var2);
      }
   }

   @Override
   public List<E> subList(int var1, int var2) {
      synchronized (this.field16171) {
         return super.subList(var1, var2);
      }
   }

   @Override
   public Object[] toArray() {
      synchronized (this.field16171) {
         return super.toArray();
      }
   }

   @Override
   public <T> T[] toArray(T[] var1) {
      synchronized (this.field16171) {
         return (T[])super.<Object>toArray(var1);
      }
   }

   @Override
   public void trimToSize() {
      synchronized (this.field16171) {
         super.trimToSize();
      }
   }

   @Override
   public ListIterator<E> listIterator() {
      return new Class4547(this, 0);
   }

   @Override
   public Iterator<E> iterator() {
      return new Class4548(this);
   }
}
