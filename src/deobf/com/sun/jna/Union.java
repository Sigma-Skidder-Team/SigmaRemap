package com.sun.jna;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public abstract class Union extends Structure {
   private Structure$class_28 activeField;

   public Union() {
   }

   public Union(Pointer p) {
      super(p);
   }

   public Union(Pointer p, int alignType) {
      super(p, alignType);
   }

   public Union(TypeMapper mapper) {
      super(mapper);
   }

   public Union(Pointer p, int alignType, TypeMapper mapper) {
      super(p, alignType, mapper);
   }

   @Override
   public List<String> getFieldOrder() {
      List list = this.getFieldList();
      ArrayList var4 = new ArrayList(list.size());

      for (Field var6 : list) {
         var4.add(var6.getName());
      }

      return var4;
   }

   public void setType(Class<?> type) {
      this.ensureAllocated();

      for (Structure$class_28 var5 : this.fields().values()) {
         if (var5.type == type) {
            this.activeField = var5;
            return;
         }
      }

      throw new IllegalArgumentException("No field of type " + type + " in " + this);
   }

   public void setType(String fieldName) {
      this.ensureAllocated();
      Structure$class_28 var4 = this.fields().get(fieldName);
      if (var4 != null) {
         this.activeField = var4;
      } else {
         throw new IllegalArgumentException("No field named " + fieldName + " in " + this);
      }
   }

   @Override
   public Object readField(String fieldName) {
      this.ensureAllocated();
      this.setType(fieldName);
      return super.readField(fieldName);
   }

   @Override
   public void writeField(String fieldName) {
      this.ensureAllocated();
      this.setType(fieldName);
      super.writeField(fieldName);
   }

   @Override
   public void writeField(String fieldName, Object value) {
      this.ensureAllocated();
      this.setType(fieldName);
      super.writeField(fieldName, value);
   }

   public Object getTypedValue(Class<?> type) {
      this.ensureAllocated();

      for (Structure$class_28 var5 : this.fields().values()) {
         if (var5.type == type) {
            this.activeField = var5;
            this.read();
            return this.getFieldValue(this.activeField.field);
         }
      }

      throw new IllegalArgumentException("No field of type " + type + " in " + this);
   }

   public Object setTypedValue(Object object) {
      Structure$class_28 var4 = this.findField(object.getClass());
      if (var4 != null) {
         this.activeField = var4;
         this.setFieldValue(var4.field, object);
         return this;
      } else {
         throw new IllegalArgumentException("No field of type " + object.getClass() + " in " + this);
      }
   }

   private Structure$class_28 findField(Class<?> type) {
      this.ensureAllocated();

      for (Structure$class_28 var5 : this.fields().values()) {
         if (var5.type.isAssignableFrom(type)) {
            return var5;
         }
      }

      return null;
   }

   @Override
   public void writeField(Structure$class_28 field) {
      if (field == this.activeField) {
         super.writeField(field);
      }
   }

   @Override
   public Object readField(Structure$class_28 field) {
      return field != this.activeField
            && (Structure.class.isAssignableFrom(field.type) || String.class.isAssignableFrom(field.type) || WString.class.isAssignableFrom(field.type))
         ? null
         : super.readField(field);
   }

   @Override
   public int getNativeAlignment(Class<?> type, Object value, boolean isFirstElement) {
      return super.getNativeAlignment(type, value, true);
   }
}
