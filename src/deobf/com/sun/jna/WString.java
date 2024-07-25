package com.sun.jna;

public final class WString implements CharSequence, Comparable {
   private String string;

   public WString(String s) {
      if (s == null) {
         throw new NullPointerException("String initializer must be non-null");
      } else {
         this.string = s;
      }
   }

   @Override
   public String toString() {
      return this.string;
   }

   @Override
   public boolean equals(Object o) {
      return o instanceof WString && this.toString().equals(o.toString());
   }

   @Override
   public int hashCode() {
      return this.toString().hashCode();
   }

   @Override
   public int compareTo(Object o) {
      return this.toString().compareTo(o.toString());
   }

   @Override
   public int length() {
      return this.toString().length();
   }

   @Override
   public char charAt(int index) {
      return this.toString().charAt(index);
   }

   @Override
   public CharSequence subSequence(int start, int end) {
      return this.toString().subSequence(start, end);
   }
}
