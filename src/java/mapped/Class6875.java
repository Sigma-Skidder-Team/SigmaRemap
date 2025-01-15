// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Consumer;
import java.util.Iterator;
import com.google.common.collect.Lists;
import java.util.List;

public class Class6875
{
    private final int field26938;
    private final int field26939;
    private final int field26940;
    private final int field26941;
    private List<Class6875> field26942;
    private Class9260 field26943;
    
    public Class6875(final int field26938, final int field26939, final int field26940, final int field26941) {
        this.field26938 = field26938;
        this.field26939 = field26939;
        this.field26940 = field26940;
        this.field26941 = field26941;
    }
    
    public Class9260 method21039() {
        return this.field26943;
    }
    
    public int method21040() {
        return this.field26938;
    }
    
    public int method21041() {
        return this.field26939;
    }
    
    public boolean method21042(final Class9260 field26943) {
        if (this.field26943 != null) {
            return false;
        }
        final int field26944 = field26943.field39721;
        final int field26945 = field26943.field39722;
        if (field26944 > this.field26940 || field26945 > this.field26941) {
            return false;
        }
        if (field26944 == this.field26940 && field26945 == this.field26941) {
            this.field26943 = field26943;
            return true;
        }
        if (this.field26942 == null) {
            (this.field26942 = Lists.newArrayListWithCapacity(1)).add(new Class6875(this.field26938, this.field26939, field26944, field26945));
            final int b = this.field26940 - field26944;
            final int b2 = this.field26941 - field26945;
            if (b2 > 0 && b > 0) {
                if (Math.max(this.field26941, b) < Math.max(this.field26940, b2)) {
                    this.field26942.add(new Class6875(this.field26938 + field26944, this.field26939, b, field26945));
                    this.field26942.add(new Class6875(this.field26938, this.field26939 + field26945, this.field26940, b2));
                }
                else {
                    this.field26942.add(new Class6875(this.field26938, this.field26939 + field26945, field26944, b2));
                    this.field26942.add(new Class6875(this.field26938 + field26944, this.field26939, b, this.field26941));
                }
            }
            else if (b != 0) {
                if (b2 == 0) {
                    this.field26942.add(new Class6875(this.field26938 + field26944, this.field26939, b, field26945));
                }
            }
            else {
                this.field26942.add(new Class6875(this.field26938, this.field26939 + field26945, field26944, b2));
            }
        }
        final Iterator<Class6875> iterator = this.field26942.iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().method21042(field26943)) {
                continue;
            }
            return true;
        }
        return false;
    }
    
    public void method21043(final Consumer<Class6875> consumer) {
        if (this.field26943 == null) {
            if (this.field26942 != null) {
                final Iterator<Class6875> iterator = this.field26942.iterator();
                while (iterator.hasNext()) {
                    iterator.next().method21043(consumer);
                }
            }
        }
        else {
            consumer.accept(this);
        }
    }
    
    @Override
    public String toString() {
        return "Slot{originX=" + this.field26938 + ", originY=" + this.field26939 + ", width=" + this.field26940 + ", height=" + this.field26941 + ", texture=" + this.field26943 + ", subSlots=" + this.field26942 + '}';
    }
}
