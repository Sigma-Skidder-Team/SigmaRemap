// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public abstract class Class5938 extends Class5936
{
    public Class5938(final Class4574<?> class4574, final int n, final int n2, final MutableBoundingBox class4575, final int n3, final long n4) {
        super(class4574, n, n2, class4575, n3, n4);
    }
    
    @Override
    public void method17854() {
        super.method17854();
        final MutableBoundingBox field24432 = this.field24432;
        field24432.minX -= 12;
        final MutableBoundingBox field24433 = this.field24432;
        field24433.minY -= 12;
        final MutableBoundingBox field24434 = this.field24432;
        field24434.minZ -= 12;
        final MutableBoundingBox field24435 = this.field24432;
        field24435.maxX += 12;
        final MutableBoundingBox field24436 = this.field24432;
        field24436.maxY += 12;
        final MutableBoundingBox field24437 = this.field24432;
        field24437.maxZ += 12;
    }
}
