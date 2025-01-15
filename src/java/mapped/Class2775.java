// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.nio.ByteBuffer;
import org.java_websocket.exceptions.InvalidDataException;

public class Class2775 extends Class2772
{
    public static final int field14987 = 1000;
    public static final int field14988 = 1001;
    public static final int field14989 = 1002;
    public static final int field14990 = 1003;
    public static final int field14991 = 1005;
    public static final int field14992 = 1006;
    public static final int field14993 = 1007;
    public static final int field14994 = 1008;
    public static final int field14995 = 1009;
    public static final int field14996 = 1010;
    public static final int field14997 = 1011;
    public static final int field14998 = 1012;
    public static final int field14999 = 1013;
    public static final int field15000 = 1014;
    public static final int field15001 = 1015;
    public static final int field15002 = -1;
    public static final int field15003 = -2;
    public static final int field15004 = -3;
    private int field15005;
    private String field15006;
    
    public Class2775() {
        super(Class2058.field11749);
        this.method9821("");
        this.method9820(1000);
    }
    
    public void method9820(final int field15005) {
        this.field15005 = field15005;
        if (field15005 == 1015) {
            this.field15005 = 1005;
            this.field15006 = "";
        }
        this.method9825();
    }
    
    public void method9821(String field15006) {
        if (field15006 == null) {
            field15006 = "";
        }
        this.field15006 = field15006;
        this.method9825();
    }
    
    public int method9822() {
        return this.field15005;
    }
    
    public String method9823() {
        return this.field15006;
    }
    
    @Override
    public String toString() {
        return super.toString() + "code: " + this.field15005;
    }
    
    @Override
    public void method9804() throws InvalidDataException {
        super.method9804();
        if (this.field15005 == 1007 && this.field15006.isEmpty()) {
            throw new Class2319(1007, "Received text is no valid utf8 string!");
        }
        if (this.field15005 == 1005 && 0 < this.field15006.length()) {
            throw new Class2319(1002, "A close frame must have a closecode if it has a reason");
        }
        if (this.field15005 > 1015 && this.field15005 < 3000) {
            throw new Class2319(1002, "Trying to send an illegal close code!");
        }
        if (this.field15005 != 1006) {
            if (this.field15005 != 1015) {
                if (this.field15005 != 1005) {
                    if (this.field15005 <= 4999) {
                        if (this.field15005 >= 1000) {
                            if (this.field15005 != 1004) {
                                return;
                            }
                        }
                    }
                }
            }
        }
        throw new Class2322("closecode must not be sent over the wire: " + this.field15005);
    }
    
    @Override
    public void method9813(final ByteBuffer byteBuffer) {
        this.field15005 = 1005;
        this.field15006 = "";
        byteBuffer.mark();
        if (byteBuffer.remaining() == 0) {
            this.field15005 = 1000;
        }
        else if (byteBuffer.remaining() == 1) {
            this.field15005 = 1002;
        }
        else {
            if (byteBuffer.remaining() >= 2) {
                final ByteBuffer allocate = ByteBuffer.allocate(4);
                allocate.position();
                allocate.putShort(byteBuffer.getShort());
                allocate.position();
                this.field15005 = allocate.getInt();
            }
            byteBuffer.reset();
            try {
                this.method9824(byteBuffer, byteBuffer.position());
            }
            catch (final Class2319 class2319) {
                this.field15005 = 1007;
                this.field15006 = null;
            }
        }
    }
    
    private void method9824(final ByteBuffer byteBuffer, final int n) throws InvalidDataException {
        try {
            byteBuffer.position();
            this.field15006 = Class8142.method26839(byteBuffer);
        }
        catch (final IllegalArgumentException ex) {
            throw new Class2319(1007);
        }
        finally {
            byteBuffer.position();
        }
    }
    
    private void method9825() {
        final byte[] method26834 = Class8142.method26834(this.field15006);
        final ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(this.field15005);
        allocate.position();
        final ByteBuffer allocate2 = ByteBuffer.allocate(2 + method26834.length);
        allocate2.put(allocate);
        allocate2.put(method26834);
        allocate2.rewind();
        super.method9813(allocate2);
    }
    
    @Override
    public ByteBuffer method9811() {
        if (this.field15005 != 1005) {
            return super.method9811();
        }
        return Class8833.method30847();
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        if (super.equals(o)) {
            final Class2775 class2775 = (Class2775)o;
            return this.field15005 == class2775.field15005 && ((this.field15006 == null) ? (class2775.field15006 == null) : this.field15006.equals(class2775.field15006));
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return 31 * (31 * super.hashCode() + this.field15005) + ((this.field15006 == null) ? 0 : this.field15006.hashCode());
    }
}
