// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.java_websocket.exceptions.InvalidDataException;
import java.nio.ByteBuffer;

public abstract class Class2771 implements Class2776
{
    private boolean field14978;
    private Class2058 field14979;
    private ByteBuffer field14980;
    private boolean field14981;
    private boolean field14982;
    private boolean field14983;
    private boolean field14984;
    
    public abstract void method9804() throws InvalidDataException;
    
    public Class2771(final Class2058 field14979) {
        this.field14979 = field14979;
        this.field14980 = Class8833.method30847();
        this.field14978 = true;
        this.field14981 = false;
        this.field14982 = false;
        this.field14983 = false;
        this.field14984 = false;
    }
    
    @Override
    public boolean method9805() {
        return this.field14982;
    }
    
    @Override
    public boolean method9806() {
        return this.field14983;
    }
    
    @Override
    public boolean method9807() {
        return this.field14984;
    }
    
    @Override
    public boolean method9808() {
        return this.field14978;
    }
    
    @Override
    public Class2058 method9809() {
        return this.field14979;
    }
    
    @Override
    public boolean method9810() {
        return this.field14981;
    }
    
    @Override
    public ByteBuffer method9811() {
        return this.field14980;
    }
    
    @Override
    public void method9812(final Class2776 class2776) {
        final ByteBuffer method9811 = class2776.method9811();
        if (this.field14980 != null) {
            method9811.mark();
            this.field14980.position();
            this.field14980.limit();
            if (method9811.remaining() <= this.field14980.remaining()) {
                this.field14980.put(method9811);
            }
            else {
                final ByteBuffer allocate = ByteBuffer.allocate(method9811.remaining() + this.field14980.capacity());
                this.field14980.flip();
                allocate.put(this.field14980);
                allocate.put(method9811);
                this.field14980 = allocate;
            }
            this.field14980.rewind();
            method9811.reset();
        }
        else {
            this.field14980 = ByteBuffer.allocate(method9811.remaining());
            method9811.mark();
            this.field14980.put(method9811);
            method9811.reset();
        }
        this.field14978 = class2776.method9808();
    }
    
    @Override
    public String toString() {
        return "Framedata{ optcode:" + this.method9809() + ", fin:" + this.method9808() + ", rsv1:" + this.method9805() + ", rsv2:" + this.method9806() + ", rsv3:" + this.method9807() + ", payloadlength:[pos:" + this.field14980.position() + ", len:" + this.field14980.remaining() + "], payload:" + ((this.field14980.remaining() <= 1000) ? new String(this.field14980.array()) : "(too big to display)") + '}';
    }
    
    public void method9813(final ByteBuffer field14980) {
        this.field14980 = field14980;
    }
    
    public void method9814(final boolean field14978) {
        this.field14978 = field14978;
    }
    
    public void method9815(final boolean field14982) {
        this.field14982 = field14982;
    }
    
    public void method9816(final boolean field14983) {
        this.field14983 = field14983;
    }
    
    public void method9817(final boolean field14984) {
        this.field14984 = field14984;
    }
    
    public void method9818(final boolean field14981) {
        this.field14981 = field14981;
    }
    
    public static Class2771 method9819(final Class2058 class2058) {
        if (class2058 == null) {
            throw new IllegalArgumentException("Supplied opcode cannot be null");
        }
        switch (Class9056.field38340[class2058.ordinal()]) {
            case 1: {
                return new Class2773();
            }
            case 2: {
                return new Class2774();
            }
            case 3: {
                return new Class2777();
            }
            case 4: {
                return new Class2778();
            }
            case 5: {
                return new Class2775();
            }
            case 6: {
                return new Class2769();
            }
            default: {
                throw new IllegalArgumentException("Supplied opcode is invalid");
            }
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final Class2771 class2771 = (Class2771)o;
            return this.field14978 == class2771.field14978 && this.field14981 == class2771.field14981 && this.field14982 == class2771.field14982 && this.field14983 == class2771.field14983 && this.field14984 == class2771.field14984 && this.field14979 == class2771.field14979 && ((this.field14980 == null) ? (class2771.field14980 == null) : this.field14980.equals(class2771.field14980));
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return 31 * (31 * (31 * (31 * (31 * (31 * (this.field14978 ? 1 : 0) + this.field14979.hashCode()) + ((this.field14980 == null) ? 0 : this.field14980.hashCode())) + (this.field14981 ? 1 : 0)) + (this.field14982 ? 1 : 0)) + (this.field14983 ? 1 : 0)) + (this.field14984 ? 1 : 0);
    }
}
