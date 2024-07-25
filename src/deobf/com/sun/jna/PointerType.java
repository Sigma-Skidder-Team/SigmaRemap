package com.sun.jna;

public abstract class PointerType implements NativeMapped {
   private Pointer pointer;

   public PointerType() {
      this.pointer = Pointer.NULL;
   }

   public PointerType(Pointer p) {
      this.pointer = p;
   }

   @Override
   public Class<?> nativeType() {
      return Pointer.class;
   }

   @Override
   public Object toNative() {
      return this.getPointer();
   }

   public Pointer getPointer() {
      return this.pointer;
   }

   public void setPointer(Pointer p) {
      this.pointer = p;
   }

   @Override
   public Object fromNative(Object nativeValue, FromNativeContext context) {
      if (nativeValue == null) {
         return null;
      } else {
         try {
            PointerType var5 = (PointerType)this.getClass().newInstance();
            var5.pointer = (Pointer)nativeValue;
            return var5;
         } catch (InstantiationException var6) {
            throw new IllegalArgumentException("Can't instantiate " + this.getClass());
         } catch (IllegalAccessException var7) {
            throw new IllegalArgumentException("Not allowed to instantiate " + this.getClass());
         }
      }
   }

   @Override
   public int hashCode() {
      return this.pointer != null ? this.pointer.hashCode() : 0;
   }

   @Override
   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (o instanceof PointerType) {
         Pointer var4 = ((PointerType)o).getPointer();
         return this.pointer == null ? var4 == null : this.pointer.equals(var4);
      } else {
         return false;
      }
   }

   @Override
   public String toString() {
      return this.pointer == null ? "NULL" : this.pointer.toString() + " (" + super.toString() + ")";
   }
}
