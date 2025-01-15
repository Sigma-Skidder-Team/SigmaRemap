// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.DataOutput;
import java.io.IOException;
import java.io.DataInput;
import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

public class Class60 extends Class61 implements Iterable<Class61>
{
    private Class<? extends Class61> field140;
    private List<Class61> field141;
    
    public Class60(final String s) {
        super(s);
        this.field140 = null;
        this.field141 = new ArrayList<Class61>();
    }
    
    public Class60(final String s, final Class<? extends Class61> field140) {
        this(s);
        this.field140 = field140;
    }
    
    public Class60(final String s, final List<Class61> list) throws IllegalArgumentException {
        this(s);
        this.method366(list);
    }
    
    public List<Class61> method365() {
        return new ArrayList<Class61>(this.field141);
    }
    
    public void method366(final List<Class61> list) throws IllegalArgumentException {
        this.field140 = null;
        this.field141.clear();
        final Iterator<Class61> iterator = list.iterator();
        while (iterator.hasNext()) {
            this.method368(iterator.next());
        }
    }
    
    public Class<? extends Class61> method367() {
        return this.field140;
    }
    
    public boolean method368(final Class61 class61) throws IllegalArgumentException {
        if (class61 != null) {
            if (this.field140 != null) {
                if (class61.getClass() != this.field140) {
                    throw new IllegalArgumentException("Tag type cannot differ from ListTag type.");
                }
            }
            else {
                this.field140 = class61.getClass();
            }
            return this.field141.add(class61);
        }
        return false;
    }
    
    public boolean method369(final Class61 class61) {
        return this.field141.remove(class61);
    }
    
    public <T extends Class61> T method370(final int n) {
        return (T)this.field141.get(n);
    }
    
    public int method371() {
        return this.field141.size();
    }
    
    @Override
    public Iterator<Class61> iterator() {
        return this.field141.iterator();
    }
    
    @Override
    public void method372(final DataInput dataInput) throws IOException {
        this.field140 = null;
        this.field141.clear();
        final int unsignedByte = dataInput.readUnsignedByte();
        if (unsignedByte != 0) {
            this.field140 = Class8116.method26703(unsignedByte);
            if (this.field140 == null) {
                throw new IOException("Unknown tag ID in ListTag: " + unsignedByte);
            }
        }
        for (int int1 = dataInput.readInt(), i = 0; i < int1; ++i) {
            Class61 method26705;
            try {
                method26705 = Class8116.method26705(unsignedByte, "");
            }
            catch (final Class2336 cause) {
                throw new IOException("Failed to create tag.", cause);
            }
            method26705.method372(dataInput);
            this.method368(method26705);
        }
    }
    
    @Override
    public void method373(final DataOutput dataOutput) throws IOException {
        if (this.field140 != null) {
            final int method26704 = Class8116.method26704(this.field140);
            if (method26704 == -1) {
                throw new IOException("ListTag contains unregistered tag class.");
            }
            dataOutput.writeByte(method26704);
        }
        else {
            dataOutput.writeByte(0);
        }
        dataOutput.writeInt(this.field141.size());
        final Iterator<Class61> iterator = this.field141.iterator();
        while (iterator.hasNext()) {
            iterator.next().method373(dataOutput);
        }
    }
    
    @Override
    public Class60 clone() {
        final ArrayList list = new ArrayList();
        final Iterator<Class61> iterator = this.field141.iterator();
        while (iterator.hasNext()) {
            list.add(iterator.next().clone());
        }
        return new Class60(this.method375(), list);
    }
}
