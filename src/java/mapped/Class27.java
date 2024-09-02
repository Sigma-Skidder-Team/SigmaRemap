package mapped;

import net.minecraft.nbt.INBT;

import java.util.AbstractList;

public abstract class Class27<T extends INBT> extends AbstractList<T> implements INBT {
   public abstract T set(int var1, T var2);

   public abstract void add(int var1, T var2);

   public abstract T remove(int var1);

   public abstract boolean method70(int var1, INBT var2);

   public abstract boolean method71(int var1, INBT var2);

   public abstract byte method72();
}
