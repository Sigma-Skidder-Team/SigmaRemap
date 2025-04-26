// 
// Decompiled by Procyon v0.6.0
// 

package org.java_websocket.extensions;

import mapped.InvalidFrameException;
import org.java_websocket.exceptions.InvalidDataException;
import org.java_websocket.framing.Framedata;

public class DefaultExtension implements IExtension {
    @Override
    public void decodeFrame(final Framedata framedata) throws InvalidDataException {
    }

    @Override
    public void encodeFrame(final Framedata framedata) {
    }

    @Override
    public boolean acceptProvidedExtensionAsServer(final String s) {
        return true;
    }

    @Override
    public boolean acceptProvidedExtensionAsClient(final String s) {
        return true;
    }

    @Override
    public void isFrameValid(final Framedata framedata) throws InvalidDataException {
        if (!framedata.isRSV1()) {
            if (!framedata.isRSV2()) {
                if (!framedata.isRSV3()) {
                    return;
                }
            }
        }
        throw new InvalidFrameException("bad rsv RSV1: " + framedata.isRSV1() + " RSV2: " + framedata.isRSV2() + " RSV3: " + framedata.isRSV3());
    }

    @Override
    public String getProvidedExtensionAsClient() {
        return "";
    }

    @Override
    public String getProvidedExtensionAsServer() {
        return "";
    }

    @Override
    public IExtension copyInstance() {
        return new DefaultExtension();
    }

    @Override
    public void reset() {
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }

    @Override
    public int hashCode() {
        return this.getClass().hashCode();
    }

    @Override
    public boolean equals(final Object o) {
        return this == o || (o != null && this.getClass() == o.getClass());
    }
}
