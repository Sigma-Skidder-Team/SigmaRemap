/*
 * This file is part of ViaMCP - https://github.com/FlorianMichael/ViaMCP
 * Copyright (C) 2020-2024 FlorianMichael/EnZaXD <florian.michael07@gmail.com> and contributors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package de.florianmichael.viamcp;

import com.viaversion.viabackwards.protocol.v1_17to1_16_4.Protocol1_17To1_16_4;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.protocols.v1_16_1to1_16_2.packet.ClientboundPackets1_16_2;
import com.viaversion.viaversion.protocols.v1_16_1to1_16_2.packet.ServerboundPackets1_16_2;
import com.viaversion.viaversion.protocols.v1_16_4to1_17.packet.ClientboundPackets1_17;
import com.viaversion.viaversion.protocols.v1_16_4to1_17.packet.ServerboundPackets1_17;
import de.florianmichael.vialoadingbase.ViaLoadingBase;
import net.minecraft.util.SharedConstants;

import java.io.File;

public class ViaMCP {
    public final static int NATIVE_VERSION = SharedConstants.getNativeVersion();
    public static ViaMCP INSTANCE;

    public static void create() {
        INSTANCE = new ViaMCP();
    }

    public ViaMCP() {
        ViaLoadingBase.ViaLoadingBaseBuilder.create().runDirectory(new File("ViaMCP")).nativeVersion(NATIVE_VERSION).onProtocolReload(protocolVersion -> {}).build();
        fixTransactions();
    }

    private void fixTransactions() {
        final Protocol1_17To1_16_4 protocol = Via.getManager().getProtocolManager().getProtocol(Protocol1_17To1_16_4.class);
        protocol.registerClientbound(ClientboundPackets1_17.PING, ClientboundPackets1_16_2.CONTAINER_ACK, wrapper -> {}, true);
        protocol.registerServerbound(ServerboundPackets1_16_2.CONTAINER_ACK, ServerboundPackets1_17.PONG, wrapper -> {}, true);
    }
}
