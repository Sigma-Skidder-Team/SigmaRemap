package remapped;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

@Deprecated
public class class_9101<E> extends ArrayList<E> {
   private final Object field_46610 = new Object();

   @Override
   public boolean add(E var1) {
      synchronized (this.field_46610) {
         return super.add((E)var1);
      }
   }

   @Override
   public void add(int var1, E var2) {
      synchronized (this.field_46610) {
         super.add(var1, (E)var2);
      }
   }

   @Override
   public boolean addAll(Collection<? extends E> var1) {
      synchronized (this.field_46610) {
         return super.addAll(var1);
      }
   }

   @Override
   public boolean addAll(int var1, Collection<? extends E> var2) {
      synchronized (this.field_46610) {
         return super.addAll(var1, var2);
      }
   }

   @Override
   public void clear() {
      synchronized (this.field_46610) {
         super.clear();
      }
   }

   @Override
   public Object clone() {
      synchronized (this.field_46610) {
         class_9101 var10000;
         try {
            class_9101 var4 = (class_9101)super.clone();
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
      synchronized (this.field_46610) {
         return super.contains(var1);
      }
   }

   @Override
   public void ensureCapacity(int var1) {
      synchronized (this.field_46610) {
         super.ensureCapacity(var1);
      }
   }

   @Override
   public E get(int var1) {
      synchronized (this.field_46610) {
         return super.get(var1);
      }
   }

   @Override
   public int indexOf(Object var1) {
      synchronized (this.field_46610) {
         return super.indexOf(var1);
      }
   }

   @Override
   public int lastIndexOf(Object var1) {
      synchronized (this.field_46610) {
         return super.lastIndexOf(var1);
      }
   }

   @Override
   public E remove(int var1) {
      synchronized (this.field_46610) {
         return super.remove(var1);
      }
   }

   @Override
   public boolean remove(Object var1) {
      synchronized (this.field_46610) {
         return super.remove(var1);
      }
   }

   @Override
   public boolean removeAll(Collection<?> var1) {
      synchronized (this.field_46610) {
         return super.removeAll(var1);
      }
   }

   @Override
   public boolean retainAll(Collection<?> var1) {
      synchronized (this.field_46610) {
         return super.retainAll(var1);
      }
   }

   @Override
   public E set(int var1, E var2) {
      synchronized (this.field_46610) {
         return super.set(var1, (E)var2);
      }
   }

   @Override
   public List<E> subList(int var1, int var2) {
      synchronized (this.field_46610) {
         return super.subList(var1, var2);
      }
   }

   @Override
   public Object[] toArray() {
      synchronized (this.field_46610) {
         return super.toArray();
      }
   }

   @Override
   public <T> T[] toArray(T[] var1) {
      synchronized (this.field_46610) {
         return (T[])super.<Object>toArray(var1);
      }
   }

   @Override
   public void trimToSize() {
      synchronized (this.field_46610) {
         super.trimToSize();
      }
   }

   @Override
   public ListIterator<E> listIterator() {
      return new class_4865(this, 0);
   }

   @Override
   public Iterator<E> iterator() {
      return new class_5216(this);
   }
}
