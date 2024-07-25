package com.sun.jna;

import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

public class Structure$class_29 extends AbstractCollection<Structure> implements Set<Structure> {
   public Structure[] elements;
   private int count;

   private void ensureCapacity(int size) {
      if (this.elements == null) {
         this.elements = new Structure[size * 3 / 2];
      } else if (this.elements.length < size) {
         Structure[] var4 = new Structure[size * 3 / 2];
         System.arraycopy(this.elements, 0, var4, 0, this.elements.length);
         this.elements = var4;
      }
   }

   public Structure[] getElements() {
      return this.elements;
   }

   @Override
   public int size() {
      return this.count;
   }

   @Override
   public boolean contains(Object o) {
      return this.indexOf((Structure)o) != -1;
   }

   public boolean add(Structure o) {
      if (!this.contains(o)) {
         this.ensureCapacity(this.count + 1);
         this.elements[this.count++] = o;
      }

      return true;
   }

   private int indexOf(Structure s1) {
      for (int s2 = 0; s2 < this.count; s2++) {
         Structure var5 = this.elements[s2];
         if (s1 == var5 || s1.getClass() == var5.getClass() && s1.size() == var5.size() && s1.getPointer().equals(var5.getPointer())) {
            return s2;
         }
      }

      return -1;
   }

   @Override
   public boolean remove(Object o) {
      int var4 = this.indexOf((Structure)o);
      if (var4 != -1) {
         if (--this.count >= 0) {
            this.elements[var4] = this.elements[this.count];
            this.elements[this.count] = null;
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public Iterator<Structure> iterator() {
      Structure[] var3 = new Structure[this.count];
      if (this.count > 0) {
         System.arraycopy(this.elements, 0, var3, 0, this.count);
      }

      return Arrays.<Structure>asList(var3).iterator();
   }
}
