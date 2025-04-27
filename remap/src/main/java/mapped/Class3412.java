// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;
import java.util.List;

public class Class3412 implements Class3398
{
    public final /* synthetic */ Class7353 field16140;
    
    public Class3412(final Class7353 field16140) {
        this.field16140 = field16140;
    }
    
    @Override
    public Class7576 method10839(final Object o) {
        final Class<?> componentType = o.getClass().getComponentType();
        if (Byte.TYPE == componentType) {
            return this.field16140.method22576(Class8542.field35876, this.method10840(o), Class227.field802);
        }
        if (Short.TYPE == componentType) {
            return this.field16140.method22576(Class8542.field35876, this.method10841(o), Class227.field802);
        }
        if (Integer.TYPE == componentType) {
            return this.field16140.method22576(Class8542.field35876, this.method10842(o), Class227.field802);
        }
        if (Long.TYPE == componentType) {
            return this.field16140.method22576(Class8542.field35876, this.method10843(o), Class227.field802);
        }
        if (Float.TYPE == componentType) {
            return this.field16140.method22576(Class8542.field35876, this.method10844(o), Class227.field802);
        }
        if (Double.TYPE == componentType) {
            return this.field16140.method22576(Class8542.field35876, this.method10845(o), Class227.field802);
        }
        if (Character.TYPE == componentType) {
            return this.field16140.method22576(Class8542.field35876, this.method10846(o), Class227.field802);
        }
        if (Boolean.TYPE != componentType) {
            throw new Class2386("Unexpected primitive '" + componentType.getCanonicalName() + "'");
        }
        return this.field16140.method22576(Class8542.field35876, this.method10847(o), Class227.field802);
    }
    
    private List<Byte> method10840(final Object o) {
        final byte[] array = (byte[])o;
        final ArrayList list = new ArrayList(array.length);
        for (int i = 0; i < array.length; ++i) {
            list.add(array[i]);
        }
        return (List<Byte>)list;
    }
    
    private List<Short> method10841(final Object o) {
        final short[] array = (short[])o;
        final ArrayList list = new ArrayList(array.length);
        for (int i = 0; i < array.length; ++i) {
            list.add(array[i]);
        }
        return (List<Short>)list;
    }
    
    private List<Integer> method10842(final Object o) {
        final int[] array = (int[])o;
        final ArrayList list = new ArrayList(array.length);
        for (int i = 0; i < array.length; ++i) {
            list.add(array[i]);
        }
        return (List<Integer>)list;
    }
    
    private List<Long> method10843(final Object o) {
        final long[] array = (long[])o;
        final ArrayList list = new ArrayList(array.length);
        for (int i = 0; i < array.length; ++i) {
            list.add(array[i]);
        }
        return (List<Long>)list;
    }
    
    private List<Float> method10844(final Object o) {
        final float[] array = (float[])o;
        final ArrayList list = new ArrayList(array.length);
        for (int i = 0; i < array.length; ++i) {
            list.add(array[i]);
        }
        return (List<Float>)list;
    }
    
    private List<Double> method10845(final Object o) {
        final double[] array = (double[])o;
        final ArrayList list = new ArrayList(array.length);
        for (int i = 0; i < array.length; ++i) {
            list.add(array[i]);
        }
        return (List<Double>)list;
    }
    
    private List<Character> method10846(final Object o) {
        final char[] array = (char[])o;
        final ArrayList list = new ArrayList(array.length);
        for (int i = 0; i < array.length; ++i) {
            list.add(array[i]);
        }
        return (List<Character>)list;
    }
    
    private List<Boolean> method10847(final Object o) {
        final boolean[] array = (boolean[])o;
        final ArrayList list = new ArrayList(array.length);
        for (int i = 0; i < array.length; ++i) {
            list.add(array[i]);
        }
        return (List<Boolean>)list;
    }
}
